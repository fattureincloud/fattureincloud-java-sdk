/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.14
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

/**
 * Company type.
 */
@JsonAdapter(CompanyType.Adapter.class)
public enum CompanyType {

    COMPANY("company"),

    ACCOUNTANT("accountant");

    private final String value;

    CompanyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CompanyType fromValue(String value) {
        for (CompanyType b : CompanyType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CompanyType> {
        @Override
        public void write(final JsonWriter jsonWriter, final CompanyType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public CompanyType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return CompanyType.fromValue(value);
        }
    }
}

