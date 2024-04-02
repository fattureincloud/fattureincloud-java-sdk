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

/** IssuedDocumentPaymentsListItem */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-04-02T08:46:44.590061Z[Etc/UTC]",
    comments = "Generator version: 7.4.0")
public class IssuedDocumentPaymentsListItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";

  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private LocalDate dueDate;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";

  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private IssuedDocumentStatus status = IssuedDocumentStatus.NOT_PAID;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT = "payment_account";

  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT)
  private PaymentAccount paymentAccount;

  public static final String SERIALIZED_NAME_PAID_DATE = "paid_date";

  @SerializedName(SERIALIZED_NAME_PAID_DATE)
  private LocalDate paidDate;

  public static final String SERIALIZED_NAME_EI_RAW = "ei_raw";

  @SerializedName(SERIALIZED_NAME_EI_RAW)
  private Object eiRaw;

  public static final String SERIALIZED_NAME_PAYMENT_TERMS = "payment_terms";

  @SerializedName(SERIALIZED_NAME_PAYMENT_TERMS)
  private IssuedDocumentPaymentsListItemPaymentTerms paymentTerms;

  public IssuedDocumentPaymentsListItem() {}

  public IssuedDocumentPaymentsListItem id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Issued document payment item id
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

  public IssuedDocumentPaymentsListItem dueDate(LocalDate dueDate) {

    this.dueDate = dueDate;
    return this;
  }

  /**
   * Issued document payment due date
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

  public IssuedDocumentPaymentsListItem amount(BigDecimal amount) {

    this.amount = amount;
    return this;
  }

  /**
   * Issued document payment amount
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

  public IssuedDocumentPaymentsListItem status(IssuedDocumentStatus status) {

    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @javax.annotation.Nullable
  public IssuedDocumentStatus getStatus() {
    return status;
  }

  public void setStatus(IssuedDocumentStatus status) {
    this.status = status;
  }

  public IssuedDocumentPaymentsListItem paymentAccount(PaymentAccount paymentAccount) {

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

  public IssuedDocumentPaymentsListItem paidDate(LocalDate paidDate) {

    this.paidDate = paidDate;
    return this;
  }

  /**
   * Issued document payment date [Only if status is paid]
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

  public IssuedDocumentPaymentsListItem eiRaw(Object eiRaw) {

    this.eiRaw = eiRaw;
    return this;
  }

  /**
   * Issued document payment advanced raw attributes for e-invoices
   *
   * @return eiRaw
   */
  @javax.annotation.Nullable
  public Object getEiRaw() {
    return eiRaw;
  }

  public void setEiRaw(Object eiRaw) {
    this.eiRaw = eiRaw;
  }

  public IssuedDocumentPaymentsListItem paymentTerms(
      IssuedDocumentPaymentsListItemPaymentTerms paymentTerms) {

    this.paymentTerms = paymentTerms;
    return this;
  }

  /**
   * Get paymentTerms
   *
   * @return paymentTerms
   */
  @javax.annotation.Nullable
  public IssuedDocumentPaymentsListItemPaymentTerms getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(IssuedDocumentPaymentsListItemPaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentPaymentsListItem issuedDocumentPaymentsListItem =
        (IssuedDocumentPaymentsListItem) o;
    return Objects.equals(this.id, issuedDocumentPaymentsListItem.id)
        && Objects.equals(this.dueDate, issuedDocumentPaymentsListItem.dueDate)
        && Objects.equals(this.amount, issuedDocumentPaymentsListItem.amount)
        && Objects.equals(this.status, issuedDocumentPaymentsListItem.status)
        && Objects.equals(this.paymentAccount, issuedDocumentPaymentsListItem.paymentAccount)
        && Objects.equals(this.paidDate, issuedDocumentPaymentsListItem.paidDate)
        && Objects.equals(this.eiRaw, issuedDocumentPaymentsListItem.eiRaw)
        && Objects.equals(this.paymentTerms, issuedDocumentPaymentsListItem.paymentTerms);
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
    return Objects.hash(id, dueDate, amount, status, paymentAccount, paidDate, eiRaw, paymentTerms);
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
    sb.append("class IssuedDocumentPaymentsListItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentAccount: ").append(toIndentedString(paymentAccount)).append("\n");
    sb.append("    paidDate: ").append(toIndentedString(paidDate)).append("\n");
    sb.append("    eiRaw: ").append(toIndentedString(eiRaw)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
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
