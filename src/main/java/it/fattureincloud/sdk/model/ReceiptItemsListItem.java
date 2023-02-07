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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReceiptItemsListItem */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-02-07T13:36:20.600Z[Etc/UTC]")
public class ReceiptItemsListItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_AMOUNT_NET = "amount_net";

  @SerializedName(SERIALIZED_NAME_AMOUNT_NET)
  private BigDecimal amountNet;

  public static final String SERIALIZED_NAME_AMOUNT_GROSS = "amount_gross";

  @SerializedName(SERIALIZED_NAME_AMOUNT_GROSS)
  private BigDecimal amountGross;

  public static final String SERIALIZED_NAME_CATEGORY = "category";

  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_VAT = "vat";

  @SerializedName(SERIALIZED_NAME_VAT)
  private VatType vat;

  public ReceiptItemsListItem() {}

  public ReceiptItemsListItem id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Item unique identifier.
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

  public ReceiptItemsListItem amountNet(BigDecimal amountNet) {

    this.amountNet = amountNet;
    return this;
  }

  /**
   * Item total net amount.
   *
   * @return amountNet
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountNet() {
    return amountNet;
  }

  public void setAmountNet(BigDecimal amountNet) {
    this.amountNet = amountNet;
  }

  public ReceiptItemsListItem amountGross(BigDecimal amountGross) {

    this.amountGross = amountGross;
    return this;
  }

  /**
   * Item total gross amount.
   *
   * @return amountGross
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountGross() {
    return amountGross;
  }

  public void setAmountGross(BigDecimal amountGross) {
    this.amountGross = amountGross;
  }

  public ReceiptItemsListItem category(String category) {

    this.category = category;
    return this;
  }

  /**
   * Item category.
   *
   * @return category
   */
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ReceiptItemsListItem vat(VatType vat) {

    this.vat = vat;
    return this;
  }

  /**
   * Get vat
   *
   * @return vat
   */
  @javax.annotation.Nullable
  public VatType getVat() {
    return vat;
  }

  public void setVat(VatType vat) {
    this.vat = vat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptItemsListItem receiptItemsListItem = (ReceiptItemsListItem) o;
    return Objects.equals(this.id, receiptItemsListItem.id)
        && Objects.equals(this.amountNet, receiptItemsListItem.amountNet)
        && Objects.equals(this.amountGross, receiptItemsListItem.amountGross)
        && Objects.equals(this.category, receiptItemsListItem.category)
        && Objects.equals(this.vat, receiptItemsListItem.vat);
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
    return Objects.hash(id, amountNet, amountGross, category, vat);
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
    sb.append("class ReceiptItemsListItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amountNet: ").append(toIndentedString(amountNet)).append("\n");
    sb.append("    amountGross: ").append(toIndentedString(amountGross)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
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
    openapiFields.add("amount_net");
    openapiFields.add("amount_gross");
    openapiFields.add("category");
    openapiFields.add("vat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to ReceiptItemsListItem
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (!ReceiptItemsListItem.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON object is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ReceiptItemsListItem is not found in the empty JSON string",
                ReceiptItemsListItem.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!ReceiptItemsListItem.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ReceiptItemsListItem` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull())
        && !jsonObj.get("category").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `category` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("category").toString()));
    }
    // validate the optional field `vat`
    if (jsonObj.get("vat") != null && !jsonObj.get("vat").isJsonNull()) {
      VatType.validateJsonObject(jsonObj.getAsJsonObject("vat"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ReceiptItemsListItem.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ReceiptItemsListItem' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ReceiptItemsListItem> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ReceiptItemsListItem.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ReceiptItemsListItem>() {
            @Override
            public void write(JsonWriter out, ReceiptItemsListItem value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ReceiptItemsListItem read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ReceiptItemsListItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReceiptItemsListItem
   * @throws IOException if the JSON string is invalid with respect to ReceiptItemsListItem
   */
  public static ReceiptItemsListItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReceiptItemsListItem.class);
  }

  /**
   * Convert an instance of ReceiptItemsListItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
