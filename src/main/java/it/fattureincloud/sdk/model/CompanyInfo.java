/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** CompanyInfo */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-06-17T06:54:20.410889Z[Etc/UTC]",
    comments = "Generator version: 7.6.0")
public class CompanyInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";

  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private CompanyType type;

  public static final String SERIALIZED_NAME_ACCESS_INFO = "access_info";

  @SerializedName(SERIALIZED_NAME_ACCESS_INFO)
  private CompanyInfoAccessInfo accessInfo;

  public static final String SERIALIZED_NAME_FIC_LICENSE_EXPIRE = "fic_license_expire";

  @SerializedName(SERIALIZED_NAME_FIC_LICENSE_EXPIRE)
  private LocalDate ficLicenseExpire;

  public static final String SERIALIZED_NAME_FIC_PLAN_NAME = "fic_plan_name";

  @SerializedName(SERIALIZED_NAME_FIC_PLAN_NAME)
  private FattureInCloudPlanType ficPlanName;

  public static final String SERIALIZED_NAME_PLAN_INFO = "plan_info";

  @SerializedName(SERIALIZED_NAME_PLAN_INFO)
  private CompanyInfoPlanInfo planInfo;

  public static final String SERIALIZED_NAME_ACCOUNTANT_ID = "accountant_id";

  @SerializedName(SERIALIZED_NAME_ACCOUNTANT_ID)
  private Integer accountantId;

  public static final String SERIALIZED_NAME_IS_ACCOUNTANT = "is_accountant";

  @SerializedName(SERIALIZED_NAME_IS_ACCOUNTANT)
  private Boolean isAccountant;

  public CompanyInfo() {}

  public CompanyInfo id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Company id
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

  public CompanyInfo name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Company name
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

  public CompanyInfo email(String email) {

    this.email = email;
    return this;
  }

  /**
   * Company email
   *
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CompanyInfo type(CompanyType type) {

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

  public CompanyInfo accessInfo(CompanyInfoAccessInfo accessInfo) {

    this.accessInfo = accessInfo;
    return this;
  }

  /**
   * Get accessInfo
   *
   * @return accessInfo
   */
  @javax.annotation.Nullable
  public CompanyInfoAccessInfo getAccessInfo() {
    return accessInfo;
  }

  public void setAccessInfo(CompanyInfoAccessInfo accessInfo) {
    this.accessInfo = accessInfo;
  }

  public CompanyInfo ficLicenseExpire(LocalDate ficLicenseExpire) {

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

  public CompanyInfo ficPlanName(FattureInCloudPlanType ficPlanName) {

    this.ficPlanName = ficPlanName;
    return this;
  }

  /**
   * Get ficPlanName
   *
   * @return ficPlanName
   */
  @javax.annotation.Nullable
  public FattureInCloudPlanType getFicPlanName() {
    return ficPlanName;
  }

  public void setFicPlanName(FattureInCloudPlanType ficPlanName) {
    this.ficPlanName = ficPlanName;
  }

  public CompanyInfo planInfo(CompanyInfoPlanInfo planInfo) {

    this.planInfo = planInfo;
    return this;
  }

  /**
   * Get planInfo
   *
   * @return planInfo
   */
  @javax.annotation.Nullable
  public CompanyInfoPlanInfo getPlanInfo() {
    return planInfo;
  }

  public void setPlanInfo(CompanyInfoPlanInfo planInfo) {
    this.planInfo = planInfo;
  }

  public CompanyInfo accountantId(Integer accountantId) {

    this.accountantId = accountantId;
    return this;
  }

  /**
   * Company accountant id
   *
   * @return accountantId
   */
  @javax.annotation.Nullable
  public Integer getAccountantId() {
    return accountantId;
  }

  public void setAccountantId(Integer accountantId) {
    this.accountantId = accountantId;
  }

  public CompanyInfo isAccountant(Boolean isAccountant) {

    this.isAccountant = isAccountant;
    return this;
  }

  /**
   * Is the logged account an accountant.
   *
   * @return isAccountant
   */
  @javax.annotation.Nullable
  public Boolean getIsAccountant() {
    return isAccountant;
  }

  public void setIsAccountant(Boolean isAccountant) {
    this.isAccountant = isAccountant;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyInfo companyInfo = (CompanyInfo) o;
    return Objects.equals(this.id, companyInfo.id)
        && Objects.equals(this.name, companyInfo.name)
        && Objects.equals(this.email, companyInfo.email)
        && Objects.equals(this.type, companyInfo.type)
        && Objects.equals(this.accessInfo, companyInfo.accessInfo)
        && Objects.equals(this.ficLicenseExpire, companyInfo.ficLicenseExpire)
        && Objects.equals(this.ficPlanName, companyInfo.ficPlanName)
        && Objects.equals(this.planInfo, companyInfo.planInfo)
        && Objects.equals(this.accountantId, companyInfo.accountantId)
        && Objects.equals(this.isAccountant, companyInfo.isAccountant);
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
        email,
        type,
        accessInfo,
        ficLicenseExpire,
        ficPlanName,
        planInfo,
        accountantId,
        isAccountant);
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
    sb.append("class CompanyInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accessInfo: ").append(toIndentedString(accessInfo)).append("\n");
    sb.append("    ficLicenseExpire: ").append(toIndentedString(ficLicenseExpire)).append("\n");
    sb.append("    ficPlanName: ").append(toIndentedString(ficPlanName)).append("\n");
    sb.append("    planInfo: ").append(toIndentedString(planInfo)).append("\n");
    sb.append("    accountantId: ").append(toIndentedString(accountantId)).append("\n");
    sb.append("    isAccountant: ").append(toIndentedString(isAccountant)).append("\n");
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
