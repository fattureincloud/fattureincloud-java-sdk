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

import com.google.gson.Gson;
import it.fattureincloud.sdk.JSON;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/** Model tests for CreateReceivedDocumentRequest */
public class CreateReceivedDocumentRequestTest {
  private CreateReceivedDocumentRequest model;

  @BeforeEach
  public void init() {
    model =
        new CreateReceivedDocumentRequest()
            .data(
                new ReceivedDocument()
                    .id(1)
                    .type(ReceivedDocumentType.EXPENSE)
                    .entity(new Entity().id(1).name("neim"))
                    .date(LocalDate.of(2021, 12, 25))
                    .category("cat6")
                    .description("Ricarica")
                    .amountNet(new BigDecimal(10))
                    .amortization(new BigDecimal(10))
                    .rcCenter("bg")
                    .amountVat(new BigDecimal(0))
                    .amountWithholdingTax(new BigDecimal(0))
                    .amountOtherWithholdingTax(new BigDecimal(0))
                    .taxDeductibility(new BigDecimal(50))
                    .vatDeductibility(new BigDecimal(100))
                    .isMarked(false)
                    .invoiceNumber("in")
                    .isMarked(false)
                    .isDetailed(false)
                    .eInvoice(false)
                    .attachmentToken(
                        "dGdweHdjNjlieWFjY3BseGZ0cTZmbWN0Njhhb3R0cXQvZmlsZW5hbWVfZXhhbXBsZQ==")
                    .currency(new Currency().id("EUR").exchangeRate("1"))
                    .addPaymentsListItem(
                        new ReceivedDocumentPaymentsListItem()
                            .amount(new BigDecimal(592))
                            .dueDate(LocalDate.of(2021, 12, 25))
                            .paidDate(LocalDate.of(2021, 12, 25))
                            .paymentTerms(
                                new ReceivedDocumentPaymentsListItemPaymentTerms()
                                    .days(0)
                                    .type("standard"))
                            .status("paid")
                            .paymentAccount(new PaymentAccount().id(21)))
                    .addItemsListItem(new ReceivedDocumentItemsListItem().id(1))
                    .isDetailed(false))
            .pendingId(1);
  }

  /** Model tests for CreateReceivedDocumentRequest */
  @Test
  public void testCreateReceivedDocumentRequest() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"pending_id\":1,\"data\":{\"id\":1,\"type\":\"expense\",\"entity\":{\"id\":1,\"name\":\"neim\",\"default_payment_terms_type\":\"standard\"},\"date\":\"2021-12-25\",\"category\":\"cat6\",\"description\":\"Ricarica\",\"amount_net\":10,\"amount_vat\":0,\"amount_withholding_tax\":0,\"amount_other_withholding_tax\":0,\"amortization\":10,\"rc_center\":\"bg\",\"invoice_number\":\"in\",\"is_marked\":false,\"is_detailed\":false,\"e_invoice\":false,\"currency\":{\"id\":\"EUR\",\"exchange_rate\":\"1\"},\"tax_deductibility\":50,\"vat_deductibility\":100,\"items_list\":[{\"id\":1}],\"payments_list\":[{\"amount\":592,\"due_date\":\"2021-12-25\",\"paid_date\":\"2021-12-25\",\"payment_terms\":{\"days\":0,\"type\":\"standard\"},\"status\":\"paid\",\"payment_account\":{\"id\":21,\"type\":\"standard\"}}],\"attachment_token\":\"dGdweHdjNjlieWFjY3BseGZ0cTZmbWN0Njhhb3R0cXQvZmlsZW5hbWVfZXhhbXBsZQ\\u003d\\u003d\"}}";
    assertEquals(str, json);
    CreateReceivedDocumentRequest generated =
        gson.fromJson(str, CreateReceivedDocumentRequest.class);
    assertEquals(model, generated);

    Object o = model;
    assertEquals(model, o);
    assertFalse(model.equals(null));
    assertFalse(model.equals(Integer.getInteger("5")));
  }

  /** Test the property 'pendingId' */
  @Test
  public void pendingIdTest() {
    assertEquals(1, model.getPendingId());
    model.setPendingId(2);
    assertEquals(2, model.getPendingId());

    model = new CreateReceivedDocumentRequest();
    model.pendingId(1);
    CreateReceivedDocumentRequest actual = new CreateReceivedDocumentRequest();
    actual.setPendingId(1);
    assertEquals(model, actual);
  }

  /** Test the property 'data' */
  @Test
  public void dataTest() {
    assertEquals(1, model.getData().getId());
    model.setData(new ReceivedDocument().id(2));
    assertEquals(2, model.getData().getId());

    model.data(new ReceivedDocument().id(1));
    CreateReceivedDocumentRequest actual = new CreateReceivedDocumentRequest();
    actual.setData(new ReceivedDocument().id(1));
    actual.setPendingId(1);
    assertEquals(model, actual);
  }
}
