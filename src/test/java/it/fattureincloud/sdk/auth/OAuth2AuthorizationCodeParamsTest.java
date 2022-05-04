package it.fattureincloud.sdk.auth;

import com.google.gson.Gson;
import it.fattureincloud.sdk.JSON;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Tests for OAuth2AuthorizationCodeParams
 */
public class OAuth2AuthorizationCodeParamsTest {

    private OAuth2AuthorizationCodeParams params;

    @BeforeEach
    public void init() {
        params = new OAuth2AuthorizationCodeParams("I_HAVE_COVID", "c/STAY_AWAY_FROM_ME");
    }

    /**
     * Model tests for OAuth2AuthorizationCodeParams
     */
    @Test
    public void testOAuth2AuthorizationCodeParams() {
        OAuth2AuthorizationCodeParams params = new OAuth2AuthorizationCodeParams("I_HAVE_COVID", "c/STAY_AWAY_FROM_ME");

        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(params);
        String str = "{\"state\":\"I_HAVE_COVID\",\"code\":\"c/STAY_AWAY_FROM_ME\"}";
        assertEquals(str, json);
        OAuth2AuthorizationCodeParams generated = gson.fromJson(str, OAuth2AuthorizationCodeParams.class);
        assertEquals(params, generated);

        Object o = params;
        assertEquals(params, o);
        assertFalse(params.equals(null));
        assertFalse(params.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        assertEquals("I_HAVE_COVID", params.getState());
        params.setState("I_HAVE_A_MILD_CASE_OF_DEATH");
        assertEquals("I_HAVE_A_MILD_CASE_OF_DEATH", params.getState());
    }

    /**
     * Test the property 'code'
     */
    @Test
    public void codeTest() {
        assertEquals("c/STAY_AWAY_FROM_ME", params.getAuthorizationCode());
        params.setAuthorizationCode("c/I_DO_NOT_LIKE_PHP");
        assertEquals("c/I_DO_NOT_LIKE_PHP", params.getAuthorizationCode());
    }

}
