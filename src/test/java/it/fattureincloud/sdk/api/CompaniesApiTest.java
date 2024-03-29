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
import okhttp3.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/** API tests for CompaniesApi */
public class CompaniesApiTest {

  private static CompaniesApi mockApi(final String serializedBody, final Call remoteCall)
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

    return new CompaniesApi(client);
  }

  /**
   * Get Company Info
   *
   * <p>Gets the company detailed info.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getCompanyInfoTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"id\":12346,\"name\":\"Studio"
            + " Commercialista\",\"email\":\"mario.rossi@example.com\",\"type\":\"accountant\",\"access_info\":{\"role\":\"master\",\"through_accountant\":false},\"plan_info\":{\"limits\":{\"clients\":5000,\"suppliers\":5000,\"products\":5000,\"documents\":3000},\"functions\":{\"archive\":true,\"cerved\":true,\"document_attachments\":true,\"e_invoice\":true,\"genius\":true,\"mail_tracking\":true,\"payment_notifications\":true,\"paypal\":true,\"receipts\":true,\"recurring\":true,\"smtp\":true,\"sofort\":false,\"stock\":true,\"subaccounts\":true,\"tessera_sanitaria\":true,\"ts_digital\":true,\"ts_invoice_trading\":true,\"ts_pay\":true},\"functions_status\":{\"ts_digital\":{\"active\":true},\"ts_pay\":{\"active\":false}}},\"accountant_id\":12345,\"is_accountant\":true}}";

    Call mockCall = Mockito.mock(Call.class);
    CompaniesApi api = mockApi(result, mockCall);

    Integer companyId = 11111;

    CompanyInfo expected =
        new CompanyInfo()
            .id(12346)
            .name("Studio Commercialista")
            .email("mario.rossi@example.com")
            .type(CompanyType.ACCOUNTANT)
            .isAccountant(true)
            .accountantId(12345)
            .accessInfo(
                new CompanyInfoAccessInfo().role(UserCompanyRole.MASTER).throughAccountant(false))
            .planInfo(
                new CompanyInfoPlanInfo()
                    .limits(
                        new CompanyInfoPlanInfoLimits()
                            .clients(5000)
                            .suppliers(5000)
                            .products(5000)
                            .documents(3000))
                    .functions(
                        new CompanyInfoPlanInfoFunctions()
                            .documentAttachments(true)
                            .archive(true)
                            .paymentNotifications(true)
                            .paypal(true)
                            .receipts(true)
                            .eInvoice(true)
                            .genius(true)
                            .stock(true)
                            .smtp(true)
                            .mailTracking(true)
                            .subaccounts(true)
                            .tesseraSanitaria(true)
                            .recurring(true)
                            .sofort(false)
                            .cerved(true)
                            .tsDigital(true)
                            .tsPay(true)
                            .tsInvoiceTrading(true))
                    .functionsStatus(
                        new CompanyInfoPlanInfoFunctionsStatus()
                            .tsDigital(new FunctionStatus().active(true))
                            .tsPay(new FunctionStatus().active(false))));

    GetCompanyInfoResponse response = api.getCompanyInfo(companyId);
    assertEquals(expected, response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }
}
