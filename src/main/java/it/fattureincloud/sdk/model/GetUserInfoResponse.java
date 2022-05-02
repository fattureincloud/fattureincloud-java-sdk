/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.15
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@ApiModel(description = "")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-05-02T13:59:15.798929Z[GMT]")
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

  public GetUserInfoResponse() {}

  public GetUserInfoResponse data(User data) {

    this.data = data;
    return this;
  }

  /**
   * Get data
   *
   * @return data
   */
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
   *
   * @return info
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public GetUserInfoResponseInfo getInfo() {
    return info;
  }

  public void setInfo(GetUserInfoResponseInfo info) {
    this.info = info;
  }

  public GetUserInfoResponse emailConfirmationState(
      GetUserInfoResponseEmailConfirmationState emailConfirmationState) {

    this.emailConfirmationState = emailConfirmationState;
    return this;
  }

  /**
   * Get emailConfirmationState
   *
   * @return emailConfirmationState
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public GetUserInfoResponseEmailConfirmationState getEmailConfirmationState() {
    return emailConfirmationState;
  }

  public void setEmailConfirmationState(
      GetUserInfoResponseEmailConfirmationState emailConfirmationState) {
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
    return Objects.equals(this.data, getUserInfoResponse.data)
        && Objects.equals(this.info, getUserInfoResponse.info)
        && Objects.equals(this.emailConfirmationState, getUserInfoResponse.emailConfirmationState);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b
        || (a != null
            && b != null
            && a.isPresent()
            && b.isPresent()
            && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, info, emailConfirmationState);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserInfoResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    emailConfirmationState: ")
        .append(toIndentedString(emailConfirmationState))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
