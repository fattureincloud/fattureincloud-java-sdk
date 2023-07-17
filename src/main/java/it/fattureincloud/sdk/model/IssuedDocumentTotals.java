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
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** IssuedDocumentTotals */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-07-17T10:04:00.151Z[Etc/UTC]")
public class IssuedDocumentTotals implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT_NET = "amount_net";

  @SerializedName(SERIALIZED_NAME_AMOUNT_NET)
  private BigDecimal amountNet;

  public static final String SERIALIZED_NAME_AMOUNT_RIVALSA = "amount_rivalsa";

  @SerializedName(SERIALIZED_NAME_AMOUNT_RIVALSA)
  private BigDecimal amountRivalsa;

  public static final String SERIALIZED_NAME_AMOUNT_NET_WITH_RIVALSA = "amount_net_with_rivalsa";

  @SerializedName(SERIALIZED_NAME_AMOUNT_NET_WITH_RIVALSA)
  private BigDecimal amountNetWithRivalsa;

  public static final String SERIALIZED_NAME_AMOUNT_CASSA = "amount_cassa";

  @SerializedName(SERIALIZED_NAME_AMOUNT_CASSA)
  private BigDecimal amountCassa;

  public static final String SERIALIZED_NAME_TAXABLE_AMOUNT = "taxable_amount";

  @SerializedName(SERIALIZED_NAME_TAXABLE_AMOUNT)
  private BigDecimal taxableAmount;

  public static final String SERIALIZED_NAME_NOT_TAXABLE_AMOUNT = "not_taxable_amount";

  @SerializedName(SERIALIZED_NAME_NOT_TAXABLE_AMOUNT)
  private BigDecimal notTaxableAmount;

  public static final String SERIALIZED_NAME_AMOUNT_VAT = "amount_vat";

  @SerializedName(SERIALIZED_NAME_AMOUNT_VAT)
  private BigDecimal amountVat;

  public static final String SERIALIZED_NAME_AMOUNT_GROSS = "amount_gross";

  @SerializedName(SERIALIZED_NAME_AMOUNT_GROSS)
  private BigDecimal amountGross;

  public static final String SERIALIZED_NAME_TAXABLE_AMOUNT_WITHHOLDING_TAX =
      "taxable_amount_withholding_tax";

  @SerializedName(SERIALIZED_NAME_TAXABLE_AMOUNT_WITHHOLDING_TAX)
  private BigDecimal taxableAmountWithholdingTax;

  public static final String SERIALIZED_NAME_AMOUNT_WITHHOLDING_TAX = "amount_withholding_tax";

  @SerializedName(SERIALIZED_NAME_AMOUNT_WITHHOLDING_TAX)
  private BigDecimal amountWithholdingTax;

  public static final String SERIALIZED_NAME_TAXABLE_AMOUNT_OTHER_WITHHOLDING_TAX =
      "taxable_amount_other_withholding_tax";

  @SerializedName(SERIALIZED_NAME_TAXABLE_AMOUNT_OTHER_WITHHOLDING_TAX)
  private BigDecimal taxableAmountOtherWithholdingTax;

  public static final String SERIALIZED_NAME_AMOUNT_OTHER_WITHHOLDING_TAX =
      "amount_other_withholding_tax";

  @SerializedName(SERIALIZED_NAME_AMOUNT_OTHER_WITHHOLDING_TAX)
  private BigDecimal amountOtherWithholdingTax;

  public static final String SERIALIZED_NAME_STAMP_DUTY = "stamp_duty";

  @SerializedName(SERIALIZED_NAME_STAMP_DUTY)
  private BigDecimal stampDuty;

  public static final String SERIALIZED_NAME_AMOUNT_DUE = "amount_due";

  @SerializedName(SERIALIZED_NAME_AMOUNT_DUE)
  private BigDecimal amountDue;

  public static final String SERIALIZED_NAME_IS_ENASARCO_MAXIMAL_EXCEEDED =
      "is_enasarco_maximal_exceeded";

  @SerializedName(SERIALIZED_NAME_IS_ENASARCO_MAXIMAL_EXCEEDED)
  private Boolean isEnasarcoMaximalExceeded;

  public static final String SERIALIZED_NAME_PAYMENTS_SUM = "payments_sum";

  @SerializedName(SERIALIZED_NAME_PAYMENTS_SUM)
  private BigDecimal paymentsSum;

  public static final String SERIALIZED_NAME_VAT_LIST = "vat_list";

  @SerializedName(SERIALIZED_NAME_VAT_LIST)
  private Map<String, VatItem> vatList = new HashMap<>();

  public IssuedDocumentTotals() {}

  public IssuedDocumentTotals amountNet(BigDecimal amountNet) {

    this.amountNet = amountNet;
    return this;
  }

  /**
   * Issued document total net amount
   *
   * @return amountNet
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountNet() {
    return amountNet;
  }

  public void setAmountNet(BigDecimal amountNet) {
    this.amountNet = amountNet;
  }

  public IssuedDocumentTotals amountRivalsa(BigDecimal amountRivalsa) {

    this.amountRivalsa = amountRivalsa;
    return this;
  }

  /**
   * Issued document rivalsa amount
   *
   * @return amountRivalsa
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountRivalsa() {
    return amountRivalsa;
  }

  public void setAmountRivalsa(BigDecimal amountRivalsa) {
    this.amountRivalsa = amountRivalsa;
  }

  public IssuedDocumentTotals amountNetWithRivalsa(BigDecimal amountNetWithRivalsa) {

    this.amountNetWithRivalsa = amountNetWithRivalsa;
    return this;
  }

  /**
   * Issued document net amount with rivalsa
   *
   * @return amountNetWithRivalsa
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountNetWithRivalsa() {
    return amountNetWithRivalsa;
  }

  public void setAmountNetWithRivalsa(BigDecimal amountNetWithRivalsa) {
    this.amountNetWithRivalsa = amountNetWithRivalsa;
  }

  public IssuedDocumentTotals amountCassa(BigDecimal amountCassa) {

    this.amountCassa = amountCassa;
    return this;
  }

  /**
   * Issued document cassa amount
   *
   * @return amountCassa
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountCassa() {
    return amountCassa;
  }

  public void setAmountCassa(BigDecimal amountCassa) {
    this.amountCassa = amountCassa;
  }

  public IssuedDocumentTotals taxableAmount(BigDecimal taxableAmount) {

    this.taxableAmount = taxableAmount;
    return this;
  }

  /**
   * Issued document taxable amount
   *
   * @return taxableAmount
   */
  @javax.annotation.Nullable
  public BigDecimal getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(BigDecimal taxableAmount) {
    this.taxableAmount = taxableAmount;
  }

  public IssuedDocumentTotals notTaxableAmount(BigDecimal notTaxableAmount) {

    this.notTaxableAmount = notTaxableAmount;
    return this;
  }

  /**
   * Issued document not taxable amount
   *
   * @return notTaxableAmount
   */
  @javax.annotation.Nullable
  public BigDecimal getNotTaxableAmount() {
    return notTaxableAmount;
  }

  public void setNotTaxableAmount(BigDecimal notTaxableAmount) {
    this.notTaxableAmount = notTaxableAmount;
  }

  public IssuedDocumentTotals amountVat(BigDecimal amountVat) {

    this.amountVat = amountVat;
    return this;
  }

  /**
   * Issued document total vat amount
   *
   * @return amountVat
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountVat() {
    return amountVat;
  }

  public void setAmountVat(BigDecimal amountVat) {
    this.amountVat = amountVat;
  }

  public IssuedDocumentTotals amountGross(BigDecimal amountGross) {

    this.amountGross = amountGross;
    return this;
  }

  /**
   * Issued document total gross amount
   *
   * @return amountGross
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountGross() {
    return amountGross;
  }

  public void setAmountGross(BigDecimal amountGross) {
    this.amountGross = amountGross;
  }

  public IssuedDocumentTotals taxableAmountWithholdingTax(BigDecimal taxableAmountWithholdingTax) {

    this.taxableAmountWithholdingTax = taxableAmountWithholdingTax;
    return this;
  }

  /**
   * Issued document Taxable withholding tax amount
   *
   * @return taxableAmountWithholdingTax
   */
  @javax.annotation.Nullable
  public BigDecimal getTaxableAmountWithholdingTax() {
    return taxableAmountWithholdingTax;
  }

  public void setTaxableAmountWithholdingTax(BigDecimal taxableAmountWithholdingTax) {
    this.taxableAmountWithholdingTax = taxableAmountWithholdingTax;
  }

  public IssuedDocumentTotals amountWithholdingTax(BigDecimal amountWithholdingTax) {

    this.amountWithholdingTax = amountWithholdingTax;
    return this;
  }

  /**
   * Issued document withholding tax amount
   *
   * @return amountWithholdingTax
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountWithholdingTax() {
    return amountWithholdingTax;
  }

  public void setAmountWithholdingTax(BigDecimal amountWithholdingTax) {
    this.amountWithholdingTax = amountWithholdingTax;
  }

  public IssuedDocumentTotals taxableAmountOtherWithholdingTax(
      BigDecimal taxableAmountOtherWithholdingTax) {

    this.taxableAmountOtherWithholdingTax = taxableAmountOtherWithholdingTax;
    return this;
  }

  /**
   * Issued document other withholding tax taxable amount
   *
   * @return taxableAmountOtherWithholdingTax
   */
  @javax.annotation.Nullable
  public BigDecimal getTaxableAmountOtherWithholdingTax() {
    return taxableAmountOtherWithholdingTax;
  }

  public void setTaxableAmountOtherWithholdingTax(BigDecimal taxableAmountOtherWithholdingTax) {
    this.taxableAmountOtherWithholdingTax = taxableAmountOtherWithholdingTax;
  }

  public IssuedDocumentTotals amountOtherWithholdingTax(BigDecimal amountOtherWithholdingTax) {

    this.amountOtherWithholdingTax = amountOtherWithholdingTax;
    return this;
  }

  /**
   * Issued document other withholding tax amount
   *
   * @return amountOtherWithholdingTax
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountOtherWithholdingTax() {
    return amountOtherWithholdingTax;
  }

  public void setAmountOtherWithholdingTax(BigDecimal amountOtherWithholdingTax) {
    this.amountOtherWithholdingTax = amountOtherWithholdingTax;
  }

  public IssuedDocumentTotals stampDuty(BigDecimal stampDuty) {

    this.stampDuty = stampDuty;
    return this;
  }

  /**
   * Issued document stamp duty value [0 if not present].
   *
   * @return stampDuty
   */
  @javax.annotation.Nullable
  public BigDecimal getStampDuty() {
    return stampDuty;
  }

  public void setStampDuty(BigDecimal stampDuty) {
    this.stampDuty = stampDuty;
  }

  public IssuedDocumentTotals amountDue(BigDecimal amountDue) {

    this.amountDue = amountDue;
    return this;
  }

  /**
   * Issued document total amount due
   *
   * @return amountDue
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountDue() {
    return amountDue;
  }

  public void setAmountDue(BigDecimal amountDue) {
    this.amountDue = amountDue;
  }

  public IssuedDocumentTotals isEnasarcoMaximalExceeded(Boolean isEnasarcoMaximalExceeded) {

    this.isEnasarcoMaximalExceeded = isEnasarcoMaximalExceeded;
    return this;
  }

  /**
   * Is enasarco maximal excedeed
   *
   * @return isEnasarcoMaximalExceeded
   */
  @javax.annotation.Nullable
  public Boolean getIsEnasarcoMaximalExceeded() {
    return isEnasarcoMaximalExceeded;
  }

  public void setIsEnasarcoMaximalExceeded(Boolean isEnasarcoMaximalExceeded) {
    this.isEnasarcoMaximalExceeded = isEnasarcoMaximalExceeded;
  }

  public IssuedDocumentTotals paymentsSum(BigDecimal paymentsSum) {

    this.paymentsSum = paymentsSum;
    return this;
  }

  /**
   * Issued document payments sum
   *
   * @return paymentsSum
   */
  @javax.annotation.Nullable
  public BigDecimal getPaymentsSum() {
    return paymentsSum;
  }

  public void setPaymentsSum(BigDecimal paymentsSum) {
    this.paymentsSum = paymentsSum;
  }

  public IssuedDocumentTotals vatList(Map<String, VatItem> vatList) {

    this.vatList = vatList;
    return this;
  }

  public IssuedDocumentTotals putVatListItem(String key, VatItem vatListItem) {
    if (this.vatList == null) {
      this.vatList = new HashMap<>();
    }
    this.vatList.put(key, vatListItem);
    return this;
  }

  /**
   * Get vatList
   *
   * @return vatList
   */
  @javax.annotation.Nullable
  public Map<String, VatItem> getVatList() {
    return vatList;
  }

  public void setVatList(Map<String, VatItem> vatList) {
    this.vatList = vatList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentTotals issuedDocumentTotals = (IssuedDocumentTotals) o;
    return Objects.equals(this.amountNet, issuedDocumentTotals.amountNet)
        && Objects.equals(this.amountRivalsa, issuedDocumentTotals.amountRivalsa)
        && Objects.equals(this.amountNetWithRivalsa, issuedDocumentTotals.amountNetWithRivalsa)
        && Objects.equals(this.amountCassa, issuedDocumentTotals.amountCassa)
        && Objects.equals(this.taxableAmount, issuedDocumentTotals.taxableAmount)
        && Objects.equals(this.notTaxableAmount, issuedDocumentTotals.notTaxableAmount)
        && Objects.equals(this.amountVat, issuedDocumentTotals.amountVat)
        && Objects.equals(this.amountGross, issuedDocumentTotals.amountGross)
        && Objects.equals(
            this.taxableAmountWithholdingTax, issuedDocumentTotals.taxableAmountWithholdingTax)
        && Objects.equals(this.amountWithholdingTax, issuedDocumentTotals.amountWithholdingTax)
        && Objects.equals(
            this.taxableAmountOtherWithholdingTax,
            issuedDocumentTotals.taxableAmountOtherWithholdingTax)
        && Objects.equals(
            this.amountOtherWithholdingTax, issuedDocumentTotals.amountOtherWithholdingTax)
        && Objects.equals(this.stampDuty, issuedDocumentTotals.stampDuty)
        && Objects.equals(this.amountDue, issuedDocumentTotals.amountDue)
        && Objects.equals(
            this.isEnasarcoMaximalExceeded, issuedDocumentTotals.isEnasarcoMaximalExceeded)
        && Objects.equals(this.paymentsSum, issuedDocumentTotals.paymentsSum)
        && Objects.equals(this.vatList, issuedDocumentTotals.vatList);
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
        amountRivalsa,
        amountNetWithRivalsa,
        amountCassa,
        taxableAmount,
        notTaxableAmount,
        amountVat,
        amountGross,
        taxableAmountWithholdingTax,
        amountWithholdingTax,
        taxableAmountOtherWithholdingTax,
        amountOtherWithholdingTax,
        stampDuty,
        amountDue,
        isEnasarcoMaximalExceeded,
        paymentsSum,
        vatList);
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
    sb.append("class IssuedDocumentTotals {\n");
    sb.append("    amountNet: ").append(toIndentedString(amountNet)).append("\n");
    sb.append("    amountRivalsa: ").append(toIndentedString(amountRivalsa)).append("\n");
    sb.append("    amountNetWithRivalsa: ")
        .append(toIndentedString(amountNetWithRivalsa))
        .append("\n");
    sb.append("    amountCassa: ").append(toIndentedString(amountCassa)).append("\n");
    sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
    sb.append("    notTaxableAmount: ").append(toIndentedString(notTaxableAmount)).append("\n");
    sb.append("    amountVat: ").append(toIndentedString(amountVat)).append("\n");
    sb.append("    amountGross: ").append(toIndentedString(amountGross)).append("\n");
    sb.append("    taxableAmountWithholdingTax: ")
        .append(toIndentedString(taxableAmountWithholdingTax))
        .append("\n");
    sb.append("    amountWithholdingTax: ")
        .append(toIndentedString(amountWithholdingTax))
        .append("\n");
    sb.append("    taxableAmountOtherWithholdingTax: ")
        .append(toIndentedString(taxableAmountOtherWithholdingTax))
        .append("\n");
    sb.append("    amountOtherWithholdingTax: ")
        .append(toIndentedString(amountOtherWithholdingTax))
        .append("\n");
    sb.append("    stampDuty: ").append(toIndentedString(stampDuty)).append("\n");
    sb.append("    amountDue: ").append(toIndentedString(amountDue)).append("\n");
    sb.append("    isEnasarcoMaximalExceeded: ")
        .append(toIndentedString(isEnasarcoMaximalExceeded))
        .append("\n");
    sb.append("    paymentsSum: ").append(toIndentedString(paymentsSum)).append("\n");
    sb.append("    vatList: ").append(toIndentedString(vatList)).append("\n");
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
