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
import it.fattureincloud.sdk.model.CashbookEntryDataDocument;
import it.fattureincloud.sdk.model.CashbookEntryIn;
import it.fattureincloud.sdk.model.CashbookEntryKind;
import it.fattureincloud.sdk.model.CashbookEntryOut;
import it.fattureincloud.sdk.model.CashbookEntryType;
import it.fattureincloud.sdk.model.PaymentAccount;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

/**
 * CashbookEntryInOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-06T09:48:54.463Z[GMT]")
public class CashbookEntryInOut implements Serializable {
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
  private CashbookEntryDataDocument document;

  public static final String SERIALIZED_NAME_AMOUNT_OUT = "amount_out";
  @SerializedName(SERIALIZED_NAME_AMOUNT_OUT)
  private BigDecimal amountOut;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT_OUT = "payment_account_out";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT_OUT)
  private PaymentAccount paymentAccountOut;

  public static final String SERIALIZED_NAME_AMOUNT_IN = "amount_in";
  @SerializedName(SERIALIZED_NAME_AMOUNT_IN)
  private BigDecimal amountIn;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT_IN = "payment_account_in";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT_IN)
  private PaymentAccount paymentAccountIn;


  public CashbookEntryInOut id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Cashbook unique identifier.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cashbook unique identifier.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CashbookEntryInOut date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * Cashbook date.
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cashbook date.")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    this.date = date;
  }


  public CashbookEntryInOut description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Cashbook description.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cashbook description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CashbookEntryInOut kind(CashbookEntryKind kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CashbookEntryKind getKind() {
    return kind;
  }


  public void setKind(CashbookEntryKind kind) {
    this.kind = kind;
  }


  public CashbookEntryInOut type(CashbookEntryType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CashbookEntryType getType() {
    return type;
  }


  public void setType(CashbookEntryType type) {
    this.type = type;
  }


  public CashbookEntryInOut entityName(String entityName) {
    
    this.entityName = entityName;
    return this;
  }

   /**
   * Entity name.
   * @return entityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Entity name.")

  public String getEntityName() {
    return entityName;
  }


  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  public CashbookEntryInOut document(CashbookEntryDataDocument document) {
    
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CashbookEntryDataDocument getDocument() {
    return document;
  }


  public void setDocument(CashbookEntryDataDocument document) {
    this.document = document;
  }


  public CashbookEntryInOut amountOut(BigDecimal amountOut) {
    
    this.amountOut = amountOut;
    return this;
  }

   /**
   * Total amount out.
   * @return amountOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount out.")

  public BigDecimal getAmountOut() {
    return amountOut;
  }


  public void setAmountOut(BigDecimal amountOut) {
    this.amountOut = amountOut;
  }


  public CashbookEntryInOut paymentAccountOut(PaymentAccount paymentAccountOut) {
    
    this.paymentAccountOut = paymentAccountOut;
    return this;
  }

   /**
   * Get paymentAccountOut
   * @return paymentAccountOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentAccount getPaymentAccountOut() {
    return paymentAccountOut;
  }


  public void setPaymentAccountOut(PaymentAccount paymentAccountOut) {
    this.paymentAccountOut = paymentAccountOut;
  }


  public CashbookEntryInOut amountIn(BigDecimal amountIn) {
    
    this.amountIn = amountIn;
    return this;
  }

   /**
   * Total amount in.
   * @return amountIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount in.")

  public BigDecimal getAmountIn() {
    return amountIn;
  }


  public void setAmountIn(BigDecimal amountIn) {
    this.amountIn = amountIn;
  }


  public CashbookEntryInOut paymentAccountIn(PaymentAccount paymentAccountIn) {
    
    this.paymentAccountIn = paymentAccountIn;
    return this;
  }

   /**
   * Get paymentAccountIn
   * @return paymentAccountIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentAccount getPaymentAccountIn() {
    return paymentAccountIn;
  }


  public void setPaymentAccountIn(PaymentAccount paymentAccountIn) {
    this.paymentAccountIn = paymentAccountIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashbookEntryInOut cashbookEntryInOut = (CashbookEntryInOut) o;
    return Objects.equals(this.id, cashbookEntryInOut.id) &&
        Objects.equals(this.date, cashbookEntryInOut.date) &&
        Objects.equals(this.description, cashbookEntryInOut.description) &&
        Objects.equals(this.kind, cashbookEntryInOut.kind) &&
        Objects.equals(this.type, cashbookEntryInOut.type) &&
        Objects.equals(this.entityName, cashbookEntryInOut.entityName) &&
        Objects.equals(this.document, cashbookEntryInOut.document) &&
        Objects.equals(this.amountOut, cashbookEntryInOut.amountOut) &&
        Objects.equals(this.paymentAccountOut, cashbookEntryInOut.paymentAccountOut) &&
        Objects.equals(this.amountIn, cashbookEntryInOut.amountIn) &&
        Objects.equals(this.paymentAccountIn, cashbookEntryInOut.paymentAccountIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, description, kind, type, entityName, document, amountOut, paymentAccountOut, amountIn, paymentAccountIn);
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
    sb.append("class CashbookEntryInOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    amountOut: ").append(toIndentedString(amountOut)).append("\n");
    sb.append("    paymentAccountOut: ").append(toIndentedString(paymentAccountOut)).append("\n");
    sb.append("    amountIn: ").append(toIndentedString(amountIn)).append("\n");
    sb.append("    paymentAccountIn: ").append(toIndentedString(paymentAccountIn)).append("\n");
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

