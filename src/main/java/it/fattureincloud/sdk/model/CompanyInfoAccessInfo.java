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
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** CompanyInfoAccessInfo */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-02-28T14:38:20.814424Z[Etc/UTC]")
public class CompanyInfoAccessInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ROLE = "role";

  @SerializedName(SERIALIZED_NAME_ROLE)
  private UserCompanyRole role;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";

  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private Permissions permissions;

  public static final String SERIALIZED_NAME_THROUGH_ACCOUNTANT = "through_accountant";

  @SerializedName(SERIALIZED_NAME_THROUGH_ACCOUNTANT)
  private Boolean throughAccountant;

  public CompanyInfoAccessInfo() {}

  public CompanyInfoAccessInfo role(UserCompanyRole role) {

    this.role = role;
    return this;
  }

  /**
   * Get role
   *
   * @return role
   */
  @javax.annotation.Nullable
  public UserCompanyRole getRole() {
    return role;
  }

  public void setRole(UserCompanyRole role) {
    this.role = role;
  }

  public CompanyInfoAccessInfo permissions(Permissions permissions) {

    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions
   *
   * @return permissions
   */
  @javax.annotation.Nullable
  public Permissions getPermissions() {
    return permissions;
  }

  public void setPermissions(Permissions permissions) {
    this.permissions = permissions;
  }

  public CompanyInfoAccessInfo throughAccountant(Boolean throughAccountant) {

    this.throughAccountant = throughAccountant;
    return this;
  }

  /**
   * Company activated through accountant
   *
   * @return throughAccountant
   */
  @javax.annotation.Nullable
  public Boolean getThroughAccountant() {
    return throughAccountant;
  }

  public void setThroughAccountant(Boolean throughAccountant) {
    this.throughAccountant = throughAccountant;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyInfoAccessInfo companyInfoAccessInfo = (CompanyInfoAccessInfo) o;
    return Objects.equals(this.role, companyInfoAccessInfo.role)
        && Objects.equals(this.permissions, companyInfoAccessInfo.permissions)
        && Objects.equals(this.throughAccountant, companyInfoAccessInfo.throughAccountant);
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
    return Objects.hash(role, permissions, throughAccountant);
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
    sb.append("class CompanyInfoAccessInfo {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    throughAccountant: ").append(toIndentedString(throughAccountant)).append("\n");
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
