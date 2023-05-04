/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.27
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

/** Cashbook kind. */
@JsonAdapter(CashbookEntryKind.Adapter.class)
public enum CashbookEntryKind {
  CASHBOOK("cashbook"),

  ISSUED_DOCUMENT("issued_document"),

  RECEIVED_DOCUMENT("received_document"),

  TAX("tax"),

  RECEIPT("receipt");

  private String value;

  CashbookEntryKind(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CashbookEntryKind fromValue(String value) {
    for (CashbookEntryKind b : CashbookEntryKind.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CashbookEntryKind> {
    @Override
    public void write(final JsonWriter jsonWriter, final CashbookEntryKind enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CashbookEntryKind read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CashbookEntryKind.fromValue(value);
    }
  }
}
