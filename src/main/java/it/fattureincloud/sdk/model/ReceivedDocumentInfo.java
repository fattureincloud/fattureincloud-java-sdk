/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.28
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-05-09T12:58:50.287Z[Etc/UTC]")
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
}
