/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.11
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
import it.fattureincloud.sdk.model.CompanyType;
import it.fattureincloud.sdk.model.ControlledCompany;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T11:20:58.969Z[Etc/UTC]")
public class Company implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CompanyType type;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_CONTROLLED_COMPANIES = "controlled_companies";
  @SerializedName(SERIALIZED_NAME_CONTROLLED_COMPANIES)
  private List<ControlledCompany> controlledCompanies = null;

  public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
  private Integer connectionId;

  public static final String SERIALIZED_NAME_TAX_CODE = "tax_code";
  @SerializedName(SERIALIZED_NAME_TAX_CODE)
  private String taxCode;


  public Company id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Company unique identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "Company unique identifier.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Company name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Company name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Rossi S.r.l.", value = "Company name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Company type(CompanyType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyType getType() {
    return type;
  }


  public void setType(CompanyType type) {
    this.type = type;
  }


  public Company accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * CompanyAuthentication token for this company. [Only if type&#x3D;company]
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fd015011d2dbf8a9d38e810b325b11b56d02e51688e5261a245933b8e677b8b44ff5f0fe5ccaaf1d7157fa13ca72ab62b6183db0667a576a0e19164801c18c4fd81273fc1f95bf460b869015cf99acba", value = "CompanyAuthentication token for this company. [Only if type=company]")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public Company controlledCompanies(List<ControlledCompany> controlledCompanies) {
    
    this.controlledCompanies = controlledCompanies;
    return this;
  }

  public Company addControlledCompaniesItem(ControlledCompany controlledCompaniesItem) {
    if (this.controlledCompanies == null) {
      this.controlledCompanies = new ArrayList<>();
    }
    this.controlledCompanies.add(controlledCompaniesItem);
    return this;
  }

   /**
   * List of controlled companies. [Only if type&#x3D;accountant]
   * @return controlledCompanies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of controlled companies. [Only if type=accountant]")

  public List<ControlledCompany> getControlledCompanies() {
    return controlledCompanies;
  }


  public void setControlledCompanies(List<ControlledCompany> controlledCompanies) {
    this.controlledCompanies = controlledCompanies;
  }


  public Company connectionId(Integer connectionId) {
    
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Company connection id.
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Company connection id.")

  public Integer getConnectionId() {
    return connectionId;
  }


  public void setConnectionId(Integer connectionId) {
    this.connectionId = connectionId;
  }


  public Company taxCode(String taxCode) {
    
    this.taxCode = taxCode;
    return this;
  }

   /**
   * Tax code.
   * @return taxCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax code.")

  public String getTaxCode() {
    return taxCode;
  }


  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.id, company.id) &&
        Objects.equals(this.name, company.name) &&
        Objects.equals(this.type, company.type) &&
        Objects.equals(this.accessToken, company.accessToken) &&
        Objects.equals(this.controlledCompanies, company.controlledCompanies) &&
        Objects.equals(this.connectionId, company.connectionId) &&
        Objects.equals(this.taxCode, company.taxCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, accessToken, controlledCompanies, connectionId, taxCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    controlledCompanies: ").append(toIndentedString(controlledCompanies)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
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

