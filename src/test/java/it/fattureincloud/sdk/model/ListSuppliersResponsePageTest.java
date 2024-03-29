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
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Model tests for ListSuppliersResponsePage */
public class ListSuppliersResponsePageTest {
  private ListSuppliersResponsePage model;

  @BeforeEach
  public void init() {
    model =
        new ListSuppliersResponsePage()
            .addDataItem(
                new Supplier()
                    .id(12345)
                    .code("AE86")
                    .name("Mario Rossi S.R.L.")
                    .type(SupplierType.COMPANY)
                    .firstName("Mario")
                    .lastName("Rossi")
                    .contactPerson("")
                    .vatNumber("111222333")
                    .taxCode("111122233")
                    .addressStreet("Corso Magellano, 46")
                    .addressPostalCode("20146")
                    .addressCity("Milano")
                    .addressProvince("MI")
                    .addressExtra("")
                    .country("Italia")
                    .email("mario.rossi@example.com")
                    .certifiedEmail("mario.rossi@pec.example.com")
                    .phone("1234567890")
                    .fax("123456789")
                    .notes("")
                    .createdAt("2021-15-08")
                    .updatedAt("2021-15-08"));
  }

  /** Model tests for ListSuppliersResponsePage */
  @Test
  public void testListSuppliersResponsePage() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"data\":[{\"id\":12345,\"code\":\"AE86\",\"name\":\"Mario Rossi"
            + " S.R.L.\",\"type\":\"company\",\"first_name\":\"Mario\",\"last_name\":\"Rossi\",\"contact_person\":\"\",\"vat_number\":\"111222333\",\"tax_code\":\"111122233\",\"address_street\":\"Corso"
            + " Magellano,"
            + " 46\",\"address_postal_code\":\"20146\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"email\":\"mario.rossi@example.com\",\"certified_email\":\"mario.rossi@pec.example.com\",\"phone\":\"1234567890\",\"fax\":\"123456789\",\"notes\":\"\",\"created_at\":\"2021-15-08\",\"updated_at\":\"2021-15-08\"}]}";
    assertEquals(str, json);
    ListSuppliersResponsePage generated = gson.fromJson(str, ListSuppliersResponsePage.class);
    assertEquals(model, generated);

    Object o = model;
    assertEquals(model, o);
    assertFalse(model.equals(null));
    assertFalse(model.equals(Integer.getInteger("5")));
  }

  /** Test the property 'data' */
  @Test
  public void dataTest() {
    assertEquals(12345, model.getData().get(0).getId());
    model.setData(Arrays.asList(new Supplier().id(1)));
    assertEquals(1, model.getData().get(0).getId());

    model.data(Arrays.asList(new Supplier().id(2)));
    ListSuppliersResponsePage actual = new ListSuppliersResponsePage();
    actual.setData(Arrays.asList(new Supplier().id(2)));
    assertEquals(model, actual);
  }
}
