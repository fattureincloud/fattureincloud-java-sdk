/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.27
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

/** Product */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-04-18T10:47:06.435Z[Etc/UTC]")
public class Product implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CODE = "code";

  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NET_PRICE = "net_price";

  @SerializedName(SERIALIZED_NAME_NET_PRICE)
  private BigDecimal netPrice;

  public static final String SERIALIZED_NAME_GROSS_PRICE = "gross_price";

  @SerializedName(SERIALIZED_NAME_GROSS_PRICE)
  private BigDecimal grossPrice;

  public static final String SERIALIZED_NAME_USE_GROSS_PRICE = "use_gross_price";

  @SerializedName(SERIALIZED_NAME_USE_GROSS_PRICE)
  private Boolean useGrossPrice;

  public static final String SERIALIZED_NAME_DEFAULT_VAT = "default_vat";

  @SerializedName(SERIALIZED_NAME_DEFAULT_VAT)
  private VatType defaultVat;

  public static final String SERIALIZED_NAME_NET_COST = "net_cost";

  @SerializedName(SERIALIZED_NAME_NET_COST)
  private BigDecimal netCost;

  public static final String SERIALIZED_NAME_MEASURE = "measure";

  @SerializedName(SERIALIZED_NAME_MEASURE)
  private String measure;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CATEGORY = "category";

  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_NOTES = "notes";

  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_IN_STOCK = "in_stock";

  @SerializedName(SERIALIZED_NAME_IN_STOCK)
  private Boolean inStock;

  public static final String SERIALIZED_NAME_STOCK_INITIAL = "stock_initial";

  @SerializedName(SERIALIZED_NAME_STOCK_INITIAL)
  private BigDecimal stockInitial;

  public static final String SERIALIZED_NAME_STOCK_CURRENT = "stock_current";

  @SerializedName(SERIALIZED_NAME_STOCK_CURRENT)
  private BigDecimal stockCurrent;

  public static final String SERIALIZED_NAME_AVERAGE_COST = "average_cost";

  @SerializedName(SERIALIZED_NAME_AVERAGE_COST)
  private BigDecimal averageCost;

  public static final String SERIALIZED_NAME_AVERAGE_PRICE = "average_price";

  @SerializedName(SERIALIZED_NAME_AVERAGE_PRICE)
  private BigDecimal averagePrice;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";

  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";

  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public Product() {}

  public Product(BigDecimal stockCurrent) {
    this();
    this.stockCurrent = stockCurrent;
  }

  public Product id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Unique identifier.
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

  public Product name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Product name.
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

  public Product code(String code) {

    this.code = code;
    return this;
  }

  /**
   * Product code.
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

  public Product netPrice(BigDecimal netPrice) {

    this.netPrice = netPrice;
    return this;
  }

  /**
   * Net sale price (used if use_gross_price is false, otherwise it&#39;s competed automatically).
   *
   * @return netPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getNetPrice() {
    return netPrice;
  }

  public void setNetPrice(BigDecimal netPrice) {
    this.netPrice = netPrice;
  }

  public Product grossPrice(BigDecimal grossPrice) {

    this.grossPrice = grossPrice;
    return this;
  }

  /**
   * Gross sale price (used if use_gross_price is false, otherwise it&#39;s competed automatically).
   *
   * @return grossPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getGrossPrice() {
    return grossPrice;
  }

  public void setGrossPrice(BigDecimal grossPrice) {
    this.grossPrice = grossPrice;
  }

  public Product useGrossPrice(Boolean useGrossPrice) {

    this.useGrossPrice = useGrossPrice;
    return this;
  }

  /**
   * Determine which price to use for calculations.
   *
   * @return useGrossPrice
   */
  @javax.annotation.Nullable
  public Boolean getUseGrossPrice() {
    return useGrossPrice;
  }

  public void setUseGrossPrice(Boolean useGrossPrice) {
    this.useGrossPrice = useGrossPrice;
  }

  public Product defaultVat(VatType defaultVat) {

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

  public Product netCost(BigDecimal netCost) {

    this.netCost = netCost;
    return this;
  }

  /**
   * Net cost of the product (used for received documents).
   *
   * @return netCost
   */
  @javax.annotation.Nullable
  public BigDecimal getNetCost() {
    return netCost;
  }

  public void setNetCost(BigDecimal netCost) {
    this.netCost = netCost;
  }

  public Product measure(String measure) {

    this.measure = measure;
    return this;
  }

  /**
   * Unit of measure.
   *
   * @return measure
   */
  @javax.annotation.Nullable
  public String getMeasure() {
    return measure;
  }

  public void setMeasure(String measure) {
    this.measure = measure;
  }

  public Product description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Product description.
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

  public Product category(String category) {

    this.category = category;
    return this;
  }

  /**
   * Product category.
   *
   * @return category
   */
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Product notes(String notes) {

    this.notes = notes;
    return this;
  }

  /**
   * Extra notes.
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

  public Product inStock(Boolean inStock) {

    this.inStock = inStock;
    return this;
  }

  /**
   * Determine if the product is in stock.
   *
   * @return inStock
   */
  @javax.annotation.Nullable
  public Boolean getInStock() {
    return inStock;
  }

  public void setInStock(Boolean inStock) {
    this.inStock = inStock;
  }

  public Product stockInitial(BigDecimal stockInitial) {

    this.stockInitial = stockInitial;
    return this;
  }

  /**
   * Product initial stock.
   *
   * @return stockInitial
   */
  @javax.annotation.Nullable
  public BigDecimal getStockInitial() {
    return stockInitial;
  }

  public void setStockInitial(BigDecimal stockInitial) {
    this.stockInitial = stockInitial;
  }

  /**
   * [Read Only] Product current stock.
   *
   * @return stockCurrent
   */
  @javax.annotation.Nullable
  public BigDecimal getStockCurrent() {
    return stockCurrent;
  }

  public Product averageCost(BigDecimal averageCost) {

    this.averageCost = averageCost;
    return this;
  }

  /**
   * Product average cost.
   *
   * @return averageCost
   */
  @javax.annotation.Nullable
  public BigDecimal getAverageCost() {
    return averageCost;
  }

  public void setAverageCost(BigDecimal averageCost) {
    this.averageCost = averageCost;
  }

  public Product averagePrice(BigDecimal averagePrice) {

    this.averagePrice = averagePrice;
    return this;
  }

  /**
   * Product average price.
   *
   * @return averagePrice
   */
  @javax.annotation.Nullable
  public BigDecimal getAveragePrice() {
    return averagePrice;
  }

  public void setAveragePrice(BigDecimal averagePrice) {
    this.averagePrice = averagePrice;
  }

  public Product createdAt(String createdAt) {

    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
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

  public Product updatedAt(String updatedAt) {

    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
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
    Product product = (Product) o;
    return Objects.equals(this.id, product.id)
        && Objects.equals(this.name, product.name)
        && Objects.equals(this.code, product.code)
        && Objects.equals(this.netPrice, product.netPrice)
        && Objects.equals(this.grossPrice, product.grossPrice)
        && Objects.equals(this.useGrossPrice, product.useGrossPrice)
        && Objects.equals(this.defaultVat, product.defaultVat)
        && Objects.equals(this.netCost, product.netCost)
        && Objects.equals(this.measure, product.measure)
        && Objects.equals(this.description, product.description)
        && Objects.equals(this.category, product.category)
        && Objects.equals(this.notes, product.notes)
        && Objects.equals(this.inStock, product.inStock)
        && Objects.equals(this.stockInitial, product.stockInitial)
        && Objects.equals(this.stockCurrent, product.stockCurrent)
        && Objects.equals(this.averageCost, product.averageCost)
        && Objects.equals(this.averagePrice, product.averagePrice)
        && Objects.equals(this.createdAt, product.createdAt)
        && Objects.equals(this.updatedAt, product.updatedAt);
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
        name,
        code,
        netPrice,
        grossPrice,
        useGrossPrice,
        defaultVat,
        netCost,
        measure,
        description,
        category,
        notes,
        inStock,
        stockInitial,
        stockCurrent,
        averageCost,
        averagePrice,
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
    sb.append("class Product {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    netPrice: ").append(toIndentedString(netPrice)).append("\n");
    sb.append("    grossPrice: ").append(toIndentedString(grossPrice)).append("\n");
    sb.append("    useGrossPrice: ").append(toIndentedString(useGrossPrice)).append("\n");
    sb.append("    defaultVat: ").append(toIndentedString(defaultVat)).append("\n");
    sb.append("    netCost: ").append(toIndentedString(netCost)).append("\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
    sb.append("    stockInitial: ").append(toIndentedString(stockInitial)).append("\n");
    sb.append("    stockCurrent: ").append(toIndentedString(stockCurrent)).append("\n");
    sb.append("    averageCost: ").append(toIndentedString(averageCost)).append("\n");
    sb.append("    averagePrice: ").append(toIndentedString(averagePrice)).append("\n");
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
