/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.2
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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReceivedDocument */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-22T15:13:22.680184Z[Etc/UTC]",
    comments = "Generator version: 7.9.0")
public class ReceivedDocument implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private ReceivedDocumentType type = ReceivedDocumentType.EXPENSE;

  public static final String SERIALIZED_NAME_ENTITY = "entity";

  @SerializedName(SERIALIZED_NAME_ENTITY)
  private Entity entity;

  public static final String SERIALIZED_NAME_DATE = "date";

  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_CATEGORY = "category";

  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AMOUNT_NET = "amount_net";

  @SerializedName(SERIALIZED_NAME_AMOUNT_NET)
  private BigDecimal amountNet;

  public static final String SERIALIZED_NAME_AMOUNT_VAT = "amount_vat";

  @SerializedName(SERIALIZED_NAME_AMOUNT_VAT)
  private BigDecimal amountVat;

  public static final String SERIALIZED_NAME_AMOUNT_WITHHOLDING_TAX = "amount_withholding_tax";

  @SerializedName(SERIALIZED_NAME_AMOUNT_WITHHOLDING_TAX)
  private BigDecimal amountWithholdingTax;

  public static final String SERIALIZED_NAME_AMOUNT_OTHER_WITHHOLDING_TAX =
      "amount_other_withholding_tax";

  @SerializedName(SERIALIZED_NAME_AMOUNT_OTHER_WITHHOLDING_TAX)
  private BigDecimal amountOtherWithholdingTax;

  public static final String SERIALIZED_NAME_AMOUNT_GROSS = "amount_gross";

  @SerializedName(SERIALIZED_NAME_AMOUNT_GROSS)
  private BigDecimal amountGross;

  public static final String SERIALIZED_NAME_AMORTIZATION = "amortization";

  @SerializedName(SERIALIZED_NAME_AMORTIZATION)
  private BigDecimal amortization;

  public static final String SERIALIZED_NAME_RC_CENTER = "rc_center";

  @SerializedName(SERIALIZED_NAME_RC_CENTER)
  private String rcCenter;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoice_number";

  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_IS_MARKED = "is_marked";

  @SerializedName(SERIALIZED_NAME_IS_MARKED)
  private Boolean isMarked;

  public static final String SERIALIZED_NAME_IS_DETAILED = "is_detailed";

  @SerializedName(SERIALIZED_NAME_IS_DETAILED)
  private Boolean isDetailed;

  public static final String SERIALIZED_NAME_E_INVOICE = "e_invoice";

  @SerializedName(SERIALIZED_NAME_E_INVOICE)
  private Boolean eInvoice;

  public static final String SERIALIZED_NAME_NEXT_DUE_DATE = "next_due_date";

  @SerializedName(SERIALIZED_NAME_NEXT_DUE_DATE)
  private LocalDate nextDueDate;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";

  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_TAX_DEDUCTIBILITY = "tax_deductibility";

  @SerializedName(SERIALIZED_NAME_TAX_DEDUCTIBILITY)
  private BigDecimal taxDeductibility;

  public static final String SERIALIZED_NAME_VAT_DEDUCTIBILITY = "vat_deductibility";

  @SerializedName(SERIALIZED_NAME_VAT_DEDUCTIBILITY)
  private BigDecimal vatDeductibility;

  public static final String SERIALIZED_NAME_ITEMS_LIST = "items_list";

  @SerializedName(SERIALIZED_NAME_ITEMS_LIST)
  private List<ReceivedDocumentItemsListItem> itemsList;

  public static final String SERIALIZED_NAME_PAYMENTS_LIST = "payments_list";

  @SerializedName(SERIALIZED_NAME_PAYMENTS_LIST)
  private List<ReceivedDocumentPaymentsListItem> paymentsList;

  public static final String SERIALIZED_NAME_ATTACHMENT_URL = "attachment_url";

  @SerializedName(SERIALIZED_NAME_ATTACHMENT_URL)
  private String attachmentUrl;

  public static final String SERIALIZED_NAME_ATTACHMENT_PREVIEW_URL = "attachment_preview_url";

  @SerializedName(SERIALIZED_NAME_ATTACHMENT_PREVIEW_URL)
  private String attachmentPreviewUrl;

  public static final String SERIALIZED_NAME_AUTO_CALCULATE = "auto_calculate";

  @SerializedName(SERIALIZED_NAME_AUTO_CALCULATE)
  private Boolean autoCalculate;

  public static final String SERIALIZED_NAME_ATTACHMENT_TOKEN = "attachment_token";

  @SerializedName(SERIALIZED_NAME_ATTACHMENT_TOKEN)
  private String attachmentToken;

  public static final String SERIALIZED_NAME_LOCKED = "locked";

  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";

  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";

  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public ReceivedDocument() {}
  /** Constructor with only readonly parameters */
  public ReceivedDocument(
      BigDecimal amountGross,
      LocalDate nextDueDate,
      String attachmentUrl,
      String attachmentPreviewUrl) {
    this();
    this.amountGross = amountGross;
    this.nextDueDate = nextDueDate;
    this.attachmentUrl = attachmentUrl;
    this.attachmentPreviewUrl = attachmentPreviewUrl;
  }

  public ReceivedDocument id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Received document id
   *
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ReceivedDocument type(ReceivedDocumentType type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nullable
  public ReceivedDocumentType getType() {
    return type;
  }

  public void setType(ReceivedDocumentType type) {
    this.type = type;
  }

  public ReceivedDocument entity(Entity entity) {

    this.entity = entity;
    return this;
  }

  /**
   * Get entity
   *
   * @return entity
   */
  @javax.annotation.Nullable
  public Entity getEntity() {
    return entity;
  }

  public void setEntity(Entity entity) {
    this.entity = entity;
  }

  public ReceivedDocument date(LocalDate date) {

    this.date = date;
    return this;
  }

  /**
   * Received document date [defaults to today&#39;s date]
   *
   * @return date
   */
  @javax.annotation.Nullable
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ReceivedDocument category(String category) {

    this.category = category;
    return this;
  }

  /**
   * Received document category
   *
   * @return category
   */
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ReceivedDocument description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Received document description
   *
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReceivedDocument amountNet(BigDecimal amountNet) {

    this.amountNet = amountNet;
    return this;
  }

  /**
   * Received document total net amount
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

  public ReceivedDocument amountVat(BigDecimal amountVat) {

    this.amountVat = amountVat;
    return this;
  }

  /**
   * Received document total vat amount
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

  public ReceivedDocument amountWithholdingTax(BigDecimal amountWithholdingTax) {

    this.amountWithholdingTax = amountWithholdingTax;
    return this;
  }

  /**
   * Received document withholding tax amount
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

  public ReceivedDocument amountOtherWithholdingTax(BigDecimal amountOtherWithholdingTax) {

    this.amountOtherWithholdingTax = amountOtherWithholdingTax;
    return this;
  }

  /**
   * Received document other withholding tax amount
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

  /**
   * [Read Only] Received document total gross amount
   *
   * @return amountGross
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountGross() {
    return amountGross;
  }

  public ReceivedDocument amortization(BigDecimal amortization) {

    this.amortization = amortization;
    return this;
  }

  /**
   * Received document amortization value
   *
   * @return amortization
   */
  @javax.annotation.Nullable
  public BigDecimal getAmortization() {
    return amortization;
  }

  public void setAmortization(BigDecimal amortization) {
    this.amortization = amortization;
  }

  public ReceivedDocument rcCenter(String rcCenter) {

    this.rcCenter = rcCenter;
    return this;
  }

  /**
   * Received document revenue center
   *
   * @return rcCenter
   */
  @javax.annotation.Nullable
  public String getRcCenter() {
    return rcCenter;
  }

  public void setRcCenter(String rcCenter) {
    this.rcCenter = rcCenter;
  }

  public ReceivedDocument invoiceNumber(String invoiceNumber) {

    this.invoiceNumber = invoiceNumber;
    return this;
  }

  /**
   * Received document invoice number
   *
   * @return invoiceNumber
   */
  @javax.annotation.Nullable
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public ReceivedDocument isMarked(Boolean isMarked) {

    this.isMarked = isMarked;
    return this;
  }

  /**
   * Received document is marked
   *
   * @return isMarked
   */
  @javax.annotation.Nullable
  public Boolean getIsMarked() {
    return isMarked;
  }

  public void setIsMarked(Boolean isMarked) {
    this.isMarked = isMarked;
  }

  public ReceivedDocument isDetailed(Boolean isDetailed) {

    this.isDetailed = isDetailed;
    return this;
  }

  /**
   * Received document has items
   *
   * @return isDetailed
   */
  @javax.annotation.Nullable
  public Boolean getIsDetailed() {
    return isDetailed;
  }

  public void setIsDetailed(Boolean isDetailed) {
    this.isDetailed = isDetailed;
  }

  public ReceivedDocument eInvoice(Boolean eInvoice) {

    this.eInvoice = eInvoice;
    return this;
  }

  /**
   * [Read Only] Received document is an e-invoice
   *
   * @return eInvoice
   */
  @javax.annotation.Nullable
  public Boolean geteInvoice() {
    return eInvoice;
  }

  public void seteInvoice(Boolean eInvoice) {
    this.eInvoice = eInvoice;
  }

  /**
   * [Read Only] Received document date of the next not paid payment
   *
   * @return nextDueDate
   */
  @javax.annotation.Nullable
  public LocalDate getNextDueDate() {
    return nextDueDate;
  }

  public ReceivedDocument currency(Currency currency) {

    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   *
   * @return currency
   */
  @javax.annotation.Nullable
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public ReceivedDocument taxDeductibility(BigDecimal taxDeductibility) {

    this.taxDeductibility = taxDeductibility;
    return this;
  }

  /**
   * Received document tax deducibility percentage
   *
   * @return taxDeductibility
   */
  @javax.annotation.Nullable
  public BigDecimal getTaxDeductibility() {
    return taxDeductibility;
  }

  public void setTaxDeductibility(BigDecimal taxDeductibility) {
    this.taxDeductibility = taxDeductibility;
  }

  public ReceivedDocument vatDeductibility(BigDecimal vatDeductibility) {

    this.vatDeductibility = vatDeductibility;
    return this;
  }

  /**
   * Received document vat deducibility percentage
   *
   * @return vatDeductibility
   */
  @javax.annotation.Nullable
  public BigDecimal getVatDeductibility() {
    return vatDeductibility;
  }

  public void setVatDeductibility(BigDecimal vatDeductibility) {
    this.vatDeductibility = vatDeductibility;
  }

  public ReceivedDocument itemsList(List<ReceivedDocumentItemsListItem> itemsList) {

    this.itemsList = itemsList;
    return this;
  }

  public ReceivedDocument addItemsListItem(ReceivedDocumentItemsListItem itemsListItem) {
    if (this.itemsList == null) {
      this.itemsList = new ArrayList<>();
    }
    this.itemsList.add(itemsListItem);
    return this;
  }

  /**
   * Get itemsList
   *
   * @return itemsList
   */
  @javax.annotation.Nullable
  public List<ReceivedDocumentItemsListItem> getItemsList() {
    return itemsList;
  }

  public void setItemsList(List<ReceivedDocumentItemsListItem> itemsList) {
    this.itemsList = itemsList;
  }

  public ReceivedDocument paymentsList(List<ReceivedDocumentPaymentsListItem> paymentsList) {

    this.paymentsList = paymentsList;
    return this;
  }

  public ReceivedDocument addPaymentsListItem(ReceivedDocumentPaymentsListItem paymentsListItem) {
    if (this.paymentsList == null) {
      this.paymentsList = new ArrayList<>();
    }
    this.paymentsList.add(paymentsListItem);
    return this;
  }

  /**
   * Get paymentsList
   *
   * @return paymentsList
   */
  @javax.annotation.Nullable
  public List<ReceivedDocumentPaymentsListItem> getPaymentsList() {
    return paymentsList;
  }

  public void setPaymentsList(List<ReceivedDocumentPaymentsListItem> paymentsList) {
    this.paymentsList = paymentsList;
  }

  /**
   * [Temporary] [Read Only] Received document url of the attached file
   *
   * @return attachmentUrl
   */
  @javax.annotation.Nullable
  public String getAttachmentUrl() {
    return attachmentUrl;
  }

  /**
   * [Temporary] [Read Only] Received document url of the attachment preview
   *
   * @return attachmentPreviewUrl
   */
  @javax.annotation.Nullable
  public String getAttachmentPreviewUrl() {
    return attachmentPreviewUrl;
  }

  public ReceivedDocument autoCalculate(Boolean autoCalculate) {

    this.autoCalculate = autoCalculate;
    return this;
  }

  /**
   * Received document total items amount and total payments amount can differ if this field is set
   * to false
   *
   * @return autoCalculate
   */
  @javax.annotation.Nullable
  public Boolean getAutoCalculate() {
    return autoCalculate;
  }

  public void setAutoCalculate(Boolean autoCalculate) {
    this.autoCalculate = autoCalculate;
  }

  public ReceivedDocument attachmentToken(String attachmentToken) {

    this.attachmentToken = attachmentToken;
    return this;
  }

  /**
   * [Write Only] Received document attachment token returned by POST /received_documents/attachment
   *
   * @return attachmentToken
   */
  @javax.annotation.Nullable
  public String getAttachmentToken() {
    return attachmentToken;
  }

  public void setAttachmentToken(String attachmentToken) {
    this.attachmentToken = attachmentToken;
  }

  public ReceivedDocument locked(Boolean locked) {

    this.locked = locked;
    return this;
  }

  /**
   * Received Document can&#39;t be edited
   *
   * @return locked
   */
  @javax.annotation.Nullable
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public ReceivedDocument createdAt(String createdAt) {

    this.createdAt = createdAt;
    return this;
  }

  /**
   * Received document creation date
   *
   * @return createdAt
   */
  @javax.annotation.Nullable
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ReceivedDocument updatedAt(String updatedAt) {

    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Received document last update date
   *
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivedDocument receivedDocument = (ReceivedDocument) o;
    return Objects.equals(this.id, receivedDocument.id)
        && Objects.equals(this.type, receivedDocument.type)
        && Objects.equals(this.entity, receivedDocument.entity)
        && Objects.equals(this.date, receivedDocument.date)
        && Objects.equals(this.category, receivedDocument.category)
        && Objects.equals(this.description, receivedDocument.description)
        && Objects.equals(this.amountNet, receivedDocument.amountNet)
        && Objects.equals(this.amountVat, receivedDocument.amountVat)
        && Objects.equals(this.amountWithholdingTax, receivedDocument.amountWithholdingTax)
        && Objects.equals(
            this.amountOtherWithholdingTax, receivedDocument.amountOtherWithholdingTax)
        && Objects.equals(this.amountGross, receivedDocument.amountGross)
        && Objects.equals(this.amortization, receivedDocument.amortization)
        && Objects.equals(this.rcCenter, receivedDocument.rcCenter)
        && Objects.equals(this.invoiceNumber, receivedDocument.invoiceNumber)
        && Objects.equals(this.isMarked, receivedDocument.isMarked)
        && Objects.equals(this.isDetailed, receivedDocument.isDetailed)
        && Objects.equals(this.eInvoice, receivedDocument.eInvoice)
        && Objects.equals(this.nextDueDate, receivedDocument.nextDueDate)
        && Objects.equals(this.currency, receivedDocument.currency)
        && Objects.equals(this.taxDeductibility, receivedDocument.taxDeductibility)
        && Objects.equals(this.vatDeductibility, receivedDocument.vatDeductibility)
        && Objects.equals(this.itemsList, receivedDocument.itemsList)
        && Objects.equals(this.paymentsList, receivedDocument.paymentsList)
        && Objects.equals(this.attachmentUrl, receivedDocument.attachmentUrl)
        && Objects.equals(this.attachmentPreviewUrl, receivedDocument.attachmentPreviewUrl)
        && Objects.equals(this.autoCalculate, receivedDocument.autoCalculate)
        && Objects.equals(this.attachmentToken, receivedDocument.attachmentToken)
        && Objects.equals(this.locked, receivedDocument.locked)
        && Objects.equals(this.createdAt, receivedDocument.createdAt)
        && Objects.equals(this.updatedAt, receivedDocument.updatedAt);
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
        id,
        type,
        entity,
        date,
        category,
        description,
        amountNet,
        amountVat,
        amountWithholdingTax,
        amountOtherWithholdingTax,
        amountGross,
        amortization,
        rcCenter,
        invoiceNumber,
        isMarked,
        isDetailed,
        eInvoice,
        nextDueDate,
        currency,
        taxDeductibility,
        vatDeductibility,
        itemsList,
        paymentsList,
        attachmentUrl,
        attachmentPreviewUrl,
        autoCalculate,
        attachmentToken,
        locked,
        createdAt,
        updatedAt);
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
    sb.append("class ReceivedDocument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amountNet: ").append(toIndentedString(amountNet)).append("\n");
    sb.append("    amountVat: ").append(toIndentedString(amountVat)).append("\n");
    sb.append("    amountWithholdingTax: ")
        .append(toIndentedString(amountWithholdingTax))
        .append("\n");
    sb.append("    amountOtherWithholdingTax: ")
        .append(toIndentedString(amountOtherWithholdingTax))
        .append("\n");
    sb.append("    amountGross: ").append(toIndentedString(amountGross)).append("\n");
    sb.append("    amortization: ").append(toIndentedString(amortization)).append("\n");
    sb.append("    rcCenter: ").append(toIndentedString(rcCenter)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    isMarked: ").append(toIndentedString(isMarked)).append("\n");
    sb.append("    isDetailed: ").append(toIndentedString(isDetailed)).append("\n");
    sb.append("    eInvoice: ").append(toIndentedString(eInvoice)).append("\n");
    sb.append("    nextDueDate: ").append(toIndentedString(nextDueDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    taxDeductibility: ").append(toIndentedString(taxDeductibility)).append("\n");
    sb.append("    vatDeductibility: ").append(toIndentedString(vatDeductibility)).append("\n");
    sb.append("    itemsList: ").append(toIndentedString(itemsList)).append("\n");
    sb.append("    paymentsList: ").append(toIndentedString(paymentsList)).append("\n");
    sb.append("    attachmentUrl: ").append(toIndentedString(attachmentUrl)).append("\n");
    sb.append("    attachmentPreviewUrl: ")
        .append(toIndentedString(attachmentPreviewUrl))
        .append("\n");
    sb.append("    autoCalculate: ").append(toIndentedString(autoCalculate)).append("\n");
    sb.append("    attachmentToken: ").append(toIndentedString(attachmentToken)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
