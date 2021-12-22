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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for CashbookEntryDataDocument
 */
public class CashbookEntryDataDocumentTest {
    private CashbookEntryDataDocument model;

    @BeforeEach
    public void init() {
        model = new CashbookEntryDataDocument()
                .id(12345)
                .type("issued_document")
                .path("/doc1.pdf");
    }

    /**
     * Model tests for CashbookEntryDataDocument
     */
    @Test
    public void testCashbookEntryDataDocument() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"id\":12345,\"type\":\"issued_document\",\"path\":\"/doc1.pdf\"}";
        assertEquals(str, json);
        CashbookEntryDataDocument generated = gson.fromJson(str, CashbookEntryDataDocument.class);
        assertEquals(model, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        assertEquals(12345, model.getId());
        model.setId(33333);
        assertEquals(33333, model.getId());

        CashbookEntryDataDocument c = model.id(69);
        CashbookEntryDataDocument expected = new CashbookEntryDataDocument()
                .id(69)
                .type("issued_document")
                .path("/doc1.pdf");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        assertEquals("issued_document", model.getType());
        model.setType("receipt");
        assertEquals("receipt", model.getType());

        CashbookEntryDataDocument c = model.type("received_document");
        CashbookEntryDataDocument expected = new CashbookEntryDataDocument()
                .id(12345)
                .type("received_document")
                .path("/doc1.pdf");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'path'
     */
    @Test
    public void pathTest() {
        assertEquals("/doc1.pdf", model.getPath());
        model.setPath("/text.docx");
        assertEquals("/text.docx", model.getPath());

        CashbookEntryDataDocument c = model.path("/tab_2.xlsx");
        CashbookEntryDataDocument expected = new CashbookEntryDataDocument()
                .id(12345)
                .type("issued_document")
                .path("/tab_2.xlsx");
        assertEquals(expected, c);
    }

}
