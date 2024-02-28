/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.32
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Supplier */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-02-28T14:38:20.814424Z[Etc/UTC]")
public class Supplier implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CODE = "code";

  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private SupplierType type;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";

  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";

  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_CONTACT_PERSON = "contact_person";

  @SerializedName(SERIALIZED_NAME_CONTACT_PERSON)
  private String contactPerson;

  public static final String SERIALIZED_NAME_VAT_NUMBER = "vat_number";

  @SerializedName(SERIALIZED_NAME_VAT_NUMBER)
  private String vatNumber;

  public static final String SERIALIZED_NAME_TAX_CODE = "tax_code";

  @SerializedName(SERIALIZED_NAME_TAX_CODE)
  private String taxCode;

  public static final String SERIALIZED_NAME_ADDRESS_STREET = "address_street";

  @SerializedName(SERIALIZED_NAME_ADDRESS_STREET)
  private String addressStreet;

  public static final String SERIALIZED_NAME_ADDRESS_POSTAL_CODE = "address_postal_code";

  @SerializedName(SERIALIZED_NAME_ADDRESS_POSTAL_CODE)
  private String addressPostalCode;

  public static final String SERIALIZED_NAME_ADDRESS_CITY = "address_city";

  @SerializedName(SERIALIZED_NAME_ADDRESS_CITY)
  private String addressCity;

  public static final String SERIALIZED_NAME_ADDRESS_PROVINCE = "address_province";

  @SerializedName(SERIALIZED_NAME_ADDRESS_PROVINCE)
  private String addressProvince;

  public static final String SERIALIZED_NAME_ADDRESS_EXTRA = "address_extra";

  @SerializedName(SERIALIZED_NAME_ADDRESS_EXTRA)
  private String addressExtra;

  public static final String SERIALIZED_NAME_COUNTRY = "country";

  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_ISO = "country_iso";

  @SerializedName(SERIALIZED_NAME_COUNTRY_ISO)
  private String countryIso;

  public static final String SERIALIZED_NAME_EMAIL = "email";

  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_CERTIFIED_EMAIL = "certified_email";

  @SerializedName(SERIALIZED_NAME_CERTIFIED_EMAIL)
  private String certifiedEmail;

  public static final String SERIALIZED_NAME_PHONE = "phone";

  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_FAX = "fax";

  @SerializedName(SERIALIZED_NAME_FAX)
  private String fax;

  public static final String SERIALIZED_NAME_NOTES = "notes";

  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_BANK_IBAN = "bank_iban";

  @SerializedName(SERIALIZED_NAME_BANK_IBAN)
  private String bankIban;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";

  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";

  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public Supplier() {}

  public Supplier id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Supplier id
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

  public Supplier code(String code) {

    this.code = code;
    return this;
  }

  /**
   * Supplier code
   *
   * @return code
   */
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Supplier name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Supplier name
   *
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Supplier type(SupplierType type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nullable
  public SupplierType getType() {
    return type;
  }

  public void setType(SupplierType type) {
    this.type = type;
  }

  public Supplier firstName(String firstName) {

    this.firstName = firstName;
    return this;
  }

  /**
   * Supplier first name
   *
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Supplier lastName(String lastName) {

    this.lastName = lastName;
    return this;
  }

  /**
   * Supplier last name
   *
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Supplier contactPerson(String contactPerson) {

    this.contactPerson = contactPerson;
    return this;
  }

  /**
   * Supplier contact person
   *
   * @return contactPerson
   */
  @javax.annotation.Nullable
  public String getContactPerson() {
    return contactPerson;
  }

  public void setContactPerson(String contactPerson) {
    this.contactPerson = contactPerson;
  }

  public Supplier vatNumber(String vatNumber) {

    this.vatNumber = vatNumber;
    return this;
  }

  /**
   * Supplier vat number
   *
   * @return vatNumber
   */
  @javax.annotation.Nullable
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public Supplier taxCode(String taxCode) {

    this.taxCode = taxCode;
    return this;
  }

  /**
   * Supplier tax code
   *
   * @return taxCode
   */
  @javax.annotation.Nullable
  public String getTaxCode() {
    return taxCode;
  }

  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }

  public Supplier addressStreet(String addressStreet) {

    this.addressStreet = addressStreet;
    return this;
  }

  /**
   * Supplier street address
   *
   * @return addressStreet
   */
  @javax.annotation.Nullable
  public String getAddressStreet() {
    return addressStreet;
  }

  public void setAddressStreet(String addressStreet) {
    this.addressStreet = addressStreet;
  }

  public Supplier addressPostalCode(String addressPostalCode) {

    this.addressPostalCode = addressPostalCode;
    return this;
  }

  /**
   * Supplier postal code
   *
   * @return addressPostalCode
   */
  @javax.annotation.Nullable
  public String getAddressPostalCode() {
    return addressPostalCode;
  }

  public void setAddressPostalCode(String addressPostalCode) {
    this.addressPostalCode = addressPostalCode;
  }

  public Supplier addressCity(String addressCity) {

    this.addressCity = addressCity;
    return this;
  }

  /**
   * Supplier city
   *
   * @return addressCity
   */
  @javax.annotation.Nullable
  public String getAddressCity() {
    return addressCity;
  }

  public void setAddressCity(String addressCity) {
    this.addressCity = addressCity;
  }

  public Supplier addressProvince(String addressProvince) {

    this.addressProvince = addressProvince;
    return this;
  }

  /**
   * Supplier province
   *
   * @return addressProvince
   */
  @javax.annotation.Nullable
  public String getAddressProvince() {
    return addressProvince;
  }

  public void setAddressProvince(String addressProvince) {
    this.addressProvince = addressProvince;
  }

  public Supplier addressExtra(String addressExtra) {

    this.addressExtra = addressExtra;
    return this;
  }

  /**
   * Supplier address extra info
   *
   * @return addressExtra
   */
  @javax.annotation.Nullable
  public String getAddressExtra() {
    return addressExtra;
  }

  public void setAddressExtra(String addressExtra) {
    this.addressExtra = addressExtra;
  }

  public Supplier country(String country) {

    this.country = country;
    return this;
  }

  /**
   * Supplier country
   *
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Supplier countryIso(String countryIso) {

    this.countryIso = countryIso;
    return this;
  }

  /**
   * Supplier country iso code
   *
   * @return countryIso
   */
  @javax.annotation.Nullable
  public String getCountryIso() {
    return countryIso;
  }

  public void setCountryIso(String countryIso) {
    this.countryIso = countryIso;
  }

  public Supplier email(String email) {

    this.email = email;
    return this;
  }

  /**
   * Supplier email
   *
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Supplier certifiedEmail(String certifiedEmail) {

    this.certifiedEmail = certifiedEmail;
    return this;
  }

  /**
   * Supplier certified email
   *
   * @return certifiedEmail
   */
  @javax.annotation.Nullable
  public String getCertifiedEmail() {
    return certifiedEmail;
  }

  public void setCertifiedEmail(String certifiedEmail) {
    this.certifiedEmail = certifiedEmail;
  }

  public Supplier phone(String phone) {

    this.phone = phone;
    return this;
  }

  /**
   * Supplier phone
   *
   * @return phone
   */
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Supplier fax(String fax) {

    this.fax = fax;
    return this;
  }

  /**
   * Supplier fax
   *
   * @return fax
   */
  @javax.annotation.Nullable
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public Supplier notes(String notes) {

    this.notes = notes;
    return this;
  }

  /**
   * Supplier extra notes
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

  public Supplier bankIban(String bankIban) {

    this.bankIban = bankIban;
    return this;
  }

  /**
   * Supplier bank IBAN
   *
   * @return bankIban
   */
  @javax.annotation.Nullable
  public String getBankIban() {
    return bankIban;
  }

  public void setBankIban(String bankIban) {
    this.bankIban = bankIban;
  }

  public Supplier createdAt(String createdAt) {

    this.createdAt = createdAt;
    return this;
  }

  /**
   * Supplier creation date
   *
   * @return createdAt
   */
  @javax.annotation.Nullable
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Supplier updatedAt(String updatedAt) {

    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Supplier last update date
   *
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Supplier supplier = (Supplier) o;
    return Objects.equals(this.id, supplier.id)
        && Objects.equals(this.code, supplier.code)
        && Objects.equals(this.name, supplier.name)
        && Objects.equals(this.type, supplier.type)
        && Objects.equals(this.firstName, supplier.firstName)
        && Objects.equals(this.lastName, supplier.lastName)
        && Objects.equals(this.contactPerson, supplier.contactPerson)
        && Objects.equals(this.vatNumber, supplier.vatNumber)
        && Objects.equals(this.taxCode, supplier.taxCode)
        && Objects.equals(this.addressStreet, supplier.addressStreet)
        && Objects.equals(this.addressPostalCode, supplier.addressPostalCode)
        && Objects.equals(this.addressCity, supplier.addressCity)
        && Objects.equals(this.addressProvince, supplier.addressProvince)
        && Objects.equals(this.addressExtra, supplier.addressExtra)
        && Objects.equals(this.country, supplier.country)
        && Objects.equals(this.countryIso, supplier.countryIso)
        && Objects.equals(this.email, supplier.email)
        && Objects.equals(this.certifiedEmail, supplier.certifiedEmail)
        && Objects.equals(this.phone, supplier.phone)
        && Objects.equals(this.fax, supplier.fax)
        && Objects.equals(this.notes, supplier.notes)
        && Objects.equals(this.bankIban, supplier.bankIban)
        && Objects.equals(this.createdAt, supplier.createdAt)
        && Objects.equals(this.updatedAt, supplier.updatedAt);
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
        code,
        name,
        type,
        firstName,
        lastName,
        contactPerson,
        vatNumber,
        taxCode,
        addressStreet,
        addressPostalCode,
        addressCity,
        addressProvince,
        addressExtra,
        country,
        countryIso,
        email,
        certifiedEmail,
        phone,
        fax,
        notes,
        bankIban,
        createdAt,
        updatedAt);
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
    sb.append("class Supplier {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    contactPerson: ").append(toIndentedString(contactPerson)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    addressStreet: ").append(toIndentedString(addressStreet)).append("\n");
    sb.append("    addressPostalCode: ").append(toIndentedString(addressPostalCode)).append("\n");
    sb.append("    addressCity: ").append(toIndentedString(addressCity)).append("\n");
    sb.append("    addressProvince: ").append(toIndentedString(addressProvince)).append("\n");
    sb.append("    addressExtra: ").append(toIndentedString(addressExtra)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryIso: ").append(toIndentedString(countryIso)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    certifiedEmail: ").append(toIndentedString(certifiedEmail)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    bankIban: ").append(toIndentedString(bankIban)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
