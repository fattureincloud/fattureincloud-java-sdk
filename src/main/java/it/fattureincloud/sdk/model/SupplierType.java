/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.32
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;


import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Supplier type */
@JsonAdapter(SupplierType.Adapter.class)
public enum SupplierType {
  COMPANY("company"),

  PERSON("person"),

  PA("pa"),

  CONDO("condo");

  private String value;

  SupplierType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SupplierType fromValue(String value) {
    for (SupplierType b : SupplierType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SupplierType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SupplierType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SupplierType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SupplierType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    SupplierType.fromValue(value);
  }
}
