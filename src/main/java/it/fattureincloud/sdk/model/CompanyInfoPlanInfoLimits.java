/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.22
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.fattureincloud.sdk.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Limits for this company. */
@ApiModel(description = "Limits for this company.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-11-14T14:20:32.767Z[Etc/UTC]")
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
   * Get clients
   *
   * @return clients
   */
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
   *
   * @return suppliers
   */
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
   *
   * @return products
   */
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
   *
   * @return documents
   */
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

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("clients");
    openapiFields.add("suppliers");
    openapiFields.add("products");
    openapiFields.add("documents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to CompanyInfoPlanInfoLimits
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (CompanyInfoPlanInfoLimits.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in CompanyInfoPlanInfoLimits is not found in the empty JSON string",
                CompanyInfoPlanInfoLimits.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!CompanyInfoPlanInfoLimits.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `CompanyInfoPlanInfoLimits` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!CompanyInfoPlanInfoLimits.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'CompanyInfoPlanInfoLimits' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<CompanyInfoPlanInfoLimits> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(CompanyInfoPlanInfoLimits.class));

      return (TypeAdapter<T>)
          new TypeAdapter<CompanyInfoPlanInfoLimits>() {
            @Override
            public void write(JsonWriter out, CompanyInfoPlanInfoLimits value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public CompanyInfoPlanInfoLimits read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of CompanyInfoPlanInfoLimits given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompanyInfoPlanInfoLimits
   * @throws IOException if the JSON string is invalid with respect to CompanyInfoPlanInfoLimits
   */
  public static CompanyInfoPlanInfoLimits fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompanyInfoPlanInfoLimits.class);
  }

  /**
   * Convert an instance of CompanyInfoPlanInfoLimits to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
