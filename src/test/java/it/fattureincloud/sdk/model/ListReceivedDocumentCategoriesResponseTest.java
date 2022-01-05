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

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for ListReceivedDocumentCategoriesResponse
 */
public class ListReceivedDocumentCategoriesResponseTest {
    private ListReceivedDocumentCategoriesResponse model;

    @BeforeEach
    public void init() {
        model = new ListReceivedDocumentCategoriesResponse()
                .addDataItem("cat5");
    }

    /**
     * Model tests for ListReceivedDocumentCategoriesResponse
     */
    @Test
    public void testListReceivedDocumentCategoriesResponse() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"data\":[\"cat5\"]}";
        assertEquals(str, json);
        ListReceivedDocumentCategoriesResponse generated = gson.fromJson(str, ListReceivedDocumentCategoriesResponse.class);
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
        assertEquals("cat5", model.getData().get(0));
        model.setData(Arrays.asList("cat6"));
        assertEquals("cat6", model.getData().get(0));

        model.data(Arrays.asList("cat5"));
        ListReceivedDocumentCategoriesResponse actual = new ListReceivedDocumentCategoriesResponse();
        actual.setData(Arrays.asList("cat5"));
        assertEquals(model, actual);
    }

}
