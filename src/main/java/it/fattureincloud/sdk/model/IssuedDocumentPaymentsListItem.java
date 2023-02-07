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
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** IssuedDocumentPaymentsListItem */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-02-07T13:36:20.600Z[Etc/UTC]")
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
   * Unique identifier.
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
   * Due date.
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
   * Payment amount.
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
   * Payment date. [Only if status is paid]
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
   * Advanced raw attributes for e-invoices.
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

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("due_date");
    openapiFields.add("amount");
    openapiFields.add("status");
    openapiFields.add("payment_account");
    openapiFields.add("paid_date");
    openapiFields.add("ei_raw");
    openapiFields.add("payment_terms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to
   *     IssuedDocumentPaymentsListItem
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (!IssuedDocumentPaymentsListItem.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON object is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in IssuedDocumentPaymentsListItem is not found in the empty JSON string",
                IssuedDocumentPaymentsListItem.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!IssuedDocumentPaymentsListItem.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `IssuedDocumentPaymentsListItem` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // validate the optional field `payment_account`
    if (jsonObj.get("payment_account") != null && !jsonObj.get("payment_account").isJsonNull()) {
      PaymentAccount.validateJsonObject(jsonObj.getAsJsonObject("payment_account"));
    }
    // validate the optional field `payment_terms`
    if (jsonObj.get("payment_terms") != null && !jsonObj.get("payment_terms").isJsonNull()) {
      IssuedDocumentPaymentsListItemPaymentTerms.validateJsonObject(
          jsonObj.getAsJsonObject("payment_terms"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!IssuedDocumentPaymentsListItem.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'IssuedDocumentPaymentsListItem' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<IssuedDocumentPaymentsListItem> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(IssuedDocumentPaymentsListItem.class));

      return (TypeAdapter<T>)
          new TypeAdapter<IssuedDocumentPaymentsListItem>() {
            @Override
            public void write(JsonWriter out, IssuedDocumentPaymentsListItem value)
                throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public IssuedDocumentPaymentsListItem read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of IssuedDocumentPaymentsListItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssuedDocumentPaymentsListItem
   * @throws IOException if the JSON string is invalid with respect to
   *     IssuedDocumentPaymentsListItem
   */
  public static IssuedDocumentPaymentsListItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssuedDocumentPaymentsListItem.class);
  }

  /**
   * Convert an instance of IssuedDocumentPaymentsListItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
