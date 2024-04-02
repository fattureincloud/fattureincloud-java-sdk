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
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ControlledCompany */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-04-02T08:46:44.590061Z[Etc/UTC]",
    comments = "Generator version: 7.4.0")
public class ControlledCompany implements Serializable {
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

  public static final String SERIALIZED_NAME_FIC_LICENSE_EXPIRE = "fic_license_expire";

  @SerializedName(SERIALIZED_NAME_FIC_LICENSE_EXPIRE)
  private LocalDate ficLicenseExpire;

  public static final String SERIALIZED_NAME_FIC_PLAN = "fic_plan";

  @SerializedName(SERIALIZED_NAME_FIC_PLAN)
  private FattureInCloudPlanType ficPlan;

  public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";

  @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
  private BigDecimal connectionId;

  public static final String SERIALIZED_NAME_TAX_CODE = "tax_code";

  @SerializedName(SERIALIZED_NAME_TAX_CODE)
  private String taxCode;

  public ControlledCompany() {}

  public ControlledCompany id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Controlled company id
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

  public ControlledCompany name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Controlled company id
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

  public ControlledCompany type(CompanyType type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nullable
  public CompanyType getType() {
    return type;
  }

  public void setType(CompanyType type) {
    this.type = type;
  }

  public ControlledCompany accessToken(String accessToken) {

    this.accessToken = accessToken;
    return this;
  }

  /**
   * Controlled company access token Only if type&#x3D;company]
   *
   * @return accessToken
   */
  @javax.annotation.Nullable
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public ControlledCompany ficLicenseExpire(LocalDate ficLicenseExpire) {

    this.ficLicenseExpire = ficLicenseExpire;
    return this;
  }

  /**
   * Get ficLicenseExpire
   *
   * @return ficLicenseExpire
   */
  @javax.annotation.Nullable
  public LocalDate getFicLicenseExpire() {
    return ficLicenseExpire;
  }

  public void setFicLicenseExpire(LocalDate ficLicenseExpire) {
    this.ficLicenseExpire = ficLicenseExpire;
  }

  public ControlledCompany ficPlan(FattureInCloudPlanType ficPlan) {

    this.ficPlan = ficPlan;
    return this;
  }

  /**
   * Get ficPlan
   *
   * @return ficPlan
   */
  @javax.annotation.Nullable
  public FattureInCloudPlanType getFicPlan() {
    return ficPlan;
  }

  public void setFicPlan(FattureInCloudPlanType ficPlan) {
    this.ficPlan = ficPlan;
  }

  public ControlledCompany connectionId(BigDecimal connectionId) {

    this.connectionId = connectionId;
    return this;
  }

  /**
   * Controlled company connection id
   *
   * @return connectionId
   */
  @javax.annotation.Nullable
  public BigDecimal getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(BigDecimal connectionId) {
    this.connectionId = connectionId;
  }

  public ControlledCompany taxCode(String taxCode) {

    this.taxCode = taxCode;
    return this;
  }

  /**
   * Controlled company tax code
   *
   * @return taxCode
   */
  @javax.annotation.Nullable
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
    ControlledCompany controlledCompany = (ControlledCompany) o;
    return Objects.equals(this.id, controlledCompany.id)
        && Objects.equals(this.name, controlledCompany.name)
        && Objects.equals(this.type, controlledCompany.type)
        && Objects.equals(this.accessToken, controlledCompany.accessToken)
        && Objects.equals(this.ficLicenseExpire, controlledCompany.ficLicenseExpire)
        && Objects.equals(this.ficPlan, controlledCompany.ficPlan)
        && Objects.equals(this.connectionId, controlledCompany.connectionId)
        && Objects.equals(this.taxCode, controlledCompany.taxCode);
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
        id, name, type, accessToken, ficLicenseExpire, ficPlan, connectionId, taxCode);
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
    sb.append("class ControlledCompany {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    ficLicenseExpire: ").append(toIndentedString(ficLicenseExpire)).append("\n");
    sb.append("    ficPlan: ").append(toIndentedString(ficPlan)).append("\n");
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
}
