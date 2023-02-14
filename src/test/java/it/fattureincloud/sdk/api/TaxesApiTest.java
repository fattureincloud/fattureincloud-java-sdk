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
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import okhttp3.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/** API tests for TaxesApi */
public class TaxesApiTest {

  private static TaxesApi mockApi(final String serializedBody, final Call remoteCall)
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

    return new TaxesApi(client);
  }

  /**
   * Create F24
   *
   * <p>Creates a new F24.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void createF24Test() throws ApiException, IOException {
    String result =
        "{\"data\":{\"id\":12345,\"due_date\":\"2021-12-31\",\"status\":\"paid\",\"payment_account\":{\"id\":111,\"name\":\"Indesa"
            + " - Carta"
            + " conto\",\"type\":\"standard\"},\"amount\":840.36,\"attachment_token\":\"Adfqregwthwrt6whrtghsrgbsdthyeruerur6u6676e5879\",\"description\":\"PAGAMENTO"
            + " IVA 2021\"}}";

    Call mockCall = Mockito.mock(Call.class);
    TaxesApi api = mockApi(result, mockCall);

    Integer companyId = 11111;

    F24 f24 =
        new F24()
            .id(1)
            .amount(BigDecimal.valueOf(840.36))
            .description("PAGAMENTO IVA 3021")
            .dueDate(LocalDate.parse("2021-12-31"))
            .status(F24Status.PAID)
            .paymentAccount(new PaymentAccount().id(111).name("Indesa - Carta conto"))
            .attachmentToken("Adfqregwthwrt6whrtghsrgbsdthyeruerur6u6676e5879");

    F24 expected = f24.id(12345).description("PAGAMENTO IVA 2021");

    CreateF24Request createF24Request = new CreateF24Request().data(f24);

    CreateF24Response response = api.createF24(companyId, createF24Request);

    assertEquals(expected, response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Delete F24
   *
   * <p>Removes the specified F24.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteF24Test() throws ApiException, IOException {
    Call mockCall = Mockito.mock(Call.class);
    TaxesApi api = mockApi(null, mockCall);

    Integer companyId = 11111;
    Integer f24Id = 16451;
    api.deleteF24(companyId, f24Id);
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Delete F24 Attachment
   *
   * <p>Removes the attachment of the specified F24.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteF24AttachmentTest() throws ApiException, IOException {
    Call mockCall = Mockito.mock(Call.class);
    TaxesApi api = mockApi(null, mockCall);

    Integer companyId = 11111;
    Integer f24Id = 16451;
    api.deleteF24Attachment(companyId, f24Id);
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Get F24
   *
   * <p>Gets the specified F24.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getF24Test() throws ApiException, IOException {
    String result =
        "{\"data\":{\"id\":12345,\"due_date\":\"2021-12-31\",\"status\":\"paid\",\"payment_account\":{\"id\":111,\"name\":\"Indesa"
            + " - Carta"
            + " conto\",\"type\":\"standard\"},\"amount\":840.36,\"attachment_token\":\"Adfqregwthwrt6whrtghsrgbsdthyeruerur6u6676e5879\",\"description\":\"PAGAMENTO"
            + " IVA 2021\"}}";

    Call mockCall = Mockito.mock(Call.class);
    TaxesApi api = mockApi(result, mockCall);

    Integer companyId = 11111;
    Integer f24Id = 16451;
    String fields = null;
    String fieldset = null;

    F24 expected =
        new F24()
            .id(12345)
            .amount(BigDecimal.valueOf(840.36))
            .description("PAGAMENTO IVA 2021")
            .dueDate(LocalDate.parse("2021-12-31"))
            .status(F24Status.PAID)
            .paymentAccount(new PaymentAccount().id(111).name("Indesa - Carta conto"))
            .attachmentToken("Adfqregwthwrt6whrtghsrgbsdthyeruerur6u6676e5879");

    GetF24Response response = api.getF24(companyId, f24Id, fields, fieldset);
    assertEquals(expected, response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * List F24
   *
   * <p>Lists the F24s.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void listF24Test() throws ApiException, IOException {
    String result =
        "{\"current_page\":1,\"data\":[{\"id\":12345,\"due_date\":\"2021-12-31\",\"status\":\"paid\",\"payment_account\":{\"id\":111,\"name\":\"Indesa"
            + " - Carta"
            + " conto\",\"type\":\"standard\"},\"amount\":840.36,\"attachment_token\":\"Adfqregwthwrt6whrtghsrgbsdthyeruerur6u6676e5879\",\"description\":\"PAGAMENTO"
            + " IVA 2021\"},{\"id\":123456,\"due_date\":\"2021-12-31\",\"status\":\"paid\",\"payment_account\":{\"id\":111,\"name\":\"Indesa"
            + " - Carta"
            + " conto\",\"type\":\"standard\"},\"amount\":840.36,\"attachment_token\":\"Adfqregwthwrt6whrtghsrgbsdthyeruerur6u6676e5879\",\"description\":\"PAGAMENTO"
            + " IVA 2021\"}],\"first_page_url\":\"page=1\",\"from\":1,\"last_page\":2,\"last_page_url\":\"page=2\",\"next_page_url\":\"page=2\",\"path\":\"entities/clients\",\"per_page\":5,\"prev_page_url\":null,\"to\":50,\"total\":8}";

    Call mockCall = Mockito.mock(Call.class);
    TaxesApi api = mockApi(result, mockCall);

    Integer companyId = 11111;
    String fields = null;
    String fieldset = null;
    String sort = null;
    Integer page = 1;
    Integer perPage = 5;
    String q = null;

    F24 f241 =
        new F24()
            .id(12345)
            .amount(BigDecimal.valueOf(840.36))
            .description("PAGAMENTO IVA 2021")
            .dueDate(LocalDate.parse("2021-12-31"))
            .status(F24Status.PAID)
            .paymentAccount(new PaymentAccount().id(111).name("Indesa - Carta conto"))
            .attachmentToken("Adfqregwthwrt6whrtghsrgbsdthyeruerur6u6676e5879");

    F24 f242 =
        new F24()
            .id(123456)
            .amount(BigDecimal.valueOf(840.36))
            .description("PAGAMENTO IVA 2021")
            .dueDate(LocalDate.parse("2021-12-31"))
            .status(F24Status.PAID)
            .paymentAccount(new PaymentAccount().id(111).name("Indesa - Carta conto"))
            .attachmentToken("Adfqregwthwrt6whrtghsrgbsdthyeruerur6u6676e5879");

    List<F24> expected = Arrays.asList(f241, f242);

    ListF24Response response = api.listF24(companyId, fields, fieldset, sort, page, perPage, q);
    assertEquals(expected, response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Modify F24
   *
   * <p>Modifies the specified F24.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void modifyF24Test() throws ApiException, IOException {
    String result =
        "{\"data\":{\"id\":12345,\"due_date\":\"2021-12-31\",\"status\":\"paid\",\"payment_account\":{\"id\":111,\"name\":\"Indesa"
            + " - Carta"
            + " conto\",\"type\":\"standard\"},\"amount\":840.36,\"attachment_token\":\"Adfqregwthwrt6whrtghsrgbsdthyeruerur6u6676e5879\",\"description\":\"PAGAMENTO"
            + " IVA 2021\"}}";

    Call mockCall = Mockito.mock(Call.class);
    TaxesApi api = mockApi(result, mockCall);

    Integer companyId = 2;
    Integer f24Id = 2;

    F24 f24 =
        new F24()
            .id(1)
            .amount(BigDecimal.valueOf(840.36))
            .description("PAGAMENTO IVA 3021")
            .dueDate(LocalDate.parse("2021-12-31"))
            .status(F24Status.PAID)
            .paymentAccount(new PaymentAccount().id(111).name("Indesa - Carta conto"))
            .attachmentToken("Adfqregwthwrt6whrtghsrgbsdthyeruerur6u6676e5879");

    F24 expected = f24.id(12345).description("PAGAMENTO IVA 2021");

    ModifyF24Request modifyF24Request = new ModifyF24Request().data(f24);

    ModifyF24Response response = api.modifyF24(companyId, f24Id, modifyF24Request);

    assertEquals(expected, response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Upload F24 Attachment
   *
   * <p>Uploads an attachment destined to a F24. The actual association between the document and the
   * attachment must be implemented separately, using the returned token.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void uploadF24AttachmentTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"attachment_token\":\"YmMyNWYxYzIwMTU3N212ABCDZjZiMzg5OWY0ODNkZDQveXl5LmRvYw\"}}";

    Call mockCall = Mockito.mock(Call.class);
    TaxesApi api = mockApi(result, mockCall);

    Integer companyId = 11111;
    UploadF24AttachmentResponse expected =
        new UploadF24AttachmentResponse()
            .data(
                new AttachmentData()
                    .attachmentToken("YmMyNWYxYzIwMTU3N212ABCDZjZiMzg5OWY0ODNkZDQveXl5LmRvYw"));

    UploadF24AttachmentResponse response = api.uploadF24Attachment(companyId, "filename", null);

    assertEquals(expected.getData(), response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }
}
