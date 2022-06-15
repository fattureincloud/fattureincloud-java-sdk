/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.18
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.fattureincloud.sdk.JSON;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@ApiModel(description = "")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-06-15T14:42:42.333969Z[Etc/UTC]")
public class Receipt {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DATE = "date";

  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_NUMBER = "number";

  @SerializedName(SERIALIZED_NAME_NUMBER)
  private BigDecimal number;

  public static final String SERIALIZED_NAME_NUMERATION = "numeration";

  @SerializedName(SERIALIZED_NAME_NUMERATION)
  private String numeration;

  public static final String SERIALIZED_NAME_AMOUNT_NET = "amount_net";

  @SerializedName(SERIALIZED_NAME_AMOUNT_NET)
  private BigDecimal amountNet;

  public static final String SERIALIZED_NAME_AMOUNT_VAT = "amount_vat";

  @SerializedName(SERIALIZED_NAME_AMOUNT_VAT)
  private BigDecimal amountVat;

  public static final String SERIALIZED_NAME_AMOUNT_GROSS = "amount_gross";

  @SerializedName(SERIALIZED_NAME_AMOUNT_GROSS)
  private BigDecimal amountGross;

  public static final String SERIALIZED_NAME_USE_GROSS_PRICES = "use_gross_prices";

  @SerializedName(SERIALIZED_NAME_USE_GROSS_PRICES)
  private Boolean useGrossPrices;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private ReceiptType type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RC_CENTER = "rc_center";

  @SerializedName(SERIALIZED_NAME_RC_CENTER)
  private String rcCenter;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";

  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";

  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT = "payment_account";

  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT)
  private PaymentAccount paymentAccount;

  public static final String SERIALIZED_NAME_ITEMS_LIST = "items_list";

  @SerializedName(SERIALIZED_NAME_ITEMS_LIST)
  private List<ReceiptItemsListItem> itemsList = null;

  public Receipt() {}

  public Receipt id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Receipt unique identifier.
   *
   * @return id
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Receipt unique identifier.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Receipt date(LocalDate date) {

    this.date = date;
    return this;
  }

  /**
   * Receipt date.
   *
   * @return date
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Receipt date.")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Receipt number(BigDecimal number) {

    this.number = number;
    return this;
  }

  /**
   * Receipt number.
   *
   * @return number
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Receipt number.")
  public BigDecimal getNumber() {
    return number;
  }

  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  public Receipt numeration(String numeration) {

    this.numeration = numeration;
    return this;
  }

  /**
   * If it&#39;s null or empty string use the default numeration.
   *
   * @return numeration
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If it's null or empty string use the default numeration.")
  public String getNumeration() {
    return numeration;
  }

  public void setNumeration(String numeration) {
    this.numeration = numeration;
  }

  public Receipt amountNet(BigDecimal amountNet) {

    this.amountNet = amountNet;
    return this;
  }

  /**
   * Total net amount.
   *
   * @return amountNet
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total net amount.")
  public BigDecimal getAmountNet() {
    return amountNet;
  }

  public void setAmountNet(BigDecimal amountNet) {
    this.amountNet = amountNet;
  }

  public Receipt amountVat(BigDecimal amountVat) {

    this.amountVat = amountVat;
    return this;
  }

  /**
   * Total vat amount.
   *
   * @return amountVat
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total vat amount.")
  public BigDecimal getAmountVat() {
    return amountVat;
  }

  public void setAmountVat(BigDecimal amountVat) {
    this.amountVat = amountVat;
  }

  public Receipt amountGross(BigDecimal amountGross) {

    this.amountGross = amountGross;
    return this;
  }

  /**
   * Total gross amount.
   *
   * @return amountGross
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total gross amount.")
  public BigDecimal getAmountGross() {
    return amountGross;
  }

  public void setAmountGross(BigDecimal amountGross) {
    this.amountGross = amountGross;
  }

  public Receipt useGrossPrices(Boolean useGrossPrices) {

    this.useGrossPrices = useGrossPrices;
    return this;
  }

  /**
   * Get useGrossPrices
   *
   * @return useGrossPrices
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getUseGrossPrices() {
    return useGrossPrices;
  }

  public void setUseGrossPrices(Boolean useGrossPrices) {
    this.useGrossPrices = useGrossPrices;
  }

  public Receipt type(ReceiptType type) {

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
  public ReceiptType getType() {
    return type;
  }

  public void setType(ReceiptType type) {
    this.type = type;
  }

  public Receipt description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Receipt description.
   *
   * @return description
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Receipt description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Receipt rcCenter(String rcCenter) {

    this.rcCenter = rcCenter;
    return this;
  }

  /**
   * Revenue center.
   *
   * @return rcCenter
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Revenue center.")
  public String getRcCenter() {
    return rcCenter;
  }

  public void setRcCenter(String rcCenter) {
    this.rcCenter = rcCenter;
  }

  public Receipt createdAt(String createdAt) {

    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   *
   * @return createdAt
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Receipt updatedAt(String updatedAt) {

    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   *
   * @return updatedAt
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Receipt paymentAccount(PaymentAccount paymentAccount) {

    this.paymentAccount = paymentAccount;
    return this;
  }

  /**
   * Get paymentAccount
   *
   * @return paymentAccount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public PaymentAccount getPaymentAccount() {
    return paymentAccount;
  }

  public void setPaymentAccount(PaymentAccount paymentAccount) {
    this.paymentAccount = paymentAccount;
  }

  public Receipt itemsList(List<ReceiptItemsListItem> itemsList) {

    this.itemsList = itemsList;
    return this;
  }

  public Receipt addItemsListItem(ReceiptItemsListItem itemsListItem) {
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
  @ApiModelProperty(value = "")
  public List<ReceiptItemsListItem> getItemsList() {
    return itemsList;
  }

  public void setItemsList(List<ReceiptItemsListItem> itemsList) {
    this.itemsList = itemsList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Receipt receipt = (Receipt) o;
    return Objects.equals(this.id, receipt.id)
        && Objects.equals(this.date, receipt.date)
        && Objects.equals(this.number, receipt.number)
        && Objects.equals(this.numeration, receipt.numeration)
        && Objects.equals(this.amountNet, receipt.amountNet)
        && Objects.equals(this.amountVat, receipt.amountVat)
        && Objects.equals(this.amountGross, receipt.amountGross)
        && Objects.equals(this.useGrossPrices, receipt.useGrossPrices)
        && Objects.equals(this.type, receipt.type)
        && Objects.equals(this.description, receipt.description)
        && Objects.equals(this.rcCenter, receipt.rcCenter)
        && Objects.equals(this.createdAt, receipt.createdAt)
        && Objects.equals(this.updatedAt, receipt.updatedAt)
        && Objects.equals(this.paymentAccount, receipt.paymentAccount)
        && Objects.equals(this.itemsList, receipt.itemsList);
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
        number,
        numeration,
        amountNet,
        amountVat,
        amountGross,
        useGrossPrices,
        type,
        description,
        rcCenter,
        createdAt,
        updatedAt,
        paymentAccount,
        itemsList);
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
    sb.append("class Receipt {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numeration: ").append(toIndentedString(numeration)).append("\n");
    sb.append("    amountNet: ").append(toIndentedString(amountNet)).append("\n");
    sb.append("    amountVat: ").append(toIndentedString(amountVat)).append("\n");
    sb.append("    amountGross: ").append(toIndentedString(amountGross)).append("\n");
    sb.append("    useGrossPrices: ").append(toIndentedString(useGrossPrices)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rcCenter: ").append(toIndentedString(rcCenter)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    paymentAccount: ").append(toIndentedString(paymentAccount)).append("\n");
    sb.append("    itemsList: ").append(toIndentedString(itemsList)).append("\n");
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
    openapiFields.add("number");
    openapiFields.add("numeration");
    openapiFields.add("amount_net");
    openapiFields.add("amount_vat");
    openapiFields.add("amount_gross");
    openapiFields.add("use_gross_prices");
    openapiFields.add("type");
    openapiFields.add("description");
    openapiFields.add("rc_center");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("payment_account");
    openapiFields.add("items_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to Receipt
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (Receipt.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in Receipt is not found in the empty JSON string",
                Receipt.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!Receipt.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `Receipt` properties."
                    + " JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("numeration") != null && jsonObj.get("numeration").isJsonNull())
        && !jsonObj.get("numeration").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `numeration` to be a primitive type in the JSON string but got"
                  + " `%s`",
              jsonObj.get("numeration").toString()));
    }
    if ((jsonObj.get("description") != null && jsonObj.get("description").isJsonNull())
        && !jsonObj.get("description").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `description` to be a primitive type in the JSON string but got"
                  + " `%s`",
              jsonObj.get("description").toString()));
    }
    if ((jsonObj.get("rc_center") != null && jsonObj.get("rc_center").isJsonNull())
        && !jsonObj.get("rc_center").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `rc_center` to be a primitive type in the JSON string but got"
                  + " `%s`",
              jsonObj.get("rc_center").toString()));
    }
    if ((jsonObj.get("created_at") != null && jsonObj.get("created_at").isJsonNull())
        && !jsonObj.get("created_at").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `created_at` to be a primitive type in the JSON string but got"
                  + " `%s`",
              jsonObj.get("created_at").toString()));
    }
    if ((jsonObj.get("updated_at") != null && jsonObj.get("updated_at").isJsonNull())
        && !jsonObj.get("updated_at").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `updated_at` to be a primitive type in the JSON string but got"
                  + " `%s`",
              jsonObj.get("updated_at").toString()));
    }
    // validate the optional field `payment_account`
    if (jsonObj.getAsJsonObject("payment_account") != null) {
      PaymentAccount.validateJsonObject(jsonObj.getAsJsonObject("payment_account"));
    }
    JsonArray jsonArrayitemsList = jsonObj.getAsJsonArray("items_list");
    if (jsonArrayitemsList != null) {
      // ensure the json data is an array
      if (!jsonObj.get("items_list").isJsonArray()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `items_list` to be an array in the JSON string but got `%s`",
                jsonObj.get("items_list").toString()));
      }

      // validate the optional field `items_list` (array)
      for (int i = 0; i < jsonArrayitemsList.size(); i++) {
        ReceiptItemsListItem.validateJsonObject(jsonArrayitemsList.get(i).getAsJsonObject());
      }
      ;
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!Receipt.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'Receipt' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<Receipt> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(Receipt.class));

      return (TypeAdapter<T>)
          new TypeAdapter<Receipt>() {
            @Override
            public void write(JsonWriter out, Receipt value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public Receipt read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of Receipt given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Receipt
   * @throws IOException if the JSON string is invalid with respect to Receipt
   */
  public static Receipt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Receipt.class);
  }

  /**
   * Convert an instance of Receipt to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
