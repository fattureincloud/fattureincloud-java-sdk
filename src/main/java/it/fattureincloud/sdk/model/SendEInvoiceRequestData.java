/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.17
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

/** SendEInvoiceRequestData */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-05-26T06:56:17.462034Z[Etc/UTC]")
public class SendEInvoiceRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CASSA_TYPE = "cassa_type";

  @SerializedName(SERIALIZED_NAME_CASSA_TYPE)
  private String cassaType;

  public static final String SERIALIZED_NAME_WITHHOLDING_TAX_CAUSAL = "withholding_tax_causal";

  @SerializedName(SERIALIZED_NAME_WITHHOLDING_TAX_CAUSAL)
  private String withholdingTaxCausal;

  public SendEInvoiceRequestData() {}

  public SendEInvoiceRequestData cassaType(String cassaType) {

    this.cassaType = cassaType;
    return this;
  }

  /**
   * Value of TipoCassa used (optional, override the company default value).
   *
   * @return cassaType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Value of TipoCassa used (optional, override the company default value).")
  public String getCassaType() {
    return cassaType;
  }

  public void setCassaType(String cassaType) {
    this.cassaType = cassaType;
  }

  public SendEInvoiceRequestData withholdingTaxCausal(String withholdingTaxCausal) {

    this.withholdingTaxCausal = withholdingTaxCausal;
    return this;
  }

  /**
   * Value of CausalePagamento used (optional, override the company default value).
   *
   * @return withholdingTaxCausal
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Value of CausalePagamento used (optional, override the company default value).")
  public String getWithholdingTaxCausal() {
    return withholdingTaxCausal;
  }

  public void setWithholdingTaxCausal(String withholdingTaxCausal) {
    this.withholdingTaxCausal = withholdingTaxCausal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendEInvoiceRequestData sendEInvoiceRequestData = (SendEInvoiceRequestData) o;
    return Objects.equals(this.cassaType, sendEInvoiceRequestData.cassaType)
        && Objects.equals(this.withholdingTaxCausal, sendEInvoiceRequestData.withholdingTaxCausal);
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
    return Objects.hash(cassaType, withholdingTaxCausal);
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
    sb.append("class SendEInvoiceRequestData {\n");
    sb.append("    cassaType: ").append(toIndentedString(cassaType)).append("\n");
    sb.append("    withholdingTaxCausal: ")
        .append(toIndentedString(withholdingTaxCausal))
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
