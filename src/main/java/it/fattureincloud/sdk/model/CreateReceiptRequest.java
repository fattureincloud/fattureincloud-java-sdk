/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.17
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@ApiModel(description = "")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-05-26T06:56:17.462034Z[Etc/UTC]")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "If true, the number is autocompleted progressively.")
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
}
