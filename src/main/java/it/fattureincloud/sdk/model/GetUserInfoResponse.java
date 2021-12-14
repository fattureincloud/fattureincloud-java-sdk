/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.7
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.fattureincloud.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.fattureincloud.sdk.model.GetUserInfoResponseEmailConfirmationState;
import it.fattureincloud.sdk.model.GetUserInfoResponseInfo;
import it.fattureincloud.sdk.model.User;
import java.io.IOException;
import java.io.Serializable;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-14T16:12:54.353Z[GMT]")
public class GetUserInfoResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private User data;

  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private GetUserInfoResponseInfo info;

  public static final String SERIALIZED_NAME_EMAIL_CONFIRMATION_STATE = "email_confirmation_state";
  @SerializedName(SERIALIZED_NAME_EMAIL_CONFIRMATION_STATE)
  private GetUserInfoResponseEmailConfirmationState emailConfirmationState;


  public GetUserInfoResponse data(User data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public User getData() {
    return data;
  }


  public void setData(User data) {
    this.data = data;
  }


  public GetUserInfoResponse info(GetUserInfoResponseInfo info) {
    
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetUserInfoResponseInfo getInfo() {
    return info;
  }


  public void setInfo(GetUserInfoResponseInfo info) {
    this.info = info;
  }


  public GetUserInfoResponse emailConfirmationState(GetUserInfoResponseEmailConfirmationState emailConfirmationState) {
    
    this.emailConfirmationState = emailConfirmationState;
    return this;
  }

   /**
   * Get emailConfirmationState
   * @return emailConfirmationState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetUserInfoResponseEmailConfirmationState getEmailConfirmationState() {
    return emailConfirmationState;
  }


  public void setEmailConfirmationState(GetUserInfoResponseEmailConfirmationState emailConfirmationState) {
    this.emailConfirmationState = emailConfirmationState;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserInfoResponse getUserInfoResponse = (GetUserInfoResponse) o;
    return Objects.equals(this.data, getUserInfoResponse.data) &&
        Objects.equals(this.info, getUserInfoResponse.info) &&
        Objects.equals(this.emailConfirmationState, getUserInfoResponse.emailConfirmationState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, info, emailConfirmationState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserInfoResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    emailConfirmationState: ").append(toIndentedString(emailConfirmationState)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

