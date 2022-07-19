/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.19
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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** EInvoiceRejectionReason */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-07-18T14:57:32.905Z[Etc/UTC]")
public class EInvoiceRejectionReason implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_REASON = "reason";

  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_EI_STATUS = "ei_status";

  @SerializedName(SERIALIZED_NAME_EI_STATUS)
  private String eiStatus;

  public static final String SERIALIZED_NAME_SOLUTION = "solution";

  @SerializedName(SERIALIZED_NAME_SOLUTION)
  private String solution;

  public static final String SERIALIZED_NAME_CODE = "code";

  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DATE = "date";

  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public EInvoiceRejectionReason() {}

  public EInvoiceRejectionReason reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * Rejection reason.
   *
   * @return reason
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rejection reason.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public EInvoiceRejectionReason eiStatus(String eiStatus) {

    this.eiStatus = eiStatus;
    return this;
  }

  /**
   * E-invoice status.
   *
   * @return eiStatus
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "E-invoice status.")
  public String getEiStatus() {
    return eiStatus;
  }

  public void setEiStatus(String eiStatus) {
    this.eiStatus = eiStatus;
  }

  public EInvoiceRejectionReason solution(String solution) {

    this.solution = solution;
    return this;
  }

  /**
   * Error solution.
   *
   * @return solution
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error solution.")
  public String getSolution() {
    return solution;
  }

  public void setSolution(String solution) {
    this.solution = solution;
  }

  public EInvoiceRejectionReason code(String code) {

    this.code = code;
    return this;
  }

  /**
   * Error code.
   *
   * @return code
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public EInvoiceRejectionReason date(OffsetDateTime date) {

    this.date = date;
    return this;
  }

  /**
   * Rejection date.
   *
   * @return date
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rejection date.")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EInvoiceRejectionReason einvoiceRejectionReason = (EInvoiceRejectionReason) o;
    return Objects.equals(this.reason, einvoiceRejectionReason.reason)
        && Objects.equals(this.eiStatus, einvoiceRejectionReason.eiStatus)
        && Objects.equals(this.solution, einvoiceRejectionReason.solution)
        && Objects.equals(this.code, einvoiceRejectionReason.code)
        && Objects.equals(this.date, einvoiceRejectionReason.date);
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
    return Objects.hash(reason, eiStatus, solution, code, date);
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
    sb.append("class EInvoiceRejectionReason {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    eiStatus: ").append(toIndentedString(eiStatus)).append("\n");
    sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
    openapiFields.add("reason");
    openapiFields.add("ei_status");
    openapiFields.add("solution");
    openapiFields.add("code");
    openapiFields.add("date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to EInvoiceRejectionReason
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (EInvoiceRejectionReason.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in EInvoiceRejectionReason is not found in the empty JSON string",
                EInvoiceRejectionReason.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!EInvoiceRejectionReason.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `EInvoiceRejectionReason` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull())
        && !jsonObj.get("reason").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `reason` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("reason").toString()));
    }
    if ((jsonObj.get("ei_status") != null && !jsonObj.get("ei_status").isJsonNull())
        && !jsonObj.get("ei_status").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `ei_status` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("ei_status").toString()));
    }
    if ((jsonObj.get("solution") != null && !jsonObj.get("solution").isJsonNull())
        && !jsonObj.get("solution").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `solution` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("solution").toString()));
    }
    if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull())
        && !jsonObj.get("code").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `code` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("code").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!EInvoiceRejectionReason.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'EInvoiceRejectionReason' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<EInvoiceRejectionReason> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(EInvoiceRejectionReason.class));

      return (TypeAdapter<T>)
          new TypeAdapter<EInvoiceRejectionReason>() {
            @Override
            public void write(JsonWriter out, EInvoiceRejectionReason value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public EInvoiceRejectionReason read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of EInvoiceRejectionReason given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EInvoiceRejectionReason
   * @throws IOException if the JSON string is invalid with respect to EInvoiceRejectionReason
   */
  public static EInvoiceRejectionReason fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EInvoiceRejectionReason.class);
  }

  /**
   * Convert an instance of EInvoiceRejectionReason to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
