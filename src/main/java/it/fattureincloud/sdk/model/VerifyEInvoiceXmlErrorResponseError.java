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
 * VerifyEInvoiceXmlErrorResponseError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T08:45:03.999Z[Etc/UTC]")
public class VerifyEInvoiceXmlErrorResponseError implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_VALIDATION_RESULT = "validation_result";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RESULT)
  private Object validationResult;


  public VerifyEInvoiceXmlErrorResponseError message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public VerifyEInvoiceXmlErrorResponseError validationResult(Object validationResult) {
    
    this.validationResult = validationResult;
    return this;
  }

   /**
   * Get validationResult
   * @return validationResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getValidationResult() {
    return validationResult;
  }


  public void setValidationResult(Object validationResult) {
    this.validationResult = validationResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyEInvoiceXmlErrorResponseError verifyEInvoiceXmlErrorResponseError = (VerifyEInvoiceXmlErrorResponseError) o;
    return Objects.equals(this.message, verifyEInvoiceXmlErrorResponseError.message) &&
        Objects.equals(this.validationResult, verifyEInvoiceXmlErrorResponseError.validationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, validationResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyEInvoiceXmlErrorResponseError {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    validationResult: ").append(toIndentedString(validationResult)).append("\n");
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

