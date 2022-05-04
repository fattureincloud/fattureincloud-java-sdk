package it.fattureincloud.sdk.auth;

import com.google.gson.Gson;
import io.vavr.control.Either;
import okhttp3.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class OAuth2AuthorizationCodeManager {
    static final String DEFAULT_BASE_URI = "https://api-v2.fattureincloud.it";

    private String clientId;
    private String clientSecret;
    private String redirectUri;
    private Optional<String> baseUri;
    private OkHttpClient httpClient;
    private final Gson gson;

    private static final MediaType JSON
            = MediaType.get("application/json; charset=utf-8");

    public OAuth2AuthorizationCodeManager(String clientId, String clientSecret, String redirectUri) {
        this(clientId, clientSecret, redirectUri, null, null);
    }

    public OAuth2AuthorizationCodeManager(String clientId, String clientSecret, String redirectUri, String baseUri) {
        this(clientId, clientSecret, redirectUri, baseUri, null);
    }

    public OAuth2AuthorizationCodeManager(String clientId, String clientSecret, String redirectUri, OkHttpClient httpClient) {
        this(clientId, clientSecret, redirectUri, null, httpClient);
    }

    public OAuth2AuthorizationCodeManager(String clientId, String clientSecret, String redirectUri, String baseUri, OkHttpClient httpClient) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUri = redirectUri;
        this.baseUri = Optional.ofNullable(baseUri);
        if (httpClient != null) {
            this.httpClient = httpClient;
        } else {
            this.httpClient = new OkHttpClient();
        }
        this.gson = new Gson();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getBaseUri() {
        return baseUri.orElse(DEFAULT_BASE_URI);
    }

    public void setBaseUri(String baseUri) {
        this.baseUri = Optional.ofNullable(baseUri);
    }

    public void setBaseUri(Optional<String> baseUri) {
        this.baseUri = baseUri;
    }


    public OkHttpClient getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public String getAuthorizationUrl(Collection<Scope> scopes, String state) {
        String authUri = this.getCompleteUri("/oauth/authorize?");

        String scopesString = getScopesString(scopes);

        HashMap<String, String> map = new HashMap<>();
        map.put("response_type", "code");
        map.put("client_id", this.clientId);
        map.put("redirect_uri", this.redirectUri);
        map.put("scope", scopesString);
        if ( state != null) {
            map.put("state", state);
        }
        
        String qs = map.entrySet().stream().map(e -> e.getKey() + "=" + encodeValue(e.getValue())).collect(Collectors.joining("&"));

        return authUri.concat(qs);
    }

    public OAuth2AuthorizationCodeParams getParamsFromUrl(String url) throws Exception {
        String query = new URL(url).getQuery();

        String[] params = query.split("&");
        Map<String, String> map = new HashMap<>();
        for (String param : params) {
            String [] kv = param.split("=");
            map.put(kv[0], decodeValue(kv[1]));
        }
        return new OAuth2AuthorizationCodeParams(map.get("state"), map.get("code"));
    }

    public Either<OAuth2AuthorizationCodeError, OAuth2AuthorizationCodeResponse> fetchToken(String authCode) throws IOException {
        String tokenUri = this.getCompleteUri("/oauth/token");

        HashMap<String, String> map = new HashMap<>();
        map.put("grant_type", "authorization_code");
        map.put("client_id", this.clientId);
        map.put("client_secret", this.clientSecret);
        map.put("redirect_uri", this.redirectUri);
        map.put("code", authCode);

        String json = mapToJson(map);

        return this.post(tokenUri, json);
    }

    public Either<OAuth2AuthorizationCodeError, OAuth2AuthorizationCodeResponse> refreshToken(String refreshToken) throws IOException {
        String tokenUri = this.getCompleteUri("/oauth/token");

        HashMap<String, String> map = new HashMap<>();
        map.put("grant_type", "refresh_token");
        map.put("client_id", this.clientId);
        map.put("client_secret", this.clientSecret);
        map.put("refresh_token", refreshToken);

        String json = mapToJson(map);

        return this.post(tokenUri, json);
    }

    private String getCompleteUri(String path) {
        return this.getBaseUri().concat(path);
    }

    private String mapToJson(Map<String, String> inputMap) {
        return gson.toJson(inputMap);
    }

    private Either<OAuth2AuthorizationCodeError, OAuth2AuthorizationCodeResponse> post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = this.httpClient.newCall(request).execute()) {
            String responseBody = Objects.requireNonNull(response.body()).string();
            int code = response.code();

            if (code != 200) {
                OAuth2AuthorizationCodeError err = gson.fromJson(responseBody, OAuth2AuthorizationCodeError.class);
                err.setCode(code);
                return Either.left(err);
            } else {
                OAuth2AuthorizationCodeResponse oauthRes = gson.fromJson(responseBody, OAuth2AuthorizationCodeResponse.class);
                return Either.right(oauthRes);
            }
        }
    }

    private String encodeValue(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    private String decodeValue(String value) {
        try {
            return URLDecoder.decode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    private String getScopesString(Collection<Scope> scopes) {
        return scopes.stream().map(Scope::getScope).collect(Collectors.joining(" "));
    }
}
