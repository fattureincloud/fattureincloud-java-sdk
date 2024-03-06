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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Receipt */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-03-06T07:36:30.776640Z[Etc/UTC]")
public class Receipt implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DATE = "date";

  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_NUMBER = "number";

  @SerializedName(SERIALIZED_NAME_NUMBER)
  private BigDecimal number;

  public static final String SERIALIZED_NAME_NUMERATION = "numeration";

  @SerializedName(SERIALIZED_NAME_NUMERATION)
  private String numeration;

  public static final String SERIALIZED_NAME_AMOUNT_NET = "amount_net";

  @SerializedName(SERIALIZED_NAME_AMOUNT_NET)
  private BigDecimal amountNet;

  public static final String SERIALIZED_NAME_AMOUNT_VAT = "amount_vat";

  @SerializedName(SERIALIZED_NAME_AMOUNT_VAT)
  private BigDecimal amountVat;

  public static final String SERIALIZED_NAME_AMOUNT_GROSS = "amount_gross";

  @SerializedName(SERIALIZED_NAME_AMOUNT_GROSS)
  private BigDecimal amountGross;

  public static final String SERIALIZED_NAME_USE_GROSS_PRICES = "use_gross_prices";

  @SerializedName(SERIALIZED_NAME_USE_GROSS_PRICES)
  private Boolean useGrossPrices;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private ReceiptType type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RC_CENTER = "rc_center";

  @SerializedName(SERIALIZED_NAME_RC_CENTER)
  private String rcCenter;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";

  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";

  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT = "payment_account";

  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT)
  private PaymentAccount paymentAccount;

  public static final String SERIALIZED_NAME_ITEMS_LIST = "items_list";

  @SerializedName(SERIALIZED_NAME_ITEMS_LIST)
  private List<ReceiptItemsListItem> itemsList;

  public Receipt() {}

  public Receipt id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Receipt id
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

  public Receipt date(LocalDate date) {

    this.date = date;
    return this;
  }

  /**
   * Receipt date
   *
   * @return date
   */
  @javax.annotation.Nullable
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Receipt number(BigDecimal number) {

    this.number = number;
    return this;
  }

  /**
   * Receipt number
   *
   * @return number
   */
  @javax.annotation.Nullable
  public BigDecimal getNumber() {
    return number;
  }

  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  public Receipt numeration(String numeration) {

    this.numeration = numeration;
    return this;
  }

  /**
   * Receipt numeration
   *
   * @return numeration
   */
  @javax.annotation.Nullable
  public String getNumeration() {
    return numeration;
  }

  public void setNumeration(String numeration) {
    this.numeration = numeration;
  }

  public Receipt amountNet(BigDecimal amountNet) {

    this.amountNet = amountNet;
    return this;
  }

  /**
   * Receipt total net amount
   *
   * @return amountNet
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountNet() {
    return amountNet;
  }

  public void setAmountNet(BigDecimal amountNet) {
    this.amountNet = amountNet;
  }

  public Receipt amountVat(BigDecimal amountVat) {

    this.amountVat = amountVat;
    return this;
  }

  /**
   * Receipt total vat amount
   *
   * @return amountVat
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountVat() {
    return amountVat;
  }

  public void setAmountVat(BigDecimal amountVat) {
    this.amountVat = amountVat;
  }

  public Receipt amountGross(BigDecimal amountGross) {

    this.amountGross = amountGross;
    return this;
  }

  /**
   * Receipt total gross amount
   *
   * @return amountGross
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountGross() {
    return amountGross;
  }

  public void setAmountGross(BigDecimal amountGross) {
    this.amountGross = amountGross;
  }

  public Receipt useGrossPrices(Boolean useGrossPrices) {

    this.useGrossPrices = useGrossPrices;
    return this;
  }

  /**
   * Receipt uses gross prices
   *
   * @return useGrossPrices
   */
  @javax.annotation.Nullable
  public Boolean getUseGrossPrices() {
    return useGrossPrices;
  }

  public void setUseGrossPrices(Boolean useGrossPrices) {
    this.useGrossPrices = useGrossPrices;
  }

  public Receipt type(ReceiptType type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nullable
  public ReceiptType getType() {
    return type;
  }

  public void setType(ReceiptType type) {
    this.type = type;
  }

  public Receipt description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Receipt description
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

  public Receipt rcCenter(String rcCenter) {

    this.rcCenter = rcCenter;
    return this;
  }

  /**
   * Receipt revenue center
   *
   * @return rcCenter
   */
  @javax.annotation.Nullable
  public String getRcCenter() {
    return rcCenter;
  }

  public void setRcCenter(String rcCenter) {
    this.rcCenter = rcCenter;
  }

  public Receipt createdAt(String createdAt) {

    this.createdAt = createdAt;
    return this;
  }

  /**
   * Receipt creation date
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

  public Receipt updatedAt(String updatedAt) {

    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Receipt last update date
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

  public Receipt paymentAccount(PaymentAccount paymentAccount) {

    this.paymentAccount = paymentAccount;
    return this;
  }

  /**
   * Get paymentAccount
   *
   * @return paymentAccount
   */
  @javax.annotation.Nullable
  public PaymentAccount getPaymentAccount() {
    return paymentAccount;
  }

  public void setPaymentAccount(PaymentAccount paymentAccount) {
    this.paymentAccount = paymentAccount;
  }

  public Receipt itemsList(List<ReceiptItemsListItem> itemsList) {

    this.itemsList = itemsList;
    return this;
  }

  public Receipt addItemsListItem(ReceiptItemsListItem itemsListItem) {
    if (this.itemsList == null) {
      this.itemsList = new ArrayList<>();
    }
    this.itemsList.add(itemsListItem);
    return this;
  }

  /**
   * Get itemsList
   *
   * @return itemsList
   */
  @javax.annotation.Nullable
  public List<ReceiptItemsListItem> getItemsList() {
    return itemsList;
  }

  public void setItemsList(List<ReceiptItemsListItem> itemsList) {
    this.itemsList = itemsList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Receipt receipt = (Receipt) o;
    return Objects.equals(this.id, receipt.id)
        && Objects.equals(this.date, receipt.date)
        && Objects.equals(this.number, receipt.number)
        && Objects.equals(this.numeration, receipt.numeration)
        && Objects.equals(this.amountNet, receipt.amountNet)
        && Objects.equals(this.amountVat, receipt.amountVat)
        && Objects.equals(this.amountGross, receipt.amountGross)
        && Objects.equals(this.useGrossPrices, receipt.useGrossPrices)
        && Objects.equals(this.type, receipt.type)
        && Objects.equals(this.description, receipt.description)
        && Objects.equals(this.rcCenter, receipt.rcCenter)
        && Objects.equals(this.createdAt, receipt.createdAt)
        && Objects.equals(this.updatedAt, receipt.updatedAt)
        && Objects.equals(this.paymentAccount, receipt.paymentAccount)
        && Objects.equals(this.itemsList, receipt.itemsList);
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
        date,
        number,
        numeration,
        amountNet,
        amountVat,
        amountGross,
        useGrossPrices,
        type,
        description,
        rcCenter,
        createdAt,
        updatedAt,
        paymentAccount,
        itemsList);
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
    sb.append("class Receipt {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numeration: ").append(toIndentedString(numeration)).append("\n");
    sb.append("    amountNet: ").append(toIndentedString(amountNet)).append("\n");
    sb.append("    amountVat: ").append(toIndentedString(amountVat)).append("\n");
    sb.append("    amountGross: ").append(toIndentedString(amountGross)).append("\n");
    sb.append("    useGrossPrices: ").append(toIndentedString(useGrossPrices)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rcCenter: ").append(toIndentedString(rcCenter)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    paymentAccount: ").append(toIndentedString(paymentAccount)).append("\n");
    sb.append("    itemsList: ").append(toIndentedString(itemsList)).append("\n");
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
