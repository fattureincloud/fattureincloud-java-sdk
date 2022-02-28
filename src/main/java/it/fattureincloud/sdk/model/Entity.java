/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.13
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-22T10:45:37.104Z[Etc/UTC]")
public class Entity implements Serializable {
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
  private EntityType type;

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

  public static final String SERIALIZED_NAME_DEFAULT_PAYMENT_TERMS_TYPE = "default_payment_terms_type";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PAYMENT_TERMS_TYPE)
  private DefaultPaymentTermsType defaultPaymentTermsType = DefaultPaymentTermsType.STANDARD;

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

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;


  public Entity id(Integer id) {
    
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


  public Entity code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Code.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "Code.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public Entity name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Rossi S.r.l.", value = "Name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Entity type(EntityType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityType getType() {
    return type;
  }


  public void setType(EntityType type) {
    this.type = type;
  }


  public Entity firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First name.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Entity lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last name.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public Entity contactPerson(String contactPerson) {
    
    this.contactPerson = contactPerson;
    return this;
  }

   /**
   * Get contactPerson
   * @return contactPerson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContactPerson() {
    return contactPerson;
  }


  public void setContactPerson(String contactPerson) {
    this.contactPerson = contactPerson;
  }


  public Entity vatNumber(String vatNumber) {
    
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * Vat number
   * @return vatNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IT01234567890", value = "Vat number")

  public String getVatNumber() {
    return vatNumber;
  }


  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }


  public Entity taxCode(String taxCode) {
    
    this.taxCode = taxCode;
    return this;
  }

   /**
   * Tax code.
   * @return taxCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RSSMRA44A12E890Q", value = "Tax code.")

  public String getTaxCode() {
    return taxCode;
  }


  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }


  public Entity addressStreet(String addressStreet) {
    
    this.addressStreet = addressStreet;
    return this;
  }

   /**
   * Street address.
   * @return addressStreet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Via dei tigli, 12", value = "Street address.")

  public String getAddressStreet() {
    return addressStreet;
  }


  public void setAddressStreet(String addressStreet) {
    this.addressStreet = addressStreet;
  }


  public Entity addressPostalCode(String addressPostalCode) {
    
    this.addressPostalCode = addressPostalCode;
    return this;
  }

   /**
   * Postal code.
   * @return addressPostalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "24010", value = "Postal code.")

  public String getAddressPostalCode() {
    return addressPostalCode;
  }


  public void setAddressPostalCode(String addressPostalCode) {
    this.addressPostalCode = addressPostalCode;
  }


  public Entity addressCity(String addressCity) {
    
    this.addressCity = addressCity;
    return this;
  }

   /**
   * City.
   * @return addressCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bergamo", value = "City.")

  public String getAddressCity() {
    return addressCity;
  }


  public void setAddressCity(String addressCity) {
    this.addressCity = addressCity;
  }


  public Entity addressProvince(String addressProvince) {
    
    this.addressProvince = addressProvince;
    return this;
  }

   /**
   * Province.
   * @return addressProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BG", value = "Province.")

  public String getAddressProvince() {
    return addressProvince;
  }


  public void setAddressProvince(String addressProvince) {
    this.addressProvince = addressProvince;
  }


  public Entity addressExtra(String addressExtra) {
    
    this.addressExtra = addressExtra;
    return this;
  }

   /**
   * Address extra info.
   * @return addressExtra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address extra info.")

  public String getAddressExtra() {
    return addressExtra;
  }


  public void setAddressExtra(String addressExtra) {
    this.addressExtra = addressExtra;
  }


  public Entity country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Italia", value = "Country")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public Entity email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mario.rossi@example.it", value = "Email.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public Entity certifiedEmail(String certifiedEmail) {
    
    this.certifiedEmail = certifiedEmail;
    return this;
  }

   /**
   * Certified email.
   * @return certifiedEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mario.rossi@pec.example.it", value = "Certified email.")

  public String getCertifiedEmail() {
    return certifiedEmail;
  }


  public void setCertifiedEmail(String certifiedEmail) {
    this.certifiedEmail = certifiedEmail;
  }


  public Entity phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone.
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone.")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public Entity fax(String fax) {
    
    this.fax = fax;
    return this;
  }

   /**
   * Fax.
   * @return fax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fax.")

  public String getFax() {
    return fax;
  }


  public void setFax(String fax) {
    this.fax = fax;
  }


  public Entity notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Extra notes.
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extra notes.")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    this.notes = notes;
  }


  public Entity defaultVat(VatType defaultVat) {
    
    this.defaultVat = defaultVat;
    return this;
  }

   /**
   * Get defaultVat
   * @return defaultVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VatType getDefaultVat() {
    return defaultVat;
  }


  public void setDefaultVat(VatType defaultVat) {
    this.defaultVat = defaultVat;
  }


  public Entity defaultPaymentTerms(Integer defaultPaymentTerms) {
    
    this.defaultPaymentTerms = defaultPaymentTerms;
    return this;
  }

   /**
   * [Only for client] Default payment terms.
   * @return defaultPaymentTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "[Only for client] Default payment terms.")

  public Integer getDefaultPaymentTerms() {
    return defaultPaymentTerms;
  }


  public void setDefaultPaymentTerms(Integer defaultPaymentTerms) {
    this.defaultPaymentTerms = defaultPaymentTerms;
  }


  public Entity defaultPaymentTermsType(DefaultPaymentTermsType defaultPaymentTermsType) {
    
    this.defaultPaymentTermsType = defaultPaymentTermsType;
    return this;
  }

   /**
   * Get defaultPaymentTermsType
   * @return defaultPaymentTermsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DefaultPaymentTermsType getDefaultPaymentTermsType() {
    return defaultPaymentTermsType;
  }


  public void setDefaultPaymentTermsType(DefaultPaymentTermsType defaultPaymentTermsType) {
    this.defaultPaymentTermsType = defaultPaymentTermsType;
  }


  public Entity defaultPaymentMethod(PaymentMethod defaultPaymentMethod) {
    
    this.defaultPaymentMethod = defaultPaymentMethod;
    return this;
  }

   /**
   * Get defaultPaymentMethod
   * @return defaultPaymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentMethod getDefaultPaymentMethod() {
    return defaultPaymentMethod;
  }


  public void setDefaultPaymentMethod(PaymentMethod defaultPaymentMethod) {
    this.defaultPaymentMethod = defaultPaymentMethod;
  }


  public Entity bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * [Only for client] Bank name.
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Only for client] Bank name.")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public Entity bankIban(String bankIban) {
    
    this.bankIban = bankIban;
    return this;
  }

   /**
   * [Only for client] Iban.
   * @return bankIban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Only for client] Iban.")

  public String getBankIban() {
    return bankIban;
  }


  public void setBankIban(String bankIban) {
    this.bankIban = bankIban;
  }


  public Entity bankSwiftCode(String bankSwiftCode) {
    
    this.bankSwiftCode = bankSwiftCode;
    return this;
  }

   /**
   * [Only for client] Bank swift code.
   * @return bankSwiftCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Only for client] Bank swift code.")

  public String getBankSwiftCode() {
    return bankSwiftCode;
  }


  public void setBankSwiftCode(String bankSwiftCode) {
    this.bankSwiftCode = bankSwiftCode;
  }


  public Entity shippingAddress(String shippingAddress) {
    
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * [Only for client] Shipping address.
   * @return shippingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Only for client] Shipping address.")

  public String getShippingAddress() {
    return shippingAddress;
  }


  public void setShippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  public Entity eInvoice(Boolean eInvoice) {
    
    this.eInvoice = eInvoice;
    return this;
  }

   /**
   * [Only for client] Use e-invoices.
   * @return eInvoice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Only for client] Use e-invoices.")

  public Boolean geteInvoice() {
    return eInvoice;
  }


  public void seteInvoice(Boolean eInvoice) {
    this.eInvoice = eInvoice;
  }


  public Entity eiCode(String eiCode) {
    
    this.eiCode = eiCode;
    return this;
  }

   /**
   * [Only for client] E-invoices code.
   * @return eiCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Only for client] E-invoices code.")

  public String getEiCode() {
    return eiCode;
  }


  public void setEiCode(String eiCode) {
    this.eiCode = eiCode;
  }


  public Entity createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Entity updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    Entity entity = (Entity) o;
    return Objects.equals(this.id, entity.id) &&
        Objects.equals(this.code, entity.code) &&
        Objects.equals(this.name, entity.name) &&
        Objects.equals(this.type, entity.type) &&
        Objects.equals(this.firstName, entity.firstName) &&
        Objects.equals(this.lastName, entity.lastName) &&
        Objects.equals(this.contactPerson, entity.contactPerson) &&
        Objects.equals(this.vatNumber, entity.vatNumber) &&
        Objects.equals(this.taxCode, entity.taxCode) &&
        Objects.equals(this.addressStreet, entity.addressStreet) &&
        Objects.equals(this.addressPostalCode, entity.addressPostalCode) &&
        Objects.equals(this.addressCity, entity.addressCity) &&
        Objects.equals(this.addressProvince, entity.addressProvince) &&
        Objects.equals(this.addressExtra, entity.addressExtra) &&
        Objects.equals(this.country, entity.country) &&
        Objects.equals(this.email, entity.email) &&
        Objects.equals(this.certifiedEmail, entity.certifiedEmail) &&
        Objects.equals(this.phone, entity.phone) &&
        Objects.equals(this.fax, entity.fax) &&
        Objects.equals(this.notes, entity.notes) &&
        Objects.equals(this.defaultVat, entity.defaultVat) &&
        Objects.equals(this.defaultPaymentTerms, entity.defaultPaymentTerms) &&
        Objects.equals(this.defaultPaymentTermsType, entity.defaultPaymentTermsType) &&
        Objects.equals(this.defaultPaymentMethod, entity.defaultPaymentMethod) &&
        Objects.equals(this.bankName, entity.bankName) &&
        Objects.equals(this.bankIban, entity.bankIban) &&
        Objects.equals(this.bankSwiftCode, entity.bankSwiftCode) &&
        Objects.equals(this.shippingAddress, entity.shippingAddress) &&
        Objects.equals(this.eInvoice, entity.eInvoice) &&
        Objects.equals(this.eiCode, entity.eiCode) &&
        Objects.equals(this.createdAt, entity.createdAt) &&
        Objects.equals(this.updatedAt, entity.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, name, type, firstName, lastName, contactPerson, vatNumber, taxCode, addressStreet, addressPostalCode, addressCity, addressProvince, addressExtra, country, email, certifiedEmail, phone, fax, notes, defaultVat, defaultPaymentTerms, defaultPaymentTermsType, defaultPaymentMethod, bankName, bankIban, bankSwiftCode, shippingAddress, eInvoice, eiCode, createdAt, updatedAt);
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
    sb.append("class Entity {\n");
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
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    certifiedEmail: ").append(toIndentedString(certifiedEmail)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    defaultVat: ").append(toIndentedString(defaultVat)).append("\n");
    sb.append("    defaultPaymentTerms: ").append(toIndentedString(defaultPaymentTerms)).append("\n");
    sb.append("    defaultPaymentTermsType: ").append(toIndentedString(defaultPaymentTermsType)).append("\n");
    sb.append("    defaultPaymentMethod: ").append(toIndentedString(defaultPaymentMethod)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankIban: ").append(toIndentedString(bankIban)).append("\n");
    sb.append("    bankSwiftCode: ").append(toIndentedString(bankSwiftCode)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    eInvoice: ").append(toIndentedString(eInvoice)).append("\n");
    sb.append("    eiCode: ").append(toIndentedString(eiCode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

