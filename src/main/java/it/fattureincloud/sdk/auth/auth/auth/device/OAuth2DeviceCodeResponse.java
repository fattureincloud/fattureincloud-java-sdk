package it.fattureincloud.sdk.auth.device;

import com.google.gson.annotations.SerializedName;

import java.util.Map;
import java.util.Objects;

public class OAuth2DeviceCodeResponse {
  @SerializedName(value = "device_code")
  private String deviceCode;

  @SerializedName(value = "user_code")
  private String userCode;

  @SerializedName(value = "scope")
  private Map<String, String> scope;

  @SerializedName(value = "verification_uri")
  private String verificationUri;

  @SerializedName(value = "interval")
  private int interval;

  @SerializedName(value = "expires_in")
  private int expiresIn;

  public OAuth2DeviceCodeResponse(String deviceCode, String userCode, Map<String, String> scope, String verificationUri, int interval, int expiresIn) {
    this.deviceCode = deviceCode;
    this.userCode = userCode;
    this.scope = scope;
    this.verificationUri = verificationUri;
    this.interval = interval;
    this.expiresIn = expiresIn;
  }

  public String getDeviceCode() {
    return deviceCode;
  }

  public void setDeviceCode(String deviceCode) {
    this.deviceCode = deviceCode;
  }

  public String getUserCode() {
    return userCode;
  }

  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  public Map<String, String> getScope() {
    return scope;
  }

  public void setScope(Map<String, String> scope) {
    this.scope = scope;
  }

  public String getVerificationUri() {
    return verificationUri;
  }

  public void setVerificationUri(String verificationUri) {
    this.verificationUri = verificationUri;
  }

  public int getInterval() {
    return interval;
  }

  public void setInterval(int interval) {
    this.interval = interval;
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
    OAuth2DeviceCodeResponse that = (OAuth2DeviceCodeResponse) o;
    return interval == that.interval && expiresIn == that.expiresIn && Objects.equals(deviceCode, that.deviceCode) && Objects.equals(userCode, that.userCode) && Objects.equals(scope, that.scope) && Objects.equals(verificationUri, that.verificationUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceCode, userCode, scope, verificationUri, interval, expiresIn);
  }

  @Override
  public String toString() {
    return "OAuth2DeviceCodeResponse{" +
            "deviceCode='" + deviceCode + '\'' +
            ", userCode='" + userCode + '\'' +
            ", scope=" + scope +
            ", verificationUri='" + verificationUri + '\'' +
            ", interval=" + interval +
            ", expiresIn=" + expiresIn +
            '}';
  }
}
