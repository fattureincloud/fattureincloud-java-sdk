/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.15
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
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@ApiModel(description = "")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-05-02T14:07:51.629401Z[GMT]")
public class PaymentAccount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private PaymentAccountType type = PaymentAccountType.STANDARD;

  public static final String SERIALIZED_NAME_IBAN = "iban";

  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_SIA = "sia";

  @SerializedName(SERIALIZED_NAME_SIA)
  private String sia;

  public static final String SERIALIZED_NAME_CUC = "cuc";

  @SerializedName(SERIALIZED_NAME_CUC)
  private String cuc;

  public static final String SERIALIZED_NAME_VIRTUAL = "virtual";

  @SerializedName(SERIALIZED_NAME_VIRTUAL)
  private Boolean virtual;

  public PaymentAccount() {}

  public PaymentAccount id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Unique identifier
   *
   * @return id
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PaymentAccount name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Payment account name.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Conto Banca Intesa", value = "Payment account name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PaymentAccount type(PaymentAccountType type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public PaymentAccountType getType() {
    return type;
  }

  public void setType(PaymentAccountType type) {
    this.type = type;
  }

  public PaymentAccount iban(String iban) {

    this.iban = iban;
    return this;
  }

  /**
   * Payment account iban.
   *
   * @return iban
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment account iban.")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public PaymentAccount sia(String sia) {

    this.sia = sia;
    return this;
  }

  /**
   * Payment account sia.
   *
   * @return sia
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment account sia.")
  public String getSia() {
    return sia;
  }

  public void setSia(String sia) {
    this.sia = sia;
  }

  public PaymentAccount cuc(String cuc) {

    this.cuc = cuc;
    return this;
  }

  /**
   * Payment account cuc.
   *
   * @return cuc
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment account cuc.")
  public String getCuc() {
    return cuc;
  }

  public void setCuc(String cuc) {
    this.cuc = cuc;
  }

  public PaymentAccount virtual(Boolean virtual) {

    this.virtual = virtual;
    return this;
  }

  /**
   * Determine if the payment method is virtual.
   *
   * @return virtual
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determine if the payment method is virtual.")
  public Boolean getVirtual() {
    return virtual;
  }

  public void setVirtual(Boolean virtual) {
    this.virtual = virtual;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAccount paymentAccount = (PaymentAccount) o;
    return Objects.equals(this.id, paymentAccount.id)
        && Objects.equals(this.name, paymentAccount.name)
        && Objects.equals(this.type, paymentAccount.type)
        && Objects.equals(this.iban, paymentAccount.iban)
        && Objects.equals(this.sia, paymentAccount.sia)
        && Objects.equals(this.cuc, paymentAccount.cuc)
        && Objects.equals(this.virtual, paymentAccount.virtual);
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
    return Objects.hash(id, name, type, iban, sia, cuc, virtual);
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
    sb.append("class PaymentAccount {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    sia: ").append(toIndentedString(sia)).append("\n");
    sb.append("    cuc: ").append(toIndentedString(cuc)).append("\n");
    sb.append("    virtual: ").append(toIndentedString(virtual)).append("\n");
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
