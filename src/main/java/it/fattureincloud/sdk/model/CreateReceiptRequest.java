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
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-02-07T13:36:20.600Z[Etc/UTC]")
public class CreateReceiptRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";

  @SerializedName(SERIALIZED_NAME_DATA)
  private Receipt data;

  public static final String SERIALIZED_NAME_AUTOCOMPLETE_NUMBER = "autocomplete_number";

  @SerializedName(SERIALIZED_NAME_AUTOCOMPLETE_NUMBER)
  private Boolean autocompleteNumber;

  public CreateReceiptRequest() {}

  public CreateReceiptRequest data(Receipt data) {

    this.data = data;
    return this;
  }

  /**
   * Get data
   *
   * @return data
   */
  @javax.annotation.Nullable
  public Receipt getData() {
    return data;
  }

  public void setData(Receipt data) {
    this.data = data;
  }

  public CreateReceiptRequest autocompleteNumber(Boolean autocompleteNumber) {

    this.autocompleteNumber = autocompleteNumber;
    return this;
  }

  /**
   * If true, the number is autocompleted progressively.
   *
   * @return autocompleteNumber
   */
  @javax.annotation.Nullable
  public Boolean getAutocompleteNumber() {
    return autocompleteNumber;
  }

  public void setAutocompleteNumber(Boolean autocompleteNumber) {
    this.autocompleteNumber = autocompleteNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReceiptRequest createReceiptRequest = (CreateReceiptRequest) o;
    return Objects.equals(this.data, createReceiptRequest.data)
        && Objects.equals(this.autocompleteNumber, createReceiptRequest.autocompleteNumber);
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
    return Objects.hash(data, autocompleteNumber);
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
    sb.append("class CreateReceiptRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    autocompleteNumber: ").append(toIndentedString(autocompleteNumber)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("autocomplete_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to CreateReceiptRequest
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (!CreateReceiptRequest.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON object is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in CreateReceiptRequest is not found in the empty JSON string",
                CreateReceiptRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!CreateReceiptRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `CreateReceiptRequest` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // validate the optional field `data`
    if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
      Receipt.validateJsonObject(jsonObj.getAsJsonObject("data"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!CreateReceiptRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'CreateReceiptRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<CreateReceiptRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(CreateReceiptRequest.class));

      return (TypeAdapter<T>)
          new TypeAdapter<CreateReceiptRequest>() {
            @Override
            public void write(JsonWriter out, CreateReceiptRequest value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public CreateReceiptRequest read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateReceiptRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateReceiptRequest
   * @throws IOException if the JSON string is invalid with respect to CreateReceiptRequest
   */
  public static CreateReceiptRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateReceiptRequest.class);
  }

  /**
   * Convert an instance of CreateReceiptRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
