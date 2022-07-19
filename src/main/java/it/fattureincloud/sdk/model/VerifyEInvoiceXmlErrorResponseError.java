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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** VerifyEInvoiceXmlErrorResponseError */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-07-18T14:57:32.905Z[Etc/UTC]")
public class VerifyEInvoiceXmlErrorResponseError implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MESSAGE = "message";

  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_VALIDATION_RESULT = "validation_result";

  @SerializedName(SERIALIZED_NAME_VALIDATION_RESULT)
  private Object validationResult;

  public VerifyEInvoiceXmlErrorResponseError() {}

  public VerifyEInvoiceXmlErrorResponseError message(String message) {

    this.message = message;
    return this;
  }

  /**
   * Get message
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public VerifyEInvoiceXmlErrorResponseError validationResult(Object validationResult) {

    this.validationResult = validationResult;
    return this;
  }

  /**
   * Get validationResult
   *
   * @return validationResult
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Object getValidationResult() {
    return validationResult;
  }

  public void setValidationResult(Object validationResult) {
    this.validationResult = validationResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyEInvoiceXmlErrorResponseError verifyEInvoiceXmlErrorResponseError =
        (VerifyEInvoiceXmlErrorResponseError) o;
    return Objects.equals(this.message, verifyEInvoiceXmlErrorResponseError.message)
        && Objects.equals(
            this.validationResult, verifyEInvoiceXmlErrorResponseError.validationResult);
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
    return Objects.hash(message, validationResult);
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
    sb.append("class VerifyEInvoiceXmlErrorResponseError {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    validationResult: ").append(toIndentedString(validationResult)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("validation_result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to
   *     VerifyEInvoiceXmlErrorResponseError
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (VerifyEInvoiceXmlErrorResponseError.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in VerifyEInvoiceXmlErrorResponseError is not found in the empty JSON string",
                VerifyEInvoiceXmlErrorResponseError.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!VerifyEInvoiceXmlErrorResponseError.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `VerifyEInvoiceXmlErrorResponseError` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull())
        && !jsonObj.get("message").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `message` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("message").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!VerifyEInvoiceXmlErrorResponseError.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'VerifyEInvoiceXmlErrorResponseError' and its
                     // subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<VerifyEInvoiceXmlErrorResponseError> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(VerifyEInvoiceXmlErrorResponseError.class));

      return (TypeAdapter<T>)
          new TypeAdapter<VerifyEInvoiceXmlErrorResponseError>() {
            @Override
            public void write(JsonWriter out, VerifyEInvoiceXmlErrorResponseError value)
                throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public VerifyEInvoiceXmlErrorResponseError read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of VerifyEInvoiceXmlErrorResponseError given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VerifyEInvoiceXmlErrorResponseError
   * @throws IOException if the JSON string is invalid with respect to
   *     VerifyEInvoiceXmlErrorResponseError
   */
  public static VerifyEInvoiceXmlErrorResponseError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerifyEInvoiceXmlErrorResponseError.class);
  }

  /**
   * Convert an instance of VerifyEInvoiceXmlErrorResponseError to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
