package it.fattureincloud.sdk.auth.device;

import com.google.gson.internal.LinkedTreeMap;
import io.vavr.control.Either;
import it.fattureincloud.sdk.auth.OAuth2Error;
import it.fattureincloud.sdk.auth.OAuth2TokenResponse;
import it.fattureincloud.sdk.auth.Scope;
import it.fattureincloud.sdk.auth.authorization.OAuth2AuthorizationCodeManager;
import it.fattureincloud.sdk.auth.authorization.OAuth2AuthorizationCodeParams;
import okhttp3.*;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** Tests for OAuth2DeviceCodeManager */
public class OAuth2DeviceCodeManagerTest {
  private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

  private OAuth2DeviceCodeManager manager;
  private MockWebServer mockWebServer;

  @BeforeEach
  public void init() throws IOException {
    manager =
        new OAuth2DeviceCodeManager("SALENTO");
    mockWebServer = new MockWebServer();
    mockWebServer.start();
  }

  @AfterEach
  public void tearDown() throws IOException {
    mockWebServer.shutdown();
  }

  /** Test the property 'clientId' */
  @Test
  public void clientIdTest() {
    assertEquals("SALENTO", manager.getClientId());
    manager.setClientId("TIERRA BOMBA");
    assertEquals("TIERRA BOMBA", manager.getClientId());
  }

  /** Test the property 'baseUri' */
  @Test
  public void baseUriTest() {
    assertEquals("https://api-v2.fattureincloud.it", manager.getBaseUri());
    manager.setBaseUri("https://www.mock.it");
    assertEquals("https://www.mock.it", manager.getBaseUri());
    manager.setBaseUri(Optional.of("https://www.google.com"));
    assertEquals("https://www.google.com", manager.getBaseUri());
    manager.setBaseUri(Optional.empty());
    assertEquals("https://api-v2.fattureincloud.it", manager.getBaseUri());
  }

  /** Test the method 'getDeviceCode' */
  @Test
  public void getDeviceCodeTest() throws Exception {
    final OkHttpClient okHttpClient = Mockito.mock(OkHttpClient.class);
    Call mockCall = Mockito.mock(Call.class);

    String jsonResponse =
            "{\"device_code\":\"d/MEDELLIN\",\"user_code\":\"CALI\",\"scope\":{\"situation\":\"r\",\"settings\":\"a\"},\"verification_uri\":\"https://fattureincloud.it/connetti\",\"interval\":5,\"expires_in\":300}";

    Response.Builder builder =
            new Response.Builder()
                    .request(new Request.Builder().url("https://api-v2.fattureincloud.it").build())
                    .protocol(Protocol.HTTP_1_1)
                    .code(200)
                    .message("");

    builder = builder.body(ResponseBody.create(jsonResponse, MediaType.parse("application/json")));

    final Response response = builder.build();

    Mockito.when(mockCall.execute()).thenReturn(response);
    Mockito.when(okHttpClient.newCall(Mockito.any())).thenReturn(mockCall);

    manager.setHttpClient(okHttpClient);

    Map<String, String> scopeMap = new HashMap<>();
    scopeMap.put("settings", "a");
    scopeMap.put("situation", "r");

    List<Scope> scopes =
            Arrays.asList(Scope.SETTINGS_ALL, Scope.SITUATION_READ);

    Either<OAuth2Error, OAuth2DeviceCodeResponse> res =
            manager.getDeviceCode(scopes);
    assert (res.isRight());
    OAuth2DeviceCodeResponse exp =
            new OAuth2DeviceCodeResponse(
                    "d/MEDELLIN", "CALI", scopeMap, "https://fattureincloud.it/connetti", 5, 300);

    OAuth2DeviceCodeResponse right = res.get();
    assertEquals(exp, right);
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /** Test the method 'fetchToken' */
  @Test
  public void fetchTokenTest() throws Exception {
    final OkHttpClient okHttpClient = Mockito.mock(OkHttpClient.class);
    Call mockCall = Mockito.mock(Call.class);

    String jsonResponse =
            "{\"token_type\":\"bearer\",\"access_token\":\"a/VILLAVICENCIO\",\"refresh_token\":\"r/PEREIRA\",\"expires_in\":86400}";

    Response.Builder builder =
            new Response.Builder()
                    .request(new Request.Builder().url("https://api-v2.fattureincloud.it").build())
                    .protocol(Protocol.HTTP_1_1)
                    .code(200)
                    .message("");

    builder = builder.body(ResponseBody.create(jsonResponse, MediaType.parse("application/json")));

    final Response response = builder.build();

    Mockito.when(mockCall.execute()).thenReturn(response);
    Mockito.when(okHttpClient.newCall(Mockito.any())).thenReturn(mockCall);

    manager.setHttpClient(okHttpClient);

    Either<OAuth2Error, OAuth2TokenResponse> res =
            manager.fetchToken("c/TEUSAQUILLO");
    assert (res.isRight());
    OAuth2TokenResponse exp =
            new OAuth2TokenResponse(
                    "bearer", "a/VILLAVICENCIO", "r/PEREIRA", 86400);
    assertEquals(exp, res.get());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /** Test the method 'fetchToken' - error case */
  @Test
  public void fetchTokenErrorTest() throws Exception {
    final OkHttpClient okHttpClient = Mockito.mock(OkHttpClient.class);
    Call mockCall = Mockito.mock(Call.class);

    String jsonResponse = "{\"error\":\"wtf\",\"error_description\":\"maracaibo no es en colombia\"}";

    Response.Builder builder =
        new Response.Builder()
            .request(new Request.Builder().url("https://api-v2.fattureincloud.it").build())
            .protocol(Protocol.HTTP_1_1)
            .code(401)
            .message("");

    builder = builder.body(ResponseBody.create(jsonResponse, MediaType.parse("application/json")));

    final Response response = builder.build();

    Mockito.when(mockCall.execute()).thenReturn(response);
    Mockito.when(okHttpClient.newCall(Mockito.any())).thenReturn(mockCall);

    manager.setHttpClient(okHttpClient);

    Either<OAuth2Error, OAuth2TokenResponse> res =
        manager.fetchToken("c/MARACAIBO");
    assert (res.isLeft());
    OAuth2Error exp =
        new OAuth2Error("wtf", "maracaibo no es en colombia", 401);
    assertEquals(exp, res.getLeft());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /** Test the method 'fetchToken' - mock server */
  @Test
  public void fetchTokenTestWithMockServer() throws Exception {
    String httpUrl = mockWebServer.url("").toString();
    httpUrl = httpUrl.substring(0, httpUrl.length() - 1);
    manager.setBaseUri(httpUrl);

    MockResponse mockedResponse =
        new MockResponse()
            .setBody(
                "{\"token_type\":\"bearer\",\"access_token\":\"a/BOGOTA\",\"refresh_token\":\"r/EJECAFETERO\",\"expires_in\":86400}")
            .addHeader("Content-Type", "application/json");

    mockWebServer.enqueue(mockedResponse);

    assertEquals(0, mockWebServer.getRequestCount());

    Either<OAuth2Error, OAuth2TokenResponse> res =
        manager.fetchToken("c/VILLADELEYVA");
    assert (res.isRight());
    OAuth2TokenResponse exp =
        new OAuth2TokenResponse(
            "bearer", "a/BOGOTA", "r/EJECAFETERO", 86400);
    assertEquals(exp, res.get());
    assertEquals(1, mockWebServer.getRequestCount());

    RecordedRequest recordedRequest = mockWebServer.takeRequest();
    assertEquals("/oauth/token", recordedRequest.getPath());
    assertEquals("POST", recordedRequest.getMethod());
    assertEquals(
        "{\"grant_type\":\"urn:ietf:params:oauth:grant-type:device_code\",\"device_code\":\"c/VILLADELEYVA\",\"client_id\":\"SALENTO\"}",
        recordedRequest.getBody().readString(StandardCharsets.UTF_8));
    assertEquals("application/json; charset=utf-8", recordedRequest.getHeader("Content-Type"));
  }

  /** Test the method 'refreshToken' */
  @Test
  public void refreshTokenTest() throws Exception {
    final OkHttpClient okHttpClient = Mockito.mock(OkHttpClient.class);
    Call mockCall = Mockito.mock(Call.class);

    String jsonResponse =
        "{\"token_type\":\"bearer\",\"access_token\":\"a/BOGOTA\",\"refresh_token\":\"r/EJECAFETERO\",\"expires_in\":86400}";

    Response.Builder builder =
        new Response.Builder()
            .request(new Request.Builder().url("https://api-v2.fattureincloud.it").build())
            .protocol(Protocol.HTTP_1_1)
            .code(200)
            .message("");

    builder = builder.body(ResponseBody.create(jsonResponse, MediaType.parse("application/json")));

    final Response response = builder.build();

    Mockito.when(mockCall.execute()).thenReturn(response);
    Mockito.when(okHttpClient.newCall(Mockito.any())).thenReturn(mockCall);

    manager.setHttpClient(okHttpClient);

    Either<OAuth2Error, OAuth2TokenResponse> res =
        manager.refreshToken("r/VILLADELEYVA");
    assert (res.isRight());
    OAuth2TokenResponse exp =
        new OAuth2TokenResponse("bearer", "a/BOGOTA", "r/EJECAFETERO", 86400);
    assertEquals(exp, res.get());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /** Test the method 'refreshToken' - error case */
  @Test
  public void refreshTokenErrorTest() throws Exception {
    final OkHttpClient okHttpClient = Mockito.mock(OkHttpClient.class);
    Call mockCall = Mockito.mock(Call.class);

    String jsonResponse = "{\"error\":\"so_hot\",\"error_description\":\"I_AM_MELTING\"}";

    Response.Builder builder =
        new Response.Builder()
            .request(new Request.Builder().url("https://api-v2.fattureincloud.it").build())
            .protocol(Protocol.HTTP_1_1)
            .code(418)
            .message("");

    builder = builder.body(ResponseBody.create(jsonResponse, MediaType.parse("application/json")));

    final Response response = builder.build();

    Mockito.when(mockCall.execute()).thenReturn(response);
    Mockito.when(okHttpClient.newCall(Mockito.any())).thenReturn(mockCall);

    manager.setHttpClient(okHttpClient);

    Either<OAuth2Error, OAuth2TokenResponse> res =
        manager.refreshToken("r/WHY_IS_IT_SO_HOT_IN_HERE");
    assert (res.isLeft());
    OAuth2Error exp =
        new OAuth2Error("so_hot", "I_AM_MELTING", 418);
    assertEquals(exp, res.getLeft());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /** Test the method 'refreshToken' - mock server */
  @Test
  public void refreshTokenTestWithMockServer() throws Exception {
    String httpUrl = mockWebServer.url("").toString();
    httpUrl = httpUrl.substring(0, httpUrl.length() - 1);
    manager.setBaseUri(httpUrl);

    MockResponse mockedResponse =
        new MockResponse()
            .setBody(
                "{\"token_type\":\"bearer\",\"access_token\":\"a/BOGOTA\",\"refresh_token\":\"r/EJECAFETERO\",\"expires_in\":86400}")
            .addHeader("Content-Type", "application/json");

    mockWebServer.enqueue(mockedResponse);

    assertEquals(0, mockWebServer.getRequestCount());

    Either<OAuth2Error, OAuth2TokenResponse> res =
        manager.refreshToken("r/VILLAVICENCIO");
    assert (res.isRight());
    OAuth2TokenResponse exp =
        new OAuth2TokenResponse("bearer", "a/BOGOTA", "r/EJECAFETERO", 86400);
    assertEquals(exp, res.get());
    assertEquals(1, mockWebServer.getRequestCount());

    RecordedRequest recordedRequest = mockWebServer.takeRequest();
    assertEquals("/oauth/token", recordedRequest.getPath());
    assertEquals("POST", recordedRequest.getMethod());
    assertEquals(
        "{\"refresh_token\":\"r/VILLAVICENCIO\",\"grant_type\":\"refresh_token\",\"client_id\":\"SALENTO\"}",
        recordedRequest.getBody().readString(StandardCharsets.UTF_8));
    assertEquals("application/json; charset=utf-8", recordedRequest.getHeader("Content-Type"));
  }
}
