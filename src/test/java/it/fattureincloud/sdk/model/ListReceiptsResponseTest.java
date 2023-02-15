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
import java.net.URI;
import java.time.LocalDate;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Model tests for ListReceiptsResponse */
public class ListReceiptsResponseTest {
  private ListReceiptsResponse model;

  @BeforeEach
  public void init() {
    model =
        new ListReceiptsResponse()
            .addDataItem(
                new Receipt()
                    .id(12345)
                    .date(LocalDate.of(2021, 12, 25))
                    .number(BigDecimal.valueOf(10))
                    .numeration("num")
                    .amountNet(BigDecimal.valueOf(10))
                    .amountVat(BigDecimal.valueOf(10))
                    .amountGross(BigDecimal.valueOf(10))
                    .useGrossPrices(true)
                    .type(ReceiptType.TILL_RECEIPT)
                    .description("descr")
                    .rcCenter("bg")
                    .createdAt("2021-10-10")
                    .updatedAt("2021-10-10")
                    .paymentAccount(new PaymentAccount().id(1))
                    .addItemsListItem(new ReceiptItemsListItem().id(1)))
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

  /** Model tests for ListReceiptsResponse */
  @Test
  public void testListReceiptsResponse() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"current_page\":10,\"first_page_url\":\"https://www.page.url/\",\"from\":10,\"last_page\":10,\"last_page_url\":\"https://www.page.url/\",\"next_page_url\":\"https://www.page.url/\",\"path\":\"https://www.page.url/\",\"per_page\":10,\"prev_page_url\":\"https://www.page.url/\",\"to\":10,\"total\":10,\"data\":[{\"id\":12345,\"date\":\"2021-12-25\",\"number\":10,\"numeration\":\"num\",\"amount_net\":10,\"amount_vat\":10,\"amount_gross\":10,\"use_gross_prices\":true,\"type\":\"till_receipt\",\"description\":\"descr\",\"rc_center\":\"bg\",\"created_at\":\"2021-10-10\",\"updated_at\":\"2021-10-10\",\"payment_account\":{\"id\":1,\"type\":\"standard\"},\"items_list\":[{\"id\":1}]}]}";
    assertEquals(str, json);
    ListReceiptsResponse generated = gson.fromJson(str, ListReceiptsResponse.class);
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
    model.setData(Arrays.asList(new Receipt().id(1)));
    assertEquals(1, model.getData().get(0).getId());

    model.data(Arrays.asList(new Receipt().id(2)));
    ListReceiptsResponse actual = new ListReceiptsResponse();
    actual.setData(Arrays.asList(new Receipt().id(2)));
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
