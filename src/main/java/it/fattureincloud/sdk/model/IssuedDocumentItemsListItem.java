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
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** IssuedDocumentItemsListItem */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-05-02T13:59:15.798929Z[GMT]")
public class IssuedDocumentItemsListItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";

  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_CODE = "code";

  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CATEGORY = "category";

  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_QTY = "qty";

  @SerializedName(SERIALIZED_NAME_QTY)
  private BigDecimal qty;

  public static final String SERIALIZED_NAME_MEASURE = "measure";

  @SerializedName(SERIALIZED_NAME_MEASURE)
  private String measure;

  public static final String SERIALIZED_NAME_NET_PRICE = "net_price";

  @SerializedName(SERIALIZED_NAME_NET_PRICE)
  private BigDecimal netPrice;

  public static final String SERIALIZED_NAME_GROSS_PRICE = "gross_price";

  @SerializedName(SERIALIZED_NAME_GROSS_PRICE)
  private BigDecimal grossPrice;

  public static final String SERIALIZED_NAME_VAT = "vat";

  @SerializedName(SERIALIZED_NAME_VAT)
  private VatType vat;

  public static final String SERIALIZED_NAME_NOT_TAXABLE = "not_taxable";

  @SerializedName(SERIALIZED_NAME_NOT_TAXABLE)
  private Boolean notTaxable;

  public static final String SERIALIZED_NAME_APPLY_WITHHOLDING_TAXES = "apply_withholding_taxes";

  @SerializedName(SERIALIZED_NAME_APPLY_WITHHOLDING_TAXES)
  private Boolean applyWithholdingTaxes;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";

  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private BigDecimal discount;

  public static final String SERIALIZED_NAME_DISCOUNT_HIGHLIGHT = "discount_highlight";

  @SerializedName(SERIALIZED_NAME_DISCOUNT_HIGHLIGHT)
  private Boolean discountHighlight;

  public static final String SERIALIZED_NAME_IN_DDT = "in_ddt";

  @SerializedName(SERIALIZED_NAME_IN_DDT)
  private Boolean inDdt;

  public static final String SERIALIZED_NAME_STOCK = "stock";

  @SerializedName(SERIALIZED_NAME_STOCK)
  private Boolean stock;

  public static final String SERIALIZED_NAME_EI_RAW = "ei_raw";

  @SerializedName(SERIALIZED_NAME_EI_RAW)
  private Object eiRaw;

  public IssuedDocumentItemsListItem() {}

  public IssuedDocumentItemsListItem id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Unique identifier.
   *
   * @return id
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public IssuedDocumentItemsListItem productId(Integer productId) {

    this.productId = productId;
    return this;
  }

  /**
   * Unique identifier of the product.
   *
   * @return productId
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "Unique identifier of the product.")
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public IssuedDocumentItemsListItem code(String code) {

    this.code = code;
    return this;
  }

  /**
   * Product code.
   *
   * @return code
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "239874892374982", value = "Product code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public IssuedDocumentItemsListItem name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Product name.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Water bottle", value = "Product name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IssuedDocumentItemsListItem category(String category) {

    this.category = category;
    return this;
  }

  /**
   * Product category
   *
   * @return category
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public IssuedDocumentItemsListItem description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Product description.
   *
   * @return description
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssuedDocumentItemsListItem qty(BigDecimal qty) {

    this.qty = qty;
    return this;
  }

  /**
   * Items quantity,
   *
   * @return qty
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Items quantity,")
  public BigDecimal getQty() {
    return qty;
  }

  public void setQty(BigDecimal qty) {
    this.qty = qty;
  }

  public IssuedDocumentItemsListItem measure(String measure) {

    this.measure = measure;
    return this;
  }

  /**
   * Item measure.
   *
   * @return measure
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Item measure.")
  public String getMeasure() {
    return measure;
  }

  public void setMeasure(String measure) {
    this.measure = measure;
  }

  public IssuedDocumentItemsListItem netPrice(BigDecimal netPrice) {

    this.netPrice = netPrice;
    return this;
  }

  /**
   * Net price.
   *
   * @return netPrice
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.23", value = "Net price.")
  public BigDecimal getNetPrice() {
    return netPrice;
  }

  public void setNetPrice(BigDecimal netPrice) {
    this.netPrice = netPrice;
  }

  public IssuedDocumentItemsListItem grossPrice(BigDecimal grossPrice) {

    this.grossPrice = grossPrice;
    return this;
  }

  /**
   * Gross price.
   *
   * @return grossPrice
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.45", value = "Gross price.")
  public BigDecimal getGrossPrice() {
    return grossPrice;
  }

  public void setGrossPrice(BigDecimal grossPrice) {
    this.grossPrice = grossPrice;
  }

  public IssuedDocumentItemsListItem vat(VatType vat) {

    this.vat = vat;
    return this;
  }

  /**
   * Get vat
   *
   * @return vat
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public VatType getVat() {
    return vat;
  }

  public void setVat(VatType vat) {
    this.vat = vat;
  }

  public IssuedDocumentItemsListItem notTaxable(Boolean notTaxable) {

    this.notTaxable = notTaxable;
    return this;
  }

  /**
   * Get notTaxable
   *
   * @return notTaxable
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getNotTaxable() {
    return notTaxable;
  }

  public void setNotTaxable(Boolean notTaxable) {
    this.notTaxable = notTaxable;
  }

  public IssuedDocumentItemsListItem applyWithholdingTaxes(Boolean applyWithholdingTaxes) {

    this.applyWithholdingTaxes = applyWithholdingTaxes;
    return this;
  }

  /**
   * Apply withholding taxes, rivalsa and cassa.
   *
   * @return applyWithholdingTaxes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Apply withholding taxes, rivalsa and cassa.")
  public Boolean getApplyWithholdingTaxes() {
    return applyWithholdingTaxes;
  }

  public void setApplyWithholdingTaxes(Boolean applyWithholdingTaxes) {
    this.applyWithholdingTaxes = applyWithholdingTaxes;
  }

  public IssuedDocumentItemsListItem discount(BigDecimal discount) {

    this.discount = discount;
    return this;
  }

  /**
   * Discount percentual value.
   *
   * @return discount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Discount percentual value.")
  public BigDecimal getDiscount() {
    return discount;
  }

  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

  public IssuedDocumentItemsListItem discountHighlight(Boolean discountHighlight) {

    this.discountHighlight = discountHighlight;
    return this;
  }

  /**
   * Get discountHighlight
   *
   * @return discountHighlight
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getDiscountHighlight() {
    return discountHighlight;
  }

  public void setDiscountHighlight(Boolean discountHighlight) {
    this.discountHighlight = discountHighlight;
  }

  public IssuedDocumentItemsListItem inDdt(Boolean inDdt) {

    this.inDdt = inDdt;
    return this;
  }

  /**
   * Get inDdt
   *
   * @return inDdt
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getInDdt() {
    return inDdt;
  }

  public void setInDdt(Boolean inDdt) {
    this.inDdt = inDdt;
  }

  public IssuedDocumentItemsListItem stock(Boolean stock) {

    this.stock = stock;
    return this;
  }

  /**
   * Get stock
   *
   * @return stock
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getStock() {
    return stock;
  }

  public void setStock(Boolean stock) {
    this.stock = stock;
  }

  public IssuedDocumentItemsListItem eiRaw(Object eiRaw) {

    this.eiRaw = eiRaw;
    return this;
  }

  /**
   * Advanced raw attributes for e-invoices.
   *
   * @return eiRaw
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Advanced raw attributes for e-invoices.")
  public Object getEiRaw() {
    return eiRaw;
  }

  public void setEiRaw(Object eiRaw) {
    this.eiRaw = eiRaw;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentItemsListItem issuedDocumentItemsListItem = (IssuedDocumentItemsListItem) o;
    return Objects.equals(this.id, issuedDocumentItemsListItem.id)
        && Objects.equals(this.productId, issuedDocumentItemsListItem.productId)
        && Objects.equals(this.code, issuedDocumentItemsListItem.code)
        && Objects.equals(this.name, issuedDocumentItemsListItem.name)
        && Objects.equals(this.category, issuedDocumentItemsListItem.category)
        && Objects.equals(this.description, issuedDocumentItemsListItem.description)
        && Objects.equals(this.qty, issuedDocumentItemsListItem.qty)
        && Objects.equals(this.measure, issuedDocumentItemsListItem.measure)
        && Objects.equals(this.netPrice, issuedDocumentItemsListItem.netPrice)
        && Objects.equals(this.grossPrice, issuedDocumentItemsListItem.grossPrice)
        && Objects.equals(this.vat, issuedDocumentItemsListItem.vat)
        && Objects.equals(this.notTaxable, issuedDocumentItemsListItem.notTaxable)
        && Objects.equals(
            this.applyWithholdingTaxes, issuedDocumentItemsListItem.applyWithholdingTaxes)
        && Objects.equals(this.discount, issuedDocumentItemsListItem.discount)
        && Objects.equals(this.discountHighlight, issuedDocumentItemsListItem.discountHighlight)
        && Objects.equals(this.inDdt, issuedDocumentItemsListItem.inDdt)
        && Objects.equals(this.stock, issuedDocumentItemsListItem.stock)
        && Objects.equals(this.eiRaw, issuedDocumentItemsListItem.eiRaw);
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
        productId,
        code,
        name,
        category,
        description,
        qty,
        measure,
        netPrice,
        grossPrice,
        vat,
        notTaxable,
        applyWithholdingTaxes,
        discount,
        discountHighlight,
        inDdt,
        stock,
        eiRaw);
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
    sb.append("class IssuedDocumentItemsListItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
    sb.append("    netPrice: ").append(toIndentedString(netPrice)).append("\n");
    sb.append("    grossPrice: ").append(toIndentedString(grossPrice)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    notTaxable: ").append(toIndentedString(notTaxable)).append("\n");
    sb.append("    applyWithholdingTaxes: ")
        .append(toIndentedString(applyWithholdingTaxes))
        .append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    discountHighlight: ").append(toIndentedString(discountHighlight)).append("\n");
    sb.append("    inDdt: ").append(toIndentedString(inDdt)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    eiRaw: ").append(toIndentedString(eiRaw)).append("\n");
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
