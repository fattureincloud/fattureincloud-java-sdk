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
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-02-13T13:42:26.512Z[Etc/UTC]")
public class GetNewReceivedDocumentTotalsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";

  @SerializedName(SERIALIZED_NAME_DATA)
  private ReceivedDocumentTotals data;

  public GetNewReceivedDocumentTotalsResponse() {}

  public GetNewReceivedDocumentTotalsResponse data(ReceivedDocumentTotals data) {

    this.data = data;
    return this;
  }

  /**
   * Get data
   *
   * @return data
   */
  @javax.annotation.Nullable
  public ReceivedDocumentTotals getData() {
    return data;
  }

  public void setData(ReceivedDocumentTotals data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetNewReceivedDocumentTotalsResponse getNewReceivedDocumentTotalsResponse =
        (GetNewReceivedDocumentTotalsResponse) o;
    return Objects.equals(this.data, getNewReceivedDocumentTotalsResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNewReceivedDocumentTotalsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to
   *     GetNewReceivedDocumentTotalsResponse
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (!GetNewReceivedDocumentTotalsResponse.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON object is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in GetNewReceivedDocumentTotalsResponse is not found in the empty JSON string",
                GetNewReceivedDocumentTotalsResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!GetNewReceivedDocumentTotalsResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `GetNewReceivedDocumentTotalsResponse` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // validate the optional field `data`
    if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
      ReceivedDocumentTotals.validateJsonObject(jsonObj.getAsJsonObject("data"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetNewReceivedDocumentTotalsResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetNewReceivedDocumentTotalsResponse' and its
                     // subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetNewReceivedDocumentTotalsResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetNewReceivedDocumentTotalsResponse.class));

      return (TypeAdapter<T>)
          new TypeAdapter<GetNewReceivedDocumentTotalsResponse>() {
            @Override
            public void write(JsonWriter out, GetNewReceivedDocumentTotalsResponse value)
                throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public GetNewReceivedDocumentTotalsResponse read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of GetNewReceivedDocumentTotalsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetNewReceivedDocumentTotalsResponse
   * @throws IOException if the JSON string is invalid with respect to
   *     GetNewReceivedDocumentTotalsResponse
   */
  public static GetNewReceivedDocumentTotalsResponse fromJson(String jsonString)
      throws IOException {
    return JSON.getGson().fromJson(jsonString, GetNewReceivedDocumentTotalsResponse.class);
  }

  /**
   * Convert an instance of GetNewReceivedDocumentTotalsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
