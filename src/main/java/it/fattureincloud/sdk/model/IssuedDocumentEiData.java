/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.7
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.fattureincloud.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.fattureincloud.sdk.model.OriginalDocumentType;
import it.fattureincloud.sdk.model.VatKind;
import java.io.IOException;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

/**
 * E-invoice data. [Only if e_invoice&#x3D;true]
 */
@ApiModel(description = "E-invoice data. [Only if e_invoice=true]")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-16T15:17:24.788Z[GMT]")
public class IssuedDocumentEiData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VAT_KIND = "vat_kind";
  @SerializedName(SERIALIZED_NAME_VAT_KIND)
  private VatKind vatKind;

  public static final String SERIALIZED_NAME_ORIGINAL_DOCUMENT_TYPE = "original_document_type";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_DOCUMENT_TYPE)
  private OriginalDocumentType originalDocumentType = OriginalDocumentType.ORDINE;

  public static final String SERIALIZED_NAME_OD_NUMBER = "od_number";
  @SerializedName(SERIALIZED_NAME_OD_NUMBER)
  private String odNumber;

  public static final String SERIALIZED_NAME_OD_DATE = "od_date";
  @SerializedName(SERIALIZED_NAME_OD_DATE)
  private LocalDate odDate;

  public static final String SERIALIZED_NAME_CIG = "cig";
  @SerializedName(SERIALIZED_NAME_CIG)
  private String cig;

  public static final String SERIALIZED_NAME_CUP = "cup";
  @SerializedName(SERIALIZED_NAME_CUP)
  private String cup;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_BANK_IBAN = "bank_iban";
  @SerializedName(SERIALIZED_NAME_BANK_IBAN)
  private String bankIban;

  public static final String SERIALIZED_NAME_BANK_BENEFICIARY = "bank_beneficiary";
  @SerializedName(SERIALIZED_NAME_BANK_BENEFICIARY)
  private String bankBeneficiary;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoice_number";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoice_date";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private LocalDate invoiceDate;


  public IssuedDocumentEiData vatKind(VatKind vatKind) {
    
    this.vatKind = vatKind;
    return this;
  }

   /**
   * Get vatKind
   * @return vatKind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VatKind getVatKind() {
    return vatKind;
  }


  public void setVatKind(VatKind vatKind) {
    this.vatKind = vatKind;
  }


  public IssuedDocumentEiData originalDocumentType(OriginalDocumentType originalDocumentType) {
    
    this.originalDocumentType = originalDocumentType;
    return this;
  }

   /**
   * Get originalDocumentType
   * @return originalDocumentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OriginalDocumentType getOriginalDocumentType() {
    return originalDocumentType;
  }


  public void setOriginalDocumentType(OriginalDocumentType originalDocumentType) {
    this.originalDocumentType = originalDocumentType;
  }


  public IssuedDocumentEiData odNumber(String odNumber) {
    
    this.odNumber = odNumber;
    return this;
  }

   /**
   * Original document number.
   * @return odNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Original document number.")

  public String getOdNumber() {
    return odNumber;
  }


  public void setOdNumber(String odNumber) {
    this.odNumber = odNumber;
  }


  public IssuedDocumentEiData odDate(LocalDate odDate) {
    
    this.odDate = odDate;
    return this;
  }

   /**
   * Original document date.
   * @return odDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Original document date.")

  public LocalDate getOdDate() {
    return odDate;
  }


  public void setOdDate(LocalDate odDate) {
    this.odDate = odDate;
  }


  public IssuedDocumentEiData cig(String cig) {
    
    this.cig = cig;
    return this;
  }

   /**
   * CIG.
   * @return cig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CIG.")

  public String getCig() {
    return cig;
  }


  public void setCig(String cig) {
    this.cig = cig;
  }


  public IssuedDocumentEiData cup(String cup) {
    
    this.cup = cup;
    return this;
  }

   /**
   * CUP.
   * @return cup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CUP.")

  public String getCup() {
    return cup;
  }


  public void setCup(String cup) {
    this.cup = cup;
  }


  public IssuedDocumentEiData paymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Payment method (see https://www.fatturapa.gov.it/export/documenti/fatturapa/v1.2.1/Rappresentazione-tabellare-fattura-ordinaria.pdf for the accepted values of ModalitaPagamento).
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment method (see https://www.fatturapa.gov.it/export/documenti/fatturapa/v1.2.1/Rappresentazione-tabellare-fattura-ordinaria.pdf for the accepted values of ModalitaPagamento).")

  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public IssuedDocumentEiData bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * Bank name.
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bank name.")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public IssuedDocumentEiData bankIban(String bankIban) {
    
    this.bankIban = bankIban;
    return this;
  }

   /**
   * IBAN.
   * @return bankIban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IBAN.")

  public String getBankIban() {
    return bankIban;
  }


  public void setBankIban(String bankIban) {
    this.bankIban = bankIban;
  }


  public IssuedDocumentEiData bankBeneficiary(String bankBeneficiary) {
    
    this.bankBeneficiary = bankBeneficiary;
    return this;
  }

   /**
   * Bank beneficiary.
   * @return bankBeneficiary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bank beneficiary.")

  public String getBankBeneficiary() {
    return bankBeneficiary;
  }


  public void setBankBeneficiary(String bankBeneficiary) {
    this.bankBeneficiary = bankBeneficiary;
  }


  public IssuedDocumentEiData invoiceNumber(String invoiceNumber) {
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice number.
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Invoice number.")

  public String getInvoiceNumber() {
    return invoiceNumber;
  }


  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public IssuedDocumentEiData invoiceDate(LocalDate invoiceDate) {
    
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * Invoice date.
   * @return invoiceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Invoice date.")

  public LocalDate getInvoiceDate() {
    return invoiceDate;
  }


  public void setInvoiceDate(LocalDate invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentEiData issuedDocumentEiData = (IssuedDocumentEiData) o;
    return Objects.equals(this.vatKind, issuedDocumentEiData.vatKind) &&
        Objects.equals(this.originalDocumentType, issuedDocumentEiData.originalDocumentType) &&
        Objects.equals(this.odNumber, issuedDocumentEiData.odNumber) &&
        Objects.equals(this.odDate, issuedDocumentEiData.odDate) &&
        Objects.equals(this.cig, issuedDocumentEiData.cig) &&
        Objects.equals(this.cup, issuedDocumentEiData.cup) &&
        Objects.equals(this.paymentMethod, issuedDocumentEiData.paymentMethod) &&
        Objects.equals(this.bankName, issuedDocumentEiData.bankName) &&
        Objects.equals(this.bankIban, issuedDocumentEiData.bankIban) &&
        Objects.equals(this.bankBeneficiary, issuedDocumentEiData.bankBeneficiary) &&
        Objects.equals(this.invoiceNumber, issuedDocumentEiData.invoiceNumber) &&
        Objects.equals(this.invoiceDate, issuedDocumentEiData.invoiceDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(vatKind, originalDocumentType, odNumber, odDate, cig, cup, paymentMethod, bankName, bankIban, bankBeneficiary, invoiceNumber, invoiceDate);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuedDocumentEiData {\n");
    sb.append("    vatKind: ").append(toIndentedString(vatKind)).append("\n");
    sb.append("    originalDocumentType: ").append(toIndentedString(originalDocumentType)).append("\n");
    sb.append("    odNumber: ").append(toIndentedString(odNumber)).append("\n");
    sb.append("    odDate: ").append(toIndentedString(odDate)).append("\n");
    sb.append("    cig: ").append(toIndentedString(cig)).append("\n");
    sb.append("    cup: ").append(toIndentedString(cup)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankIban: ").append(toIndentedString(bankIban)).append("\n");
    sb.append("    bankBeneficiary: ").append(toIndentedString(bankBeneficiary)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

