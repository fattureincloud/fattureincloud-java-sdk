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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Model tests for GetProductResponse */
public class GetProductResponseTest {
  private GetProductResponse model;

  @BeforeEach
  public void init() {
    model =
        new GetProductResponse()
            .data(
                new Product()
                    .id(12345)
                    .name("neim")
                    .code("cod")
                    .netPrice(BigDecimal.valueOf(10))
                    .grossPrice(BigDecimal.valueOf(10))
                    .useGrossPrice(true)
                    .defaultVat(new VatType().id(1))
                    .netCost(BigDecimal.valueOf(10))
                    .measure("big")
                    .description("desc")
                    .category("cat6")
                    .notes("nots")
                    .inStock(true)
                    .stockInitial(BigDecimal.valueOf(10))
                    .averageCost(BigDecimal.valueOf(10))
                    .averagePrice(BigDecimal.valueOf(10))
                    .createdAt("2021-10-10")
                    .updatedAt("2021-10-10"));
  }

  /** Model tests for GetProductResponse */
  @Test
  public void testGetProductResponse() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"data\":{\"id\":12345,\"name\":\"neim\",\"code\":\"cod\",\"net_price\":10,\"gross_price\":10,\"use_gross_price\":true,\"default_vat\":{\"id\":1},\"net_cost\":10,\"measure\":\"big\",\"description\":\"desc\",\"category\":\"cat6\",\"notes\":\"nots\",\"in_stock\":true,\"stock_initial\":10,\"average_cost\":10,\"average_price\":10,\"created_at\":\"2021-10-10\",\"updated_at\":\"2021-10-10\"}}";
    assertEquals(str, json);
    GetProductResponse generated = gson.fromJson(str, GetProductResponse.class);
    assertEquals(model, generated);

    Object o = model;
    assertEquals(model, o);
    assertFalse(model.equals(null));
    assertFalse(model.equals(Integer.getInteger("5")));
  }

  /** Test the property 'data' */
  @Test
  public void dataTest() {
    assertEquals(12345, model.getData().getId());
    model.setData(new Product().id(1));
    assertEquals(1, model.getData().getId());

    model.data(new Product().id(2));
    GetProductResponse actual = new GetProductResponse();
    actual.setData(new Product().id(2));
    assertEquals(model, actual);
  }
}
