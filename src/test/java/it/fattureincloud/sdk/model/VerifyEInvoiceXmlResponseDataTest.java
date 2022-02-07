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
 * Model tests for VerifyEInvoiceXmlResponseData
 */
public class VerifyEInvoiceXmlResponseDataTest {
    private VerifyEInvoiceXmlResponseData model;

    @BeforeEach
    public void init() {
        model = new VerifyEInvoiceXmlResponseData()
                .success(true);
    }

    /**
     * Model tests for VerifyEInvoiceXmlResponseData
     */
    @Test
    public void testVerifyEInvoiceXmlResponseData() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"success\":true}";
        assertEquals(str, json);
        VerifyEInvoiceXmlResponseData generated = gson.fromJson(str, VerifyEInvoiceXmlResponseData.class);
        assertEquals(model, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'success'
     */
    @Test
    public void successTest() {
        assertEquals(true, model.getSuccess());
        model.setSuccess(false);
        assertEquals(false, model.getSuccess());

        VerifyEInvoiceXmlResponseData i = model.success(true);
        VerifyEInvoiceXmlResponseData expected = new VerifyEInvoiceXmlResponseData()
                .success(true);

        assertEquals(expected, i);
    }

}
