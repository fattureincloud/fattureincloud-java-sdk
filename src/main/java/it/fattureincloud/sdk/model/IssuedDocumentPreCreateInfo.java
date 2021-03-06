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
import io.swagger.annotations.ApiModelProperty;
import it.fattureincloud.sdk.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** IssuedDocumentPreCreateInfo */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-07-18T14:57:32.905Z[Etc/UTC]")
public class IssuedDocumentPreCreateInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NUMERATIONS = "numerations";

  @SerializedName(SERIALIZED_NAME_NUMERATIONS)
  private Map<String, Map<String, Integer>> numerations = null;

  public static final String SERIALIZED_NAME_DN_NUMERATIONS = "dn_numerations";

  @SerializedName(SERIALIZED_NAME_DN_NUMERATIONS)
  private Map<String, Map<String, Integer>> dnNumerations = null;

  public static final String SERIALIZED_NAME_DEFAULT_VALUES = "default_values";

  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUES)
  private IssuedDocumentPreCreateInfoDefaultValues defaultValues;

  public static final String SERIALIZED_NAME_EXTRA_DATA_DEFAULT_VALUES =
      "extra_data_default_values";

  @SerializedName(SERIALIZED_NAME_EXTRA_DATA_DEFAULT_VALUES)
  private IssuedDocumentPreCreateInfoExtraDataDefaultValues extraDataDefaultValues;

  public static final String SERIALIZED_NAME_ITEMS_DEFAULT_VALUES = "items_default_values";

  @SerializedName(SERIALIZED_NAME_ITEMS_DEFAULT_VALUES)
  private IssuedDocumentPreCreateInfoItemsDefaultValues itemsDefaultValues;

  public static final String SERIALIZED_NAME_COUNTRIES_LIST = "countries_list";

  @SerializedName(SERIALIZED_NAME_COUNTRIES_LIST)
  private List<String> countriesList = null;

  public static final String SERIALIZED_NAME_CURRENCIES_LIST = "currencies_list";

  @SerializedName(SERIALIZED_NAME_CURRENCIES_LIST)
  private List<Currency> currenciesList = null;

  public static final String SERIALIZED_NAME_TEMPLATES_LIST = "templates_list";

  @SerializedName(SERIALIZED_NAME_TEMPLATES_LIST)
  private List<DocumentTemplate> templatesList = null;

  public static final String SERIALIZED_NAME_DN_TEMPLATES_LIST = "dn_templates_list";

  @SerializedName(SERIALIZED_NAME_DN_TEMPLATES_LIST)
  private List<DocumentTemplate> dnTemplatesList = null;

  public static final String SERIALIZED_NAME_AI_TEMPLATES_LIST = "ai_templates_list";

  @SerializedName(SERIALIZED_NAME_AI_TEMPLATES_LIST)
  private List<DocumentTemplate> aiTemplatesList = null;

  public static final String SERIALIZED_NAME_PAYMENT_METHODS_LIST = "payment_methods_list";

  @SerializedName(SERIALIZED_NAME_PAYMENT_METHODS_LIST)
  private List<PaymentMethod> paymentMethodsList = null;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNTS_LIST = "payment_accounts_list";

  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNTS_LIST)
  private List<PaymentAccount> paymentAccountsList = null;

  public static final String SERIALIZED_NAME_VAT_TYPES_LIST = "vat_types_list";

  @SerializedName(SERIALIZED_NAME_VAT_TYPES_LIST)
  private List<VatType> vatTypesList = null;

  public IssuedDocumentPreCreateInfo() {}

  public IssuedDocumentPreCreateInfo numerations(Map<String, Map<String, Integer>> numerations) {

    this.numerations = numerations;
    return this;
  }

  public IssuedDocumentPreCreateInfo putNumerationsItem(
      String key, Map<String, Integer> numerationsItem) {
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
  @ApiModelProperty(value = "")
  public Map<String, Map<String, Integer>> getNumerations() {
    return numerations;
  }

  public void setNumerations(Map<String, Map<String, Integer>> numerations) {
    this.numerations = numerations;
  }

  public IssuedDocumentPreCreateInfo dnNumerations(
      Map<String, Map<String, Integer>> dnNumerations) {

    this.dnNumerations = dnNumerations;
    return this;
  }

  public IssuedDocumentPreCreateInfo putDnNumerationsItem(
      String key, Map<String, Integer> dnNumerationsItem) {
    if (this.dnNumerations == null) {
      this.dnNumerations = new HashMap<>();
    }
    this.dnNumerations.put(key, dnNumerationsItem);
    return this;
  }

  /**
   * Get dnNumerations
   *
   * @return dnNumerations
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, Map<String, Integer>> getDnNumerations() {
    return dnNumerations;
  }

  public void setDnNumerations(Map<String, Map<String, Integer>> dnNumerations) {
    this.dnNumerations = dnNumerations;
  }

  public IssuedDocumentPreCreateInfo defaultValues(
      IssuedDocumentPreCreateInfoDefaultValues defaultValues) {

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
  public IssuedDocumentPreCreateInfoDefaultValues getDefaultValues() {
    return defaultValues;
  }

  public void setDefaultValues(IssuedDocumentPreCreateInfoDefaultValues defaultValues) {
    this.defaultValues = defaultValues;
  }

  public IssuedDocumentPreCreateInfo extraDataDefaultValues(
      IssuedDocumentPreCreateInfoExtraDataDefaultValues extraDataDefaultValues) {

    this.extraDataDefaultValues = extraDataDefaultValues;
    return this;
  }

  /**
   * Get extraDataDefaultValues
   *
   * @return extraDataDefaultValues
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public IssuedDocumentPreCreateInfoExtraDataDefaultValues getExtraDataDefaultValues() {
    return extraDataDefaultValues;
  }

  public void setExtraDataDefaultValues(
      IssuedDocumentPreCreateInfoExtraDataDefaultValues extraDataDefaultValues) {
    this.extraDataDefaultValues = extraDataDefaultValues;
  }

  public IssuedDocumentPreCreateInfo itemsDefaultValues(
      IssuedDocumentPreCreateInfoItemsDefaultValues itemsDefaultValues) {

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
  public IssuedDocumentPreCreateInfoItemsDefaultValues getItemsDefaultValues() {
    return itemsDefaultValues;
  }

  public void setItemsDefaultValues(
      IssuedDocumentPreCreateInfoItemsDefaultValues itemsDefaultValues) {
    this.itemsDefaultValues = itemsDefaultValues;
  }

  public IssuedDocumentPreCreateInfo countriesList(List<String> countriesList) {

    this.countriesList = countriesList;
    return this;
  }

  public IssuedDocumentPreCreateInfo addCountriesListItem(String countriesListItem) {
    if (this.countriesList == null) {
      this.countriesList = new ArrayList<>();
    }
    this.countriesList.add(countriesListItem);
    return this;
  }

  /**
   * Countries list.
   *
   * @return countriesList
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Countries list.")
  public List<String> getCountriesList() {
    return countriesList;
  }

  public void setCountriesList(List<String> countriesList) {
    this.countriesList = countriesList;
  }

  public IssuedDocumentPreCreateInfo currenciesList(List<Currency> currenciesList) {

    this.currenciesList = currenciesList;
    return this;
  }

  public IssuedDocumentPreCreateInfo addCurrenciesListItem(Currency currenciesListItem) {
    if (this.currenciesList == null) {
      this.currenciesList = new ArrayList<>();
    }
    this.currenciesList.add(currenciesListItem);
    return this;
  }

  /**
   * Currencies list.
   *
   * @return currenciesList
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currencies list.")
  public List<Currency> getCurrenciesList() {
    return currenciesList;
  }

  public void setCurrenciesList(List<Currency> currenciesList) {
    this.currenciesList = currenciesList;
  }

  public IssuedDocumentPreCreateInfo templatesList(List<DocumentTemplate> templatesList) {

    this.templatesList = templatesList;
    return this;
  }

  public IssuedDocumentPreCreateInfo addTemplatesListItem(DocumentTemplate templatesListItem) {
    if (this.templatesList == null) {
      this.templatesList = new ArrayList<>();
    }
    this.templatesList.add(templatesListItem);
    return this;
  }

  /**
   * Document templates list.
   *
   * @return templatesList
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document templates list.")
  public List<DocumentTemplate> getTemplatesList() {
    return templatesList;
  }

  public void setTemplatesList(List<DocumentTemplate> templatesList) {
    this.templatesList = templatesList;
  }

  public IssuedDocumentPreCreateInfo dnTemplatesList(List<DocumentTemplate> dnTemplatesList) {

    this.dnTemplatesList = dnTemplatesList;
    return this;
  }

  public IssuedDocumentPreCreateInfo addDnTemplatesListItem(DocumentTemplate dnTemplatesListItem) {
    if (this.dnTemplatesList == null) {
      this.dnTemplatesList = new ArrayList<>();
    }
    this.dnTemplatesList.add(dnTemplatesListItem);
    return this;
  }

  /**
   * Delivery note templates list.
   *
   * @return dnTemplatesList
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Delivery note templates list.")
  public List<DocumentTemplate> getDnTemplatesList() {
    return dnTemplatesList;
  }

  public void setDnTemplatesList(List<DocumentTemplate> dnTemplatesList) {
    this.dnTemplatesList = dnTemplatesList;
  }

  public IssuedDocumentPreCreateInfo aiTemplatesList(List<DocumentTemplate> aiTemplatesList) {

    this.aiTemplatesList = aiTemplatesList;
    return this;
  }

  public IssuedDocumentPreCreateInfo addAiTemplatesListItem(DocumentTemplate aiTemplatesListItem) {
    if (this.aiTemplatesList == null) {
      this.aiTemplatesList = new ArrayList<>();
    }
    this.aiTemplatesList.add(aiTemplatesListItem);
    return this;
  }

  /**
   * Accompanying invoice templates list.
   *
   * @return aiTemplatesList
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Accompanying invoice templates list.")
  public List<DocumentTemplate> getAiTemplatesList() {
    return aiTemplatesList;
  }

  public void setAiTemplatesList(List<DocumentTemplate> aiTemplatesList) {
    this.aiTemplatesList = aiTemplatesList;
  }

  public IssuedDocumentPreCreateInfo paymentMethodsList(List<PaymentMethod> paymentMethodsList) {

    this.paymentMethodsList = paymentMethodsList;
    return this;
  }

  public IssuedDocumentPreCreateInfo addPaymentMethodsListItem(
      PaymentMethod paymentMethodsListItem) {
    if (this.paymentMethodsList == null) {
      this.paymentMethodsList = new ArrayList<>();
    }
    this.paymentMethodsList.add(paymentMethodsListItem);
    return this;
  }

  /**
   * Payment methods list.
   *
   * @return paymentMethodsList
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment methods list.")
  public List<PaymentMethod> getPaymentMethodsList() {
    return paymentMethodsList;
  }

  public void setPaymentMethodsList(List<PaymentMethod> paymentMethodsList) {
    this.paymentMethodsList = paymentMethodsList;
  }

  public IssuedDocumentPreCreateInfo paymentAccountsList(List<PaymentAccount> paymentAccountsList) {

    this.paymentAccountsList = paymentAccountsList;
    return this;
  }

  public IssuedDocumentPreCreateInfo addPaymentAccountsListItem(
      PaymentAccount paymentAccountsListItem) {
    if (this.paymentAccountsList == null) {
      this.paymentAccountsList = new ArrayList<>();
    }
    this.paymentAccountsList.add(paymentAccountsListItem);
    return this;
  }

  /**
   * Payment accounts list.
   *
   * @return paymentAccountsList
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment accounts list.")
  public List<PaymentAccount> getPaymentAccountsList() {
    return paymentAccountsList;
  }

  public void setPaymentAccountsList(List<PaymentAccount> paymentAccountsList) {
    this.paymentAccountsList = paymentAccountsList;
  }

  public IssuedDocumentPreCreateInfo vatTypesList(List<VatType> vatTypesList) {

    this.vatTypesList = vatTypesList;
    return this;
  }

  public IssuedDocumentPreCreateInfo addVatTypesListItem(VatType vatTypesListItem) {
    if (this.vatTypesList == null) {
      this.vatTypesList = new ArrayList<>();
    }
    this.vatTypesList.add(vatTypesListItem);
    return this;
  }

  /**
   * Vat types list.
   *
   * @return vatTypesList
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Vat types list.")
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
    IssuedDocumentPreCreateInfo issuedDocumentPreCreateInfo = (IssuedDocumentPreCreateInfo) o;
    return Objects.equals(this.numerations, issuedDocumentPreCreateInfo.numerations)
        && Objects.equals(this.dnNumerations, issuedDocumentPreCreateInfo.dnNumerations)
        && Objects.equals(this.defaultValues, issuedDocumentPreCreateInfo.defaultValues)
        && Objects.equals(
            this.extraDataDefaultValues, issuedDocumentPreCreateInfo.extraDataDefaultValues)
        && Objects.equals(this.itemsDefaultValues, issuedDocumentPreCreateInfo.itemsDefaultValues)
        && Objects.equals(this.countriesList, issuedDocumentPreCreateInfo.countriesList)
        && Objects.equals(this.currenciesList, issuedDocumentPreCreateInfo.currenciesList)
        && Objects.equals(this.templatesList, issuedDocumentPreCreateInfo.templatesList)
        && Objects.equals(this.dnTemplatesList, issuedDocumentPreCreateInfo.dnTemplatesList)
        && Objects.equals(this.aiTemplatesList, issuedDocumentPreCreateInfo.aiTemplatesList)
        && Objects.equals(this.paymentMethodsList, issuedDocumentPreCreateInfo.paymentMethodsList)
        && Objects.equals(this.paymentAccountsList, issuedDocumentPreCreateInfo.paymentAccountsList)
        && Objects.equals(this.vatTypesList, issuedDocumentPreCreateInfo.vatTypesList);
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
        dnNumerations,
        defaultValues,
        extraDataDefaultValues,
        itemsDefaultValues,
        countriesList,
        currenciesList,
        templatesList,
        dnTemplatesList,
        aiTemplatesList,
        paymentMethodsList,
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
    sb.append("class IssuedDocumentPreCreateInfo {\n");
    sb.append("    numerations: ").append(toIndentedString(numerations)).append("\n");
    sb.append("    dnNumerations: ").append(toIndentedString(dnNumerations)).append("\n");
    sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
    sb.append("    extraDataDefaultValues: ")
        .append(toIndentedString(extraDataDefaultValues))
        .append("\n");
    sb.append("    itemsDefaultValues: ").append(toIndentedString(itemsDefaultValues)).append("\n");
    sb.append("    countriesList: ").append(toIndentedString(countriesList)).append("\n");
    sb.append("    currenciesList: ").append(toIndentedString(currenciesList)).append("\n");
    sb.append("    templatesList: ").append(toIndentedString(templatesList)).append("\n");
    sb.append("    dnTemplatesList: ").append(toIndentedString(dnTemplatesList)).append("\n");
    sb.append("    aiTemplatesList: ").append(toIndentedString(aiTemplatesList)).append("\n");
    sb.append("    paymentMethodsList: ").append(toIndentedString(paymentMethodsList)).append("\n");
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
    openapiFields.add("numerations");
    openapiFields.add("dn_numerations");
    openapiFields.add("default_values");
    openapiFields.add("extra_data_default_values");
    openapiFields.add("items_default_values");
    openapiFields.add("countries_list");
    openapiFields.add("currencies_list");
    openapiFields.add("templates_list");
    openapiFields.add("dn_templates_list");
    openapiFields.add("ai_templates_list");
    openapiFields.add("payment_methods_list");
    openapiFields.add("payment_accounts_list");
    openapiFields.add("vat_types_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to IssuedDocumentPreCreateInfo
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (IssuedDocumentPreCreateInfo.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in IssuedDocumentPreCreateInfo is not found in the empty JSON string",
                IssuedDocumentPreCreateInfo.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!IssuedDocumentPreCreateInfo.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `IssuedDocumentPreCreateInfo` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // validate the optional field `default_values`
    if ((jsonObj.get("default_values") != null && !jsonObj.get("default_values").isJsonNull())
        && !jsonObj.get("default_values").isJsonPrimitive()) {
      IssuedDocumentPreCreateInfoDefaultValues.validateJsonObject(
          jsonObj.getAsJsonObject("default_values"));
    }
    // validate the optional field `extra_data_default_values`
    if ((jsonObj.get("extra_data_default_values") != null
            && !jsonObj.get("extra_data_default_values").isJsonNull())
        && !jsonObj.get("extra_data_default_values").isJsonPrimitive()) {
      IssuedDocumentPreCreateInfoExtraDataDefaultValues.validateJsonObject(
          jsonObj.getAsJsonObject("extra_data_default_values"));
    }
    // validate the optional field `items_default_values`
    if ((jsonObj.get("items_default_values") != null
            && !jsonObj.get("items_default_values").isJsonNull())
        && !jsonObj.get("items_default_values").isJsonPrimitive()) {
      IssuedDocumentPreCreateInfoItemsDefaultValues.validateJsonObject(
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
    JsonArray jsonArraytemplatesList = jsonObj.getAsJsonArray("templates_list");
    if (jsonArraytemplatesList != null) {
      // ensure the json data is an array
      if (!jsonObj.get("templates_list").isJsonArray()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `templates_list` to be an array in the JSON string but got `%s`",
                jsonObj.get("templates_list").toString()));
      }

      // validate the optional field `templates_list` (array)
      for (int i = 0; i < jsonArraytemplatesList.size(); i++) {
        DocumentTemplate.validateJsonObject(jsonArraytemplatesList.get(i).getAsJsonObject());
      }
      ;
    }
    JsonArray jsonArraydnTemplatesList = jsonObj.getAsJsonArray("dn_templates_list");
    if (jsonArraydnTemplatesList != null) {
      // ensure the json data is an array
      if (!jsonObj.get("dn_templates_list").isJsonArray()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `dn_templates_list` to be an array in the JSON string but got `%s`",
                jsonObj.get("dn_templates_list").toString()));
      }

      // validate the optional field `dn_templates_list` (array)
      for (int i = 0; i < jsonArraydnTemplatesList.size(); i++) {
        DocumentTemplate.validateJsonObject(jsonArraydnTemplatesList.get(i).getAsJsonObject());
      }
      ;
    }
    JsonArray jsonArrayaiTemplatesList = jsonObj.getAsJsonArray("ai_templates_list");
    if (jsonArrayaiTemplatesList != null) {
      // ensure the json data is an array
      if (!jsonObj.get("ai_templates_list").isJsonArray()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `ai_templates_list` to be an array in the JSON string but got `%s`",
                jsonObj.get("ai_templates_list").toString()));
      }

      // validate the optional field `ai_templates_list` (array)
      for (int i = 0; i < jsonArrayaiTemplatesList.size(); i++) {
        DocumentTemplate.validateJsonObject(jsonArrayaiTemplatesList.get(i).getAsJsonObject());
      }
      ;
    }
    JsonArray jsonArraypaymentMethodsList = jsonObj.getAsJsonArray("payment_methods_list");
    if (jsonArraypaymentMethodsList != null) {
      // ensure the json data is an array
      if (!jsonObj.get("payment_methods_list").isJsonArray()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `payment_methods_list` to be an array in the JSON string but got `%s`",
                jsonObj.get("payment_methods_list").toString()));
      }

      // validate the optional field `payment_methods_list` (array)
      for (int i = 0; i < jsonArraypaymentMethodsList.size(); i++) {
        PaymentMethod.validateJsonObject(jsonArraypaymentMethodsList.get(i).getAsJsonObject());
      }
      ;
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
      if (!IssuedDocumentPreCreateInfo.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'IssuedDocumentPreCreateInfo' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<IssuedDocumentPreCreateInfo> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(IssuedDocumentPreCreateInfo.class));

      return (TypeAdapter<T>)
          new TypeAdapter<IssuedDocumentPreCreateInfo>() {
            @Override
            public void write(JsonWriter out, IssuedDocumentPreCreateInfo value)
                throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public IssuedDocumentPreCreateInfo read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of IssuedDocumentPreCreateInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssuedDocumentPreCreateInfo
   * @throws IOException if the JSON string is invalid with respect to IssuedDocumentPreCreateInfo
   */
  public static IssuedDocumentPreCreateInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssuedDocumentPreCreateInfo.class);
  }

  /**
   * Convert an instance of IssuedDocumentPreCreateInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
