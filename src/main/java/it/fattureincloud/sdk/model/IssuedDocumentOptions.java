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
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** IssuedDocumentOptions */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-05-04T15:24:25.345779Z[GMT]")
public class IssuedDocumentOptions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FIX_PAYMENTS = "fix_payments";

  @SerializedName(SERIALIZED_NAME_FIX_PAYMENTS)
  private Boolean fixPayments;

  public IssuedDocumentOptions() {}

  public IssuedDocumentOptions fixPayments(Boolean fixPayments) {

    this.fixPayments = fixPayments;
    return this;
  }

  /**
   * Fixes your last payment amount to match your document total
   *
   * @return fixPayments
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fixes your last payment amount to match your document total")
  public Boolean getFixPayments() {
    return fixPayments;
  }

  public void setFixPayments(Boolean fixPayments) {
    this.fixPayments = fixPayments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentOptions issuedDocumentOptions = (IssuedDocumentOptions) o;
    return Objects.equals(this.fixPayments, issuedDocumentOptions.fixPayments);
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
    return Objects.hash(fixPayments);
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
    sb.append("class IssuedDocumentOptions {\n");
    sb.append("    fixPayments: ").append(toIndentedString(fixPayments)).append("\n");
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
