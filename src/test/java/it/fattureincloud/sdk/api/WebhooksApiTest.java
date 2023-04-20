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


package it.fattureincloud.sdk.api;

import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.model.*;
import okhttp3.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * API tests for WebhooksApi
 */
public class WebhooksApiTest {

    private static WebhooksApi mockApi(final String serializedBody, final Call remoteCall)
            throws IOException {
        final OkHttpClient okHttpClient = Mockito.mock(OkHttpClient.class);

        Response.Builder builder =
                new Response.Builder()
                        .request(new Request.Builder().url("https://api-v2.fattureincloud.it").build())
                        .protocol(Protocol.HTTP_1_1)
                        .code(200)
                        .message("");
        if (serializedBody != null) {
            builder =
                    builder.body(ResponseBody.create(serializedBody, MediaType.parse("application/json")));
        }

        final Response response = builder.build();

        Mockito.when(remoteCall.execute()).thenReturn(response);
        Mockito.when(okHttpClient.newCall(Mockito.any())).thenReturn(remoteCall);

        ApiClient client = new ApiClient(okHttpClient);

        return new WebhooksApi(client);
    }

    /**
     * Create a Webhook Subscription
     *
     * Register some webhooks Subscriptions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createWebhooksSubscriptionTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":\"SUB123\",\"sink\":\"https://endpoint.test\",\"verified\":true,\"types\":[\"it.fattureincloud.cashbook.create\"]},\"warnings\":[\"error\"]}";
        Call mockCall = Mockito.mock(Call.class);
        WebhooksApi api = mockApi(result, mockCall);

        Integer companyId = 11111;

        WebhooksSubscription webhooksSubscription =
                                new WebhooksSubscription()
                                        .id("SUB12345")
                                        .sink("https://endpoint.test")
                                        .verified(true)
                                        .types(Arrays.asList(EventType.CASHBOOK_CREATE)
                        );

        WebhooksSubscription expected = webhooksSubscription.id("SUB123");

        CreateWebhooksSubscriptionRequest createWebhooksSubscriptionRequest =
                new CreateWebhooksSubscriptionRequest().data(webhooksSubscription);

        CreateWebhooksSubscriptionResponse response =
                api.createWebhooksSubscription(companyId, createWebhooksSubscriptionRequest);

        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Delete Webhooks Subscription
     *
     * Delete a webhooks subscription.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWebhooksSubscriptionTest() throws ApiException, IOException {
        Call mockCall = Mockito.mock(Call.class);
        WebhooksApi api = mockApi(null, mockCall);

        Integer companyId = 11111;
        String webhooksSubscriptionId = "SUB1345";
        api.deleteWebhooksSubscription(companyId, webhooksSubscriptionId);
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Get Webhooks Subscription
     *
     * Get a webhooks subscription.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebhooksSubscriptionTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":\"SUB123\",\"sink\":\"https://endpoint.test\",\"verified\":true,\"types\":[\"it.fattureincloud.cashbook.create\"]}}";
        Call mockCall = Mockito.mock(Call.class);
        WebhooksApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        String webhooksSubscriptionId = "SUB16451";

        WebhooksSubscription expected =
                new WebhooksSubscription()
                        .id("SUB123")
                        .sink("https://endpoint.test")
                        .verified(true)
                        .types(Arrays.asList(EventType.CASHBOOK_CREATE));

        GetWebhooksSubscriptionResponse response =
                api.getWebhooksSubscription(companyId, webhooksSubscriptionId);
        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * List Webhooks Subscriptions
     *
     * List active webhooks subscriptions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listWebhooksSubscriptionsTest() throws ApiException, IOException {
        String result = "{\"data\":[{\"id\":\"SUB123\",\"sink\":\"https://endpoint.test\",\"verified\":true,\"types\":[\"it.fattureincloud.cashbook.create\"]},{\"id\":\"SUB12345\",\"sink\":\"https://endpoint.test\",\"verified\":true,\"types\":[\"it.fattureincloud.cashbook.update\"]}]}";
        Call mockCall = Mockito.mock(Call.class);
        WebhooksApi api = mockApi(result, mockCall);

        Integer companyId = 11111;

        WebhooksSubscription webhooksSubscription1 =
                new WebhooksSubscription()
                        .id("SUB123")
                        .sink("https://endpoint.test")
                        .verified(true)
                        .types(Arrays.asList(EventType.CASHBOOK_CREATE));

        WebhooksSubscription webhooksSubscription2 =
                new WebhooksSubscription()
                        .id("SUB12345")
                        .sink("https://endpoint.test")
                        .verified(true)
                        .types(Arrays.asList(EventType.CASHBOOK_UPDATE));

        List<WebhooksSubscription> expected = Arrays.asList(webhooksSubscription1, webhooksSubscription2);

        ListWebhooksSubscriptionsResponse response =
                api.listWebhooksSubscriptions(companyId);
        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Modify Webhooks Subscription
     *
     * Edit a webhooks subscription.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyWebhooksSubscriptionTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":\"SUB123\",\"sink\":\"https://endpoint.test\",\"verified\":true,\"types\":[\"it.fattureincloud.cashbook.create\"]},\"warnings\":[\"error\"]}";
        Call mockCall = Mockito.mock(Call.class);
        WebhooksApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        String webhooksSubscriptionId = "SUB123";

        WebhooksSubscription expected =
                new WebhooksSubscription()
                        .id("SUB123")
                        .sink("https://endpoint.test")
                        .verified(true)
                        .types(Arrays.asList(EventType.CASHBOOK_CREATE));

        GetWebhooksSubscriptionResponse response =
                api.getWebhooksSubscription(companyId, webhooksSubscriptionId);
        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

}
