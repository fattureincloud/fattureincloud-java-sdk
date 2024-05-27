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

import static org.junit.jupiter.api.Assertions.*;

import com.google.gson.Gson;
import it.fattureincloud.sdk.JSON;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Model tests for Supplier */
public class SupplierTest {
  private Supplier model;

  @BeforeEach
  public void init() {
    model = new Supplier();
  }

  /** Model tests for Supplier */
  @Test
  public void testSupplier() {
    Supplier c =
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
            .updatedAt("2021-15-08");

    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(c);
    String str =
        "{\"id\":12345,\"code\":\"AE86\",\"name\":\"Mario Rossi"
            + " S.R.L.\",\"type\":\"company\",\"first_name\":\"Mario\",\"last_name\":\"Rossi\",\"contact_person\":\"\",\"vat_number\":\"111222333\",\"tax_code\":\"111122233\",\"address_street\":\"Corso"
            + " Magellano,"
            + " 46\",\"address_postal_code\":\"20146\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"email\":\"mario.rossi@example.com\",\"certified_email\":\"mario.rossi@pec.example.com\",\"phone\":\"1234567890\",\"fax\":\"123456789\",\"notes\":\"\",\"created_at\":\"2021-15-08\",\"updated_at\":\"2021-15-08\"}";
    assertEquals(str, json);
    Supplier generated = gson.fromJson(str, Supplier.class);
    assertEquals(c, generated);

    Object o = c;
    assertEquals(c, o);
    assertFalse(c.equals(null));
    assertFalse(c.equals(Integer.getInteger("5")));
  }

  /** Test the property 'id' */
  @Test
  public void idTest() {
    assertNull(model.getId());
    model.setId(4);
    assertEquals(4, model.getId());
    Supplier s = model.id(6);
    Supplier expected = new Supplier();
    expected.setId(6);
    assertEquals(expected, s);
  }

  /** Test the property 'code' */
  @Test
  public void codeTest() {
    assertNull(model.getCode());
    model.setCode("AE86");
    assertEquals("AE86", model.getCode());
    Supplier s = model.code("AE88");
    Supplier expected = new Supplier();
    expected.setCode("AE88");
    assertEquals(expected, s);
  }

  /** Test the property 'name' */
  @Test
  public void nameTest() {
    assertNull(model.getName());
    model.setName("Avv. Maria Rossi");
    assertEquals("Avv. Maria Rossi", model.getName());
    Supplier s = model.name("Diana");
    Supplier expected = new Supplier();
    expected.setName("Diana");
    assertEquals(expected, s);
  }

  /** Test the property 'type' */
  @Test
  public void typeTest() {
    assertNull(model.getType());
    model.setType(SupplierType.PERSON);
    assertEquals(SupplierType.PERSON, model.getType());
    Supplier s = model.type(SupplierType.CONDO);
    Supplier expected = new Supplier();
    expected.setType(SupplierType.CONDO);
    assertEquals(expected, s);
  }

  /** Test the property 'firstName' */
  @Test
  public void firstNameTest() {
    assertNull(model.getFirstName());
    model.setFirstName("Maria");
    assertEquals("Maria", model.getFirstName());
    Supplier s = model.firstName("Emma");
    Supplier expected = new Supplier();
    expected.setFirstName("Emma");
    assertEquals(expected, s);
  }

  /** Test the property 'lastName' */
  @Test
  public void lastNameTest() {
    assertNull(model.getLastName());
    model.setLastName("Borgo");
    assertEquals("Borgo", model.getLastName());
    Supplier s = model.lastName("Faraone");
    Supplier expected = new Supplier();
    expected.setLastName("Faraone");
    assertEquals(expected, s);
  }

  /** Test the property 'contactPerson' */
  @Test
  public void contactPersonTest() {
    assertNull(model.getContactPerson());
    model.setContactPerson("Daniela");
    assertEquals("Daniela", model.getContactPerson());
    Supplier s = model.contactPerson("Isabella");
    Supplier expected = new Supplier();
    expected.setContactPerson("Isabella");
    assertEquals(expected, s);
  }

  /** Test the property 'vatNumber' */
  @Test
  public void vatNumberTest() {
    assertNull(model.getVatNumber());
    model.setVatNumber("AAAAAAAA");
    assertEquals("AAAAAAAA", model.getVatNumber());
    Supplier s = model.vatNumber("BBBBBBBB");
    Supplier expected = new Supplier();
    expected.setVatNumber("BBBBBBBB");
    assertEquals(expected, s);
  }

  /** Test the property 'taxCode' */
  @Test
  public void taxCodeTest() {
    assertNull(model.getTaxCode());
    model.setTaxCode("AAAAAAAA");
    assertEquals("AAAAAAAA", model.getTaxCode());
    Supplier s = model.taxCode("BBBBBBBB");
    Supplier expected = new Supplier();
    expected.setTaxCode("BBBBBBBB");
    assertEquals(expected, s);
  }

  /** Test the property 'addressStreet' */
  @Test
  public void addressStreetTest() {
    assertNull(model.getAddressStreet());
    model.setAddressStreet("Via al Brembo");
    assertEquals("Via al Brembo", model.getAddressStreet());
    Supplier s = model.addressStreet("Via Gennaro Gattuso");
    Supplier expected = new Supplier();
    expected.setAddressStreet("Via Gennaro Gattuso");
    assertEquals(expected, s);
  }

  /** Test the property 'addressPostalCode' */
  @Test
  public void addressPostalCodeTest() {
    assertNull(model.getAddressPostalCode());
    model.setAddressPostalCode("24044");
    assertEquals("24044", model.getAddressPostalCode());
    Supplier s = model.addressPostalCode("24022");
    Supplier expected = new Supplier();
    expected.setAddressPostalCode("24022");
    assertEquals(expected, s);
  }

  /** Test the property 'addressCity' */
  @Test
  public void addressCityTest() {
    assertNull(model.getAddressCity());
    model.setAddressCity("Mazara del Vallo");
    assertEquals("Mazara del Vallo", model.getAddressCity());
    Supplier s = model.addressCity("Dalmine");
    Supplier expected = new Supplier();
    expected.setAddressCity("Dalmine");
    assertEquals(expected, s);
  }

  /** Test the property 'addressProvince' */
  @Test
  public void addressProvinceTest() {
    assertNull(model.getAddressCity());
    model.setAddressCity("TP");
    assertEquals("TP", model.getAddressCity());
    Supplier s = model.addressCity("BG");
    Supplier expected = new Supplier();
    expected.setAddressCity("BG");
    assertEquals(expected, s);
  }

  /** Test the property 'addressExtra' */
  @Test
  public void addressExtraTest() {
    assertNull(model.getAddressExtra());
    model.setAddressExtra("Interno 2");
    assertEquals("Interno 2", model.getAddressExtra());
    Supplier s = model.addressExtra("Scala interna");
    Supplier expected = new Supplier();
    expected.setAddressExtra("Scala interna");
    assertEquals(expected, s);
  }

  /** Test the property 'country' */
  @Test
  public void countryTest() {
    assertEquals(null, model.getCountry());
    model.setCountry("Venezuela");
    assertEquals("Venezuela", model.getCountry());
    Supplier s = model.country("Colombia");
    Supplier expected = new Supplier();
    expected.setCountry("Colombia");
    assertEquals(expected, s);
  }

  /** Test the property 'email' */
  @Test
  public void emailTest() {
    assertNull(model.getEmail());
    model.setEmail("example@yopmail.com");
    assertEquals("example@yopmail.com", model.getEmail());
    Supplier s = model.email("fake@gmail.com");
    Supplier expected = new Supplier();
    expected.setEmail("fake@gmail.com");
    assertEquals(expected, s);
  }

  /** Test the property 'certifiedEmail' */
  @Test
  public void certifiedEmailTest() {
    assertNull(model.getCertifiedEmail());
    model.setCertifiedEmail("example@pec.yopmail.com");
    assertEquals("example@pec.yopmail.com", model.getCertifiedEmail());
    Supplier s = model.certifiedEmail("fake@pec.gmail.com");
    Supplier expected = new Supplier();
    expected.setCertifiedEmail("fake@pec.gmail.com");
    assertEquals(expected, s);
  }

  /** Test the property 'phone' */
  @Test
  public void phoneTest() {
    assertNull(model.getPhone());
    model.setPhone("3280000001");
    assertEquals("3280000001", model.getPhone());
    Supplier s = model.phone("035500001");
    Supplier expected = new Supplier();
    expected.setPhone("035500001");
    assertEquals(expected, s);
  }

  /** Test the property 'fax' */
  @Test
  public void faxTest() {
    assertNull(model.getFax());
    model.setFax("3280000001");
    assertEquals("3280000001", model.getFax());
    Supplier s = model.fax("035500001");
    Supplier expected = new Supplier();
    expected.setFax("035500001");
    assertEquals(expected, s);
  }

  /** Test the property 'notes' */
  @Test
  public void notesTest() {
    assertNull(model.getNotes());
    model.setNotes("Bla bla bla");
    assertEquals("Bla bla bla", model.getNotes());
    Supplier s = model.notes("Annamo a pijà er gelato?");
    Supplier expected = new Supplier();
    expected.setNotes("Annamo a pijà er gelato?");
    assertEquals(expected, s);
  }

  /** Test the property 'createdAt' */
  @Test
  public void createdAtTest() {
    assertNull(model.getCreatedAt());
    model.setCreatedAt("2021-04-29 08:53:07");
    assertEquals("2021-04-29 08:53:07", model.getCreatedAt());
    Supplier s = model.createdAt("2021-12-23 09:19:07");
    Supplier expected = new Supplier();
    expected.setCreatedAt("2021-12-23 09:19:07");
    assertEquals(expected, s);
  }

  /** Test the property 'updatedAt' */
  @Test
  public void updatedAtTest() {
    assertNull(model.getUpdatedAt());
    model.setUpdatedAt("2021-04-29 08:53:07");
    assertEquals("2021-04-29 08:53:07", model.getUpdatedAt());
    Supplier s = model.updatedAt("2021-12-23 09:19:07");
    Supplier expected = new Supplier();
    expected.setUpdatedAt("2021-12-23 09:19:07");
    assertEquals(expected, s);
  }
}
