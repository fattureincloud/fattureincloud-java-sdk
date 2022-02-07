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

import static org.junit.jupiter.api.Assertions.*;


/**
 * Model tests for CompanyInfoPlanInfoLimits
 */
public class CompanyInfoPlanInfoLimitsTest {
    private CompanyInfoPlanInfoLimits model;

    @BeforeEach
    public void init() {
        model = new CompanyInfoPlanInfoLimits();
    }

    /**
     * Model tests for CompanyInfoPlanInfoLimits
     */
    @Test
    public void testCompanyInfoPlanInfoLimits() {
        CompanyInfoPlanInfoLimits c = new CompanyInfoPlanInfoLimits()
                .clients(5000)
                .suppliers(5000)
                .products(5000)
                .documents(3000);

        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(c);
        String str = "{\"clients\":5000,\"suppliers\":5000,\"products\":5000,\"documents\":3000}";
        assertEquals(str, json);
        CompanyInfoPlanInfoLimits generated = gson.fromJson(str, CompanyInfoPlanInfoLimits.class);
        assertEquals(c, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'clients'
     */
    @Test
    public void clientsTest() {
        assertNull(model.getClients());
        model.setClients(1);
        assertEquals(1, model.getClients());

        CompanyInfoPlanInfoLimits c = model.clients(2);
        CompanyInfoPlanInfoLimits expected = new CompanyInfoPlanInfoLimits();
        expected.setClients(2);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'suppliers'
     */
    @Test
    public void suppliersTest() {
        assertNull(model.getSuppliers());
        model.setSuppliers(1);
        assertEquals(1, model.getSuppliers());

        CompanyInfoPlanInfoLimits c = model.suppliers(2);
        CompanyInfoPlanInfoLimits expected = new CompanyInfoPlanInfoLimits();
        expected.setSuppliers(2);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'products'
     */
    @Test
    public void productsTest() {
        assertNull(model.getProducts());
        model.setProducts(1);
        assertEquals(1, model.getProducts());

        CompanyInfoPlanInfoLimits c = model.products(2);
        CompanyInfoPlanInfoLimits expected = new CompanyInfoPlanInfoLimits();
        expected.setProducts(2);
        assertEquals(expected, c);
    }

    /**
     * Test the property 'documents'
     */
    @Test
    public void documentsTest() {
        assertNull(model.getDocuments());
        model.setDocuments(1);
        assertEquals(1, model.getDocuments());

        CompanyInfoPlanInfoLimits c = model.documents(2);
        CompanyInfoPlanInfoLimits expected = new CompanyInfoPlanInfoLimits();
        expected.setDocuments(2);
        assertEquals(expected, c);
    }

}
