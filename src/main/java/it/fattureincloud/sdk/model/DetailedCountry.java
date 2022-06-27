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

/** DetailedCountry */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-06-27T13:55:38.073Z[Etc/UTC]")
public class DetailedCountry {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SETTINGS_NAME = "settings_name";

  @SerializedName(SERIALIZED_NAME_SETTINGS_NAME)
  private String settingsName;

  public static final String SERIALIZED_NAME_ISO = "iso";

  @SerializedName(SERIALIZED_NAME_ISO)
  private String iso;

  public static final String SERIALIZED_NAME_FISCAL_ISO = "fiscal_iso";

  @SerializedName(SERIALIZED_NAME_FISCAL_ISO)
  private String fiscalIso;

  public static final String SERIALIZED_NAME_UIC = "uic";

  @SerializedName(SERIALIZED_NAME_UIC)
  private String uic;

  public DetailedCountry() {}

  public DetailedCountry name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Country name.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DetailedCountry settingsName(String settingsName) {

    this.settingsName = settingsName;
    return this;
  }

  /**
   * Get settingsName
   *
   * @return settingsName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getSettingsName() {
    return settingsName;
  }

  public void setSettingsName(String settingsName) {
    this.settingsName = settingsName;
  }

  public DetailedCountry iso(String iso) {

    this.iso = iso;
    return this;
  }

  /**
   * Country iso.
   *
   * @return iso
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country iso.")
  public String getIso() {
    return iso;
  }

  public void setIso(String iso) {
    this.iso = iso;
  }

  public DetailedCountry fiscalIso(String fiscalIso) {

    this.fiscalIso = fiscalIso;
    return this;
  }

  /**
   * Get fiscalIso
   *
   * @return fiscalIso
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getFiscalIso() {
    return fiscalIso;
  }

  public void setFiscalIso(String fiscalIso) {
    this.fiscalIso = fiscalIso;
  }

  public DetailedCountry uic(String uic) {

    this.uic = uic;
    return this;
  }

  /**
   * Country uic.
   *
   * @return uic
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country uic.")
  public String getUic() {
    return uic;
  }

  public void setUic(String uic) {
    this.uic = uic;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedCountry detailedCountry = (DetailedCountry) o;
    return Objects.equals(this.name, detailedCountry.name)
        && Objects.equals(this.settingsName, detailedCountry.settingsName)
        && Objects.equals(this.iso, detailedCountry.iso)
        && Objects.equals(this.fiscalIso, detailedCountry.fiscalIso)
        && Objects.equals(this.uic, detailedCountry.uic);
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
    return Objects.hash(name, settingsName, iso, fiscalIso, uic);
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
    sb.append("class DetailedCountry {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    settingsName: ").append(toIndentedString(settingsName)).append("\n");
    sb.append("    iso: ").append(toIndentedString(iso)).append("\n");
    sb.append("    fiscalIso: ").append(toIndentedString(fiscalIso)).append("\n");
    sb.append("    uic: ").append(toIndentedString(uic)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("settings_name");
    openapiFields.add("iso");
    openapiFields.add("fiscal_iso");
    openapiFields.add("uic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to DetailedCountry
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (DetailedCountry.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in DetailedCountry is not found in the empty JSON string",
                DetailedCountry.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!DetailedCountry.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `DetailedCountry` properties. JSON: %s",
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
    if ((jsonObj.get("settings_name") != null && !jsonObj.get("settings_name").isJsonNull())
        && !jsonObj.get("settings_name").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `settings_name` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("settings_name").toString()));
    }
    if ((jsonObj.get("iso") != null && !jsonObj.get("iso").isJsonNull())
        && !jsonObj.get("iso").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `iso` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("iso").toString()));
    }
    if ((jsonObj.get("fiscal_iso") != null && !jsonObj.get("fiscal_iso").isJsonNull())
        && !jsonObj.get("fiscal_iso").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `fiscal_iso` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("fiscal_iso").toString()));
    }
    if ((jsonObj.get("uic") != null && !jsonObj.get("uic").isJsonNull())
        && !jsonObj.get("uic").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `uic` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("uic").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DetailedCountry.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DetailedCountry' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DetailedCountry> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DetailedCountry.class));

      return (TypeAdapter<T>)
          new TypeAdapter<DetailedCountry>() {
            @Override
            public void write(JsonWriter out, DetailedCountry value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public DetailedCountry read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of DetailedCountry given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DetailedCountry
   * @throws IOException if the JSON string is invalid with respect to DetailedCountry
   */
  public static DetailedCountry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DetailedCountry.class);
  }

  /**
   * Convert an instance of DetailedCountry to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
