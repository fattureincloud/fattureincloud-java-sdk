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
import java.net.URI;
import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/** Model tests for ListReceivedDocumentsResponse */
public class ListReceivedDocumentsResponseTest {
  private ListReceivedDocumentsResponse model;

  @BeforeEach
  public void init() {
    model =
        new ListReceivedDocumentsResponse()
            .addDataItem(
                new ReceivedDocument()
                    .id(12345)
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
                                    .type(PaymentTermsType.STANDARD))
                            .status("paid")
                            .paymentAccount(new PaymentAccount().id(21)))
                    .addItemsListItem(new ReceivedDocumentItemsListItem().id(1))
                    .isDetailed(false))
            .currentPage(10)
            .firstPageUrl(URI.create("https://www.page.url/"))
            .from(10)
            .lastPage(10)
            .lastPageUrl(URI.create("https://www.page.url/"))
            .nextPageUrl(URI.create("https://www.page.url/"))
            .path(URI.create("https://www.page.url/"))
            .perPage(10)
            .prevPageUrl(URI.create("https://www.page.url/"))
            .to(10)
            .total(10);
  }

  /** Model tests for ListReceivedDocumentsResponse */
  @Test
  public void testListReceivedDocumentsResponse() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"current_page\":10,\"first_page_url\":\"https://www.page.url/\",\"from\":10,\"last_page\":10,\"last_page_url\":\"https://www.page.url/\",\"next_page_url\":\"https://www.page.url/\",\"path\":\"https://www.page.url/\",\"per_page\":10,\"prev_page_url\":\"https://www.page.url/\",\"to\":10,\"total\":10,\"data\":[{\"id\":12345,\"type\":\"expense\",\"entity\":{\"id\":1,\"name\":\"neim\",\"default_payment_terms_type\":\"standard\"},\"date\":\"2021-12-25\",\"category\":\"cat6\",\"description\":\"Ricarica\",\"amount_net\":10,\"amount_vat\":0,\"amount_withholding_tax\":0,\"amount_other_withholding_tax\":0,\"amortization\":10,\"rc_center\":\"bg\",\"invoice_number\":\"in\",\"is_marked\":false,\"is_detailed\":false,\"e_invoice\":false,\"currency\":{\"id\":\"EUR\",\"exchange_rate\":\"1\"},\"tax_deductibility\":50,\"vat_deductibility\":100,\"items_list\":[{\"id\":1}],\"payments_list\":[{\"amount\":592,\"due_date\":\"2021-12-25\",\"paid_date\":\"2021-12-25\",\"payment_terms\":{\"days\":0,\"type\":\"standard\"},\"status\":\"paid\",\"payment_account\":{\"id\":21,\"type\":\"standard\"}}],\"attachment_token\":\"dGdweHdjNjlieWFjY3BseGZ0cTZmbWN0Njhhb3R0cXQvZmlsZW5hbWVfZXhhbXBsZQ\\u003d\\u003d\"}]}";
    assertEquals(str, json);
    ListReceivedDocumentsResponse generated =
        gson.fromJson(str, ListReceivedDocumentsResponse.class);
    assertEquals(model, generated);

    Object o = model;
    assertEquals(model, o);
    assertFalse(model.equals(null));
    assertFalse(model.equals(Integer.getInteger("5")));
  }

  /** Test the property 'currentPage' */
  @Test
  public void currentPageTest() {
    assertEquals(10, model.getCurrentPage());
    model.setCurrentPage(1);
    assertEquals(1, model.getCurrentPage());
  }

  /** Test the property 'firstPageUrl' */
  @Test
  public void firstPageUrlTest() {
    assertEquals(URI.create("https://www.page.url/"), model.getFirstPageUrl());
    model.setFirstPageUrl(URI.create("https://www.page2.url/"));
    assertEquals(URI.create("https://www.page2.url/"), model.getFirstPageUrl());
  }

  /** Test the property 'from' */
  @Test
  public void fromTest() {
    assertEquals(10, model.getFrom());
    model.setFrom(1);
    assertEquals(1, model.getFrom());
  }

  /** Test the property 'lastPage' */
  @Test
  public void lastPageTest() {
    assertEquals(10, model.getLastPage());
    model.setLastPage(1);
    assertEquals(1, model.getLastPage());
  }

  /** Test the property 'lastPageUrl' */
  @Test
  public void lastPageUrlTest() {
    assertEquals(URI.create("https://www.page.url/"), model.getLastPageUrl());
    model.setLastPageUrl(URI.create("https://www.page2.url/"));
    assertEquals(URI.create("https://www.page2.url/"), model.getLastPageUrl());
  }

  /** Test the property 'nextPageUrl' */
  @Test
  public void nextPageUrlTest() {
    assertEquals(URI.create("https://www.page.url/"), model.getNextPageUrl());
    model.setNextPageUrl(URI.create("https://www.page2.url/"));
    assertEquals(URI.create("https://www.page2.url/"), model.getNextPageUrl());
  }

  /** Test the property 'path' */
  @Test
  public void pathTest() {
    assertEquals(URI.create("https://www.page.url/"), model.getPath());
    model.setPath(URI.create("https://www.page2.url/"));
    assertEquals(URI.create("https://www.page2.url/"), model.getPath());
  }

  /** Test the property 'perPage' */
  @Test
  public void perPageTest() {
    assertEquals(10, model.getPerPage());
    model.setPerPage(1);
    assertEquals(1, model.getPerPage());
  }

  /** Test the property 'prevPageUrl' */
  @Test
  public void prevPageUrlTest() {
    assertEquals(URI.create("https://www.page.url/"), model.getPrevPageUrl());
    model.setPrevPageUrl(URI.create("https://www.page2.url/"));
    assertEquals(URI.create("https://www.page2.url/"), model.getPrevPageUrl());
  }

  /** Test the property 'to' */
  @Test
  public void toTest() {
    assertEquals(10, model.getTo());
    model.setTo(1);
    assertEquals(1, model.getTo());
  }

  /** Test the property 'total' */
  @Test
  public void totalTest() {
    assertEquals(10, model.getTotal());
    model.setTotal(1);
    assertEquals(1, model.getTotal());
  }

  /** Test the property 'data' */
  @Test
  public void dataTest() {
    assertEquals(12345, model.getData().get(0).getId());
    model.setData(Arrays.asList(new ReceivedDocument().id(1)));
    assertEquals(1, model.getData().get(0).getId());

    model.data(Arrays.asList(new ReceivedDocument().id(2)));
    ListReceivedDocumentsResponse actual = new ListReceivedDocumentsResponse();
    actual.setData(Arrays.asList(new ReceivedDocument().id(2)));
    actual
        .currentPage(10)
        .firstPageUrl(URI.create("https://www.page.url/"))
        .from(10)
        .lastPage(10)
        .lastPageUrl(URI.create("https://www.page.url/"))
        .nextPageUrl(URI.create("https://www.page.url/"))
        .path(URI.create("https://www.page.url/"))
        .perPage(10)
        .prevPageUrl(URI.create("https://www.page.url/"))
        .to(10)
        .total(10);
    assertEquals(model, actual);
  }
}
