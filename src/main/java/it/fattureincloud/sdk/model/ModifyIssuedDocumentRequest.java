/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.14
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
import it.fattureincloud.sdk.model.IssuedDocument;
import it.fattureincloud.sdk.model.IssuedDocumentOptions;
import java.io.IOException;
import java.io.Serializable;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-31T13:16:33.658Z[GMT]")
public class ModifyIssuedDocumentRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private IssuedDocument data;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private IssuedDocumentOptions options;

  public ModifyIssuedDocumentRequest() { 
  }

  public ModifyIssuedDocumentRequest data(IssuedDocument data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IssuedDocument getData() {
    return data;
  }


  public void setData(IssuedDocument data) {
    this.data = data;
  }


  public ModifyIssuedDocumentRequest options(IssuedDocumentOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IssuedDocumentOptions getOptions() {
    return options;
  }


  public void setOptions(IssuedDocumentOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyIssuedDocumentRequest modifyIssuedDocumentRequest = (ModifyIssuedDocumentRequest) o;
    return Objects.equals(this.data, modifyIssuedDocumentRequest.data) &&
        Objects.equals(this.options, modifyIssuedDocumentRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyIssuedDocumentRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

