/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.19
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
import java.io.Serializable;
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
    date = "2022-07-18T14:57:32.905Z[Etc/UTC]")
public class ReceivedDocumentInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DEFAULT_VALUES = "default_values";

  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUES)
  private ReceivedDocumentInfoDefaultValues defaultValues;

  public static final String SERIALIZED_NAME_ITEMS_DEFAULT_VALUES = "items_default_values";

  @SerializedName(SERIALIZED_NAME_ITEMS_DEFAULT_VALUES)
  private ReceivedDocumentInfoItemsDefaultValues itemsDefaultValues;

  public static final String SERIALIZED_NAME_COUNTRIES_LIST = "countries_list";

  @SerializedName(SERIALIZED_NAME_COUNTRIES_LIST)
  private List<String> countriesList = null;

  public static final String SERIALIZED_NAME_CURRENCIES_LIST = "currencies_list";

  @SerializedName(SERIALIZED_NAME_CURRENCIES_LIST)
  private List<Currency> currenciesList = null;

  public static final String SERIALIZED_NAME_CATEGORIES_LIST = "categories_list";

  @SerializedName(SERIALIZED_NAME_CATEGORIES_LIST)
  private List<String> categoriesList = null;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNTS_LIST = "payment_accounts_list";

  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNTS_LIST)
  private List<PaymentAccount> paymentAccountsList = null;

  public static final String SERIALIZED_NAME_VAT_TYPES_LIST = "vat_types_list";

  @SerializedName(SERIALIZED_NAME_VAT_TYPES_LIST)
  private List<VatType> vatTypesList = null;

  public ReceivedDocumentInfo() {}

  public ReceivedDocumentInfo defaultValues(ReceivedDocumentInfoDefaultValues defaultValues) {

    this.defaultValues = defaultValues;
    return this;
  }

  /**
   * Get defaultValues
   *
   * @return defaultValues
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ReceivedDocumentInfoDefaultValues getDefaultValues() {
    return defaultValues;
  }

  public void setDefaultValues(ReceivedDocumentInfoDefaultValues defaultValues) {
    this.defaultValues = defaultValues;
  }

  public ReceivedDocumentInfo itemsDefaultValues(
      ReceivedDocumentInfoItemsDefaultValues itemsDefaultValues) {

    this.itemsDefaultValues = itemsDefaultValues;
    return this;
  }

  /**
   * Get itemsDefaultValues
   *
   * @return itemsDefaultValues
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ReceivedDocumentInfoItemsDefaultValues getItemsDefaultValues() {
    return itemsDefaultValues;
  }

  public void setItemsDefaultValues(ReceivedDocumentInfoItemsDefaultValues itemsDefaultValues) {
    this.itemsDefaultValues = itemsDefaultValues;
  }

  public ReceivedDocumentInfo countriesList(List<String> countriesList) {

    this.countriesList = countriesList;
    return this;
  }

  public ReceivedDocumentInfo addCountriesListItem(String countriesListItem) {
    if (this.countriesList == null) {
      this.countriesList = new ArrayList<>();
    }
    this.countriesList.add(countriesListItem);
    return this;
  }

  /**
   * Get countriesList
   *
   * @return countriesList
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<String> getCountriesList() {
    return countriesList;
  }

  public void setCountriesList(List<String> countriesList) {
    this.countriesList = countriesList;
  }

  public ReceivedDocumentInfo currenciesList(List<Currency> currenciesList) {

    this.currenciesList = currenciesList;
    return this;
  }

  public ReceivedDocumentInfo addCurrenciesListItem(Currency currenciesListItem) {
    if (this.currenciesList == null) {
      this.currenciesList = new ArrayList<>();
    }
    this.currenciesList.add(currenciesListItem);
    return this;
  }

  /**
   * Get currenciesList
   *
   * @return currenciesList
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<Currency> getCurrenciesList() {
    return currenciesList;
  }

  public void setCurrenciesList(List<Currency> currenciesList) {
    this.currenciesList = currenciesList;
  }

  public ReceivedDocumentInfo categoriesList(List<String> categoriesList) {

    this.categoriesList = categoriesList;
    return this;
  }

  public ReceivedDocumentInfo addCategoriesListItem(String categoriesListItem) {
    if (this.categoriesList == null) {
      this.categoriesList = new ArrayList<>();
    }
    this.categoriesList.add(categoriesListItem);
    return this;
  }

  /**
   * Get categoriesList
   *
   * @return categoriesList
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<String> getCategoriesList() {
    return categoriesList;
  }

  public void setCategoriesList(List<String> categoriesList) {
    this.categoriesList = categoriesList;
  }

  public ReceivedDocumentInfo paymentAccountsList(List<PaymentAccount> paymentAccountsList) {

    this.paymentAccountsList = paymentAccountsList;
    return this;
  }

  public ReceivedDocumentInfo addPaymentAccountsListItem(PaymentAccount paymentAccountsListItem) {
    if (this.paymentAccountsList == null) {
      this.paymentAccountsList = new ArrayList<>();
    }
    this.paymentAccountsList.add(paymentAccountsListItem);
    return this;
  }

  /**
   * Get paymentAccountsList
   *
   * @return paymentAccountsList
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<PaymentAccount> getPaymentAccountsList() {
    return paymentAccountsList;
  }

  public void setPaymentAccountsList(List<PaymentAccount> paymentAccountsList) {
    this.paymentAccountsList = paymentAccountsList;
  }

  public ReceivedDocumentInfo vatTypesList(List<VatType> vatTypesList) {

    this.vatTypesList = vatTypesList;
    return this;
  }

  public ReceivedDocumentInfo addVatTypesListItem(VatType vatTypesListItem) {
    if (this.vatTypesList == null) {
      this.vatTypesList = new ArrayList<>();
    }
    this.vatTypesList.add(vatTypesListItem);
    return this;
  }

  /**
   * Get vatTypesList
   *
   * @return vatTypesList
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
    ReceivedDocumentInfo receivedDocumentInfo = (ReceivedDocumentInfo) o;
    return Objects.equals(this.defaultValues, receivedDocumentInfo.defaultValues)
        && Objects.equals(this.itemsDefaultValues, receivedDocumentInfo.itemsDefaultValues)
        && Objects.equals(this.countriesList, receivedDocumentInfo.countriesList)
        && Objects.equals(this.currenciesList, receivedDocumentInfo.currenciesList)
        && Objects.equals(this.categoriesList, receivedDocumentInfo.categoriesList)
        && Objects.equals(this.paymentAccountsList, receivedDocumentInfo.paymentAccountsList)
        && Objects.equals(this.vatTypesList, receivedDocumentInfo.vatTypesList);
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
        defaultValues,
        itemsDefaultValues,
        countriesList,
        currenciesList,
        categoriesList,
        paymentAccountsList,
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
    sb.append("class ReceivedDocumentInfo {\n");
    sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
    sb.append("    itemsDefaultValues: ").append(toIndentedString(itemsDefaultValues)).append("\n");
    sb.append("    countriesList: ").append(toIndentedString(countriesList)).append("\n");
    sb.append("    currenciesList: ").append(toIndentedString(currenciesList)).append("\n");
    sb.append("    categoriesList: ").append(toIndentedString(categoriesList)).append("\n");
    sb.append("    paymentAccountsList: ")
        .append(toIndentedString(paymentAccountsList))
        .append("\n");
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
    openapiFields.add("default_values");
    openapiFields.add("items_default_values");
    openapiFields.add("countries_list");
    openapiFields.add("currencies_list");
    openapiFields.add("categories_list");
    openapiFields.add("payment_accounts_list");
    openapiFields.add("vat_types_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to ReceivedDocumentInfo
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (ReceivedDocumentInfo.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ReceivedDocumentInfo is not found in the empty JSON string",
                ReceivedDocumentInfo.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!ReceivedDocumentInfo.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ReceivedDocumentInfo` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // validate the optional field `default_values`
    if ((jsonObj.get("default_values") != null && !jsonObj.get("default_values").isJsonNull())
        && !jsonObj.get("default_values").isJsonPrimitive()) {
      ReceivedDocumentInfoDefaultValues.validateJsonObject(
          jsonObj.getAsJsonObject("default_values"));
    }
    // validate the optional field `items_default_values`
    if ((jsonObj.get("items_default_values") != null
            && !jsonObj.get("items_default_values").isJsonNull())
        && !jsonObj.get("items_default_values").isJsonPrimitive()) {
      ReceivedDocumentInfoItemsDefaultValues.validateJsonObject(
          jsonObj.getAsJsonObject("items_default_values"));
    }
    // ensure the json data is an array
    if (jsonObj.get("countries_list") != null && !jsonObj.get("countries_list").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `countries_list` to be an array in the JSON string but got `%s`",
              jsonObj.get("countries_list").toString()));
    }
    JsonArray jsonArraycurrenciesList = jsonObj.getAsJsonArray("currencies_list");
    if (jsonArraycurrenciesList != null) {
      // ensure the json data is an array
      if (!jsonObj.get("currencies_list").isJsonArray()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `currencies_list` to be an array in the JSON string but got `%s`",
                jsonObj.get("currencies_list").toString()));
      }

      // validate the optional field `currencies_list` (array)
      for (int i = 0; i < jsonArraycurrenciesList.size(); i++) {
        Currency.validateJsonObject(jsonArraycurrenciesList.get(i).getAsJsonObject());
      }
      ;
    }
    // ensure the json data is an array
    if (jsonObj.get("categories_list") != null && !jsonObj.get("categories_list").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `categories_list` to be an array in the JSON string but got `%s`",
              jsonObj.get("categories_list").toString()));
    }
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

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ReceivedDocumentInfo.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ReceivedDocumentInfo' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ReceivedDocumentInfo> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ReceivedDocumentInfo.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ReceivedDocumentInfo>() {
            @Override
            public void write(JsonWriter out, ReceivedDocumentInfo value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ReceivedDocumentInfo read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ReceivedDocumentInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReceivedDocumentInfo
   * @throws IOException if the JSON string is invalid with respect to ReceivedDocumentInfo
   */
  public static ReceivedDocumentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReceivedDocumentInfo.class);
  }

  /**
   * Convert an instance of ReceivedDocumentInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
