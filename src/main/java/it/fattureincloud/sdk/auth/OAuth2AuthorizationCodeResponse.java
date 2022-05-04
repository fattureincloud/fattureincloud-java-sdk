package it.fattureincloud.sdk.auth;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class OAuth2AuthorizationCodeResponse {
  @SerializedName(value = "token_type")
  private String tokenType;

  @SerializedName(value = "access_token")
  private String accessToken;

  @SerializedName(value = "refresh_token")
  private String refreshToken;

  @SerializedName(value = "expires_in")
  private int expiresIn;

  public OAuth2AuthorizationCodeResponse(
      String tokenType, String accessToken, String refreshToken, int expiresIn) {
    this.tokenType = tokenType;
    this.accessToken = accessToken;
    this.refreshToken = refreshToken;
    this.expiresIn = expiresIn;
  }

  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public int getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(int expiresIn) {
    this.expiresIn = expiresIn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OAuth2AuthorizationCodeResponse that = (OAuth2AuthorizationCodeResponse) o;
    return expiresIn == that.expiresIn
        && Objects.equals(tokenType, that.tokenType)
        && Objects.equals(accessToken, that.accessToken)
        && Objects.equals(refreshToken, that.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenType, accessToken, refreshToken, expiresIn);
  }

  @Override
  public String toString() {
    return "OAuth2AuthorizationCodeResponse{"
        + "tokenType='"
        + tokenType
        + '\''
        + ", accessToken='"
        + accessToken
        + '\''
        + ", refreshToken='"
        + refreshToken
        + '\''
        + ", expiresIn="
        + expiresIn
        + '}';
  }
}
