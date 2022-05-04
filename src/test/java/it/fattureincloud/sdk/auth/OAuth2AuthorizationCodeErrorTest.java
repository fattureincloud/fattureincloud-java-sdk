package it.fattureincloud.sdk.auth;

import com.google.gson.Gson;
import it.fattureincloud.sdk.JSON;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Tests for OAuth2AuthorizationCodeError
 */
public class OAuth2AuthorizationCodeErrorTest {

    private OAuth2AuthorizationCodeError err;

    @BeforeEach
    public void init() {
        err = new OAuth2AuthorizationCodeError("I am a teapot", "I am a teapot", 418);
    }

    /**
     * Model tests for OAuth2AuthorizationCodeError
     */
    @Test
    public void testOAuth2AuthorizationCodeError() {
        OAuth2AuthorizationCodeError err = new OAuth2AuthorizationCodeError("something_bad_happened", "it is you, not me", 401);

        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(err);
        String str = "{\"error\":\"something_bad_happened\",\"error_description\":\"it is you, not me\",\"code\":401}";
        assertEquals(str, json);
        OAuth2AuthorizationCodeError generated = gson.fromJson(str, OAuth2AuthorizationCodeError.class);
        assertEquals(err, generated);

        OAuth2AuthorizationCodeError err2 = new OAuth2AuthorizationCodeError("something_bad_happened", "it is you, not me", null);
        String str2 = "{\"error\":\"something_bad_happened\",\"error_description\":\"it is you, not me\"}";
        OAuth2AuthorizationCodeError generated2 = gson.fromJson(str2, OAuth2AuthorizationCodeError.class);
        assertEquals(err2, generated2);

        Object o = err;
        assertEquals(err, o);
        assertFalse(err.equals(null));
        assertFalse(err.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'error'
     */
    @Test
    public void errorTest() {
        assertEquals("I am a teapot", err.getError());
        err.setError("kaboom");
        assertEquals("kaboom", err.getError());
    }

    /**
     * Test the property 'errorDescription'
     */
    @Test
    public void errorDescriptionTest() {
        assertEquals("I am a teapot", err.getErrorDescription());
        err.setErrorDescription("kaboom");
        assertEquals("kaboom", err.getErrorDescription());
    }

    /**
     * Test the property 'code'
     */
    @Test
    public void codeTest() {
        assertEquals(418, err.getCode());
        err.setCode(402);
        assertEquals(402, err.getCode());
    }

}
