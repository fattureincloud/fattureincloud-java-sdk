package it.fattureincloud.sdk.auth;

import com.google.gson.Gson;
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.JSON;
import it.fattureincloud.sdk.api.ArchiveApi;
import it.fattureincloud.sdk.model.*;
import okhttp3.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Tests for OAuth2AuthorizationCodeResponse
 */
public class OAuth2AuthorizationCodeResponseTest {

    private OAuth2AuthorizationCodeResponse response;

    @BeforeEach
    public void init() {
        response = new OAuth2AuthorizationCodeResponse("bearer", "a/ACCESS_TOKEN", "r/REFRESH_TOKEN", 86400);
    }

    /**
     * Model tests for OAuth2AuthorizationCodeResponse
     */
    @Test
    public void testOAuth2AuthorizationCodeResponse() {
        OAuth2AuthorizationCodeResponse response = new OAuth2AuthorizationCodeResponse("bearer", "a/ACCESS_TOKEN", "r/REFRESH_TOKEN", 86400);

        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(response);
        String str = "{\"token_type\":\"bearer\",\"access_token\":\"a/ACCESS_TOKEN\",\"refresh_token\":\"r/REFRESH_TOKEN\",\"expires_in\":86400}";
        assertEquals(str, json);
        OAuth2AuthorizationCodeResponse generated = gson.fromJson(str, OAuth2AuthorizationCodeResponse.class);
        assertEquals(response, generated);

        Object o = response;
        assertEquals(response, o);
        assertFalse(response.equals(null));
        assertFalse(response.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'tokenType'
     */
    @Test
    public void tokenTypeTest() {
        assertEquals("bearer", response.getTokenType());
        response.setTokenType("something");
        assertEquals("something", response.getTokenType());
    }

    /**
     * Test the property 'accessToken'
     */
    @Test
    public void accessTokenTest() {
        assertEquals("a/ACCESS_TOKEN", response.getAccessToken());
        response.setAccessToken("a/ANOTHER_TOKEN");
        assertEquals("a/ANOTHER_TOKEN", response.getAccessToken());
    }

    /**
     * Test the property 'refreshToken'
     */
    @Test
    public void refreshTokenTest() {
        assertEquals("r/REFRESH_TOKEN", response.getRefreshToken());
        response.setRefreshToken("r/ANOTHER_REFRESH_TOKEN");
        assertEquals("r/ANOTHER_REFRESH_TOKEN", response.getRefreshToken());
    }

    /**
     * Test the property 'expiresIn'
     */
    @Test
    public void expiresInTest() {
        assertEquals(86400, response.getExpiresIn());
        response.setExpiresIn(69);
        assertEquals(69, response.getExpiresIn());
    }

}
