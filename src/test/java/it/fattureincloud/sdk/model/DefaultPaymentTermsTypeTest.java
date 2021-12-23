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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Model tests for DefaultPaymentTermsType
 */
public class DefaultPaymentTermsTypeTest {
    /**
     * Model tests for DefaultPaymentTermsType
     */
    @Test
    public void testDefaultPaymentTermsType() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();

        assertEquals("\"standard\"", gson.toJson(DefaultPaymentTermsType.STANDARD));
        assertEquals("\"end_of_month\"", gson.toJson(DefaultPaymentTermsType.END_OF_MONTH));

        assertEquals(DefaultPaymentTermsType.STANDARD, gson.fromJson("\"standard\"", DefaultPaymentTermsType.class));
        assertEquals(DefaultPaymentTermsType.END_OF_MONTH, gson.fromJson("\"end_of_month\"", DefaultPaymentTermsType.class));

        assertEquals("standard", DefaultPaymentTermsType.STANDARD.getValue());
        assertEquals("end_of_month", DefaultPaymentTermsType.END_OF_MONTH.getValue());

        assertEquals("standard", DefaultPaymentTermsType.STANDARD.toString());
        assertEquals("end_of_month", DefaultPaymentTermsType.END_OF_MONTH.toString());

        assertEquals(DefaultPaymentTermsType.STANDARD, DefaultPaymentTermsType.fromValue("standard"));
        assertEquals(DefaultPaymentTermsType.END_OF_MONTH, DefaultPaymentTermsType.fromValue("end_of_month"));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            DefaultPaymentTermsType.fromValue("Evil Joshua");
        });
    }

}
