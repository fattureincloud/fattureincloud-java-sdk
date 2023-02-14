/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.26
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
import it.fattureincloud.sdk.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-02-13T13:42:26.512Z[Etc/UTC]")
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
   * Accountant unique identifier.
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
   * Determine if the logged account is an accountant.
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

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("type");
    openapiFields.add("access_info");
    openapiFields.add("plan_info");
    openapiFields.add("accountant_id");
    openapiFields.add("is_accountant");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to CompanyInfo
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (!CompanyInfo.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON object is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in CompanyInfo is not found in the empty JSON string",
                CompanyInfo.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!CompanyInfo.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `CompanyInfo` properties."
                    + " JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
        && !jsonObj.get("name").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `name` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("name").toString()));
    }
    if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull())
        && !jsonObj.get("email").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `email` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("email").toString()));
    }
    // validate the optional field `access_info`
    if (jsonObj.get("access_info") != null && !jsonObj.get("access_info").isJsonNull()) {
      CompanyInfoAccessInfo.validateJsonObject(jsonObj.getAsJsonObject("access_info"));
    }
    // validate the optional field `plan_info`
    if (jsonObj.get("plan_info") != null && !jsonObj.get("plan_info").isJsonNull()) {
      CompanyInfoPlanInfo.validateJsonObject(jsonObj.getAsJsonObject("plan_info"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!CompanyInfo.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'CompanyInfo' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<CompanyInfo> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(CompanyInfo.class));

      return (TypeAdapter<T>)
          new TypeAdapter<CompanyInfo>() {
            @Override
            public void write(JsonWriter out, CompanyInfo value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public CompanyInfo read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of CompanyInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompanyInfo
   * @throws IOException if the JSON string is invalid with respect to CompanyInfo
   */
  public static CompanyInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompanyInfo.class);
  }

  /**
   * Convert an instance of CompanyInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
