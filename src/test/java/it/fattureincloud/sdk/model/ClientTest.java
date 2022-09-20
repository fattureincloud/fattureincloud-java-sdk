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

import com.google.gson.Gson;
import it.fattureincloud.sdk.JSON;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Model tests for Client
 */
public class ClientTest {
    private Client model;

    @BeforeEach
    public void init() {
        model = new Client();
    }

    /**
     * Model tests for Client
     */
    @Test
    public void testClient() {
        Client c = new Client()
                .id(16451)
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
        String json = gson.toJson(c);
        String str = "{\"id\":16451,\"code\":\"AE86\",\"name\":\"Avv. Maria Rossi\",\"type\":\"person\",\"first_name\":\"Maria\",\"last_name\":\"Rossi\",\"contact_person\":\"\",\"vat_number\":\"IT12345640962\",\"tax_code\":\"BLTGNI5ABCDA794E\",\"address_street\":\"Via Roma, 1\",\"address_postal_code\":\"20900\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"email\":\"maria.rossi@example.com\",\"certified_email\":\"maria.rossi@pec.example.com\",\"phone\":\"1234567890\",\"fax\":\"\",\"notes\":\"\",\"default_vat\":{\"id\":54321,\"value\":45,\"description\":\"\",\"is_disabled\":false},\"default_payment_terms\":1,\"default_payment_terms_type\":\"standard\",\"default_payment_method\":{\"id\":386092,\"name\":\"Credit card\",\"type\":\"standard\"},\"bank_name\":\"Indesa\",\"bank_iban\":\"IT40P123456781000000123456\",\"bank_swift_code\":\"AK86PCT\",\"shipping_address\":\"Corso Magellano 4\",\"e_invoice\":true,\"ei_code\":\"111111\",\"created_at\":\"2021-04-29 08:53:07\",\"updated_at\":\"2021-04-29 08:53:07\"}";
        assertEquals(str, json);
        Client generated = gson.fromJson(str, Client.class);
        assertEquals(c, generated);

        Object o = c;
        assertEquals(c, o);
        assertFalse(c.equals(null));
        assertFalse(c.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        assertNull(model.getId());
        model.setId(4);
        assertEquals(4, model.getId());
        Client c = model.id(6);
        Client expected = new Client();
        expected.setId(6);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'code'
     */
    @Test
    public void codeTest() {
        assertNull(model.getCode());
        model.setCode("AE86");
        assertEquals("AE86", model.getCode());
        Client c = model.code("AE88");
        Client expected = new Client();
        expected.setCode("AE88");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        assertNull(model.getName());
        model.setName("Avv. Maria Rossi");
        assertEquals("Avv. Maria Rossi", model.getName());
        Client c = model.name("Karolina");
        Client expected = new Client();
        expected.setName("Karolina");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        assertNull(model.getType());
        model.setType(ClientType.PERSON);
        assertEquals(ClientType.PERSON, model.getType());
        Client c = model.type(ClientType.CONDO);
        Client expected = new Client();
        expected.setType(ClientType.CONDO);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'firstName'
     */
    @Test
    public void firstNameTest() {
        assertNull(model.getFirstName());
        model.setFirstName("Maria");
        assertEquals("Maria", model.getFirstName());
        Client c = model.firstName("Emma");
        Client expected = new Client();
        expected.setFirstName("Emma");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'lastName'
     */
    @Test
    public void lastNameTest() {
        assertNull(model.getLastName());
        model.setLastName("Borgo");
        assertEquals("Borgo", model.getLastName());
        Client c = model.lastName("Faraone");
        Client expected = new Client();
        expected.setLastName("Faraone");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'contactPerson'
     */
    @Test
    public void contactPersonTest() {
        assertNull(model.getContactPerson());
        model.setContactPerson("Daniela");
        assertEquals("Daniela", model.getContactPerson());
        Client c = model.contactPerson("Isabella");
        Client expected = new Client();
        expected.setContactPerson("Isabella");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'vatNumber'
     */
    @Test
    public void vatNumberTest() {
        assertNull(model.getVatNumber());
        model.setVatNumber("AAAAAAAA");
        assertEquals("AAAAAAAA", model.getVatNumber());
        Client c = model.vatNumber("BBBBBBBB");
        Client expected = new Client();
        expected.setVatNumber("BBBBBBBB");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'taxCode'
     */
    @Test
    public void taxCodeTest() {
        assertNull(model.getTaxCode());
        model.setTaxCode("AAAAAAAA");
        assertEquals("AAAAAAAA", model.getTaxCode());
        Client c = model.taxCode("BBBBBBBB");
        Client expected = new Client();
        expected.setTaxCode("BBBBBBBB");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'addressStreet'
     */
    @Test
    public void addressStreetTest() {
        assertNull(model.getAddressStreet());
        model.setAddressStreet("Via al Brembo");
        assertEquals("Via al Brembo", model.getAddressStreet());
        Client c = model.addressStreet("Via Gennaro Gattuso");
        Client expected = new Client();
        expected.setAddressStreet("Via Gennaro Gattuso");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'addressPostalCode'
     */
    @Test
    public void addressPostalCodeTest() {
        assertNull(model.getAddressPostalCode());
        model.setAddressPostalCode("24044");
        assertEquals("24044", model.getAddressPostalCode());
        Client c = model.addressPostalCode("24022");
        Client expected = new Client();
        expected.setAddressPostalCode("24022");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'addressCity'
     */
    @Test
    public void addressCityTest() {
        assertNull(model.getAddressCity());
        model.setAddressCity("Mazara del Vallo");
        assertEquals("Mazara del Vallo", model.getAddressCity());
        Client c = model.addressCity("Dalmine");
        Client expected = new Client();
        expected.setAddressCity("Dalmine");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'addressProvince'
     */
    @Test
    public void addressProvinceTest() {
        assertNull(model.getAddressCity());
        model.setAddressCity("TP");
        assertEquals("TP", model.getAddressCity());
        Client c = model.addressCity("BG");
        Client expected = new Client();
        expected.setAddressCity("BG");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'addressExtra'
     */
    @Test
    public void addressExtraTest() {
        assertNull(model.getAddressExtra());
        model.setAddressExtra("Interno 2");
        assertEquals("Interno 2", model.getAddressExtra());
        Client c = model.addressExtra("Scala interna");
        Client expected = new Client();
        expected.setAddressExtra("Scala interna");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'country'
     */
    @Test
    public void countryTest() {
        assertEquals(null, model.getCountry());
        model.setCountry("Venezuela");
        assertEquals("Venezuela", model.getCountry());
        Client c = model.country("Colombia");
        Client expected = new Client();
        expected.setCountry("Colombia");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
        assertNull(model.getEmail());
        model.setEmail("example@yopmail.com");
        assertEquals("example@yopmail.com", model.getEmail());
        Client c = model.email("fake@gmail.com");
        Client expected = new Client();
        expected.setEmail("fake@gmail.com");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'certifiedEmail'
     */
    @Test
    public void certifiedEmailTest() {
        assertNull(model.getCertifiedEmail());
        model.setCertifiedEmail("example@pec.yopmail.com");
        assertEquals("example@pec.yopmail.com", model.getCertifiedEmail());
        Client c = model.certifiedEmail("fake@pec.gmail.com");
        Client expected = new Client();
        expected.setCertifiedEmail("fake@pec.gmail.com");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'phone'
     */
    @Test
    public void phoneTest() {
        assertNull(model.getPhone());
        model.setPhone("3280000001");
        assertEquals("3280000001", model.getPhone());
        Client c = model.phone("035500001");
        Client expected = new Client();
        expected.setPhone("035500001");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'fax'
     */
    @Test
    public void faxTest() {
        assertNull(model.getFax());
        model.setFax("3280000001");
        assertEquals("3280000001", model.getFax());
        Client c = model.fax("035500001");
        Client expected = new Client();
        expected.setFax("035500001");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'notes'
     */
    @Test
    public void notesTest() {
        assertNull(model.getNotes());
        model.setNotes("Bla bla bla");
        assertEquals("Bla bla bla", model.getNotes());
        Client c = model.notes("Annamo a pijà er gelato?");
        Client expected = new Client();
        expected.setNotes("Annamo a pijà er gelato?");
        assertEquals(expected, c);
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
        Client c = model.defaultVat(vt2);
        Client expected = new Client();
        expected.setDefaultVat(vt2);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'defaultPaymentTerms'
     */
    @Test
    public void defaultPaymentTermsTest() {
        assertNull(model.getDefaultPaymentTerms());
        model.setDefaultPaymentTerms(1);
        assertEquals(1, model.getDefaultPaymentTerms());
        Client c = model.defaultPaymentTerms(2);
        Client expected = new Client();
        expected.setDefaultPaymentTerms(2);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'defaultPaymentTermsType'
     */
    @Test
    public void defaultPaymentTermsTypeTest() {
        assertEquals(PaymentTermsType.STANDARD, model.getDefaultPaymentTermsType());
        model.setDefaultPaymentTermsType(PaymentTermsType.END_OF_MONTH);
        assertEquals(PaymentTermsType.END_OF_MONTH, model.getDefaultPaymentTermsType());
        Client c = model.defaultPaymentTermsType(PaymentTermsType.STANDARD);
        Client expected = new Client();
        expected.setDefaultPaymentTermsType(PaymentTermsType.STANDARD);
        assertEquals(expected, c);
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
        Client c = model.defaultPaymentMethod(pm2);
        Client expected = new Client();
        expected.setDefaultPaymentMethod(pm2);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'bankName'
     */
    @Test
    public void bankNameTest() {
        assertNull(model.getBankName());
        model.setBankName("Indesa");
        assertEquals("Indesa", model.getBankName());
        Client c = model.bankName("ValBank");
        Client expected = new Client();
        expected.setBankName("ValBank");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'bankIban'
     */
    @Test
    public void bankIbanTest() {
        assertNull(model.getBankIban());
        model.setBankIban("IT48R0300203280551312765754");
        assertEquals("IT48R0300203280551312765754", model.getBankIban());
        Client c = model.bankIban("IT48V0300203280246741553272");
        Client expected = new Client();
        expected.setBankIban("IT48V0300203280246741553272");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'bankSwiftCode'
     */
    @Test
    public void bankSwiftCodeTest() {
        assertNull(model.getBankSwiftCode());
        model.setBankSwiftCode("AAA");
        assertEquals("AAA", model.getBankSwiftCode());
        Client c = model.bankSwiftCode("bbb");
        Client expected = new Client();
        expected.setBankSwiftCode("bbb");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'shippingAddress'
     */
    @Test
    public void shippingAddressTest() {
        assertNull(model.getShippingAddress());
        model.setShippingAddress("Via Gerolamo Zanchi 22c");
        assertEquals("Via Gerolamo Zanchi 22c", model.getShippingAddress());
        Client c = model.shippingAddress("Via Monte Grappa, 7");
        Client expected = new Client();
        expected.setShippingAddress("Via Monte Grappa, 7");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'eInvoice'
     */
    @Test
    public void eInvoiceTest() {
        assertEquals(null, model.geteInvoice());
        model.seteInvoice(true);
        assertEquals(true, model.geteInvoice());
        Client c = model.eInvoice(false);
        Client expected = new Client();
        expected.seteInvoice(false);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'eiCode'
     */
    @Test
    public void eiCodeTest() {
        assertNull(model.getEiCode());
        model.setEiCode("AAA");
        assertEquals("AAA", model.getEiCode());
        Client c = model.eiCode("BBB");
        Client expected = new Client();
        expected.setEiCode("BBB");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        assertNull(model.getCreatedAt());
        model.setCreatedAt("2021-04-29 08:53:07");
        assertEquals("2021-04-29 08:53:07", model.getCreatedAt());
        Client c = model.createdAt("2021-12-23 09:19:07");
        Client expected = new Client();
        expected.setCreatedAt("2021-12-23 09:19:07");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        assertNull(model.getUpdatedAt());
        model.setUpdatedAt("2021-04-29 08:53:07");
        assertEquals("2021-04-29 08:53:07", model.getUpdatedAt());
        Client c = model.updatedAt("2021-12-23 09:19:07");
        Client expected = new Client();
        expected.setUpdatedAt("2021-12-23 09:19:07");
        assertEquals(expected, c);
    }

}
