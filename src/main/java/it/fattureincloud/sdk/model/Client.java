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
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Client */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-03-05T15:34:38.736484Z[Etc/UTC]")
public class Client implements Serializable {
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
  private ClientType type;

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

  public static final String SERIALIZED_NAME_DEFAULT_VAT = "default_vat";

  @SerializedName(SERIALIZED_NAME_DEFAULT_VAT)
  private VatType defaultVat;

  public static final String SERIALIZED_NAME_DEFAULT_PAYMENT_TERMS = "default_payment_terms";

  @SerializedName(SERIALIZED_NAME_DEFAULT_PAYMENT_TERMS)
  private Integer defaultPaymentTerms;

  public static final String SERIALIZED_NAME_DEFAULT_PAYMENT_TERMS_TYPE =
      "default_payment_terms_type";

  @SerializedName(SERIALIZED_NAME_DEFAULT_PAYMENT_TERMS_TYPE)
  private PaymentTermsType defaultPaymentTermsType = PaymentTermsType.STANDARD;

  public static final String SERIALIZED_NAME_DEFAULT_PAYMENT_METHOD = "default_payment_method";

  @SerializedName(SERIALIZED_NAME_DEFAULT_PAYMENT_METHOD)
  private PaymentMethod defaultPaymentMethod;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";

  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_BANK_IBAN = "bank_iban";

  @SerializedName(SERIALIZED_NAME_BANK_IBAN)
  private String bankIban;

  public static final String SERIALIZED_NAME_BANK_SWIFT_CODE = "bank_swift_code";

  @SerializedName(SERIALIZED_NAME_BANK_SWIFT_CODE)
  private String bankSwiftCode;

  public static final String SERIALIZED_NAME_SHIPPING_ADDRESS = "shipping_address";

  @SerializedName(SERIALIZED_NAME_SHIPPING_ADDRESS)
  private String shippingAddress;

  public static final String SERIALIZED_NAME_E_INVOICE = "e_invoice";

  @SerializedName(SERIALIZED_NAME_E_INVOICE)
  private Boolean eInvoice;

  public static final String SERIALIZED_NAME_EI_CODE = "ei_code";

  @SerializedName(SERIALIZED_NAME_EI_CODE)
  private String eiCode;

  public static final String SERIALIZED_NAME_DISCOUNT_HIGHLIGHT = "discount_highlight";

  @SerializedName(SERIALIZED_NAME_DISCOUNT_HIGHLIGHT)
  private Boolean discountHighlight;

  public static final String SERIALIZED_NAME_DEFAULT_DISCOUNT = "default_discount";

  @SerializedName(SERIALIZED_NAME_DEFAULT_DISCOUNT)
  private BigDecimal defaultDiscount;

  public static final String SERIALIZED_NAME_HAS_INTENT_DECLARATION = "has_intent_declaration";

  @SerializedName(SERIALIZED_NAME_HAS_INTENT_DECLARATION)
  private Boolean hasIntentDeclaration;

  public static final String SERIALIZED_NAME_INTENT_DECLARATION_PROTOCOL_NUMBER =
      "intent_declaration_protocol_number";

  @SerializedName(SERIALIZED_NAME_INTENT_DECLARATION_PROTOCOL_NUMBER)
  private String intentDeclarationProtocolNumber;

  public static final String SERIALIZED_NAME_INTENT_DECLARATION_PROTOCOL_DATE =
      "intent_declaration_protocol_date";

  @SerializedName(SERIALIZED_NAME_INTENT_DECLARATION_PROTOCOL_DATE)
  private LocalDate intentDeclarationProtocolDate;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";

  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";

  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public Client() {}

  public Client id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Client id
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

  public Client code(String code) {

    this.code = code;
    return this;
  }

  /**
   * Client code
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

  public Client name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Client name
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

  public Client type(ClientType type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nullable
  public ClientType getType() {
    return type;
  }

  public void setType(ClientType type) {
    this.type = type;
  }

  public Client firstName(String firstName) {

    this.firstName = firstName;
    return this;
  }

  /**
   * Client first name
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

  public Client lastName(String lastName) {

    this.lastName = lastName;
    return this;
  }

  /**
   * Client last name
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

  public Client contactPerson(String contactPerson) {

    this.contactPerson = contactPerson;
    return this;
  }

  /**
   * Client contact person
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

  public Client vatNumber(String vatNumber) {

    this.vatNumber = vatNumber;
    return this;
  }

  /**
   * Client vat number
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

  public Client taxCode(String taxCode) {

    this.taxCode = taxCode;
    return this;
  }

  /**
   * Client tax code
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

  public Client addressStreet(String addressStreet) {

    this.addressStreet = addressStreet;
    return this;
  }

  /**
   * Client address street
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

  public Client addressPostalCode(String addressPostalCode) {

    this.addressPostalCode = addressPostalCode;
    return this;
  }

  /**
   * Client address postal code
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

  public Client addressCity(String addressCity) {

    this.addressCity = addressCity;
    return this;
  }

  /**
   * Client address city
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

  public Client addressProvince(String addressProvince) {

    this.addressProvince = addressProvince;
    return this;
  }

  /**
   * Client address province
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

  public Client addressExtra(String addressExtra) {

    this.addressExtra = addressExtra;
    return this;
  }

  /**
   * Client address extra info
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

  public Client country(String country) {

    this.country = country;
    return this;
  }

  /**
   * Client country
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

  public Client countryIso(String countryIso) {

    this.countryIso = countryIso;
    return this;
  }

  /**
   * Client country iso code
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

  public Client email(String email) {

    this.email = email;
    return this;
  }

  /**
   * Client email
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

  public Client certifiedEmail(String certifiedEmail) {

    this.certifiedEmail = certifiedEmail;
    return this;
  }

  /**
   * Client certified email
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

  public Client phone(String phone) {

    this.phone = phone;
    return this;
  }

  /**
   * Client phone
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

  public Client fax(String fax) {

    this.fax = fax;
    return this;
  }

  /**
   * Client fax
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

  public Client notes(String notes) {

    this.notes = notes;
    return this;
  }

  /**
   * Client extra
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

  public Client defaultVat(VatType defaultVat) {

    this.defaultVat = defaultVat;
    return this;
  }

  /**
   * Get defaultVat
   *
   * @return defaultVat
   */
  @javax.annotation.Nullable
  public VatType getDefaultVat() {
    return defaultVat;
  }

  public void setDefaultVat(VatType defaultVat) {
    this.defaultVat = defaultVat;
  }

  public Client defaultPaymentTerms(Integer defaultPaymentTerms) {

    this.defaultPaymentTerms = defaultPaymentTerms;
    return this;
  }

  /**
   * Client default payment terms
   *
   * @return defaultPaymentTerms
   */
  @javax.annotation.Nullable
  public Integer getDefaultPaymentTerms() {
    return defaultPaymentTerms;
  }

  public void setDefaultPaymentTerms(Integer defaultPaymentTerms) {
    this.defaultPaymentTerms = defaultPaymentTerms;
  }

  public Client defaultPaymentTermsType(PaymentTermsType defaultPaymentTermsType) {

    this.defaultPaymentTermsType = defaultPaymentTermsType;
    return this;
  }

  /**
   * Get defaultPaymentTermsType
   *
   * @return defaultPaymentTermsType
   */
  @javax.annotation.Nullable
  public PaymentTermsType getDefaultPaymentTermsType() {
    return defaultPaymentTermsType;
  }

  public void setDefaultPaymentTermsType(PaymentTermsType defaultPaymentTermsType) {
    this.defaultPaymentTermsType = defaultPaymentTermsType;
  }

  public Client defaultPaymentMethod(PaymentMethod defaultPaymentMethod) {

    this.defaultPaymentMethod = defaultPaymentMethod;
    return this;
  }

  /**
   * Get defaultPaymentMethod
   *
   * @return defaultPaymentMethod
   */
  @javax.annotation.Nullable
  public PaymentMethod getDefaultPaymentMethod() {
    return defaultPaymentMethod;
  }

  public void setDefaultPaymentMethod(PaymentMethod defaultPaymentMethod) {
    this.defaultPaymentMethod = defaultPaymentMethod;
  }

  public Client bankName(String bankName) {

    this.bankName = bankName;
    return this;
  }

  /**
   * Client bank name
   *
   * @return bankName
   */
  @javax.annotation.Nullable
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public Client bankIban(String bankIban) {

    this.bankIban = bankIban;
    return this;
  }

  /**
   * Client bank iban
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

  public Client bankSwiftCode(String bankSwiftCode) {

    this.bankSwiftCode = bankSwiftCode;
    return this;
  }

  /**
   * Client bank swift code
   *
   * @return bankSwiftCode
   */
  @javax.annotation.Nullable
  public String getBankSwiftCode() {
    return bankSwiftCode;
  }

  public void setBankSwiftCode(String bankSwiftCode) {
    this.bankSwiftCode = bankSwiftCode;
  }

  public Client shippingAddress(String shippingAddress) {

    this.shippingAddress = shippingAddress;
    return this;
  }

  /**
   * Client shipping address
   *
   * @return shippingAddress
   */
  @javax.annotation.Nullable
  public String getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public Client eInvoice(Boolean eInvoice) {

    this.eInvoice = eInvoice;
    return this;
  }

  /**
   * Use e-invoices for this entity
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

  public Client eiCode(String eiCode) {

    this.eiCode = eiCode;
    return this;
  }

  /**
   * Client e-invoice code
   *
   * @return eiCode
   */
  @javax.annotation.Nullable
  public String getEiCode() {
    return eiCode;
  }

  public void setEiCode(String eiCode) {
    this.eiCode = eiCode;
  }

  public Client discountHighlight(Boolean discountHighlight) {

    this.discountHighlight = discountHighlight;
    return this;
  }

  /**
   * Highlight Discount
   *
   * @return discountHighlight
   */
  @javax.annotation.Nullable
  public Boolean getDiscountHighlight() {
    return discountHighlight;
  }

  public void setDiscountHighlight(Boolean discountHighlight) {
    this.discountHighlight = discountHighlight;
  }

  public Client defaultDiscount(BigDecimal defaultDiscount) {

    this.defaultDiscount = defaultDiscount;
    return this;
  }

  /**
   * Client default discount
   *
   * @return defaultDiscount
   */
  @javax.annotation.Nullable
  public BigDecimal getDefaultDiscount() {
    return defaultDiscount;
  }

  public void setDefaultDiscount(BigDecimal defaultDiscount) {
    this.defaultDiscount = defaultDiscount;
  }

  public Client hasIntentDeclaration(Boolean hasIntentDeclaration) {

    this.hasIntentDeclaration = hasIntentDeclaration;
    return this;
  }

  /**
   * Client has intent declaration
   *
   * @return hasIntentDeclaration
   */
  @javax.annotation.Nullable
  public Boolean getHasIntentDeclaration() {
    return hasIntentDeclaration;
  }

  public void setHasIntentDeclaration(Boolean hasIntentDeclaration) {
    this.hasIntentDeclaration = hasIntentDeclaration;
  }

  public Client intentDeclarationProtocolNumber(String intentDeclarationProtocolNumber) {

    this.intentDeclarationProtocolNumber = intentDeclarationProtocolNumber;
    return this;
  }

  /**
   * Client intent declaration protocol number
   *
   * @return intentDeclarationProtocolNumber
   */
  @javax.annotation.Nullable
  public String getIntentDeclarationProtocolNumber() {
    return intentDeclarationProtocolNumber;
  }

  public void setIntentDeclarationProtocolNumber(String intentDeclarationProtocolNumber) {
    this.intentDeclarationProtocolNumber = intentDeclarationProtocolNumber;
  }

  public Client intentDeclarationProtocolDate(LocalDate intentDeclarationProtocolDate) {

    this.intentDeclarationProtocolDate = intentDeclarationProtocolDate;
    return this;
  }

  /**
   * Client intent declaration protocol date
   *
   * @return intentDeclarationProtocolDate
   */
  @javax.annotation.Nullable
  public LocalDate getIntentDeclarationProtocolDate() {
    return intentDeclarationProtocolDate;
  }

  public void setIntentDeclarationProtocolDate(LocalDate intentDeclarationProtocolDate) {
    this.intentDeclarationProtocolDate = intentDeclarationProtocolDate;
  }

  public Client createdAt(String createdAt) {

    this.createdAt = createdAt;
    return this;
  }

  /**
   * Client creation date
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

  public Client updatedAt(String updatedAt) {

    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Client last update date
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
    Client client = (Client) o;
    return Objects.equals(this.id, client.id)
        && Objects.equals(this.code, client.code)
        && Objects.equals(this.name, client.name)
        && Objects.equals(this.type, client.type)
        && Objects.equals(this.firstName, client.firstName)
        && Objects.equals(this.lastName, client.lastName)
        && Objects.equals(this.contactPerson, client.contactPerson)
        && Objects.equals(this.vatNumber, client.vatNumber)
        && Objects.equals(this.taxCode, client.taxCode)
        && Objects.equals(this.addressStreet, client.addressStreet)
        && Objects.equals(this.addressPostalCode, client.addressPostalCode)
        && Objects.equals(this.addressCity, client.addressCity)
        && Objects.equals(this.addressProvince, client.addressProvince)
        && Objects.equals(this.addressExtra, client.addressExtra)
        && Objects.equals(this.country, client.country)
        && Objects.equals(this.countryIso, client.countryIso)
        && Objects.equals(this.email, client.email)
        && Objects.equals(this.certifiedEmail, client.certifiedEmail)
        && Objects.equals(this.phone, client.phone)
        && Objects.equals(this.fax, client.fax)
        && Objects.equals(this.notes, client.notes)
        && Objects.equals(this.defaultVat, client.defaultVat)
        && Objects.equals(this.defaultPaymentTerms, client.defaultPaymentTerms)
        && Objects.equals(this.defaultPaymentTermsType, client.defaultPaymentTermsType)
        && Objects.equals(this.defaultPaymentMethod, client.defaultPaymentMethod)
        && Objects.equals(this.bankName, client.bankName)
        && Objects.equals(this.bankIban, client.bankIban)
        && Objects.equals(this.bankSwiftCode, client.bankSwiftCode)
        && Objects.equals(this.shippingAddress, client.shippingAddress)
        && Objects.equals(this.eInvoice, client.eInvoice)
        && Objects.equals(this.eiCode, client.eiCode)
        && Objects.equals(this.discountHighlight, client.discountHighlight)
        && Objects.equals(this.defaultDiscount, client.defaultDiscount)
        && Objects.equals(this.hasIntentDeclaration, client.hasIntentDeclaration)
        && Objects.equals(
            this.intentDeclarationProtocolNumber, client.intentDeclarationProtocolNumber)
        && Objects.equals(this.intentDeclarationProtocolDate, client.intentDeclarationProtocolDate)
        && Objects.equals(this.createdAt, client.createdAt)
        && Objects.equals(this.updatedAt, client.updatedAt);
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
        defaultVat,
        defaultPaymentTerms,
        defaultPaymentTermsType,
        defaultPaymentMethod,
        bankName,
        bankIban,
        bankSwiftCode,
        shippingAddress,
        eInvoice,
        eiCode,
        discountHighlight,
        defaultDiscount,
        hasIntentDeclaration,
        intentDeclarationProtocolNumber,
        intentDeclarationProtocolDate,
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
    sb.append("class Client {\n");
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
    sb.append("    defaultVat: ").append(toIndentedString(defaultVat)).append("\n");
    sb.append("    defaultPaymentTerms: ")
        .append(toIndentedString(defaultPaymentTerms))
        .append("\n");
    sb.append("    defaultPaymentTermsType: ")
        .append(toIndentedString(defaultPaymentTermsType))
        .append("\n");
    sb.append("    defaultPaymentMethod: ")
        .append(toIndentedString(defaultPaymentMethod))
        .append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankIban: ").append(toIndentedString(bankIban)).append("\n");
    sb.append("    bankSwiftCode: ").append(toIndentedString(bankSwiftCode)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    eInvoice: ").append(toIndentedString(eInvoice)).append("\n");
    sb.append("    eiCode: ").append(toIndentedString(eiCode)).append("\n");
    sb.append("    discountHighlight: ").append(toIndentedString(discountHighlight)).append("\n");
    sb.append("    defaultDiscount: ").append(toIndentedString(defaultDiscount)).append("\n");
    sb.append("    hasIntentDeclaration: ")
        .append(toIndentedString(hasIntentDeclaration))
        .append("\n");
    sb.append("    intentDeclarationProtocolNumber: ")
        .append(toIndentedString(intentDeclarationProtocolNumber))
        .append("\n");
    sb.append("    intentDeclarationProtocolDate: ")
        .append(toIndentedString(intentDeclarationProtocolDate))
        .append("\n");
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
