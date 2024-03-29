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

import static org.junit.jupiter.api.Assertions.assertEquals;

import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.model.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import okhttp3.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/** API tests for SuppliersApi */
public class SuppliersApiTest {

  private static SuppliersApi mockApi(final String serializedBody, final Call remoteCall)
      throws IOException {
    final OkHttpClient okHttpClient = Mockito.mock(OkHttpClient.class);

    Response.Builder builder =
        new Response.Builder()
            .request(new Request.Builder().url("https://api-v2.fattureincloud.it").build())
            .protocol(Protocol.HTTP_1_1)
            .code(200)
            .message("");
    if (serializedBody != null) {
      builder =
          builder.body(ResponseBody.create(serializedBody, MediaType.parse("application/json")));
    }

    final Response response = builder.build();

    Mockito.when(remoteCall.execute()).thenReturn(response);
    Mockito.when(okHttpClient.newCall(Mockito.any())).thenReturn(remoteCall);

    ApiClient client = new ApiClient(okHttpClient);

    return new SuppliersApi(client);
  }

  /**
   * Create Supplier
   *
   * <p>Creates a new supplier.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void createSupplierTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"id\":12345,\"code\":\"AE86\",\"name\":\"Mario Rossi"
            + " S.R.L.\",\"type\":\"company\",\"first_name\":\"Mario\",\"last_name\":\"Rossi\",\"contact_person\":\"\",\"vat_number\":\"111222333\",\"tax_code\":\"111122233\",\"address_street\":\"Corso"
            + " Magellano,"
            + " 46\",\"address_postal_code\":\"20146\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"email\":\"mario.rossi@example.com\",\"certified_email\":\"mario.rossi@pec.example.com\",\"phone\":\"1234567890\",\"fax\":\"123456789\",\"notes\":\"\",\"created_at\":\"2021-15-08\",\"updated_at\":\"2021-15-08\"}}";

    Call mockCall = Mockito.mock(Call.class);
    SuppliersApi api = mockApi(result, mockCall);

    Integer companyId = 11111;

    Supplier supplier =
        new Supplier()
            .id(1)
            .code("AE85")
            .name("Mario Rossi S.R.L.")
            .type(SupplierType.COMPANY)
            .firstName("Mario")
            .lastName("Rossi")
            .contactPerson("")
            .vatNumber("111222333")
            .taxCode("111122233")
            .addressStreet("Corso Magellano, 46")
            .addressPostalCode("20146")
            .addressCity("Milano")
            .addressProvince("MI")
            .addressExtra("")
            .country("Italia")
            .email("mario.rossi@example.com")
            .certifiedEmail("mario.rossi@pec.example.com")
            .phone("1234567890")
            .fax("123456789")
            .notes("")
            .createdAt("2021-15-08")
            .updatedAt("2021-15-08");

    Supplier expected = supplier.id(12345).code("AE86");

    CreateSupplierRequest createSupplierRequest = new CreateSupplierRequest().data(supplier);

    CreateSupplierResponse response = api.createSupplier(companyId, createSupplierRequest);

    assertEquals(expected, response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Delete Supplier
   *
   * <p>Deletes the specified supplier.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteSupplierTest() throws ApiException, IOException {
    Call mockCall = Mockito.mock(Call.class);
    SuppliersApi api = mockApi(null, mockCall);

    Integer companyId = 11111;
    Integer archiveDocumentId = 16451;
    api.deleteSupplier(companyId, archiveDocumentId);
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Get Supplier
   *
   * <p>Gets the specified supplier.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getSupplierTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"id\":12345,\"code\":\"AE86\",\"name\":\"Mario Rossi"
            + " S.R.L.\",\"type\":\"company\",\"first_name\":\"Mario\",\"last_name\":\"Rossi\",\"contact_person\":\"\",\"vat_number\":\"111222333\",\"tax_code\":\"111122233\",\"address_street\":\"Corso"
            + " Magellano,"
            + " 46\",\"address_postal_code\":\"20146\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"email\":\"mario.rossi@example.com\",\"certified_email\":\"mario.rossi@pec.example.com\",\"phone\":\"1234567890\",\"fax\":\"123456789\",\"notes\":\"\",\"created_at\":\"2021-15-08\",\"updated_at\":\"2021-15-08\"}}";

    Call mockCall = Mockito.mock(Call.class);
    SuppliersApi api = mockApi(result, mockCall);

    Integer companyId = 11111;
    Integer supplierId = 16451;
    String fields = null;
    String fieldset = null;

    Supplier expected =
        new Supplier()
            .id(12345)
            .code("AE86")
            .name("Mario Rossi S.R.L.")
            .type(SupplierType.COMPANY)
            .firstName("Mario")
            .lastName("Rossi")
            .contactPerson("")
            .vatNumber("111222333")
            .taxCode("111122233")
            .addressStreet("Corso Magellano, 46")
            .addressPostalCode("20146")
            .addressCity("Milano")
            .addressProvince("MI")
            .addressExtra("")
            .country("Italia")
            .email("mario.rossi@example.com")
            .certifiedEmail("mario.rossi@pec.example.com")
            .phone("1234567890")
            .fax("123456789")
            .notes("")
            .createdAt("2021-15-08")
            .updatedAt("2021-15-08");

    GetSupplierResponse response = api.getSupplier(companyId, supplierId, fields, fieldset);
    assertEquals(expected, response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * List Suppliers
   *
   * <p>Lists the suppliers.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void listSuppliersTest() throws ApiException, IOException {
    String result =
        "{\"current_page\":1,\"data\":[{\"id\":12345,\"code\":\"AE86\",\"name\":\"Mario Rossi"
            + " S.R.L.\",\"type\":\"company\",\"first_name\":\"Mario\",\"last_name\":\"Rossi\",\"contact_person\":\"\",\"vat_number\":\"111222333\",\"tax_code\":\"111122233\",\"address_street\":\"Corso"
            + " Magellano,"
            + " 46\",\"address_postal_code\":\"20146\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"email\":\"mario.rossi@example.com\",\"certified_email\":\"mario.rossi@pec.example.com\",\"phone\":\"1234567890\",\"fax\":\"123456789\",\"notes\":\"\",\"created_at\":\"2021-15-08\",\"updated_at\":\"2021-15-08\"},{\"id\":123456,\"code\":\"AE86\",\"name\":\"Mario"
            + " Rossi"
            + " S.R.L.\",\"type\":\"company\",\"first_name\":\"Mario\",\"last_name\":\"Rossi\",\"contact_person\":\"\",\"vat_number\":\"111222333\",\"tax_code\":\"111122233\",\"address_street\":\"Corso"
            + " Magellano,"
            + " 46\",\"address_postal_code\":\"20146\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"email\":\"mario.rossi@example.com\",\"certified_email\":\"mario.rossi@pec.example.com\",\"phone\":\"1234567890\",\"fax\":\"123456789\",\"notes\":\"\",\"created_at\":\"2021-15-08\",\"updated_at\":\"2021-15-08\"}],\"first_page_url\":\"page=1\",\"from\":1,\"last_page\":2,\"last_page_url\":\"page=2\",\"next_page_url\":\"page=2\",\"path\":\"entities/clients\",\"per_page\":5,\"prev_page_url\":null,\"to\":50,\"total\":8}";

    Call mockCall = Mockito.mock(Call.class);
    SuppliersApi api = mockApi(result, mockCall);

    Integer companyId = 11111;
    String fields = null;
    String fieldset = null;
    String sort = null;
    Integer page = 1;
    Integer perPage = 5;
    String q = null;

    Supplier supplier1 =
        new Supplier()
            .id(12345)
            .code("AE86")
            .name("Mario Rossi S.R.L.")
            .type(SupplierType.COMPANY)
            .firstName("Mario")
            .lastName("Rossi")
            .contactPerson("")
            .vatNumber("111222333")
            .taxCode("111122233")
            .addressStreet("Corso Magellano, 46")
            .addressPostalCode("20146")
            .addressCity("Milano")
            .addressProvince("MI")
            .addressExtra("")
            .country("Italia")
            .email("mario.rossi@example.com")
            .certifiedEmail("mario.rossi@pec.example.com")
            .phone("1234567890")
            .fax("123456789")
            .notes("")
            .createdAt("2021-15-08")
            .updatedAt("2021-15-08");

    Supplier supplier2 =
        new Supplier()
            .id(123456)
            .code("AE86")
            .name("Mario Rossi S.R.L.")
            .type(SupplierType.COMPANY)
            .firstName("Mario")
            .lastName("Rossi")
            .contactPerson("")
            .vatNumber("111222333")
            .taxCode("111122233")
            .addressStreet("Corso Magellano, 46")
            .addressPostalCode("20146")
            .addressCity("Milano")
            .addressProvince("MI")
            .addressExtra("")
            .country("Italia")
            .email("mario.rossi@example.com")
            .certifiedEmail("mario.rossi@pec.example.com")
            .phone("1234567890")
            .fax("123456789")
            .notes("")
            .createdAt("2021-15-08")
            .updatedAt("2021-15-08");

    List<Supplier> expected = Arrays.asList(supplier1, supplier2);

    ListSuppliersResponse response =
        api.listSuppliers(companyId, fields, fieldset, sort, page, perPage, q);
    assertEquals(expected, response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Modify Supplier
   *
   * <p>Modifies the specified supplier.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void modifySupplierTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"id\":12345,\"code\":\"AE86\",\"name\":\"Mario Rossi"
            + " S.R.L.\",\"type\":\"company\",\"first_name\":\"Mario\",\"last_name\":\"Rossi\",\"contact_person\":\"\",\"vat_number\":\"111222333\",\"tax_code\":\"111122233\",\"address_street\":\"Corso"
            + " Magellano,"
            + " 46\",\"address_postal_code\":\"20146\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"email\":\"mario.rossi@example.com\",\"certified_email\":\"mario.rossi@pec.example.com\",\"phone\":\"1234567890\",\"fax\":\"123456789\",\"notes\":\"\",\"created_at\":\"2021-15-08\",\"updated_at\":\"2021-15-08\"}}";

    Call mockCall = Mockito.mock(Call.class);
    SuppliersApi api = mockApi(result, mockCall);

    Integer companyId = 2;
    Integer archiveDocumentId = 2;

    Supplier supplier =
        new Supplier()
            .id(1)
            .code("AE85")
            .name("Mario Rossi S.R.L.")
            .type(SupplierType.COMPANY)
            .firstName("Mario")
            .lastName("Rossi")
            .contactPerson("")
            .vatNumber("111222333")
            .taxCode("111122233")
            .addressStreet("Corso Magellano, 46")
            .addressPostalCode("20146")
            .addressCity("Milano")
            .addressProvince("MI")
            .addressExtra("")
            .country("Italia")
            .email("mario.rossi@example.com")
            .certifiedEmail("mario.rossi@pec.example.com")
            .phone("1234567890")
            .fax("123456789")
            .notes("")
            .createdAt("2021-15-08")
            .updatedAt("2021-15-08");

    Supplier expected = supplier.id(12345).code("AE86");

    ModifySupplierRequest modifySupplierRequest = new ModifySupplierRequest().data(supplier);

    ModifySupplierResponse response =
        api.modifySupplier(companyId, archiveDocumentId, modifySupplierRequest);

    assertEquals(expected, response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }
}
