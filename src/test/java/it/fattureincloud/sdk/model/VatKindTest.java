/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.11
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.fattureincloud.sdk.model;

import com.google.gson.Gson;
import it.fattureincloud.sdk.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Model tests for VatKind
 */
public class VatKindTest {
    /**
     * Model tests for VatKind
     */
    @Test
    public void testVatKind() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();

        assertEquals("\"I\"", gson.toJson(VatKind.I));
        assertEquals("\"D\"", gson.toJson(VatKind.D));
        assertEquals("\"S\"", gson.toJson(VatKind.S));

        assertEquals(VatKind.I, gson.fromJson("\"I\"", VatKind.class));
        assertEquals(VatKind.D, gson.fromJson("\"D\"", VatKind.class));
        assertEquals(VatKind.S, gson.fromJson("\"S\"", VatKind.class));

        assertEquals("I", VatKind.I.getValue());
        assertEquals("D", VatKind.D.getValue());
        assertEquals("S", VatKind.S.getValue());

        assertEquals("I", VatKind.I.toString());
        assertEquals("D", VatKind.D.toString());
        assertEquals("S", VatKind.S.toString());

        assertEquals(VatKind.I, VatKind.fromValue("I"));
        assertEquals(VatKind.D, VatKind.fromValue("D"));
        assertEquals(VatKind.S, VatKind.fromValue("S"));

    }

}
