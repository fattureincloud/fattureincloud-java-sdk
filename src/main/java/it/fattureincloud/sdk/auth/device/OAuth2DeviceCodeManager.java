package it.fattureincloud.sdk.auth.device;

import io.vavr.control.Either;
import it.fattureincloud.sdk.auth.OAuth2Error;
import it.fattureincloud.sdk.auth.OAuth2Manager;
import it.fattureincloud.sdk.auth.OAuth2TokenResponse;
import it.fattureincloud.sdk.auth.Scope;
import okhttp3.OkHttpClient;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

public class OAuth2DeviceCodeManager extends OAuth2Manager {

  public OAuth2DeviceCodeManager(String clientId) {
    this(clientId, null, null);
  }

  public OAuth2DeviceCodeManager(
      String clientId, String baseUri) {
    this(clientId, baseUri, null);
  }

  public OAuth2DeviceCodeManager(
      String clientId, OkHttpClient httpClient) {
    this(clientId, null, httpClient);
  }

  public OAuth2DeviceCodeManager(
      String clientId,
      String baseUri,
      OkHttpClient httpClient) {
    super(clientId, baseUri, httpClient);
  }

  public Either<OAuth2Error, OAuth2DeviceCodeResponse> getDeviceCode(
          Collection<Scope> scopes) throws IOException {
    String scopesString = getScopesString(scopes);

    String tokenUri = this.getCompleteUri("/oauth/device");

    HashMap<String, String> map = new HashMap<>();
    map.put("client_id", this.clientId);
    map.put("scope", scopesString);

    String json = mapToJson(map);

    Either<OAuth2Error, OAuth2DeviceCodeResponseData> response = this.post(tokenUri, json, OAuth2DeviceCodeResponseData.class);
    if(response.isRight())
      return Either.right(response.get().getData());
    else
      return Either.left(response.getLeft());
  }

  public Either<OAuth2Error, OAuth2TokenResponse> fetchToken(
      String code) throws IOException {
    String tokenUri = this.getCompleteUri("/oauth/token");

    HashMap<String, String> map = new HashMap<>();
    map.put("grant_type", "urn:ietf:params:oauth:grant-type:device_code");
    map.put("client_id", this.clientId);
    map.put("device_code", code);

    String json = mapToJson(map);

    return this.post(tokenUri, json, OAuth2TokenResponse.class);
  }

  public Either<OAuth2Error, OAuth2TokenResponse> refreshToken(
      String refreshToken) throws IOException {
    String tokenUri = this.getCompleteUri("/oauth/token");

    HashMap<String, String> map = new HashMap<>();
    map.put("grant_type", "refresh_token");
    map.put("client_id", this.clientId);
    map.put("refresh_token", refreshToken);

    String json = mapToJson(map);

    return this.post(tokenUri, json, OAuth2TokenResponse.class);
  }
}
