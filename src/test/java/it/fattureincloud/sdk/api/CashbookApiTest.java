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


package it.fattureincloud.sdk.api;

import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.model.*;
import okhttp3.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * API tests for CashbookApi
 */
public class CashbookApiTest {

    private static CashbookApi mockApi(final String serializedBody, final Call remoteCall) throws IOException {
        final OkHttpClient okHttpClient = Mockito.mock(OkHttpClient.class);

        Response.Builder builder = new Response.Builder()
                .request(new Request.Builder().url("https://api-v2.fattureincloud.it").build())
                .protocol(Protocol.HTTP_1_1)
                .code(200)
                .message("");
        if (serializedBody != null) {
            builder = builder.body(
                    ResponseBody.create(
                            serializedBody,
                            MediaType.parse("application/json")
                    ));
        }

        final Response response = builder.build();

        Mockito.when(remoteCall.execute()).thenReturn(response);
        Mockito.when(okHttpClient.newCall(Mockito.any())).thenReturn(remoteCall);

        ApiClient client = new ApiClient(okHttpClient);

        return new CashbookApi(client);
    }


    /**
     * Create Cashbook Entry
     * <p>
     * Creates a new cashbook entry.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCashbookEntryTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":\"1\",\"date\":\"2021-12-19\",\"description\":\"Fattura n. 201/2021\",\"kind\":\"issued_document\",\"type\":\"in\",\"entity_name\":\"Rossi S.r.l.\",\"document\":{\"id\":12345,\"type\":\"issued_document\",\"path\":\"/doc1.pdf\"},\"amount_in\":10,\"payment_account_in\":{\"id\":21,\"name\":\"Indesa - Carta conto\",\"type\":\"standard\",\"iban\":\"IT84Y0300203280294126225888\",\"sia\":\"sai\",\"cuc\":\"cuc\",\"virtual\":false},\"amount_out\":10,\"payment_account_out\":{\"id\":21,\"name\":\"Indesa - Carta conto\",\"type\":\"standard\",\"iban\":\"IT84Y0300203280294126225888\",\"sia\":\"sai\",\"cuc\":\"cuc\",\"virtual\":false}}}";

        Call mockCall = Mockito.mock(Call.class);
        CashbookApi api = mockApi(result, mockCall);

        Integer companyId = 11111;

        CashbookEntry cashbookEntry = new CashbookEntry()
                .id("1a")
                .date(LocalDate.parse("2021-12-19"))
                .description("desc")
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


        CreateCashbookEntryRequest createCashbookEntryRequest = new CreateCashbookEntryRequest().data(cashbookEntry);

        CreateCashbookEntryResponse response = api.createCashbookEntry(companyId, createCashbookEntryRequest);

        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Delete Cashbook Entry
     * <p>
     * Deletes the specified cashbook entry.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCashbookEntryTest() throws ApiException, IOException {
        Call mockCall = Mockito.mock(Call.class);
        CashbookApi api = mockApi(null, mockCall);

        Integer companyId = 11111;
        Integer cashbookId = 16451;
        api.deleteCashbookEntry(companyId, cashbookId);
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Get Cashbook Entry
     * <p>
     * Gets the specified cashbook entry.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCashbookEntryTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":\"1\",\"date\":\"2021-12-19\",\"description\":\"Fattura n. 201/2021\",\"kind\":\"issued_document\",\"type\":\"in\",\"entity_name\":\"Rossi S.r.l.\",\"document\":{\"id\":12345,\"type\":\"issued_document\",\"path\":\"/doc1.pdf\"},\"amount_in\":10,\"payment_account_in\":{\"id\":21,\"name\":\"Indesa - Carta conto\",\"type\":\"standard\",\"iban\":\"IT84Y0300203280294126225888\",\"sia\":\"sai\",\"cuc\":\"cuc\",\"virtual\":false},\"amount_out\":10,\"payment_account_out\":{\"id\":21,\"name\":\"Indesa - Carta conto\",\"type\":\"standard\",\"iban\":\"IT84Y0300203280294126225888\",\"sia\":\"sai\",\"cuc\":\"cuc\",\"virtual\":false}}}";

        Call mockCall = Mockito.mock(Call.class);
        CashbookApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        Integer cashbookId = 16451;
        String fields = null;
        String fieldset = null;

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

        GetCashbookEntryResponse response = api.getCashbookEntry(companyId, cashbookId, fields, fieldset);
        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * List Cashbook Entries
     * <p>
     * Lists the cashbook entries.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCashbookEntriesTest() throws ApiException, IOException {
        String result = "{\"data\":[{\"id\":\"1\",\"date\":\"2021-12-19\",\"description\":\"Fattura n. 201/2021\",\"kind\":\"issued_document\",\"type\":\"in\",\"entity_name\":\"Rossi S.r.l.\",\"document\":{\"id\":12345,\"type\":\"issued_document\",\"path\":\"/doc1.pdf\"},\"amount_in\":10,\"payment_account_in\":{\"id\":21,\"name\":\"Indesa - Carta conto\",\"type\":\"standard\",\"iban\":\"IT84Y0300203280294126225888\",\"sia\":\"sai\",\"cuc\":\"cuc\",\"virtual\":false},\"amount_out\":10,\"payment_account_out\":{\"id\":21,\"name\":\"Indesa - Carta conto\",\"type\":\"standard\",\"iban\":\"IT84Y0300203280294126225888\",\"sia\":\"sai\",\"cuc\":\"cuc\",\"virtual\":false}},{\"id\":\"2\",\"date\":\"2021-12-19\",\"description\":\"Fattura n. 201/2021\",\"kind\":\"issued_document\",\"type\":\"in\",\"entity_name\":\"Rossi S.r.l.\",\"document\":{\"id\":12345,\"type\":\"issued_document\",\"path\":\"/doc1.pdf\"},\"amount_in\":10,\"payment_account_in\":{\"id\":21,\"name\":\"Indesa - Carta conto\",\"type\":\"standard\",\"iban\":\"IT84Y0300203280294126225888\",\"sia\":\"sai\",\"cuc\":\"cuc\",\"virtual\":false},\"amount_out\":10,\"payment_account_out\":{\"id\":21,\"name\":\"Indesa - Carta conto\",\"type\":\"standard\",\"iban\":\"IT84Y0300203280294126225888\",\"sia\":\"sai\",\"cuc\":\"cuc\",\"virtual\":false}}]}";

        Call mockCall = Mockito.mock(Call.class);
        CashbookApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        String dateFrom = "2021-12-21";
        String dateTo = "2021-12-31";

        CashbookEntry cashbook1 = new CashbookEntry()
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

        CashbookEntry cashbook2 = new CashbookEntry()
                .id("2")
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

        List<CashbookEntry> expected = Arrays.asList(cashbook1, cashbook2);

        ListCashbookEntriesResponse response = api.listCashbookEntries(companyId, dateFrom, dateTo, null, null, null);
        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Modify Cashbook Entry
     * <p>
     * Modifies the specified cashbook entry.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyCashbookEntryTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":\"1\",\"date\":\"2021-12-19\",\"description\":\"Fattura n. 201/2021\",\"kind\":\"issued_document\",\"type\":\"in\",\"entity_name\":\"Rossi S.r.l.\",\"document\":{\"id\":12345,\"type\":\"issued_document\",\"path\":\"/doc1.pdf\"},\"amount_in\":10,\"payment_account_in\":{\"id\":21,\"name\":\"Indesa - Carta conto\",\"type\":\"standard\",\"iban\":\"IT84Y0300203280294126225888\",\"sia\":\"sai\",\"cuc\":\"cuc\",\"virtual\":false},\"amount_out\":10,\"payment_account_out\":{\"id\":21,\"name\":\"Indesa - Carta conto\",\"type\":\"standard\",\"iban\":\"IT84Y0300203280294126225888\",\"sia\":\"sai\",\"cuc\":\"cuc\",\"virtual\":false}}}";

        Call mockCall = Mockito.mock(Call.class);
        CashbookApi api = mockApi(result, mockCall);

        Integer companyId = 2;
        Integer cashbookId = 2;

        CashbookEntry cashbookEntry = new CashbookEntry()
                .id("1a")
                .date(LocalDate.parse("2021-12-19"))
                .description("desc")
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


        CashbookEntry expected = cashbookEntry
                .id("1")
                .description("Fattura n. 201/2021");


        ModifyCashbookEntryRequest modifyCashbookEntryRequest = new ModifyCashbookEntryRequest().data(cashbookEntry);

        ModifyCashbookEntryResponse response = api.modifyCashbookEntry(companyId, cashbookId, modifyCashbookEntryRequest);

        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

}
