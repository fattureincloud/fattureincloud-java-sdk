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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * API tests for ReceiptsApi
 */
public class ReceiptsApiTest {

    private static ReceiptsApi mockApi(final String serializedBody, final Call remoteCall) throws IOException {
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

        return new ReceiptsApi(client);
    }

    /**
     * Create Receipt
     * <p>
     * Creates a new receipt.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createReceiptTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":10,\"date\":\"2021-12-25\",\"number\":10,\"numeration\":\"num\",\"amount_net\":10,\"amount_vat\":10,\"amount_gross\":10,\"use_gross_prices\":true,\"type\":\"till_receipt\",\"description\":\"descr\",\"rc_center\":\"bg\",\"created_at\":\"2021-10-10\",\"updated_at\":\"2021-10-10\",\"payment_account\":{\"id\":1,\"type\":\"standard\"},\"items_list\":[{\"id\":1}]}}";

        Call mockCall = Mockito.mock(Call.class);
        ReceiptsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;

        Receipt receipt = new Receipt()
                .id(1)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("nums")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));

        Receipt expected = receipt
                .id(10)
                .numeration("num");

        CreateReceiptRequest createReceiptRequest = new CreateReceiptRequest().data(receipt);

        CreateReceiptResponse response = api.createReceipt(companyId, createReceiptRequest);

        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Delete Receipt
     * <p>
     * Deletes the specified receipt.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteReceiptTest() throws ApiException, IOException {
        Call mockCall = Mockito.mock(Call.class);
        ReceiptsApi api = mockApi(null, mockCall);

        Integer companyId = 11111;
        Integer receiptId = 16451;
        api.deleteReceipt(companyId, receiptId);
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Get Receipt
     * <p>
     * Gets the specified receipt.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReceiptTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":10,\"date\":\"2021-12-25\",\"number\":10,\"numeration\":\"num\",\"amount_net\":10,\"amount_vat\":10,\"amount_gross\":10,\"use_gross_prices\":true,\"type\":\"till_receipt\",\"description\":\"descr\",\"rc_center\":\"bg\",\"created_at\":\"2021-10-10\",\"updated_at\":\"2021-10-10\",\"payment_account\":{\"id\":1,\"type\":\"standard\"},\"items_list\":[{\"id\":1}]}}";

        Call mockCall = Mockito.mock(Call.class);
        ReceiptsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        Integer receiptId = 16451;
        String fields = null;
        String fieldset = null;

        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));

        GetReceiptResponse response = api.getReceipt(companyId, receiptId, fields, fieldset);
        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Get Receipt Pre-Create Info
     * <p>
     * Retrieves the information useful while creating a new receipt.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReceiptPreCreateInfoTest() throws ApiException, IOException {
        String result = "{\"data\":{\"numerations_list\":[\"num\"],\"rc_centers_list\":[\"bg\"],\"payment_accounts_list\":[{\"id\":1,\"type\":\"standard\"}],\"categories_list\":[\"cat6\"],\"vat_types_list\":[{\"id\":1}]}}";

        Call mockCall = Mockito.mock(Call.class);
        ReceiptsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;

        ReceiptPreCreateInfo receiptPreCreateInfo = new ReceiptPreCreateInfo()
                .numerations(null)
                .addNumerationsListItem("num")
                .addRcCentersListItem("bg")
                .addPaymentAccountsListItem(new PaymentAccount().id(1))
                .addCategoriesListItem("cat6")
                .addVatTypesListItem(new VatType().id(1));

        GetReceiptPreCreateInfoResponse response = api.getReceiptPreCreateInfo(companyId);
        assertEquals(receiptPreCreateInfo, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Get Receipts Monthly Totals
     * <p>
     * Returns the monthly totals by year and receipt type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReceiptsMonthlyTotalsTest() throws ApiException, IOException {
        String result = "{\"data\":[{\"net\":10,\"gross\":10,\"count\":10}]}";

        Call mockCall = Mockito.mock(Call.class);
        ReceiptsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;

        MonthlyTotal monthlyTotal = new MonthlyTotal()
                .net(BigDecimal.valueOf(10))
                .gross(BigDecimal.valueOf(10))
                .count(BigDecimal.valueOf(10));

        List<MonthlyTotal> expected = new ArrayList<>();
        expected.add(monthlyTotal);
        GetReceiptsMonthlyTotalsResponse response = api.getReceiptsMonthlyTotals(companyId, "issued_documents", "2021");
        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * List Receipts
     * <p>
     * Lists the receipts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listReceiptsTest() throws ApiException, IOException {
        String result = "{\"current_page\":1,\"data\":[{\"id\":10,\"date\":\"2021-12-25\",\"number\":10,\"numeration\":\"num\",\"amount_net\":10,\"amount_vat\":10,\"amount_gross\":10,\"use_gross_prices\":true,\"type\":\"till_receipt\",\"description\":\"descr\",\"rc_center\":\"bg\",\"created_at\":\"2021-10-10\",\"updated_at\":\"2021-10-10\",\"payment_account\":{\"id\":1,\"type\":\"standard\"},\"items_list\":[{\"id\":1}]},{\"id\":100,\"date\":\"2021-12-25\",\"number\":10,\"numeration\":\"num\",\"amount_net\":10,\"amount_vat\":10,\"amount_gross\":10,\"use_gross_prices\":true,\"type\":\"till_receipt\",\"description\":\"descr\",\"rc_center\":\"bg\",\"created_at\":\"2021-10-10\",\"updated_at\":\"2021-10-10\",\"payment_account\":{\"id\":1,\"type\":\"standard\"},\"items_list\":[{\"id\":1}]}],\"first_page_url\":\"page=1\",\"from\":1,\"last_page\":2,\"last_page_url\":\"page=2\",\"next_page_url\":\"page=2\",\"path\":\"entities/clients\",\"per_page\":5,\"prev_page_url\":null,\"to\":50,\"total\":8}";

        Call mockCall = Mockito.mock(Call.class);
        ReceiptsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        String fields = null;
        String fieldset = null;
        String sort = null;
        Integer page = 1;
        Integer perPage = 5;
        String q = null;

        Receipt receipt1 = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));

        Receipt receipt2 = new Receipt()
                .id(100)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));

        List<Receipt> expected = Arrays.asList(receipt1, receipt2);

        ListReceiptsResponse response = api.listReceipts(companyId, fields, fieldset, page, perPage, sort, q);
        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Modify Receipt
     * <p>
     * Modifies the specified receipt.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyReceiptTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":10,\"date\":\"2021-12-25\",\"number\":10,\"numeration\":\"num\",\"amount_net\":10,\"amount_vat\":10,\"amount_gross\":10,\"use_gross_prices\":true,\"type\":\"till_receipt\",\"description\":\"descr\",\"rc_center\":\"bg\",\"created_at\":\"2021-10-10\",\"updated_at\":\"2021-10-10\",\"payment_account\":{\"id\":1,\"type\":\"standard\"},\"items_list\":[{\"id\":1}]}}";

        Call mockCall = Mockito.mock(Call.class);
        ReceiptsApi api = mockApi(result, mockCall);

        Integer companyId = 2;
        Integer archiveDocumentId = 2;

        Receipt receipt = new Receipt()
                .id(1)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("nums")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));

        Receipt expected = receipt
                .id(10)
                .numeration("num");

        ModifyReceiptRequest modifyReceiptRequest = new ModifyReceiptRequest().data(receipt);

        ModifyReceiptResponse response = api.modifyReceipt(companyId, archiveDocumentId, modifyReceiptRequest);

        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

}
