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


/**
 * Model tests for IssuedDocumentType
 */
public class IssuedDocumentTypeTest {
    /**
     * Model tests for IssuedDocumentType
     */
    @Test
    public void testIssuedDocumentType() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();

        assertEquals("\"credit_note\"", gson.toJson(IssuedDocumentType.CREDIT_NOTE));
        assertEquals("\"delivery_note\"", gson.toJson(IssuedDocumentType.DELIVERY_NOTE));
        assertEquals("\"invoice\"", gson.toJson(IssuedDocumentType.INVOICE));
        assertEquals("\"order\"", gson.toJson(IssuedDocumentType.ORDER));
        assertEquals("\"proforma\"", gson.toJson(IssuedDocumentType.PROFORMA));
        assertEquals("\"quote\"", gson.toJson(IssuedDocumentType.QUOTE));
        assertEquals("\"receipt\"", gson.toJson(IssuedDocumentType.RECEIPT));
        assertEquals("\"supplier_order\"", gson.toJson(IssuedDocumentType.SUPPLIER_ORDER));
        assertEquals("\"work_report\"", gson.toJson(IssuedDocumentType.WORK_REPORT));


        assertEquals(IssuedDocumentType.CREDIT_NOTE, gson.fromJson("\"credit_note\"", IssuedDocumentType.class));
        assertEquals(IssuedDocumentType.DELIVERY_NOTE, gson.fromJson("\"delivery_note\"", IssuedDocumentType.class));
        assertEquals(IssuedDocumentType.INVOICE, gson.fromJson("\"invoice\"", IssuedDocumentType.class));
        assertEquals(IssuedDocumentType.ORDER, gson.fromJson("\"order\"", IssuedDocumentType.class));
        assertEquals(IssuedDocumentType.PROFORMA, gson.fromJson("\"proforma\"", IssuedDocumentType.class));
        assertEquals(IssuedDocumentType.QUOTE, gson.fromJson("\"quote\"", IssuedDocumentType.class));
        assertEquals(IssuedDocumentType.RECEIPT, gson.fromJson("\"receipt\"", IssuedDocumentType.class));
        assertEquals(IssuedDocumentType.SUPPLIER_ORDER, gson.fromJson("\"supplier_order\"", IssuedDocumentType.class));
        assertEquals(IssuedDocumentType.WORK_REPORT, gson.fromJson("\"work_report\"", IssuedDocumentType.class));


        assertEquals("credit_note", IssuedDocumentType.CREDIT_NOTE.getValue());
        assertEquals("delivery_note", IssuedDocumentType.DELIVERY_NOTE.getValue());
        assertEquals("invoice", IssuedDocumentType.INVOICE.getValue());
        assertEquals("order", IssuedDocumentType.ORDER.getValue());
        assertEquals("proforma", IssuedDocumentType.PROFORMA.getValue());
        assertEquals("quote", IssuedDocumentType.QUOTE.getValue());
        assertEquals("receipt", IssuedDocumentType.RECEIPT.getValue());
        assertEquals("supplier_order", IssuedDocumentType.SUPPLIER_ORDER.getValue());
        assertEquals("work_report", IssuedDocumentType.WORK_REPORT.getValue());


        assertEquals("credit_note", IssuedDocumentType.CREDIT_NOTE.toString());
        assertEquals("delivery_note", IssuedDocumentType.DELIVERY_NOTE.toString());
        assertEquals("invoice", IssuedDocumentType.INVOICE.toString());
        assertEquals("order", IssuedDocumentType.ORDER.toString());
        assertEquals("proforma", IssuedDocumentType.PROFORMA.toString());
        assertEquals("quote", IssuedDocumentType.QUOTE.toString());
        assertEquals("receipt", IssuedDocumentType.RECEIPT.toString());
        assertEquals("supplier_order", IssuedDocumentType.SUPPLIER_ORDER.toString());
        assertEquals("work_report", IssuedDocumentType.WORK_REPORT.toString());

        assertEquals(IssuedDocumentType.CREDIT_NOTE, IssuedDocumentType.fromValue("credit_note"));
        assertEquals(IssuedDocumentType.DELIVERY_NOTE, IssuedDocumentType.fromValue("delivery_note"));
        assertEquals(IssuedDocumentType.INVOICE, IssuedDocumentType.fromValue("invoice"));
        assertEquals(IssuedDocumentType.ORDER, IssuedDocumentType.fromValue("order"));
        assertEquals(IssuedDocumentType.PROFORMA, IssuedDocumentType.fromValue("proforma"));
        assertEquals(IssuedDocumentType.QUOTE, IssuedDocumentType.fromValue("quote"));
        assertEquals(IssuedDocumentType.RECEIPT, IssuedDocumentType.fromValue("receipt"));
        assertEquals(IssuedDocumentType.SUPPLIER_ORDER, IssuedDocumentType.fromValue("supplier_order"));
        assertEquals(IssuedDocumentType.WORK_REPORT, IssuedDocumentType.fromValue("work_report"));
    }

}
