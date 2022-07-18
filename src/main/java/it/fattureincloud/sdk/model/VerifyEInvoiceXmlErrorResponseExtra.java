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
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** VerifyEInvoiceXmlErrorResponseExtra */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-07-18T14:57:32.905Z[Etc/UTC]")
public class VerifyEInvoiceXmlErrorResponseExtra implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ERRORS = "errors";

  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<String> errors = null;

  public VerifyEInvoiceXmlErrorResponseExtra() {}

  public VerifyEInvoiceXmlErrorResponseExtra errors(List<String> errors) {

    this.errors = errors;
    return this;
  }

  public VerifyEInvoiceXmlErrorResponseExtra addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   *
   * @return errors
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyEInvoiceXmlErrorResponseExtra verifyEInvoiceXmlErrorResponseExtra =
        (VerifyEInvoiceXmlErrorResponseExtra) o;
    return Objects.equals(this.errors, verifyEInvoiceXmlErrorResponseExtra.errors);
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
    return Objects.hash(errors);
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
    sb.append("class VerifyEInvoiceXmlErrorResponseExtra {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to
   *     VerifyEInvoiceXmlErrorResponseExtra
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (VerifyEInvoiceXmlErrorResponseExtra.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in VerifyEInvoiceXmlErrorResponseExtra is not found in the empty JSON string",
                VerifyEInvoiceXmlErrorResponseExtra.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!VerifyEInvoiceXmlErrorResponseExtra.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `VerifyEInvoiceXmlErrorResponseExtra` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // ensure the json data is an array
    if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `errors` to be an array in the JSON string but got `%s`",
              jsonObj.get("errors").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!VerifyEInvoiceXmlErrorResponseExtra.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'VerifyEInvoiceXmlErrorResponseExtra' and its
                     // subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<VerifyEInvoiceXmlErrorResponseExtra> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(VerifyEInvoiceXmlErrorResponseExtra.class));

      return (TypeAdapter<T>)
          new TypeAdapter<VerifyEInvoiceXmlErrorResponseExtra>() {
            @Override
            public void write(JsonWriter out, VerifyEInvoiceXmlErrorResponseExtra value)
                throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public VerifyEInvoiceXmlErrorResponseExtra read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of VerifyEInvoiceXmlErrorResponseExtra given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VerifyEInvoiceXmlErrorResponseExtra
   * @throws IOException if the JSON string is invalid with respect to
   *     VerifyEInvoiceXmlErrorResponseExtra
   */
  public static VerifyEInvoiceXmlErrorResponseExtra fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerifyEInvoiceXmlErrorResponseExtra.class);
  }

  /**
   * Convert an instance of VerifyEInvoiceXmlErrorResponseExtra to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
