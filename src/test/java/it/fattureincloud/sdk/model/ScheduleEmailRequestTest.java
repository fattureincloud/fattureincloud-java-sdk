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

/** Model tests for ScheduleEmailRequest */
public class ScheduleEmailRequestTest {
  private ScheduleEmailRequest model;

  @BeforeEach
  public void init() {
    model =
        new ScheduleEmailRequest()
            .data(
                new EmailSchedule()
                    .senderEmail("mariorossi@fattureincloud.it")
                    .senderId(12345)
                    .recipientEmail("mary.red@example.com")
                    .subject("Nostra pro forma nr. 1")
                    .body("Pro forma body")
                    .attachPdf(true)
                    .include(
                        new EmailScheduleInclude()
                            .document(false)
                            .deliveryNote(false)
                            .attachment(false)
                            .accompanyingInvoice(false))
                    .sendCopy(false));
  }

  /** Model tests for ScheduleEmailRequest */
  @Test
  public void testScheduleEmailRequest() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"data\":{\"sender_id\":12345,\"sender_email\":\"mariorossi@fattureincloud.it\",\"recipient_email\":\"mary.red@example.com\",\"subject\":\"Nostra"
            + " pro forma nr. 1\",\"body\":\"Pro forma"
            + " body\",\"include\":{\"document\":false,\"delivery_note\":false,\"attachment\":false,\"accompanying_invoice\":false},\"attach_pdf\":true,\"send_copy\":false}}";
    assertEquals(str, json);
    ScheduleEmailRequest generated = gson.fromJson(str, ScheduleEmailRequest.class);
    assertEquals(model, generated);

    Object o = model;
    assertEquals(model, o);
    assertFalse(model.equals(null));
    assertFalse(model.equals(Integer.getInteger("5")));
  }

  /** Test the property 'data' */
  @Test
  public void dataTest() {
    assertEquals(12345, model.getData().getSenderId());
    model.setData(new EmailSchedule().senderId(2));
    assertEquals(2, model.getData().getSenderId());

    model.data(new EmailSchedule().senderId(12345));
    ScheduleEmailRequest actual = new ScheduleEmailRequest();
    actual.setData(new EmailSchedule().senderId(12345));
    assertEquals(model, actual);
  }
}
