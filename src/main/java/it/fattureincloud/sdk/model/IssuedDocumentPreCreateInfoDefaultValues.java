/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.18
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.fattureincloud.sdk.JSON;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Default values for the document. */
@ApiModel(description = "Default values for the document.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-06-16T10:37:15.055150Z[Etc/UTC]")
public class IssuedDocumentPreCreateInfoDefaultValues {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DEFAULT_TEMPLATE = "default_template";

  @SerializedName(SERIALIZED_NAME_DEFAULT_TEMPLATE)
  private DocumentTemplate defaultTemplate;

  public static final String SERIALIZED_NAME_DN_TEMPLATE = "dn_template";

  @SerializedName(SERIALIZED_NAME_DN_TEMPLATE)
  private DocumentTemplate dnTemplate;

  public static final String SERIALIZED_NAME_AI_TEMPLATE = "ai_template";

  @SerializedName(SERIALIZED_NAME_AI_TEMPLATE)
  private DocumentTemplate aiTemplate;

  public static final String SERIALIZED_NAME_NOTES = "notes";

  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_RIVALSA = "rivalsa";

  @SerializedName(SERIALIZED_NAME_RIVALSA)
  private BigDecimal rivalsa;

  public static final String SERIALIZED_NAME_CASSA = "cassa";

  @SerializedName(SERIALIZED_NAME_CASSA)
  private BigDecimal cassa;

  public static final String SERIALIZED_NAME_WITHHOLDING_TAX = "withholding_tax";

  @SerializedName(SERIALIZED_NAME_WITHHOLDING_TAX)
  private BigDecimal withholdingTax;

  public static final String SERIALIZED_NAME_WITHHOLDING_TAX_TAXABLE = "withholding_tax_taxable";

  @SerializedName(SERIALIZED_NAME_WITHHOLDING_TAX_TAXABLE)
  private BigDecimal withholdingTaxTaxable;

  public static final String SERIALIZED_NAME_OTHER_WITHHOLDING_TAX = "other_withholding_tax";

  @SerializedName(SERIALIZED_NAME_OTHER_WITHHOLDING_TAX)
  private BigDecimal otherWithholdingTax;

  public static final String SERIALIZED_NAME_USE_GROSS_PRICES = "use_gross_prices";

  @SerializedName(SERIALIZED_NAME_USE_GROSS_PRICES)
  private Boolean useGrossPrices;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";

  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentMethod paymentMethod;

  public IssuedDocumentPreCreateInfoDefaultValues() {}

  public IssuedDocumentPreCreateInfoDefaultValues defaultTemplate(
      DocumentTemplate defaultTemplate) {

    this.defaultTemplate = defaultTemplate;
    return this;
  }

  /**
   * Get defaultTemplate
   *
   * @return defaultTemplate
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public DocumentTemplate getDefaultTemplate() {
    return defaultTemplate;
  }

  public void setDefaultTemplate(DocumentTemplate defaultTemplate) {
    this.defaultTemplate = defaultTemplate;
  }

  public IssuedDocumentPreCreateInfoDefaultValues dnTemplate(DocumentTemplate dnTemplate) {

    this.dnTemplate = dnTemplate;
    return this;
  }

  /**
   * Get dnTemplate
   *
   * @return dnTemplate
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public DocumentTemplate getDnTemplate() {
    return dnTemplate;
  }

  public void setDnTemplate(DocumentTemplate dnTemplate) {
    this.dnTemplate = dnTemplate;
  }

  public IssuedDocumentPreCreateInfoDefaultValues aiTemplate(DocumentTemplate aiTemplate) {

    this.aiTemplate = aiTemplate;
    return this;
  }

  /**
   * Get aiTemplate
   *
   * @return aiTemplate
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public DocumentTemplate getAiTemplate() {
    return aiTemplate;
  }

  public void setAiTemplate(DocumentTemplate aiTemplate) {
    this.aiTemplate = aiTemplate;
  }

  public IssuedDocumentPreCreateInfoDefaultValues notes(String notes) {

    this.notes = notes;
    return this;
  }

  /**
   * Default notes.
   *
   * @return notes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default notes.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public IssuedDocumentPreCreateInfoDefaultValues rivalsa(BigDecimal rivalsa) {

    this.rivalsa = rivalsa;
    return this;
  }

  /**
   * Default rivalsa percentage.
   *
   * @return rivalsa
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default rivalsa percentage.")
  public BigDecimal getRivalsa() {
    return rivalsa;
  }

  public void setRivalsa(BigDecimal rivalsa) {
    this.rivalsa = rivalsa;
  }

  public IssuedDocumentPreCreateInfoDefaultValues cassa(BigDecimal cassa) {

    this.cassa = cassa;
    return this;
  }

  /**
   * Default cassa percentage.
   *
   * @return cassa
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default cassa percentage.")
  public BigDecimal getCassa() {
    return cassa;
  }

  public void setCassa(BigDecimal cassa) {
    this.cassa = cassa;
  }

  public IssuedDocumentPreCreateInfoDefaultValues withholdingTax(BigDecimal withholdingTax) {

    this.withholdingTax = withholdingTax;
    return this;
  }

  /**
   * Default withholding tax percentage.
   *
   * @return withholdingTax
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default withholding tax percentage.")
  public BigDecimal getWithholdingTax() {
    return withholdingTax;
  }

  public void setWithholdingTax(BigDecimal withholdingTax) {
    this.withholdingTax = withholdingTax;
  }

  public IssuedDocumentPreCreateInfoDefaultValues withholdingTaxTaxable(
      BigDecimal withholdingTaxTaxable) {

    this.withholdingTaxTaxable = withholdingTaxTaxable;
    return this;
  }

  /**
   * Default withholding tax taxable percentage.
   *
   * @return withholdingTaxTaxable
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default withholding tax taxable percentage.")
  public BigDecimal getWithholdingTaxTaxable() {
    return withholdingTaxTaxable;
  }

  public void setWithholdingTaxTaxable(BigDecimal withholdingTaxTaxable) {
    this.withholdingTaxTaxable = withholdingTaxTaxable;
  }

  public IssuedDocumentPreCreateInfoDefaultValues otherWithholdingTax(
      BigDecimal otherWithholdingTax) {

    this.otherWithholdingTax = otherWithholdingTax;
    return this;
  }

  /**
   * Default other withholding tax percentage.
   *
   * @return otherWithholdingTax
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default other withholding tax percentage.")
  public BigDecimal getOtherWithholdingTax() {
    return otherWithholdingTax;
  }

  public void setOtherWithholdingTax(BigDecimal otherWithholdingTax) {
    this.otherWithholdingTax = otherWithholdingTax;
  }

  public IssuedDocumentPreCreateInfoDefaultValues useGrossPrices(Boolean useGrossPrices) {

    this.useGrossPrices = useGrossPrices;
    return this;
  }

  /**
   * Use gross price by default.
   *
   * @return useGrossPrices
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use gross price by default.")
  public Boolean getUseGrossPrices() {
    return useGrossPrices;
  }

  public void setUseGrossPrices(Boolean useGrossPrices) {
    this.useGrossPrices = useGrossPrices;
  }

  public IssuedDocumentPreCreateInfoDefaultValues paymentMethod(PaymentMethod paymentMethod) {

    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   *
   * @return paymentMethod
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentPreCreateInfoDefaultValues issuedDocumentPreCreateInfoDefaultValues =
        (IssuedDocumentPreCreateInfoDefaultValues) o;
    return Objects.equals(
            this.defaultTemplate, issuedDocumentPreCreateInfoDefaultValues.defaultTemplate)
        && Objects.equals(this.dnTemplate, issuedDocumentPreCreateInfoDefaultValues.dnTemplate)
        && Objects.equals(this.aiTemplate, issuedDocumentPreCreateInfoDefaultValues.aiTemplate)
        && Objects.equals(this.notes, issuedDocumentPreCreateInfoDefaultValues.notes)
        && Objects.equals(this.rivalsa, issuedDocumentPreCreateInfoDefaultValues.rivalsa)
        && Objects.equals(this.cassa, issuedDocumentPreCreateInfoDefaultValues.cassa)
        && Objects.equals(
            this.withholdingTax, issuedDocumentPreCreateInfoDefaultValues.withholdingTax)
        && Objects.equals(
            this.withholdingTaxTaxable,
            issuedDocumentPreCreateInfoDefaultValues.withholdingTaxTaxable)
        && Objects.equals(
            this.otherWithholdingTax, issuedDocumentPreCreateInfoDefaultValues.otherWithholdingTax)
        && Objects.equals(
            this.useGrossPrices, issuedDocumentPreCreateInfoDefaultValues.useGrossPrices)
        && Objects.equals(
            this.paymentMethod, issuedDocumentPreCreateInfoDefaultValues.paymentMethod);
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
        defaultTemplate,
        dnTemplate,
        aiTemplate,
        notes,
        rivalsa,
        cassa,
        withholdingTax,
        withholdingTaxTaxable,
        otherWithholdingTax,
        useGrossPrices,
        paymentMethod);
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
    sb.append("class IssuedDocumentPreCreateInfoDefaultValues {\n");
    sb.append("    defaultTemplate: ").append(toIndentedString(defaultTemplate)).append("\n");
    sb.append("    dnTemplate: ").append(toIndentedString(dnTemplate)).append("\n");
    sb.append("    aiTemplate: ").append(toIndentedString(aiTemplate)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    rivalsa: ").append(toIndentedString(rivalsa)).append("\n");
    sb.append("    cassa: ").append(toIndentedString(cassa)).append("\n");
    sb.append("    withholdingTax: ").append(toIndentedString(withholdingTax)).append("\n");
    sb.append("    withholdingTaxTaxable: ")
        .append(toIndentedString(withholdingTaxTaxable))
        .append("\n");
    sb.append("    otherWithholdingTax: ")
        .append(toIndentedString(otherWithholdingTax))
        .append("\n");
    sb.append("    useGrossPrices: ").append(toIndentedString(useGrossPrices)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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
    openapiFields.add("default_template");
    openapiFields.add("dn_template");
    openapiFields.add("ai_template");
    openapiFields.add("notes");
    openapiFields.add("rivalsa");
    openapiFields.add("cassa");
    openapiFields.add("withholding_tax");
    openapiFields.add("withholding_tax_taxable");
    openapiFields.add("other_withholding_tax");
    openapiFields.add("use_gross_prices");
    openapiFields.add("payment_method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to
   *     IssuedDocumentPreCreateInfoDefaultValues
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (IssuedDocumentPreCreateInfoDefaultValues.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in IssuedDocumentPreCreateInfoDefaultValues is not found"
                    + " in the empty JSON string",
                IssuedDocumentPreCreateInfoDefaultValues.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!IssuedDocumentPreCreateInfoDefaultValues.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the"
                    + " `IssuedDocumentPreCreateInfoDefaultValues` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // validate the optional field `default_template`
    if ((jsonObj.get("default_template") != null && !jsonObj.get("default_template").isJsonNull())
        && !jsonObj.get("default_template").isJsonPrimitive()) {
      DocumentTemplate.validateJsonObject(jsonObj.getAsJsonObject("default_template"));
    }
    // validate the optional field `dn_template`
    if ((jsonObj.get("dn_template") != null && !jsonObj.get("dn_template").isJsonNull())
        && !jsonObj.get("dn_template").isJsonPrimitive()) {
      DocumentTemplate.validateJsonObject(jsonObj.getAsJsonObject("dn_template"));
    }
    // validate the optional field `ai_template`
    if ((jsonObj.get("ai_template") != null && !jsonObj.get("ai_template").isJsonNull())
        && !jsonObj.get("ai_template").isJsonPrimitive()) {
      DocumentTemplate.validateJsonObject(jsonObj.getAsJsonObject("ai_template"));
    }
    if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull())
        && !jsonObj.get("notes").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `notes` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("notes").toString()));
    }
    // validate the optional field `payment_method`
    if ((jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull())
        && !jsonObj.get("payment_method").isJsonPrimitive()) {
      PaymentMethod.validateJsonObject(jsonObj.getAsJsonObject("payment_method"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!IssuedDocumentPreCreateInfoDefaultValues.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'IssuedDocumentPreCreateInfoDefaultValues' and
                     // its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<IssuedDocumentPreCreateInfoDefaultValues> thisAdapter =
          gson.getDelegateAdapter(
              this, TypeToken.get(IssuedDocumentPreCreateInfoDefaultValues.class));

      return (TypeAdapter<T>)
          new TypeAdapter<IssuedDocumentPreCreateInfoDefaultValues>() {
            @Override
            public void write(JsonWriter out, IssuedDocumentPreCreateInfoDefaultValues value)
                throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public IssuedDocumentPreCreateInfoDefaultValues read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of IssuedDocumentPreCreateInfoDefaultValues given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssuedDocumentPreCreateInfoDefaultValues
   * @throws IOException if the JSON string is invalid with respect to
   *     IssuedDocumentPreCreateInfoDefaultValues
   */
  public static IssuedDocumentPreCreateInfoDefaultValues fromJson(String jsonString)
      throws IOException {
    return JSON.getGson().fromJson(jsonString, IssuedDocumentPreCreateInfoDefaultValues.class);
  }

  /**
   * Convert an instance of IssuedDocumentPreCreateInfoDefaultValues to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
