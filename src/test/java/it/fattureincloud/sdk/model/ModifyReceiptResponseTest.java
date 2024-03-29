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

/** Model tests for ModifyReceiptResponse */
public class ModifyReceiptResponseTest {
  private ModifyReceiptResponse model;

  @BeforeEach
  public void init() {
    model =
        new ModifyReceiptResponse()
            .data(
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
                    .addItemsListItem(new ReceiptItemsListItem().id(1)));
  }

  /** Model tests for ModifyReceiptResponse */
  @Test
  public void testModifyReceiptResponse() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"data\":{\"id\":12345,\"date\":\"2021-12-25\",\"number\":10,\"numeration\":\"num\",\"amount_net\":10,\"amount_vat\":10,\"amount_gross\":10,\"use_gross_prices\":true,\"type\":\"till_receipt\",\"description\":\"descr\",\"rc_center\":\"bg\",\"created_at\":\"2021-10-10\",\"updated_at\":\"2021-10-10\",\"payment_account\":{\"id\":1,\"type\":\"standard\"},\"items_list\":[{\"id\":1}]}}";
    assertEquals(str, json);
    ModifyReceiptResponse generated = gson.fromJson(str, ModifyReceiptResponse.class);
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
    model.setData(new Receipt().id(1));
    assertEquals(1, model.getData().getId());

    model.data(new Receipt().id(2));
    ModifyReceiptResponse actual = new ModifyReceiptResponse();
    actual.setData(new Receipt().id(2));
    assertEquals(model, actual);
  }
}
