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

/** Model tests for ModifyF24Request */
public class ModifyF24RequestTest {
  private ModifyF24Request model;

  @BeforeEach
  public void init() {
    model =
        new ModifyF24Request()
            .data(
                new F24()
                    .id(12345)
                    .amount(BigDecimal.valueOf(840.36))
                    .description("PAGAMENTO IVA 2021")
                    .dueDate(LocalDate.parse("2021-12-31"))
                    .status(F24Status.PAID)
                    .paymentAccount(new PaymentAccount().id(111).name("Indesa - Carta conto"))
                    .attachmentToken("Adfqregwthwrt6whrtghsrgbsdthyeruerur6u6676e5879"));
  }

  /** Model tests for ModifyF24Request */
  @Test
  public void testModifyF24Request() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"data\":{\"id\":12345,\"due_date\":\"2021-12-31\",\"status\":\"paid\",\"payment_account\":{\"id\":111,\"name\":\"Indesa"
            + " - Carta"
            + " conto\",\"type\":\"standard\"},\"amount\":840.36,\"attachment_token\":\"Adfqregwthwrt6whrtghsrgbsdthyeruerur6u6676e5879\",\"description\":\"PAGAMENTO"
            + " IVA 2021\"}}";
    assertEquals(str, json);
    ModifyF24Request generated = gson.fromJson(str, ModifyF24Request.class);
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
    model.setData(new F24().id(1));
    assertEquals(1, model.getData().getId());

    model.data(new F24().id(2));
    ModifyF24Request actual = new ModifyF24Request();
    actual.setData(new F24().id(2));
    assertEquals(model, actual);
  }
}
