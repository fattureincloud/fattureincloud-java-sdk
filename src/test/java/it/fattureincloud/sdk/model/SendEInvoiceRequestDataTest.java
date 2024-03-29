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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Model tests for SendEInvoiceRequestData */
public class SendEInvoiceRequestDataTest {
  private SendEInvoiceRequestData model;

  @BeforeEach
  public void init() {
    model = new SendEInvoiceRequestData().cassaType("cassa taip").withholdingTaxCausal("causal");
  }

  /** Model tests for SendEInvoiceRequestData */
  @Test
  public void testSendEInvoiceRequestData() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str = "{\"cassa_type\":\"cassa taip\",\"withholding_tax_causal\":\"causal\"}";
    assertEquals(str, json);
    SendEInvoiceRequestData generated = gson.fromJson(str, SendEInvoiceRequestData.class);
    assertEquals(model, generated);

    Object o = model;
    assertEquals(model, o);
    assertFalse(model.equals(null));
    assertFalse(model.equals(Integer.getInteger("5")));
  }

  /** Test the property 'cassaType' */
  @Test
  public void cassaTypeTest() {
    assertEquals("cassa taip", model.getCassaType());
    model.setCassaType("piat assac");
    assertEquals("piat assac", model.getCassaType());

    SendEInvoiceRequestData i = model.cassaType("cassa taip");
    SendEInvoiceRequestData expected =
        new SendEInvoiceRequestData().cassaType("cassa taip").withholdingTaxCausal("causal");

    assertEquals(expected, i);
  }

  /** Test the property 'withholdingTaxCausal' */
  @Test
  public void withholdingTaxCausalTest() {
    assertEquals("causal", model.getWithholdingTaxCausal());
    model.setWithholdingTaxCausal("causalV2");
    assertEquals("causalV2", model.getWithholdingTaxCausal());

    SendEInvoiceRequestData i = model.withholdingTaxCausal("causal");
    SendEInvoiceRequestData expected =
        new SendEInvoiceRequestData().cassaType("cassa taip").withholdingTaxCausal("causal");

    assertEquals(expected, i);
  }
}
