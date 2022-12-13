/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.24
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
import io.swagger.annotations.ApiModelProperty;
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

/** CashbookEntry */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-13T15:06:28.671Z[Etc/UTC]")
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
   * Cashbook unique identifier.
   *
   * @return id
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cashbook unique identifier.")
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
   * Cashbook date.
   *
   * @return date
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cashbook date.")
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
   * Cashbook description.
   *
   * @return description
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cashbook description.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
   * Entity name.
   *
   * @return entityName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Entity name.")
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
  @ApiModelProperty(value = "")
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
   * [Only for cashbook entry in] Total amount in.
   *
   * @return amountIn
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Only for cashbook entry in] Total amount in.")
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
  @ApiModelProperty(value = "")
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
   * [Only for cashbook entry out] Total amount out.
   *
   * @return amountOut
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Only for cashbook entry out] Total amount out.")
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
  @ApiModelProperty(value = "")
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

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("date");
    openapiFields.add("description");
    openapiFields.add("kind");
    openapiFields.add("type");
    openapiFields.add("entity_name");
    openapiFields.add("document");
    openapiFields.add("amount_in");
    openapiFields.add("payment_account_in");
    openapiFields.add("amount_out");
    openapiFields.add("payment_account_out");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to CashbookEntry
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (CashbookEntry.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in CashbookEntry is not found in the empty JSON string",
                CashbookEntry.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!CashbookEntry.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `CashbookEntry` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull())
        && !jsonObj.get("id").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `id` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("id").toString()));
    }
    if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
        && !jsonObj.get("description").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `description` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("description").toString()));
    }
    if ((jsonObj.get("entity_name") != null && !jsonObj.get("entity_name").isJsonNull())
        && !jsonObj.get("entity_name").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `entity_name` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("entity_name").toString()));
    }
    // validate the optional field `document`
    if ((jsonObj.get("document") != null && !jsonObj.get("document").isJsonNull())
        && !jsonObj.get("document").isJsonPrimitive()) {
      CashbookEntryDocument.validateJsonObject(jsonObj.getAsJsonObject("document"));
    }
    // validate the optional field `payment_account_in`
    if ((jsonObj.get("payment_account_in") != null
            && !jsonObj.get("payment_account_in").isJsonNull())
        && !jsonObj.get("payment_account_in").isJsonPrimitive()) {
      PaymentAccount.validateJsonObject(jsonObj.getAsJsonObject("payment_account_in"));
    }
    // validate the optional field `payment_account_out`
    if ((jsonObj.get("payment_account_out") != null
            && !jsonObj.get("payment_account_out").isJsonNull())
        && !jsonObj.get("payment_account_out").isJsonPrimitive()) {
      PaymentAccount.validateJsonObject(jsonObj.getAsJsonObject("payment_account_out"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!CashbookEntry.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'CashbookEntry' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<CashbookEntry> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(CashbookEntry.class));

      return (TypeAdapter<T>)
          new TypeAdapter<CashbookEntry>() {
            @Override
            public void write(JsonWriter out, CashbookEntry value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public CashbookEntry read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of CashbookEntry given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CashbookEntry
   * @throws IOException if the JSON string is invalid with respect to CashbookEntry
   */
  public static CashbookEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CashbookEntry.class);
  }

  /**
   * Convert an instance of CashbookEntry to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
