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
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Model tests for ReceivedDocumentPaymentsListItem */
public class ReceivedDocumentPaymentsListItemTest {
  private ReceivedDocumentPaymentsListItem model;

  @BeforeEach
  public void init() {
    model =
        new ReceivedDocumentPaymentsListItem()
            .id(1)
            .amount(BigDecimal.valueOf(10))
            .dueDate(LocalDate.of(2021, 12, 25))
            .paidDate(LocalDate.of(2021, 12, 25))
            .paymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms().days(10))
            .status("oks")
            .paymentAccount(new PaymentAccount().id(1));
  }

  /** Model tests for ReceivedDocumentPaymentsListItem */
  @Test
  public void testReceivedDocumentPaymentsListItem() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"id\":1,\"amount\":10,\"due_date\":\"2021-12-25\",\"paid_date\":\"2021-12-25\",\"payment_terms\":{\"days\":10,\"type\":\"standard\"},\"status\":\"oks\",\"payment_account\":{\"id\":1,\"type\":\"standard\"}}";
    assertEquals(str, json);
    ReceivedDocumentPaymentsListItem generated =
        gson.fromJson(str, ReceivedDocumentPaymentsListItem.class);
    assertEquals(model, generated);

    Object o = model;
    assertEquals(model, o);
    assertFalse(model.equals(null));
    assertFalse(model.equals(Integer.getInteger("5")));
  }

  /** Test the property 'id' */
  @Test
  public void idTest() {
    assertEquals(1, model.getId());
    model.setId(2);
    assertEquals(2, model.getId());

    ReceivedDocumentPaymentsListItem i = model.id(1);
    ReceivedDocumentPaymentsListItem expected =
        new ReceivedDocumentPaymentsListItem()
            .id(1)
            .amount(BigDecimal.valueOf(10))
            .dueDate(LocalDate.of(2021, 12, 25))
            .paidDate(LocalDate.of(2021, 12, 25))
            .paymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms().days(10))
            .status("oks")
            .paymentAccount(new PaymentAccount().id(1));
    assertEquals(expected, i);
  }

  /** Test the property 'amount' */
  @Test
  public void amountTest() {
    assertEquals(BigDecimal.valueOf(10), model.getAmount());
    model.setAmount(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getAmount());

    ReceivedDocumentPaymentsListItem i = model.amount(BigDecimal.valueOf(10));
    ReceivedDocumentPaymentsListItem expected =
        new ReceivedDocumentPaymentsListItem()
            .id(1)
            .amount(BigDecimal.valueOf(10))
            .dueDate(LocalDate.of(2021, 12, 25))
            .paidDate(LocalDate.of(2021, 12, 25))
            .paymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms().days(10))
            .status("oks")
            .paymentAccount(new PaymentAccount().id(1));
    assertEquals(expected, i);
  }

  /** Test the property 'dueDate' */
  @Test
  public void dueDateTest() {
    assertEquals(LocalDate.of(2021, 12, 25), model.getDueDate());
    model.setDueDate(LocalDate.of(2021, 12, 26));
    assertEquals(LocalDate.of(2021, 12, 26), model.getDueDate());

    ReceivedDocumentPaymentsListItem i = model.dueDate(LocalDate.of(2021, 12, 25));
    ReceivedDocumentPaymentsListItem expected =
        new ReceivedDocumentPaymentsListItem()
            .id(1)
            .amount(BigDecimal.valueOf(10))
            .dueDate(LocalDate.of(2021, 12, 25))
            .paidDate(LocalDate.of(2021, 12, 25))
            .paymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms().days(10))
            .status("oks")
            .paymentAccount(new PaymentAccount().id(1));
    assertEquals(expected, i);
  }

  /** Test the property 'paidDate' */
  @Test
  public void paidDateTest() {
    assertEquals(LocalDate.of(2021, 12, 25), model.getPaidDate());
    model.setPaidDate(LocalDate.of(2021, 12, 26));
    assertEquals(LocalDate.of(2021, 12, 26), model.getPaidDate());

    ReceivedDocumentPaymentsListItem i = model.paidDate(LocalDate.of(2021, 12, 25));
    ReceivedDocumentPaymentsListItem expected =
        new ReceivedDocumentPaymentsListItem()
            .id(1)
            .amount(BigDecimal.valueOf(10))
            .dueDate(LocalDate.of(2021, 12, 25))
            .paidDate(LocalDate.of(2021, 12, 25))
            .paymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms().days(10))
            .status("oks")
            .paymentAccount(new PaymentAccount().id(1));
    assertEquals(expected, i);
  }

  /** Test the property 'paymentTerms' */
  @Test
  public void paymentTermsTest() {
    assertEquals(
        new ReceivedDocumentPaymentsListItemPaymentTerms().days(10), model.getPaymentTerms());
    model.setPaymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms().days(11));
    assertEquals(
        new ReceivedDocumentPaymentsListItemPaymentTerms().days(11), model.getPaymentTerms());

    ReceivedDocumentPaymentsListItem i =
        model.paymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms().days(10));
    ReceivedDocumentPaymentsListItem expected =
        new ReceivedDocumentPaymentsListItem()
            .id(1)
            .amount(BigDecimal.valueOf(10))
            .dueDate(LocalDate.of(2021, 12, 25))
            .paidDate(LocalDate.of(2021, 12, 25))
            .paymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms().days(10))
            .status("oks")
            .paymentAccount(new PaymentAccount().id(1));
    assertEquals(expected, i);
  }

  /** Test the property 'status' */
  @Test
  public void statusTest() {
    assertEquals("oks", model.getStatus());
    model.setStatus("ok");
    assertEquals("ok", model.getStatus());

    ReceivedDocumentPaymentsListItem i = model.status("oks");
    ReceivedDocumentPaymentsListItem expected =
        new ReceivedDocumentPaymentsListItem()
            .id(1)
            .amount(BigDecimal.valueOf(10))
            .dueDate(LocalDate.of(2021, 12, 25))
            .paidDate(LocalDate.of(2021, 12, 25))
            .paymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms().days(10))
            .status("oks")
            .paymentAccount(new PaymentAccount().id(1));
    assertEquals(expected, i);
  }

  /** Test the property 'paymentAccount' */
  @Test
  public void paymentAccountTest() {
    assertEquals(new PaymentAccount().id(1), model.getPaymentAccount());
    model.setPaymentAccount(new PaymentAccount().id(11));
    assertEquals(new PaymentAccount().id(11), model.getPaymentAccount());

    ReceivedDocumentPaymentsListItem i = model.paymentAccount(new PaymentAccount().id(1));
    ReceivedDocumentPaymentsListItem expected =
        new ReceivedDocumentPaymentsListItem()
            .id(1)
            .amount(BigDecimal.valueOf(10))
            .dueDate(LocalDate.of(2021, 12, 25))
            .paidDate(LocalDate.of(2021, 12, 25))
            .paymentTerms(new ReceivedDocumentPaymentsListItemPaymentTerms().days(10))
            .status("oks")
            .paymentAccount(new PaymentAccount().id(1));
    assertEquals(expected, i);
  }
}
