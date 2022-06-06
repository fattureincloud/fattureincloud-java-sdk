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


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Vat kind (esigibilità IVA). */
@JsonAdapter(VatKind.Adapter.class)
public enum VatKind {
  NULL("null"),

  I("I"),

  D("D"),

  S("S");

  private String value;

  VatKind(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VatKind fromValue(String value) {
    for (VatKind b : VatKind.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<VatKind> {
    @Override
    public void write(final JsonWriter jsonWriter, final VatKind enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VatKind read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VatKind.fromValue(value);
    }
  }
}
