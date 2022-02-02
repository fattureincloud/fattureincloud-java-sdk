/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.10
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.fattureincloud.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Issued document type.
 */
@JsonAdapter(IssuedDocumentType.Adapter.class)
public enum IssuedDocumentType {
  
  INVOICE("invoice"),
  
  QUOTE("quote"),
  
  PROFORMA("proforma"),
  
  RECEIPT("receipt"),
  
  DELIVERY_NOTE("delivery_note"),
  
  CREDIT_NOTE("credit_note"),
  
  ORDER("order"),
  
  WORK_REPORT("work_report"),
  
  SUPPLIER_ORDER("supplier_order");

  private String value;

  IssuedDocumentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IssuedDocumentType fromValue(String value) {
    for (IssuedDocumentType b : IssuedDocumentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<IssuedDocumentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final IssuedDocumentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IssuedDocumentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IssuedDocumentType.fromValue(value);
    }
  }
}

