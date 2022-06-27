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

/** IssuedDocumentPreCreateInfoExtraDataDefaultValues */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-06-27T13:55:38.073Z[Etc/UTC]")
public class IssuedDocumentPreCreateInfoExtraDataDefaultValues {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TS_COMMUNICATION = "ts_communication";

  @SerializedName(SERIALIZED_NAME_TS_COMMUNICATION)
  private Boolean tsCommunication;

  public static final String SERIALIZED_NAME_TS_TIPO_SPESA = "ts_tipo_spesa";

  @SerializedName(SERIALIZED_NAME_TS_TIPO_SPESA)
  private String tsTipoSpesa;

  public static final String SERIALIZED_NAME_TS_FLAG_TIPO_SPESA = "ts_flag_tipo_spesa";

  @SerializedName(SERIALIZED_NAME_TS_FLAG_TIPO_SPESA)
  private Integer tsFlagTipoSpesa;

  public static final String SERIALIZED_NAME_TS_PAGAMENTO_TRACCIATO = "ts_pagamento_tracciato";

  @SerializedName(SERIALIZED_NAME_TS_PAGAMENTO_TRACCIATO)
  private Boolean tsPagamentoTracciato;

  public IssuedDocumentPreCreateInfoExtraDataDefaultValues() {}

  public IssuedDocumentPreCreateInfoExtraDataDefaultValues tsCommunication(
      Boolean tsCommunication) {

    this.tsCommunication = tsCommunication;
    return this;
  }

  /**
   * Get tsCommunication
   *
   * @return tsCommunication
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getTsCommunication() {
    return tsCommunication;
  }

  public void setTsCommunication(Boolean tsCommunication) {
    this.tsCommunication = tsCommunication;
  }

  public IssuedDocumentPreCreateInfoExtraDataDefaultValues tsTipoSpesa(String tsTipoSpesa) {

    this.tsTipoSpesa = tsTipoSpesa;
    return this;
  }

  /**
   * Get tsTipoSpesa
   *
   * @return tsTipoSpesa
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getTsTipoSpesa() {
    return tsTipoSpesa;
  }

  public void setTsTipoSpesa(String tsTipoSpesa) {
    this.tsTipoSpesa = tsTipoSpesa;
  }

  public IssuedDocumentPreCreateInfoExtraDataDefaultValues tsFlagTipoSpesa(
      Integer tsFlagTipoSpesa) {

    this.tsFlagTipoSpesa = tsFlagTipoSpesa;
    return this;
  }

  /**
   * Get tsFlagTipoSpesa
   *
   * @return tsFlagTipoSpesa
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getTsFlagTipoSpesa() {
    return tsFlagTipoSpesa;
  }

  public void setTsFlagTipoSpesa(Integer tsFlagTipoSpesa) {
    this.tsFlagTipoSpesa = tsFlagTipoSpesa;
  }

  public IssuedDocumentPreCreateInfoExtraDataDefaultValues tsPagamentoTracciato(
      Boolean tsPagamentoTracciato) {

    this.tsPagamentoTracciato = tsPagamentoTracciato;
    return this;
  }

  /**
   * Get tsPagamentoTracciato
   *
   * @return tsPagamentoTracciato
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getTsPagamentoTracciato() {
    return tsPagamentoTracciato;
  }

  public void setTsPagamentoTracciato(Boolean tsPagamentoTracciato) {
    this.tsPagamentoTracciato = tsPagamentoTracciato;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentPreCreateInfoExtraDataDefaultValues
        issuedDocumentPreCreateInfoExtraDataDefaultValues =
            (IssuedDocumentPreCreateInfoExtraDataDefaultValues) o;
    return Objects.equals(
            this.tsCommunication, issuedDocumentPreCreateInfoExtraDataDefaultValues.tsCommunication)
        && Objects.equals(
            this.tsTipoSpesa, issuedDocumentPreCreateInfoExtraDataDefaultValues.tsTipoSpesa)
        && Objects.equals(
            this.tsFlagTipoSpesa, issuedDocumentPreCreateInfoExtraDataDefaultValues.tsFlagTipoSpesa)
        && Objects.equals(
            this.tsPagamentoTracciato,
            issuedDocumentPreCreateInfoExtraDataDefaultValues.tsPagamentoTracciato);
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
    return Objects.hash(tsCommunication, tsTipoSpesa, tsFlagTipoSpesa, tsPagamentoTracciato);
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
    sb.append("class IssuedDocumentPreCreateInfoExtraDataDefaultValues {\n");
    sb.append("    tsCommunication: ").append(toIndentedString(tsCommunication)).append("\n");
    sb.append("    tsTipoSpesa: ").append(toIndentedString(tsTipoSpesa)).append("\n");
    sb.append("    tsFlagTipoSpesa: ").append(toIndentedString(tsFlagTipoSpesa)).append("\n");
    sb.append("    tsPagamentoTracciato: ")
        .append(toIndentedString(tsPagamentoTracciato))
        .append("\n");
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
    openapiFields.add("ts_communication");
    openapiFields.add("ts_tipo_spesa");
    openapiFields.add("ts_flag_tipo_spesa");
    openapiFields.add("ts_pagamento_tracciato");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to
   *     IssuedDocumentPreCreateInfoExtraDataDefaultValues
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (IssuedDocumentPreCreateInfoExtraDataDefaultValues.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in IssuedDocumentPreCreateInfoExtraDataDefaultValues is not found in the empty JSON string",
                IssuedDocumentPreCreateInfoExtraDataDefaultValues.openapiRequiredFields
                    .toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!IssuedDocumentPreCreateInfoExtraDataDefaultValues.openapiFields.contains(
          entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `IssuedDocumentPreCreateInfoExtraDataDefaultValues` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("ts_tipo_spesa") != null && !jsonObj.get("ts_tipo_spesa").isJsonNull())
        && !jsonObj.get("ts_tipo_spesa").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `ts_tipo_spesa` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("ts_tipo_spesa").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!IssuedDocumentPreCreateInfoExtraDataDefaultValues.class.isAssignableFrom(
          type.getRawType())) {
        return null; // this class only serializes
                     // 'IssuedDocumentPreCreateInfoExtraDataDefaultValues' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<IssuedDocumentPreCreateInfoExtraDataDefaultValues> thisAdapter =
          gson.getDelegateAdapter(
              this, TypeToken.get(IssuedDocumentPreCreateInfoExtraDataDefaultValues.class));

      return (TypeAdapter<T>)
          new TypeAdapter<IssuedDocumentPreCreateInfoExtraDataDefaultValues>() {
            @Override
            public void write(
                JsonWriter out, IssuedDocumentPreCreateInfoExtraDataDefaultValues value)
                throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public IssuedDocumentPreCreateInfoExtraDataDefaultValues read(JsonReader in)
                throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of IssuedDocumentPreCreateInfoExtraDataDefaultValues given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssuedDocumentPreCreateInfoExtraDataDefaultValues
   * @throws IOException if the JSON string is invalid with respect to
   *     IssuedDocumentPreCreateInfoExtraDataDefaultValues
   */
  public static IssuedDocumentPreCreateInfoExtraDataDefaultValues fromJson(String jsonString)
      throws IOException {
    return JSON.getGson()
        .fromJson(jsonString, IssuedDocumentPreCreateInfoExtraDataDefaultValues.class);
  }

  /**
   * Convert an instance of IssuedDocumentPreCreateInfoExtraDataDefaultValues to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
