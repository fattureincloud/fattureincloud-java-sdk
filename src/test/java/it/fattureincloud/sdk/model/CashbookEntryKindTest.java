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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Model tests for CashbookEntryKind
 */
public class CashbookEntryKindTest {
    /**
     * Model tests for CashbookEntryKind
     */
    @Test
    public void testCashbookEntryKind() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();

        assertEquals("\"cashbook\"", gson.toJson(CashbookEntryKind.CASHBOOK));
        assertEquals("\"issued_document\"", gson.toJson(CashbookEntryKind.ISSUED_DOCUMENT));
        assertEquals("\"received_document\"", gson.toJson(CashbookEntryKind.RECEIVED_DOCUMENT));
        assertEquals("\"tax\"", gson.toJson(CashbookEntryKind.TAX));
        assertEquals("\"receipt\"", gson.toJson(CashbookEntryKind.RECEIPT));

        assertEquals(CashbookEntryKind.CASHBOOK, gson.fromJson("\"cashbook\"", CashbookEntryKind.class));
        assertEquals(CashbookEntryKind.ISSUED_DOCUMENT, gson.fromJson("\"issued_document\"", CashbookEntryKind.class));
        assertEquals(CashbookEntryKind.RECEIVED_DOCUMENT, gson.fromJson("\"received_document\"", CashbookEntryKind.class));
        assertEquals(CashbookEntryKind.TAX, gson.fromJson("\"tax\"", CashbookEntryKind.class));
        assertEquals(CashbookEntryKind.RECEIPT, gson.fromJson("\"receipt\"", CashbookEntryKind.class));

        assertEquals("cashbook", CashbookEntryKind.CASHBOOK.getValue());
        assertEquals("issued_document", CashbookEntryKind.ISSUED_DOCUMENT.getValue());
        assertEquals("received_document", CashbookEntryKind.RECEIVED_DOCUMENT.getValue());
        assertEquals("tax", CashbookEntryKind.TAX.getValue());
        assertEquals("receipt", CashbookEntryKind.RECEIPT.getValue());

        assertEquals("cashbook", CashbookEntryKind.CASHBOOK.toString());
        assertEquals("issued_document", CashbookEntryKind.ISSUED_DOCUMENT.toString());
        assertEquals("received_document", CashbookEntryKind.RECEIVED_DOCUMENT.toString());
        assertEquals("tax", CashbookEntryKind.TAX.toString());
        assertEquals("receipt", CashbookEntryKind.RECEIPT.toString());

        assertEquals(CashbookEntryKind.CASHBOOK, CashbookEntryKind.fromValue("cashbook"));
        assertEquals(CashbookEntryKind.ISSUED_DOCUMENT, CashbookEntryKind.fromValue("issued_document"));
        assertEquals(CashbookEntryKind.RECEIVED_DOCUMENT, CashbookEntryKind.fromValue("received_document"));
        assertEquals(CashbookEntryKind.TAX, CashbookEntryKind.fromValue("tax"));
        assertEquals(CashbookEntryKind.RECEIPT, CashbookEntryKind.fromValue("receipt"));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CashbookEntryKind.fromValue("Evil Joshua");
        });
    }

}
