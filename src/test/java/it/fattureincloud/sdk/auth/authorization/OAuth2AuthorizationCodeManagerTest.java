package it.fattureincloud.sdk.auth.authorization;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.vavr.control.Either;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

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

/** Tests for OAuth2AuthorizationCodeManager */
public class OAuth2AuthorizationCodeManagerTest {
  private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

  private OAuth2AuthorizationCodeManager manager;
  private MockWebServer mockWebServer;

  @BeforeEach
  public void init() throws IOException {
    manager =
        new OAuth2AuthorizationCodeManager(
            "CLIENT_ID", "CLIENT_SECRET", "http://localhost:8080/redirect");
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
    assertEquals("CLIENT_ID", manager.getClientId());
    manager.setClientId("something");
    assertEquals("something", manager.getClientId());
  }

  /** Test the property 'clientSecret' */
  @Test
  public void clientSecretTest() {
    assertEquals("CLIENT_SECRET", manager.getClientSecret());
    manager.setClientSecret("something secret");
    assertEquals("something secret", manager.getClientSecret());
  }

  /** Test the property 'redirectUri' */
  @Test
  public void redirectUriTest() {
    assertEquals("http://localhost:8080/redirect", manager.getRedirectUri());
    manager.setRedirectUri("https://www.url.com/redirect");
    assertEquals("https://www.url.com/redirect", manager.getRedirectUri());
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

  /** Test the method 'getAuthorizationUrl' */
  @Test
  public void getAuthorizationUrlTest() {
    LinkedList<Scope> scopes = new LinkedList<>();
    scopes.add(Scope.ISSUED_DOCUMENTS_INVOICES_ALL);
    scopes.add(Scope.SETTINGS_READ);

    String exp =
        "https://api-v2.fattureincloud.it/oauth/authorize?scope=issued_documents.invoices%3Aa+settings%3Ar&response_type=code&redirect_uri=http%3A%2F%2Flocalhost%3A8080%2Fredirect&state=I_AM_HUNGRY&client_id=CLIENT_ID";
    assertEquals(exp, manager.getAuthorizationUrl(scopes, "I_AM_HUNGRY"));

    List<Scope> scopes2 =
        Arrays.asList(Scope.ARCHIVE_READ, Scope.CASHBOOK_ALL, Scope.SITUATION_READ);
    exp =
        "https://api-v2.fattureincloud.it/oauth/authorize?scope=archive%3Ar+cashbook%3Aa+situation%3Ar&response_type=code&redirect_uri=http%3A%2F%2Flocalhost%3A8080%2Fredirect&state=I_AM_HUNGRY&client_id=CLIENT_ID";
    assertEquals(exp, manager.getAuthorizationUrl(scopes2, "I_AM_HUNGRY"));

    exp =
        "https://api-v2.fattureincloud.it/oauth/authorize?scope=archive%3Ar+cashbook%3Aa+situation%3Ar&response_type=code&redirect_uri=http%3A%2F%2Flocalhost%3A8080%2Fredirect&state=I_AM_THIRSTY&client_id=CLIENT_ID";
    assertEquals(exp, manager.getAuthorizationUrl(scopes2, "I_AM_THIRSTY"));

    manager.setBaseUri("http://localhost:3000");
    exp =
        "http://localhost:3000/oauth/authorize?scope=archive%3Ar+cashbook%3Aa+situation%3Ar&response_type=code&redirect_uri=http%3A%2F%2Flocalhost%3A8080%2Fredirect&state=I_AM_THIRSTY&client_id=CLIENT_ID";
    assertEquals(exp, manager.getAuthorizationUrl(scopes2, "I_AM_THIRSTY"));

    manager.setBaseUri((String) null);
    exp =
        "https://api-v2.fattureincloud.it/oauth/authorize?scope=archive%3Ar+cashbook%3Aa+situation%3Ar&response_type=code&redirect_uri=http%3A%2F%2Flocalhost%3A8080%2Fredirect&state=I_AM_THIRSTY&client_id=CLIENT_ID";
    assertEquals(exp, manager.getAuthorizationUrl(scopes2, "I_AM_THIRSTY"));

    manager.setRedirectUri("https://www.fakeapp.com/redirect");
    exp =
        "https://api-v2.fattureincloud.it/oauth/authorize?scope=archive%3Ar+cashbook%3Aa+situation%3Ar&response_type=code&redirect_uri=https%3A%2F%2Fwww.fakeapp.com%2Fredirect&state=I_AM_THIRSTY&client_id=CLIENT_ID";
    assertEquals(exp, manager.getAuthorizationUrl(scopes2, "I_AM_THIRSTY"));

    manager.setClientId("AF");
    exp =
        "https://api-v2.fattureincloud.it/oauth/authorize?scope=archive%3Ar+cashbook%3Aa+situation%3Ar&response_type=code&redirect_uri=https%3A%2F%2Fwww.fakeapp.com%2Fredirect&state=IS+THE+BEST&client_id=AF";
    assertEquals(exp, manager.getAuthorizationUrl(scopes2, "IS THE BEST"));
  }

  /** Test the method 'getParamsFromUrl' */
  @Test
  public void getParamsFromUrlTest() throws Exception {
    OAuth2AuthorizationCodeParams params =
        manager.getParamsFromUrl(
            "https://www.yourapplication.com/redirect?state=I+AM+HUNGRY&code=c%2FFAKE_CODE");
    assertEquals(new OAuth2AuthorizationCodeParams("I AM HUNGRY", "c/FAKE_CODE"), params);
  }

  /** Test the method 'fetchToken' */
  @Test
  public void fetchTokenTest() throws Exception {
    final OkHttpClient okHttpClient = Mockito.mock(OkHttpClient.class);
    Call mockCall = Mockito.mock(Call.class);

    String jsonResponse =
        "{\"token_type\":\"bearer\",\"access_token\":\"a/THIS_IS_A_TOKEN\",\"refresh_token\":\"r/RINFRESCA_IL_TOKEN\",\"expires_in\":86400}";

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
        manager.fetchToken("c/GIMME_A_TOKEN");
    assert (res.isRight());
    OAuth2TokenResponse exp =
        new OAuth2TokenResponse(
            "bearer", "a/THIS_IS_A_TOKEN", "r/RINFRESCA_IL_TOKEN", 86400);
    assertEquals(exp, res.get());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /** Test the method 'fetchToken' - error case */
  @Test
  public void fetchTokenErrorTest() throws Exception {
    final OkHttpClient okHttpClient = Mockito.mock(OkHttpClient.class);
    Call mockCall = Mockito.mock(Call.class);

    String jsonResponse = "{\"error\":\"wtf\",\"error_description\":\"ma perché è gialla?\"}";

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
        manager.fetchToken("c/GIMME_GIMME_GIMME_A_TOKEN");
    assert (res.isLeft());
    OAuth2Error exp =
        new OAuth2Error("wtf", "ma perché è gialla?", 401);
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
                "{\"token_type\":\"bearer\",\"access_token\":\"a/THIS_IS_A_TOKEN\",\"refresh_token\":\"r/RINFRESCA_IL_TOKEN\",\"expires_in\":86400}")
            .addHeader("Content-Type", "application/json");

    mockWebServer.enqueue(mockedResponse);

    assertEquals(0, mockWebServer.getRequestCount());

    Either<OAuth2Error, OAuth2TokenResponse> res =
        manager.fetchToken("c/GIMME_A_TOKEN");
    assert (res.isRight());
    OAuth2TokenResponse exp =
        new OAuth2TokenResponse(
            "bearer", "a/THIS_IS_A_TOKEN", "r/RINFRESCA_IL_TOKEN", 86400);
    assertEquals(exp, res.get());
    assertEquals(1, mockWebServer.getRequestCount());

    RecordedRequest recordedRequest = mockWebServer.takeRequest();
    assertEquals("/oauth/token", recordedRequest.getPath());
    assertEquals("POST", recordedRequest.getMethod());
    assertEquals(
        "{\"code\":\"c/GIMME_A_TOKEN\",\"grant_type\":\"authorization_code\",\"client_secret\":\"CLIENT_SECRET\",\"redirect_uri\":\"http://localhost:8080/redirect\",\"client_id\":\"CLIENT_ID\"}",
        recordedRequest.getBody().readString(StandardCharsets.UTF_8));
    assertEquals("application/json; charset=utf-8", recordedRequest.getHeader("Content-Type"));
  }

  /** Test the method 'refreshToken' */
  @Test
  public void refreshTokenTest() throws Exception {
    final OkHttpClient okHttpClient = Mockito.mock(OkHttpClient.class);
    Call mockCall = Mockito.mock(Call.class);

    String jsonResponse =
        "{\"token_type\":\"bearer\",\"access_token\":\"a/THIS_IS_A_NEW_TOKEN\",\"refresh_token\":\"r/SO_FRESH\",\"expires_in\":86400}";

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
        manager.refreshToken("r/REFRESH_ME");
    assert (res.isRight());
    OAuth2TokenResponse exp =
        new OAuth2TokenResponse("bearer", "a/THIS_IS_A_NEW_TOKEN", "r/SO_FRESH", 86400);
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
                "{\"token_type\":\"bearer\",\"access_token\":\"a/THIS_IS_A_NEW_TOKEN\",\"refresh_token\":\"r/SO_FRESH\",\"expires_in\":86400}")
            .addHeader("Content-Type", "application/json");

    mockWebServer.enqueue(mockedResponse);

    assertEquals(0, mockWebServer.getRequestCount());

    Either<OAuth2Error, OAuth2TokenResponse> res =
        manager.refreshToken("r/REFRESH_ME");
    assert (res.isRight());
    OAuth2TokenResponse exp =
        new OAuth2TokenResponse("bearer", "a/THIS_IS_A_NEW_TOKEN", "r/SO_FRESH", 86400);
    assertEquals(exp, res.get());
    assertEquals(1, mockWebServer.getRequestCount());

    RecordedRequest recordedRequest = mockWebServer.takeRequest();
    assertEquals("/oauth/token", recordedRequest.getPath());
    assertEquals("POST", recordedRequest.getMethod());
    assertEquals(
        "{\"refresh_token\":\"r/REFRESH_ME\",\"grant_type\":\"refresh_token\",\"client_secret\":\"CLIENT_SECRET\",\"client_id\":\"CLIENT_ID\"}",
        recordedRequest.getBody().readString(StandardCharsets.UTF_8));
    assertEquals("application/json; charset=utf-8", recordedRequest.getHeader("Content-Type"));
  }
}
