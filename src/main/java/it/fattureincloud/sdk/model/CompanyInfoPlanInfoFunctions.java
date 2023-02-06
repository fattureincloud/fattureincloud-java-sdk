/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.25
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import it.fattureincloud.sdk.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Access to functions for this company. */
@ApiModel(description = "Access to functions for this company.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-02-06T15:44:01.481Z[Etc/UTC]")
public class CompanyInfoPlanInfoFunctions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ARCHIVE = "archive";

  @SerializedName(SERIALIZED_NAME_ARCHIVE)
  private Boolean archive;

  public static final String SERIALIZED_NAME_CERVED = "cerved";

  @SerializedName(SERIALIZED_NAME_CERVED)
  private Boolean cerved;

  public static final String SERIALIZED_NAME_DOCUMENT_ATTACHMENTS = "document_attachments";

  @SerializedName(SERIALIZED_NAME_DOCUMENT_ATTACHMENTS)
  private Boolean documentAttachments;

  public static final String SERIALIZED_NAME_E_INVOICE = "e_invoice";

  @SerializedName(SERIALIZED_NAME_E_INVOICE)
  private Boolean eInvoice;

  public static final String SERIALIZED_NAME_GENIUS = "genius";

  @SerializedName(SERIALIZED_NAME_GENIUS)
  private Boolean genius;

  public static final String SERIALIZED_NAME_MAIL_TRACKING = "mail_tracking";

  @SerializedName(SERIALIZED_NAME_MAIL_TRACKING)
  private Boolean mailTracking;

  public static final String SERIALIZED_NAME_PAYMENT_NOTIFICATIONS = "payment_notifications";

  @SerializedName(SERIALIZED_NAME_PAYMENT_NOTIFICATIONS)
  private Boolean paymentNotifications;

  public static final String SERIALIZED_NAME_PAYPAL = "paypal";

  @SerializedName(SERIALIZED_NAME_PAYPAL)
  private Boolean paypal;

  public static final String SERIALIZED_NAME_RECEIPTS = "receipts";

  @SerializedName(SERIALIZED_NAME_RECEIPTS)
  private Boolean receipts;

  public static final String SERIALIZED_NAME_RECURRING = "recurring";

  @SerializedName(SERIALIZED_NAME_RECURRING)
  private Boolean recurring;

  public static final String SERIALIZED_NAME_SMTP = "smtp";

  @SerializedName(SERIALIZED_NAME_SMTP)
  private Boolean smtp;

  public static final String SERIALIZED_NAME_SOFORT = "sofort";

  @SerializedName(SERIALIZED_NAME_SOFORT)
  private Boolean sofort;

  public static final String SERIALIZED_NAME_STOCK = "stock";

  @SerializedName(SERIALIZED_NAME_STOCK)
  private Boolean stock;

  public static final String SERIALIZED_NAME_SUBACCOUNTS = "subaccounts";

  @SerializedName(SERIALIZED_NAME_SUBACCOUNTS)
  private Boolean subaccounts;

  public static final String SERIALIZED_NAME_TESSERA_SANITARIA = "tessera_sanitaria";

  @SerializedName(SERIALIZED_NAME_TESSERA_SANITARIA)
  private Boolean tesseraSanitaria;

  public static final String SERIALIZED_NAME_TS_DIGITAL = "ts_digital";

  @SerializedName(SERIALIZED_NAME_TS_DIGITAL)
  private Boolean tsDigital;

  public static final String SERIALIZED_NAME_TS_INVOICE_TRADING = "ts_invoice_trading";

  @SerializedName(SERIALIZED_NAME_TS_INVOICE_TRADING)
  private Boolean tsInvoiceTrading;

  public static final String SERIALIZED_NAME_TS_PAY = "ts_pay";

  @SerializedName(SERIALIZED_NAME_TS_PAY)
  private Boolean tsPay;

  public CompanyInfoPlanInfoFunctions() {}

  public CompanyInfoPlanInfoFunctions archive(Boolean archive) {

    this.archive = archive;
    return this;
  }

  /**
   * Get archive
   *
   * @return archive
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getArchive() {
    return archive;
  }

  public void setArchive(Boolean archive) {
    this.archive = archive;
  }

  public CompanyInfoPlanInfoFunctions cerved(Boolean cerved) {

    this.cerved = cerved;
    return this;
  }

  /**
   * Get cerved
   *
   * @return cerved
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getCerved() {
    return cerved;
  }

  public void setCerved(Boolean cerved) {
    this.cerved = cerved;
  }

  public CompanyInfoPlanInfoFunctions documentAttachments(Boolean documentAttachments) {

    this.documentAttachments = documentAttachments;
    return this;
  }

  /**
   * Get documentAttachments
   *
   * @return documentAttachments
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getDocumentAttachments() {
    return documentAttachments;
  }

  public void setDocumentAttachments(Boolean documentAttachments) {
    this.documentAttachments = documentAttachments;
  }

  public CompanyInfoPlanInfoFunctions eInvoice(Boolean eInvoice) {

    this.eInvoice = eInvoice;
    return this;
  }

  /**
   * Get eInvoice
   *
   * @return eInvoice
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean geteInvoice() {
    return eInvoice;
  }

  public void seteInvoice(Boolean eInvoice) {
    this.eInvoice = eInvoice;
  }

  public CompanyInfoPlanInfoFunctions genius(Boolean genius) {

    this.genius = genius;
    return this;
  }

  /**
   * Get genius
   *
   * @return genius
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getGenius() {
    return genius;
  }

  public void setGenius(Boolean genius) {
    this.genius = genius;
  }

  public CompanyInfoPlanInfoFunctions mailTracking(Boolean mailTracking) {

    this.mailTracking = mailTracking;
    return this;
  }

  /**
   * Get mailTracking
   *
   * @return mailTracking
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getMailTracking() {
    return mailTracking;
  }

  public void setMailTracking(Boolean mailTracking) {
    this.mailTracking = mailTracking;
  }

  public CompanyInfoPlanInfoFunctions paymentNotifications(Boolean paymentNotifications) {

    this.paymentNotifications = paymentNotifications;
    return this;
  }

  /**
   * Get paymentNotifications
   *
   * @return paymentNotifications
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getPaymentNotifications() {
    return paymentNotifications;
  }

  public void setPaymentNotifications(Boolean paymentNotifications) {
    this.paymentNotifications = paymentNotifications;
  }

  public CompanyInfoPlanInfoFunctions paypal(Boolean paypal) {

    this.paypal = paypal;
    return this;
  }

  /**
   * Get paypal
   *
   * @return paypal
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getPaypal() {
    return paypal;
  }

  public void setPaypal(Boolean paypal) {
    this.paypal = paypal;
  }

  public CompanyInfoPlanInfoFunctions receipts(Boolean receipts) {

    this.receipts = receipts;
    return this;
  }

  /**
   * Get receipts
   *
   * @return receipts
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getReceipts() {
    return receipts;
  }

  public void setReceipts(Boolean receipts) {
    this.receipts = receipts;
  }

  public CompanyInfoPlanInfoFunctions recurring(Boolean recurring) {

    this.recurring = recurring;
    return this;
  }

  /**
   * Get recurring
   *
   * @return recurring
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getRecurring() {
    return recurring;
  }

  public void setRecurring(Boolean recurring) {
    this.recurring = recurring;
  }

  public CompanyInfoPlanInfoFunctions smtp(Boolean smtp) {

    this.smtp = smtp;
    return this;
  }

  /**
   * Get smtp
   *
   * @return smtp
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getSmtp() {
    return smtp;
  }

  public void setSmtp(Boolean smtp) {
    this.smtp = smtp;
  }

  public CompanyInfoPlanInfoFunctions sofort(Boolean sofort) {

    this.sofort = sofort;
    return this;
  }

  /**
   * Get sofort
   *
   * @return sofort
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getSofort() {
    return sofort;
  }

  public void setSofort(Boolean sofort) {
    this.sofort = sofort;
  }

  public CompanyInfoPlanInfoFunctions stock(Boolean stock) {

    this.stock = stock;
    return this;
  }

  /**
   * Get stock
   *
   * @return stock
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getStock() {
    return stock;
  }

  public void setStock(Boolean stock) {
    this.stock = stock;
  }

  public CompanyInfoPlanInfoFunctions subaccounts(Boolean subaccounts) {

    this.subaccounts = subaccounts;
    return this;
  }

  /**
   * Get subaccounts
   *
   * @return subaccounts
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getSubaccounts() {
    return subaccounts;
  }

  public void setSubaccounts(Boolean subaccounts) {
    this.subaccounts = subaccounts;
  }

  public CompanyInfoPlanInfoFunctions tesseraSanitaria(Boolean tesseraSanitaria) {

    this.tesseraSanitaria = tesseraSanitaria;
    return this;
  }

  /**
   * Get tesseraSanitaria
   *
   * @return tesseraSanitaria
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getTesseraSanitaria() {
    return tesseraSanitaria;
  }

  public void setTesseraSanitaria(Boolean tesseraSanitaria) {
    this.tesseraSanitaria = tesseraSanitaria;
  }

  public CompanyInfoPlanInfoFunctions tsDigital(Boolean tsDigital) {

    this.tsDigital = tsDigital;
    return this;
  }

  /**
   * Get tsDigital
   *
   * @return tsDigital
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getTsDigital() {
    return tsDigital;
  }

  public void setTsDigital(Boolean tsDigital) {
    this.tsDigital = tsDigital;
  }

  public CompanyInfoPlanInfoFunctions tsInvoiceTrading(Boolean tsInvoiceTrading) {

    this.tsInvoiceTrading = tsInvoiceTrading;
    return this;
  }

  /**
   * Get tsInvoiceTrading
   *
   * @return tsInvoiceTrading
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getTsInvoiceTrading() {
    return tsInvoiceTrading;
  }

  public void setTsInvoiceTrading(Boolean tsInvoiceTrading) {
    this.tsInvoiceTrading = tsInvoiceTrading;
  }

  public CompanyInfoPlanInfoFunctions tsPay(Boolean tsPay) {

    this.tsPay = tsPay;
    return this;
  }

  /**
   * Get tsPay
   *
   * @return tsPay
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getTsPay() {
    return tsPay;
  }

  public void setTsPay(Boolean tsPay) {
    this.tsPay = tsPay;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyInfoPlanInfoFunctions companyInfoPlanInfoFunctions = (CompanyInfoPlanInfoFunctions) o;
    return Objects.equals(this.archive, companyInfoPlanInfoFunctions.archive)
        && Objects.equals(this.cerved, companyInfoPlanInfoFunctions.cerved)
        && Objects.equals(
            this.documentAttachments, companyInfoPlanInfoFunctions.documentAttachments)
        && Objects.equals(this.eInvoice, companyInfoPlanInfoFunctions.eInvoice)
        && Objects.equals(this.genius, companyInfoPlanInfoFunctions.genius)
        && Objects.equals(this.mailTracking, companyInfoPlanInfoFunctions.mailTracking)
        && Objects.equals(
            this.paymentNotifications, companyInfoPlanInfoFunctions.paymentNotifications)
        && Objects.equals(this.paypal, companyInfoPlanInfoFunctions.paypal)
        && Objects.equals(this.receipts, companyInfoPlanInfoFunctions.receipts)
        && Objects.equals(this.recurring, companyInfoPlanInfoFunctions.recurring)
        && Objects.equals(this.smtp, companyInfoPlanInfoFunctions.smtp)
        && Objects.equals(this.sofort, companyInfoPlanInfoFunctions.sofort)
        && Objects.equals(this.stock, companyInfoPlanInfoFunctions.stock)
        && Objects.equals(this.subaccounts, companyInfoPlanInfoFunctions.subaccounts)
        && Objects.equals(this.tesseraSanitaria, companyInfoPlanInfoFunctions.tesseraSanitaria)
        && Objects.equals(this.tsDigital, companyInfoPlanInfoFunctions.tsDigital)
        && Objects.equals(this.tsInvoiceTrading, companyInfoPlanInfoFunctions.tsInvoiceTrading)
        && Objects.equals(this.tsPay, companyInfoPlanInfoFunctions.tsPay);
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
        archive,
        cerved,
        documentAttachments,
        eInvoice,
        genius,
        mailTracking,
        paymentNotifications,
        paypal,
        receipts,
        recurring,
        smtp,
        sofort,
        stock,
        subaccounts,
        tesseraSanitaria,
        tsDigital,
        tsInvoiceTrading,
        tsPay);
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
    sb.append("class CompanyInfoPlanInfoFunctions {\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    cerved: ").append(toIndentedString(cerved)).append("\n");
    sb.append("    documentAttachments: ")
        .append(toIndentedString(documentAttachments))
        .append("\n");
    sb.append("    eInvoice: ").append(toIndentedString(eInvoice)).append("\n");
    sb.append("    genius: ").append(toIndentedString(genius)).append("\n");
    sb.append("    mailTracking: ").append(toIndentedString(mailTracking)).append("\n");
    sb.append("    paymentNotifications: ")
        .append(toIndentedString(paymentNotifications))
        .append("\n");
    sb.append("    paypal: ").append(toIndentedString(paypal)).append("\n");
    sb.append("    receipts: ").append(toIndentedString(receipts)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    smtp: ").append(toIndentedString(smtp)).append("\n");
    sb.append("    sofort: ").append(toIndentedString(sofort)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    subaccounts: ").append(toIndentedString(subaccounts)).append("\n");
    sb.append("    tesseraSanitaria: ").append(toIndentedString(tesseraSanitaria)).append("\n");
    sb.append("    tsDigital: ").append(toIndentedString(tsDigital)).append("\n");
    sb.append("    tsInvoiceTrading: ").append(toIndentedString(tsInvoiceTrading)).append("\n");
    sb.append("    tsPay: ").append(toIndentedString(tsPay)).append("\n");
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

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("archive");
    openapiFields.add("cerved");
    openapiFields.add("document_attachments");
    openapiFields.add("e_invoice");
    openapiFields.add("genius");
    openapiFields.add("mail_tracking");
    openapiFields.add("payment_notifications");
    openapiFields.add("paypal");
    openapiFields.add("receipts");
    openapiFields.add("recurring");
    openapiFields.add("smtp");
    openapiFields.add("sofort");
    openapiFields.add("stock");
    openapiFields.add("subaccounts");
    openapiFields.add("tessera_sanitaria");
    openapiFields.add("ts_digital");
    openapiFields.add("ts_invoice_trading");
    openapiFields.add("ts_pay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to CompanyInfoPlanInfoFunctions
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (CompanyInfoPlanInfoFunctions.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in CompanyInfoPlanInfoFunctions is not found in the empty JSON string",
                CompanyInfoPlanInfoFunctions.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!CompanyInfoPlanInfoFunctions.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `CompanyInfoPlanInfoFunctions` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!CompanyInfoPlanInfoFunctions.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'CompanyInfoPlanInfoFunctions' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<CompanyInfoPlanInfoFunctions> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(CompanyInfoPlanInfoFunctions.class));

      return (TypeAdapter<T>)
          new TypeAdapter<CompanyInfoPlanInfoFunctions>() {
            @Override
            public void write(JsonWriter out, CompanyInfoPlanInfoFunctions value)
                throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public CompanyInfoPlanInfoFunctions read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of CompanyInfoPlanInfoFunctions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompanyInfoPlanInfoFunctions
   * @throws IOException if the JSON string is invalid with respect to CompanyInfoPlanInfoFunctions
   */
  public static CompanyInfoPlanInfoFunctions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompanyInfoPlanInfoFunctions.class);
  }

  /**
   * Convert an instance of CompanyInfoPlanInfoFunctions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
