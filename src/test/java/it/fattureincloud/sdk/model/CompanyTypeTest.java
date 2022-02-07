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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Model tests for CompanyType
 */
public class CompanyTypeTest {
    /**
     * Model tests for CompanyType
     */
    @Test
    public void testCompanyType() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();

        assertEquals("\"company\"", gson.toJson(CompanyType.COMPANY));
        assertEquals("\"accountant\"", gson.toJson(CompanyType.ACCOUNTANT));

        assertEquals(CompanyType.COMPANY, gson.fromJson("\"company\"", CompanyType.class));
        assertEquals(CompanyType.ACCOUNTANT, gson.fromJson("\"accountant\"", CompanyType.class));

        assertEquals("company", CompanyType.COMPANY.getValue());
        assertEquals("accountant", CompanyType.ACCOUNTANT.getValue());

        assertEquals("company", CompanyType.COMPANY.toString());
        assertEquals("accountant", CompanyType.ACCOUNTANT.toString());

        assertEquals(CompanyType.COMPANY, CompanyType.fromValue("company"));
        assertEquals(CompanyType.ACCOUNTANT, CompanyType.fromValue("accountant"));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CompanyType.fromValue("Evil Joshua");
        });
    }

}
