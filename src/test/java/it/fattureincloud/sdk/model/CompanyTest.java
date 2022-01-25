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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for Company
 */
public class CompanyTest {
    private Company model;

    @BeforeEach
    public void init() {
        model = new Company()
                .id(5)
                .name("Azienda 1")
                .type(CompanyType.COMPANY)
                .accessToken("ABCDEF")
                .connectionId(94817)
                .controlledCompanies(new ArrayList<>())
                .taxCode("SLVMTT50A01F205L");
    }

    /**
     * Model tests for Company
     */
    @Test
    public void testCompany() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"id\":5,\"name\":\"Azienda 1\",\"type\":\"company\",\"access_token\":\"ABCDEF\",\"controlled_companies\":[],\"connection_id\":94817,\"tax_code\":\"SLVMTT50A01F205L\"}";
        assertEquals(str, json);
        Company generated = gson.fromJson(str, Company.class);
        assertEquals(model, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        assertEquals(5, model.getId());
        model.setId(3);
        assertEquals(3, model.getId());

        Company c = model.id(69);
        Company expected = new Company()
                .id(69)
                .name("Azienda 1")
                .type(CompanyType.COMPANY)
                .accessToken("ABCDEF")
                .connectionId(94817)
                .controlledCompanies(new ArrayList<>())
                .taxCode("SLVMTT50A01F205L");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        assertEquals("Azienda 1", model.getName());
        model.setName("Fatture in Cloud");
        assertEquals("Fatture in Cloud", model.getName());

        Company c = model.name("Milan AC");
        Company expected = new Company()
                .id(5)
                .name("Milan AC")
                .accessToken("ABCDEF")
                .type(CompanyType.COMPANY)
                .connectionId(94817)
                .controlledCompanies(new ArrayList<>())
                .taxCode("SLVMTT50A01F205L");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        assertEquals(CompanyType.COMPANY, model.getType());
        model.setType(CompanyType.ACCOUNTANT);
        assertEquals(CompanyType.ACCOUNTANT, model.getType());

        Company c = model.type(CompanyType.COMPANY);
        Company expected = new Company()
                .id(5)
                .name("Azienda 1")
                .accessToken("ABCDEF")
                .type(CompanyType.COMPANY)
                .connectionId(94817)
                .controlledCompanies(new ArrayList<>())
                .taxCode("SLVMTT50A01F205L");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'accessToken'
     */
    @Test
    public void accessTokenTest() {
        assertEquals("ABCDEF", model.getAccessToken());
        model.setAccessToken("GHIJKL");
        assertEquals("GHIJKL", model.getAccessToken());

        Company c = model.accessToken("MNOPQR");
        Company expected = new Company()
                .id(5)
                .name("Azienda 1")
                .accessToken("ABCDEF")
                .type(CompanyType.COMPANY)
                .accessToken("MNOPQR")
                .connectionId(94817)
                .controlledCompanies(new ArrayList<>())
                .taxCode("SLVMTT50A01F205L");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'controlledCompanies'
     */
    @Test
    public void controlledCompaniesTest() {
        ControlledCompany cc = new ControlledCompany()
                .id(99)
                .name("Vini Benzene")
                .accessToken("QQQQQ")
                .type(CompanyType.COMPANY)
                .accessToken("QQQQQ")
                .connectionId(BigDecimal.valueOf(54321))
                .taxCode("SLVMTT50A01F205L");

        assertEquals(Collections.emptyList(), model.getControlledCompanies());
        List<ControlledCompany> c1 = Arrays.asList(cc);
        model.setControlledCompanies(c1);
        assertEquals(c1, model.getControlledCompanies());

        List<ControlledCompany> c2 = Arrays.asList(cc, new ControlledCompany()
                .id(100)
                .name("Agenzia Immobiliare Baracca")
                .accessToken("BBBBB")
                .type(CompanyType.COMPANY)
                .accessToken("BBBBB")
                .connectionId(BigDecimal.valueOf(54321))
                .taxCode("SLVMTT50A01F205L"));

        Company c = model.controlledCompanies(c2);
        Company expected = new Company()
                .id(5)
                .name("Azienda 1")
                .accessToken("ABCDEF")
                .type(CompanyType.COMPANY)
                .connectionId(94817)
                .controlledCompanies(c2)
                .taxCode("SLVMTT50A01F205L");
        assertEquals(expected, c);

        model.setControlledCompanies(new ArrayList<>());

        ControlledCompany added = new ControlledCompany()
                .id(100)
                .name("Laser Game")
                .accessToken("LLLLL")
                .type(CompanyType.COMPANY)
                .accessToken("LLLLL")
                .connectionId(BigDecimal.valueOf(54321))
                .taxCode("SLVMTT50A01F205L");

        Company a = model.addControlledCompaniesItem(added);
        Company expectedA = new Company()
                .id(5)
                .name("Azienda 1")
                .type(CompanyType.COMPANY)
                .accessToken("ABCDEF")
                .connectionId(94817)
                .controlledCompanies(Arrays.asList(added))
                .taxCode("SLVMTT50A01F205L");
        assertEquals(expectedA, a);
    }

    /**
     * Test the property 'connectionId'
     */
    @Test
    public void connectionIdTest() {
        assertEquals(94817, model.getConnectionId());
        model.setConnectionId(11111);
        assertEquals(11111, model.getConnectionId());

        Company c = model.connectionId(22222);
        Company expected = new Company()
                .id(5)
                .name("Azienda 1")
                .accessToken("ABCDEF")
                .type(CompanyType.COMPANY)
                .connectionId(22222)
                .controlledCompanies(new ArrayList<>())
                .taxCode("SLVMTT50A01F205L");
        assertEquals(expected, c);
    }

    /**
     * Test the property 'taxCode'
     */
    @Test
    public void taxCodeTest() {
        assertEquals("SLVMTT50A01F205L", model.getTaxCode());
        model.setTaxCode("CPRSLD88A01L218N");
        assertEquals("CPRSLD88A01L218N", model.getTaxCode());

        Company c = model.taxCode("LTTDTT90A41F205S");
        Company expected = new Company()
                .id(5)
                .name("Azienda 1")
                .accessToken("ABCDEF")
                .type(CompanyType.COMPANY)
                .connectionId(94817)
                .controlledCompanies(new ArrayList<>())
                .taxCode("LTTDTT90A41F205S");
        assertEquals(expected, c);
    }

}
