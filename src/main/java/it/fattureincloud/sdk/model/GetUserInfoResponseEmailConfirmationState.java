/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.29
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** GetUserInfoResponseEmailConfirmationState */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-07-17T10:04:00.151Z[Etc/UTC]")
public class GetUserInfoResponseEmailConfirmationState implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NEED_CONFIRMATION = "need_confirmation";

  @SerializedName(SERIALIZED_NAME_NEED_CONFIRMATION)
  private Boolean needConfirmation;

  public GetUserInfoResponseEmailConfirmationState() {}

  public GetUserInfoResponseEmailConfirmationState needConfirmation(Boolean needConfirmation) {

    this.needConfirmation = needConfirmation;
    return this;
  }

  /**
   * Get needConfirmation
   *
   * @return needConfirmation
   */
  @javax.annotation.Nullable
  public Boolean getNeedConfirmation() {
    return needConfirmation;
  }

  public void setNeedConfirmation(Boolean needConfirmation) {
    this.needConfirmation = needConfirmation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserInfoResponseEmailConfirmationState getUserInfoResponseEmailConfirmationState =
        (GetUserInfoResponseEmailConfirmationState) o;
    return Objects.equals(
        this.needConfirmation, getUserInfoResponseEmailConfirmationState.needConfirmation);
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
    return Objects.hash(needConfirmation);
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
    sb.append("class GetUserInfoResponseEmailConfirmationState {\n");
    sb.append("    needConfirmation: ").append(toIndentedString(needConfirmation)).append("\n");
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
