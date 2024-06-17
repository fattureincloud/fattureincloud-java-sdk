package it.fattureincloud.sdk.auth.device;

import com.google.gson.annotations.SerializedName;

public class OAuth2DeviceCodeResponseData {
  @SerializedName(value = "data")
  private OAuth2DeviceCodeResponse data;

  public OAuth2DeviceCodeResponseData(OAuth2DeviceCodeResponse data) {
    this.data = data;
  }

  public OAuth2DeviceCodeResponse getData() {
    return data;
  }
}
