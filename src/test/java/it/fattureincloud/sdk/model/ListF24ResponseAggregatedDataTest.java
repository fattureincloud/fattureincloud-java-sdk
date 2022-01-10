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

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for ListF24ResponseAggregatedData
 */
public class ListF24ResponseAggregatedDataTest {
    private ListF24ResponseAggregatedData model;

    @BeforeEach
    public void init() {
        model = new ListF24ResponseAggregatedData()
                .aggregatedData(
                    new ListF24ResponseAggregatedDataAggregatedData()
                            .amount(new BigDecimal(10))
                );
    }

    /**
     * Model tests for ListF24ResponseAggregatedData
     */
    @Test
    public void testListF24ResponseAggregatedData() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"aggregated_data\":{\"amount\":10}}";
        assertEquals(str, json);
        ListF24ResponseAggregatedData generated = gson.fromJson(str, ListF24ResponseAggregatedData.class);
        assertEquals(model, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'aggregatedData'
     */
    @Test
    public void aggregatedDataTest() {
        assertEquals(new BigDecimal(10), model.getAggregatedData().getAmount());
        model.getAggregatedData().setAmount(new BigDecimal(130));
        assertEquals(new BigDecimal(130), model.getAggregatedData().getAmount());

        ListF24ResponseAggregatedData expected = new ListF24ResponseAggregatedData()
                .aggregatedData(
                        new ListF24ResponseAggregatedDataAggregatedData()
                                .amount(new BigDecimal(130))
                );
        assertEquals(expected, model);
    }

}
