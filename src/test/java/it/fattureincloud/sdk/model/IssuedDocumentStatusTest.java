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
 * Model tests for IssuedDocumentStatus
 */
public class IssuedDocumentStatusTest {
    /**
     * Model tests for IssuedDocumentStatus
     */
    @Test
    public void testIssuedDocumentStatus() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();

        assertEquals("\"paid\"", gson.toJson(IssuedDocumentStatus.PAID));
        assertEquals("\"not_paid\"", gson.toJson(IssuedDocumentStatus.NOT_PAID));
        assertEquals("\"reversed\"", gson.toJson(IssuedDocumentStatus.REVERSED));


        assertEquals(IssuedDocumentStatus.PAID, gson.fromJson("\"paid\"", IssuedDocumentStatus.class));
        assertEquals(IssuedDocumentStatus.NOT_PAID, gson.fromJson("\"not_paid\"", IssuedDocumentStatus.class));
        assertEquals(IssuedDocumentStatus.REVERSED, gson.fromJson("\"reversed\"", IssuedDocumentStatus.class));


        assertEquals("paid", IssuedDocumentStatus.PAID.getValue());
        assertEquals("not_paid", IssuedDocumentStatus.NOT_PAID.getValue());
        assertEquals("reversed", IssuedDocumentStatus.REVERSED.getValue());

        assertEquals("paid", IssuedDocumentStatus.PAID.toString());
        assertEquals("not_paid", IssuedDocumentStatus.NOT_PAID.toString());
        assertEquals("reversed", IssuedDocumentStatus.REVERSED.toString());

        assertEquals(IssuedDocumentStatus.PAID, IssuedDocumentStatus.fromValue("paid"));
        assertEquals(IssuedDocumentStatus.NOT_PAID, IssuedDocumentStatus.fromValue("not_paid"));
        assertEquals(IssuedDocumentStatus.REVERSED, IssuedDocumentStatus.fromValue("reversed"));
    }

}
