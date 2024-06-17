package it.fattureincloud.sdk.auth.authorization;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class OAuth2AuthorizationCodeParams {
  @SerializedName(value = "state")
  private String state;

  @SerializedName(value = "code")
  private String authorizationCode;

  public OAuth2AuthorizationCodeParams(String state, String authorizationCode) {
    this.state = state;
    this.authorizationCode = authorizationCode;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getAuthorizationCode() {
    return authorizationCode;
  }

  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OAuth2AuthorizationCodeParams that = (OAuth2AuthorizationCodeParams) o;
    return Objects.equals(state, that.state)
        && Objects.equals(authorizationCode, that.authorizationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, authorizationCode);
  }

  @Override
  public String toString() {
    return "OAuth2AuthorizationCodeParams{"
        + "state='"
        + state
        + '\''
        + ", authorizationCode='"
        + authorizationCode
        + '\''
        + '}';
  }
}
