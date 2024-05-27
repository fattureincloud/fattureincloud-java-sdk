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
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Model tests for ModifyArchiveDocumentResponse */
public class ModifyArchiveDocumentResponseTest {
  private ModifyArchiveDocumentResponse model;

  @BeforeEach
  public void init() {
    model =
        new ModifyArchiveDocumentResponse()
            .data(
                new ArchiveDocument()
                    .id(12345)
                    .date(LocalDate.parse("2021-08-20"))
                    .category("Altri documenti")
                    .description("spesa 2")
                    .attachmentToken("jwfbaiuwbfoiewfoa8weohafw7gefa9we"));
  }

  /** Model tests for ModifyArchiveDocumentResponse */
  @Test
  public void testModifyArchiveDocumentResponse() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"data\":{\"id\":12345,\"date\":\"2021-08-20\",\"description\":\"spesa"
            + " 2\",\"category\":\"Altri"
            + " documenti\",\"attachment_token\":\"jwfbaiuwbfoiewfoa8weohafw7gefa9we\"}}";
    assertEquals(str, json);
    ModifyArchiveDocumentResponse generated =
        gson.fromJson(str, ModifyArchiveDocumentResponse.class);
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
    model.setData(new ArchiveDocument().id(1));
    assertEquals(1, model.getData().getId());

    model.data(new ArchiveDocument().id(2));
    ModifyArchiveDocumentResponse actual = new ModifyArchiveDocumentResponse();
    actual.setData(new ArchiveDocument().id(2));
    assertEquals(model, actual);
  }
}
