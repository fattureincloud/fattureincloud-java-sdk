/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.10
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

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for GetEInvoiceRejectionReasonResponse
 */
public class GetEInvoiceRejectionReasonResponseTest {
    private GetEInvoiceRejectionReasonResponse model;

    @BeforeEach
    public void init() {
        model = new GetEInvoiceRejectionReasonResponse()
                .data(
                        new EInvoiceRejectionReason()
                                .reason("invalid date")
                                .eiStatus("rejected")
                                .solution("set a valid date")
                                .code("c01")
                                .date(LocalDate.of(2022, 01, 10))
                );
    }

    /**
     * Model tests for GetEInvoiceRejectionReasonResponse
     */
    @Test
    public void testGetEInvoiceRejectionReasonResponse() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"data\":{\"reason\":\"invalid date\",\"ei_status\":\"rejected\",\"solution\":\"set a valid date\",\"code\":\"c01\",\"date\":\"2022-01-10\"}}";
        assertEquals(str, json);
        GetEInvoiceRejectionReasonResponse generated = gson.fromJson(str, GetEInvoiceRejectionReasonResponse.class);
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
        assertEquals("invalid date", model.getData().getReason());
        model.setData(new EInvoiceRejectionReason().reason("invalid date2"));
        assertEquals("invalid date2", model.getData().getReason());

        model.data(new EInvoiceRejectionReason().reason("invalid date"));
        GetEInvoiceRejectionReasonResponse actual = new GetEInvoiceRejectionReasonResponse();
        actual.setData(new EInvoiceRejectionReason().reason("invalid date"));
        assertEquals(model, actual);
    }

}
