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

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for GetReceivedDocumentPreCreateInfoResponse
 */
public class GetReceivedDocumentPreCreateInfoResponseTest {
    private GetReceivedDocumentPreCreateInfoResponse model;

    @BeforeEach
    public void init() {
        model = new GetReceivedDocumentPreCreateInfoResponse()
                .data(
                        new ReceivedDocumentInfo()
                                .defaultValues(new ReceivedDocumentInfoDefaultValues().detailed(false))
                                .itemsDefaultValues(new ReceivedDocumentInfoItemsDefaultValues().vat(BigDecimal.valueOf(10)))
                                .addCountriesListItem("Italia")
                                .addCurrenciesListItem(new Currency().id("EUR"))
                                .addCategoriesListItem("cat6")
                                .addPaymentAccountsListItem(new PaymentAccount().id(1))
                                .addVatTypesListItem(new VatType().id(1))
                );
    }

    /**
     * Model tests for GetReceivedDocumentPreCreateInfoResponse
     */
    @Test
    public void testGetReceivedDocumentPreCreateInfoResponse() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"data\":{\"default_values\":{\"detailed\":false},\"items_default_values\":{\"vat\":10},\"countries_list\":[\"Italia\"],\"currencies_list\":[{\"id\":\"EUR\"}],\"categories_list\":[\"cat6\"],\"payment_accounts_list\":[{\"id\":1,\"type\":\"standard\"}],\"vat_types_list\":[{\"id\":1,\"editable\":true}]}}";
        assertEquals(str, json);
        GetReceivedDocumentPreCreateInfoResponse generated = gson.fromJson(str, GetReceivedDocumentPreCreateInfoResponse.class);
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
        assertEquals(Arrays.asList("Italia"), model.getData().getCountriesList());
        model.getData().setCountriesList(Arrays.asList("Spagna", "Francia"));
        assertEquals(Arrays.asList("Spagna", "Francia"), model.getData().getCountriesList());
    }

}
