package it.fattureincloud.sdk.auth.device;

import com.google.gson.Gson;
import it.fattureincloud.sdk.JSON;
import it.fattureincloud.sdk.auth.authorization.OAuth2AuthorizationCodeParams;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/** Tests for OAuth2DeviceCodeResponse */
public class OAuth2DeviceCodeResponseTest {

  private OAuth2DeviceCodeResponse res;

  @BeforeEach
  public void init() {
    HashMap<String, String> scope = new HashMap<>();
    scope.put("situation", "r");
    scope.put("settings", "a");
    res = new OAuth2DeviceCodeResponse("d/CARTAGENA", "BOGOTA", scope, "https://fic.api.it", 5,300);
  }

  /** Model tests for OAuth2DeviceCodeResponse */
  @Test
  public void testOAuth2DeviceCodeResponse() {
    HashMap<String, String> scope = new HashMap<>();
    scope.put("situation", "r");
    scope.put("settings", "a");

    OAuth2DeviceCodeResponse res =
        new OAuth2DeviceCodeResponse("d/CARTAGENA", "BOGOTA", scope, "https://fic.api.it", 5,300);

    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(res);
    String str = "{\"device_code\":\"d/CARTAGENA\",\"user_code\":\"BOGOTA\",\"scope\":{\"settings\":\"a\",\"situation\":\"r\"},\"verification_uri\":\"https://fic.api.it\",\"interval\":5,\"expires_in\":300}";
    assertEquals(str, json);
    OAuth2DeviceCodeResponse generated =
        gson.fromJson(str, OAuth2DeviceCodeResponse.class);
    assertEquals(res, generated);

    Object o = res;
    assertEquals(res, o);
    assertFalse(res.equals(null));
    assertFalse(res.equals(Integer.getInteger("5")));
  }

  /** Test the property 'deviceCode' */
  @Test
  public void deviceCodeTest() {
    assertEquals("d/CARTAGENA", res.getDeviceCode());
    res.setDeviceCode("d/EJECAFETERO");
    assertEquals("d/EJECAFETERO", res.getDeviceCode());
  }

  /** Test the property 'userCode' */
  @Test
  public void userCodeTest() {
    assertEquals("BOGOTA", res.getUserCode());
    res.setUserCode("VILLADELEYVA");
    assertEquals("VILLADELEYVA", res.getUserCode());
  }

  /** Test the property 'scope' */
  @Test
  public void scopeTest() {
    HashMap<String, String> scope = new HashMap<>();
    scope.put("settings", "a");
    scope.put("situation", "r");
    assertEquals(scope, res.getScope());

    HashMap<String, String> scope2 = new HashMap<>();
    scope.put("stock", "a");
    scope.put("issued_documents.credit_notes", "a");
    scope.put("taxes", "r");
    res.setScope(scope2);
    assertEquals(scope2, res.getScope());
  }

  /** Test the property 'verificationUri' */
  @Test
  public void verificationUriTest() {
    assertEquals("https://fic.api.it", res.getVerificationUri());
    res.setVerificationUri("https://colombia.turism.co");
    assertEquals("https://colombia.turism.co", res.getVerificationUri());
  }

  /** Test the property 'interval' */
  @Test
  public void intervalTest() {
    assertEquals(5, res.getInterval());
    res.setInterval(22);
    assertEquals(22, res.getInterval());
  }

  /** Test the property 'expiresIn' */
  @Test
  public void expiresInTest() {
    assertEquals(300, res.getExpiresIn());
    res.setExpiresIn(99);
    assertEquals(99, res.getExpiresIn());
  }
}
