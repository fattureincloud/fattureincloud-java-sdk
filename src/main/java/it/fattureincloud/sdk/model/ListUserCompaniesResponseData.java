/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.14
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
import it.fattureincloud.sdk.model.Company;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

/**
 * ListUserCompaniesResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-31T13:16:33.658Z[GMT]")
public class ListUserCompaniesResponseData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COMPANIES = "companies";
  @SerializedName(SERIALIZED_NAME_COMPANIES)
  private List<Company> companies = null;

  public ListUserCompaniesResponseData() { 
  }

  public ListUserCompaniesResponseData companies(List<Company> companies) {
    
    this.companies = companies;
    return this;
  }

  public ListUserCompaniesResponseData addCompaniesItem(Company companiesItem) {
    if (this.companies == null) {
      this.companies = new ArrayList<>();
    }
    this.companies.add(companiesItem);
    return this;
  }

   /**
   * Get companies
   * @return companies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Company> getCompanies() {
    return companies;
  }


  public void setCompanies(List<Company> companies) {
    this.companies = companies;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUserCompaniesResponseData listUserCompaniesResponseData = (ListUserCompaniesResponseData) o;
    return Objects.equals(this.companies, listUserCompaniesResponseData.companies);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(companies);
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
    sb.append("class ListUserCompaniesResponseData {\n");
    sb.append("    companies: ").append(toIndentedString(companies)).append("\n");
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

