package it.fattureincloud.sdk.auth.authorization;

import io.vavr.control.Either;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

import it.fattureincloud.sdk.auth.OAuth2Error;
import it.fattureincloud.sdk.auth.OAuth2Manager;
import it.fattureincloud.sdk.auth.OAuth2TokenResponse;
import it.fattureincloud.sdk.auth.Scope;
import okhttp3.*;

public class OAuth2AuthorizationCodeManager extends OAuth2Manager {
  private String clientSecret;
  private String redirectUri;

  public OAuth2AuthorizationCodeManager(String clientId, String clientSecret, String redirectUri) {
    this(clientId, clientSecret, redirectUri, null, null);
  }

  public OAuth2AuthorizationCodeManager(
      String clientId, String clientSecret, String redirectUri, String baseUri) {
    this(clientId, clientSecret, redirectUri, baseUri, null);
  }

  public OAuth2AuthorizationCodeManager(
      String clientId, String clientSecret, String redirectUri, OkHttpClient httpClient) {
    this(clientId, clientSecret, redirectUri, null, httpClient);
  }

  public OAuth2AuthorizationCodeManager(
      String clientId,
      String clientSecret,
      String redirectUri,
      String baseUri,
      OkHttpClient httpClient) {
    super(clientId, baseUri, httpClient);
    this.clientSecret = clientSecret;
    this.redirectUri = redirectUri;
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

  public String getAuthorizationUrl(Collection<Scope> scopes, String state) {
    String authUri = this.getCompleteUri("/oauth/authorize?");

    String scopesString = getScopesString(scopes);

    HashMap<String, String> map = new HashMap<>();
    map.put("response_type", "code");
    map.put("client_id", this.clientId);
    map.put("redirect_uri", this.redirectUri);
    map.put("scope", scopesString);
    if (state != null) {
      map.put("state", state);
    }

    String qs =
        map.entrySet().stream()
            .map(e -> e.getKey() + "=" + encodeValue(e.getValue()))
            .collect(Collectors.joining("&"));

    return authUri.concat(qs);
  }

  public OAuth2AuthorizationCodeParams getParamsFromUrl(String url) throws Exception {
    String query = new URL(url).getQuery();

    String[] params = query.split("&");
    Map<String, String> map = new HashMap<>();
    for (String param : params) {
      String[] kv = param.split("=");
      map.put(kv[0], decodeValue(kv[1]));
    }
    return new OAuth2AuthorizationCodeParams(map.get("state"), map.get("code"));
  }

  public Either<OAuth2Error, OAuth2TokenResponse> fetchToken(
      String code) throws IOException {
    String tokenUri = this.getCompleteUri("/oauth/token");

    HashMap<String, String> map = new HashMap<>();
    map.put("grant_type", "authorization_code");
    map.put("client_id", this.clientId);
    map.put("client_secret", this.clientSecret);
    map.put("redirect_uri", this.redirectUri);
    map.put("code", code);

    String json = mapToJson(map);

    return this.post(tokenUri, json, OAuth2TokenResponse.class);
  }

  public Either<OAuth2Error, OAuth2TokenResponse> refreshToken(
      String refreshToken) throws IOException {
    String tokenUri = this.getCompleteUri("/oauth/token");

    HashMap<String, String> map = new HashMap<>();
    map.put("grant_type", "refresh_token");
    map.put("client_id", this.clientId);
    map.put("client_secret", this.clientSecret);
    map.put("refresh_token", refreshToken);

    String json = mapToJson(map);

    return this.post(tokenUri, json, OAuth2TokenResponse.class);
  }
}
