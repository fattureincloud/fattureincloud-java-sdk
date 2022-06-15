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

/** CompanyInfoPlanInfo */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-06-15T14:42:42.333969Z[Etc/UTC]")
public class CompanyInfoPlanInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LIMITS = "limits";

  @SerializedName(SERIALIZED_NAME_LIMITS)
  private CompanyInfoPlanInfoLimits limits;

  public static final String SERIALIZED_NAME_FUNCTIONS = "functions";

  @SerializedName(SERIALIZED_NAME_FUNCTIONS)
  private CompanyInfoPlanInfoFunctions functions;

  public static final String SERIALIZED_NAME_FUNCTIONS_STATUS = "functions_status";

  @SerializedName(SERIALIZED_NAME_FUNCTIONS_STATUS)
  private CompanyInfoPlanInfoFunctionsStatus functionsStatus;

  public CompanyInfoPlanInfo() {}

  public CompanyInfoPlanInfo limits(CompanyInfoPlanInfoLimits limits) {

    this.limits = limits;
    return this;
  }

  /**
   * Get limits
   *
   * @return limits
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public CompanyInfoPlanInfoLimits getLimits() {
    return limits;
  }

  public void setLimits(CompanyInfoPlanInfoLimits limits) {
    this.limits = limits;
  }

  public CompanyInfoPlanInfo functions(CompanyInfoPlanInfoFunctions functions) {

    this.functions = functions;
    return this;
  }

  /**
   * Get functions
   *
   * @return functions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public CompanyInfoPlanInfoFunctions getFunctions() {
    return functions;
  }

  public void setFunctions(CompanyInfoPlanInfoFunctions functions) {
    this.functions = functions;
  }

  public CompanyInfoPlanInfo functionsStatus(CompanyInfoPlanInfoFunctionsStatus functionsStatus) {

    this.functionsStatus = functionsStatus;
    return this;
  }

  /**
   * Get functionsStatus
   *
   * @return functionsStatus
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public CompanyInfoPlanInfoFunctionsStatus getFunctionsStatus() {
    return functionsStatus;
  }

  public void setFunctionsStatus(CompanyInfoPlanInfoFunctionsStatus functionsStatus) {
    this.functionsStatus = functionsStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyInfoPlanInfo companyInfoPlanInfo = (CompanyInfoPlanInfo) o;
    return Objects.equals(this.limits, companyInfoPlanInfo.limits)
        && Objects.equals(this.functions, companyInfoPlanInfo.functions)
        && Objects.equals(this.functionsStatus, companyInfoPlanInfo.functionsStatus);
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
    return Objects.hash(limits, functions, functionsStatus);
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
    sb.append("class CompanyInfoPlanInfo {\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
    sb.append("    functionsStatus: ").append(toIndentedString(functionsStatus)).append("\n");
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
    openapiFields.add("limits");
    openapiFields.add("functions");
    openapiFields.add("functions_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to CompanyInfoPlanInfo
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (CompanyInfoPlanInfo.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in CompanyInfoPlanInfo is not found in the empty JSON"
                    + " string",
                CompanyInfoPlanInfo.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!CompanyInfoPlanInfo.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `CompanyInfoPlanInfo`"
                    + " properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // validate the optional field `limits`
    if (jsonObj.getAsJsonObject("limits") != null) {
      CompanyInfoPlanInfoLimits.validateJsonObject(jsonObj.getAsJsonObject("limits"));
    }
    // validate the optional field `functions`
    if (jsonObj.getAsJsonObject("functions") != null) {
      CompanyInfoPlanInfoFunctions.validateJsonObject(jsonObj.getAsJsonObject("functions"));
    }
    // validate the optional field `functions_status`
    if (jsonObj.getAsJsonObject("functions_status") != null) {
      CompanyInfoPlanInfoFunctionsStatus.validateJsonObject(
          jsonObj.getAsJsonObject("functions_status"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!CompanyInfoPlanInfo.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'CompanyInfoPlanInfo' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<CompanyInfoPlanInfo> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(CompanyInfoPlanInfo.class));

      return (TypeAdapter<T>)
          new TypeAdapter<CompanyInfoPlanInfo>() {
            @Override
            public void write(JsonWriter out, CompanyInfoPlanInfo value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public CompanyInfoPlanInfo read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of CompanyInfoPlanInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompanyInfoPlanInfo
   * @throws IOException if the JSON string is invalid with respect to CompanyInfoPlanInfo
   */
  public static CompanyInfoPlanInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompanyInfoPlanInfo.class);
  }

  /**
   * Convert an instance of CompanyInfoPlanInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
