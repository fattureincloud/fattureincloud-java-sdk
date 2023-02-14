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
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.gson.Gson;
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.JSON;
import it.fattureincloud.sdk.model.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/** API tests for UserApi */
public class UserApiTest {

  private static UserApi mockApi(final String serializedBody, final Call remoteCall)
      throws IOException {
    final OkHttpClient okHttpClient = Mockito.mock(OkHttpClient.class);

    final Response response =
        new Response.Builder()
            .request(new Request.Builder().url("https://api-v2.fattureincloud.it").build())
            .protocol(Protocol.HTTP_1_1)
            .code(200)
            .message("")
            .body(ResponseBody.create(serializedBody, MediaType.parse("application/json")))
            .build();

    Mockito.when(remoteCall.execute()).thenReturn(response);
    Mockito.when(okHttpClient.newCall(Mockito.any())).thenReturn(remoteCall);

    ApiClient client = new ApiClient(okHttpClient);

    return new UserApi(client);
  }

  /**
   * Get User Info
   *
   * <p>Gets the current user&#39;s info.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getUserInfoTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"id\":12345,\"name\":\"Mario"
            + " Rossi\",\"first_name\":\"Mario\",\"last_name\":\"Rossi\",\"email\":\"mario.rossi@example.com\",\"hash\":\"5add29e1234532a1bf2ed7b612043029\",\"picture\":\"picture.jpg\"},\"info\":{\"need_marketing_consents_confirmation\":false,\"need_password_change\":false,\"need_terms_of_service_confirmation\":false},\"email_confirmation_state\":{\"need_confirmation\":false}}";

    Call mockCall = Mockito.mock(Call.class);

    UserApi api = mockApi(result, mockCall);

    GetUserInfoResponse response = api.getUserInfo();
    User user = response.getData();
    User expected =
        new User()
            .id(12345)
            .name("Mario Rossi")
            .firstName("Mario")
            .lastName("Rossi")
            .email("mario.rossi@example.com")
            .hash("5add29e1234532a1bf2ed7b612043029")
            .picture("picture.jpg");
    assertEquals(expected, user);
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * List User Companies
   *
   * <p>Lists the companies controlled by the current user.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void listUserCompaniesTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"companies\":[{\"id\":2,\"name\":\"Studio"
            + " Commercialista\",\"tax_code\":\"SLVMTT50A01F205L\",\"type\":\"accountant\",\"connection_id\":94816,\"controlled_companies\":[{\"id\":5,\"name\":\"Azienda"
            + " 1\",\"tax_code\":\"SLVMTT50A01F205L\",\"type\":\"company\",\"connection_id\":94817},{\"id\":16,\"name\":\"Azienda"
            + " 2\",\"tax_code\":\"\",\"type\":\"company\",\"connection_id\":95074}]},{\"id\":11,\"name\":\"Ino"
            + " S.p.A\",\"tax_code\":\"44444444444\",\"type\":\"company\",\"connection_id\":94882}]}}";

    Call mockCall = Mockito.mock(Call.class);
    UserApi api = mockApi(result, mockCall);

    ListUserCompaniesResponse response = api.listUserCompanies();
    ListUserCompaniesResponseData data = response.getData();
    assertNotNull(data);
    List<Company> companies = data.getCompanies();
    assertNotNull(companies);
    assertEquals(2, companies.size());

    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    ControlledCompany company5 =
        gson.fromJson(
            "{\"id\":5,\"name\":\"Azienda"
                + " 1\",\"tax_code\":\"SLVMTT50A01F205L\",\"type\":\"company\",\"connection_id\":94817}",
            ControlledCompany.class);

    ControlledCompany company16 =
        gson.fromJson(
            "{\"id\":16,\"name\":\"Azienda"
                + " 2\",\"tax_code\":\"\",\"type\":\"company\",\"connection_id\":95074}",
            ControlledCompany.class);

    ArrayList<ControlledCompany> controlledCompanies = new ArrayList<>();
    controlledCompanies.add(company5);
    controlledCompanies.add(company16);

    Company company2 =
        gson.fromJson(
                "{\"id\":2,\"name\":\"Studio"
                    + " Commercialista\",\"tax_code\":\"SLVMTT50A01F205L\",\"type\":\"accountant\",\"connection_id\":94816}",
                Company.class)
            .controlledCompanies(controlledCompanies);

    Company company11 =
        gson.fromJson(
            "{\"id\":11,\"name\":\"Ino"
                + " S.p.A\",\"tax_code\":\"44444444444\",\"type\":\"company\",\"connection_id\":94882}",
            Company.class);

    List<Company> expected = new ArrayList<>();
    expected.add(company2);
    expected.add(company11);

    assertEquals(expected, companies);
    Mockito.verify(mockCall, Mockito.only()).execute();
  }
}
