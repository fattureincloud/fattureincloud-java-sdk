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

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * API tests for ReceivedDocumentsApi
 */
public class ReceivedDocumentsApiTest {

    private static ReceivedDocumentsApi mockApi(final String serializedBody, final Call remoteCall) throws IOException {
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

        return new ReceivedDocumentsApi(client);
    }

    /**
     * Create Received Document
     * <p>
     * Creates a new document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createReceivedDocumentTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":1,\"type\":\"expense\",\"entity\":{\"id\":1,\"name\":\"neim\"},\"date\":\"2021-12-25\",\"category\":\"cat6\",\"description\":\"Ricarica\",\"amount_net\":10,\"amount_vat\":0,\"amount_withholding_tax\":0,\"amount_other_withholding_tax\":0,\"amortization\":10,\"rc_center\":\"bg\",\"invoice_number\":\"in\",\"is_marked\":false,\"is_detailed\":false,\"e_invoice\":false,\"currency\":{\"id\":\"EUR\",\"exchange_rate\":\"1\"},\"tax_deductibility\":50,\"vat_deductibility\":100,\"items_list\":[{\"id\":1}],\"payments_list\":[{\"amount\":592,\"due_date\":\"2021-12-25\",\"paid_date\":\"2021-12-25\",\"payment_terms\":{\"days\":0,\"type\":\"standard\"},\"status\":\"paid\",\"payment_account\":{\"id\":21,\"type\":\"standard\"}}],\"attachment_token\":\"dGdweHdjNjlieWFjY3BseGZ0cTZmbWN0Njhhb3R0cXQvZmlsZW5hbWVfZXhhbXBsZQ\\u003d\\u003d\"}}";

        Call mockCall = Mockito.mock(Call.class);
        ReceivedDocumentsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;

        ReceivedDocument receivedDocument = new ReceivedDocument()
                .id(12)
                .type(ReceivedDocumentType.EXPENSE)
                .entity(new ReceivedDocumentEntity()
                        .id(1)
                        .name("neim"))
                .date(LocalDate.of(2021, 12, 25))
                .category("cat5")
                .description("Ricarica")
                .amountNet(new BigDecimal(10))
                .amortization(new BigDecimal(10))
                .rcCenter("bg")
                .amountVat(new BigDecimal(0))
                .amountWithholdingTax(new BigDecimal(0))
                .amountOtherWithholdingTax(new BigDecimal(0))
                .taxDeductibility(new BigDecimal(50))
                .vatDeductibility(new BigDecimal(100))
                .isMarked(false)
                .invoiceNumber("in")
                .isMarked(false)
                .isDetailed(false)
                .eInvoice(false)
                .attachmentToken("dGdweHdjNjlieWFjY3BseGZ0cTZmbWN0Njhhb3R0cXQvZmlsZW5hbWVfZXhhbXBsZQ==")
                .currency(new Currency()
                        .id("EUR")
                        .exchangeRate("1"))
                .addPaymentsListItem(
                        new ReceivedDocumentPaymentsListItem()
                                .amount(new BigDecimal(592))
                                .dueDate(LocalDate.of(2021, 12, 25))
                                .paidDate(LocalDate.of(2021, 12, 25))
                                .paymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms()
                                        .days(0)
                                        .type("standard"))
                                .status("paid")
                                .paymentAccount(new PaymentAccount()
                                        .id(21))
                )
                .addItemsListItem(new ReceivedDocumentItemsListItem()
                        .id(1))
                .isDetailed(false);

        ReceivedDocument expected = receivedDocument
                .id(1)
                .category("cat6");

        CreateReceivedDocumentRequest createReceivedDocumentRequest = new CreateReceivedDocumentRequest().data(receivedDocument);

        CreateReceivedDocumentResponse response = api.createReceivedDocument(companyId, createReceivedDocumentRequest);

        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Delete Received Document
     * <p>
     * Deletes the specified document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteReceivedDocumentTest() throws ApiException, IOException {
        Call mockCall = Mockito.mock(Call.class);
        ReceivedDocumentsApi api = mockApi(null, mockCall);

        Integer companyId = 11111;
        Integer receivedDocumentId = 16451;
        api.deleteReceivedDocument(companyId, receivedDocumentId);
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Delete Received Document Attachment
     * <p>
     * Removes the attachment of the specified document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteReceivedDocumentAttachmentTest() throws ApiException, IOException {
        Call mockCall = Mockito.mock(Call.class);
        ReceivedDocumentsApi api = mockApi(null, mockCall);

        Integer companyId = 11111;
        Integer receivedDocumentId = 16451;
        api.deleteReceivedDocumentAttachment(companyId, receivedDocumentId);
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Get Existing Received Document Totals
     * <p>
     * Returns the totals for the specified document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getExistingReceivedDocumentTotalsTest() throws ApiException, IOException {
        String result = "{\"data\":{\"amount_net\":10,\"amount_vat\":10,\"amount_gross\":10,\"amount_withholding_tax\":10,\"amount_other_withholding_tax\":10,\"amount_due\":10,\"payments_sum\":10}}";

        Call mockCall = Mockito.mock(Call.class);
        ReceivedDocumentsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        Integer receivedDocumentId = 16451;
        String fields = null;
        String fieldset = null;

        ReceivedDocumentTotals expected = new ReceivedDocumentTotals()
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .amountWithholdingTax(BigDecimal.valueOf(10))
                .amountOtherWithholdingTax(BigDecimal.valueOf(10))
                .amountDue((BigDecimal.valueOf(10)))
                .paymentsSum((BigDecimal.valueOf(10)));

        GetExistingReceivedDocumentTotalsRequest getExistingReceivedDocumentTotalsRequest = new GetExistingReceivedDocumentTotalsRequest();
        GetExistingReceivedDocumentTotalsResponse response = api.getExistingReceivedDocumentTotals(companyId, receivedDocumentId, getExistingReceivedDocumentTotalsRequest);
        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Get New Received Document Totals
     * <p>
     * Returns the totals for a new document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNewReceivedDocumentTotalsTest() throws ApiException, IOException {
        String result = "{\"data\":{\"amount_net\":10,\"amount_vat\":10,\"amount_gross\":10,\"amount_withholding_tax\":10,\"amount_other_withholding_tax\":10,\"amount_due\":10,\"payments_sum\":10}}";

        Call mockCall = Mockito.mock(Call.class);
        ReceivedDocumentsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        String fields = null;
        String fieldset = null;

        ReceivedDocumentTotals expected = new ReceivedDocumentTotals()
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .amountWithholdingTax(BigDecimal.valueOf(10))
                .amountOtherWithholdingTax(BigDecimal.valueOf(10))
                .amountDue((BigDecimal.valueOf(10)))
                .paymentsSum((BigDecimal.valueOf(10)));

        GetNewReceivedDocumentTotalsRequest getNewReceivedDocumentTotalsRequest = new GetNewReceivedDocumentTotalsRequest().data(
                new ReceivedDocument()
                        .id(12)
                        .type(ReceivedDocumentType.EXPENSE)
                        .entity(new ReceivedDocumentEntity()
                                .id(1)
                                .name("neim"))
                        .date(LocalDate.of(2021, 12, 25))
                        .category("cat5")
                        .description("Ricarica")
                        .amountNet(new BigDecimal(10))
                        .amortization(new BigDecimal(10))
                        .rcCenter("bg")
                        .amountVat(new BigDecimal(0))
                        .amountWithholdingTax(new BigDecimal(0))
                        .amountOtherWithholdingTax(new BigDecimal(0))
                        .taxDeductibility(new BigDecimal(50))
                        .vatDeductibility(new BigDecimal(100))
                        .isMarked(false)
                        .invoiceNumber("in")
                        .isMarked(false)
                        .isDetailed(false)
                        .eInvoice(false)
                        .attachmentToken("dGdweHdjNjlieWFjY3BseGZ0cTZmbWN0Njhhb3R0cXQvZmlsZW5hbWVfZXhhbXBsZQ==")
                        .currency(new Currency()
                                .id("EUR")
                                .exchangeRate("1"))
                        .addPaymentsListItem(
                                new ReceivedDocumentPaymentsListItem()
                                        .amount(new BigDecimal(592))
                                        .dueDate(LocalDate.of(2021, 12, 25))
                                        .paidDate(LocalDate.of(2021, 12, 25))
                                        .paymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms()
                                                .days(0)
                                                .type("standard"))
                                        .status("paid")
                                        .paymentAccount(new PaymentAccount()
                                                .id(21))
                        )
                        .addItemsListItem(new ReceivedDocumentItemsListItem()
                                .id(1))
                        .isDetailed(false)

        );
        GetNewReceivedDocumentTotalsResponse response = api.getNewReceivedDocumentTotals(companyId, getNewReceivedDocumentTotalsRequest);
        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Get Received Document
     * <p>
     * Gets the specified document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReceivedDocumentTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":1,\"type\":\"expense\",\"entity\":{\"id\":1,\"name\":\"neim\"},\"date\":\"2021-12-25\",\"category\":\"cat6\",\"description\":\"Ricarica\",\"amount_net\":10,\"amount_vat\":0,\"amount_withholding_tax\":0,\"amount_other_withholding_tax\":0,\"amortization\":10,\"rc_center\":\"bg\",\"invoice_number\":\"in\",\"is_marked\":false,\"is_detailed\":false,\"e_invoice\":false,\"currency\":{\"id\":\"EUR\",\"exchange_rate\":\"1\"},\"tax_deductibility\":50,\"vat_deductibility\":100,\"items_list\":[{\"id\":1}],\"payments_list\":[{\"amount\":592,\"due_date\":\"2021-12-25\",\"paid_date\":\"2021-12-25\",\"payment_terms\":{\"days\":0,\"type\":\"standard\"},\"status\":\"paid\",\"payment_account\":{\"id\":21,\"type\":\"standard\"}}],\"attachment_token\":\"dGdweHdjNjlieWFjY3BseGZ0cTZmbWN0Njhhb3R0cXQvZmlsZW5hbWVfZXhhbXBsZQ\\u003d\\u003d\"}}";

        Call mockCall = Mockito.mock(Call.class);
        ReceivedDocumentsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        Integer receivedDocumentId = 16451;
        String fields = null;
        String fieldset = null;

        ReceivedDocument receivedDocument = new ReceivedDocument()
                .id(12)
                .type(ReceivedDocumentType.EXPENSE)
                .entity(new ReceivedDocumentEntity()
                        .id(1)
                        .name("neim"))
                .date(LocalDate.of(2021, 12, 25))
                .category("cat5")
                .description("Ricarica")
                .amountNet(new BigDecimal(10))
                .amortization(new BigDecimal(10))
                .rcCenter("bg")
                .amountVat(new BigDecimal(0))
                .amountWithholdingTax(new BigDecimal(0))
                .amountOtherWithholdingTax(new BigDecimal(0))
                .taxDeductibility(new BigDecimal(50))
                .vatDeductibility(new BigDecimal(100))
                .isMarked(false)
                .invoiceNumber("in")
                .isMarked(false)
                .isDetailed(false)
                .eInvoice(false)
                .attachmentToken("dGdweHdjNjlieWFjY3BseGZ0cTZmbWN0Njhhb3R0cXQvZmlsZW5hbWVfZXhhbXBsZQ==")
                .currency(new Currency()
                        .id("EUR")
                        .exchangeRate("1"))
                .addPaymentsListItem(
                        new ReceivedDocumentPaymentsListItem()
                                .amount(new BigDecimal(592))
                                .dueDate(LocalDate.of(2021, 12, 25))
                                .paidDate(LocalDate.of(2021, 12, 25))
                                .paymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms()
                                        .days(0)
                                        .type("standard"))
                                .status("paid")
                                .paymentAccount(new PaymentAccount()
                                        .id(21))
                )
                .addItemsListItem(new ReceivedDocumentItemsListItem()
                        .id(1))
                .isDetailed(false);

        ReceivedDocument expected = receivedDocument
                .id(1)
                .category("cat6");

        GetReceivedDocumentResponse response = api.getReceivedDocument(companyId, receivedDocumentId, fields, fieldset);
        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Get Received Document Pre-Create Info
     * <p>
     * Retrieves the information useful while creating a new document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReceivedDocumentPreCreateInfoTest() throws ApiException, IOException {
        String result = "{\"data\":{\"default_values\":{\"detailed\":false},\"items_default_values\":{\"vat\":10},\"countries_list\":[\"Italia\"],\"currencies_list\":[{\"id\":\"EUR\"}],\"categories_list\":[\"cat6\"],\"payment_accounts_list\":[{\"id\":1,\"type\":\"standard\"}],\"vat_types_list\":[{\"id\":1,\"editable\":true}]}}";

        Call mockCall = Mockito.mock(Call.class);
        ReceivedDocumentsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        String fields = null;
        String fieldset = null;

        ReceivedDocumentInfo receivedDocumentInfo = new ReceivedDocumentInfo()
                .defaultValues(new ReceivedDocumentInfoDefaultValues().detailed(false))
                .itemsDefaultValues(new ReceivedDocumentInfoItemsDefaultValues().vat(BigDecimal.valueOf(10)))
                .addCountriesListItem("Italia")
                .addCurrenciesListItem(new Currency().id("EUR"))
                .addCategoriesListItem("cat6")
                .addPaymentAccountsListItem(new PaymentAccount().id(1))
                .addVatTypesListItem(new VatType().id(1));

        GetReceivedDocumentPreCreateInfoResponse response = api.getReceivedDocumentPreCreateInfo(companyId, "invoice");
        assertEquals(receivedDocumentInfo, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * List Received Documents
     * <p>
     * Lists the received documents.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listReceivedDocumentsTest() throws ApiException, IOException {
        String result = "{\"data\":[{\"id\":1,\"type\":\"expense\",\"entity\":{\"id\":1,\"name\":\"neim\"},\"date\":\"2021-12-25\",\"category\":\"cat6\",\"description\":\"Ricarica\",\"amount_net\":10,\"amount_vat\":0,\"amount_withholding_tax\":0,\"amount_other_withholding_tax\":0,\"amortization\":10,\"rc_center\":\"bg\",\"invoice_number\":\"in\",\"is_marked\":false,\"is_detailed\":false,\"e_invoice\":false,\"currency\":{\"id\":\"EUR\",\"exchange_rate\":\"1\"},\"tax_deductibility\":50,\"vat_deductibility\":100,\"items_list\":[{\"id\":1}],\"payments_list\":[{\"amount\":592,\"due_date\":\"2021-12-25\",\"paid_date\":\"2021-12-25\",\"payment_terms\":{\"days\":0,\"type\":\"standard\"},\"status\":\"paid\",\"payment_account\":{\"id\":21,\"type\":\"standard\"}}],\"attachment_token\":\"dGdweHdjNjlieWFjY3BseGZ0cTZmbWN0Njhhb3R0cXQvZmlsZW5hbWVfZXhhbXBsZQ\\u003d\\u003d\"},{\"id\":1,\"type\":\"expense\",\"entity\":{\"id\":1,\"name\":\"neim\"},\"date\":\"2021-12-25\",\"category\":\"cat6\",\"description\":\"Ricarica\",\"amount_net\":10,\"amount_vat\":0,\"amount_withholding_tax\":0,\"amount_other_withholding_tax\":0,\"amortization\":10,\"rc_center\":\"bg\",\"invoice_number\":\"in\",\"is_marked\":false,\"is_detailed\":false,\"e_invoice\":false,\"currency\":{\"id\":\"EUR\",\"exchange_rate\":\"1\"},\"tax_deductibility\":50,\"vat_deductibility\":100,\"items_list\":[{\"id\":1}],\"payments_list\":[{\"amount\":592,\"due_date\":\"2021-12-25\",\"paid_date\":\"2021-12-25\",\"payment_terms\":{\"days\":0,\"type\":\"standard\"},\"status\":\"paid\",\"payment_account\":{\"id\":21,\"type\":\"standard\"}}],\"attachment_token\":\"dGdweHdjNjlieWFjY3BseGZ0cTZmbWN0Njhhb3R0cXQvZmlsZW5hbWVfZXhhbXBsZQ\\u003d\\u003d\"}]}";

        Call mockCall = Mockito.mock(Call.class);
        ReceivedDocumentsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;

        ReceivedDocument receivedDocument1 = new ReceivedDocument()
                .id(1)
                .type(ReceivedDocumentType.EXPENSE)
                .entity(new ReceivedDocumentEntity()
                        .id(1)
                        .name("neim"))
                .date(LocalDate.of(2021, 12, 25))
                .category("cat6")
                .description("Ricarica")
                .amountNet(new BigDecimal(10))
                .amortization(new BigDecimal(10))
                .rcCenter("bg")
                .amountVat(new BigDecimal(0))
                .amountWithholdingTax(new BigDecimal(0))
                .amountOtherWithholdingTax(new BigDecimal(0))
                .taxDeductibility(new BigDecimal(50))
                .vatDeductibility(new BigDecimal(100))
                .isMarked(false)
                .invoiceNumber("in")
                .isMarked(false)
                .isDetailed(false)
                .eInvoice(false)
                .attachmentToken("dGdweHdjNjlieWFjY3BseGZ0cTZmbWN0Njhhb3R0cXQvZmlsZW5hbWVfZXhhbXBsZQ==")
                .currency(new Currency()
                        .id("EUR")
                        .exchangeRate("1"))
                .addPaymentsListItem(
                        new ReceivedDocumentPaymentsListItem()
                                .amount(new BigDecimal(592))
                                .dueDate(LocalDate.of(2021, 12, 25))
                                .paidDate(LocalDate.of(2021, 12, 25))
                                .paymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms()
                                        .days(0)
                                        .type("standard"))
                                .status("paid")
                                .paymentAccount(new PaymentAccount()
                                        .id(21))
                )
                .addItemsListItem(new ReceivedDocumentItemsListItem()
                        .id(1))
                .isDetailed(false);

        ReceivedDocument receivedDocument2 = new ReceivedDocument()
                .id(1)
                .type(ReceivedDocumentType.EXPENSE)
                .entity(new ReceivedDocumentEntity()
                        .id(1)
                        .name("neim"))
                .date(LocalDate.of(2021, 12, 25))
                .category("cat6")
                .description("Ricarica")
                .amountNet(new BigDecimal(10))
                .amortization(new BigDecimal(10))
                .rcCenter("bg")
                .amountVat(new BigDecimal(0))
                .amountWithholdingTax(new BigDecimal(0))
                .amountOtherWithholdingTax(new BigDecimal(0))
                .taxDeductibility(new BigDecimal(50))
                .vatDeductibility(new BigDecimal(100))
                .isMarked(false)
                .invoiceNumber("in")
                .isMarked(false)
                .isDetailed(false)
                .eInvoice(false)
                .attachmentToken("dGdweHdjNjlieWFjY3BseGZ0cTZmbWN0Njhhb3R0cXQvZmlsZW5hbWVfZXhhbXBsZQ==")
                .currency(new Currency()
                        .id("EUR")
                        .exchangeRate("1"))
                .addPaymentsListItem(
                        new ReceivedDocumentPaymentsListItem()
                                .amount(new BigDecimal(592))
                                .dueDate(LocalDate.of(2021, 12, 25))
                                .paidDate(LocalDate.of(2021, 12, 25))
                                .paymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms()
                                        .days(0)
                                        .type("standard"))
                                .status("paid")
                                .paymentAccount(new PaymentAccount()
                                        .id(21))
                )
                .addItemsListItem(new ReceivedDocumentItemsListItem()
                        .id(1))
                .isDetailed(false);

        ListReceivedDocumentsResponse expected = new ListReceivedDocumentsResponse()
                .currentPage(null)
                .firstPageUrl(null)
                .from(null)
                .lastPage(null)
                .lastPageUrl(null)
                .nextPageUrl(null)
                .path(null)
                .perPage(null)
                .prevPageUrl(null)
                .to(null)
                .total(null)
                .addDataItem(receivedDocument1)
                .addDataItem(receivedDocument2);

        ListReceivedDocumentsResponse response = api.listReceivedDocuments(companyId, "invoice", null, null, null, null, null);

        assertEquals(expected.getData(), response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Modify Received Document
     * <p>
     * Modifies the specified document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyReceivedDocumentTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":1,\"type\":\"expense\",\"entity\":{\"id\":1,\"name\":\"neim\"},\"date\":\"2021-12-25\",\"category\":\"cat6\",\"description\":\"Ricarica\",\"amount_net\":10,\"amount_vat\":0,\"amount_withholding_tax\":0,\"amount_other_withholding_tax\":0,\"amortization\":10,\"rc_center\":\"bg\",\"invoice_number\":\"in\",\"is_marked\":false,\"is_detailed\":false,\"e_invoice\":false,\"currency\":{\"id\":\"EUR\",\"exchange_rate\":\"1\"},\"tax_deductibility\":50,\"vat_deductibility\":100,\"items_list\":[{\"id\":1}],\"payments_list\":[{\"amount\":592,\"due_date\":\"2021-12-25\",\"paid_date\":\"2021-12-25\",\"payment_terms\":{\"days\":0,\"type\":\"standard\"},\"status\":\"paid\",\"payment_account\":{\"id\":21,\"type\":\"standard\"}}],\"attachment_token\":\"dGdweHdjNjlieWFjY3BseGZ0cTZmbWN0Njhhb3R0cXQvZmlsZW5hbWVfZXhhbXBsZQ\\u003d\\u003d\"}}";

        Call mockCall = Mockito.mock(Call.class);
        ReceivedDocumentsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        Integer receivedDocumentId = 1234567;
        ReceivedDocument receivedDocument = new ReceivedDocument()
                .id(12)
                .type(ReceivedDocumentType.EXPENSE)
                .entity(new ReceivedDocumentEntity()
                        .id(1)
                        .name("neim"))
                .date(LocalDate.of(2021, 12, 25))
                .category("cat5")
                .description("Ricarica")
                .amountNet(new BigDecimal(10))
                .amortization(new BigDecimal(10))
                .rcCenter("bg")
                .amountVat(new BigDecimal(0))
                .amountWithholdingTax(new BigDecimal(0))
                .amountOtherWithholdingTax(new BigDecimal(0))
                .taxDeductibility(new BigDecimal(50))
                .vatDeductibility(new BigDecimal(100))
                .isMarked(false)
                .invoiceNumber("in")
                .isMarked(false)
                .isDetailed(false)
                .eInvoice(false)
                .attachmentToken("dGdweHdjNjlieWFjY3BseGZ0cTZmbWN0Njhhb3R0cXQvZmlsZW5hbWVfZXhhbXBsZQ==")
                .currency(new Currency()
                        .id("EUR")
                        .exchangeRate("1"))
                .addPaymentsListItem(
                        new ReceivedDocumentPaymentsListItem()
                                .amount(new BigDecimal(592))
                                .dueDate(LocalDate.of(2021, 12, 25))
                                .paidDate(LocalDate.of(2021, 12, 25))
                                .paymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms()
                                        .days(0)
                                        .type("standard"))
                                .status("paid")
                                .paymentAccount(new PaymentAccount()
                                        .id(21))
                )
                .addItemsListItem(new ReceivedDocumentItemsListItem()
                        .id(1))
                .isDetailed(false);

        ReceivedDocument expected = receivedDocument
                .id(1)
                .category("cat6");

        ModifyReceivedDocumentRequest modifyReceivedDocumentRequest = new ModifyReceivedDocumentRequest().data(expected);

        ModifyReceivedDocumentResponse response = api.modifyReceivedDocument(companyId, receivedDocumentId, modifyReceivedDocumentRequest);

        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Upload Received Document Attachment
     * <p>
     * Uploads an attachment destined to a received document. The actual association between the document and the attachment must be implemented separately, using the returned token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadReceivedDocumentAttachmentTest() throws ApiException, IOException {
        String result = "{\"data\":{\"attachment_token\":\"YmMyNWYxYzIwMTU3N212ABCDZjZiMzg5OWY0ODNkZDQveXl5LmRvYw\"}}";

        Call mockCall = Mockito.mock(Call.class);
        ReceivedDocumentsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        AttachmentData expected = new AttachmentData()
                .attachmentToken("YmMyNWYxYzIwMTU3N212ABCDZjZiMzg5OWY0ODNkZDQveXl5LmRvYw");

        UploadReceivedDocumentAttachmentResponse response = api.uploadReceivedDocumentAttachment(companyId, "filename", null);

        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

}
