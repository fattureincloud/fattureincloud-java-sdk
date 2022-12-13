/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.23
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** ListDetailedCountriesResponse */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-13T13:46:33.232Z[Etc/UTC]")
public class ListDetailedCountriesResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";

  @SerializedName(SERIALIZED_NAME_DATA)
  private List<DetailedCountry> data = null;

  public ListDetailedCountriesResponse() {}

  public ListDetailedCountriesResponse data(List<DetailedCountry> data) {

    this.data = data;
    return this;
  }

  public ListDetailedCountriesResponse addDataItem(DetailedCountry dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   *
   * @return data
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<DetailedCountry> getData() {
    return data;
  }

  public void setData(List<DetailedCountry> data) {
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
    ListDetailedCountriesResponse listDetailedCountriesResponse = (ListDetailedCountriesResponse) o;
    return Objects.equals(this.data, listDetailedCountriesResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDetailedCountriesResponse {\n");
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
   * @throws IOException if the JSON Object is invalid with respect to ListDetailedCountriesResponse
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (ListDetailedCountriesResponse.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ListDetailedCountriesResponse is not found in the empty JSON string",
                ListDetailedCountriesResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!ListDetailedCountriesResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ListDetailedCountriesResponse` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
    if (jsonArraydata != null) {
      // ensure the json data is an array
      if (!jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `data` to be an array in the JSON string but got `%s`",
                jsonObj.get("data").toString()));
      }

      // validate the optional field `data` (array)
      for (int i = 0; i < jsonArraydata.size(); i++) {
        DetailedCountry.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
      }
      ;
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ListDetailedCountriesResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ListDetailedCountriesResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ListDetailedCountriesResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ListDetailedCountriesResponse.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ListDetailedCountriesResponse>() {
            @Override
            public void write(JsonWriter out, ListDetailedCountriesResponse value)
                throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ListDetailedCountriesResponse read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ListDetailedCountriesResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListDetailedCountriesResponse
   * @throws IOException if the JSON string is invalid with respect to ListDetailedCountriesResponse
   */
  public static ListDetailedCountriesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListDetailedCountriesResponse.class);
  }

  /**
   * Convert an instance of ListDetailedCountriesResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
