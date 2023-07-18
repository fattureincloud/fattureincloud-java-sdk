/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.29
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

/** Company plan limits */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-07-17T10:04:00.151Z[Etc/UTC]")
public class CompanyInfoPlanInfoLimits implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CLIENTS = "clients";

  @SerializedName(SERIALIZED_NAME_CLIENTS)
  private Integer clients;

  public static final String SERIALIZED_NAME_SUPPLIERS = "suppliers";

  @SerializedName(SERIALIZED_NAME_SUPPLIERS)
  private Integer suppliers;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";

  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private Integer products;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";

  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private Integer documents;

  public CompanyInfoPlanInfoLimits() {}

  public CompanyInfoPlanInfoLimits clients(Integer clients) {

    this.clients = clients;
    return this;
  }

  /**
   * Company plan clients limits
   *
   * @return clients
   */
  @javax.annotation.Nullable
  public Integer getClients() {
    return clients;
  }

  public void setClients(Integer clients) {
    this.clients = clients;
  }

  public CompanyInfoPlanInfoLimits suppliers(Integer suppliers) {

    this.suppliers = suppliers;
    return this;
  }

  /**
   * Company plan suppliers limits
   *
   * @return suppliers
   */
  @javax.annotation.Nullable
  public Integer getSuppliers() {
    return suppliers;
  }

  public void setSuppliers(Integer suppliers) {
    this.suppliers = suppliers;
  }

  public CompanyInfoPlanInfoLimits products(Integer products) {

    this.products = products;
    return this;
  }

  /**
   * Company plan products limits
   *
   * @return products
   */
  @javax.annotation.Nullable
  public Integer getProducts() {
    return products;
  }

  public void setProducts(Integer products) {
    this.products = products;
  }

  public CompanyInfoPlanInfoLimits documents(Integer documents) {

    this.documents = documents;
    return this;
  }

  /**
   * Company plan documents limits
   *
   * @return documents
   */
  @javax.annotation.Nullable
  public Integer getDocuments() {
    return documents;
  }

  public void setDocuments(Integer documents) {
    this.documents = documents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyInfoPlanInfoLimits companyInfoPlanInfoLimits = (CompanyInfoPlanInfoLimits) o;
    return Objects.equals(this.clients, companyInfoPlanInfoLimits.clients)
        && Objects.equals(this.suppliers, companyInfoPlanInfoLimits.suppliers)
        && Objects.equals(this.products, companyInfoPlanInfoLimits.products)
        && Objects.equals(this.documents, companyInfoPlanInfoLimits.documents);
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
    return Objects.hash(clients, suppliers, products, documents);
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
    sb.append("class CompanyInfoPlanInfoLimits {\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    suppliers: ").append(toIndentedString(suppliers)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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
