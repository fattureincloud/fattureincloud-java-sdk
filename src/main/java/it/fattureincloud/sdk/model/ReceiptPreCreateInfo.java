/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.2
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReceiptPreCreateInfo */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-22T13:25:51.386488Z[Etc/UTC]",
    comments = "Generator version: 7.9.0")
public class ReceiptPreCreateInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NUMERATIONS = "numerations";

  @SerializedName(SERIALIZED_NAME_NUMERATIONS)
  private Map<String, Map<String, Integer>> numerations = new HashMap<>();

  public static final String SERIALIZED_NAME_NUMERATIONS_LIST = "numerations_list";

  @SerializedName(SERIALIZED_NAME_NUMERATIONS_LIST)
  private List<String> numerationsList;

  public static final String SERIALIZED_NAME_RC_CENTERS_LIST = "rc_centers_list";

  @SerializedName(SERIALIZED_NAME_RC_CENTERS_LIST)
  private List<String> rcCentersList;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNTS_LIST = "payment_accounts_list";

  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNTS_LIST)
  private List<PaymentAccount> paymentAccountsList;

  public static final String SERIALIZED_NAME_CATEGORIES_LIST = "categories_list";

  @SerializedName(SERIALIZED_NAME_CATEGORIES_LIST)
  private List<String> categoriesList;

  public static final String SERIALIZED_NAME_VAT_TYPES_LIST = "vat_types_list";

  @SerializedName(SERIALIZED_NAME_VAT_TYPES_LIST)
  private List<VatType> vatTypesList;

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
      this.numerationsList = new ArrayList<>();
    }
    this.numerationsList.add(numerationsListItem);
    return this;
  }

  /**
   * Receipt used numerations list
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
      this.rcCentersList = new ArrayList<>();
    }
    this.rcCentersList.add(rcCentersListItem);
    return this;
  }

  /**
   * Receipt used revenue centers list
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
      this.paymentAccountsList = new ArrayList<>();
    }
    this.paymentAccountsList.add(paymentAccountsListItem);
    return this;
  }

  /**
   * Payment accounts list
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
      this.categoriesList = new ArrayList<>();
    }
    this.categoriesList.add(categoriesListItem);
    return this;
  }

  /**
   * Receipt categories list
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
      this.vatTypesList = new ArrayList<>();
    }
    this.vatTypesList.add(vatTypesListItem);
    return this;
  }

  /**
   * Vat types list
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
}
