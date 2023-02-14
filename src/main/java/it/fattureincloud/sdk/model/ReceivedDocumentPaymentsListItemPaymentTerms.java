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

/** ReceivedDocumentPaymentsListItemPaymentTerms */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-02-13T13:42:26.512Z[Etc/UTC]")
public class ReceivedDocumentPaymentsListItemPaymentTerms implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DAYS = "days";

  @SerializedName(SERIALIZED_NAME_DAYS)
  private Integer days;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ReceivedDocumentPaymentsListItemPaymentTerms() {}

  public ReceivedDocumentPaymentsListItemPaymentTerms days(Integer days) {

    this.days = days;
    return this;
  }

  /**
   * Number of days.
   *
   * @return days
   */
  @javax.annotation.Nullable
  public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }

  public ReceivedDocumentPaymentsListItemPaymentTerms type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
    ReceivedDocumentPaymentsListItemPaymentTerms receivedDocumentPaymentsListItemPaymentTerms =
        (ReceivedDocumentPaymentsListItemPaymentTerms) o;
    return Objects.equals(this.days, receivedDocumentPaymentsListItemPaymentTerms.days)
        && Objects.equals(this.type, receivedDocumentPaymentsListItemPaymentTerms.type);
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
    sb.append("class ReceivedDocumentPaymentsListItemPaymentTerms {\n");
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
   *     ReceivedDocumentPaymentsListItemPaymentTerms
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (!ReceivedDocumentPaymentsListItemPaymentTerms.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON object is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ReceivedDocumentPaymentsListItemPaymentTerms is not"
                    + " found in the empty JSON string",
                ReceivedDocumentPaymentsListItemPaymentTerms.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!ReceivedDocumentPaymentsListItemPaymentTerms.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the"
                    + " `ReceivedDocumentPaymentsListItemPaymentTerms` properties. JSON: %s",
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
      if (!ReceivedDocumentPaymentsListItemPaymentTerms.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ReceivedDocumentPaymentsListItemPaymentTerms'
        // and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ReceivedDocumentPaymentsListItemPaymentTerms> thisAdapter =
          gson.getDelegateAdapter(
              this, TypeToken.get(ReceivedDocumentPaymentsListItemPaymentTerms.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ReceivedDocumentPaymentsListItemPaymentTerms>() {
            @Override
            public void write(JsonWriter out, ReceivedDocumentPaymentsListItemPaymentTerms value)
                throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ReceivedDocumentPaymentsListItemPaymentTerms read(JsonReader in)
                throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ReceivedDocumentPaymentsListItemPaymentTerms given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReceivedDocumentPaymentsListItemPaymentTerms
   * @throws IOException if the JSON string is invalid with respect to
   *     ReceivedDocumentPaymentsListItemPaymentTerms
   */
  public static ReceivedDocumentPaymentsListItemPaymentTerms fromJson(String jsonString)
      throws IOException {
    return JSON.getGson().fromJson(jsonString, ReceivedDocumentPaymentsListItemPaymentTerms.class);
  }

  /**
   * Convert an instance of ReceivedDocumentPaymentsListItemPaymentTerms to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
