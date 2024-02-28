package it.fattureincloud.sdk.auth;

import static org.junit.jupiter.api.Assertions.*;

import com.google.gson.Gson;
import it.fattureincloud.sdk.JSON;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Tests for OAuth2AuthorizationCodeResponse */
public class OAuth2TokenResponseTest {

  private OAuth2TokenResponse response;

  @BeforeEach
  public void init() {
    response =
        new OAuth2TokenResponse("bearer", "a/ACCESS_TOKEN", "r/REFRESH_TOKEN", 86400);
  }

  /** Model tests for OAuth2AuthorizationCodeResponse */
  @Test
  public void testOAuth2AuthorizationCodeResponse() {
    OAuth2TokenResponse response =
        new OAuth2TokenResponse("bearer", "a/ACCESS_TOKEN", "r/REFRESH_TOKEN", 86400);

    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(response);
    String str =
        "{\"token_type\":\"bearer\",\"access_token\":\"a/ACCESS_TOKEN\",\"refresh_token\":\"r/REFRESH_TOKEN\",\"expires_in\":86400}";
    assertEquals(str, json);
    OAuth2TokenResponse generated =
        gson.fromJson(str, OAuth2TokenResponse.class);
    assertEquals(response, generated);

    Object o = response;
    assertEquals(response, o);
    assertFalse(response.equals(null));
    assertFalse(response.equals(Integer.getInteger("5")));
  }

  /** Test the property 'tokenType' */
  @Test
  public void tokenTypeTest() {
    assertEquals("bearer", response.getTokenType());
    response.setTokenType("something");
    assertEquals("something", response.getTokenType());
  }

  /** Test the property 'accessToken' */
  @Test
  public void accessTokenTest() {
    assertEquals("a/ACCESS_TOKEN", response.getAccessToken());
    response.setAccessToken("a/ANOTHER_TOKEN");
    assertEquals("a/ANOTHER_TOKEN", response.getAccessToken());
  }

  /** Test the property 'refreshToken' */
  @Test
  public void refreshTokenTest() {
    assertEquals("r/REFRESH_TOKEN", response.getRefreshToken());
    response.setRefreshToken("r/ANOTHER_REFRESH_TOKEN");
    assertEquals("r/ANOTHER_REFRESH_TOKEN", response.getRefreshToken());
  }

  /** Test the property 'expiresIn' */
  @Test
  public void expiresInTest() {
    assertEquals(86400, response.getExpiresIn());
    response.setExpiresIn(69);
    assertEquals(69, response.getExpiresIn());
  }
}
