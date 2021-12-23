/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.7
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
import static org.junit.jupiter.api.Assertions.assertNull;


/**
 * Model tests for SupplierType
 */
public class SupplierTypeTest {
    /**
     * Model tests for SupplierType
     */
    @Test
    public void testSupplierType() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();

        assertEquals("\"null\"", gson.toJson(SupplierType.NULL));
        assertEquals("\"company\"", gson.toJson(SupplierType.COMPANY));
        assertEquals("\"person\"", gson.toJson(SupplierType.PERSON));
        assertEquals("\"pa\"", gson.toJson(SupplierType.PA));
        assertEquals("\"condo\"", gson.toJson(SupplierType.CONDO));

        assertEquals(SupplierType.NULL, gson.fromJson("\"null\"", SupplierType.class));
        assertEquals(SupplierType.COMPANY, gson.fromJson("\"company\"", SupplierType.class));
        assertEquals(SupplierType.PERSON, gson.fromJson("\"person\"", SupplierType.class));
        assertEquals(SupplierType.PA, gson.fromJson("\"pa\"", SupplierType.class));
        assertEquals(SupplierType.CONDO, gson.fromJson("\"condo\"", SupplierType.class));

        assertEquals("null", SupplierType.NULL.getValue());
        assertEquals("company", SupplierType.COMPANY.getValue());
        assertEquals("person", SupplierType.PERSON.getValue());
        assertEquals("pa", SupplierType.PA.getValue());
        assertEquals("condo", SupplierType.CONDO.getValue());

        assertEquals("null", SupplierType.NULL.toString());
        assertEquals("company", SupplierType.COMPANY.toString());
        assertEquals("person", SupplierType.PERSON.toString());
        assertEquals("pa", SupplierType.PA.toString());
        assertEquals("condo", SupplierType.CONDO.toString());

        assertEquals(SupplierType.NULL, SupplierType.fromValue("null"));
        assertEquals(SupplierType.COMPANY, SupplierType.fromValue("company"));
        assertEquals(SupplierType.PERSON, SupplierType.fromValue("person"));
        assertEquals(SupplierType.PA, SupplierType.fromValue("pa"));
        assertEquals(SupplierType.CONDO, SupplierType.fromValue("condo"));

        assertNull(SupplierType.fromValue("Evil Joshua"));
    }

}
