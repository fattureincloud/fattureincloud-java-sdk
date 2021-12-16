/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.7
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.fattureincloud.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.fattureincloud.sdk.model.PaymentAccount;
import it.fattureincloud.sdk.model.VatType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-16T15:17:24.788Z[GMT]")
public class ReceiptPreCreateInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NUMERATIONS = "numerations";
  @SerializedName(SERIALIZED_NAME_NUMERATIONS)
  private Object numerations;

  public static final String SERIALIZED_NAME_NUMERATIONS_LIST = "numerations_list";
  @SerializedName(SERIALIZED_NAME_NUMERATIONS_LIST)
  private List<String> numerationsList = new ArrayList<>();

  public static final String SERIALIZED_NAME_RC_CENTERS_LIST = "rc_centers_list";
  @SerializedName(SERIALIZED_NAME_RC_CENTERS_LIST)
  private List<String> rcCentersList = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNTS_LIST = "payment_accounts_list";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNTS_LIST)
  private List<PaymentAccount> paymentAccountsList = new ArrayList<>();

  public static final String SERIALIZED_NAME_CATEGORIES_LIST = "categories_list";
  @SerializedName(SERIALIZED_NAME_CATEGORIES_LIST)
  private List<String> categoriesList = new ArrayList<>();

  public static final String SERIALIZED_NAME_VAT_TYPES_LIST = "vat_types_list";
  @SerializedName(SERIALIZED_NAME_VAT_TYPES_LIST)
  private List<VatType> vatTypesList = new ArrayList<>();


  public ReceiptPreCreateInfo numerations(Object numerations) {
    
    this.numerations = numerations;
    return this;
  }

   /**
   * Next number by year, receipt type and numeration name.
   * @return numerations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Next number by year, receipt type and numeration name.")

  public Object getNumerations() {
    return numerations;
  }


  public void setNumerations(Object numerations) {
    this.numerations = numerations;
  }


  public ReceiptPreCreateInfo numerationsList(List<String> numerationsList) {
    
    this.numerationsList = numerationsList;
    return this;
  }

  public ReceiptPreCreateInfo addNumerationsListItem(String numerationsListItem) {
    this.numerationsList.add(numerationsListItem);
    return this;
  }

   /**
   * List of series used in the past.
   * @return numerationsList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of series used in the past.")

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
    this.rcCentersList.add(rcCentersListItem);
    return this;
  }

   /**
   * List of revenue centers used in the past.
   * @return rcCentersList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of revenue centers used in the past.")

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
    this.paymentAccountsList.add(paymentAccountsListItem);
    return this;
  }

   /**
   * User payment accounts list.
   * @return paymentAccountsList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "User payment accounts list.")

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
    this.categoriesList.add(categoriesListItem);
    return this;
  }

   /**
   * List of categories used in the past.
   * @return categoriesList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of categories used in the past.")

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
    this.vatTypesList.add(vatTypesListItem);
    return this;
  }

   /**
   * List of user vat types with the default 22%, 10%, 4% and 0% vats.
   * @return vatTypesList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of user vat types with the default 22%, 10%, 4% and 0% vats.")

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
    return Objects.equals(this.numerations, receiptPreCreateInfo.numerations) &&
        Objects.equals(this.numerationsList, receiptPreCreateInfo.numerationsList) &&
        Objects.equals(this.rcCentersList, receiptPreCreateInfo.rcCentersList) &&
        Objects.equals(this.paymentAccountsList, receiptPreCreateInfo.paymentAccountsList) &&
        Objects.equals(this.categoriesList, receiptPreCreateInfo.categoriesList) &&
        Objects.equals(this.vatTypesList, receiptPreCreateInfo.vatTypesList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numerations, numerationsList, rcCentersList, paymentAccountsList, categoriesList, vatTypesList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptPreCreateInfo {\n");
    sb.append("    numerations: ").append(toIndentedString(numerations)).append("\n");
    sb.append("    numerationsList: ").append(toIndentedString(numerationsList)).append("\n");
    sb.append("    rcCentersList: ").append(toIndentedString(rcCentersList)).append("\n");
    sb.append("    paymentAccountsList: ").append(toIndentedString(paymentAccountsList)).append("\n");
    sb.append("    categoriesList: ").append(toIndentedString(categoriesList)).append("\n");
    sb.append("    vatTypesList: ").append(toIndentedString(vatTypesList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

