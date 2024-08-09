package it.fattureincloud.sdk.auth;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.vavr.control.Either;
import okhttp3.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public abstract class OAuth2Manager {
  static final String DEFAULT_BASE_URI = "https://api-v2.fattureincloud.it";

  protected String clientId;
  protected Optional<String> baseUri;
  protected OkHttpClient httpClient;
  protected Gson gson;

  protected static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

  public OAuth2Manager(String clientId) {
    this(clientId, null, null);
  }

  public OAuth2Manager(
      String clientId, String baseUri) {
    this(clientId, baseUri, null);
  }

  public OAuth2Manager(
      String clientId, OkHttpClient httpClient) {
    this(clientId, null, httpClient);
  }

  public OAuth2Manager(
      String clientId,
      String baseUri,
      OkHttpClient httpClient) {
    this.clientId = clientId;
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

  protected abstract Either<OAuth2Error, OAuth2TokenResponse> fetchToken(
          String code) throws IOException;

  protected abstract Either<OAuth2Error, OAuth2TokenResponse> refreshToken(
          String refreshToken) throws IOException;

  protected String getCompleteUri(String path) {
    return this.getBaseUri().concat(path);
  }

  protected String mapToJson(Map<String, String> inputMap) {
    return gson.toJson(inputMap);
  }

  protected <T> Either<OAuth2Error, T> post(
          String url, String json, Class<T> typeOfT) throws IOException {
    RequestBody body = RequestBody.create(json, JSON);
    Request request = new Request.Builder().url(url).post(body).build();
    try (Response response = this.httpClient.newCall(request).execute()) {
      String responseBody = Objects.requireNonNull(response.body()).string();
      int code = response.code();

      if (code != 200) {
        OAuth2Error err =
                gson.fromJson(responseBody, OAuth2Error.class);
        err.setCode(code);
        return Either.left(err);
      } else {
        T res = gson.fromJson(responseBody, typeOfT);
        return Either.right(res);
      }
    }
  }

  protected String encodeValue(String value) {
    try {
      return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
    } catch (UnsupportedEncodingException e) {
      return "";
    }
  }

  protected String decodeValue(String value) {
    try {
      return URLDecoder.decode(value, StandardCharsets.UTF_8.toString());
    } catch (UnsupportedEncodingException e) {
      return "";
    }
  }

  protected String getScopesString(Collection<Scope> scopes) {
    return scopes.stream().map(Scope::getScope).collect(Collectors.joining(" "));
  }
}
