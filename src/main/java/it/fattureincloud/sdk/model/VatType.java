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
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-14T16:12:54.353Z[GMT]")
public class VatType implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_E_INVOICE = "e_invoice";
  @SerializedName(SERIALIZED_NAME_E_INVOICE)
  private Boolean eInvoice;

  public static final String SERIALIZED_NAME_EI_TYPE = "ei_type";
  @SerializedName(SERIALIZED_NAME_EI_TYPE)
  private String eiType;

  public static final String SERIALIZED_NAME_EI_DESCRIPTION = "ei_description";
  @SerializedName(SERIALIZED_NAME_EI_DESCRIPTION)
  private String eiDescription;

  public static final String SERIALIZED_NAME_EDITABLE = "editable";
  @SerializedName(SERIALIZED_NAME_EDITABLE)
  private Boolean editable = true;

  public static final String SERIALIZED_NAME_IS_DISABLED = "is_disabled";
  @SerializedName(SERIALIZED_NAME_IS_DISABLED)
  private Boolean isDisabled;


  public VatType id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public VatType value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * [Read Only] Percentual value.
   * minimum: 0
   * maximum: 100
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "22", required = true, value = "[Read Only] Percentual value.")

  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public VatType description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Short description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Non imponibile art. 123", value = "Short description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public VatType notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Long description and notes shown in documents.
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IVA non imponibile ai sensi dell'articolo 123, comma 2", value = "Long description and notes shown in documents.")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    this.notes = notes;
  }


  public VatType eInvoice(Boolean eInvoice) {
    
    this.eInvoice = eInvoice;
    return this;
  }

   /**
   * Usable for e-invoices.
   * @return eInvoice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Usable for e-invoices.")

  public Boolean geteInvoice() {
    return eInvoice;
  }


  public void seteInvoice(Boolean eInvoice) {
    this.eInvoice = eInvoice;
  }


  public VatType eiType(String eiType) {
    
    this.eiType = eiType;
    return this;
  }

   /**
   * E-invoice type (natura).
   * @return eiType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "E-invoice type (natura).")

  public String getEiType() {
    return eiType;
  }


  public void setEiType(String eiType) {
    this.eiType = eiType;
  }


  public VatType eiDescription(String eiDescription) {
    
    this.eiDescription = eiDescription;
    return this;
  }

   /**
   * E-invoice description.
   * @return eiDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "E-invoice description.")

  public String getEiDescription() {
    return eiDescription;
  }


  public void setEiDescription(String eiDescription) {
    this.eiDescription = eiDescription;
  }


   /**
   * [Read Only] Determine if this vat type is editable.
   * @return editable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Read Only] Determine if this vat type is editable.")

  public Boolean getEditable() {
    return editable;
  }




  public VatType isDisabled(Boolean isDisabled) {
    
    this.isDisabled = isDisabled;
    return this;
  }

   /**
   * Determine if the vat type is disabled.
   * @return isDisabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determine if the vat type is disabled.")

  public Boolean getIsDisabled() {
    return isDisabled;
  }


  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VatType vatType = (VatType) o;
    return Objects.equals(this.id, vatType.id) &&
        Objects.equals(this.value, vatType.value) &&
        Objects.equals(this.description, vatType.description) &&
        Objects.equals(this.notes, vatType.notes) &&
        Objects.equals(this.eInvoice, vatType.eInvoice) &&
        Objects.equals(this.eiType, vatType.eiType) &&
        Objects.equals(this.eiDescription, vatType.eiDescription) &&
        Objects.equals(this.editable, vatType.editable) &&
        Objects.equals(this.isDisabled, vatType.isDisabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, description, notes, eInvoice, eiType, eiDescription, editable, isDisabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VatType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    eInvoice: ").append(toIndentedString(eInvoice)).append("\n");
    sb.append("    eiType: ").append(toIndentedString(eiType)).append("\n");
    sb.append("    eiDescription: ").append(toIndentedString(eiDescription)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
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
