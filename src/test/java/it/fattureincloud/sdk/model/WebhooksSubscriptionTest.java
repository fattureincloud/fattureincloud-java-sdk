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
 * Model tests for WebhooksSubscription
 */
public class WebhooksSubscriptionTest {
    private WebhooksSubscription model;

  @BeforeEach
  public void init() {
    ArrayList<EventType> types = new ArrayList<>();
    types.add(EventType.CASHBOOK_CREATE);
    model =
        new WebhooksSubscription()
            .id("SUB123")
            .sink("https://endpoint.test")
            .verified(true)
            .types(types);
    }

    /**
     * Model tests for WebhooksSubscription
     */
    @Test
    public void testWebhooksSubscription() {
      JSON jsonManager = new JSON();
      Gson gson = jsonManager.getGson();
      String json = gson.toJson(model);
      String str = "{\"id\":\"SUB123\",\"sink\":\"https://endpoint.test\",\"verified\":true,\"types\":[\"it.fattureincloud.cashbook.create\"]}";
      assertEquals(str, json);
      WebhooksSubscription generated = gson.fromJson(str, WebhooksSubscription.class);
      assertEquals(model, generated);

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
      assertEquals("SUB123", model.getId());
      model.setId("SUB1234");
      assertEquals("SUB1234", model.getId());

      ArrayList<EventType> types = new ArrayList<>();
      types.add(EventType.CASHBOOK_CREATE);
      WebhooksSubscription a = model.id("SUB12345");
      WebhooksSubscription expected =
              new WebhooksSubscription()
                      .id("SUB12345")
                      .sink("https://endpoint.test")
                      .verified(true)
                      .types(types);
      assertEquals(expected, a);
    }

    /**
     * Test the property 'sink'
     */
    @Test
    public void sinkTest() {
      assertEquals("https://endpoint.test", model.getSink());
      model.setSink("https://endpoint2.test");
      assertEquals("https://endpoint2.test", model.getSink());

      ArrayList<EventType> types = new ArrayList<>();
      types.add(EventType.CASHBOOK_CREATE);
      WebhooksSubscription a = model.sink("https://endpoint3.test");
      WebhooksSubscription expected =
              new WebhooksSubscription()
                      .id("SUB123")
                      .sink("https://endpoint3.test")
                      .verified(true)
                      .types(types);
      assertEquals(expected, a);
    }

    /**
     * Test the property 'verified'
     */
    @Test
    public void verifiedTest() {
      assertEquals(true, model.getVerified());
      model.setVerified(false);
      assertEquals(false, model.getVerified());

      ArrayList<EventType> types = new ArrayList<>();
      types.add(EventType.CASHBOOK_CREATE);
      WebhooksSubscription a = model.verified(true);
      WebhooksSubscription expected =
              new WebhooksSubscription()
                      .id("SUB123")
                      .sink("https://endpoint.test")
                      .verified(true)
                      .types(types);
      assertEquals(expected, a);
    }

    /**
     * Test the property 'types'
     */
    @Test
    public void typesTest() {
      ArrayList<EventType> types = new ArrayList<>();
      types.add(EventType.CASHBOOK_CREATE);

      assertEquals(types, model.getTypes());
      ArrayList<EventType> types2 = new ArrayList<>();
      types2.add(EventType.CASHBOOK_UPDATE);
      model.setTypes(types2);
      assertEquals(types2, model.getTypes());

      WebhooksSubscription a = model.types(types);
      WebhooksSubscription expected =
              new WebhooksSubscription()
                      .id("SUB123")
                      .sink("https://endpoint.test")
                      .verified(true)
                      .types(types);
      assertEquals(expected, a);
    }

}
