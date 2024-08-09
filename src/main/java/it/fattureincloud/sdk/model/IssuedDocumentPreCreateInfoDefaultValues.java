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
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Issued document default values */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-09T10:04:25.453429Z[Etc/UTC]",
    comments = "Generator version: 7.7.0")
public class IssuedDocumentPreCreateInfoDefaultValues implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DEFAULT_TEMPLATE = "default_template";

  @SerializedName(SERIALIZED_NAME_DEFAULT_TEMPLATE)
  private DocumentTemplate defaultTemplate;

  public static final String SERIALIZED_NAME_DN_TEMPLATE = "dn_template";

  @SerializedName(SERIALIZED_NAME_DN_TEMPLATE)
  private DocumentTemplate dnTemplate;

  public static final String SERIALIZED_NAME_AI_TEMPLATE = "ai_template";

  @SerializedName(SERIALIZED_NAME_AI_TEMPLATE)
  private DocumentTemplate aiTemplate;

  public static final String SERIALIZED_NAME_NOTES = "notes";

  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_RIVALSA = "rivalsa";

  @SerializedName(SERIALIZED_NAME_RIVALSA)
  private BigDecimal rivalsa;

  public static final String SERIALIZED_NAME_CASSA = "cassa";

  @SerializedName(SERIALIZED_NAME_CASSA)
  private BigDecimal cassa;

  public static final String SERIALIZED_NAME_WITHHOLDING_TAX = "withholding_tax";

  @SerializedName(SERIALIZED_NAME_WITHHOLDING_TAX)
  private BigDecimal withholdingTax;

  public static final String SERIALIZED_NAME_WITHHOLDING_TAX_TAXABLE = "withholding_tax_taxable";

  @SerializedName(SERIALIZED_NAME_WITHHOLDING_TAX_TAXABLE)
  private BigDecimal withholdingTaxTaxable;

  public static final String SERIALIZED_NAME_OTHER_WITHHOLDING_TAX = "other_withholding_tax";

  @SerializedName(SERIALIZED_NAME_OTHER_WITHHOLDING_TAX)
  private BigDecimal otherWithholdingTax;

  public static final String SERIALIZED_NAME_USE_GROSS_PRICES = "use_gross_prices";

  @SerializedName(SERIALIZED_NAME_USE_GROSS_PRICES)
  private Boolean useGrossPrices;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";

  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentMethod paymentMethod;

  public IssuedDocumentPreCreateInfoDefaultValues() {}

  public IssuedDocumentPreCreateInfoDefaultValues defaultTemplate(
      DocumentTemplate defaultTemplate) {

    this.defaultTemplate = defaultTemplate;
    return this;
  }

  /**
   * Get defaultTemplate
   *
   * @return defaultTemplate
   */
  @javax.annotation.Nullable
  public DocumentTemplate getDefaultTemplate() {
    return defaultTemplate;
  }

  public void setDefaultTemplate(DocumentTemplate defaultTemplate) {
    this.defaultTemplate = defaultTemplate;
  }

  public IssuedDocumentPreCreateInfoDefaultValues dnTemplate(DocumentTemplate dnTemplate) {

    this.dnTemplate = dnTemplate;
    return this;
  }

  /**
   * Get dnTemplate
   *
   * @return dnTemplate
   */
  @javax.annotation.Nullable
  public DocumentTemplate getDnTemplate() {
    return dnTemplate;
  }

  public void setDnTemplate(DocumentTemplate dnTemplate) {
    this.dnTemplate = dnTemplate;
  }

  public IssuedDocumentPreCreateInfoDefaultValues aiTemplate(DocumentTemplate aiTemplate) {

    this.aiTemplate = aiTemplate;
    return this;
  }

  /**
   * Get aiTemplate
   *
   * @return aiTemplate
   */
  @javax.annotation.Nullable
  public DocumentTemplate getAiTemplate() {
    return aiTemplate;
  }

  public void setAiTemplate(DocumentTemplate aiTemplate) {
    this.aiTemplate = aiTemplate;
  }

  public IssuedDocumentPreCreateInfoDefaultValues notes(String notes) {

    this.notes = notes;
    return this;
  }

  /**
   * Default notes.
   *
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public IssuedDocumentPreCreateInfoDefaultValues rivalsa(BigDecimal rivalsa) {

    this.rivalsa = rivalsa;
    return this;
  }

  /**
   * Default rivalsa percentage.
   *
   * @return rivalsa
   */
  @javax.annotation.Nullable
  public BigDecimal getRivalsa() {
    return rivalsa;
  }

  public void setRivalsa(BigDecimal rivalsa) {
    this.rivalsa = rivalsa;
  }

  public IssuedDocumentPreCreateInfoDefaultValues cassa(BigDecimal cassa) {

    this.cassa = cassa;
    return this;
  }

  /**
   * Default cassa percentage.
   *
   * @return cassa
   */
  @javax.annotation.Nullable
  public BigDecimal getCassa() {
    return cassa;
  }

  public void setCassa(BigDecimal cassa) {
    this.cassa = cassa;
  }

  public IssuedDocumentPreCreateInfoDefaultValues withholdingTax(BigDecimal withholdingTax) {

    this.withholdingTax = withholdingTax;
    return this;
  }

  /**
   * Default withholding tax percentage.
   *
   * @return withholdingTax
   */
  @javax.annotation.Nullable
  public BigDecimal getWithholdingTax() {
    return withholdingTax;
  }

  public void setWithholdingTax(BigDecimal withholdingTax) {
    this.withholdingTax = withholdingTax;
  }

  public IssuedDocumentPreCreateInfoDefaultValues withholdingTaxTaxable(
      BigDecimal withholdingTaxTaxable) {

    this.withholdingTaxTaxable = withholdingTaxTaxable;
    return this;
  }

  /**
   * Default withholding tax taxable percentage.
   *
   * @return withholdingTaxTaxable
   */
  @javax.annotation.Nullable
  public BigDecimal getWithholdingTaxTaxable() {
    return withholdingTaxTaxable;
  }

  public void setWithholdingTaxTaxable(BigDecimal withholdingTaxTaxable) {
    this.withholdingTaxTaxable = withholdingTaxTaxable;
  }

  public IssuedDocumentPreCreateInfoDefaultValues otherWithholdingTax(
      BigDecimal otherWithholdingTax) {

    this.otherWithholdingTax = otherWithholdingTax;
    return this;
  }

  /**
   * Default other withholding tax percentage.
   *
   * @return otherWithholdingTax
   */
  @javax.annotation.Nullable
  public BigDecimal getOtherWithholdingTax() {
    return otherWithholdingTax;
  }

  public void setOtherWithholdingTax(BigDecimal otherWithholdingTax) {
    this.otherWithholdingTax = otherWithholdingTax;
  }

  public IssuedDocumentPreCreateInfoDefaultValues useGrossPrices(Boolean useGrossPrices) {

    this.useGrossPrices = useGrossPrices;
    return this;
  }

  /**
   * Use gross price by default.
   *
   * @return useGrossPrices
   */
  @javax.annotation.Nullable
  public Boolean getUseGrossPrices() {
    return useGrossPrices;
  }

  public void setUseGrossPrices(Boolean useGrossPrices) {
    this.useGrossPrices = useGrossPrices;
  }

  public IssuedDocumentPreCreateInfoDefaultValues paymentMethod(PaymentMethod paymentMethod) {

    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   *
   * @return paymentMethod
   */
  @javax.annotation.Nullable
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentPreCreateInfoDefaultValues issuedDocumentPreCreateInfoDefaultValues =
        (IssuedDocumentPreCreateInfoDefaultValues) o;
    return Objects.equals(
            this.defaultTemplate, issuedDocumentPreCreateInfoDefaultValues.defaultTemplate)
        && Objects.equals(this.dnTemplate, issuedDocumentPreCreateInfoDefaultValues.dnTemplate)
        && Objects.equals(this.aiTemplate, issuedDocumentPreCreateInfoDefaultValues.aiTemplate)
        && Objects.equals(this.notes, issuedDocumentPreCreateInfoDefaultValues.notes)
        && Objects.equals(this.rivalsa, issuedDocumentPreCreateInfoDefaultValues.rivalsa)
        && Objects.equals(this.cassa, issuedDocumentPreCreateInfoDefaultValues.cassa)
        && Objects.equals(
            this.withholdingTax, issuedDocumentPreCreateInfoDefaultValues.withholdingTax)
        && Objects.equals(
            this.withholdingTaxTaxable,
            issuedDocumentPreCreateInfoDefaultValues.withholdingTaxTaxable)
        && Objects.equals(
            this.otherWithholdingTax, issuedDocumentPreCreateInfoDefaultValues.otherWithholdingTax)
        && Objects.equals(
            this.useGrossPrices, issuedDocumentPreCreateInfoDefaultValues.useGrossPrices)
        && Objects.equals(
            this.paymentMethod, issuedDocumentPreCreateInfoDefaultValues.paymentMethod);
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
        defaultTemplate,
        dnTemplate,
        aiTemplate,
        notes,
        rivalsa,
        cassa,
        withholdingTax,
        withholdingTaxTaxable,
        otherWithholdingTax,
        useGrossPrices,
        paymentMethod);
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
    sb.append("class IssuedDocumentPreCreateInfoDefaultValues {\n");
    sb.append("    defaultTemplate: ").append(toIndentedString(defaultTemplate)).append("\n");
    sb.append("    dnTemplate: ").append(toIndentedString(dnTemplate)).append("\n");
    sb.append("    aiTemplate: ").append(toIndentedString(aiTemplate)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    rivalsa: ").append(toIndentedString(rivalsa)).append("\n");
    sb.append("    cassa: ").append(toIndentedString(cassa)).append("\n");
    sb.append("    withholdingTax: ").append(toIndentedString(withholdingTax)).append("\n");
    sb.append("    withholdingTaxTaxable: ")
        .append(toIndentedString(withholdingTaxTaxable))
        .append("\n");
    sb.append("    otherWithholdingTax: ")
        .append(toIndentedString(otherWithholdingTax))
        .append("\n");
    sb.append("    useGrossPrices: ").append(toIndentedString(useGrossPrices)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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
