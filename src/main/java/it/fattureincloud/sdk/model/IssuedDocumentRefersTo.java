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
import java.io.IOException;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * Link to another document (e.g. the original proforma or the quote from which this has been created).
 */
@ApiModel(description = "Link to another document (e.g. the original proforma or the quote from which this has been created).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-14T16:12:54.353Z[GMT]")
public class IssuedDocumentRefersTo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_NUMERATION = "numeration";
  @SerializedName(SERIALIZED_NAME_NUMERATION)
  private String numeration;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public IssuedDocumentRefersTo id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the linked document (can be null if the document has been deleted or other reasons).
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the linked document (can be null if the document has been deleted or other reasons).")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public IssuedDocumentRefersTo date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * Date of the linked document.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the linked document.")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    this.date = date;
  }


  public IssuedDocumentRefersTo number(Integer number) {
    
    this.number = number;
    return this;
  }

   /**
   * Number of the linked document.
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of the linked document.")

  public Integer getNumber() {
    return number;
  }


  public void setNumber(Integer number) {
    this.number = number;
  }


  public IssuedDocumentRefersTo numeration(String numeration) {
    
    this.numeration = numeration;
    return this;
  }

   /**
   * Numeration of the linked document.
   * @return numeration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Numeration of the linked document.")

  public String getNumeration() {
    return numeration;
  }


  public void setNumeration(String numeration) {
    this.numeration = numeration;
  }


  public IssuedDocumentRefersTo description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description to show.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description to show.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentRefersTo issuedDocumentRefersTo = (IssuedDocumentRefersTo) o;
    return Objects.equals(this.id, issuedDocumentRefersTo.id) &&
        Objects.equals(this.date, issuedDocumentRefersTo.date) &&
        Objects.equals(this.number, issuedDocumentRefersTo.number) &&
        Objects.equals(this.numeration, issuedDocumentRefersTo.numeration) &&
        Objects.equals(this.description, issuedDocumentRefersTo.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, number, numeration, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuedDocumentRefersTo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numeration: ").append(toIndentedString(numeration)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

