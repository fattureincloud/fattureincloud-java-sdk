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

import static org.junit.jupiter.api.Assertions.*;

import com.google.gson.Gson;
import it.fattureincloud.sdk.JSON;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Model tests for F24 */
public class F24Test {
  private F24 model;

  @BeforeEach
  public void init() {
    model = new F24();
  }

  /** Model tests for F24 */
  @Test
  public void testF24() {
    F24 f =
        new F24()
            .id(12345)
            .amount(BigDecimal.valueOf(840.36))
            .description("PAGAMENTO IVA 2021")
            .dueDate(LocalDate.parse("2021-12-31"))
            .status(F24Status.PAID)
            .paymentAccount(new PaymentAccount().id(111).name("Indesa - Carta conto"))
            .attachmentToken("Adfqregwthwrt6whrtghsrgbsdthyeruerur6u6676e5879");

    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(f);
    String str =
        "{\"id\":12345,\"due_date\":\"2021-12-31\",\"status\":\"paid\",\"payment_account\":{\"id\":111,\"name\":\"Indesa"
            + " - Carta"
            + " conto\",\"type\":\"standard\"},\"amount\":840.36,\"attachment_token\":\"Adfqregwthwrt6whrtghsrgbsdthyeruerur6u6676e5879\",\"description\":\"PAGAMENTO"
            + " IVA 2021\"}";
    assertEquals(str, json);
    F24 generated = gson.fromJson(str, F24.class);
    assertEquals(f, generated);

    Object o = model;
    assertEquals(model, o);
    assertFalse(model.equals(null));
    assertFalse(model.equals(Integer.getInteger("5")));
  }

  /** Test the property 'id' */
  @Test
  public void idTest() {
    assertNull(model.getId());
    model.setId(12345);
    assertEquals(12345, model.getId());

    F24 f = model.id(67890);
    F24 expected = new F24();
    expected.setId(67890);
    assertEquals(expected, f);
  }

  /** Test the property 'dueDate' */
  @Test
  public void dueDateTest() {
    assertNull(model.getDueDate());
    model.setDueDate(LocalDate.parse("2021-12-31"));
    assertEquals(LocalDate.parse("2021-12-31"), model.getDueDate());

    F24 f = model.dueDate(LocalDate.parse("2022-03-24"));
    F24 expected = new F24();
    expected.setDueDate(LocalDate.parse("2022-03-24"));
    assertEquals(expected, f);
  }

  /** Test the property 'status' */
  @Test
  public void statusTest() {
    assertNull(model.getStatus());
    model.setStatus(F24Status.PAID);
    assertEquals(F24Status.PAID, model.getStatus());

    F24 f = model.status(F24Status.REVERSED);
    F24 expected = new F24();
    expected.setStatus(F24Status.REVERSED);
    assertEquals(expected, f);
  }

  /** Test the property 'paymentAccount' */
  @Test
  public void paymentAccountTest() {
    PaymentAccount pa1 = new PaymentAccount().id(1);

    PaymentAccount pa2 = new PaymentAccount().id(2);

    assertNull(model.getPaymentAccount());
    model.setPaymentAccount(pa1);
    assertEquals(pa1, model.getPaymentAccount());

    F24 f = model.paymentAccount(pa2);
    F24 expected = new F24();
    expected.setPaymentAccount(pa2);
    assertEquals(expected, f);
  }

  /** Test the property 'amount' */
  @Test
  public void amountTest() {
    assertNull(model.getAmount());
    model.setAmount(BigDecimal.valueOf(840.36));
    assertEquals(BigDecimal.valueOf(840.36), model.getAmount());

    F24 f = model.amount(BigDecimal.valueOf(69.40));
    F24 expected = new F24();
    expected.setAmount(BigDecimal.valueOf(69.40));
    assertEquals(expected, f);
  }

  /** Test the property 'attachmentUrl' */
  @Test
  public void attachmentUrlTest() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String str = "{\"attachment_url\":\"b9ae77ad0606eff0d58fadbbd693796b.pdf\"}";
    F24 generated = gson.fromJson(str, F24.class);
    assertEquals("b9ae77ad0606eff0d58fadbbd693796b.pdf", generated.getAttachmentUrl());
  }

  /** Test the property 'attachmentToken' */
  @Test
  public void attachmentTokenTest() {
    assertNull(model.getAttachmentToken());
    model.setAttachmentToken("bafe024b8e44a1336c78c5f65fe799bd");
    assertEquals("bafe024b8e44a1336c78c5f65fe799bd", model.getAttachmentToken());

    F24 f = model.attachmentToken("b6f16a8c0cb0ca6b8026e68df65267e2");
    F24 expected = new F24();
    expected.setAttachmentToken("b6f16a8c0cb0ca6b8026e68df65267e2");
    assertEquals(expected, f);
  }

  /** Test the property 'description' */
  @Test
  public void descriptionTest() {
    assertNull(model.getDescription());
    model.setDescription("PAGAMENTO IVA 2021");
    assertEquals("PAGAMENTO IVA 2021", model.getDescription());

    F24 f = model.description("PAGAMENTO IVA 2022");
    F24 expected = new F24();
    expected.setDescription("PAGAMENTO IVA 2022");
    assertEquals(expected, f);
  }
}
