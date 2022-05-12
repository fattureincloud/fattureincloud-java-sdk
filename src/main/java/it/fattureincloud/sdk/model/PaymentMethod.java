/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.16
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** PaymentMethod */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-05-12T13:23:15.879179Z[Etc/UTC]")
public class PaymentMethod implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private PaymentMethodType type = PaymentMethodType.STANDARD;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";

  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_DEFAULT_PAYMENT_ACCOUNT = "default_payment_account";

  @SerializedName(SERIALIZED_NAME_DEFAULT_PAYMENT_ACCOUNT)
  private PaymentAccount defaultPaymentAccount;

  public static final String SERIALIZED_NAME_DETAILS = "details";

  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<PaymentMethodDetails> details = null;

  public static final String SERIALIZED_NAME_BANK_IBAN = "bank_iban";

  @SerializedName(SERIALIZED_NAME_BANK_IBAN)
  private String bankIban;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";

  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_BANK_BENEFICIARY = "bank_beneficiary";

  @SerializedName(SERIALIZED_NAME_BANK_BENEFICIARY)
  private String bankBeneficiary;

  public static final String SERIALIZED_NAME_EI_PAYMENT_METHOD = "ei_payment_method";

  @SerializedName(SERIALIZED_NAME_EI_PAYMENT_METHOD)
  private String eiPaymentMethod;

  public PaymentMethod() {}

  public PaymentMethod id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Unique identifier
   *
   * @return id
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PaymentMethod name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name of the payment method
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the payment method")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PaymentMethod type(PaymentMethodType type) {

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
  public PaymentMethodType getType() {
    return type;
  }

  public void setType(PaymentMethodType type) {
    this.type = type;
  }

  public PaymentMethod isDefault(Boolean isDefault) {

    this.isDefault = isDefault;
    return this;
  }

  /**
   * Determines if this is the default payment method.
   *
   * @return isDefault
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines if this is the default payment method.")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public PaymentMethod defaultPaymentAccount(PaymentAccount defaultPaymentAccount) {

    this.defaultPaymentAccount = defaultPaymentAccount;
    return this;
  }

  /**
   * Get defaultPaymentAccount
   *
   * @return defaultPaymentAccount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public PaymentAccount getDefaultPaymentAccount() {
    return defaultPaymentAccount;
  }

  public void setDefaultPaymentAccount(PaymentAccount defaultPaymentAccount) {
    this.defaultPaymentAccount = defaultPaymentAccount;
  }

  public PaymentMethod details(List<PaymentMethodDetails> details) {

    this.details = details;
    return this;
  }

  public PaymentMethod addDetailsItem(PaymentMethodDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Method details rows
   *
   * @return details
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Method details rows")
  public List<PaymentMethodDetails> getDetails() {
    return details;
  }

  public void setDetails(List<PaymentMethodDetails> details) {
    this.details = details;
  }

  public PaymentMethod bankIban(String bankIban) {

    this.bankIban = bankIban;
    return this;
  }

  /**
   * Bank iban
   *
   * @return bankIban
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bank iban")
  public String getBankIban() {
    return bankIban;
  }

  public void setBankIban(String bankIban) {
    this.bankIban = bankIban;
  }

  public PaymentMethod bankName(String bankName) {

    this.bankName = bankName;
    return this;
  }

  /**
   * Bank name
   *
   * @return bankName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bank name")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public PaymentMethod bankBeneficiary(String bankBeneficiary) {

    this.bankBeneficiary = bankBeneficiary;
    return this;
  }

  /**
   * Bank beneficiary
   *
   * @return bankBeneficiary
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bank beneficiary")
  public String getBankBeneficiary() {
    return bankBeneficiary;
  }

  public void setBankBeneficiary(String bankBeneficiary) {
    this.bankBeneficiary = bankBeneficiary;
  }

  public PaymentMethod eiPaymentMethod(String eiPaymentMethod) {

    this.eiPaymentMethod = eiPaymentMethod;
    return this;
  }

  /**
   * E-invoice payment method
   *
   * @return eiPaymentMethod
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "E-invoice payment method")
  public String getEiPaymentMethod() {
    return eiPaymentMethod;
  }

  public void setEiPaymentMethod(String eiPaymentMethod) {
    this.eiPaymentMethod = eiPaymentMethod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethod paymentMethod = (PaymentMethod) o;
    return Objects.equals(this.id, paymentMethod.id)
        && Objects.equals(this.name, paymentMethod.name)
        && Objects.equals(this.type, paymentMethod.type)
        && Objects.equals(this.isDefault, paymentMethod.isDefault)
        && Objects.equals(this.defaultPaymentAccount, paymentMethod.defaultPaymentAccount)
        && Objects.equals(this.details, paymentMethod.details)
        && Objects.equals(this.bankIban, paymentMethod.bankIban)
        && Objects.equals(this.bankName, paymentMethod.bankName)
        && Objects.equals(this.bankBeneficiary, paymentMethod.bankBeneficiary)
        && Objects.equals(this.eiPaymentMethod, paymentMethod.eiPaymentMethod);
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
        name,
        type,
        isDefault,
        defaultPaymentAccount,
        details,
        bankIban,
        bankName,
        bankBeneficiary,
        eiPaymentMethod);
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
    sb.append("class PaymentMethod {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    defaultPaymentAccount: ")
        .append(toIndentedString(defaultPaymentAccount))
        .append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    bankIban: ").append(toIndentedString(bankIban)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankBeneficiary: ").append(toIndentedString(bankBeneficiary)).append("\n");
    sb.append("    eiPaymentMethod: ").append(toIndentedString(eiPaymentMethod)).append("\n");
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
