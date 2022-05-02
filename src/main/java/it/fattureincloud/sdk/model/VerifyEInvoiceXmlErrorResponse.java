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

/** VerifyEInvoiceXmlErrorResponse */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-05-02T14:07:51.629401Z[GMT]")
public class VerifyEInvoiceXmlErrorResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ERROR = "error";

  @SerializedName(SERIALIZED_NAME_ERROR)
  private VerifyEInvoiceXmlErrorResponseError error;

  public static final String SERIALIZED_NAME_EXTRA = "extra";

  @SerializedName(SERIALIZED_NAME_EXTRA)
  private VerifyEInvoiceXmlErrorResponseExtra extra;

  public VerifyEInvoiceXmlErrorResponse() {}

  public VerifyEInvoiceXmlErrorResponse error(VerifyEInvoiceXmlErrorResponseError error) {

    this.error = error;
    return this;
  }

  /**
   * Get error
   *
   * @return error
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public VerifyEInvoiceXmlErrorResponseError getError() {
    return error;
  }

  public void setError(VerifyEInvoiceXmlErrorResponseError error) {
    this.error = error;
  }

  public VerifyEInvoiceXmlErrorResponse extra(VerifyEInvoiceXmlErrorResponseExtra extra) {

    this.extra = extra;
    return this;
  }

  /**
   * Get extra
   *
   * @return extra
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public VerifyEInvoiceXmlErrorResponseExtra getExtra() {
    return extra;
  }

  public void setExtra(VerifyEInvoiceXmlErrorResponseExtra extra) {
    this.extra = extra;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyEInvoiceXmlErrorResponse verifyEInvoiceXmlErrorResponse =
        (VerifyEInvoiceXmlErrorResponse) o;
    return Objects.equals(this.error, verifyEInvoiceXmlErrorResponse.error)
        && Objects.equals(this.extra, verifyEInvoiceXmlErrorResponse.extra);
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
    return Objects.hash(error, extra);
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
    sb.append("class VerifyEInvoiceXmlErrorResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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
