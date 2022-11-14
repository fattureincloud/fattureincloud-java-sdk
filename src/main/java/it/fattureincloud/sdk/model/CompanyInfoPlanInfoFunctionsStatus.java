/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.21
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
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** CompanyInfoPlanInfoFunctionsStatus */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-11-14T07:38:51.580Z[Etc/UTC]")
public class CompanyInfoPlanInfoFunctionsStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TS_DIGITAL = "ts_digital";

  @SerializedName(SERIALIZED_NAME_TS_DIGITAL)
  private FunctionStatus tsDigital;

  public static final String SERIALIZED_NAME_TS_PAY = "ts_pay";

  @SerializedName(SERIALIZED_NAME_TS_PAY)
  private FunctionStatus tsPay;

  public CompanyInfoPlanInfoFunctionsStatus() {}

  public CompanyInfoPlanInfoFunctionsStatus tsDigital(FunctionStatus tsDigital) {

    this.tsDigital = tsDigital;
    return this;
  }

  /**
   * Get tsDigital
   *
   * @return tsDigital
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public FunctionStatus getTsDigital() {
    return tsDigital;
  }

  public void setTsDigital(FunctionStatus tsDigital) {
    this.tsDigital = tsDigital;
  }

  public CompanyInfoPlanInfoFunctionsStatus tsPay(FunctionStatus tsPay) {

    this.tsPay = tsPay;
    return this;
  }

  /**
   * Get tsPay
   *
   * @return tsPay
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public FunctionStatus getTsPay() {
    return tsPay;
  }

  public void setTsPay(FunctionStatus tsPay) {
    this.tsPay = tsPay;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyInfoPlanInfoFunctionsStatus companyInfoPlanInfoFunctionsStatus =
        (CompanyInfoPlanInfoFunctionsStatus) o;
    return Objects.equals(this.tsDigital, companyInfoPlanInfoFunctionsStatus.tsDigital)
        && Objects.equals(this.tsPay, companyInfoPlanInfoFunctionsStatus.tsPay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tsDigital, tsPay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyInfoPlanInfoFunctionsStatus {\n");
    sb.append("    tsDigital: ").append(toIndentedString(tsDigital)).append("\n");
    sb.append("    tsPay: ").append(toIndentedString(tsPay)).append("\n");
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
    openapiFields.add("ts_digital");
    openapiFields.add("ts_pay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to
   *     CompanyInfoPlanInfoFunctionsStatus
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (CompanyInfoPlanInfoFunctionsStatus.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in CompanyInfoPlanInfoFunctionsStatus is not found in the empty JSON string",
                CompanyInfoPlanInfoFunctionsStatus.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!CompanyInfoPlanInfoFunctionsStatus.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `CompanyInfoPlanInfoFunctionsStatus` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // validate the optional field `ts_digital`
    if ((jsonObj.get("ts_digital") != null && !jsonObj.get("ts_digital").isJsonNull())
        && !jsonObj.get("ts_digital").isJsonPrimitive()) {
      FunctionStatus.validateJsonObject(jsonObj.getAsJsonObject("ts_digital"));
    }
    // validate the optional field `ts_pay`
    if ((jsonObj.get("ts_pay") != null && !jsonObj.get("ts_pay").isJsonNull())
        && !jsonObj.get("ts_pay").isJsonPrimitive()) {
      FunctionStatus.validateJsonObject(jsonObj.getAsJsonObject("ts_pay"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!CompanyInfoPlanInfoFunctionsStatus.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'CompanyInfoPlanInfoFunctionsStatus' and its
                     // subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<CompanyInfoPlanInfoFunctionsStatus> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(CompanyInfoPlanInfoFunctionsStatus.class));

      return (TypeAdapter<T>)
          new TypeAdapter<CompanyInfoPlanInfoFunctionsStatus>() {
            @Override
            public void write(JsonWriter out, CompanyInfoPlanInfoFunctionsStatus value)
                throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public CompanyInfoPlanInfoFunctionsStatus read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of CompanyInfoPlanInfoFunctionsStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompanyInfoPlanInfoFunctionsStatus
   * @throws IOException if the JSON string is invalid with respect to
   *     CompanyInfoPlanInfoFunctionsStatus
   */
  public static CompanyInfoPlanInfoFunctionsStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompanyInfoPlanInfoFunctionsStatus.class);
  }

  /**
   * Convert an instance of CompanyInfoPlanInfoFunctionsStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
