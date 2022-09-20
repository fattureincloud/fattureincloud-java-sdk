/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.20
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.api;

import com.google.gson.reflect.TypeToken;
import it.fattureincloud.sdk.ApiCallback;
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.ApiResponse;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.Pair;
import it.fattureincloud.sdk.model.CreateProductRequest;
import it.fattureincloud.sdk.model.CreateProductResponse;
import it.fattureincloud.sdk.model.GetProductResponse;
import it.fattureincloud.sdk.model.ListProductsResponse;
import it.fattureincloud.sdk.model.ModifyProductRequest;
import it.fattureincloud.sdk.model.ModifyProductResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsApi {
  private ApiClient localVarApiClient;
  private int localHostIndex;
  private String localCustomBaseUrl;

  public ProductsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProductsApi(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public int getHostIndex() {
    return localHostIndex;
  }

  public void setHostIndex(int hostIndex) {
    this.localHostIndex = hostIndex;
  }

  public String getCustomBaseUrl() {
    return localCustomBaseUrl;
  }

  public void setCustomBaseUrl(String customBaseUrl) {
    this.localCustomBaseUrl = customBaseUrl;
  }

  /**
   * Build call for createProduct
   *
   * @param companyId The ID of the company. (required)
   * @param createProductRequest (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createProductCall(
      Integer companyId, CreateProductRequest createProductRequest, final ApiCallback _callback)
      throws ApiException {
    String basePath = null;
    // Operation Servers
    String[] localBasePaths = new String[] {};

    // Determine Base Path to Use
    if (localCustomBaseUrl != null) {
      basePath = localCustomBaseUrl;
    } else if (localBasePaths.length > 0) {
      basePath = localBasePaths[localHostIndex];
    } else {
      basePath = null;
    }

    Object localVarPostBody = createProductRequest;

    // create path and map variables
    String localVarPath =
        "/c/{company_id}/products"
            .replaceAll(
                "\\{" + "company_id" + "\\}", localVarApiClient.escapeString(companyId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    if (localVarContentType != null) {
      localVarHeaderParams.put("Content-Type", localVarContentType);
    }

    String[] localVarAuthNames = new String[] {"OAuth2AuthenticationCodeFlow"};
    return localVarApiClient.buildCall(
        basePath,
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call createProductValidateBeforeCall(
      Integer companyId, CreateProductRequest createProductRequest, final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      throw new ApiException(
          "Missing the required parameter 'companyId' when calling createProduct(Async)");
    }

    okhttp3.Call localVarCall = createProductCall(companyId, createProductRequest, _callback);
    return localVarCall;
  }

  /**
   * Create Product Creates a new product.
   *
   * @param companyId The ID of the company. (required)
   * @param createProductRequest (optional)
   * @return CreateProductResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * </table>
   */
  public CreateProductResponse createProduct(
      Integer companyId, CreateProductRequest createProductRequest) throws ApiException {
    ApiResponse<CreateProductResponse> localVarResp =
        createProductWithHttpInfo(companyId, createProductRequest);
    return localVarResp.getData();
  }

  /**
   * Create Product Creates a new product.
   *
   * @param companyId The ID of the company. (required)
   * @param createProductRequest (optional)
   * @return ApiResponse&lt;CreateProductResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<CreateProductResponse> createProductWithHttpInfo(
      Integer companyId, CreateProductRequest createProductRequest) throws ApiException {
    okhttp3.Call localVarCall =
        createProductValidateBeforeCall(companyId, createProductRequest, null);
    Type localVarReturnType = new TypeToken<CreateProductResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Create Product (asynchronously) Creates a new product.
   *
   * @param companyId The ID of the company. (required)
   * @param createProductRequest (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createProductAsync(
      Integer companyId,
      CreateProductRequest createProductRequest,
      final ApiCallback<CreateProductResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        createProductValidateBeforeCall(companyId, createProductRequest, _callback);
    Type localVarReturnType = new TypeToken<CreateProductResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deleteProduct
   *
   * @param companyId The ID of the company. (required)
   * @param productId The ID of the product. (required)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Product removed. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deleteProductCall(
      Integer companyId, Integer productId, final ApiCallback _callback) throws ApiException {
    String basePath = null;
    // Operation Servers
    String[] localBasePaths = new String[] {};

    // Determine Base Path to Use
    if (localCustomBaseUrl != null) {
      basePath = localCustomBaseUrl;
    } else if (localBasePaths.length > 0) {
      basePath = localBasePaths[localHostIndex];
    } else {
      basePath = null;
    }

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/c/{company_id}/products/{product_id}"
            .replaceAll(
                "\\{" + "company_id" + "\\}", localVarApiClient.escapeString(companyId.toString()))
            .replaceAll(
                "\\{" + "product_id" + "\\}", localVarApiClient.escapeString(productId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    if (localVarContentType != null) {
      localVarHeaderParams.put("Content-Type", localVarContentType);
    }

    String[] localVarAuthNames = new String[] {"OAuth2AuthenticationCodeFlow"};
    return localVarApiClient.buildCall(
        basePath,
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call deleteProductValidateBeforeCall(
      Integer companyId, Integer productId, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      throw new ApiException(
          "Missing the required parameter 'companyId' when calling deleteProduct(Async)");
    }

    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(
          "Missing the required parameter 'productId' when calling deleteProduct(Async)");
    }

    okhttp3.Call localVarCall = deleteProductCall(companyId, productId, _callback);
    return localVarCall;
  }

  /**
   * Delete Product Deletes the specified product.
   *
   * @param companyId The ID of the company. (required)
   * @param productId The ID of the product. (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Product removed. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public void deleteProduct(Integer companyId, Integer productId) throws ApiException {
    deleteProductWithHttpInfo(companyId, productId);
  }

  /**
   * Delete Product Deletes the specified product.
   *
   * @param companyId The ID of the company. (required)
   * @param productId The ID of the product. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Product removed. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Void> deleteProductWithHttpInfo(Integer companyId, Integer productId)
      throws ApiException {
    okhttp3.Call localVarCall = deleteProductValidateBeforeCall(companyId, productId, null);
    return localVarApiClient.execute(localVarCall);
  }

  /**
   * Delete Product (asynchronously) Deletes the specified product.
   *
   * @param companyId The ID of the company. (required)
   * @param productId The ID of the product. (required)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Product removed. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deleteProductAsync(
      Integer companyId, Integer productId, final ApiCallback<Void> _callback) throws ApiException {

    okhttp3.Call localVarCall = deleteProductValidateBeforeCall(companyId, productId, _callback);
    localVarApiClient.executeAsync(localVarCall, _callback);
    return localVarCall;
  }
  /**
   * Build call for getProduct
   *
   * @param companyId The ID of the company. (required)
   * @param productId The ID of the product. (required)
   * @param fields List of comma-separated fields. (optional)
   * @param fieldset Name of the fieldset. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getProductCall(
      Integer companyId,
      Integer productId,
      String fields,
      String fieldset,
      final ApiCallback _callback)
      throws ApiException {
    String basePath = null;
    // Operation Servers
    String[] localBasePaths = new String[] {};

    // Determine Base Path to Use
    if (localCustomBaseUrl != null) {
      basePath = localCustomBaseUrl;
    } else if (localBasePaths.length > 0) {
      basePath = localBasePaths[localHostIndex];
    } else {
      basePath = null;
    }

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/c/{company_id}/products/{product_id}"
            .replaceAll(
                "\\{" + "company_id" + "\\}", localVarApiClient.escapeString(companyId.toString()))
            .replaceAll(
                "\\{" + "product_id" + "\\}", localVarApiClient.escapeString(productId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (fields != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
    }

    if (fieldset != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldset", fieldset));
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    if (localVarContentType != null) {
      localVarHeaderParams.put("Content-Type", localVarContentType);
    }

    String[] localVarAuthNames = new String[] {"OAuth2AuthenticationCodeFlow"};
    return localVarApiClient.buildCall(
        basePath,
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call getProductValidateBeforeCall(
      Integer companyId,
      Integer productId,
      String fields,
      String fieldset,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      throw new ApiException(
          "Missing the required parameter 'companyId' when calling getProduct(Async)");
    }

    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(
          "Missing the required parameter 'productId' when calling getProduct(Async)");
    }

    okhttp3.Call localVarCall = getProductCall(companyId, productId, fields, fieldset, _callback);
    return localVarCall;
  }

  /**
   * Get Product Gets the specified product.
   *
   * @param companyId The ID of the company. (required)
   * @param productId The ID of the product. (required)
   * @param fields List of comma-separated fields. (optional)
   * @param fieldset Name of the fieldset. (optional)
   * @return GetProductResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public GetProductResponse getProduct(
      Integer companyId, Integer productId, String fields, String fieldset) throws ApiException {
    ApiResponse<GetProductResponse> localVarResp =
        getProductWithHttpInfo(companyId, productId, fields, fieldset);
    return localVarResp.getData();
  }

  /**
   * Get Product Gets the specified product.
   *
   * @param companyId The ID of the company. (required)
   * @param productId The ID of the product. (required)
   * @param fields List of comma-separated fields. (optional)
   * @param fieldset Name of the fieldset. (optional)
   * @return ApiResponse&lt;GetProductResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<GetProductResponse> getProductWithHttpInfo(
      Integer companyId, Integer productId, String fields, String fieldset) throws ApiException {
    okhttp3.Call localVarCall =
        getProductValidateBeforeCall(companyId, productId, fields, fieldset, null);
    Type localVarReturnType = new TypeToken<GetProductResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get Product (asynchronously) Gets the specified product.
   *
   * @param companyId The ID of the company. (required)
   * @param productId The ID of the product. (required)
   * @param fields List of comma-separated fields. (optional)
   * @param fieldset Name of the fieldset. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getProductAsync(
      Integer companyId,
      Integer productId,
      String fields,
      String fieldset,
      final ApiCallback<GetProductResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getProductValidateBeforeCall(companyId, productId, fields, fieldset, _callback);
    Type localVarReturnType = new TypeToken<GetProductResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for listProducts
   *
   * @param companyId The ID of the company. (required)
   * @param fields List of comma-separated fields. (optional)
   * @param fieldset Name of the fieldset. (optional)
   * @param sort List of comma-separated fields for result sorting (minus for desc sorting).
   *     (optional)
   * @param page The page to retrieve. (optional, default to 1)
   * @param perPage The size of the page. (optional, default to 5)
   * @param q Query for filtering the results. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Products List. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call listProductsCall(
      Integer companyId,
      String fields,
      String fieldset,
      String sort,
      Integer page,
      Integer perPage,
      String q,
      final ApiCallback _callback)
      throws ApiException {
    String basePath = null;
    // Operation Servers
    String[] localBasePaths = new String[] {};

    // Determine Base Path to Use
    if (localCustomBaseUrl != null) {
      basePath = localCustomBaseUrl;
    } else if (localBasePaths.length > 0) {
      basePath = localBasePaths[localHostIndex];
    } else {
      basePath = null;
    }

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/c/{company_id}/products"
            .replaceAll(
                "\\{" + "company_id" + "\\}", localVarApiClient.escapeString(companyId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (fields != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
    }

    if (fieldset != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldset", fieldset));
    }

    if (sort != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
    }

    if (page != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
    }

    if (perPage != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
    }

    if (q != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("q", q));
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    if (localVarContentType != null) {
      localVarHeaderParams.put("Content-Type", localVarContentType);
    }

    String[] localVarAuthNames = new String[] {"OAuth2AuthenticationCodeFlow"};
    return localVarApiClient.buildCall(
        basePath,
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call listProductsValidateBeforeCall(
      Integer companyId,
      String fields,
      String fieldset,
      String sort,
      Integer page,
      Integer perPage,
      String q,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      throw new ApiException(
          "Missing the required parameter 'companyId' when calling listProducts(Async)");
    }

    okhttp3.Call localVarCall =
        listProductsCall(companyId, fields, fieldset, sort, page, perPage, q, _callback);
    return localVarCall;
  }

  /**
   * List Products Lists the products.
   *
   * @param companyId The ID of the company. (required)
   * @param fields List of comma-separated fields. (optional)
   * @param fieldset Name of the fieldset. (optional)
   * @param sort List of comma-separated fields for result sorting (minus for desc sorting).
   *     (optional)
   * @param page The page to retrieve. (optional, default to 1)
   * @param perPage The size of the page. (optional, default to 5)
   * @param q Query for filtering the results. (optional)
   * @return ListProductsResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Products List. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ListProductsResponse listProducts(
      Integer companyId,
      String fields,
      String fieldset,
      String sort,
      Integer page,
      Integer perPage,
      String q)
      throws ApiException {
    ApiResponse<ListProductsResponse> localVarResp =
        listProductsWithHttpInfo(companyId, fields, fieldset, sort, page, perPage, q);
    return localVarResp.getData();
  }

  /**
   * List Products Lists the products.
   *
   * @param companyId The ID of the company. (required)
   * @param fields List of comma-separated fields. (optional)
   * @param fieldset Name of the fieldset. (optional)
   * @param sort List of comma-separated fields for result sorting (minus for desc sorting).
   *     (optional)
   * @param page The page to retrieve. (optional, default to 1)
   * @param perPage The size of the page. (optional, default to 5)
   * @param q Query for filtering the results. (optional)
   * @return ApiResponse&lt;ListProductsResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Products List. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<ListProductsResponse> listProductsWithHttpInfo(
      Integer companyId,
      String fields,
      String fieldset,
      String sort,
      Integer page,
      Integer perPage,
      String q)
      throws ApiException {
    okhttp3.Call localVarCall =
        listProductsValidateBeforeCall(companyId, fields, fieldset, sort, page, perPage, q, null);
    Type localVarReturnType = new TypeToken<ListProductsResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * List Products (asynchronously) Lists the products.
   *
   * @param companyId The ID of the company. (required)
   * @param fields List of comma-separated fields. (optional)
   * @param fieldset Name of the fieldset. (optional)
   * @param sort List of comma-separated fields for result sorting (minus for desc sorting).
   *     (optional)
   * @param page The page to retrieve. (optional, default to 1)
   * @param perPage The size of the page. (optional, default to 5)
   * @param q Query for filtering the results. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Products List. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call listProductsAsync(
      Integer companyId,
      String fields,
      String fieldset,
      String sort,
      Integer page,
      Integer perPage,
      String q,
      final ApiCallback<ListProductsResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        listProductsValidateBeforeCall(
            companyId, fields, fieldset, sort, page, perPage, q, _callback);
    Type localVarReturnType = new TypeToken<ListProductsResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for modifyProduct
   *
   * @param companyId The ID of the company. (required)
   * @param productId The ID of the product. (required)
   * @param modifyProductRequest Modified product details. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call modifyProductCall(
      Integer companyId,
      Integer productId,
      ModifyProductRequest modifyProductRequest,
      final ApiCallback _callback)
      throws ApiException {
    String basePath = null;
    // Operation Servers
    String[] localBasePaths = new String[] {};

    // Determine Base Path to Use
    if (localCustomBaseUrl != null) {
      basePath = localCustomBaseUrl;
    } else if (localBasePaths.length > 0) {
      basePath = localBasePaths[localHostIndex];
    } else {
      basePath = null;
    }

    Object localVarPostBody = modifyProductRequest;

    // create path and map variables
    String localVarPath =
        "/c/{company_id}/products/{product_id}"
            .replaceAll(
                "\\{" + "company_id" + "\\}", localVarApiClient.escapeString(companyId.toString()))
            .replaceAll(
                "\\{" + "product_id" + "\\}", localVarApiClient.escapeString(productId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    if (localVarContentType != null) {
      localVarHeaderParams.put("Content-Type", localVarContentType);
    }

    String[] localVarAuthNames = new String[] {"OAuth2AuthenticationCodeFlow"};
    return localVarApiClient.buildCall(
        basePath,
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call modifyProductValidateBeforeCall(
      Integer companyId,
      Integer productId,
      ModifyProductRequest modifyProductRequest,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      throw new ApiException(
          "Missing the required parameter 'companyId' when calling modifyProduct(Async)");
    }

    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(
          "Missing the required parameter 'productId' when calling modifyProduct(Async)");
    }

    okhttp3.Call localVarCall =
        modifyProductCall(companyId, productId, modifyProductRequest, _callback);
    return localVarCall;
  }

  /**
   * Modify Product Modifies the specified product.
   *
   * @param companyId The ID of the company. (required)
   * @param productId The ID of the product. (required)
   * @param modifyProductRequest Modified product details. (optional)
   * @return ModifyProductResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public ModifyProductResponse modifyProduct(
      Integer companyId, Integer productId, ModifyProductRequest modifyProductRequest)
      throws ApiException {
    ApiResponse<ModifyProductResponse> localVarResp =
        modifyProductWithHttpInfo(companyId, productId, modifyProductRequest);
    return localVarResp.getData();
  }

  /**
   * Modify Product Modifies the specified product.
   *
   * @param companyId The ID of the company. (required)
   * @param productId The ID of the product. (required)
   * @param modifyProductRequest Modified product details. (optional)
   * @return ApiResponse&lt;ModifyProductResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<ModifyProductResponse> modifyProductWithHttpInfo(
      Integer companyId, Integer productId, ModifyProductRequest modifyProductRequest)
      throws ApiException {
    okhttp3.Call localVarCall =
        modifyProductValidateBeforeCall(companyId, productId, modifyProductRequest, null);
    Type localVarReturnType = new TypeToken<ModifyProductResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Modify Product (asynchronously) Modifies the specified product.
   *
   * @param companyId The ID of the company. (required)
   * @param productId The ID of the product. (required)
   * @param modifyProductRequest Modified product details. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call modifyProductAsync(
      Integer companyId,
      Integer productId,
      ModifyProductRequest modifyProductRequest,
      final ApiCallback<ModifyProductResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        modifyProductValidateBeforeCall(companyId, productId, modifyProductRequest, _callback);
    Type localVarReturnType = new TypeToken<ModifyProductResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
