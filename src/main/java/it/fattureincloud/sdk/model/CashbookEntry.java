/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.3
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
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** CashbookEntry */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-30T09:09:50.123536Z[Etc/UTC]",
    comments = "Generator version: 7.9.0")
public class CashbookEntry implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DATE = "date";

  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private CashbookEntryKind kind;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private CashbookEntryType type;

  public static final String SERIALIZED_NAME_ENTITY_NAME = "entity_name";

  @SerializedName(SERIALIZED_NAME_ENTITY_NAME)
  private String entityName;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";

  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private CashbookEntryDocument document;

  public static final String SERIALIZED_NAME_AMOUNT_IN = "amount_in";

  @SerializedName(SERIALIZED_NAME_AMOUNT_IN)
  private BigDecimal amountIn;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT_IN = "payment_account_in";

  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT_IN)
  private PaymentAccount paymentAccountIn;

  public static final String SERIALIZED_NAME_AMOUNT_OUT = "amount_out";

  @SerializedName(SERIALIZED_NAME_AMOUNT_OUT)
  private BigDecimal amountOut;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT_OUT = "payment_account_out";

  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT_OUT)
  private PaymentAccount paymentAccountOut;

  public CashbookEntry() {}

  public CashbookEntry id(String id) {

    this.id = id;
    return this;
  }

  /**
   * Cashbook id
   *
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CashbookEntry date(LocalDate date) {

    this.date = date;
    return this;
  }

  /**
   * Cashbook date
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

  public CashbookEntry description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Cashbook description
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

  public CashbookEntry kind(CashbookEntryKind kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   *
   * @return kind
   */
  @javax.annotation.Nullable
  public CashbookEntryKind getKind() {
    return kind;
  }

  public void setKind(CashbookEntryKind kind) {
    this.kind = kind;
  }

  public CashbookEntry type(CashbookEntryType type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nullable
  public CashbookEntryType getType() {
    return type;
  }

  public void setType(CashbookEntryType type) {
    this.type = type;
  }

  public CashbookEntry entityName(String entityName) {

    this.entityName = entityName;
    return this;
  }

  /**
   * Cashbook entity name
   *
   * @return entityName
   */
  @javax.annotation.Nullable
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public CashbookEntry document(CashbookEntryDocument document) {

    this.document = document;
    return this;
  }

  /**
   * Get document
   *
   * @return document
   */
  @javax.annotation.Nullable
  public CashbookEntryDocument getDocument() {
    return document;
  }

  public void setDocument(CashbookEntryDocument document) {
    this.document = document;
  }

  public CashbookEntry amountIn(BigDecimal amountIn) {

    this.amountIn = amountIn;
    return this;
  }

  /**
   * [Only for cashbook entry in] Cashbook total amount in
   *
   * @return amountIn
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountIn() {
    return amountIn;
  }

  public void setAmountIn(BigDecimal amountIn) {
    this.amountIn = amountIn;
  }

  public CashbookEntry paymentAccountIn(PaymentAccount paymentAccountIn) {

    this.paymentAccountIn = paymentAccountIn;
    return this;
  }

  /**
   * Get paymentAccountIn
   *
   * @return paymentAccountIn
   */
  @javax.annotation.Nullable
  public PaymentAccount getPaymentAccountIn() {
    return paymentAccountIn;
  }

  public void setPaymentAccountIn(PaymentAccount paymentAccountIn) {
    this.paymentAccountIn = paymentAccountIn;
  }

  public CashbookEntry amountOut(BigDecimal amountOut) {

    this.amountOut = amountOut;
    return this;
  }

  /**
   * [Only for cashbook entry out] Cashbook total amount out
   *
   * @return amountOut
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountOut() {
    return amountOut;
  }

  public void setAmountOut(BigDecimal amountOut) {
    this.amountOut = amountOut;
  }

  public CashbookEntry paymentAccountOut(PaymentAccount paymentAccountOut) {

    this.paymentAccountOut = paymentAccountOut;
    return this;
  }

  /**
   * Get paymentAccountOut
   *
   * @return paymentAccountOut
   */
  @javax.annotation.Nullable
  public PaymentAccount getPaymentAccountOut() {
    return paymentAccountOut;
  }

  public void setPaymentAccountOut(PaymentAccount paymentAccountOut) {
    this.paymentAccountOut = paymentAccountOut;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashbookEntry cashbookEntry = (CashbookEntry) o;
    return Objects.equals(this.id, cashbookEntry.id)
        && Objects.equals(this.date, cashbookEntry.date)
        && Objects.equals(this.description, cashbookEntry.description)
        && Objects.equals(this.kind, cashbookEntry.kind)
        && Objects.equals(this.type, cashbookEntry.type)
        && Objects.equals(this.entityName, cashbookEntry.entityName)
        && Objects.equals(this.document, cashbookEntry.document)
        && Objects.equals(this.amountIn, cashbookEntry.amountIn)
        && Objects.equals(this.paymentAccountIn, cashbookEntry.paymentAccountIn)
        && Objects.equals(this.amountOut, cashbookEntry.amountOut)
        && Objects.equals(this.paymentAccountOut, cashbookEntry.paymentAccountOut);
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
        date,
        description,
        kind,
        type,
        entityName,
        document,
        amountIn,
        paymentAccountIn,
        amountOut,
        paymentAccountOut);
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
    sb.append("class CashbookEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    amountIn: ").append(toIndentedString(amountIn)).append("\n");
    sb.append("    paymentAccountIn: ").append(toIndentedString(paymentAccountIn)).append("\n");
    sb.append("    amountOut: ").append(toIndentedString(amountOut)).append("\n");
    sb.append("    paymentAccountOut: ").append(toIndentedString(paymentAccountOut)).append("\n");
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
