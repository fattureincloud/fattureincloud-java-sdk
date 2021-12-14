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
import java.io.Serializable;

/**
 * Limits for this company.
 */
@ApiModel(description = "Limits for this company.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-14T16:12:54.353Z[GMT]")
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


  public CompanyInfoPlanInfoLimits clients(Integer clients) {
    
    this.clients = clients;
    return this;
  }

   /**
   * Get clients
   * @return clients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * Get suppliers
   * @return suppliers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * Get products
   * @return products
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * Get documents
   * @return documents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    return Objects.equals(this.clients, companyInfoPlanInfoLimits.clients) &&
        Objects.equals(this.suppliers, companyInfoPlanInfoLimits.suppliers) &&
        Objects.equals(this.products, companyInfoPlanInfoLimits.products) &&
        Objects.equals(this.documents, companyInfoPlanInfoLimits.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clients, suppliers, products, documents);
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
