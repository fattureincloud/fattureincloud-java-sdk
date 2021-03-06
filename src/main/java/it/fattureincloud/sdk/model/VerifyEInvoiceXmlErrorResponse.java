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

/** VerifyEInvoiceXmlErrorResponse */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-07-18T14:57:32.905Z[Etc/UTC]")
public class VerifyEInvoiceXmlErrorResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ERROR = "error";

  @SerializedName(SERIALIZED_NAME_ERROR)
  private VerifyEInvoiceXmlErrorResponseError error;

  public static final String SERIALIZED_NAME_EXTRA = "extra";

  @SerializedName(SERIALIZED_NAME_EXTRA)
  private VerifyEInvoiceXmlErrorResponseExtra extra;

  public VerifyEInvoiceXmlErrorResponse() {}

  public VerifyEInvoiceXmlErrorResponse error(VerifyEInvoiceXmlErrorResponseError error) {

    this.error = error;
    return this;
  }

  /**
   * Get error
   *
   * @return error
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public VerifyEInvoiceXmlErrorResponseError getError() {
    return error;
  }

  public void setError(VerifyEInvoiceXmlErrorResponseError error) {
    this.error = error;
  }

  public VerifyEInvoiceXmlErrorResponse extra(VerifyEInvoiceXmlErrorResponseExtra extra) {

    this.extra = extra;
    return this;
  }

  /**
   * Get extra
   *
   * @return extra
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public VerifyEInvoiceXmlErrorResponseExtra getExtra() {
    return extra;
  }

  public void setExtra(VerifyEInvoiceXmlErrorResponseExtra extra) {
    this.extra = extra;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyEInvoiceXmlErrorResponse verifyEInvoiceXmlErrorResponse =
        (VerifyEInvoiceXmlErrorResponse) o;
    return Objects.equals(this.error, verifyEInvoiceXmlErrorResponse.error)
        && Objects.equals(this.extra, verifyEInvoiceXmlErrorResponse.extra);
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
    return Objects.hash(error, extra);
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
    sb.append("class VerifyEInvoiceXmlErrorResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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
    openapiFields.add("error");
    openapiFields.add("extra");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to
   *     VerifyEInvoiceXmlErrorResponse
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (VerifyEInvoiceXmlErrorResponse.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in VerifyEInvoiceXmlErrorResponse is not found in the empty JSON string",
                VerifyEInvoiceXmlErrorResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!VerifyEInvoiceXmlErrorResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `VerifyEInvoiceXmlErrorResponse` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // validate the optional field `error`
    if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull())
        && !jsonObj.get("error").isJsonPrimitive()) {
      VerifyEInvoiceXmlErrorResponseError.validateJsonObject(jsonObj.getAsJsonObject("error"));
    }
    // validate the optional field `extra`
    if ((jsonObj.get("extra") != null && !jsonObj.get("extra").isJsonNull())
        && !jsonObj.get("extra").isJsonPrimitive()) {
      VerifyEInvoiceXmlErrorResponseExtra.validateJsonObject(jsonObj.getAsJsonObject("extra"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!VerifyEInvoiceXmlErrorResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'VerifyEInvoiceXmlErrorResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<VerifyEInvoiceXmlErrorResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(VerifyEInvoiceXmlErrorResponse.class));

      return (TypeAdapter<T>)
          new TypeAdapter<VerifyEInvoiceXmlErrorResponse>() {
            @Override
            public void write(JsonWriter out, VerifyEInvoiceXmlErrorResponse value)
                throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public VerifyEInvoiceXmlErrorResponse read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of VerifyEInvoiceXmlErrorResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VerifyEInvoiceXmlErrorResponse
   * @throws IOException if the JSON string is invalid with respect to
   *     VerifyEInvoiceXmlErrorResponse
   */
  public static VerifyEInvoiceXmlErrorResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerifyEInvoiceXmlErrorResponse.class);
  }

  /**
   * Convert an instance of VerifyEInvoiceXmlErrorResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
