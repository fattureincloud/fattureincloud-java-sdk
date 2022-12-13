/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.24
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
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** */
@ApiModel(description = "")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-13T15:06:28.671Z[Etc/UTC]")
public class GetExistingReceivedDocumentTotalsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";

  @SerializedName(SERIALIZED_NAME_DATA)
  private ReceivedDocument data;

  public GetExistingReceivedDocumentTotalsRequest() {}

  public GetExistingReceivedDocumentTotalsRequest data(ReceivedDocument data) {

    this.data = data;
    return this;
  }

  /**
   * Get data
   *
   * @return data
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ReceivedDocument getData() {
    return data;
  }

  public void setData(ReceivedDocument data) {
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
    GetExistingReceivedDocumentTotalsRequest getExistingReceivedDocumentTotalsRequest =
        (GetExistingReceivedDocumentTotalsRequest) o;
    return Objects.equals(this.data, getExistingReceivedDocumentTotalsRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExistingReceivedDocumentTotalsRequest {\n");
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
   *     GetExistingReceivedDocumentTotalsRequest
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (GetExistingReceivedDocumentTotalsRequest.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in GetExistingReceivedDocumentTotalsRequest is not found in the empty JSON string",
                GetExistingReceivedDocumentTotalsRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!GetExistingReceivedDocumentTotalsRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `GetExistingReceivedDocumentTotalsRequest` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // validate the optional field `data`
    if ((jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull())
        && !jsonObj.get("data").isJsonPrimitive()) {
      ReceivedDocument.validateJsonObject(jsonObj.getAsJsonObject("data"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetExistingReceivedDocumentTotalsRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetExistingReceivedDocumentTotalsRequest' and
                     // its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetExistingReceivedDocumentTotalsRequest> thisAdapter =
          gson.getDelegateAdapter(
              this, TypeToken.get(GetExistingReceivedDocumentTotalsRequest.class));

      return (TypeAdapter<T>)
          new TypeAdapter<GetExistingReceivedDocumentTotalsRequest>() {
            @Override
            public void write(JsonWriter out, GetExistingReceivedDocumentTotalsRequest value)
                throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public GetExistingReceivedDocumentTotalsRequest read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of GetExistingReceivedDocumentTotalsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetExistingReceivedDocumentTotalsRequest
   * @throws IOException if the JSON string is invalid with respect to
   *     GetExistingReceivedDocumentTotalsRequest
   */
  public static GetExistingReceivedDocumentTotalsRequest fromJson(String jsonString)
      throws IOException {
    return JSON.getGson().fromJson(jsonString, GetExistingReceivedDocumentTotalsRequest.class);
  }

  /**
   * Convert an instance of GetExistingReceivedDocumentTotalsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
