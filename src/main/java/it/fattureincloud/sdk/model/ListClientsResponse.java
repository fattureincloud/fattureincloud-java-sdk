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
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** ListClientsResponse */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-06-24T10:16:02.414Z[Etc/UTC]")
public class ListClientsResponse {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CURRENT_PAGE = "current_page";

  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private Integer currentPage;

  public static final String SERIALIZED_NAME_FIRST_PAGE_URL = "first_page_url";

  @SerializedName(SERIALIZED_NAME_FIRST_PAGE_URL)
  private URI firstPageUrl;

  public static final String SERIALIZED_NAME_FROM = "from";

  @SerializedName(SERIALIZED_NAME_FROM)
  private Integer from;

  public static final String SERIALIZED_NAME_LAST_PAGE = "last_page";

  @SerializedName(SERIALIZED_NAME_LAST_PAGE)
  private Integer lastPage;

  public static final String SERIALIZED_NAME_LAST_PAGE_URL = "last_page_url";

  @SerializedName(SERIALIZED_NAME_LAST_PAGE_URL)
  private URI lastPageUrl;

  public static final String SERIALIZED_NAME_NEXT_PAGE_URL = "next_page_url";

  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_URL)
  private URI nextPageUrl;

  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private URI path;

  public static final String SERIALIZED_NAME_PER_PAGE = "per_page";

  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private Integer perPage;

  public static final String SERIALIZED_NAME_PREV_PAGE_URL = "prev_page_url";

  @SerializedName(SERIALIZED_NAME_PREV_PAGE_URL)
  private URI prevPageUrl;

  public static final String SERIALIZED_NAME_TO = "to";

  @SerializedName(SERIALIZED_NAME_TO)
  private Integer to;

  public static final String SERIALIZED_NAME_TOTAL = "total";

  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_DATA = "data";

  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Client> data = null;

  public ListClientsResponse() {}

  public ListClientsResponse currentPage(Integer currentPage) {

    this.currentPage = currentPage;
    return this;
  }

  /**
   * Current page number.
   *
   * @return currentPage
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current page number.")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public ListClientsResponse firstPageUrl(URI firstPageUrl) {

    this.firstPageUrl = firstPageUrl;
    return this;
  }

  /**
   * First page url.
   *
   * @return firstPageUrl
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First page url.")
  public URI getFirstPageUrl() {
    return firstPageUrl;
  }

  public void setFirstPageUrl(URI firstPageUrl) {
    this.firstPageUrl = firstPageUrl;
  }

  public ListClientsResponse from(Integer from) {

    this.from = from;
    return this;
  }

  /**
   * First result of the page.
   *
   * @return from
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First result of the page.")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public ListClientsResponse lastPage(Integer lastPage) {

    this.lastPage = lastPage;
    return this;
  }

  /**
   * Last page number.
   *
   * @return lastPage
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last page number.")
  public Integer getLastPage() {
    return lastPage;
  }

  public void setLastPage(Integer lastPage) {
    this.lastPage = lastPage;
  }

  public ListClientsResponse lastPageUrl(URI lastPageUrl) {

    this.lastPageUrl = lastPageUrl;
    return this;
  }

  /**
   * Last page url.
   *
   * @return lastPageUrl
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last page url.")
  public URI getLastPageUrl() {
    return lastPageUrl;
  }

  public void setLastPageUrl(URI lastPageUrl) {
    this.lastPageUrl = lastPageUrl;
  }

  public ListClientsResponse nextPageUrl(URI nextPageUrl) {

    this.nextPageUrl = nextPageUrl;
    return this;
  }

  /**
   * Next page url
   *
   * @return nextPageUrl
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Next page url")
  public URI getNextPageUrl() {
    return nextPageUrl;
  }

  public void setNextPageUrl(URI nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
  }

  public ListClientsResponse path(URI path) {

    this.path = path;
    return this;
  }

  /**
   * Request path.
   *
   * @return path
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request path.")
  public URI getPath() {
    return path;
  }

  public void setPath(URI path) {
    this.path = path;
  }

  public ListClientsResponse perPage(Integer perPage) {

    this.perPage = perPage;
    return this;
  }

  /**
   * Number of result per page.
   *
   * @return perPage
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of result per page.")
  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  public ListClientsResponse prevPageUrl(URI prevPageUrl) {

    this.prevPageUrl = prevPageUrl;
    return this;
  }

  /**
   * Previous page url.
   *
   * @return prevPageUrl
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Previous page url.")
  public URI getPrevPageUrl() {
    return prevPageUrl;
  }

  public void setPrevPageUrl(URI prevPageUrl) {
    this.prevPageUrl = prevPageUrl;
  }

  public ListClientsResponse to(Integer to) {

    this.to = to;
    return this;
  }

  /**
   * Last result of the page.
   *
   * @return to
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last result of the page.")
  public Integer getTo() {
    return to;
  }

  public void setTo(Integer to) {
    this.to = to;
  }

  public ListClientsResponse total(Integer total) {

    this.total = total;
    return this;
  }

  /**
   * Total number of results
   *
   * @return total
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of results")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public ListClientsResponse data(List<Client> data) {

    this.data = data;
    return this;
  }

  public ListClientsResponse addDataItem(Client dataItem) {
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
  public List<Client> getData() {
    return data;
  }

  public void setData(List<Client> data) {
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
    ListClientsResponse listClientsResponse = (ListClientsResponse) o;
    return Objects.equals(this.currentPage, listClientsResponse.currentPage)
        && Objects.equals(this.firstPageUrl, listClientsResponse.firstPageUrl)
        && Objects.equals(this.from, listClientsResponse.from)
        && Objects.equals(this.lastPage, listClientsResponse.lastPage)
        && Objects.equals(this.lastPageUrl, listClientsResponse.lastPageUrl)
        && Objects.equals(this.nextPageUrl, listClientsResponse.nextPageUrl)
        && Objects.equals(this.path, listClientsResponse.path)
        && Objects.equals(this.perPage, listClientsResponse.perPage)
        && Objects.equals(this.prevPageUrl, listClientsResponse.prevPageUrl)
        && Objects.equals(this.to, listClientsResponse.to)
        && Objects.equals(this.total, listClientsResponse.total)
        && Objects.equals(this.data, listClientsResponse.data);
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
    return Objects.hash(
        currentPage,
        firstPageUrl,
        from,
        lastPage,
        lastPageUrl,
        nextPageUrl,
        path,
        perPage,
        prevPageUrl,
        to,
        total,
        data);
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
    sb.append("class ListClientsResponse {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    firstPageUrl: ").append(toIndentedString(firstPageUrl)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    lastPageUrl: ").append(toIndentedString(lastPageUrl)).append("\n");
    sb.append("    nextPageUrl: ").append(toIndentedString(nextPageUrl)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    prevPageUrl: ").append(toIndentedString(prevPageUrl)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("current_page");
    openapiFields.add("first_page_url");
    openapiFields.add("from");
    openapiFields.add("last_page");
    openapiFields.add("last_page_url");
    openapiFields.add("next_page_url");
    openapiFields.add("path");
    openapiFields.add("per_page");
    openapiFields.add("prev_page_url");
    openapiFields.add("to");
    openapiFields.add("total");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to ListClientsResponse
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (ListClientsResponse.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ListClientsResponse is not found in the empty JSON string",
                ListClientsResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!ListClientsResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ListClientsResponse` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("first_page_url") != null && !jsonObj.get("first_page_url").isJsonNull())
        && !jsonObj.get("first_page_url").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `first_page_url` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("first_page_url").toString()));
    }
    if ((jsonObj.get("last_page_url") != null && !jsonObj.get("last_page_url").isJsonNull())
        && !jsonObj.get("last_page_url").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `last_page_url` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("last_page_url").toString()));
    }
    if ((jsonObj.get("next_page_url") != null && !jsonObj.get("next_page_url").isJsonNull())
        && !jsonObj.get("next_page_url").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `next_page_url` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("next_page_url").toString()));
    }
    if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull())
        && !jsonObj.get("path").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `path` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("path").toString()));
    }
    if ((jsonObj.get("prev_page_url") != null && !jsonObj.get("prev_page_url").isJsonNull())
        && !jsonObj.get("prev_page_url").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `prev_page_url` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("prev_page_url").toString()));
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
        Client.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
      }
      ;
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ListClientsResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ListClientsResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ListClientsResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ListClientsResponse.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ListClientsResponse>() {
            @Override
            public void write(JsonWriter out, ListClientsResponse value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ListClientsResponse read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ListClientsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListClientsResponse
   * @throws IOException if the JSON string is invalid with respect to ListClientsResponse
   */
  public static ListClientsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListClientsResponse.class);
  }

  /**
   * Convert an instance of ListClientsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
