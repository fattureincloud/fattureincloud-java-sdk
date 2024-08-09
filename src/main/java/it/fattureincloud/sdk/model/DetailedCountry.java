/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.1
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

/** DetailedCountry */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-09T09:03:55.704569Z[Etc/UTC]",
    comments = "Generator version: 7.7.0")
public class DetailedCountry implements Serializable {
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
   * Country name
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

  public DetailedCountry settingsName(String settingsName) {

    this.settingsName = settingsName;
    return this;
  }

  /**
   * Country settings name
   *
   * @return settingsName
   */
  @javax.annotation.Nullable
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
   * Country iso code
   *
   * @return iso
   */
  @javax.annotation.Nullable
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
   * Country fiscal iso code
   *
   * @return fiscalIso
   */
  @javax.annotation.Nullable
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
   * Country uic
   *
   * @return uic
   */
  @javax.annotation.Nullable
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
}
