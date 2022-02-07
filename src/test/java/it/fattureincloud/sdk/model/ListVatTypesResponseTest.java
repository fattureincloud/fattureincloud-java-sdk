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
 * Model tests for ListVatTypesResponse
 */
public class ListVatTypesResponseTest {
    private ListVatTypesResponse model;

    @BeforeEach
    public void init() {
        model = new ListVatTypesResponse()
                .addDataItem(
                        new VatType()
                                .id(12345)
                                .value(BigDecimal.valueOf(22))
                                .description("Non imponibile art. 123")
                                .notes("IVA non imponibile")
                                .eInvoice(true)
                                .eiType("2")
                                .eiDescription("desc")
                                .isDisabled(false)
                );
    }

    /**
     * Model tests for ListVatTypesResponse
     */
    @Test
    public void testListVatTypesResponse() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"data\":[{\"id\":12345,\"value\":22,\"description\":\"Non imponibile art. 123\",\"notes\":\"IVA non imponibile\",\"e_invoice\":true,\"ei_type\":\"2\",\"ei_description\":\"desc\",\"editable\":true,\"is_disabled\":false}]}";
        assertEquals(str, json);
        ListVatTypesResponse generated = gson.fromJson(str, ListVatTypesResponse.class);
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
        assertEquals(12345, model.getData().get(0).getId());
        model.setData(Arrays.asList(new VatType().id(1)));
        assertEquals(1, model.getData().get(0).getId());

        model.data(Arrays.asList(new VatType().id(2)));
        ListVatTypesResponse actual = new ListVatTypesResponse();
        actual.setData(Arrays.asList(new VatType().id(2)));
        assertEquals(model, actual);
    }

}
