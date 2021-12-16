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


package it.fattureincloud.sdk.api;

import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.model.CreateProductRequest;
import it.fattureincloud.sdk.model.CreateProductResponse;
import it.fattureincloud.sdk.model.GetProductResponse;
import it.fattureincloud.sdk.model.ListProductsResponse;
import it.fattureincloud.sdk.model.ModifyProductRequest;
import it.fattureincloud.sdk.model.ModifyProductResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductsApi
 */
@Ignore
public class ProductsApiTest {

    private final ProductsApi api = new ProductsApi();

    
    /**
     * Create Product
     *
     * Creates a new product.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProductTest() throws ApiException {
        Integer companyId = null;
        CreateProductRequest createProductRequest = null;
                CreateProductResponse response = api.createProduct(companyId, createProductRequest);
        // TODO: test validations
    }
    
    /**
     * Delete Product
     *
     * Deletes the specified product.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProductTest() throws ApiException {
        Integer companyId = null;
        Integer productId = null;
                api.deleteProduct(companyId, productId);
        // TODO: test validations
    }
    
    /**
     * Get Product
     *
     * Gets the specified product.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProductTest() throws ApiException {
        Integer companyId = null;
        Integer productId = null;
        String fields = null;
        String fieldset = null;
                GetProductResponse response = api.getProduct(companyId, productId, fields, fieldset);
        // TODO: test validations
    }
    
    /**
     * List Products
     *
     * Lists the products.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProductsTest() throws ApiException {
        Integer companyId = null;
        String fields = null;
        String fieldset = null;
        String sort = null;
        Integer page = null;
        Integer perPage = null;
                ListProductsResponse response = api.listProducts(companyId, fields, fieldset, sort, page, perPage);
        // TODO: test validations
    }
    
    /**
     * Modify Product
     *
     * Modifies the specified product.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyProductTest() throws ApiException {
        Integer companyId = null;
        Integer productId = null;
        ModifyProductRequest modifyProductRequest = null;
                ModifyProductResponse response = api.modifyProduct(companyId, productId, modifyProductRequest);
        // TODO: test validations
    }
    
}
