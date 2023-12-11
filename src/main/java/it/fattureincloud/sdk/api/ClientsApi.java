/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.31
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
import it.fattureincloud.sdk.model.CreateClientRequest;
import it.fattureincloud.sdk.model.CreateClientResponse;
import it.fattureincloud.sdk.model.GetClientResponse;
import it.fattureincloud.sdk.model.ListClientsResponse;
import it.fattureincloud.sdk.model.ModifyClientRequest;
import it.fattureincloud.sdk.model.ModifyClientResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientsApi {
  private ApiClient localVarApiClient;
  private int localHostIndex;
  private String localCustomBaseUrl;

  public ClientsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ClientsApi(ApiClient apiClient) {
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
   * Build call for createClient
   *
   * @param companyId The ID of the company. (required)
   * @param createClientRequest The client to create (optional)
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
  public okhttp3.Call createClientCall(
      Integer companyId, CreateClientRequest createClientRequest, final ApiCallback _callback)
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

    Object localVarPostBody = createClientRequest;

    // create path and map variables
    String localVarPath =
        "/c/{company_id}/entities/clients"
            .replace(
                "{" + "company_id" + "}", localVarApiClient.escapeString(companyId.toString()));

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
  private okhttp3.Call createClientValidateBeforeCall(
      Integer companyId, CreateClientRequest createClientRequest, final ApiCallback _callback)
      throws ApiException {
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      throw new ApiException(
          "Missing the required parameter 'companyId' when calling createClient(Async)");
    }

    return createClientCall(companyId, createClientRequest, _callback);
  }

  /**
   * Create Client Creates a new client.
   *
   * @param companyId The ID of the company. (required)
   * @param createClientRequest The client to create (optional)
   * @return CreateClientResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * </table>
   */
  public CreateClientResponse createClient(
      Integer companyId, CreateClientRequest createClientRequest) throws ApiException {
    ApiResponse<CreateClientResponse> localVarResp =
        createClientWithHttpInfo(companyId, createClientRequest);
    return localVarResp.getData();
  }

  /**
   * Create Client Creates a new client.
   *
   * @param companyId The ID of the company. (required)
   * @param createClientRequest The client to create (optional)
   * @return ApiResponse&lt;CreateClientResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<CreateClientResponse> createClientWithHttpInfo(
      Integer companyId, CreateClientRequest createClientRequest) throws ApiException {
    okhttp3.Call localVarCall =
        createClientValidateBeforeCall(companyId, createClientRequest, null);
    Type localVarReturnType = new TypeToken<CreateClientResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Create Client (asynchronously) Creates a new client.
   *
   * @param companyId The ID of the company. (required)
   * @param createClientRequest The client to create (optional)
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
  public okhttp3.Call createClientAsync(
      Integer companyId,
      CreateClientRequest createClientRequest,
      final ApiCallback<CreateClientResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        createClientValidateBeforeCall(companyId, createClientRequest, _callback);
    Type localVarReturnType = new TypeToken<CreateClientResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deleteClient
   *
   * @param companyId The ID of the company. (required)
   * @param clientId The ID of the client. (required)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Entity Removed </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deleteClientCall(
      Integer companyId, Integer clientId, final ApiCallback _callback) throws ApiException {
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
        "/c/{company_id}/entities/clients/{client_id}"
            .replace("{" + "company_id" + "}", localVarApiClient.escapeString(companyId.toString()))
            .replace("{" + "client_id" + "}", localVarApiClient.escapeString(clientId.toString()));

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
  private okhttp3.Call deleteClientValidateBeforeCall(
      Integer companyId, Integer clientId, final ApiCallback _callback) throws ApiException {
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      throw new ApiException(
          "Missing the required parameter 'companyId' when calling deleteClient(Async)");
    }

    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(
          "Missing the required parameter 'clientId' when calling deleteClient(Async)");
    }

    return deleteClientCall(companyId, clientId, _callback);
  }

  /**
   * Delete Client Deletes the specified client.
   *
   * @param companyId The ID of the company. (required)
   * @param clientId The ID of the client. (required)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Entity Removed </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public void deleteClient(Integer companyId, Integer clientId) throws ApiException {
    deleteClientWithHttpInfo(companyId, clientId);
  }

  /**
   * Delete Client Deletes the specified client.
   *
   * @param companyId The ID of the company. (required)
   * @param clientId The ID of the client. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Entity Removed </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Void> deleteClientWithHttpInfo(Integer companyId, Integer clientId)
      throws ApiException {
    okhttp3.Call localVarCall = deleteClientValidateBeforeCall(companyId, clientId, null);
    return localVarApiClient.execute(localVarCall);
  }

  /**
   * Delete Client (asynchronously) Deletes the specified client.
   *
   * @param companyId The ID of the company. (required)
   * @param clientId The ID of the client. (required)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Entity Removed </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deleteClientAsync(
      Integer companyId, Integer clientId, final ApiCallback<Void> _callback) throws ApiException {

    okhttp3.Call localVarCall = deleteClientValidateBeforeCall(companyId, clientId, _callback);
    localVarApiClient.executeAsync(localVarCall, _callback);
    return localVarCall;
  }
  /**
   * Build call for getClient
   *
   * @param companyId The ID of the company. (required)
   * @param clientId The ID of the client. (required)
   * @param fields List of comma-separated fields. (optional)
   * @param fieldset Name of the fieldset. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Client Details. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getClientCall(
      Integer companyId,
      Integer clientId,
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
        "/c/{company_id}/entities/clients/{client_id}"
            .replace("{" + "company_id" + "}", localVarApiClient.escapeString(companyId.toString()))
            .replace("{" + "client_id" + "}", localVarApiClient.escapeString(clientId.toString()));

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
  private okhttp3.Call getClientValidateBeforeCall(
      Integer companyId,
      Integer clientId,
      String fields,
      String fieldset,
      final ApiCallback _callback)
      throws ApiException {
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      throw new ApiException(
          "Missing the required parameter 'companyId' when calling getClient(Async)");
    }

    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(
          "Missing the required parameter 'clientId' when calling getClient(Async)");
    }

    return getClientCall(companyId, clientId, fields, fieldset, _callback);
  }

  /**
   * Get Client Gets the specified client.
   *
   * @param companyId The ID of the company. (required)
   * @param clientId The ID of the client. (required)
   * @param fields List of comma-separated fields. (optional)
   * @param fieldset Name of the fieldset. (optional)
   * @return GetClientResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Client Details. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public GetClientResponse getClient(
      Integer companyId, Integer clientId, String fields, String fieldset) throws ApiException {
    ApiResponse<GetClientResponse> localVarResp =
        getClientWithHttpInfo(companyId, clientId, fields, fieldset);
    return localVarResp.getData();
  }

  /**
   * Get Client Gets the specified client.
   *
   * @param companyId The ID of the company. (required)
   * @param clientId The ID of the client. (required)
   * @param fields List of comma-separated fields. (optional)
   * @param fieldset Name of the fieldset. (optional)
   * @return ApiResponse&lt;GetClientResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Client Details. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<GetClientResponse> getClientWithHttpInfo(
      Integer companyId, Integer clientId, String fields, String fieldset) throws ApiException {
    okhttp3.Call localVarCall =
        getClientValidateBeforeCall(companyId, clientId, fields, fieldset, null);
    Type localVarReturnType = new TypeToken<GetClientResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get Client (asynchronously) Gets the specified client.
   *
   * @param companyId The ID of the company. (required)
   * @param clientId The ID of the client. (required)
   * @param fields List of comma-separated fields. (optional)
   * @param fieldset Name of the fieldset. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Client Details. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getClientAsync(
      Integer companyId,
      Integer clientId,
      String fields,
      String fieldset,
      final ApiCallback<GetClientResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getClientValidateBeforeCall(companyId, clientId, fields, fieldset, _callback);
    Type localVarReturnType = new TypeToken<GetClientResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for listClients
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
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call listClientsCall(
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
        "/c/{company_id}/entities/clients"
            .replace(
                "{" + "company_id" + "}", localVarApiClient.escapeString(companyId.toString()));

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
  private okhttp3.Call listClientsValidateBeforeCall(
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
          "Missing the required parameter 'companyId' when calling listClients(Async)");
    }

    return listClientsCall(companyId, fields, fieldset, sort, page, perPage, q, _callback);
  }

  /**
   * List Clients Lists the clients.
   *
   * @param companyId The ID of the company. (required)
   * @param fields List of comma-separated fields. (optional)
   * @param fieldset Name of the fieldset. (optional)
   * @param sort List of comma-separated fields for result sorting (minus for desc sorting).
   *     (optional)
   * @param page The page to retrieve. (optional, default to 1)
   * @param perPage The size of the page. (optional, default to 5)
   * @param q Query for filtering the results. (optional)
   * @return ListClientsResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ListClientsResponse listClients(
      Integer companyId,
      String fields,
      String fieldset,
      String sort,
      Integer page,
      Integer perPage,
      String q)
      throws ApiException {
    ApiResponse<ListClientsResponse> localVarResp =
        listClientsWithHttpInfo(companyId, fields, fieldset, sort, page, perPage, q);
    return localVarResp.getData();
  }

  /**
   * List Clients Lists the clients.
   *
   * @param companyId The ID of the company. (required)
   * @param fields List of comma-separated fields. (optional)
   * @param fieldset Name of the fieldset. (optional)
   * @param sort List of comma-separated fields for result sorting (minus for desc sorting).
   *     (optional)
   * @param page The page to retrieve. (optional, default to 1)
   * @param perPage The size of the page. (optional, default to 5)
   * @param q Query for filtering the results. (optional)
   * @return ApiResponse&lt;ListClientsResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<ListClientsResponse> listClientsWithHttpInfo(
      Integer companyId,
      String fields,
      String fieldset,
      String sort,
      Integer page,
      Integer perPage,
      String q)
      throws ApiException {
    okhttp3.Call localVarCall =
        listClientsValidateBeforeCall(companyId, fields, fieldset, sort, page, perPage, q, null);
    Type localVarReturnType = new TypeToken<ListClientsResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * List Clients (asynchronously) Lists the clients.
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
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call listClientsAsync(
      Integer companyId,
      String fields,
      String fieldset,
      String sort,
      Integer page,
      Integer perPage,
      String q,
      final ApiCallback<ListClientsResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        listClientsValidateBeforeCall(
            companyId, fields, fieldset, sort, page, perPage, q, _callback);
    Type localVarReturnType = new TypeToken<ListClientsResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for modifyClient
   *
   * @param companyId The ID of the company. (required)
   * @param clientId The ID of the client. (required)
   * @param modifyClientRequest The modified Client. First level parameters are managed in delta
   *     mode. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Client modified. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call modifyClientCall(
      Integer companyId,
      Integer clientId,
      ModifyClientRequest modifyClientRequest,
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

    Object localVarPostBody = modifyClientRequest;

    // create path and map variables
    String localVarPath =
        "/c/{company_id}/entities/clients/{client_id}"
            .replace("{" + "company_id" + "}", localVarApiClient.escapeString(companyId.toString()))
            .replace("{" + "client_id" + "}", localVarApiClient.escapeString(clientId.toString()));

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
  private okhttp3.Call modifyClientValidateBeforeCall(
      Integer companyId,
      Integer clientId,
      ModifyClientRequest modifyClientRequest,
      final ApiCallback _callback)
      throws ApiException {
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      throw new ApiException(
          "Missing the required parameter 'companyId' when calling modifyClient(Async)");
    }

    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(
          "Missing the required parameter 'clientId' when calling modifyClient(Async)");
    }

    return modifyClientCall(companyId, clientId, modifyClientRequest, _callback);
  }

  /**
   * Modify Client Modifies the specified client.
   *
   * @param companyId The ID of the company. (required)
   * @param clientId The ID of the client. (required)
   * @param modifyClientRequest The modified Client. First level parameters are managed in delta
   *     mode. (optional)
   * @return ModifyClientResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Client modified. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public ModifyClientResponse modifyClient(
      Integer companyId, Integer clientId, ModifyClientRequest modifyClientRequest)
      throws ApiException {
    ApiResponse<ModifyClientResponse> localVarResp =
        modifyClientWithHttpInfo(companyId, clientId, modifyClientRequest);
    return localVarResp.getData();
  }

  /**
   * Modify Client Modifies the specified client.
   *
   * @param companyId The ID of the company. (required)
   * @param clientId The ID of the client. (required)
   * @param modifyClientRequest The modified Client. First level parameters are managed in delta
   *     mode. (optional)
   * @return ApiResponse&lt;ModifyClientResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Client modified. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<ModifyClientResponse> modifyClientWithHttpInfo(
      Integer companyId, Integer clientId, ModifyClientRequest modifyClientRequest)
      throws ApiException {
    okhttp3.Call localVarCall =
        modifyClientValidateBeforeCall(companyId, clientId, modifyClientRequest, null);
    Type localVarReturnType = new TypeToken<ModifyClientResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Modify Client (asynchronously) Modifies the specified client.
   *
   * @param companyId The ID of the company. (required)
   * @param clientId The ID of the client. (required)
   * @param modifyClientRequest The modified Client. First level parameters are managed in delta
   *     mode. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Client modified. </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call modifyClientAsync(
      Integer companyId,
      Integer clientId,
      ModifyClientRequest modifyClientRequest,
      final ApiCallback<ModifyClientResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        modifyClientValidateBeforeCall(companyId, clientId, modifyClientRequest, _callback);
    Type localVarReturnType = new TypeToken<ModifyClientResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
