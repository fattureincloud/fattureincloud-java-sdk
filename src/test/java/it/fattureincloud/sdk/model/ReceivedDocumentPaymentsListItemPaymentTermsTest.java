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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for ReceivedDocumentPaymentsListItemPaymentTerms
 */
public class ReceivedDocumentPaymentsListItemPaymentTermsTest {
    private ReceivedDocumentPaymentsListItemPaymentTerms model;

    @BeforeEach
    public void init() {
        model = new ReceivedDocumentPaymentsListItemPaymentTerms()
                .days(10)
                .type("taip");
    }

    /**
     * Model tests for ReceivedDocumentPaymentsListItemPaymentTerms
     */
    @Test
    public void testReceivedDocumentPaymentsListItemPaymentTerms() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"days\":10,\"type\":\"taip\"}";
        assertEquals(str, json);
        ReceivedDocumentPaymentsListItemPaymentTerms generated = gson.fromJson(str, ReceivedDocumentPaymentsListItemPaymentTerms.class);
        assertEquals(model, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'days'
     */
    @Test
    public void daysTest() {
        assertEquals(10, model.getDays());
        model.setDays(11);
        assertEquals(11, model.getDays());

        ReceivedDocumentPaymentsListItemPaymentTerms i = model.days(10);
        ReceivedDocumentPaymentsListItemPaymentTerms expected = new ReceivedDocumentPaymentsListItemPaymentTerms()
                .days(10)
                .type("taip");
        assertEquals(expected, i);
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        assertEquals("taip", model.getType());
        model.setType("taipV2");
        assertEquals("taipV2", model.getType());

        ReceivedDocumentPaymentsListItemPaymentTerms i = model.type("taip");
        ReceivedDocumentPaymentsListItemPaymentTerms expected = new ReceivedDocumentPaymentsListItemPaymentTerms()
                .days(10)
                .type("taip");
        assertEquals(expected, i);
    }

}
