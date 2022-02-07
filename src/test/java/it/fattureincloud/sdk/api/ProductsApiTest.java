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
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * API tests for ProductsApi
 */
public class ProductsApiTest {

    private static ProductsApi mockApi(final String serializedBody, final Call remoteCall) throws IOException {
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

        return new ProductsApi(client);
    }


    /**
     * Create Product
     * <p>
     * Creates a new product.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProductTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":1,\"name\":\"neim\",\"code\":\"cod\",\"net_price\":10,\"gross_price\":10,\"use_gross_price\":true,\"default_vat\":{\"id\":1,\"editable\":true},\"net_cost\":10,\"measure\":\"big\",\"description\":\"desc\",\"category\":\"cat6\",\"notes\":\"nots\",\"in_stock\":true,\"stock_initial\":10,\"average_cost\":10,\"average_price\":10,\"created_at\":\"2021-10-10\",\"updated_at\":\"2021-10-10\"}}";

        Call mockCall = Mockito.mock(Call.class);
        ProductsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;

        Product product = new Product()
                .id(12345)
                .name("nam")
                .code("cod")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .useGrossPrice(true)
                .defaultVat(new VatType().id(1))
                .netCost(BigDecimal.valueOf(10))
                .measure("big")
                .description("desc")
                .category("cat6")
                .notes("nots")
                .inStock(true)
                .stockInitial(BigDecimal.valueOf(10))
                .averageCost(BigDecimal.valueOf(10))
                .averagePrice(BigDecimal.valueOf(10))
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10");

        Product expected = product
                .id(1)
                .name("neim");

        CreateProductRequest createProductRequest = new CreateProductRequest().data(product);

        CreateProductResponse response = api.createProduct(companyId, createProductRequest);

        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Delete Product
     * <p>
     * Deletes the specified product.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProductTest() throws ApiException, IOException {
        Call mockCall = Mockito.mock(Call.class);
        ProductsApi api = mockApi(null, mockCall);

        Integer companyId = 11111;
        Integer productId = 16451;
        api.deleteProduct(companyId, productId);
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Get Product
     * <p>
     * Gets the specified product.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProductTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":1,\"name\":\"neim\",\"code\":\"cod\",\"net_price\":10,\"gross_price\":10,\"use_gross_price\":true,\"default_vat\":{\"id\":1,\"editable\":true},\"net_cost\":10,\"measure\":\"big\",\"description\":\"desc\",\"category\":\"cat6\",\"notes\":\"nots\",\"in_stock\":true,\"stock_initial\":10,\"average_cost\":10,\"average_price\":10,\"created_at\":\"2021-10-10\",\"updated_at\":\"2021-10-10\"}}";

        Call mockCall = Mockito.mock(Call.class);
        ProductsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        Integer productId = 16451;
        String fields = null;
        String fieldset = null;

        Product expected = new Product()
                .id(1)
                .name("neim")
                .code("cod")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .useGrossPrice(true)
                .defaultVat(new VatType().id(1))
                .netCost(BigDecimal.valueOf(10))
                .measure("big")
                .description("desc")
                .category("cat6")
                .notes("nots")
                .inStock(true)
                .stockInitial(BigDecimal.valueOf(10))
                .averageCost(BigDecimal.valueOf(10))
                .averagePrice(BigDecimal.valueOf(10))
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10");

        GetProductResponse response = api.getProduct(companyId, productId, fields, fieldset);
        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * List Products
     * <p>
     * Lists the products.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listProductsTest() throws ApiException, IOException {
        String result = "{\"current_page\":1,\"data\":[{\"id\":1,\"name\":\"neim\",\"code\":\"cod\",\"net_price\":10,\"gross_price\":10,\"use_gross_price\":true,\"default_vat\":{\"id\":1,\"editable\":true},\"net_cost\":10,\"measure\":\"big\",\"description\":\"desc\",\"category\":\"cat6\",\"notes\":\"nots\",\"in_stock\":true,\"stock_initial\":10,\"average_cost\":10,\"average_price\":10,\"created_at\":\"2021-10-10\",\"updated_at\":\"2021-10-10\"},{\"id\":2,\"name\":\"neim\",\"code\":\"cod\",\"net_price\":10,\"gross_price\":10,\"use_gross_price\":true,\"default_vat\":{\"id\":1,\"editable\":true},\"net_cost\":10,\"measure\":\"big\",\"description\":\"desc\",\"category\":\"cat6\",\"notes\":\"nots\",\"in_stock\":true,\"stock_initial\":10,\"average_cost\":10,\"average_price\":10,\"created_at\":\"2021-10-10\",\"updated_at\":\"2021-10-10\"}],\"first_page_url\":\"page=1\",\"from\":1,\"last_page\":2,\"last_page_url\":\"page=2\",\"next_page_url\":\"page=2\",\"path\":\"entities/clients\",\"per_page\":5,\"prev_page_url\":null,\"to\":50,\"total\":8}";

        Call mockCall = Mockito.mock(Call.class);
        ProductsApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        String fields = null;
        String fieldset = null;
        String sort = null;
        Integer page = 1;
        Integer perPage = 5;

        Product product1 = new Product()
                .id(1)
                .name("neim")
                .code("cod")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .useGrossPrice(true)
                .defaultVat(new VatType().id(1))
                .netCost(BigDecimal.valueOf(10))
                .measure("big")
                .description("desc")
                .category("cat6")
                .notes("nots")
                .inStock(true)
                .stockInitial(BigDecimal.valueOf(10))
                .averageCost(BigDecimal.valueOf(10))
                .averagePrice(BigDecimal.valueOf(10))
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10");

        Product product2 = new Product()
                .id(2)
                .name("neim")
                .code("cod")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .useGrossPrice(true)
                .defaultVat(new VatType().id(1))
                .netCost(BigDecimal.valueOf(10))
                .measure("big")
                .description("desc")
                .category("cat6")
                .notes("nots")
                .inStock(true)
                .stockInitial(BigDecimal.valueOf(10))
                .averageCost(BigDecimal.valueOf(10))
                .averagePrice(BigDecimal.valueOf(10))
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10");

        List<Product> expected = Arrays.asList(product1, product2);

        ListProductsResponse response = api.listProducts(companyId, fields, fieldset, sort, page, perPage);
        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Modify Product
     * <p>
     * Modifies the specified product.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyProductTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":1,\"name\":\"neim\",\"code\":\"cod\",\"net_price\":10,\"gross_price\":10,\"use_gross_price\":true,\"default_vat\":{\"id\":1,\"editable\":true},\"net_cost\":10,\"measure\":\"big\",\"description\":\"desc\",\"category\":\"cat6\",\"notes\":\"nots\",\"in_stock\":true,\"stock_initial\":10,\"average_cost\":10,\"average_price\":10,\"created_at\":\"2021-10-10\",\"updated_at\":\"2021-10-10\"}}";

        Call mockCall = Mockito.mock(Call.class);
        ProductsApi api = mockApi(result, mockCall);

        Integer companyId = 2;
        Integer archiveDocumentId = 2;

        Product product = new Product()
                .id(12345)
                .name("nam")
                .code("cod")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .useGrossPrice(true)
                .defaultVat(new VatType().id(1))
                .netCost(BigDecimal.valueOf(10))
                .measure("big")
                .description("desc")
                .category("cat6")
                .notes("nots")
                .inStock(true)
                .stockInitial(BigDecimal.valueOf(10))
                .averageCost(BigDecimal.valueOf(10))
                .averagePrice(BigDecimal.valueOf(10))
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10");

        Product expected = product
                .id(1)
                .name("neim");

        ModifyProductRequest modifyProductRequest = new ModifyProductRequest().data(product);

        ModifyProductResponse response = api.modifyProduct(companyId, archiveDocumentId, modifyProductRequest);

        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

}
