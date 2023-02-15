/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.26
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** PaymentMethod */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-02-13T13:42:26.512Z[Etc/UTC]")
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

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("is_default");
    openapiFields.add("default_payment_account");
    openapiFields.add("details");
    openapiFields.add("bank_iban");
    openapiFields.add("bank_name");
    openapiFields.add("bank_beneficiary");
    openapiFields.add("ei_payment_method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to PaymentMethod
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (!PaymentMethod.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON object is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in PaymentMethod is not found in the empty JSON string",
                PaymentMethod.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!PaymentMethod.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `PaymentMethod`"
                    + " properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
        && !jsonObj.get("name").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `name` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("name").toString()));
    }
    // validate the optional field `default_payment_account`
    if (jsonObj.get("default_payment_account") != null
        && !jsonObj.get("default_payment_account").isJsonNull()) {
      PaymentAccount.validateJsonObject(jsonObj.getAsJsonObject("default_payment_account"));
    }
    if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
      JsonArray jsonArraydetails = jsonObj.getAsJsonArray("details");
      if (jsonArraydetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("details").isJsonArray()) {
          throw new IllegalArgumentException(
              String.format(
                  "Expected the field `details` to be an array in the JSON string but got `%s`",
                  jsonObj.get("details").toString()));
        }

        // validate the optional field `details` (array)
        for (int i = 0; i < jsonArraydetails.size(); i++) {
          PaymentMethodDetails.validateJsonObject(jsonArraydetails.get(i).getAsJsonObject());
        }
        ;
      }
    }
    if ((jsonObj.get("bank_iban") != null && !jsonObj.get("bank_iban").isJsonNull())
        && !jsonObj.get("bank_iban").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `bank_iban` to be a primitive type in the JSON string but got"
                  + " `%s`",
              jsonObj.get("bank_iban").toString()));
    }
    if ((jsonObj.get("bank_name") != null && !jsonObj.get("bank_name").isJsonNull())
        && !jsonObj.get("bank_name").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `bank_name` to be a primitive type in the JSON string but got"
                  + " `%s`",
              jsonObj.get("bank_name").toString()));
    }
    if ((jsonObj.get("bank_beneficiary") != null && !jsonObj.get("bank_beneficiary").isJsonNull())
        && !jsonObj.get("bank_beneficiary").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `bank_beneficiary` to be a primitive type in the JSON string but"
                  + " got `%s`",
              jsonObj.get("bank_beneficiary").toString()));
    }
    if ((jsonObj.get("ei_payment_method") != null && !jsonObj.get("ei_payment_method").isJsonNull())
        && !jsonObj.get("ei_payment_method").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `ei_payment_method` to be a primitive type in the JSON string but"
                  + " got `%s`",
              jsonObj.get("ei_payment_method").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!PaymentMethod.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'PaymentMethod' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<PaymentMethod> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(PaymentMethod.class));

      return (TypeAdapter<T>)
          new TypeAdapter<PaymentMethod>() {
            @Override
            public void write(JsonWriter out, PaymentMethod value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public PaymentMethod read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of PaymentMethod given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentMethod
   * @throws IOException if the JSON string is invalid with respect to PaymentMethod
   */
  public static PaymentMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethod.class);
  }

  /**
   * Convert an instance of PaymentMethod to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
