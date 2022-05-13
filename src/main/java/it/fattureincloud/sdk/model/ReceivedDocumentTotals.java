/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.16
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
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@ApiModel(description = "")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-05-12T13:23:15.879179Z[Etc/UTC]")
public class ReceivedDocumentTotals implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT_NET = "amount_net";

  @SerializedName(SERIALIZED_NAME_AMOUNT_NET)
  private BigDecimal amountNet;

  public static final String SERIALIZED_NAME_AMOUNT_VAT = "amount_vat";

  @SerializedName(SERIALIZED_NAME_AMOUNT_VAT)
  private BigDecimal amountVat;

  public static final String SERIALIZED_NAME_AMOUNT_GROSS = "amount_gross";

  @SerializedName(SERIALIZED_NAME_AMOUNT_GROSS)
  private BigDecimal amountGross;

  public static final String SERIALIZED_NAME_AMOUNT_WITHHOLDING_TAX = "amount_withholding_tax";

  @SerializedName(SERIALIZED_NAME_AMOUNT_WITHHOLDING_TAX)
  private BigDecimal amountWithholdingTax;

  public static final String SERIALIZED_NAME_AMOUNT_OTHER_WITHHOLDING_TAX =
      "amount_other_withholding_tax";

  @SerializedName(SERIALIZED_NAME_AMOUNT_OTHER_WITHHOLDING_TAX)
  private BigDecimal amountOtherWithholdingTax;

  public static final String SERIALIZED_NAME_AMOUNT_DUE = "amount_due";

  @SerializedName(SERIALIZED_NAME_AMOUNT_DUE)
  private BigDecimal amountDue;

  public static final String SERIALIZED_NAME_PAYMENTS_SUM = "payments_sum";

  @SerializedName(SERIALIZED_NAME_PAYMENTS_SUM)
  private BigDecimal paymentsSum;

  public ReceivedDocumentTotals() {}

  public ReceivedDocumentTotals amountNet(BigDecimal amountNet) {

    this.amountNet = amountNet;
    return this;
  }

  /**
   * Total net amount.
   *
   * @return amountNet
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total net amount.")
  public BigDecimal getAmountNet() {
    return amountNet;
  }

  public void setAmountNet(BigDecimal amountNet) {
    this.amountNet = amountNet;
  }

  public ReceivedDocumentTotals amountVat(BigDecimal amountVat) {

    this.amountVat = amountVat;
    return this;
  }

  /**
   * Total vat amount.
   *
   * @return amountVat
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total vat amount.")
  public BigDecimal getAmountVat() {
    return amountVat;
  }

  public void setAmountVat(BigDecimal amountVat) {
    this.amountVat = amountVat;
  }

  public ReceivedDocumentTotals amountGross(BigDecimal amountGross) {

    this.amountGross = amountGross;
    return this;
  }

  /**
   * Total gross amount.
   *
   * @return amountGross
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total gross amount.")
  public BigDecimal getAmountGross() {
    return amountGross;
  }

  public void setAmountGross(BigDecimal amountGross) {
    this.amountGross = amountGross;
  }

  public ReceivedDocumentTotals amountWithholdingTax(BigDecimal amountWithholdingTax) {

    this.amountWithholdingTax = amountWithholdingTax;
    return this;
  }

  /**
   * Total withholding tax amount.
   *
   * @return amountWithholdingTax
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total withholding tax amount.")
  public BigDecimal getAmountWithholdingTax() {
    return amountWithholdingTax;
  }

  public void setAmountWithholdingTax(BigDecimal amountWithholdingTax) {
    this.amountWithholdingTax = amountWithholdingTax;
  }

  public ReceivedDocumentTotals amountOtherWithholdingTax(BigDecimal amountOtherWithholdingTax) {

    this.amountOtherWithholdingTax = amountOtherWithholdingTax;
    return this;
  }

  /**
   * Total other withholding tax amount.
   *
   * @return amountOtherWithholdingTax
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total other withholding tax amount.")
  public BigDecimal getAmountOtherWithholdingTax() {
    return amountOtherWithholdingTax;
  }

  public void setAmountOtherWithholdingTax(BigDecimal amountOtherWithholdingTax) {
    this.amountOtherWithholdingTax = amountOtherWithholdingTax;
  }

  public ReceivedDocumentTotals amountDue(BigDecimal amountDue) {

    this.amountDue = amountDue;
    return this;
  }

  /**
   * Total amount due.
   *
   * @return amountDue
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount due.")
  public BigDecimal getAmountDue() {
    return amountDue;
  }

  public void setAmountDue(BigDecimal amountDue) {
    this.amountDue = amountDue;
  }

  public ReceivedDocumentTotals paymentsSum(BigDecimal paymentsSum) {

    this.paymentsSum = paymentsSum;
    return this;
  }

  /**
   * Payments sum.
   *
   * @return paymentsSum
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payments sum.")
  public BigDecimal getPaymentsSum() {
    return paymentsSum;
  }

  public void setPaymentsSum(BigDecimal paymentsSum) {
    this.paymentsSum = paymentsSum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivedDocumentTotals receivedDocumentTotals = (ReceivedDocumentTotals) o;
    return Objects.equals(this.amountNet, receivedDocumentTotals.amountNet)
        && Objects.equals(this.amountVat, receivedDocumentTotals.amountVat)
        && Objects.equals(this.amountGross, receivedDocumentTotals.amountGross)
        && Objects.equals(this.amountWithholdingTax, receivedDocumentTotals.amountWithholdingTax)
        && Objects.equals(
            this.amountOtherWithholdingTax, receivedDocumentTotals.amountOtherWithholdingTax)
        && Objects.equals(this.amountDue, receivedDocumentTotals.amountDue)
        && Objects.equals(this.paymentsSum, receivedDocumentTotals.paymentsSum);
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
        amountNet,
        amountVat,
        amountGross,
        amountWithholdingTax,
        amountOtherWithholdingTax,
        amountDue,
        paymentsSum);
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
    sb.append("class ReceivedDocumentTotals {\n");
    sb.append("    amountNet: ").append(toIndentedString(amountNet)).append("\n");
    sb.append("    amountVat: ").append(toIndentedString(amountVat)).append("\n");
    sb.append("    amountGross: ").append(toIndentedString(amountGross)).append("\n");
    sb.append("    amountWithholdingTax: ")
        .append(toIndentedString(amountWithholdingTax))
        .append("\n");
    sb.append("    amountOtherWithholdingTax: ")
        .append(toIndentedString(amountOtherWithholdingTax))
        .append("\n");
    sb.append("    amountDue: ").append(toIndentedString(amountDue)).append("\n");
    sb.append("    paymentsSum: ").append(toIndentedString(paymentsSum)).append("\n");
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
