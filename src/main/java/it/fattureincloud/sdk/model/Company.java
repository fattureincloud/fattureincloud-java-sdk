/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.18
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@ApiModel(description = "")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-06-06T11:01:09.299158Z[Etc/UTC]")
public class Company {
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

  public Company() {}

  public Company id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Company unique identifier.
   *
   * @return id
   */
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
   *
   * @return name
   */
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
   *
   * @return type
   */
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
   *
   * @return accessToken
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example =
          "fd015011d2dbf8a9d38e810b325b11b56d02e51688e5261a245933b8e677b8b44ff5f0fe5ccaaf1d7157fa13ca72ab62b6183db0667a576a0e19164801c18c4fd81273fc1f95bf460b869015cf99acba",
      value = "CompanyAuthentication token for this company. [Only if type=company]")
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
   *
   * @return controlledCompanies
   */
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
   *
   * @return connectionId
   */
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
   *
   * @return taxCode
   */
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
    return Objects.equals(this.id, company.id)
        && Objects.equals(this.name, company.name)
        && Objects.equals(this.type, company.type)
        && Objects.equals(this.accessToken, company.accessToken)
        && Objects.equals(this.controlledCompanies, company.controlledCompanies)
        && Objects.equals(this.connectionId, company.connectionId)
        && Objects.equals(this.taxCode, company.taxCode);
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
    return Objects.hash(id, name, type, accessToken, controlledCompanies, connectionId, taxCode);
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
    sb.append("class Company {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    controlledCompanies: ")
        .append(toIndentedString(controlledCompanies))
        .append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("access_token");
    openapiFields.add("controlled_companies");
    openapiFields.add("connection_id");
    openapiFields.add("tax_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to Company
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (Company.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in Company is not found in the empty JSON string",
                Company.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!Company.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `Company` properties."
                    + " JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `name` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("name").toString()));
    }
    if (jsonObj.get("access_token") != null && !jsonObj.get("access_token").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `access_token` to be a primitive type in the JSON string but got"
                  + " `%s`",
              jsonObj.get("access_token").toString()));
    }
    JsonArray jsonArraycontrolledCompanies = jsonObj.getAsJsonArray("controlled_companies");
    if (jsonArraycontrolledCompanies != null) {
      // ensure the json data is an array
      if (!jsonObj.get("controlled_companies").isJsonArray()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `controlled_companies` to be an array in the JSON string but"
                    + " got `%s`",
                jsonObj.get("controlled_companies").toString()));
      }

      // validate the optional field `controlled_companies` (array)
      for (int i = 0; i < jsonArraycontrolledCompanies.size(); i++) {
        ControlledCompany.validateJsonObject(jsonArraycontrolledCompanies.get(i).getAsJsonObject());
      }
      ;
    }
    if (jsonObj.get("tax_code") != null && !jsonObj.get("tax_code").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `tax_code` to be a primitive type in the JSON string but got"
                  + " `%s`",
              jsonObj.get("tax_code").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!Company.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'Company' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<Company> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(Company.class));

      return (TypeAdapter<T>)
          new TypeAdapter<Company>() {
            @Override
            public void write(JsonWriter out, Company value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public Company read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of Company given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Company
   * @throws IOException if the JSON string is invalid with respect to Company
   */
  public static Company fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Company.class);
  }

  /**
   * Convert an instance of Company to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
