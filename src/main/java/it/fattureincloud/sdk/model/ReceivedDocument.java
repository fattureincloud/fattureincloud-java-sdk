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
import it.fattureincloud.sdk.model.Currency;
import it.fattureincloud.sdk.model.ReceivedDocumentEntity;
import it.fattureincloud.sdk.model.ReceivedDocumentItemsList;
import it.fattureincloud.sdk.model.ReceivedDocumentPaymentsList;
import it.fattureincloud.sdk.model.ReceivedDocumentType;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

/**
 * ReceivedDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-14T16:12:54.353Z[GMT]")
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
  private ReceivedDocumentEntity entity;

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

  public static final String SERIALIZED_NAME_AMOUNT_OTHER_WITHHOLDING_TAX = "amount_other_withholding_tax";
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
  private List<ReceivedDocumentItemsList> itemsList = null;

  public static final String SERIALIZED_NAME_PAYMENTS_LIST = "payments_list";
  @SerializedName(SERIALIZED_NAME_PAYMENTS_LIST)
  private List<ReceivedDocumentPaymentsList> paymentsList = null;

  public static final String SERIALIZED_NAME_ATTACHMENT_URL = "attachment_url";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_URL)
  private String attachmentUrl;

  public static final String SERIALIZED_NAME_ATTACHMENT_PREVIEW_URL = "attachment_preview_url";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_PREVIEW_URL)
  private String attachmentPreviewUrl;

  public static final String SERIALIZED_NAME_ATTACHMENT_TOKEN = "attachment_token";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_TOKEN)
  private String attachmentToken;


  public ReceivedDocument id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the document.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the document.")

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
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReceivedDocumentType getType() {
    return type;
  }


  public void setType(ReceivedDocumentType type) {
    this.type = type;
  }


  public ReceivedDocument entity(ReceivedDocumentEntity entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReceivedDocumentEntity getEntity() {
    return entity;
  }


  public void setEntity(ReceivedDocumentEntity entity) {
    this.entity = entity;
  }


  public ReceivedDocument date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * Date of the document [If not specified, today date is used].
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the document [If not specified, today date is used].")

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
   * Document category.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document category.")

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
   * Document description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document description.")

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
   * Total net amount.
   * @return amountNet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total net amount.")

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
   * Total vat amount.
   * @return amountVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total vat amount.")

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
   * Withholding tax amount.
   * @return amountWithholdingTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Withholding tax amount.")

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
   * Other withholding tax amount.
   * @return amountOtherWithholdingTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Other withholding tax amount.")

  public BigDecimal getAmountOtherWithholdingTax() {
    return amountOtherWithholdingTax;
  }


  public void setAmountOtherWithholdingTax(BigDecimal amountOtherWithholdingTax) {
    this.amountOtherWithholdingTax = amountOtherWithholdingTax;
  }


   /**
   * [Read Only] Total gross amount.
   * @return amountGross
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Read Only] Total gross amount.")

  public BigDecimal getAmountGross() {
    return amountGross;
  }




  public ReceivedDocument amortization(BigDecimal amortization) {
    
    this.amortization = amortization;
    return this;
  }

   /**
   * Amortization value
   * @return amortization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amortization value")

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
   * Revenue center.
   * @return rcCenter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Revenue center.")

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
   * Invoice number
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Invoice number")

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
   * Get isMarked
   * @return isMarked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * Get isDetailed
   * @return isDetailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * [Read Only] Indicates if this is an e-invoice.
   * @return eInvoice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Read Only] Indicates if this is an e-invoice.")

  public Boolean geteInvoice() {
    return eInvoice;
  }


  public void seteInvoice(Boolean eInvoice) {
    this.eInvoice = eInvoice;
  }


   /**
   * [Read Only] Next due date.
   * @return nextDueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Read Only] Next due date.")

  public LocalDate getNextDueDate() {
    return nextDueDate;
  }




  public ReceivedDocument currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * Tax deducibility percentage.
   * minimum: 0
   * maximum: 100
   * @return taxDeductibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax deducibility percentage.")

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
   * Vat deducibility percentage.
   * minimum: 0
   * maximum: 100
   * @return vatDeductibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Vat deducibility percentage.")

  public BigDecimal getVatDeductibility() {
    return vatDeductibility;
  }


  public void setVatDeductibility(BigDecimal vatDeductibility) {
    this.vatDeductibility = vatDeductibility;
  }


  public ReceivedDocument itemsList(List<ReceivedDocumentItemsList> itemsList) {
    
    this.itemsList = itemsList;
    return this;
  }

  public ReceivedDocument addItemsListItem(ReceivedDocumentItemsList itemsListItem) {
    if (this.itemsList == null) {
      this.itemsList = new ArrayList<>();
    }
    this.itemsList.add(itemsListItem);
    return this;
  }

   /**
   * Get itemsList
   * @return itemsList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReceivedDocumentItemsList> getItemsList() {
    return itemsList;
  }


  public void setItemsList(List<ReceivedDocumentItemsList> itemsList) {
    this.itemsList = itemsList;
  }


  public ReceivedDocument paymentsList(List<ReceivedDocumentPaymentsList> paymentsList) {
    
    this.paymentsList = paymentsList;
    return this;
  }

  public ReceivedDocument addPaymentsListItem(ReceivedDocumentPaymentsList paymentsListItem) {
    if (this.paymentsList == null) {
      this.paymentsList = new ArrayList<>();
    }
    this.paymentsList.add(paymentsListItem);
    return this;
  }

   /**
   * Get paymentsList
   * @return paymentsList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReceivedDocumentPaymentsList> getPaymentsList() {
    return paymentsList;
  }


  public void setPaymentsList(List<ReceivedDocumentPaymentsList> paymentsList) {
    this.paymentsList = paymentsList;
  }


   /**
   * [Read Only] Attachment url.
   * @return attachmentUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Read Only] Attachment url.")

  public String getAttachmentUrl() {
    return attachmentUrl;
  }




   /**
   * [Read Only] Attachment preview url.
   * @return attachmentPreviewUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Read Only] Attachment preview url.")

  public String getAttachmentPreviewUrl() {
    return attachmentPreviewUrl;
  }




  public ReceivedDocument attachmentToken(String attachmentToken) {
    
    this.attachmentToken = attachmentToken;
    return this;
  }

   /**
   * Uploaded attachement token.
   * @return attachmentToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Uploaded attachement token.")

  public String getAttachmentToken() {
    return attachmentToken;
  }


  public void setAttachmentToken(String attachmentToken) {
    this.attachmentToken = attachmentToken;
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
    return Objects.equals(this.id, receivedDocument.id) &&
        Objects.equals(this.type, receivedDocument.type) &&
        Objects.equals(this.entity, receivedDocument.entity) &&
        Objects.equals(this.date, receivedDocument.date) &&
        Objects.equals(this.category, receivedDocument.category) &&
        Objects.equals(this.description, receivedDocument.description) &&
        Objects.equals(this.amountNet, receivedDocument.amountNet) &&
        Objects.equals(this.amountVat, receivedDocument.amountVat) &&
        Objects.equals(this.amountWithholdingTax, receivedDocument.amountWithholdingTax) &&
        Objects.equals(this.amountOtherWithholdingTax, receivedDocument.amountOtherWithholdingTax) &&
        Objects.equals(this.amountGross, receivedDocument.amountGross) &&
        Objects.equals(this.amortization, receivedDocument.amortization) &&
        Objects.equals(this.rcCenter, receivedDocument.rcCenter) &&
        Objects.equals(this.invoiceNumber, receivedDocument.invoiceNumber) &&
        Objects.equals(this.isMarked, receivedDocument.isMarked) &&
        Objects.equals(this.isDetailed, receivedDocument.isDetailed) &&
        Objects.equals(this.eInvoice, receivedDocument.eInvoice) &&
        Objects.equals(this.nextDueDate, receivedDocument.nextDueDate) &&
        Objects.equals(this.currency, receivedDocument.currency) &&
        Objects.equals(this.taxDeductibility, receivedDocument.taxDeductibility) &&
        Objects.equals(this.vatDeductibility, receivedDocument.vatDeductibility) &&
        Objects.equals(this.itemsList, receivedDocument.itemsList) &&
        Objects.equals(this.paymentsList, receivedDocument.paymentsList) &&
        Objects.equals(this.attachmentUrl, receivedDocument.attachmentUrl) &&
        Objects.equals(this.attachmentPreviewUrl, receivedDocument.attachmentPreviewUrl) &&
        Objects.equals(this.attachmentToken, receivedDocument.attachmentToken);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, entity, date, category, description, amountNet, amountVat, amountWithholdingTax, amountOtherWithholdingTax, amountGross, amortization, rcCenter, invoiceNumber, isMarked, isDetailed, eInvoice, nextDueDate, currency, taxDeductibility, vatDeductibility, itemsList, paymentsList, attachmentUrl, attachmentPreviewUrl, attachmentToken);
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
    sb.append("class ReceivedDocument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amountNet: ").append(toIndentedString(amountNet)).append("\n");
    sb.append("    amountVat: ").append(toIndentedString(amountVat)).append("\n");
    sb.append("    amountWithholdingTax: ").append(toIndentedString(amountWithholdingTax)).append("\n");
    sb.append("    amountOtherWithholdingTax: ").append(toIndentedString(amountOtherWithholdingTax)).append("\n");
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
    sb.append("    attachmentPreviewUrl: ").append(toIndentedString(attachmentPreviewUrl)).append("\n");
    sb.append("    attachmentToken: ").append(toIndentedString(attachmentToken)).append("\n");
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
