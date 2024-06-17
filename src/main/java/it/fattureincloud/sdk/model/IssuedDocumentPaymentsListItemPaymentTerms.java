/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.0
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

/** IssuedDocumentPaymentsListItemPaymentTerms */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-06-17T06:54:20.410889Z[Etc/UTC]",
    comments = "Generator version: 7.6.0")
public class IssuedDocumentPaymentsListItemPaymentTerms implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DAYS = "days";

  @SerializedName(SERIALIZED_NAME_DAYS)
  private Integer days;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private PaymentTermsType type = PaymentTermsType.STANDARD;

  public IssuedDocumentPaymentsListItemPaymentTerms() {}

  public IssuedDocumentPaymentsListItemPaymentTerms days(Integer days) {

    this.days = days;
    return this;
  }

  /**
   * Issued document payment number of days by which the payment must be made
   *
   * @return days
   */
  @javax.annotation.Nullable
  public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }

  public IssuedDocumentPaymentsListItemPaymentTerms type(PaymentTermsType type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nullable
  public PaymentTermsType getType() {
    return type;
  }

  public void setType(PaymentTermsType type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentPaymentsListItemPaymentTerms issuedDocumentPaymentsListItemPaymentTerms =
        (IssuedDocumentPaymentsListItemPaymentTerms) o;
    return Objects.equals(this.days, issuedDocumentPaymentsListItemPaymentTerms.days)
        && Objects.equals(this.type, issuedDocumentPaymentsListItemPaymentTerms.type);
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
    return Objects.hash(days, type);
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
    sb.append("class IssuedDocumentPaymentsListItemPaymentTerms {\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
