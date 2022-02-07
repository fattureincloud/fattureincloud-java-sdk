/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.7
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.fattureincloud.sdk.model;

import com.google.gson.Gson;
import it.fattureincloud.sdk.JSON;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Model tests for Entity
 */
public class EntityTest {
    private Entity model;

    @BeforeEach
    public void init() {
        model = new Entity();
    }

    /**
     * Model tests for Entity
     */
    @Test
    public void testEntity() {
        Entity e = new Entity()
                .id(16451)
                .code("AE86")
                .name("Avv. Maria Rossi")
                .type(EntityType.PERSON)
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
                .defaultPaymentTermsType(DefaultPaymentTermsType.STANDARD)
                .bankName("Indesa")
                .bankIban("IT40P123456781000000123456")
                .bankSwiftCode("AK86PCT")
                .shippingAddress("Corso Magellano 4")
                .eInvoice(true)
                .eiCode("111111")
                .defaultVat(new VatType()
                        .id(54321)
                        .value(BigDecimal.valueOf(45))
                        .description("")
                        .isDisabled(false)
                )
                .defaultPaymentMethod(new PaymentMethod()
                        .id(386092)
                        .name("Credit card")
                );

        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(e);
        String str = "{\"id\":16451,\"code\":\"AE86\",\"name\":\"Avv. Maria Rossi\",\"type\":\"person\",\"first_name\":\"Maria\",\"last_name\":\"Rossi\",\"contact_person\":\"\",\"vat_number\":\"IT12345640962\",\"tax_code\":\"BLTGNI5ABCDA794E\",\"address_street\":\"Via Roma, 1\",\"address_postal_code\":\"20900\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"email\":\"maria.rossi@example.com\",\"certified_email\":\"maria.rossi@pec.example.com\",\"phone\":\"1234567890\",\"fax\":\"\",\"notes\":\"\",\"default_vat\":{\"id\":54321,\"value\":45,\"description\":\"\",\"editable\":true,\"is_disabled\":false},\"default_payment_terms\":1,\"default_payment_terms_type\":\"standard\",\"default_payment_method\":{\"id\":386092,\"name\":\"Credit card\",\"type\":\"standard\"},\"bank_name\":\"Indesa\",\"bank_iban\":\"IT40P123456781000000123456\",\"bank_swift_code\":\"AK86PCT\",\"shipping_address\":\"Corso Magellano 4\",\"e_invoice\":true,\"ei_code\":\"111111\",\"created_at\":\"2021-04-29 08:53:07\",\"updated_at\":\"2021-04-29 08:53:07\"}";
        assertEquals(str, json);
        Entity generated = gson.fromJson(str, Entity.class);
        assertEquals(e, generated);

        Object o = e;
        assertEquals(e, o);
        assertFalse(e.equals(null));
        assertFalse(e.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        assertNull(model.getId());
        model.setId(4);
        assertEquals(4, model.getId());
        Entity e = model.id(6);
        Entity expected = new Entity();
        expected.setId(6);
        assertEquals(expected, e);
    }

    /**
     * Test the property 'code'
     */
    @Test
    public void codeTest() {
        assertNull(model.getCode());
        model.setCode("AE86");
        assertEquals("AE86", model.getCode());
        Entity e = model.code("AE88");
        Entity expected = new Entity();
        expected.setCode("AE88");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        assertNull(model.getName());
        model.setName("Avv. Maria Rossi");
        assertEquals("Avv. Maria Rossi", model.getName());
        Entity e = model.name("Karolina");
        Entity expected = new Entity();
        expected.setName("Karolina");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        assertNull(model.getType());
        model.setType(EntityType.PERSON);
        assertEquals(EntityType.PERSON, model.getType());
        Entity e = model.type(EntityType.CONDO);
        Entity expected = new Entity();
        expected.setType(EntityType.CONDO);
        assertEquals(expected, e);
    }

    /**
     * Test the property 'firstName'
     */
    @Test
    public void firstNameTest() {
        assertNull(model.getFirstName());
        model.setFirstName("Maria");
        assertEquals("Maria", model.getFirstName());
        Entity e = model.firstName("Emma");
        Entity expected = new Entity();
        expected.setFirstName("Emma");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'lastName'
     */
    @Test
    public void lastNameTest() {
        assertNull(model.getLastName());
        model.setLastName("Borgo");
        assertEquals("Borgo", model.getLastName());
        Entity e = model.lastName("Faraone");
        Entity expected = new Entity();
        expected.setLastName("Faraone");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'contactPerson'
     */
    @Test
    public void contactPersonTest() {
        assertNull(model.getContactPerson());
        model.setContactPerson("Daniela");
        assertEquals("Daniela", model.getContactPerson());
        Entity e = model.contactPerson("Isabella");
        Entity expected = new Entity();
        expected.setContactPerson("Isabella");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'vatNumber'
     */
    @Test
    public void vatNumberTest() {
        assertNull(model.getVatNumber());
        model.setVatNumber("AAAAAAAA");
        assertEquals("AAAAAAAA", model.getVatNumber());
        Entity e = model.vatNumber("BBBBBBBB");
        Entity expected = new Entity();
        expected.setVatNumber("BBBBBBBB");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'taxCode'
     */
    @Test
    public void taxCodeTest() {
        assertNull(model.getTaxCode());
        model.setTaxCode("AAAAAAAA");
        assertEquals("AAAAAAAA", model.getTaxCode());
        Entity e = model.taxCode("BBBBBBBB");
        Entity expected = new Entity();
        expected.setTaxCode("BBBBBBBB");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'addressStreet'
     */
    @Test
    public void addressStreetTest() {
        assertNull(model.getAddressStreet());
        model.setAddressStreet("Via al Brembo");
        assertEquals("Via al Brembo", model.getAddressStreet());
        Entity e = model.addressStreet("Via Gennaro Gattuso");
        Entity expected = new Entity();
        expected.setAddressStreet("Via Gennaro Gattuso");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'addressPostalCode'
     */
    @Test
    public void addressPostalCodeTest() {
        assertNull(model.getAddressPostalCode());
        model.setAddressPostalCode("24044");
        assertEquals("24044", model.getAddressPostalCode());
        Entity e = model.addressPostalCode("24022");
        Entity expected = new Entity();
        expected.setAddressPostalCode("24022");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'addressCity'
     */
    @Test
    public void addressCityTest() {
        assertNull(model.getAddressCity());
        model.setAddressCity("Mazara del Vallo");
        assertEquals("Mazara del Vallo", model.getAddressCity());
        Entity e = model.addressCity("Dalmine");
        Entity expected = new Entity();
        expected.setAddressCity("Dalmine");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'addressProvince'
     */
    @Test
    public void addressProvinceTest() {
        assertNull(model.getAddressCity());
        model.setAddressCity("TP");
        assertEquals("TP", model.getAddressCity());
        Entity e = model.addressCity("BG");
        Entity expected = new Entity();
        expected.setAddressCity("BG");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'addressExtra'
     */
    @Test
    public void addressExtraTest() {
        assertNull(model.getAddressExtra());
        model.setAddressExtra("Interno 2");
        assertEquals("Interno 2", model.getAddressExtra());
        Entity e = model.addressExtra("Scala interna");
        Entity expected = new Entity();
        expected.setAddressExtra("Scala interna");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'country'
     */
    @Test
    public void countryTest() {
        assertEquals("Italia", model.getCountry());
        model.setCountry("Venezuela");
        assertEquals("Venezuela", model.getCountry());
        Entity e = model.country("Colombia");
        Entity expected = new Entity();
        expected.setCountry("Colombia");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
        assertNull(model.getEmail());
        model.setEmail("example@yopmail.com");
        assertEquals("example@yopmail.com", model.getEmail());
        Entity e = model.email("fake@gmail.com");
        Entity expected = new Entity();
        expected.setEmail("fake@gmail.com");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'certifiedEmail'
     */
    @Test
    public void certifiedEmailTest() {
        assertNull(model.getCertifiedEmail());
        model.setCertifiedEmail("example@pec.yopmail.com");
        assertEquals("example@pec.yopmail.com", model.getCertifiedEmail());
        Entity e = model.certifiedEmail("fake@pec.gmail.com");
        Entity expected = new Entity();
        expected.setCertifiedEmail("fake@pec.gmail.com");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'phone'
     */
    @Test
    public void phoneTest() {
        assertNull(model.getPhone());
        model.setPhone("3280000001");
        assertEquals("3280000001", model.getPhone());
        Entity e = model.phone("035500001");
        Entity expected = new Entity();
        expected.setPhone("035500001");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'fax'
     */
    @Test
    public void faxTest() {
        assertNull(model.getFax());
        model.setFax("3280000001");
        assertEquals("3280000001", model.getFax());
        Entity e = model.fax("035500001");
        Entity expected = new Entity();
        expected.setFax("035500001");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'notes'
     */
    @Test
    public void notesTest() {
        assertNull(model.getNotes());
        model.setNotes("Bla bla bla");
        assertEquals("Bla bla bla", model.getNotes());
        Entity e = model.notes("Annamo a pijà er gelato?");
        Entity expected = new Entity();
        expected.setNotes("Annamo a pijà er gelato?");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'defaultVat'
     */
    @Test
    public void defaultVatTest() {
        VatType vt1 = new VatType()
                .id(54321)
                .value(BigDecimal.valueOf(45))
                .description("aaa")
                .isDisabled(false);

        VatType vt2 = new VatType()
                .id(88888)
                .value(BigDecimal.valueOf(55))
                .description("bbb")
                .isDisabled(true);

        assertNull(model.getDefaultVat());
        model.setDefaultVat(vt1);
        assertEquals(vt1, model.getDefaultVat());
        Entity e = model.defaultVat(vt2);
        Entity expected = new Entity();
        expected.setDefaultVat(vt2);
        assertEquals(expected, e);
    }

    /**
     * Test the property 'defaultPaymentTerms'
     */
    @Test
    public void defaultPaymentTermsTest() {
        assertNull(model.getDefaultPaymentTerms());
        model.setDefaultPaymentTerms(1);
        assertEquals(1, model.getDefaultPaymentTerms());
        Entity e = model.defaultPaymentTerms(2);
        Entity expected = new Entity();
        expected.setDefaultPaymentTerms(2);
        assertEquals(expected, e);
    }

    /**
     * Test the property 'defaultPaymentTermsType'
     */
    @Test
    public void defaultPaymentTermsTypeTest() {
        assertEquals(DefaultPaymentTermsType.STANDARD, model.getDefaultPaymentTermsType());
        model.setDefaultPaymentTermsType(DefaultPaymentTermsType.END_OF_MONTH);
        assertEquals(DefaultPaymentTermsType.END_OF_MONTH, model.getDefaultPaymentTermsType());
        Entity e = model.defaultPaymentTermsType(DefaultPaymentTermsType.STANDARD);
        Entity expected = new Entity();
        expected.setDefaultPaymentTermsType(DefaultPaymentTermsType.STANDARD);
        assertEquals(expected, e);
    }

    /**
     * Test the property 'defaultPaymentMethod'
     */
    @Test
    public void defaultPaymentMethodTest() {
        PaymentMethod pm1 = new PaymentMethod()
                .id(54321)
                .name("Credit card");

        PaymentMethod pm2 = new PaymentMethod()
                .id(88888)
                .name("Assegno");

        assertNull(model.getDefaultPaymentMethod());
        model.setDefaultPaymentMethod(pm1);
        assertEquals(pm1, model.getDefaultPaymentMethod());
        Entity e = model.defaultPaymentMethod(pm2);
        Entity expected = new Entity();
        expected.setDefaultPaymentMethod(pm2);
        assertEquals(expected, e);
    }

    /**
     * Test the property 'bankName'
     */
    @Test
    public void bankNameTest() {
        assertNull(model.getBankName());
        model.setBankName("Indesa");
        assertEquals("Indesa", model.getBankName());
        Entity e = model.bankName("ValBank");
        Entity expected = new Entity();
        expected.setBankName("ValBank");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'bankIban'
     */
    @Test
    public void bankIbanTest() {
        assertNull(model.getBankIban());
        model.setBankIban("IT48R0300203280551312765754");
        assertEquals("IT48R0300203280551312765754", model.getBankIban());
        Entity e = model.bankIban("IT48V0300203280246741553272");
        Entity expected = new Entity();
        expected.setBankIban("IT48V0300203280246741553272");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'bankSwiftCode'
     */
    @Test
    public void bankSwiftCodeTest() {
        assertNull(model.getBankSwiftCode());
        model.setBankSwiftCode("AAA");
        assertEquals("AAA", model.getBankSwiftCode());
        Entity e = model.bankSwiftCode("bbb");
        Entity expected = new Entity();
        expected.setBankSwiftCode("bbb");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'shippingAddress'
     */
    @Test
    public void shippingAddressTest() {
        assertNull(model.getShippingAddress());
        model.setShippingAddress("Via Gerolamo Zanchi 22c");
        assertEquals("Via Gerolamo Zanchi 22c", model.getShippingAddress());
        Entity e = model.shippingAddress("Via Monte Grappa, 7");
        Entity expected = new Entity();
        expected.setShippingAddress("Via Monte Grappa, 7");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'eInvoice'
     */
    @Test
    public void eInvoiceTest() {
        assertEquals(false, model.geteInvoice());
        model.seteInvoice(true);
        assertEquals(true, model.geteInvoice());
        Entity e = model.eInvoice(false);
        Entity expected = new Entity();
        expected.seteInvoice(false);
        assertEquals(expected, e);
    }

    /**
     * Test the property 'eiCode'
     */
    @Test
    public void eiCodeTest() {
        assertNull(model.getEiCode());
        model.setEiCode("AAA");
        assertEquals("AAA", model.getEiCode());
        Entity e = model.eiCode("BBB");
        Entity expected = new Entity();
        expected.setEiCode("BBB");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        assertNull(model.getCreatedAt());
        model.setCreatedAt("2021-04-29 08:53:07");
        assertEquals("2021-04-29 08:53:07", model.getCreatedAt());
        Entity e = model.createdAt("2021-12-23 09:19:07");
        Entity expected = new Entity();
        expected.setCreatedAt("2021-12-23 09:19:07");
        assertEquals(expected, e);
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        assertNull(model.getUpdatedAt());
        model.setUpdatedAt("2021-04-29 08:53:07");
        assertEquals("2021-04-29 08:53:07", model.getUpdatedAt());
        Entity e = model.updatedAt("2021-12-23 09:19:07");
        Entity expected = new Entity();
        expected.setUpdatedAt("2021-12-23 09:19:07");
        assertEquals(expected, e);
    }

}
