/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.27
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

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for GetWebhooksSubscriptionResponse
 */
public class GetWebhooksSubscriptionResponseTest {
    private GetWebhooksSubscriptionResponse model;

    @BeforeEach
    public void init() {
        ArrayList<EventType> types = new ArrayList<>();
        types.add(EventType.CASHBOOK_CREATE);
        model =
                new GetWebhooksSubscriptionResponse()
                        .data(
                                new WebhooksSubscription()
                                        .id("SUB123")
                                        .sink("https://endpoint.test")
                                        .verified(true)
                                        .types(types)
                        );
    }

    /**
     * Model tests for GetWebhooksSubscriptionResponse
     */
    @Test
    public void testGetWebhooksSubscriptionResponse() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"data\":{\"id\":\"SUB123\",\"sink\":\"https://endpoint.test\",\"verified\":true,\"types\":[\"it.fattureincloud.webhooks.cashbook.create\"]}}";
        assertEquals(str, json);
        GetWebhooksSubscriptionResponse generated = gson.fromJson(str, GetWebhooksSubscriptionResponse.class);
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
        assertEquals("SUB123", model.getData().getId());
        model.setData(new WebhooksSubscription().id("SUB1"));
        assertEquals("SUB1", model.getData().getId());

        model.data(new WebhooksSubscription().id("SUB2"));
        GetWebhooksSubscriptionResponse actual = new GetWebhooksSubscriptionResponse();
        actual.setData(new WebhooksSubscription().id("SUB2"));
        assertEquals(model.getData(), actual.getData());
    }

}
