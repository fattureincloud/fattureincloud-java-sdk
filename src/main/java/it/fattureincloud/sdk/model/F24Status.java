/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.3
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

/** F24 status */
@JsonAdapter(F24Status.Adapter.class)
public enum F24Status {
  PAID("paid"),

  NOT_PAID("not_paid"),

  REVERSED("reversed");

  private String value;

  F24Status(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static F24Status fromValue(String value) {
    for (F24Status b : F24Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<F24Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final F24Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public F24Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return F24Status.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    F24Status.fromValue(value);
  }
}
