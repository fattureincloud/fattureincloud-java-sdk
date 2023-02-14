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

/** Model tests for ModifyClientResponse */
public class ModifyClientResponseTest {
  private ModifyClientResponse model;

  @BeforeEach
  public void init() {
    model =
        new ModifyClientResponse()
            .data(
                new Client()
                    .id(12345)
                    .code("AE86")
                    .name("Avv. Maria Rossi")
                    .type(ClientType.PERSON)
                    .firstName("Maria")
                    .lastName("Rossi")
                    .contactPerson("")
                    .vatNumber("IT12345640962")
                    .taxCode("BLTGNI5ABCDA794E")
                    .addressStreet("Via Roma, 1")
                    .addressPostalCode("20900")
                    .addressCity("Milano")
                    .addressProvince("MI")
                    .addressExtra("")
                    .country("Italia")
                    .email("maria.rossi@example.com")
                    .certifiedEmail("maria.rossi@pec.example.com")
                    .phone("1234567890")
                    .fax("")
                    .notes("")
                    .createdAt("2021-04-29 08:53:07")
                    .updatedAt("2021-04-29 08:53:07")
                    .defaultPaymentTerms(1)
                    .defaultPaymentTermsType(PaymentTermsType.STANDARD)
                    .bankName("Indesa")
                    .bankIban("IT40P123456781000000123456")
                    .bankSwiftCode("AK86PCT")
                    .shippingAddress("Corso Magellano 4")
                    .eInvoice(true)
                    .eiCode("111111")
                    .defaultVat(
                        new VatType()
                            .id(54321)
                            .value(BigDecimal.valueOf(45))
                            .description("")
                            .isDisabled(false))
                    .defaultPaymentMethod(new PaymentMethod().id(386092).name("Credit card")));
  }

  /** Model tests for ModifyClientResponse */
  @Test
  public void testModifyClientResponse() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"data\":{\"id\":12345,\"code\":\"AE86\",\"name\":\"Avv. Maria"
            + " Rossi\",\"type\":\"person\",\"first_name\":\"Maria\",\"last_name\":\"Rossi\",\"contact_person\":\"\",\"vat_number\":\"IT12345640962\",\"tax_code\":\"BLTGNI5ABCDA794E\",\"address_street\":\"Via"
            + " Roma,"
            + " 1\",\"address_postal_code\":\"20900\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"email\":\"maria.rossi@example.com\",\"certified_email\":\"maria.rossi@pec.example.com\",\"phone\":\"1234567890\",\"fax\":\"\",\"notes\":\"\",\"default_vat\":{\"id\":54321,\"value\":45,\"description\":\"\",\"is_disabled\":false},\"default_payment_terms\":1,\"default_payment_terms_type\":\"standard\",\"default_payment_method\":{\"id\":386092,\"name\":\"Credit"
            + " card\",\"type\":\"standard\"},\"bank_name\":\"Indesa\",\"bank_iban\":\"IT40P123456781000000123456\",\"bank_swift_code\":\"AK86PCT\",\"shipping_address\":\"Corso"
            + " Magellano 4\",\"e_invoice\":true,\"ei_code\":\"111111\",\"created_at\":\"2021-04-29"
            + " 08:53:07\",\"updated_at\":\"2021-04-29 08:53:07\"}}";
    assertEquals(str, json);
    ModifyClientResponse generated = gson.fromJson(str, ModifyClientResponse.class);
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
    model.setData(new Client().id(1));
    assertEquals(1, model.getData().getId());

    model.data(new Client().id(2));
    ModifyClientResponse actual = new ModifyClientResponse();
    actual.setData(new Client().id(2));
    assertEquals(model, actual);
  }
}
