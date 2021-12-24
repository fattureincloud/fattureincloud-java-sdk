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

import static org.junit.jupiter.api.Assertions.*;


/**
 * Model tests for PermissionsFicIssuedDocumentsDetailed
 */
public class PermissionsFicIssuedDocumentsDetailedTest {
    private PermissionsFicIssuedDocumentsDetailed model;

    @BeforeEach
    public void init() {
        model = new PermissionsFicIssuedDocumentsDetailed();
    }

    /**
     * Model tests for PermissionsFicIssuedDocumentsDetailed
     */
    @Test
    public void testPermissionsFicIssuedDocumentsDetailed() {
        PermissionsFicIssuedDocumentsDetailed p = new PermissionsFicIssuedDocumentsDetailed()
                .quotes(PermissionLevel.WRITE)
                .proformas(PermissionLevel.WRITE)
                .invoices(PermissionLevel.WRITE)
                .receipts(PermissionLevel.WRITE)
                .deliveryNotes(PermissionLevel.WRITE)
                .creditNotes(PermissionLevel.WRITE)
                .orders(PermissionLevel.WRITE)
                .workReports(PermissionLevel.WRITE)
                .supplierOrders(PermissionLevel.WRITE)
                .selfInvoices(PermissionLevel.WRITE);

        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(p);
        String str = "{\"quotes\":\"write\",\"proformas\":\"write\",\"invoices\":\"write\",\"receipts\":\"write\",\"delivery_notes\":\"write\",\"credit_notes\":\"write\",\"orders\":\"write\",\"work_reports\":\"write\",\"supplier_orders\":\"write\",\"self_invoices\":\"write\"}";
        assertEquals(str, json);
        PermissionsFicIssuedDocumentsDetailed generated = gson.fromJson(str, PermissionsFicIssuedDocumentsDetailed.class);
        assertEquals(p, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'quotes'
     */
    @Test
    public void quotesTest() {
        assertNull(model.getQuotes());
        model.setQuotes(PermissionLevel.READ);
        assertEquals(PermissionLevel.READ, model.getQuotes());

        PermissionsFicIssuedDocumentsDetailed p = model.quotes(PermissionLevel.WRITE);
        PermissionsFicIssuedDocumentsDetailed expected = new PermissionsFicIssuedDocumentsDetailed();
        expected.setQuotes(PermissionLevel.WRITE);
        assertEquals(expected, p);
    }

    /**
     * Test the property 'proformas'
     */
    @Test
    public void proformasTest() {
        assertNull(model.getProformas());
        model.setProformas(PermissionLevel.READ);
        assertEquals(PermissionLevel.READ, model.getProformas());

        PermissionsFicIssuedDocumentsDetailed p = model.proformas(PermissionLevel.WRITE);
        PermissionsFicIssuedDocumentsDetailed expected = new PermissionsFicIssuedDocumentsDetailed();
        expected.setProformas(PermissionLevel.WRITE);
        assertEquals(expected, p);
    }

    /**
     * Test the property 'invoices'
     */
    @Test
    public void invoicesTest() {
        assertNull(model.getInvoices());
        model.setInvoices(PermissionLevel.READ);
        assertEquals(PermissionLevel.READ, model.getInvoices());

        PermissionsFicIssuedDocumentsDetailed p = model.invoices(PermissionLevel.WRITE);
        PermissionsFicIssuedDocumentsDetailed expected = new PermissionsFicIssuedDocumentsDetailed();
        expected.setInvoices(PermissionLevel.WRITE);
        assertEquals(expected, p);
    }

    /**
     * Test the property 'receipts'
     */
    @Test
    public void receiptsTest() {
        assertNull(model.getReceipts());
        model.setReceipts(PermissionLevel.READ);
        assertEquals(PermissionLevel.READ, model.getReceipts());

        PermissionsFicIssuedDocumentsDetailed p = model.receipts(PermissionLevel.WRITE);
        PermissionsFicIssuedDocumentsDetailed expected = new PermissionsFicIssuedDocumentsDetailed();
        expected.setReceipts(PermissionLevel.WRITE);
        assertEquals(expected, p);
    }

    /**
     * Test the property 'deliveryNotes'
     */
    @Test
    public void deliveryNotesTest() {
        assertNull(model.getDeliveryNotes());
        model.setDeliveryNotes(PermissionLevel.READ);
        assertEquals(PermissionLevel.READ, model.getDeliveryNotes());

        PermissionsFicIssuedDocumentsDetailed p = model.deliveryNotes(PermissionLevel.WRITE);
        PermissionsFicIssuedDocumentsDetailed expected = new PermissionsFicIssuedDocumentsDetailed();
        expected.setDeliveryNotes(PermissionLevel.WRITE);
        assertEquals(expected, p);
    }

    /**
     * Test the property 'creditNotes'
     */
    @Test
    public void creditNotesTest() {
        assertNull(model.getCreditNotes());
        model.setCreditNotes(PermissionLevel.READ);
        assertEquals(PermissionLevel.READ, model.getCreditNotes());

        PermissionsFicIssuedDocumentsDetailed p = model.creditNotes(PermissionLevel.WRITE);
        PermissionsFicIssuedDocumentsDetailed expected = new PermissionsFicIssuedDocumentsDetailed();
        expected.setCreditNotes(PermissionLevel.WRITE);
        assertEquals(expected, p);
    }

    /**
     * Test the property 'orders'
     */
    @Test
    public void ordersTest() {
        assertNull(model.getOrders());
        model.setOrders(PermissionLevel.READ);
        assertEquals(PermissionLevel.READ, model.getOrders());

        PermissionsFicIssuedDocumentsDetailed p = model.orders(PermissionLevel.WRITE);
        PermissionsFicIssuedDocumentsDetailed expected = new PermissionsFicIssuedDocumentsDetailed();
        expected.setOrders(PermissionLevel.WRITE);
        assertEquals(expected, p);
    }

    /**
     * Test the property 'workReports'
     */
    @Test
    public void workReportsTest() {
        assertNull(model.getWorkReports());
        model.setWorkReports(PermissionLevel.READ);
        assertEquals(PermissionLevel.READ, model.getWorkReports());

        PermissionsFicIssuedDocumentsDetailed p = model.workReports(PermissionLevel.WRITE);
        PermissionsFicIssuedDocumentsDetailed expected = new PermissionsFicIssuedDocumentsDetailed();
        expected.setWorkReports(PermissionLevel.WRITE);
        assertEquals(expected, p);
    }

    /**
     * Test the property 'supplierOrders'
     */
    @Test
    public void supplierOrdersTest() {
        assertNull(model.getSupplierOrders());
        model.setSupplierOrders(PermissionLevel.READ);
        assertEquals(PermissionLevel.READ, model.getSupplierOrders());

        PermissionsFicIssuedDocumentsDetailed p = model.supplierOrders(PermissionLevel.WRITE);
        PermissionsFicIssuedDocumentsDetailed expected = new PermissionsFicIssuedDocumentsDetailed();
        expected.setSupplierOrders(PermissionLevel.WRITE);
        assertEquals(expected, p);
    }

    /**
     * Test the property 'selfInvoices'
     */
    @Test
    public void selfInvoicesTest() {
        assertNull(model.getSelfInvoices());
        model.setSelfInvoices(PermissionLevel.READ);
        assertEquals(PermissionLevel.READ, model.getSelfInvoices());

        PermissionsFicIssuedDocumentsDetailed p = model.selfInvoices(PermissionLevel.WRITE);
        PermissionsFicIssuedDocumentsDetailed expected = new PermissionsFicIssuedDocumentsDetailed();
        expected.setSelfInvoices(PermissionLevel.WRITE);
        assertEquals(expected, p);
    }

}
