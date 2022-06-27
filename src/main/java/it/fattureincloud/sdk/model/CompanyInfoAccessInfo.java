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
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import it.fattureincloud.sdk.JSON;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** CompanyInfoAccessInfo */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-06-27T13:55:38.073Z[Etc/UTC]")
public class CompanyInfoAccessInfo {
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
   * Get throughAccountant
   *
   * @return throughAccountant
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("role");
    openapiFields.add("permissions");
    openapiFields.add("through_accountant");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to CompanyInfoAccessInfo
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (CompanyInfoAccessInfo.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in CompanyInfoAccessInfo is not found in the empty JSON string",
                CompanyInfoAccessInfo.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!CompanyInfoAccessInfo.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `CompanyInfoAccessInfo` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // validate the optional field `permissions`
    if ((jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull())
        && !jsonObj.get("permissions").isJsonPrimitive()) {
      Permissions.validateJsonObject(jsonObj.getAsJsonObject("permissions"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!CompanyInfoAccessInfo.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'CompanyInfoAccessInfo' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<CompanyInfoAccessInfo> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(CompanyInfoAccessInfo.class));

      return (TypeAdapter<T>)
          new TypeAdapter<CompanyInfoAccessInfo>() {
            @Override
            public void write(JsonWriter out, CompanyInfoAccessInfo value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public CompanyInfoAccessInfo read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of CompanyInfoAccessInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompanyInfoAccessInfo
   * @throws IOException if the JSON string is invalid with respect to CompanyInfoAccessInfo
   */
  public static CompanyInfoAccessInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompanyInfoAccessInfo.class);
  }

  /**
   * Convert an instance of CompanyInfoAccessInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
