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
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for CreateCashbookEntryResponse
 */
public class CreateCashbookEntryResponseTest {
    private CreateCashbookEntryResponse model;

    @BeforeEach
    public void init() {
        model = new CreateCashbookEntryResponse()
                .data(
                        new CashbookEntry()
                                .id("1")
                                .date(LocalDate.parse("2021-12-19"))
                                .description("Fattura n. 201/2021")
                                .kind(CashbookEntryKind.ISSUED_DOCUMENT)
                                .type(CashbookEntryType.IN)
                                .entityName("Rossi S.r.l.")
                                .document(new CashbookEntryDocument()
                                        .id(12345)
                                        .type("issued_document")
                                        .path("/doc1.pdf")
                                )
                                .amountIn(BigDecimal.valueOf(10))
                                .paymentAccountIn(new PaymentAccount()
                                        .id(21)
                                        .name("Indesa - Carta conto")
                                        .type(PaymentAccountType.STANDARD)
                                        .iban("IT84Y0300203280294126225888")
                                        .sia("sai")
                                        .cuc("cuc")
                                        .virtual(false)
                                )
                                .amountOut(BigDecimal.valueOf(10))
                                .paymentAccountOut(new PaymentAccount()
                                        .id(21)
                                        .name("Indesa - Carta conto")
                                        .type(PaymentAccountType.STANDARD)
                                        .iban("IT84Y0300203280294126225888")
                                        .sia("sai")
                                        .cuc("cuc")
                                        .virtual(false)
                                )
                );
    }

    /**
     * Model tests for CreateCashbookEntryResponse
     */
    @Test
    public void testCreateCashbookEntryResponse() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"data\":{\"id\":\"1\",\"date\":\"2021-12-19\",\"description\":\"Fattura n. 201/2021\",\"kind\":\"issued_document\",\"type\":\"in\",\"entity_name\":\"Rossi S.r.l.\",\"document\":{\"id\":12345,\"type\":\"issued_document\",\"path\":\"/doc1.pdf\"},\"amount_in\":10,\"payment_account_in\":{\"id\":21,\"name\":\"Indesa - Carta conto\",\"type\":\"standard\",\"iban\":\"IT84Y0300203280294126225888\",\"sia\":\"sai\",\"cuc\":\"cuc\",\"virtual\":false},\"amount_out\":10,\"payment_account_out\":{\"id\":21,\"name\":\"Indesa - Carta conto\",\"type\":\"standard\",\"iban\":\"IT84Y0300203280294126225888\",\"sia\":\"sai\",\"cuc\":\"cuc\",\"virtual\":false}}}";
        assertEquals(str, json);
        CreateCashbookEntryResponse generated = gson.fromJson(str, CreateCashbookEntryResponse.class);
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
        assertEquals("1", model.getData().getId());
        model.setData(new CashbookEntry().id("2"));
        assertEquals("2", model.getData().getId());

        model.data(new CashbookEntry().id("1"));
        CreateCashbookEntryResponse actual = new CreateCashbookEntryResponse();
        actual.setData(new CashbookEntry().id("1"));
        assertEquals(model, actual);
    }

}
