/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.25
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
import it.fattureincloud.sdk.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** VerifyEInvoiceXmlErrorResponseErrorValidationResult */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-02-06T15:44:01.481Z[Etc/UTC]")
public class VerifyEInvoiceXmlErrorResponseErrorValidationResult implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_XML_ERRORS = "xml_errors";

  @SerializedName(SERIALIZED_NAME_XML_ERRORS)
  private List<String> xmlErrors = null;

  public VerifyEInvoiceXmlErrorResponseErrorValidationResult() {}

  public VerifyEInvoiceXmlErrorResponseErrorValidationResult xmlErrors(List<String> xmlErrors) {

    this.xmlErrors = xmlErrors;
    return this;
  }

  public VerifyEInvoiceXmlErrorResponseErrorValidationResult addXmlErrorsItem(
      String xmlErrorsItem) {
    if (this.xmlErrors == null) {
      this.xmlErrors = null;
    }
    this.xmlErrors.add(xmlErrorsItem);
    return this;
  }

  /**
   * Get xmlErrors
   *
   * @return xmlErrors
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<String> getXmlErrors() {
    return xmlErrors;
  }

  public void setXmlErrors(List<String> xmlErrors) {
    this.xmlErrors = xmlErrors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyEInvoiceXmlErrorResponseErrorValidationResult
        verifyEInvoiceXmlErrorResponseErrorValidationResult =
            (VerifyEInvoiceXmlErrorResponseErrorValidationResult) o;
    return Objects.equals(
        this.xmlErrors, verifyEInvoiceXmlErrorResponseErrorValidationResult.xmlErrors);
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
    return Objects.hash(xmlErrors);
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
    sb.append("class VerifyEInvoiceXmlErrorResponseErrorValidationResult {\n");
    sb.append("    xmlErrors: ").append(toIndentedString(xmlErrors)).append("\n");
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
    openapiFields.add("xml_errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to
   *     VerifyEInvoiceXmlErrorResponseErrorValidationResult
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (VerifyEInvoiceXmlErrorResponseErrorValidationResult.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in VerifyEInvoiceXmlErrorResponseErrorValidationResult is not found in the empty JSON string",
                VerifyEInvoiceXmlErrorResponseErrorValidationResult.openapiRequiredFields
                    .toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!VerifyEInvoiceXmlErrorResponseErrorValidationResult.openapiFields.contains(
          entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `VerifyEInvoiceXmlErrorResponseErrorValidationResult` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // ensure the json data is an array
    if (jsonObj.get("xml_errors") != null && !jsonObj.get("xml_errors").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `xml_errors` to be an array in the JSON string but got `%s`",
              jsonObj.get("xml_errors").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!VerifyEInvoiceXmlErrorResponseErrorValidationResult.class.isAssignableFrom(
          type.getRawType())) {
        return null; // this class only serializes
                     // 'VerifyEInvoiceXmlErrorResponseErrorValidationResult' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<VerifyEInvoiceXmlErrorResponseErrorValidationResult> thisAdapter =
          gson.getDelegateAdapter(
              this, TypeToken.get(VerifyEInvoiceXmlErrorResponseErrorValidationResult.class));

      return (TypeAdapter<T>)
          new TypeAdapter<VerifyEInvoiceXmlErrorResponseErrorValidationResult>() {
            @Override
            public void write(
                JsonWriter out, VerifyEInvoiceXmlErrorResponseErrorValidationResult value)
                throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public VerifyEInvoiceXmlErrorResponseErrorValidationResult read(JsonReader in)
                throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of VerifyEInvoiceXmlErrorResponseErrorValidationResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VerifyEInvoiceXmlErrorResponseErrorValidationResult
   * @throws IOException if the JSON string is invalid with respect to
   *     VerifyEInvoiceXmlErrorResponseErrorValidationResult
   */
  public static VerifyEInvoiceXmlErrorResponseErrorValidationResult fromJson(String jsonString)
      throws IOException {
    return JSON.getGson()
        .fromJson(jsonString, VerifyEInvoiceXmlErrorResponseErrorValidationResult.class);
  }

  /**
   * Convert an instance of VerifyEInvoiceXmlErrorResponseErrorValidationResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}