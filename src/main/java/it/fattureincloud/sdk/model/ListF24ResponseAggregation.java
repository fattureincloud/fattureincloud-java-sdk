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
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** ListF24ResponseAggregation */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-06-15T14:42:42.333969Z[Etc/UTC]")
public class ListF24ResponseAggregation {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AGGREGATED_DATA = "aggregated_data";

  @SerializedName(SERIALIZED_NAME_AGGREGATED_DATA)
  private ListF24ResponseAggregatedData aggregatedData;

  public ListF24ResponseAggregation() {}

  public ListF24ResponseAggregation aggregatedData(ListF24ResponseAggregatedData aggregatedData) {

    this.aggregatedData = aggregatedData;
    return this;
  }

  /**
   * Get aggregatedData
   *
   * @return aggregatedData
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ListF24ResponseAggregatedData getAggregatedData() {
    return aggregatedData;
  }

  public void setAggregatedData(ListF24ResponseAggregatedData aggregatedData) {
    this.aggregatedData = aggregatedData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListF24ResponseAggregation listF24ResponseAggregation = (ListF24ResponseAggregation) o;
    return Objects.equals(this.aggregatedData, listF24ResponseAggregation.aggregatedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListF24ResponseAggregation {\n");
    sb.append("    aggregatedData: ").append(toIndentedString(aggregatedData)).append("\n");
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
    openapiFields.add("aggregated_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to ListF24ResponseAggregation
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (ListF24ResponseAggregation.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ListF24ResponseAggregation is not found in the empty"
                    + " JSON string",
                ListF24ResponseAggregation.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!ListF24ResponseAggregation.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the"
                    + " `ListF24ResponseAggregation` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // validate the optional field `aggregated_data`
    if (jsonObj.getAsJsonObject("aggregated_data") != null) {
      ListF24ResponseAggregatedData.validateJsonObject(jsonObj.getAsJsonObject("aggregated_data"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ListF24ResponseAggregation.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ListF24ResponseAggregation' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ListF24ResponseAggregation> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ListF24ResponseAggregation.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ListF24ResponseAggregation>() {
            @Override
            public void write(JsonWriter out, ListF24ResponseAggregation value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ListF24ResponseAggregation read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ListF24ResponseAggregation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListF24ResponseAggregation
   * @throws IOException if the JSON string is invalid with respect to ListF24ResponseAggregation
   */
  public static ListF24ResponseAggregation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListF24ResponseAggregation.class);
  }

  /**
   * Convert an instance of ListF24ResponseAggregation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
