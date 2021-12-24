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
 * Model tests for EmailDataSenderEmailsList
 */
public class EmailDataSenderEmailsListTest {
    private EmailDataSenderEmailsList model;

    @BeforeEach
    public void init() {
        model = new EmailDataSenderEmailsList();
    }

    /**
     * Model tests for EmailDataSenderEmailsList
     */
    @Test
    public void testEmailDataSenderEmailsList() {
        EmailDataSenderEmailsList e = new EmailDataSenderEmailsList()
                .id(0)
                .email("no-reply@fattureincloud.it");

        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(e);
        String str = "{\"id\":0,\"email\":\"no-reply@fattureincloud.it\"}";
        assertEquals(str, json);
        EmailDataSenderEmailsList generated = gson.fromJson(str, EmailDataSenderEmailsList.class);
        assertEquals(e, generated);

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
        assertNull(model.getId());
        model.setId(0);
        assertEquals(0, model.getId());

        EmailDataSenderEmailsList e = model.id(5);
        EmailDataSenderEmailsList expected = new EmailDataSenderEmailsList();
        expected.setId(5);
        assertEquals(expected, e);
    }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
        assertNull(model.getEmail());
        model.setEmail("no-reply@fattureincloud.it");
        assertEquals("no-reply@fattureincloud.it", model.getEmail());

        EmailDataSenderEmailsList e = model.email("info@fattureincloud.it");
        EmailDataSenderEmailsList expected = new EmailDataSenderEmailsList();
        expected.setEmail("info@fattureincloud.it");
        assertEquals(expected, e);
    }

}
