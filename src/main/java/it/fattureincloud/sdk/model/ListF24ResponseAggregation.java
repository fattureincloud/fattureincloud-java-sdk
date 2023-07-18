/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.29
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;

/** ListF24ResponseAggregation */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-07-17T10:04:00.151Z[Etc/UTC]")
public class ListF24ResponseAggregation implements Serializable {
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
}
