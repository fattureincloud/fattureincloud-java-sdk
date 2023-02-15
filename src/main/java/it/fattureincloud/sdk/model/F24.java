/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.26
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

/** F24 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-02-13T13:42:26.512Z[Etc/UTC]")
public class F24 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";

  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private LocalDate dueDate;

  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private F24Status status;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT = "payment_account";

  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT)
  private PaymentAccount paymentAccount;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";

  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_ATTACHMENT_URL = "attachment_url";

  @SerializedName(SERIALIZED_NAME_ATTACHMENT_URL)
  private String attachmentUrl;

  public static final String SERIALIZED_NAME_ATTACHMENT_TOKEN = "attachment_token";

  @SerializedName(SERIALIZED_NAME_ATTACHMENT_TOKEN)
  private String attachmentToken;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public F24() {}

  public F24(String attachmentUrl) {
    this();
    this.attachmentUrl = attachmentUrl;
  }

  public F24 id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Unique F24 identifier.
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

  public F24 dueDate(LocalDate dueDate) {

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

  public F24 status(F24Status status) {

    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @javax.annotation.Nullable
  public F24Status getStatus() {
    return status;
  }

  public void setStatus(F24Status status) {
    this.status = status;
  }

  public F24 paymentAccount(PaymentAccount paymentAccount) {

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

  public F24 amount(BigDecimal amount) {

    this.amount = amount;
    return this;
  }

  /**
   * Taxes amount.
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

  /**
   * [Temporary] [Read Only] Absolute url of the attached file. Authomatically set if a valid
   * attachment token is passed via POST /taxes or PUT /taxes/{documentId}.
   *
   * @return attachmentUrl
   */
  @javax.annotation.Nullable
  public String getAttachmentUrl() {
    return attachmentUrl;
  }

  public F24 attachmentToken(String attachmentToken) {

    this.attachmentToken = attachmentToken;
    return this;
  }

  /**
   * [Write Only] Attachment token returned by POST /taxes/attachment. Used to attach the file
   * already uploaded.
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

  public F24 description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Name or brief description.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    F24 F24 = (F24) o;
    return Objects.equals(this.id, F24.id)
        && Objects.equals(this.dueDate, F24.dueDate)
        && Objects.equals(this.status, F24.status)
        && Objects.equals(this.paymentAccount, F24.paymentAccount)
        && Objects.equals(this.amount, F24.amount)
        && Objects.equals(this.attachmentUrl, F24.attachmentUrl)
        && Objects.equals(this.attachmentToken, F24.attachmentToken)
        && Objects.equals(this.description, F24.description);
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
        id, dueDate, status, paymentAccount, amount, attachmentUrl, attachmentToken, description);
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
    sb.append("class F24 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentAccount: ").append(toIndentedString(paymentAccount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    attachmentUrl: ").append(toIndentedString(attachmentUrl)).append("\n");
    sb.append("    attachmentToken: ").append(toIndentedString(attachmentToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("payment_account");
    openapiFields.add("amount");
    openapiFields.add("attachment_url");
    openapiFields.add("attachment_token");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to F24
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (!F24.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in F24 is not found in the empty JSON string",
                F24.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!F24.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `F24` properties. JSON:"
                    + " %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // validate the optional field `payment_account`
    if (jsonObj.get("payment_account") != null && !jsonObj.get("payment_account").isJsonNull()) {
      PaymentAccount.validateJsonObject(jsonObj.getAsJsonObject("payment_account"));
    }
    if ((jsonObj.get("attachment_url") != null && !jsonObj.get("attachment_url").isJsonNull())
        && !jsonObj.get("attachment_url").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `attachment_url` to be a primitive type in the JSON string but"
                  + " got `%s`",
              jsonObj.get("attachment_url").toString()));
    }
    if ((jsonObj.get("attachment_token") != null && !jsonObj.get("attachment_token").isJsonNull())
        && !jsonObj.get("attachment_token").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `attachment_token` to be a primitive type in the JSON string but"
                  + " got `%s`",
              jsonObj.get("attachment_token").toString()));
    }
    if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
        && !jsonObj.get("description").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `description` to be a primitive type in the JSON string but got"
                  + " `%s`",
              jsonObj.get("description").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!F24.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'F24' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<F24> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(F24.class));

      return (TypeAdapter<T>)
          new TypeAdapter<F24>() {
            @Override
            public void write(JsonWriter out, F24 value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public F24 read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of F24 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of F24
   * @throws IOException if the JSON string is invalid with respect to F24
   */
  public static F24 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, F24.class);
  }

  /**
   * Convert an instance of F24 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
