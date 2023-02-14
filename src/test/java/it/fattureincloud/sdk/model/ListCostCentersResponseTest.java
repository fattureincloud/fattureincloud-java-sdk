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

/** Model tests for ListCostCentersResponse */
public class ListCostCentersResponseTest {
  private ListCostCentersResponse model;

  @BeforeEach
  public void init() {
    model = new ListCostCentersResponse().addDataItem("bg");
  }

  /** Model tests for ListCostCentersResponse */
  @Test
  public void testListCostCentersResponse() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str = "{\"data\":[\"bg\"]}";
    assertEquals(str, json);
    ListCostCentersResponse generated = gson.fromJson(str, ListCostCentersResponse.class);
    assertEquals(model, generated);

    Object o = model;
    assertEquals(model, o);
    assertFalse(model.equals(null));
    assertFalse(model.equals(Integer.getInteger("5")));
  }

  /** Test the property 'data' */
  @Test
  public void dataTest() {
    assertEquals("bg", model.getData().get(0));
    model.setData(Arrays.asList("mi"));
    assertEquals("mi", model.getData().get(0));

    model.data(Arrays.asList("bg"));
    ListCostCentersResponse actual = new ListCostCentersResponse();
    actual.setData(Arrays.asList("bg"));
    assertEquals(model, actual);
  }
}
