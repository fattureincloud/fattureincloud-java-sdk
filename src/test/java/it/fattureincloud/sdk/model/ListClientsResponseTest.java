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
import java.net.URI;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for ListClientsResponse
 */
public class ListClientsResponseTest {
    private ListClientsResponse model;

    @BeforeEach
    public void init() {
        model = new ListClientsResponse()
                .addDataItem(
                        new Client()
                                .id(12345)
                                .code("AE86")
                                .name("Avv. Maria Rossi")
                                .type(ClientType.PERSON)
                                .firstName("Maria")
                                .lastName("Rossi")
                                .contactPerson("")
                                .vatNumber("IT12345640962")
                                .taxCode("BLTGNI5ABCDA794E")
                                .addressStreet("Via Roma, 1")
                                .addressPostalCode("20900")
                                .addressCity("Milano")
                                .addressProvince("MI")
                                .addressExtra("")
                                .country("Italia")
                                .email("maria.rossi@example.com")
                                .certifiedEmail("maria.rossi@pec.example.com")
                                .phone("1234567890")
                                .fax("")
                                .notes("")
                                .createdAt("2021-04-29 08:53:07")
                                .updatedAt("2021-04-29 08:53:07")
                                .defaultPaymentTerms(1)
                                .defaultPaymentTermsType(PaymentTermsType.STANDARD)
                                .bankName("Indesa")
                                .bankIban("IT40P123456781000000123456")
                                .bankSwiftCode("AK86PCT")
                                .shippingAddress("Corso Magellano 4")
                                .eInvoice(true)
                                .eiCode("111111")
                                .defaultVat(new VatType()
                                        .id(54321)
                                        .value(BigDecimal.valueOf(45))
                                        .description("")
                                        .isDisabled(false)
                                )
                                .defaultPaymentMethod(new PaymentMethod()
                                        .id(386092)
                                        .name("Credit card")
                                )
                )
                .currentPage(10)
                .firstPageUrl(URI.create("https://www.page.url/"))
                .from(10)
                .lastPage(10)
                .lastPageUrl(URI.create("https://www.page.url/"))
                .nextPageUrl(URI.create("https://www.page.url/"))
                .path(URI.create("https://www.page.url/"))
                .perPage(10)
                .prevPageUrl(URI.create("https://www.page.url/"))
                .to(10)
                .total(10);
    }

    /**
     * Model tests for ListClientsResponse
     */
    @Test
    public void testListClientsResponse() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"current_page\":10,\"first_page_url\":\"https://www.page.url/\",\"from\":10,\"last_page\":10,\"last_page_url\":\"https://www.page.url/\",\"next_page_url\":\"https://www.page.url/\",\"path\":\"https://www.page.url/\",\"per_page\":10,\"prev_page_url\":\"https://www.page.url/\",\"to\":10,\"total\":10,\"data\":[{\"id\":12345,\"code\":\"AE86\",\"name\":\"Avv. Maria Rossi\",\"type\":\"person\",\"first_name\":\"Maria\",\"last_name\":\"Rossi\",\"contact_person\":\"\",\"vat_number\":\"IT12345640962\",\"tax_code\":\"BLTGNI5ABCDA794E\",\"address_street\":\"Via Roma, 1\",\"address_postal_code\":\"20900\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"email\":\"maria.rossi@example.com\",\"certified_email\":\"maria.rossi@pec.example.com\",\"phone\":\"1234567890\",\"fax\":\"\",\"notes\":\"\",\"default_vat\":{\"id\":54321,\"value\":45,\"description\":\"\",\"is_disabled\":false},\"default_payment_terms\":1,\"default_payment_terms_type\":\"standard\",\"default_payment_method\":{\"id\":386092,\"name\":\"Credit card\",\"type\":\"standard\"},\"bank_name\":\"Indesa\",\"bank_iban\":\"IT40P123456781000000123456\",\"bank_swift_code\":\"AK86PCT\",\"shipping_address\":\"Corso Magellano 4\",\"e_invoice\":true,\"ei_code\":\"111111\",\"created_at\":\"2021-04-29 08:53:07\",\"updated_at\":\"2021-04-29 08:53:07\"}]}";
        assertEquals(str, json);
        ListClientsResponse generated = gson.fromJson(str, ListClientsResponse.class);
        assertEquals(model, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'currentPage'
     */
    @Test
    public void currentPageTest() {
        assertEquals(10, model.getCurrentPage());
        model.setCurrentPage(1);
        assertEquals(1, model.getCurrentPage());
    }

    /**
     * Test the property 'firstPageUrl'
     */
    @Test
    public void firstPageUrlTest() {
        assertEquals(URI.create("https://www.page.url/"), model.getFirstPageUrl());
        model.setFirstPageUrl(URI.create("https://www.page2.url/"));
        assertEquals(URI.create("https://www.page2.url/"), model.getFirstPageUrl());
    }

    /**
     * Test the property 'from'
     */
    @Test
    public void fromTest() {
        assertEquals(10, model.getFrom());
        model.setFrom(1);
        assertEquals(1, model.getFrom());
    }

    /**
     * Test the property 'lastPage'
     */
    @Test
    public void lastPageTest() {
        assertEquals(10, model.getLastPage());
        model.setLastPage(1);
        assertEquals(1, model.getLastPage());
    }

    /**
     * Test the property 'lastPageUrl'
     */
    @Test
    public void lastPageUrlTest() {
        assertEquals(URI.create("https://www.page.url/"), model.getLastPageUrl());
        model.setLastPageUrl(URI.create("https://www.page2.url/"));
        assertEquals(URI.create("https://www.page2.url/"), model.getLastPageUrl());
    }

    /**
     * Test the property 'nextPageUrl'
     */
    @Test
    public void nextPageUrlTest() {
        assertEquals(URI.create("https://www.page.url/"), model.getNextPageUrl());
        model.setNextPageUrl(URI.create("https://www.page2.url/"));
        assertEquals(URI.create("https://www.page2.url/"), model.getNextPageUrl());
    }

    /**
     * Test the property 'path'
     */
    @Test
    public void pathTest() {
        assertEquals(URI.create("https://www.page.url/"), model.getPath());
        model.setPath(URI.create("https://www.page2.url/"));
        assertEquals(URI.create("https://www.page2.url/"), model.getPath());
    }

    /**
     * Test the property 'perPage'
     */
    @Test
    public void perPageTest() {
        assertEquals(10, model.getPerPage());
        model.setPerPage(1);
        assertEquals(1, model.getPerPage());
    }

    /**
     * Test the property 'prevPageUrl'
     */
    @Test
    public void prevPageUrlTest() {
        assertEquals(URI.create("https://www.page.url/"), model.getPrevPageUrl());
        model.setPrevPageUrl(URI.create("https://www.page2.url/"));
        assertEquals(URI.create("https://www.page2.url/"), model.getPrevPageUrl());
    }

    /**
     * Test the property 'to'
     */
    @Test
    public void toTest() {
        assertEquals(10, model.getTo());
        model.setTo(1);
        assertEquals(1, model.getTo());
    }

    /**
     * Test the property 'total'
     */
    @Test
    public void totalTest() {
        assertEquals(10, model.getTotal());
        model.setTotal(1);
        assertEquals(1, model.getTotal());
    }

    /**
     * Test the property 'data'
     */
    @Test
    public void dataTest() {
        assertEquals(12345, model.getData().get(0).getId());
        model.setData(Arrays.asList(new Client().id(1)));
        assertEquals(1, model.getData().get(0).getId());

        model.data(Arrays.asList(new Client().id(2)));
        ListClientsResponse actual = new ListClientsResponse();
        actual.setData(Arrays.asList(new Client().id(2)));
        actual.currentPage(10)
                .firstPageUrl(URI.create("https://www.page.url/"))
                .from(10)
                .lastPage(10)
                .lastPageUrl(URI.create("https://www.page.url/"))
                .nextPageUrl(URI.create("https://www.page.url/"))
                .path(URI.create("https://www.page.url/"))
                .perPage(10)
                .prevPageUrl(URI.create("https://www.page.url/"))
                .to(10)
                .total(10);
        assertEquals(model, actual);
    }

}
