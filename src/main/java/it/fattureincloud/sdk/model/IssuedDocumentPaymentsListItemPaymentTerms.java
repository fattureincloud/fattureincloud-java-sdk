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
import com.google.gson.annotations.JsonAdapter;
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

/** IssuedDocumentPaymentsListItemPaymentTerms */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-06-27T13:55:38.073Z[Etc/UTC]")
public class IssuedDocumentPaymentsListItemPaymentTerms {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DAYS = "days";

  @SerializedName(SERIALIZED_NAME_DAYS)
  private Integer days;

  /** Payment terms type. */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    STANDARD("standard"),

    END_OF_MONTH("end_of_month");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public IssuedDocumentPaymentsListItemPaymentTerms() {}

  public IssuedDocumentPaymentsListItemPaymentTerms days(Integer days) {

    this.days = days;
    return this;
  }

  /**
   * The number of days by which the payment must be made.
   *
   * @return days
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of days by which the payment must be made.")
  public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }

  public IssuedDocumentPaymentsListItemPaymentTerms type(TypeEnum type) {

    this.type = type;
    return this;
  }

  /**
   * Payment terms type.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment terms type.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentPaymentsListItemPaymentTerms issuedDocumentPaymentsListItemPaymentTerms =
        (IssuedDocumentPaymentsListItemPaymentTerms) o;
    return Objects.equals(this.days, issuedDocumentPaymentsListItemPaymentTerms.days)
        && Objects.equals(this.type, issuedDocumentPaymentsListItemPaymentTerms.type);
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
    return Objects.hash(days, type);
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
    sb.append("class IssuedDocumentPaymentsListItemPaymentTerms {\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("days");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to
   *     IssuedDocumentPaymentsListItemPaymentTerms
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (IssuedDocumentPaymentsListItemPaymentTerms.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in IssuedDocumentPaymentsListItemPaymentTerms is not found in the empty JSON string",
                IssuedDocumentPaymentsListItemPaymentTerms.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!IssuedDocumentPaymentsListItemPaymentTerms.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `IssuedDocumentPaymentsListItemPaymentTerms` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
        && !jsonObj.get("type").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `type` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("type").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!IssuedDocumentPaymentsListItemPaymentTerms.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'IssuedDocumentPaymentsListItemPaymentTerms' and
                     // its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<IssuedDocumentPaymentsListItemPaymentTerms> thisAdapter =
          gson.getDelegateAdapter(
              this, TypeToken.get(IssuedDocumentPaymentsListItemPaymentTerms.class));

      return (TypeAdapter<T>)
          new TypeAdapter<IssuedDocumentPaymentsListItemPaymentTerms>() {
            @Override
            public void write(JsonWriter out, IssuedDocumentPaymentsListItemPaymentTerms value)
                throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public IssuedDocumentPaymentsListItemPaymentTerms read(JsonReader in)
                throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of IssuedDocumentPaymentsListItemPaymentTerms given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssuedDocumentPaymentsListItemPaymentTerms
   * @throws IOException if the JSON string is invalid with respect to
   *     IssuedDocumentPaymentsListItemPaymentTerms
   */
  public static IssuedDocumentPaymentsListItemPaymentTerms fromJson(String jsonString)
      throws IOException {
    return JSON.getGson().fromJson(jsonString, IssuedDocumentPaymentsListItemPaymentTerms.class);
  }

  /**
   * Convert an instance of IssuedDocumentPaymentsListItemPaymentTerms to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
