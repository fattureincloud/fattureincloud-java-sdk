/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.9
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
import it.fattureincloud.sdk.model.PaymentAccount;
import it.fattureincloud.sdk.model.ReceivedDocumentPaymentTerms;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

/**
 * ReceivedDocumentPaymentsList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-24T15:38:03.260Z[Etc/UTC]")
public class ReceivedDocumentPaymentsList implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private LocalDate dueDate;

  public static final String SERIALIZED_NAME_PAID_DATE = "paid_date";
  @SerializedName(SERIALIZED_NAME_PAID_DATE)
  private LocalDate paidDate;

  public static final String SERIALIZED_NAME_PAYMENT_TERMS = "payment_terms";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TERMS)
  private ReceivedDocumentPaymentTerms paymentTerms;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT = "payment_account";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT)
  private PaymentAccount paymentAccount;

  public ReceivedDocumentPaymentsList() { 
  }

  public ReceivedDocumentPaymentsList id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ReceivedDocumentPaymentsList amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount of items.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of items.")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public ReceivedDocumentPaymentsList dueDate(LocalDate dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Due date
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Due date")

  public LocalDate getDueDate() {
    return dueDate;
  }


  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }


  public ReceivedDocumentPaymentsList paidDate(LocalDate paidDate) {
    
    this.paidDate = paidDate;
    return this;
  }

   /**
   * Paid date
   * @return paidDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Paid date")

  public LocalDate getPaidDate() {
    return paidDate;
  }


  public void setPaidDate(LocalDate paidDate) {
    this.paidDate = paidDate;
  }


  public ReceivedDocumentPaymentsList paymentTerms(ReceivedDocumentPaymentTerms paymentTerms) {
    
    this.paymentTerms = paymentTerms;
    return this;
  }

   /**
   * Get paymentTerms
   * @return paymentTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReceivedDocumentPaymentTerms getPaymentTerms() {
    return paymentTerms;
  }


  public void setPaymentTerms(ReceivedDocumentPaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
  }


  public ReceivedDocumentPaymentsList status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Payment status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment status.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ReceivedDocumentPaymentsList paymentAccount(PaymentAccount paymentAccount) {
    
    this.paymentAccount = paymentAccount;
    return this;
  }

   /**
   * Get paymentAccount
   * @return paymentAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentAccount getPaymentAccount() {
    return paymentAccount;
  }


  public void setPaymentAccount(PaymentAccount paymentAccount) {
    this.paymentAccount = paymentAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivedDocumentPaymentsList receivedDocumentPaymentsList = (ReceivedDocumentPaymentsList) o;
    return Objects.equals(this.id, receivedDocumentPaymentsList.id) &&
        Objects.equals(this.amount, receivedDocumentPaymentsList.amount) &&
        Objects.equals(this.dueDate, receivedDocumentPaymentsList.dueDate) &&
        Objects.equals(this.paidDate, receivedDocumentPaymentsList.paidDate) &&
        Objects.equals(this.paymentTerms, receivedDocumentPaymentsList.paymentTerms) &&
        Objects.equals(this.status, receivedDocumentPaymentsList.status) &&
        Objects.equals(this.paymentAccount, receivedDocumentPaymentsList.paymentAccount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, dueDate, paidDate, paymentTerms, status, paymentAccount);
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
    sb.append("class ReceivedDocumentPaymentsList {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    paidDate: ").append(toIndentedString(paidDate)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentAccount: ").append(toIndentedString(paymentAccount)).append("\n");
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

