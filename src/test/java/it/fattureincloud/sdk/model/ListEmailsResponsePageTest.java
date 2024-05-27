/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.22
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
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Model tests for ListEmailsResponsePage */
public class ListEmailsResponsePageTest {
  private ListEmailsResponsePage model;

  @BeforeEach
  public void init() {
    model =
        new ListEmailsResponsePage()
            .data(
                Arrays.asList(
                    new Email()
                        .id(1)
                        .status(EmailStatus.SENT)
                        .sentDate(
                            OffsetDateTime.of(
                                LocalDateTime.of(2022, 7, 17, 13, 53, 12), ZoneOffset.UTC))
                        .errorsCount(0)
                        .errorLog("")
                        .fromEmail("test@mail.it")
                        .fromName("Test mail")
                        .toEmail("mail@test.it")
                        .toName("Mario")
                        .subject("Test")
                        .content("Test send email")
                        .copyTo("")
                        .recipientStatus(EmailRecipientStatus.UNKNOWN)
                        .recipientDate(
                            OffsetDateTime.of(
                                LocalDateTime.of(2022, 7, 17, 13, 53, 12), ZoneOffset.UTC))
                        .kind("Fatture")
                        .attachments(new ArrayList<>()),
                    new Email()
                        .id(2)
                        .status(EmailStatus.SENT)
                        .sentDate(
                            OffsetDateTime.of(
                                LocalDateTime.of(2022, 7, 17, 13, 53, 12), ZoneOffset.UTC))
                        .errorsCount(0)
                        .errorLog("")
                        .fromEmail("test@mail.it")
                        .fromName("Test mail")
                        .toEmail("mail@test.it")
                        .toName("Mario")
                        .subject("Test")
                        .content("Test send email")
                        .copyTo("")
                        .recipientStatus(EmailRecipientStatus.UNKNOWN)
                        .recipientDate(
                            OffsetDateTime.of(
                                LocalDateTime.of(2022, 7, 17, 13, 53, 12), ZoneOffset.UTC))
                        .kind("Fatture")
                        .attachments(new ArrayList<>())));
  }

  /** Model tests for ListEmailsResponsePage */
  @Test
  public void testListEmailsResponsePage() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"data\":[{\"id\":1,\"status\":\"sent\",\"sent_date\":\"2022-07-17T13:53:12Z\",\"errors_count\":0,\"error_log\":\"\",\"from_email\":\"test@mail.it\",\"from_name\":\"Test"
            + " mail\",\"to_email\":\"mail@test.it\",\"to_name\":\"Mario\",\"subject\":\"Test\",\"content\":\"Test"
            + " send"
            + " email\",\"copy_to\":\"\",\"recipient_status\":\"unknown\",\"recipient_date\":\"2022-07-17T13:53:12Z\",\"kind\":\"Fatture\",\"attachments\":[]},{\"id\":2,\"status\":\"sent\",\"sent_date\":\"2022-07-17T13:53:12Z\",\"errors_count\":0,\"error_log\":\"\",\"from_email\":\"test@mail.it\",\"from_name\":\"Test"
            + " mail\",\"to_email\":\"mail@test.it\",\"to_name\":\"Mario\",\"subject\":\"Test\",\"content\":\"Test"
            + " send"
            + " email\",\"copy_to\":\"\",\"recipient_status\":\"unknown\",\"recipient_date\":\"2022-07-17T13:53:12Z\",\"kind\":\"Fatture\",\"attachments\":[]}]}";
    assertEquals(str, json);
    ListEmailsResponsePage generated = gson.fromJson(str, ListEmailsResponsePage.class);
    assertEquals(model, generated);

    Object o = model;
    assertEquals(model, o);
    assertFalse(model.equals(null));
    assertFalse(model.equals(Integer.getInteger("5")));
  }

  /** Test the property 'data' */
  @Test
  public void dataTest() {
    assertEquals(1, model.getData().get(0).getId());
    model.setData(Arrays.asList(new Email().id(12345)));
    assertEquals(12345, model.getData().get(0).getId());

    model.data(Arrays.asList(new Email().id(2)));
    ListEmailsResponsePage actual = new ListEmailsResponsePage();
    actual.setData(Arrays.asList(new Email().id(2)));
    assertEquals(model, actual);
  }
}
