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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VerifyEInvoiceXmlErrorResponseErrorValidationResult */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-09T09:03:55.704569Z[Etc/UTC]",
    comments = "Generator version: 7.7.0")
public class VerifyEInvoiceXmlErrorResponseErrorValidationResult implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_XML_ERRORS = "xml_errors";

  @SerializedName(SERIALIZED_NAME_XML_ERRORS)
  private List<String> xmlErrors;

  public VerifyEInvoiceXmlErrorResponseErrorValidationResult() {}

  public VerifyEInvoiceXmlErrorResponseErrorValidationResult xmlErrors(List<String> xmlErrors) {

    this.xmlErrors = xmlErrors;
    return this;
  }

  public VerifyEInvoiceXmlErrorResponseErrorValidationResult addXmlErrorsItem(
      String xmlErrorsItem) {
    if (this.xmlErrors == null) {
      this.xmlErrors = new ArrayList<>();
    }
    this.xmlErrors.add(xmlErrorsItem);
    return this;
  }

  /**
   * Get xmlErrors
   *
   * @return xmlErrors
   */
  @javax.annotation.Nullable
  public List<String> getXmlErrors() {
    return xmlErrors;
  }

  public void setXmlErrors(List<String> xmlErrors) {
    this.xmlErrors = xmlErrors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyEInvoiceXmlErrorResponseErrorValidationResult
        verifyEInvoiceXmlErrorResponseErrorValidationResult =
            (VerifyEInvoiceXmlErrorResponseErrorValidationResult) o;
    return Objects.equals(
        this.xmlErrors, verifyEInvoiceXmlErrorResponseErrorValidationResult.xmlErrors);
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
    return Objects.hash(xmlErrors);
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
    sb.append("class VerifyEInvoiceXmlErrorResponseErrorValidationResult {\n");
    sb.append("    xmlErrors: ").append(toIndentedString(xmlErrors)).append("\n");
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
