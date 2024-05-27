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
import java.net.URI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Model tests for Pagination */
public class PaginationTest {
  private Pagination model;

  @BeforeEach
  public void init() {
    model =
        new Pagination()
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

  /** Model tests for Pagination */
  @Test
  public void testPagination() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"current_page\":10,\"first_page_url\":\"https://www.page.url/\",\"from\":10,\"last_page\":10,\"last_page_url\":\"https://www.page.url/\",\"next_page_url\":\"https://www.page.url/\",\"path\":\"https://www.page.url/\",\"per_page\":10,\"prev_page_url\":\"https://www.page.url/\",\"to\":10,\"total\":10}";
    assertEquals(str, json);
    Pagination generated = gson.fromJson(str, Pagination.class);
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

    Pagination i = model.currentPage(10);
    Pagination expected =
        new Pagination()
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

    assertEquals(expected, i);
  }

  /** Test the property 'firstPageUrl' */
  @Test
  public void firstPageUrlTest() {
    assertEquals(URI.create("https://www.page.url/"), model.getFirstPageUrl());
    model.setFirstPageUrl(URI.create("https://www.page2.url/"));
    assertEquals(URI.create("https://www.page2.url/"), model.getFirstPageUrl());

    Pagination i = model.firstPageUrl(URI.create("https://www.page.url/"));
    Pagination expected =
        new Pagination()
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

    assertEquals(expected, i);
  }

  /** Test the property 'from' */
  @Test
  public void fromTest() {
    assertEquals(10, model.getFrom());
    model.setFrom(1);
    assertEquals(1, model.getFrom());

    Pagination i = model.from(10);
    Pagination expected =
        new Pagination()
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

    assertEquals(expected, i);
  }

  /** Test the property 'lastPage' */
  @Test
  public void lastPageTest() {
    assertEquals(10, model.getLastPage());
    model.setLastPage(1);
    assertEquals(1, model.getLastPage());

    Pagination i = model.lastPage(10);
    Pagination expected =
        new Pagination()
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

    assertEquals(expected, i);
  }

  /** Test the property 'lastPageUrl' */
  @Test
  public void lastPageUrlTest() {
    assertEquals(URI.create("https://www.page.url/"), model.getLastPageUrl());
    model.setLastPageUrl(URI.create("https://www.page2.url/"));
    assertEquals(URI.create("https://www.page2.url/"), model.getLastPageUrl());

    Pagination i = model.lastPageUrl(URI.create("https://www.page.url/"));
    Pagination expected =
        new Pagination()
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

    assertEquals(expected, i);
  }

  /** Test the property 'nextPageUrl' */
  @Test
  public void nextPageUrlTest() {
    assertEquals(URI.create("https://www.page.url/"), model.getNextPageUrl());
    model.setNextPageUrl(URI.create("https://www.page2.url/"));
    assertEquals(URI.create("https://www.page2.url/"), model.getNextPageUrl());

    Pagination i = model.nextPageUrl(URI.create("https://www.page.url/"));
    Pagination expected =
        new Pagination()
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

    assertEquals(expected, i);
  }

  /** Test the property 'path' */
  @Test
  public void pathTest() {
    assertEquals(URI.create("https://www.page.url/"), model.getPath());
    model.setPath(URI.create("https://www.page2.url/"));
    assertEquals(URI.create("https://www.page2.url/"), model.getPath());

    Pagination i = model.path(URI.create("https://www.page.url/"));
    Pagination expected =
        new Pagination()
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

    assertEquals(expected, i);
  }

  /** Test the property 'perPage' */
  @Test
  public void perPageTest() {
    assertEquals(10, model.getPerPage());
    model.setPerPage(1);
    assertEquals(1, model.getPerPage());

    Pagination i = model.perPage(10);
    Pagination expected =
        new Pagination()
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

    assertEquals(expected, i);
  }

  /** Test the property 'prevPageUrl' */
  @Test
  public void prevPageUrlTest() {
    assertEquals(URI.create("https://www.page.url/"), model.getPrevPageUrl());
    model.setPrevPageUrl(URI.create("https://www.page2.url/"));
    assertEquals(URI.create("https://www.page2.url/"), model.getPrevPageUrl());

    Pagination i = model.prevPageUrl(URI.create("https://www.page.url/"));
    Pagination expected =
        new Pagination()
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

    assertEquals(expected, i);
  }

  /** Test the property 'to' */
  @Test
  public void toTest() {
    assertEquals(10, model.getTo());
    model.setTo(1);
    assertEquals(1, model.getTo());

    Pagination i = model.to(10);
    Pagination expected =
        new Pagination()
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

    assertEquals(expected, i);
  }

  /** Test the property 'total' */
  @Test
  public void totalTest() {
    assertEquals(10, model.getTotal());
    model.setTotal(1);
    assertEquals(1, model.getTotal());

    Pagination i = model.total(10);
    Pagination expected =
        new Pagination()
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

    assertEquals(expected, i);
  }
}
