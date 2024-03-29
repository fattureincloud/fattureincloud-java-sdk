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

/** Model tests for PaymentAccount */
public class PaymentAccountTest {
  private PaymentAccount model;

  @BeforeEach
  public void init() {
    model =
        new PaymentAccount()
            .id(21)
            .name("Indesa - Carta conto")
            .type(PaymentAccountType.STANDARD)
            .iban("IT84Y0300203280294126225888")
            .sia("sai")
            .cuc("cuc")
            .virtual(false);
  }

  /** Model tests for PaymentAccount */
  @Test
  public void testPaymentAccount() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"id\":21,\"name\":\"Indesa - Carta"
            + " conto\",\"type\":\"standard\",\"iban\":\"IT84Y0300203280294126225888\",\"sia\":\"sai\",\"cuc\":\"cuc\",\"virtual\":false}";
    assertEquals(str, json);
    PaymentAccount generated = gson.fromJson(str, PaymentAccount.class);
    assertEquals(model, generated);

    Object o = model;
    assertEquals(model, o);
    assertFalse(model.equals(null));
    assertFalse(model.equals(Integer.getInteger("5")));
  }

  /** Test the property 'id' */
  @Test
  public void idTest() {
    assertEquals(21, model.getId());
    model.setId(22);
    assertEquals(22, model.getId());

    PaymentAccount p = model.id(23);
    PaymentAccount expected =
        new PaymentAccount()
            .id(23)
            .name("Indesa - Carta conto")
            .type(PaymentAccountType.STANDARD)
            .iban("IT84Y0300203280294126225888")
            .sia("sai")
            .cuc("cuc")
            .virtual(false);
    assertEquals(expected, p);
  }

  /** Test the property 'name' */
  @Test
  public void nameTest() {
    assertEquals("Indesa - Carta conto", model.getName());
    model.setName("UniPirl - Carta conto");
    assertEquals("UniPirl - Carta conto", model.getName());

    PaymentAccount p = model.name("Monte dei Pascoli di Pradalunga - Carta conto");
    PaymentAccount expected =
        new PaymentAccount()
            .id(21)
            .name("Monte dei Pascoli di Pradalunga - Carta conto")
            .type(PaymentAccountType.STANDARD)
            .iban("IT84Y0300203280294126225888")
            .sia("sai")
            .cuc("cuc")
            .virtual(false);
    assertEquals(expected, p);
  }

  /** Test the property 'type' */
  @Test
  public void typeTest() {
    assertEquals(PaymentAccountType.STANDARD, model.getType());
    model.setType(PaymentAccountType.BANK);
    assertEquals(PaymentAccountType.BANK, model.getType());

    PaymentAccount p = model.type(PaymentAccountType.STANDARD);
    PaymentAccount expected =
        new PaymentAccount()
            .id(21)
            .name("Indesa - Carta conto")
            .type(PaymentAccountType.STANDARD)
            .iban("IT84Y0300203280294126225888")
            .sia("sai")
            .cuc("cuc")
            .virtual(false);
    assertEquals(expected, p);
  }

  /** Test the property 'iban' */
  @Test
  public void ibanTest() {
    assertEquals("IT84Y0300203280294126225888", model.getIban());
    model.setIban("IT35H0300203280879181335315");
    assertEquals("IT35H0300203280879181335315", model.getIban());

    PaymentAccount p = model.iban("IT90U0300203280637837127897");
    PaymentAccount expected =
        new PaymentAccount()
            .id(21)
            .name("Indesa - Carta conto")
            .type(PaymentAccountType.STANDARD)
            .iban("IT90U0300203280637837127897")
            .sia("sai")
            .cuc("cuc")
            .virtual(false);
    assertEquals(expected, p);
  }

  /** Test the property 'sia' */
  @Test
  public void siaTest() {
    assertEquals("sai", model.getSia());
    model.setSia("no non lo so");
    assertEquals("no non lo so", model.getSia());

    PaymentAccount p = model.sia("chandelier");
    PaymentAccount expected =
        new PaymentAccount()
            .id(21)
            .name("Indesa - Carta conto")
            .type(PaymentAccountType.STANDARD)
            .iban("IT84Y0300203280294126225888")
            .sia("chandelier")
            .cuc("cuc")
            .virtual(false);
    assertEquals(expected, p);
  }

  /** Test the property 'cuc' */
  @Test
  public void cucTest() {
    assertEquals("cuc", model.getCuc());
    model.setCuc("cucco");
    assertEquals("cucco", model.getCuc());

    PaymentAccount p = model.cuc("cucchiaio");
    PaymentAccount expected =
        new PaymentAccount()
            .id(21)
            .name("Indesa - Carta conto")
            .type(PaymentAccountType.STANDARD)
            .iban("IT84Y0300203280294126225888")
            .sia("sai")
            .cuc("cucchiaio")
            .virtual(false);
    assertEquals(expected, p);
  }

  /** Test the property 'virtual' */
  @Test
  public void virtualTest() {
    assertEquals(false, model.getVirtual());
    model.setVirtual(true);
    assertEquals(true, model.getVirtual());

    PaymentAccount p = model.virtual(false);
    PaymentAccount expected =
        new PaymentAccount()
            .id(21)
            .name("Indesa - Carta conto")
            .type(PaymentAccountType.STANDARD)
            .iban("IT84Y0300203280294126225888")
            .sia("sai")
            .cuc("cuc")
            .virtual(false);
    assertEquals(expected, p);
  }
}
