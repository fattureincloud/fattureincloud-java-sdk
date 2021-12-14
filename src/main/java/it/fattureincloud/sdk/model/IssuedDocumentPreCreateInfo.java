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
import it.fattureincloud.sdk.model.Currency;
import it.fattureincloud.sdk.model.DocumentTemplate;
import it.fattureincloud.sdk.model.IssuedDocumentPreCreateInfoDefaultValues;
import it.fattureincloud.sdk.model.IssuedDocumentPreCreateInfoExtraDataDefaultValues;
import it.fattureincloud.sdk.model.IssuedDocumentPreCreateInfoItemsDefaultValues;
import it.fattureincloud.sdk.model.PaymentAccount;
import it.fattureincloud.sdk.model.PaymentMethod;
import it.fattureincloud.sdk.model.VatType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * IssuedDocumentPreCreateInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-14T16:12:54.353Z[GMT]")
public class IssuedDocumentPreCreateInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NUMERATIONS = "numerations";
  @SerializedName(SERIALIZED_NAME_NUMERATIONS)
  private Object numerations;

  public static final String SERIALIZED_NAME_DN_NUMERATIONS = "dn_numerations";
  @SerializedName(SERIALIZED_NAME_DN_NUMERATIONS)
  private Object dnNumerations;

  public static final String SERIALIZED_NAME_DEFAULT_VALUES = "default_values";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUES)
  private IssuedDocumentPreCreateInfoDefaultValues defaultValues;

  public static final String SERIALIZED_NAME_EXTRA_DATA_DEFAULT_VALUES = "extra_data_default_values";
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


  public IssuedDocumentPreCreateInfo numerations(Object numerations) {
    
    this.numerations = numerations;
    return this;
  }

   /**
   * Next numbers by year and numeration name (for the given document type).
   * @return numerations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Next numbers by year and numeration name (for the given document type).")

  public Object getNumerations() {
    return numerations;
  }


  public void setNumerations(Object numerations) {
    this.numerations = numerations;
  }


  public IssuedDocumentPreCreateInfo dnNumerations(Object dnNumerations) {
    
    this.dnNumerations = dnNumerations;
    return this;
  }

   /**
   * Next numbers by year and numeration name (for delivery_notes).
   * @return dnNumerations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Next numbers by year and numeration name (for delivery_notes).")

  public Object getDnNumerations() {
    return dnNumerations;
  }


  public void setDnNumerations(Object dnNumerations) {
    this.dnNumerations = dnNumerations;
  }


  public IssuedDocumentPreCreateInfo defaultValues(IssuedDocumentPreCreateInfoDefaultValues defaultValues) {
    
    this.defaultValues = defaultValues;
    return this;
  }

   /**
   * Get defaultValues
   * @return defaultValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IssuedDocumentPreCreateInfoDefaultValues getDefaultValues() {
    return defaultValues;
  }


  public void setDefaultValues(IssuedDocumentPreCreateInfoDefaultValues defaultValues) {
    this.defaultValues = defaultValues;
  }


  public IssuedDocumentPreCreateInfo extraDataDefaultValues(IssuedDocumentPreCreateInfoExtraDataDefaultValues extraDataDefaultValues) {
    
    this.extraDataDefaultValues = extraDataDefaultValues;
    return this;
  }

   /**
   * Get extraDataDefaultValues
   * @return extraDataDefaultValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IssuedDocumentPreCreateInfoExtraDataDefaultValues getExtraDataDefaultValues() {
    return extraDataDefaultValues;
  }


  public void setExtraDataDefaultValues(IssuedDocumentPreCreateInfoExtraDataDefaultValues extraDataDefaultValues) {
    this.extraDataDefaultValues = extraDataDefaultValues;
  }


  public IssuedDocumentPreCreateInfo itemsDefaultValues(IssuedDocumentPreCreateInfoItemsDefaultValues itemsDefaultValues) {
    
    this.itemsDefaultValues = itemsDefaultValues;
    return this;
  }

   /**
   * Get itemsDefaultValues
   * @return itemsDefaultValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IssuedDocumentPreCreateInfoItemsDefaultValues getItemsDefaultValues() {
    return itemsDefaultValues;
  }


  public void setItemsDefaultValues(IssuedDocumentPreCreateInfoItemsDefaultValues itemsDefaultValues) {
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
   * @return countriesList
  **/
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
   * @return currenciesList
  **/
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
   * @return templatesList
  **/
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
   * @return dnTemplatesList
  **/
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
   * @return aiTemplatesList
  **/
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

  public IssuedDocumentPreCreateInfo addPaymentMethodsListItem(PaymentMethod paymentMethodsListItem) {
    if (this.paymentMethodsList == null) {
      this.paymentMethodsList = new ArrayList<>();
    }
    this.paymentMethodsList.add(paymentMethodsListItem);
    return this;
  }

   /**
   * Payment methods list.
   * @return paymentMethodsList
  **/
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

  public IssuedDocumentPreCreateInfo addPaymentAccountsListItem(PaymentAccount paymentAccountsListItem) {
    if (this.paymentAccountsList == null) {
      this.paymentAccountsList = new ArrayList<>();
    }
    this.paymentAccountsList.add(paymentAccountsListItem);
    return this;
  }

   /**
   * Payment accounts list.
   * @return paymentAccountsList
  **/
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
   * @return vatTypesList
  **/
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
    return Objects.equals(this.numerations, issuedDocumentPreCreateInfo.numerations) &&
        Objects.equals(this.dnNumerations, issuedDocumentPreCreateInfo.dnNumerations) &&
        Objects.equals(this.defaultValues, issuedDocumentPreCreateInfo.defaultValues) &&
        Objects.equals(this.extraDataDefaultValues, issuedDocumentPreCreateInfo.extraDataDefaultValues) &&
        Objects.equals(this.itemsDefaultValues, issuedDocumentPreCreateInfo.itemsDefaultValues) &&
        Objects.equals(this.countriesList, issuedDocumentPreCreateInfo.countriesList) &&
        Objects.equals(this.currenciesList, issuedDocumentPreCreateInfo.currenciesList) &&
        Objects.equals(this.templatesList, issuedDocumentPreCreateInfo.templatesList) &&
        Objects.equals(this.dnTemplatesList, issuedDocumentPreCreateInfo.dnTemplatesList) &&
        Objects.equals(this.aiTemplatesList, issuedDocumentPreCreateInfo.aiTemplatesList) &&
        Objects.equals(this.paymentMethodsList, issuedDocumentPreCreateInfo.paymentMethodsList) &&
        Objects.equals(this.paymentAccountsList, issuedDocumentPreCreateInfo.paymentAccountsList) &&
        Objects.equals(this.vatTypesList, issuedDocumentPreCreateInfo.vatTypesList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numerations, dnNumerations, defaultValues, extraDataDefaultValues, itemsDefaultValues, countriesList, currenciesList, templatesList, dnTemplatesList, aiTemplatesList, paymentMethodsList, paymentAccountsList, vatTypesList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuedDocumentPreCreateInfo {\n");
    sb.append("    numerations: ").append(toIndentedString(numerations)).append("\n");
    sb.append("    dnNumerations: ").append(toIndentedString(dnNumerations)).append("\n");
    sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
    sb.append("    extraDataDefaultValues: ").append(toIndentedString(extraDataDefaultValues)).append("\n");
    sb.append("    itemsDefaultValues: ").append(toIndentedString(itemsDefaultValues)).append("\n");
    sb.append("    countriesList: ").append(toIndentedString(countriesList)).append("\n");
    sb.append("    currenciesList: ").append(toIndentedString(currenciesList)).append("\n");
    sb.append("    templatesList: ").append(toIndentedString(templatesList)).append("\n");
    sb.append("    dnTemplatesList: ").append(toIndentedString(dnTemplatesList)).append("\n");
    sb.append("    aiTemplatesList: ").append(toIndentedString(aiTemplatesList)).append("\n");
    sb.append("    paymentMethodsList: ").append(toIndentedString(paymentMethodsList)).append("\n");
    sb.append("    paymentAccountsList: ").append(toIndentedString(paymentAccountsList)).append("\n");
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
