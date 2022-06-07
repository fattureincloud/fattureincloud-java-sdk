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
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Model tests for EInvoiceRejectionReason
 */
public class EInvoiceRejectionReasonTest {
    private EInvoiceRejectionReason model;
    private final ZoneId zone = ZoneId.of("Europe/Madrid");

    @BeforeEach
    public void init() {
        model = new EInvoiceRejectionReason()
                .reason("invalid date")
                .eiStatus("rejected")
                .solution("set a valid date")
                .code("c01")
                .date(LocalDate.of(2022, 01, 10).atStartOfDay(zone).toOffsetDateTime());
    }

    /**
     * Model tests for EInvoiceRejectionReason
     */
    @Test
    public void testEInvoiceRejectionReason() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"reason\":\"invalid date\",\"ei_status\":\"rejected\",\"solution\":\"set a valid date\",\"code\":\"c01\",\"date\":\"2022-01-10\"}";
        assertEquals(str, json);
        EInvoiceRejectionReason generated = gson.fromJson(str, EInvoiceRejectionReason.class);
        assertEquals(model, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'reason'
     */
    @Test
    public void reasonTest() {
        assertEquals("invalid date", model.getReason());
        model.setReason("invalid qualcosa");
        assertEquals("invalid qualcosa", model.getReason());

        EInvoiceRejectionReason c = model.reason("invalid date");
        EInvoiceRejectionReason expected = new EInvoiceRejectionReason()
                .reason("invalid date")
                .eiStatus("rejected")
                .solution("set a valid date")
                .code("c01")
                .date(LocalDate.of(2022, 01, 10).atStartOfDay(zone).toOffsetDateTime());
        assertEquals(expected, c);
    }

    /**
     * Test the property 'eiStatus'
     */
    @Test
    public void eiStatusTest() {
        assertEquals("rejected", model.getEiStatus());
        model.setEiStatus("error");
        assertEquals("error", model.getEiStatus());

        EInvoiceRejectionReason c = model.eiStatus("rejected");
        EInvoiceRejectionReason expected = new EInvoiceRejectionReason()
                .reason("invalid date")
                .eiStatus("rejected")
                .solution("set a valid date")
                .code("c01")
                .date(LocalDate.of(2022, 01, 10).atStartOfDay(zone).toOffsetDateTime());
        assertEquals(expected, c);
    }

    /**
     * Test the property 'solution'
     */
    @Test
    public void solutionTest() {
        assertEquals("set a valid date", model.getSolution());
        model.setSolution("set a valid qualcosa");
        assertEquals("set a valid qualcosa", model.getSolution());

        EInvoiceRejectionReason c = model.solution("set a valid date");
        EInvoiceRejectionReason expected = new EInvoiceRejectionReason()
                .reason("invalid date")
                .eiStatus("rejected")
                .solution("set a valid date")
                .code("c01")
                .date(LocalDate.of(2022, 01, 10).atStartOfDay(zone).toOffsetDateTime());
        assertEquals(expected, c);
    }

    /**
     * Test the property 'code'
     */
    @Test
    public void codeTest() {
        assertEquals("c01", model.getCode());
        model.setCode("c02");
        assertEquals("c02", model.getCode());

        EInvoiceRejectionReason c = model.code("c01");
        EInvoiceRejectionReason expected = new EInvoiceRejectionReason()
                .reason("invalid date")
                .eiStatus("rejected")
                .solution("set a valid date")
                .code("c01")
                .date(LocalDate.of(2022, 01, 10).atStartOfDay(zone).toOffsetDateTime());
        assertEquals(expected, c);
    }

    /**
     * Test the property 'date'
     */
    @Test
    public void dateTest() {
        assertEquals(LocalDate.of(2022, 01, 10).atStartOfDay(zone).toOffsetDateTime(), model.getDate());
        model.setDate(LocalDate.of(2022, 06, 07).atStartOfDay(zone).toOffsetDateTime());
        assertEquals(LocalDate.of(2022, 06, 07).atStartOfDay(zone).toOffsetDateTime(), model.getDate());

        EInvoiceRejectionReason c = model.date(LocalDate.of(2022, 01, 10).atStartOfDay(zone).toOffsetDateTime());
        EInvoiceRejectionReason expected = new EInvoiceRejectionReason()
                .reason("invalid date")
                .eiStatus("rejected")
                .solution("set a valid date")
                .code("c01")
                .date(LocalDate.of(2022, 01, 10).atStartOfDay(zone).toOffsetDateTime());
        assertEquals(expected, c);
    }

}
