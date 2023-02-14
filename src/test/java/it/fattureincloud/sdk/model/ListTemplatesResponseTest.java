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

package it.fattureincloud.sdk.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import com.google.gson.Gson;
import it.fattureincloud.sdk.JSON;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Model tests for ListTemplatesResponse */
public class ListTemplatesResponseTest {
  private ListTemplatesResponse model;

  @BeforeEach
  public void init() {
    model =
        new ListTemplatesResponse()
            .addDataItem(new DocumentTemplate().id(12345).name("New Standard S1").type("Tipo 1"));
  }

  /** Model tests for ListTemplatesResponse */
  @Test
  public void testListTemplatesResponse() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str = "{\"data\":[{\"id\":12345,\"name\":\"New Standard S1\",\"type\":\"Tipo 1\"}]}";
    assertEquals(str, json);
    ListTemplatesResponse generated = gson.fromJson(str, ListTemplatesResponse.class);
    assertEquals(model, generated);

    Object o = model;
    assertEquals(model, o);
    assertFalse(model.equals(null));
    assertFalse(model.equals(Integer.getInteger("5")));
  }

  /** Test the property 'data' */
  @Test
  public void dataTest() {
    assertEquals(12345, model.getData().get(0).getId());
    model.setData(Arrays.asList(new DocumentTemplate().id(1)));
    assertEquals(1, model.getData().get(0).getId());

    model.data(Arrays.asList(new DocumentTemplate().id(2)));
    ListTemplatesResponse actual = new ListTemplatesResponse();
    actual.setData(Arrays.asList(new DocumentTemplate().id(2)));
    assertEquals(model, actual);
  }
}
