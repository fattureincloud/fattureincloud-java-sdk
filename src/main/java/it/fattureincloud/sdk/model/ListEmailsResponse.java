/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.2
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ListEmailsResponse */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-22T15:13:22.680184Z[Etc/UTC]",
    comments = "Generator version: 7.9.0")
public class ListEmailsResponse implements Serializable {
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
  private List<Email> data = new ArrayList<>();

  public ListEmailsResponse() {}

  public ListEmailsResponse currentPage(Integer currentPage) {

    this.currentPage = currentPage;
    return this;
  }

  /**
   * Current page number.
   *
   * @return currentPage
   */
  @javax.annotation.Nullable
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public ListEmailsResponse firstPageUrl(URI firstPageUrl) {

    this.firstPageUrl = firstPageUrl;
    return this;
  }

  /**
   * First page url.
   *
   * @return firstPageUrl
   */
  @javax.annotation.Nullable
  public URI getFirstPageUrl() {
    return firstPageUrl;
  }

  public void setFirstPageUrl(URI firstPageUrl) {
    this.firstPageUrl = firstPageUrl;
  }

  public ListEmailsResponse from(Integer from) {

    this.from = from;
    return this;
  }

  /**
   * First result of the page.
   *
   * @return from
   */
  @javax.annotation.Nullable
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public ListEmailsResponse lastPage(Integer lastPage) {

    this.lastPage = lastPage;
    return this;
  }

  /**
   * Last page number.
   *
   * @return lastPage
   */
  @javax.annotation.Nullable
  public Integer getLastPage() {
    return lastPage;
  }

  public void setLastPage(Integer lastPage) {
    this.lastPage = lastPage;
  }

  public ListEmailsResponse lastPageUrl(URI lastPageUrl) {

    this.lastPageUrl = lastPageUrl;
    return this;
  }

  /**
   * Last page url.
   *
   * @return lastPageUrl
   */
  @javax.annotation.Nullable
  public URI getLastPageUrl() {
    return lastPageUrl;
  }

  public void setLastPageUrl(URI lastPageUrl) {
    this.lastPageUrl = lastPageUrl;
  }

  public ListEmailsResponse nextPageUrl(URI nextPageUrl) {

    this.nextPageUrl = nextPageUrl;
    return this;
  }

  /**
   * Next page url
   *
   * @return nextPageUrl
   */
  @javax.annotation.Nullable
  public URI getNextPageUrl() {
    return nextPageUrl;
  }

  public void setNextPageUrl(URI nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
  }

  public ListEmailsResponse path(URI path) {

    this.path = path;
    return this;
  }

  /**
   * Request path.
   *
   * @return path
   */
  @javax.annotation.Nullable
  public URI getPath() {
    return path;
  }

  public void setPath(URI path) {
    this.path = path;
  }

  public ListEmailsResponse perPage(Integer perPage) {

    this.perPage = perPage;
    return this;
  }

  /**
   * Number of result per page.
   *
   * @return perPage
   */
  @javax.annotation.Nullable
  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  public ListEmailsResponse prevPageUrl(URI prevPageUrl) {

    this.prevPageUrl = prevPageUrl;
    return this;
  }

  /**
   * Previous page url.
   *
   * @return prevPageUrl
   */
  @javax.annotation.Nullable
  public URI getPrevPageUrl() {
    return prevPageUrl;
  }

  public void setPrevPageUrl(URI prevPageUrl) {
    this.prevPageUrl = prevPageUrl;
  }

  public ListEmailsResponse to(Integer to) {

    this.to = to;
    return this;
  }

  /**
   * Last result of the page.
   *
   * @return to
   */
  @javax.annotation.Nullable
  public Integer getTo() {
    return to;
  }

  public void setTo(Integer to) {
    this.to = to;
  }

  public ListEmailsResponse total(Integer total) {

    this.total = total;
    return this;
  }

  /**
   * Total number of results
   *
   * @return total
   */
  @javax.annotation.Nullable
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public ListEmailsResponse data(List<Email> data) {

    this.data = data;
    return this;
  }

  public ListEmailsResponse addDataItem(Email dataItem) {
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
  public List<Email> getData() {
    return data;
  }

  public void setData(List<Email> data) {
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
    ListEmailsResponse listEmailsResponse = (ListEmailsResponse) o;
    return Objects.equals(this.currentPage, listEmailsResponse.currentPage)
        && Objects.equals(this.firstPageUrl, listEmailsResponse.firstPageUrl)
        && Objects.equals(this.from, listEmailsResponse.from)
        && Objects.equals(this.lastPage, listEmailsResponse.lastPage)
        && Objects.equals(this.lastPageUrl, listEmailsResponse.lastPageUrl)
        && Objects.equals(this.nextPageUrl, listEmailsResponse.nextPageUrl)
        && Objects.equals(this.path, listEmailsResponse.path)
        && Objects.equals(this.perPage, listEmailsResponse.perPage)
        && Objects.equals(this.prevPageUrl, listEmailsResponse.prevPageUrl)
        && Objects.equals(this.to, listEmailsResponse.to)
        && Objects.equals(this.total, listEmailsResponse.total)
        && Objects.equals(this.data, listEmailsResponse.data);
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
    sb.append("class ListEmailsResponse {\n");
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
}
