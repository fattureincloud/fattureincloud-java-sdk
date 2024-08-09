/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.1
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

/** GetUserInfoResponseInfo */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-09T10:31:32.240591Z[Etc/UTC]",
    comments = "Generator version: 7.7.0")
public class GetUserInfoResponseInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NEED_MARKETING_CONSENTS_CONFIRMATION =
      "need_marketing_consents_confirmation";

  @SerializedName(SERIALIZED_NAME_NEED_MARKETING_CONSENTS_CONFIRMATION)
  private Boolean needMarketingConsentsConfirmation;

  public static final String SERIALIZED_NAME_NEED_PASSWORD_CHANGE = "need_password_change";

  @SerializedName(SERIALIZED_NAME_NEED_PASSWORD_CHANGE)
  private Boolean needPasswordChange;

  public static final String SERIALIZED_NAME_NEED_TERMS_OF_SERVICE_CONFIRMATION =
      "need_terms_of_service_confirmation";

  @SerializedName(SERIALIZED_NAME_NEED_TERMS_OF_SERVICE_CONFIRMATION)
  private Boolean needTermsOfServiceConfirmation;

  public GetUserInfoResponseInfo() {}

  public GetUserInfoResponseInfo needMarketingConsentsConfirmation(
      Boolean needMarketingConsentsConfirmation) {

    this.needMarketingConsentsConfirmation = needMarketingConsentsConfirmation;
    return this;
  }

  /**
   * Get needMarketingConsentsConfirmation
   *
   * @return needMarketingConsentsConfirmation
   */
  @javax.annotation.Nullable
  public Boolean getNeedMarketingConsentsConfirmation() {
    return needMarketingConsentsConfirmation;
  }

  public void setNeedMarketingConsentsConfirmation(Boolean needMarketingConsentsConfirmation) {
    this.needMarketingConsentsConfirmation = needMarketingConsentsConfirmation;
  }

  public GetUserInfoResponseInfo needPasswordChange(Boolean needPasswordChange) {

    this.needPasswordChange = needPasswordChange;
    return this;
  }

  /**
   * Get needPasswordChange
   *
   * @return needPasswordChange
   */
  @javax.annotation.Nullable
  public Boolean getNeedPasswordChange() {
    return needPasswordChange;
  }

  public void setNeedPasswordChange(Boolean needPasswordChange) {
    this.needPasswordChange = needPasswordChange;
  }

  public GetUserInfoResponseInfo needTermsOfServiceConfirmation(
      Boolean needTermsOfServiceConfirmation) {

    this.needTermsOfServiceConfirmation = needTermsOfServiceConfirmation;
    return this;
  }

  /**
   * Get needTermsOfServiceConfirmation
   *
   * @return needTermsOfServiceConfirmation
   */
  @javax.annotation.Nullable
  public Boolean getNeedTermsOfServiceConfirmation() {
    return needTermsOfServiceConfirmation;
  }

  public void setNeedTermsOfServiceConfirmation(Boolean needTermsOfServiceConfirmation) {
    this.needTermsOfServiceConfirmation = needTermsOfServiceConfirmation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserInfoResponseInfo getUserInfoResponseInfo = (GetUserInfoResponseInfo) o;
    return Objects.equals(
            this.needMarketingConsentsConfirmation,
            getUserInfoResponseInfo.needMarketingConsentsConfirmation)
        && Objects.equals(this.needPasswordChange, getUserInfoResponseInfo.needPasswordChange)
        && Objects.equals(
            this.needTermsOfServiceConfirmation,
            getUserInfoResponseInfo.needTermsOfServiceConfirmation);
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
    return Objects.hash(
        needMarketingConsentsConfirmation, needPasswordChange, needTermsOfServiceConfirmation);
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
    sb.append("class GetUserInfoResponseInfo {\n");
    sb.append("    needMarketingConsentsConfirmation: ")
        .append(toIndentedString(needMarketingConsentsConfirmation))
        .append("\n");
    sb.append("    needPasswordChange: ").append(toIndentedString(needPasswordChange)).append("\n");
    sb.append("    needTermsOfServiceConfirmation: ")
        .append(toIndentedString(needTermsOfServiceConfirmation))
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
