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
import java.io.Serializable;

/**
 * ReceivedDocumentPaymentsListItemPaymentTerms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-02T14:48:33.113Z[Etc/UTC]")
public class ReceivedDocumentPaymentsListItemPaymentTerms implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DAYS = "days";
  @SerializedName(SERIALIZED_NAME_DAYS)
  private Integer days;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public ReceivedDocumentPaymentsListItemPaymentTerms days(Integer days) {
    
    this.days = days;
    return this;
  }

   /**
   * Number of days.
   * @return days
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of days.")

  public Integer getDays() {
    return days;
  }


  public void setDays(Integer days) {
    this.days = days;
  }


  public ReceivedDocumentPaymentsListItemPaymentTerms type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivedDocumentPaymentsListItemPaymentTerms receivedDocumentPaymentsListItemPaymentTerms = (ReceivedDocumentPaymentsListItemPaymentTerms) o;
    return Objects.equals(this.days, receivedDocumentPaymentsListItemPaymentTerms.days) &&
        Objects.equals(this.type, receivedDocumentPaymentsListItemPaymentTerms.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivedDocumentPaymentsListItemPaymentTerms {\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

