/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.16
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@ApiModel(description = "")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-05-12T13:23:15.879179Z[Etc/UTC]")
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

  public CompanyInfo name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Company name.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mario Rossi S.r.l.", value = "Company name.")
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
   * Company email.
   *
   * @return email
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mario@rossi-example.it", value = "Company email.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public CompanyInfoAccessInfo getAccessInfo() {
    return accessInfo;
  }

  public void setAccessInfo(CompanyInfoAccessInfo accessInfo) {
    this.accessInfo = accessInfo;
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
  @ApiModelProperty(value = "")
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
   * Accountant unique identifier.
   *
   * @return accountantId
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Accountant unique identifier.")
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
   * Determine if the logged account is an accountant.
   *
   * @return isAccountant
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determine if the logged account is an accountant.")
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
    return Objects.hash(id, name, email, type, accessInfo, planInfo, accountantId, isAccountant);
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
