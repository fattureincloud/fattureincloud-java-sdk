/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.32
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

/** ReceivedDocumentPaymentsListItem */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-04-02T08:46:44.590061Z[Etc/UTC]",
    comments = "Generator version: 7.4.0")
public class ReceivedDocumentPaymentsListItem implements Serializable {
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
  private ReceivedDocumentPaymentsListItemPaymentTerms paymentTerms;

  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT = "payment_account";

  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT)
  private PaymentAccount paymentAccount;

  public ReceivedDocumentPaymentsListItem() {}

  public ReceivedDocumentPaymentsListItem id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Received document payment id
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

  public ReceivedDocumentPaymentsListItem amount(BigDecimal amount) {

    this.amount = amount;
    return this;
  }

  /**
   * Received document payment total amount
   *
   * @return amount
   */
  @javax.annotation.Nullable
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public ReceivedDocumentPaymentsListItem dueDate(LocalDate dueDate) {

    this.dueDate = dueDate;
    return this;
  }

  /**
   * Due date
   *
   * @return dueDate
   */
  @javax.annotation.Nullable
  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public ReceivedDocumentPaymentsListItem paidDate(LocalDate paidDate) {

    this.paidDate = paidDate;
    return this;
  }

  /**
   * Received document payment paid date
   *
   * @return paidDate
   */
  @javax.annotation.Nullable
  public LocalDate getPaidDate() {
    return paidDate;
  }

  public void setPaidDate(LocalDate paidDate) {
    this.paidDate = paidDate;
  }

  public ReceivedDocumentPaymentsListItem paymentTerms(
      ReceivedDocumentPaymentsListItemPaymentTerms paymentTerms) {

    this.paymentTerms = paymentTerms;
    return this;
  }

  /**
   * Get paymentTerms
   *
   * @return paymentTerms
   */
  @javax.annotation.Nullable
  public ReceivedDocumentPaymentsListItemPaymentTerms getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(ReceivedDocumentPaymentsListItemPaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public ReceivedDocumentPaymentsListItem status(String status) {

    this.status = status;
    return this;
  }

  /**
   * Received document payment status
   *
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ReceivedDocumentPaymentsListItem paymentAccount(PaymentAccount paymentAccount) {

    this.paymentAccount = paymentAccount;
    return this;
  }

  /**
   * Get paymentAccount
   *
   * @return paymentAccount
   */
  @javax.annotation.Nullable
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
    ReceivedDocumentPaymentsListItem receivedDocumentPaymentsListItem =
        (ReceivedDocumentPaymentsListItem) o;
    return Objects.equals(this.id, receivedDocumentPaymentsListItem.id)
        && Objects.equals(this.amount, receivedDocumentPaymentsListItem.amount)
        && Objects.equals(this.dueDate, receivedDocumentPaymentsListItem.dueDate)
        && Objects.equals(this.paidDate, receivedDocumentPaymentsListItem.paidDate)
        && Objects.equals(this.paymentTerms, receivedDocumentPaymentsListItem.paymentTerms)
        && Objects.equals(this.status, receivedDocumentPaymentsListItem.status)
        && Objects.equals(this.paymentAccount, receivedDocumentPaymentsListItem.paymentAccount);
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
    return Objects.hash(id, amount, dueDate, paidDate, paymentTerms, status, paymentAccount);
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
    sb.append("class ReceivedDocumentPaymentsListItem {\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
