/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.10
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.fattureincloud.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

/**
 * Default values for the document items.
 */
@ApiModel(description = "Default values for the document items.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T08:45:03.999Z[Etc/UTC]")
public class ReceivedDocumentInfoItemsDefaultValues implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VAT = "vat";
  @SerializedName(SERIALIZED_NAME_VAT)
  private BigDecimal vat;


  public ReceivedDocumentInfoItemsDefaultValues vat(BigDecimal vat) {
    
    this.vat = vat;
    return this;
  }

   /**
   * Default vat value.
   * @return vat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default vat value.")

  public BigDecimal getVat() {
    return vat;
  }


  public void setVat(BigDecimal vat) {
    this.vat = vat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivedDocumentInfoItemsDefaultValues receivedDocumentInfoItemsDefaultValues = (ReceivedDocumentInfoItemsDefaultValues) o;
    return Objects.equals(this.vat, receivedDocumentInfoItemsDefaultValues.vat);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(vat);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivedDocumentInfoItemsDefaultValues {\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

