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

import static org.junit.jupiter.api.Assertions.*;


/**
 * Model tests for ListUserCompaniesResponseData
 */
public class ListUserCompaniesResponseDataTest {
    private ListUserCompaniesResponseData model;

    @BeforeEach
    public void init() {
        model = new ListUserCompaniesResponseData();
    }

    /**
     * Model tests for ListUserCompaniesResponseData
     */
    @Test
    public void testListUserCompaniesResponseData() {
        ListUserCompaniesResponseData rd = new ListUserCompaniesResponseData()
                .companies(Arrays.asList(new Company()
                        .id(12345)
                        .name("Studio Commercialista")
                        .taxCode("ABCSFN94T17A794K")
                        .type(CompanyType.ACCOUNTANT)
                        .accessToken("fc3c89ba29a926f9ef20203577c00ada")
                        .connectionId(BigDecimal.valueOf(94566))
                        .controlledCompanies(new ArrayList<>())
                ));

        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(rd);
        String str = "{\"companies\":[{\"id\":12345,\"name\":\"Studio Commercialista\",\"type\":\"accountant\",\"access_token\":\"fc3c89ba29a926f9ef20203577c00ada\",\"controlled_companies\":[],\"connection_id\":94566,\"tax_code\":\"ABCSFN94T17A794K\"}]}";
        assertEquals(str, json);
        ListUserCompaniesResponseData generated = gson.fromJson(str, ListUserCompaniesResponseData.class);
        assertEquals(rd, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'companies'
     */
    @Test
    public void companiesTest() {
        Company c1 = new Company().id(1);
        Company c2 = new Company().id(2);

        assertNull(model.getCompanies());
        model.setCompanies(Arrays.asList(c1, c2));
        assertEquals(Arrays.asList(c1, c2), model.getCompanies());

        ListUserCompaniesResponseData u = model.companies(new ArrayList<>());
        ListUserCompaniesResponseData expected = new ListUserCompaniesResponseData()
                .companies(new ArrayList<>());
        assertEquals(expected, u);
        u.addCompaniesItem(c2);
        assertEquals(Arrays.asList(c2), model.getCompanies());
    }

}
