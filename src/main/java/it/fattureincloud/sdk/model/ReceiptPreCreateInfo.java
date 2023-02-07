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
import com.google.gson.JsonArray;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-02-07T13:36:20.600Z[Etc/UTC]")
public class ReceiptPreCreateInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NUMERATIONS = "numerations";

  @SerializedName(SERIALIZED_NAME_NUMERATIONS)
  private Map<String, Map<String, Integer>> numerations = null;

  public static final String SERIALIZED_NAME_NUMERATIONS_LIST = "numerations_list";

  @SerializedName(SERIALIZED_NAME_NUMERATIONS_LIST)
  private List<String> numerationsList = null;

  public static final String SERIALIZED_NAME_RC_CENTERS_LIST = "rc_centers_list";

  @SerializedName(SERIALIZED_NAME_RC_CENTERS_LIST)
  private List<String> rcCentersList = null;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNTS_LIST = "payment_accounts_list";

  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNTS_LIST)
  private List<PaymentAccount> paymentAccountsList = null;

  public static final String SERIALIZED_NAME_CATEGORIES_LIST = "categories_list";

  @SerializedName(SERIALIZED_NAME_CATEGORIES_LIST)
  private List<String> categoriesList = null;

  public static final String SERIALIZED_NAME_VAT_TYPES_LIST = "vat_types_list";

  @SerializedName(SERIALIZED_NAME_VAT_TYPES_LIST)
  private List<VatType> vatTypesList = null;

  public ReceiptPreCreateInfo() {}

  public ReceiptPreCreateInfo numerations(Map<String, Map<String, Integer>> numerations) {

    this.numerations = numerations;
    return this;
  }

  public ReceiptPreCreateInfo putNumerationsItem(String key, Map<String, Integer> numerationsItem) {
    if (this.numerations == null) {
      this.numerations = new HashMap<>();
    }
    this.numerations.put(key, numerationsItem);
    return this;
  }

  /**
   * Get numerations
   *
   * @return numerations
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, Integer>> getNumerations() {
    return numerations;
  }

  public void setNumerations(Map<String, Map<String, Integer>> numerations) {
    this.numerations = numerations;
  }

  public ReceiptPreCreateInfo numerationsList(List<String> numerationsList) {

    this.numerationsList = numerationsList;
    return this;
  }

  public ReceiptPreCreateInfo addNumerationsListItem(String numerationsListItem) {
    if (this.numerationsList == null) {
      this.numerationsList = null;
    }
    this.numerationsList.add(numerationsListItem);
    return this;
  }

  /**
   * List of series used in the past.
   *
   * @return numerationsList
   */
  @javax.annotation.Nullable
  public List<String> getNumerationsList() {
    return numerationsList;
  }

  public void setNumerationsList(List<String> numerationsList) {
    this.numerationsList = numerationsList;
  }

  public ReceiptPreCreateInfo rcCentersList(List<String> rcCentersList) {

    this.rcCentersList = rcCentersList;
    return this;
  }

  public ReceiptPreCreateInfo addRcCentersListItem(String rcCentersListItem) {
    if (this.rcCentersList == null) {
      this.rcCentersList = null;
    }
    this.rcCentersList.add(rcCentersListItem);
    return this;
  }

  /**
   * List of revenue centers used in the past.
   *
   * @return rcCentersList
   */
  @javax.annotation.Nullable
  public List<String> getRcCentersList() {
    return rcCentersList;
  }

  public void setRcCentersList(List<String> rcCentersList) {
    this.rcCentersList = rcCentersList;
  }

  public ReceiptPreCreateInfo paymentAccountsList(List<PaymentAccount> paymentAccountsList) {

    this.paymentAccountsList = paymentAccountsList;
    return this;
  }

  public ReceiptPreCreateInfo addPaymentAccountsListItem(PaymentAccount paymentAccountsListItem) {
    if (this.paymentAccountsList == null) {
      this.paymentAccountsList = null;
    }
    this.paymentAccountsList.add(paymentAccountsListItem);
    return this;
  }

  /**
   * User payment accounts list.
   *
   * @return paymentAccountsList
   */
  @javax.annotation.Nullable
  public List<PaymentAccount> getPaymentAccountsList() {
    return paymentAccountsList;
  }

  public void setPaymentAccountsList(List<PaymentAccount> paymentAccountsList) {
    this.paymentAccountsList = paymentAccountsList;
  }

  public ReceiptPreCreateInfo categoriesList(List<String> categoriesList) {

    this.categoriesList = categoriesList;
    return this;
  }

  public ReceiptPreCreateInfo addCategoriesListItem(String categoriesListItem) {
    if (this.categoriesList == null) {
      this.categoriesList = null;
    }
    this.categoriesList.add(categoriesListItem);
    return this;
  }

  /**
   * List of categories used in the past.
   *
   * @return categoriesList
   */
  @javax.annotation.Nullable
  public List<String> getCategoriesList() {
    return categoriesList;
  }

  public void setCategoriesList(List<String> categoriesList) {
    this.categoriesList = categoriesList;
  }

  public ReceiptPreCreateInfo vatTypesList(List<VatType> vatTypesList) {

    this.vatTypesList = vatTypesList;
    return this;
  }

  public ReceiptPreCreateInfo addVatTypesListItem(VatType vatTypesListItem) {
    if (this.vatTypesList == null) {
      this.vatTypesList = null;
    }
    this.vatTypesList.add(vatTypesListItem);
    return this;
  }

  /**
   * List of user vat types with the default 22%, 10%, 4% and 0% vats.
   *
   * @return vatTypesList
   */
  @javax.annotation.Nullable
  public List<VatType> getVatTypesList() {
    return vatTypesList;
  }

  public void setVatTypesList(List<VatType> vatTypesList) {
    this.vatTypesList = vatTypesList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptPreCreateInfo receiptPreCreateInfo = (ReceiptPreCreateInfo) o;
    return Objects.equals(this.numerations, receiptPreCreateInfo.numerations)
        && Objects.equals(this.numerationsList, receiptPreCreateInfo.numerationsList)
        && Objects.equals(this.rcCentersList, receiptPreCreateInfo.rcCentersList)
        && Objects.equals(this.paymentAccountsList, receiptPreCreateInfo.paymentAccountsList)
        && Objects.equals(this.categoriesList, receiptPreCreateInfo.categoriesList)
        && Objects.equals(this.vatTypesList, receiptPreCreateInfo.vatTypesList);
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
        numerations,
        numerationsList,
        rcCentersList,
        paymentAccountsList,
        categoriesList,
        vatTypesList);
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
    sb.append("class ReceiptPreCreateInfo {\n");
    sb.append("    numerations: ").append(toIndentedString(numerations)).append("\n");
    sb.append("    numerationsList: ").append(toIndentedString(numerationsList)).append("\n");
    sb.append("    rcCentersList: ").append(toIndentedString(rcCentersList)).append("\n");
    sb.append("    paymentAccountsList: ")
        .append(toIndentedString(paymentAccountsList))
        .append("\n");
    sb.append("    categoriesList: ").append(toIndentedString(categoriesList)).append("\n");
    sb.append("    vatTypesList: ").append(toIndentedString(vatTypesList)).append("\n");
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
    openapiFields.add("numerations");
    openapiFields.add("numerations_list");
    openapiFields.add("rc_centers_list");
    openapiFields.add("payment_accounts_list");
    openapiFields.add("categories_list");
    openapiFields.add("vat_types_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to ReceiptPreCreateInfo
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (!ReceiptPreCreateInfo.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON object is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ReceiptPreCreateInfo is not found in the empty JSON string",
                ReceiptPreCreateInfo.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!ReceiptPreCreateInfo.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ReceiptPreCreateInfo` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("numerations_list") != null && !jsonObj.get("numerations_list").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `numerations_list` to be an array in the JSON string but got `%s`",
              jsonObj.get("numerations_list").toString()));
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("rc_centers_list") != null && !jsonObj.get("rc_centers_list").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `rc_centers_list` to be an array in the JSON string but got `%s`",
              jsonObj.get("rc_centers_list").toString()));
    }
    if (jsonObj.get("payment_accounts_list") != null
        && !jsonObj.get("payment_accounts_list").isJsonNull()) {
      JsonArray jsonArraypaymentAccountsList = jsonObj.getAsJsonArray("payment_accounts_list");
      if (jsonArraypaymentAccountsList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("payment_accounts_list").isJsonArray()) {
          throw new IllegalArgumentException(
              String.format(
                  "Expected the field `payment_accounts_list` to be an array in the JSON string but got `%s`",
                  jsonObj.get("payment_accounts_list").toString()));
        }

        // validate the optional field `payment_accounts_list` (array)
        for (int i = 0; i < jsonArraypaymentAccountsList.size(); i++) {
          PaymentAccount.validateJsonObject(jsonArraypaymentAccountsList.get(i).getAsJsonObject());
        }
        ;
      }
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("categories_list") != null && !jsonObj.get("categories_list").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `categories_list` to be an array in the JSON string but got `%s`",
              jsonObj.get("categories_list").toString()));
    }
    if (jsonObj.get("vat_types_list") != null && !jsonObj.get("vat_types_list").isJsonNull()) {
      JsonArray jsonArrayvatTypesList = jsonObj.getAsJsonArray("vat_types_list");
      if (jsonArrayvatTypesList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("vat_types_list").isJsonArray()) {
          throw new IllegalArgumentException(
              String.format(
                  "Expected the field `vat_types_list` to be an array in the JSON string but got `%s`",
                  jsonObj.get("vat_types_list").toString()));
        }

        // validate the optional field `vat_types_list` (array)
        for (int i = 0; i < jsonArrayvatTypesList.size(); i++) {
          VatType.validateJsonObject(jsonArrayvatTypesList.get(i).getAsJsonObject());
        }
        ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ReceiptPreCreateInfo.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ReceiptPreCreateInfo' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ReceiptPreCreateInfo> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ReceiptPreCreateInfo.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ReceiptPreCreateInfo>() {
            @Override
            public void write(JsonWriter out, ReceiptPreCreateInfo value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ReceiptPreCreateInfo read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ReceiptPreCreateInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReceiptPreCreateInfo
   * @throws IOException if the JSON string is invalid with respect to ReceiptPreCreateInfo
   */
  public static ReceiptPreCreateInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReceiptPreCreateInfo.class);
  }

  /**
   * Convert an instance of ReceiptPreCreateInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
