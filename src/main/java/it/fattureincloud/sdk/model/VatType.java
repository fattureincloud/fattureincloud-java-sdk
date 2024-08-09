/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.1
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VatType */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-09T09:03:55.704569Z[Etc/UTC]",
    comments = "Generator version: 7.7.0")
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
  private Boolean editable;

  public static final String SERIALIZED_NAME_IS_DISABLED = "is_disabled";

  @SerializedName(SERIALIZED_NAME_IS_DISABLED)
  private Boolean isDisabled;

  public static final String SERIALIZED_NAME_DEFAULT = "default";

  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public VatType() {}
  /** Constructor with only readonly parameters */
  public VatType(Boolean editable) {
    this();
    this.editable = editable;
  }

  public VatType id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Vat type id
   *
   * @return id
   */
  @javax.annotation.Nullable
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
   * [Read Only] Vat type percentual value
   *
   * @return value
   */
  @javax.annotation.Nullable
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
   * Vat type short description
   *
   * @return description
   */
  @javax.annotation.Nullable
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
   * Vat type notes shown in documents
   *
   * @return notes
   */
  @javax.annotation.Nullable
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
   * Vat type is usable for e-invoices
   *
   * @return eInvoice
   */
  @javax.annotation.Nullable
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
   * Vat type e-invoice type (natura)
   *
   * @return eiType
   */
  @javax.annotation.Nullable
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
   * Vat type e-invoice description
   *
   * @return eiDescription
   */
  @javax.annotation.Nullable
  public String getEiDescription() {
    return eiDescription;
  }

  public void setEiDescription(String eiDescription) {
    this.eiDescription = eiDescription;
  }

  /**
   * [Read Only] Is the vat type is editable.
   *
   * @return editable
   */
  @javax.annotation.Nullable
  public Boolean getEditable() {
    return editable;
  }

  public VatType isDisabled(Boolean isDisabled) {

    this.isDisabled = isDisabled;
    return this;
  }

  /**
   * Is the vat type disabled
   *
   * @return isDisabled
   */
  @javax.annotation.Nullable
  public Boolean getIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }

  public VatType _default(Boolean _default) {

    this._default = _default;
    return this;
  }

  /**
   * If the vat type is default
   *
   * @return _default
   */
  @javax.annotation.Nullable
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
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
    return Objects.equals(this.id, vatType.id)
        && Objects.equals(this.value, vatType.value)
        && Objects.equals(this.description, vatType.description)
        && Objects.equals(this.notes, vatType.notes)
        && Objects.equals(this.eInvoice, vatType.eInvoice)
        && Objects.equals(this.eiType, vatType.eiType)
        && Objects.equals(this.eiDescription, vatType.eiDescription)
        && Objects.equals(this.editable, vatType.editable)
        && Objects.equals(this.isDisabled, vatType.isDisabled)
        && Objects.equals(this._default, vatType._default);
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
        id,
        value,
        description,
        notes,
        eInvoice,
        eiType,
        eiDescription,
        editable,
        isDisabled,
        _default);
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
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
