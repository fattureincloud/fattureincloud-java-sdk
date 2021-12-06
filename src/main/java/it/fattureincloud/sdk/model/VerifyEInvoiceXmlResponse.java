/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.7
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
import it.fattureincloud.sdk.model.VerifyEInvoiceXmlErrorResponse;
import it.fattureincloud.sdk.model.VerifyEInvoiceXmlErrorResponseError;
import it.fattureincloud.sdk.model.VerifyEInvoiceXmlErrorResponseExtra;
import it.fattureincloud.sdk.model.VerifyEInvoiceXmlSuccessResponse;
import it.fattureincloud.sdk.model.VerifyEInvoiceXmlSuccessResponseData;
import java.io.IOException;
import java.io.Serializable;

/**
 * VerifyEInvoiceXmlResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-06T09:48:54.463Z[GMT]")
public class VerifyEInvoiceXmlResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private VerifyEInvoiceXmlSuccessResponseData data;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private VerifyEInvoiceXmlErrorResponseError error;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private VerifyEInvoiceXmlErrorResponseExtra extra;


  public VerifyEInvoiceXmlResponse data(VerifyEInvoiceXmlSuccessResponseData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VerifyEInvoiceXmlSuccessResponseData getData() {
    return data;
  }


  public void setData(VerifyEInvoiceXmlSuccessResponseData data) {
    this.data = data;
  }


  public VerifyEInvoiceXmlResponse error(VerifyEInvoiceXmlErrorResponseError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VerifyEInvoiceXmlErrorResponseError getError() {
    return error;
  }


  public void setError(VerifyEInvoiceXmlErrorResponseError error) {
    this.error = error;
  }


  public VerifyEInvoiceXmlResponse extra(VerifyEInvoiceXmlErrorResponseExtra extra) {
    
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VerifyEInvoiceXmlErrorResponseExtra getExtra() {
    return extra;
  }


  public void setExtra(VerifyEInvoiceXmlErrorResponseExtra extra) {
    this.extra = extra;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyEInvoiceXmlResponse verifyEInvoiceXmlResponse = (VerifyEInvoiceXmlResponse) o;
    return Objects.equals(this.data, verifyEInvoiceXmlResponse.data) &&
        Objects.equals(this.error, verifyEInvoiceXmlResponse.error) &&
        Objects.equals(this.extra, verifyEInvoiceXmlResponse.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, error, extra);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyEInvoiceXmlResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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

