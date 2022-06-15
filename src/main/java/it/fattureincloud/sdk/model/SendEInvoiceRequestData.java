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
import io.swagger.annotations.ApiModelProperty;
import it.fattureincloud.sdk.JSON;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** SendEInvoiceRequestData */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-06-15T14:42:42.333969Z[Etc/UTC]")
public class SendEInvoiceRequestData {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CASSA_TYPE = "cassa_type";

  @SerializedName(SERIALIZED_NAME_CASSA_TYPE)
  private String cassaType;

  public static final String SERIALIZED_NAME_WITHHOLDING_TAX_CAUSAL = "withholding_tax_causal";

  @SerializedName(SERIALIZED_NAME_WITHHOLDING_TAX_CAUSAL)
  private String withholdingTaxCausal;

  public SendEInvoiceRequestData() {}

  public SendEInvoiceRequestData cassaType(String cassaType) {

    this.cassaType = cassaType;
    return this;
  }

  /**
   * Value of TipoCassa used (optional, override the company default value).
   *
   * @return cassaType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Value of TipoCassa used (optional, override the company default value).")
  public String getCassaType() {
    return cassaType;
  }

  public void setCassaType(String cassaType) {
    this.cassaType = cassaType;
  }

  public SendEInvoiceRequestData withholdingTaxCausal(String withholdingTaxCausal) {

    this.withholdingTaxCausal = withholdingTaxCausal;
    return this;
  }

  /**
   * Value of CausalePagamento used (optional, override the company default value).
   *
   * @return withholdingTaxCausal
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Value of CausalePagamento used (optional, override the company default value).")
  public String getWithholdingTaxCausal() {
    return withholdingTaxCausal;
  }

  public void setWithholdingTaxCausal(String withholdingTaxCausal) {
    this.withholdingTaxCausal = withholdingTaxCausal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendEInvoiceRequestData sendEInvoiceRequestData = (SendEInvoiceRequestData) o;
    return Objects.equals(this.cassaType, sendEInvoiceRequestData.cassaType)
        && Objects.equals(this.withholdingTaxCausal, sendEInvoiceRequestData.withholdingTaxCausal);
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
    return Objects.hash(cassaType, withholdingTaxCausal);
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
    sb.append("class SendEInvoiceRequestData {\n");
    sb.append("    cassaType: ").append(toIndentedString(cassaType)).append("\n");
    sb.append("    withholdingTaxCausal: ")
        .append(toIndentedString(withholdingTaxCausal))
        .append("\n");
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
    openapiFields.add("cassa_type");
    openapiFields.add("withholding_tax_causal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to SendEInvoiceRequestData
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (SendEInvoiceRequestData.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in SendEInvoiceRequestData is not found in the empty JSON"
                    + " string",
                SendEInvoiceRequestData.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!SendEInvoiceRequestData.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `SendEInvoiceRequestData`"
                    + " properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("cassa_type") != null && jsonObj.get("cassa_type").isJsonNull())
        && !jsonObj.get("cassa_type").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `cassa_type` to be a primitive type in the JSON string but got"
                  + " `%s`",
              jsonObj.get("cassa_type").toString()));
    }
    if ((jsonObj.get("withholding_tax_causal") != null
            && jsonObj.get("withholding_tax_causal").isJsonNull())
        && !jsonObj.get("withholding_tax_causal").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `withholding_tax_causal` to be a primitive type in the JSON"
                  + " string but got `%s`",
              jsonObj.get("withholding_tax_causal").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!SendEInvoiceRequestData.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'SendEInvoiceRequestData' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<SendEInvoiceRequestData> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(SendEInvoiceRequestData.class));

      return (TypeAdapter<T>)
          new TypeAdapter<SendEInvoiceRequestData>() {
            @Override
            public void write(JsonWriter out, SendEInvoiceRequestData value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public SendEInvoiceRequestData read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of SendEInvoiceRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SendEInvoiceRequestData
   * @throws IOException if the JSON string is invalid with respect to SendEInvoiceRequestData
   */
  public static SendEInvoiceRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendEInvoiceRequestData.class);
  }

  /**
   * Convert an instance of SendEInvoiceRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
