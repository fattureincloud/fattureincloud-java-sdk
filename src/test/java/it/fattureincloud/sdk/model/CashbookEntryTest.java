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
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for CashbookEntry
 */
public class CashbookEntryTest {
    private CashbookEntry model;

    @BeforeEach
    public void init() {
        model = new CashbookEntry()
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
                .amountIn(BigDecimal.valueOf(10))
                .paymentAccountIn(new PaymentAccount()
                        .id(21)
                        .name("Indesa - Carta conto")
                        .type(PaymentAccountType.STANDARD)
                        .iban("IT84Y0300203280294126225888")
                        .sia("sai")
                        .cuc("cuc")
                        .virtual(false)
                );
    }

    /**
     * Model tests for CashbookEntry
     */
    @Test
    public void testCashbookEntry() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"id\":\"1\",\"date\":\"2021-12-19\",\"description\":\"Fattura n. 201/2021\",\"kind\":\"issued_document\",\"type\":\"in\",\"entity_name\":\"Rossi S.r.l.\",\"document\":{\"id\":12345,\"type\":\"issued_document\",\"path\":\"/doc1.pdf\"},\"amount_in\":10,\"payment_account_in\":{\"id\":21,\"name\":\"Indesa - Carta conto\",\"type\":\"standard\",\"iban\":\"IT84Y0300203280294126225888\",\"sia\":\"sai\",\"cuc\":\"cuc\",\"virtual\":false},\"amount_out\":10,\"payment_account_out\":{\"id\":21,\"name\":\"Indesa - Carta conto\",\"type\":\"standard\",\"iban\":\"IT84Y0300203280294126225888\",\"sia\":\"sai\",\"cuc\":\"cuc\",\"virtual\":false}}";
        assertEquals(str, json);
        CashbookEntry generated = gson.fromJson(str, CashbookEntry.class);
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
        PaymentAccount p1 = new PaymentAccount()
                .id(21)
                .name("Indesa - Carta conto")
                .type(PaymentAccountType.STANDARD)
                .iban("IT84Y0300203280294126225888")
                .sia("sai")
                .cuc("cuc")
                .virtual(false);

        assertEquals("1", model.getId());
        model.setId("2");
        assertEquals("2", model.getId());

        CashbookEntry c = model.id("69");
        CashbookEntry expected = new CashbookEntry()
                .id("69")
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
                .amountOut(BigDecimal.valueOf(10))
                .paymentAccountOut(p1)
                .amountIn(BigDecimal.valueOf(10))
                .paymentAccountIn(p1);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'date'
     */
    @Test
    public void dateTest() {
        PaymentAccount p1 = new PaymentAccount()
                .id(21)
                .name("Indesa - Carta conto")
                .type(PaymentAccountType.STANDARD)
                .iban("IT84Y0300203280294126225888")
                .sia("sai")
                .cuc("cuc")
                .virtual(false);

        assertEquals(LocalDate.parse("2021-12-19"), model.getDate());
        model.setDate(LocalDate.parse("2021-12-01"));
        assertEquals(LocalDate.parse("2021-12-01"), model.getDate());

        CashbookEntry c = model.date(LocalDate.parse("2002-12-19"));
        CashbookEntry expected = new CashbookEntry()
                .id("1")
                .date(LocalDate.parse("2002-12-19"))
                .description("Fattura n. 201/2021")
                .kind(CashbookEntryKind.ISSUED_DOCUMENT)
                .type(CashbookEntryType.IN)
                .entityName("Rossi S.r.l.")
                .document(new CashbookEntryDocument()
                        .id(12345)
                        .type("issued_document")
                        .path("/doc1.pdf")
                )
                .amountOut(BigDecimal.valueOf(10))
                .paymentAccountOut(p1)
                .amountIn(BigDecimal.valueOf(10))
                .paymentAccountIn(p1);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        PaymentAccount p1 = new PaymentAccount()
                .id(21)
                .name("Indesa - Carta conto")
                .type(PaymentAccountType.STANDARD)
                .iban("IT84Y0300203280294126225888")
                .sia("sai")
                .cuc("cuc")
                .virtual(false);

        assertEquals("Fattura n. 201/2021", model.getDescription());
        model.setDescription("Fattura n. 1/2021");
        assertEquals("Fattura n. 1/2021", model.getDescription());

        CashbookEntry c = model.description("Fattura n. 201/2050");
        CashbookEntry expected = new CashbookEntry()
                .id("1")
                .date(LocalDate.parse("2021-12-19"))
                .description("Fattura n. 201/2050")
                .kind(CashbookEntryKind.ISSUED_DOCUMENT)
                .type(CashbookEntryType.IN)
                .entityName("Rossi S.r.l.")
                .document(new CashbookEntryDocument()
                        .id(12345)
                        .type("issued_document")
                        .path("/doc1.pdf")
                )
                .amountOut(BigDecimal.valueOf(10))
                .paymentAccountOut(p1)
                .amountIn(BigDecimal.valueOf(10))
                .paymentAccountIn(p1);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'kind'
     */
    @Test
    public void kindTest() {
        PaymentAccount p1 = new PaymentAccount()
                .id(21)
                .name("Indesa - Carta conto")
                .type(PaymentAccountType.STANDARD)
                .iban("IT84Y0300203280294126225888")
                .sia("sai")
                .cuc("cuc")
                .virtual(false);

        assertEquals(CashbookEntryKind.ISSUED_DOCUMENT, model.getKind());
        model.setKind(CashbookEntryKind.TAX);
        assertEquals(CashbookEntryKind.TAX, model.getKind());

        CashbookEntry c = model.kind(CashbookEntryKind.RECEIPT);
        CashbookEntry expected = new CashbookEntry()
                .id("1")
                .date(LocalDate.parse("2021-12-19"))
                .description("Fattura n. 201/2021")
                .kind(CashbookEntryKind.RECEIPT)
                .type(CashbookEntryType.IN)
                .entityName("Rossi S.r.l.")
                .document(new CashbookEntryDocument()
                        .id(12345)
                        .type("issued_document")
                        .path("/doc1.pdf")
                )
                .amountOut(BigDecimal.valueOf(10))
                .paymentAccountOut(p1)
                .amountIn(BigDecimal.valueOf(10))
                .paymentAccountIn(p1);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        PaymentAccount p1 = new PaymentAccount()
                .id(21)
                .name("Indesa - Carta conto")
                .type(PaymentAccountType.STANDARD)
                .iban("IT84Y0300203280294126225888")
                .sia("sai")
                .cuc("cuc")
                .virtual(false);

        assertEquals(CashbookEntryType.IN, model.getType());
        model.setType(CashbookEntryType.OUT);
        assertEquals(CashbookEntryType.OUT, model.getType());

        CashbookEntry c = model.type(CashbookEntryType.IN);
        CashbookEntry expected = new CashbookEntry()
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
                .amountOut(BigDecimal.valueOf(10))
                .paymentAccountOut(p1)
                .amountIn(BigDecimal.valueOf(10))
                .paymentAccountIn(p1);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'entityName'
     */
    @Test
    public void entityNameTest() {
        PaymentAccount p1 = new PaymentAccount()
                .id(21)
                .name("Indesa - Carta conto")
                .type(PaymentAccountType.STANDARD)
                .iban("IT84Y0300203280294126225888")
                .sia("sai")
                .cuc("cuc")
                .virtual(false);

        assertEquals("Rossi S.r.l.", model.getEntityName());
        model.setEntityName("Volley Bergamo 1991 S.r.l.");
        assertEquals("Volley Bergamo 1991 S.r.l.", model.getEntityName());

        CashbookEntry c = model.entityName("Volley Bergamo S.r.l.");
        CashbookEntry expected = new CashbookEntry()
                .id("1")
                .date(LocalDate.parse("2021-12-19"))
                .description("Fattura n. 201/2021")
                .kind(CashbookEntryKind.ISSUED_DOCUMENT)
                .type(CashbookEntryType.IN)
                .entityName("Volley Bergamo S.r.l.")
                .document(new CashbookEntryDocument()
                        .id(12345)
                        .type("issued_document")
                        .path("/doc1.pdf")
                )
                .amountOut(BigDecimal.valueOf(10))
                .paymentAccountOut(p1)
                .amountIn(BigDecimal.valueOf(10))
                .paymentAccountIn(p1);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'document'
     */
    @Test
    public void documentTest() {
        CashbookEntryDocument d1 = new CashbookEntryDocument()
                .id(12345)
                .type("issued_document")
                .path("/doc1.pdf");

        CashbookEntryDocument d2 = new CashbookEntryDocument()
                .id(12345)
                .type("issued_document")
                .path("/doc1.pdf");

        CashbookEntryDocument d3 = new CashbookEntryDocument()
                .id(12345)
                .type("issued_document")
                .path("/doc1.pdf");

        PaymentAccount p1 = new PaymentAccount()
                .id(21)
                .name("Indesa - Carta conto")
                .type(PaymentAccountType.STANDARD)
                .iban("IT84Y0300203280294126225888")
                .sia("sai")
                .cuc("cuc")
                .virtual(false);

        assertEquals(d1, model.getDocument());
        model.setDocument(d2);
        assertEquals(d2, model.getDocument());

        CashbookEntry c = model.document(d3);
        CashbookEntry expected = new CashbookEntry()
                .id("1")
                .date(LocalDate.parse("2021-12-19"))
                .description("Fattura n. 201/2021")
                .kind(CashbookEntryKind.ISSUED_DOCUMENT)
                .type(CashbookEntryType.IN)
                .entityName("Rossi S.r.l.")
                .document(d3)
                .amountOut(BigDecimal.valueOf(10))
                .paymentAccountOut(p1)
                .amountIn(BigDecimal.valueOf(10))
                .paymentAccountIn(p1);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'amountOut'
     */
    @Test
    public void amountOutTest() {
        PaymentAccount p1 = new PaymentAccount()
                .id(21)
                .name("Indesa - Carta conto")
                .type(PaymentAccountType.STANDARD)
                .iban("IT84Y0300203280294126225888")
                .sia("sai")
                .cuc("cuc")
                .virtual(false);

        assertEquals(BigDecimal.valueOf(10), model.getAmountOut());
        model.setAmountOut(BigDecimal.valueOf(11));
        assertEquals(BigDecimal.valueOf(11), model.getAmountOut());

        CashbookEntry c = model.amountOut(BigDecimal.valueOf(12));
        CashbookEntry expected = new CashbookEntry()
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
                .amountOut(BigDecimal.valueOf(12))
                .paymentAccountOut(p1)
                .amountIn(BigDecimal.valueOf(10))
                .paymentAccountIn(p1);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'paymentAccountOut'
     */
    @Test
    public void paymentAccountOutTest() {
        PaymentAccount p1 = new PaymentAccount()
                .id(21)
                .name("Indesa - Carta conto")
                .type(PaymentAccountType.STANDARD)
                .iban("IT84Y0300203280294126225888")
                .sia("sai")
                .cuc("cuc")
                .virtual(false);

        PaymentAccount p2 = new PaymentAccount()
                .id(22)
                .name("UniPirl - Carta conto")
                .type(PaymentAccountType.STANDARD)
                .iban("IT84Y0300203280294126225888")
                .sia("sai")
                .cuc("cuc")
                .virtual(false);

        PaymentAccount p3 = new PaymentAccount()
                .id(23)
                .name("A Monte - Carta conto")
                .type(PaymentAccountType.STANDARD)
                .iban("IT84Y0300203280294126225888")
                .sia("sai")
                .cuc("cuc")
                .virtual(false);

        assertEquals(p1, model.getPaymentAccountOut());
        model.setPaymentAccountOut(p2);
        assertEquals(p2, model.getPaymentAccountOut());

        CashbookEntry c = model.paymentAccountOut(p3);
        CashbookEntry expected = new CashbookEntry()
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
                .amountOut(BigDecimal.valueOf(10))
                .paymentAccountOut(p3)
                .amountIn(BigDecimal.valueOf(10))
                .paymentAccountIn(p1);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'amountIn'
     */
    @Test
    public void amountInTest() {
        PaymentAccount p1 = new PaymentAccount()
                .id(21)
                .name("Indesa - Carta conto")
                .type(PaymentAccountType.STANDARD)
                .iban("IT84Y0300203280294126225888")
                .sia("sai")
                .cuc("cuc")
                .virtual(false);

        assertEquals(BigDecimal.valueOf(10), model.getAmountIn());
        model.setAmountIn(BigDecimal.valueOf(11));
        assertEquals(BigDecimal.valueOf(11), model.getAmountIn());

        CashbookEntry c = model.amountIn(BigDecimal.valueOf(12));
        CashbookEntry expected = new CashbookEntry()
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
                .amountOut(BigDecimal.valueOf(10))
                .paymentAccountOut(p1)
                .amountIn(BigDecimal.valueOf(12))
                .paymentAccountIn(p1);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'paymentAccountIn'
     */
    @Test
    public void paymentAccountInTest() {
        PaymentAccount p1 = new PaymentAccount()
                .id(21)
                .name("Indesa - Carta conto")
                .type(PaymentAccountType.STANDARD)
                .iban("IT84Y0300203280294126225888")
                .sia("sai")
                .cuc("cuc")
                .virtual(false);

        PaymentAccount p2 = new PaymentAccount()
                .id(22)
                .name("UniPirl - Carta conto")
                .type(PaymentAccountType.STANDARD)
                .iban("IT84Y0300203280294126225888")
                .sia("sai")
                .cuc("cuc")
                .virtual(false);

        PaymentAccount p3 = new PaymentAccount()
                .id(23)
                .name("A Monte - Carta conto")
                .type(PaymentAccountType.STANDARD)
                .iban("IT84Y0300203280294126225888")
                .sia("sai")
                .cuc("cuc")
                .virtual(false);

        assertEquals(p1, model.getPaymentAccountIn());
        model.setPaymentAccountIn(p2);
        assertEquals(p2, model.getPaymentAccountIn());

        CashbookEntry c = model.paymentAccountIn(p3);
        CashbookEntry expected = new CashbookEntry()
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
                .amountOut(BigDecimal.valueOf(10))
                .paymentAccountOut(p1)
                .amountIn(BigDecimal.valueOf(10))
                .paymentAccountIn(p3);
        assertEquals(expected, c);
    }

}
