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
 * Model tests for CreateIssuedDocumentRequest
 */
public class CreateIssuedDocumentRequestTest {
    private CreateIssuedDocumentRequest model;

    @BeforeEach
    public void init() {
        model = new CreateIssuedDocumentRequest()
                .data(
                        new IssuedDocument()
                                .id(12345)
                                .notes("bando")
                );
    }

    /**
     * Model tests for CreateIssuedDocumentRequest
     */
    @Test
    public void testCreateIssuedDocumentRequest() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"data\":{\"id\":12345,\"type\":\"invoice\",\"notes\":\"bando\",\"use_split_payment\":false,\"use_gross_prices\":false,\"e_invoice\":false,\"show_totals\":\"all\",\"show_paypal_button\":false,\"show_notification_button\":false,\"accompanying_invoice\":false}}";
        assertEquals(str, json);
        CreateIssuedDocumentRequest generated = gson.fromJson(str, CreateIssuedDocumentRequest.class);
        assertEquals(model, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'data'
     */
    @Test
    public void dataTest() {
        assertEquals(12345, model.getData().getId());
        model.setData(new IssuedDocument().id(1));
        assertEquals(1, model.getData().getId());

        model.data(new IssuedDocument().id(2));
        CreateIssuedDocumentRequest actual = new CreateIssuedDocumentRequest();
        actual.setData(new IssuedDocument().id(2));
        assertEquals(model, actual);
    }

}
