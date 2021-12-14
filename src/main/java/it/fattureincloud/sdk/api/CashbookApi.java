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

import it.fattureincloud.sdk.ApiCallback;
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.ApiResponse;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.Pair;
import it.fattureincloud.sdk.ProgressRequestBody;
import it.fattureincloud.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import it.fattureincloud.sdk.model.CreateCashbookEntryRequest;
import it.fattureincloud.sdk.model.CreateCashbookEntryResponse;
import it.fattureincloud.sdk.model.GetCashbookEntryResponse;
import it.fattureincloud.sdk.model.ListCashbookEntriesResponse;
import it.fattureincloud.sdk.model.ModifyCashbookEntryRequest;
import it.fattureincloud.sdk.model.ModifyCashbookEntryResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CashbookApi {
    private ApiClient localVarApiClient;

    public CashbookApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CashbookApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createCashbookEntry
     * @param companyId The ID of the company. (required)
     * @param createCashbookEntryRequest Cashbook entry.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created Cashbook Entry. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCashbookEntryCall(Integer companyId, CreateCashbookEntryRequest createCashbookEntryRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createCashbookEntryRequest;

        // create path and map variables
        String localVarPath = "/c/{company_id}/cashbook"
            .replaceAll("\\{" + "company_id" + "\\}", localVarApiClient.escapeString(companyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2AuthenticationCodeFlow" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createCashbookEntryValidateBeforeCall(Integer companyId, CreateCashbookEntryRequest createCashbookEntryRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling createCashbookEntry(Async)");
        }
        

        okhttp3.Call localVarCall = createCashbookEntryCall(companyId, createCashbookEntryRequest, _callback);
        return localVarCall;

    }

    /**
     * Create Cashbook Entry
     * Creates a new cashbook entry.
     * @param companyId The ID of the company. (required)
     * @param createCashbookEntryRequest Cashbook entry.  (optional)
     * @return CreateCashbookEntryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created Cashbook Entry. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public CreateCashbookEntryResponse createCashbookEntry(Integer companyId, CreateCashbookEntryRequest createCashbookEntryRequest) throws ApiException {
        ApiResponse<CreateCashbookEntryResponse> localVarResp = createCashbookEntryWithHttpInfo(companyId, createCashbookEntryRequest);
        return localVarResp.getData();
    }

    /**
     * Create Cashbook Entry
     * Creates a new cashbook entry.
     * @param companyId The ID of the company. (required)
     * @param createCashbookEntryRequest Cashbook entry.  (optional)
     * @return ApiResponse&lt;CreateCashbookEntryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created Cashbook Entry. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateCashbookEntryResponse> createCashbookEntryWithHttpInfo(Integer companyId, CreateCashbookEntryRequest createCashbookEntryRequest) throws ApiException {
        okhttp3.Call localVarCall = createCashbookEntryValidateBeforeCall(companyId, createCashbookEntryRequest, null);
        Type localVarReturnType = new TypeToken<CreateCashbookEntryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Cashbook Entry (asynchronously)
     * Creates a new cashbook entry.
     * @param companyId The ID of the company. (required)
     * @param createCashbookEntryRequest Cashbook entry.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created Cashbook Entry. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCashbookEntryAsync(Integer companyId, CreateCashbookEntryRequest createCashbookEntryRequest, final ApiCallback<CreateCashbookEntryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createCashbookEntryValidateBeforeCall(companyId, createCashbookEntryRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateCashbookEntryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCashbookEntry
     * @param companyId The ID of the company. (required)
     * @param documentId The ID of the document. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Document removed. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCashbookEntryCall(Integer companyId, Integer documentId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/c/{company_id}/cashbook/{document_id}"
            .replaceAll("\\{" + "company_id" + "\\}", localVarApiClient.escapeString(companyId.toString()))
            .replaceAll("\\{" + "document_id" + "\\}", localVarApiClient.escapeString(documentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2AuthenticationCodeFlow" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCashbookEntryValidateBeforeCall(Integer companyId, Integer documentId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling deleteCashbookEntry(Async)");
        }
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new ApiException("Missing the required parameter 'documentId' when calling deleteCashbookEntry(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCashbookEntryCall(companyId, documentId, _callback);
        return localVarCall;

    }

    /**
     * Delete Cashbook Entry
     * Deletes the specified cashbook entry.
     * @param companyId The ID of the company. (required)
     * @param documentId The ID of the document. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Document removed. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public void deleteCashbookEntry(Integer companyId, Integer documentId) throws ApiException {
        deleteCashbookEntryWithHttpInfo(companyId, documentId);
    }

    /**
     * Delete Cashbook Entry
     * Deletes the specified cashbook entry.
     * @param companyId The ID of the company. (required)
     * @param documentId The ID of the document. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Document removed. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteCashbookEntryWithHttpInfo(Integer companyId, Integer documentId) throws ApiException {
        okhttp3.Call localVarCall = deleteCashbookEntryValidateBeforeCall(companyId, documentId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Cashbook Entry (asynchronously)
     * Deletes the specified cashbook entry.
     * @param companyId The ID of the company. (required)
     * @param documentId The ID of the document. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Document removed. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCashbookEntryAsync(Integer companyId, Integer documentId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCashbookEntryValidateBeforeCall(companyId, documentId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCashbookEntry
     * @param companyId The ID of the company. (required)
     * @param documentId The ID of the document. (required)
     * @param fields List of comma-separated fields. (optional)
     * @param fieldset Name of the fieldset. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Cashbook Entry. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCashbookEntryCall(Integer companyId, Integer documentId, String fields, String fieldset, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/c/{company_id}/cashbook/{document_id}"
            .replaceAll("\\{" + "company_id" + "\\}", localVarApiClient.escapeString(companyId.toString()))
            .replaceAll("\\{" + "document_id" + "\\}", localVarApiClient.escapeString(documentId.toString()));

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

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2AuthenticationCodeFlow" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCashbookEntryValidateBeforeCall(Integer companyId, Integer documentId, String fields, String fieldset, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling getCashbookEntry(Async)");
        }
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new ApiException("Missing the required parameter 'documentId' when calling getCashbookEntry(Async)");
        }
        

        okhttp3.Call localVarCall = getCashbookEntryCall(companyId, documentId, fields, fieldset, _callback);
        return localVarCall;

    }

    /**
     * Get Cashbook Entry
     * Gets the specified cashbook entry.
     * @param companyId The ID of the company. (required)
     * @param documentId The ID of the document. (required)
     * @param fields List of comma-separated fields. (optional)
     * @param fieldset Name of the fieldset. (optional)
     * @return GetCashbookEntryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Cashbook Entry. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public GetCashbookEntryResponse getCashbookEntry(Integer companyId, Integer documentId, String fields, String fieldset) throws ApiException {
        ApiResponse<GetCashbookEntryResponse> localVarResp = getCashbookEntryWithHttpInfo(companyId, documentId, fields, fieldset);
        return localVarResp.getData();
    }

    /**
     * Get Cashbook Entry
     * Gets the specified cashbook entry.
     * @param companyId The ID of the company. (required)
     * @param documentId The ID of the document. (required)
     * @param fields List of comma-separated fields. (optional)
     * @param fieldset Name of the fieldset. (optional)
     * @return ApiResponse&lt;GetCashbookEntryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Cashbook Entry. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetCashbookEntryResponse> getCashbookEntryWithHttpInfo(Integer companyId, Integer documentId, String fields, String fieldset) throws ApiException {
        okhttp3.Call localVarCall = getCashbookEntryValidateBeforeCall(companyId, documentId, fields, fieldset, null);
        Type localVarReturnType = new TypeToken<GetCashbookEntryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Cashbook Entry (asynchronously)
     * Gets the specified cashbook entry.
     * @param companyId The ID of the company. (required)
     * @param documentId The ID of the document. (required)
     * @param fields List of comma-separated fields. (optional)
     * @param fieldset Name of the fieldset. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Cashbook Entry. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCashbookEntryAsync(Integer companyId, Integer documentId, String fields, String fieldset, final ApiCallback<GetCashbookEntryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCashbookEntryValidateBeforeCall(companyId, documentId, fields, fieldset, _callback);
        Type localVarReturnType = new TypeToken<GetCashbookEntryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listCashbookEntries
     * @param companyId The ID of the company. (required)
     * @param dateFrom Start date. (required)
     * @param dateTo End date. (required)
     * @param year Filter cashbook by year. (optional)
     * @param type Filter cashbook by type. (optional)
     * @param paymentAccountId Filter by payment account. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Results list. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listCashbookEntriesCall(Integer companyId, String dateFrom, String dateTo, Integer year, String type, Integer paymentAccountId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/c/{company_id}/cashbook"
            .replaceAll("\\{" + "company_id" + "\\}", localVarApiClient.escapeString(companyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dateFrom != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_from", dateFrom));
        }

        if (dateTo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_to", dateTo));
        }

        if (year != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("year", year));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (paymentAccountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("payment_account_id", paymentAccountId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2AuthenticationCodeFlow" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listCashbookEntriesValidateBeforeCall(Integer companyId, String dateFrom, String dateTo, Integer year, String type, Integer paymentAccountId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling listCashbookEntries(Async)");
        }
        
        // verify the required parameter 'dateFrom' is set
        if (dateFrom == null) {
            throw new ApiException("Missing the required parameter 'dateFrom' when calling listCashbookEntries(Async)");
        }
        
        // verify the required parameter 'dateTo' is set
        if (dateTo == null) {
            throw new ApiException("Missing the required parameter 'dateTo' when calling listCashbookEntries(Async)");
        }
        

        okhttp3.Call localVarCall = listCashbookEntriesCall(companyId, dateFrom, dateTo, year, type, paymentAccountId, _callback);
        return localVarCall;

    }

    /**
     * List Cashbook Entries
     * Lists the cashbook entries.
     * @param companyId The ID of the company. (required)
     * @param dateFrom Start date. (required)
     * @param dateTo End date. (required)
     * @param year Filter cashbook by year. (optional)
     * @param type Filter cashbook by type. (optional)
     * @param paymentAccountId Filter by payment account. (optional)
     * @return ListCashbookEntriesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Results list. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ListCashbookEntriesResponse listCashbookEntries(Integer companyId, String dateFrom, String dateTo, Integer year, String type, Integer paymentAccountId) throws ApiException {
        ApiResponse<ListCashbookEntriesResponse> localVarResp = listCashbookEntriesWithHttpInfo(companyId, dateFrom, dateTo, year, type, paymentAccountId);
        return localVarResp.getData();
    }

    /**
     * List Cashbook Entries
     * Lists the cashbook entries.
     * @param companyId The ID of the company. (required)
     * @param dateFrom Start date. (required)
     * @param dateTo End date. (required)
     * @param year Filter cashbook by year. (optional)
     * @param type Filter cashbook by type. (optional)
     * @param paymentAccountId Filter by payment account. (optional)
     * @return ApiResponse&lt;ListCashbookEntriesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Results list. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListCashbookEntriesResponse> listCashbookEntriesWithHttpInfo(Integer companyId, String dateFrom, String dateTo, Integer year, String type, Integer paymentAccountId) throws ApiException {
        okhttp3.Call localVarCall = listCashbookEntriesValidateBeforeCall(companyId, dateFrom, dateTo, year, type, paymentAccountId, null);
        Type localVarReturnType = new TypeToken<ListCashbookEntriesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Cashbook Entries (asynchronously)
     * Lists the cashbook entries.
     * @param companyId The ID of the company. (required)
     * @param dateFrom Start date. (required)
     * @param dateTo End date. (required)
     * @param year Filter cashbook by year. (optional)
     * @param type Filter cashbook by type. (optional)
     * @param paymentAccountId Filter by payment account. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Results list. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listCashbookEntriesAsync(Integer companyId, String dateFrom, String dateTo, Integer year, String type, Integer paymentAccountId, final ApiCallback<ListCashbookEntriesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listCashbookEntriesValidateBeforeCall(companyId, dateFrom, dateTo, year, type, paymentAccountId, _callback);
        Type localVarReturnType = new TypeToken<ListCashbookEntriesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modifyCashbookEntry
     * @param companyId The ID of the company. (required)
     * @param documentId The ID of the document. (required)
     * @param modifyCashbookEntryRequest Cashbook Entry (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The modified Cashbook Entry </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyCashbookEntryCall(Integer companyId, Integer documentId, ModifyCashbookEntryRequest modifyCashbookEntryRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = modifyCashbookEntryRequest;

        // create path and map variables
        String localVarPath = "/c/{company_id}/cashbook/{document_id}"
            .replaceAll("\\{" + "company_id" + "\\}", localVarApiClient.escapeString(companyId.toString()))
            .replaceAll("\\{" + "document_id" + "\\}", localVarApiClient.escapeString(documentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2AuthenticationCodeFlow" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call modifyCashbookEntryValidateBeforeCall(Integer companyId, Integer documentId, ModifyCashbookEntryRequest modifyCashbookEntryRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling modifyCashbookEntry(Async)");
        }
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new ApiException("Missing the required parameter 'documentId' when calling modifyCashbookEntry(Async)");
        }
        

        okhttp3.Call localVarCall = modifyCashbookEntryCall(companyId, documentId, modifyCashbookEntryRequest, _callback);
        return localVarCall;

    }

    /**
     * Modify Cashbook Entry
     * Modifies the specified cashbook entry.
     * @param companyId The ID of the company. (required)
     * @param documentId The ID of the document. (required)
     * @param modifyCashbookEntryRequest Cashbook Entry (optional)
     * @return ModifyCashbookEntryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The modified Cashbook Entry </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ModifyCashbookEntryResponse modifyCashbookEntry(Integer companyId, Integer documentId, ModifyCashbookEntryRequest modifyCashbookEntryRequest) throws ApiException {
        ApiResponse<ModifyCashbookEntryResponse> localVarResp = modifyCashbookEntryWithHttpInfo(companyId, documentId, modifyCashbookEntryRequest);
        return localVarResp.getData();
    }

    /**
     * Modify Cashbook Entry
     * Modifies the specified cashbook entry.
     * @param companyId The ID of the company. (required)
     * @param documentId The ID of the document. (required)
     * @param modifyCashbookEntryRequest Cashbook Entry (optional)
     * @return ApiResponse&lt;ModifyCashbookEntryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The modified Cashbook Entry </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ModifyCashbookEntryResponse> modifyCashbookEntryWithHttpInfo(Integer companyId, Integer documentId, ModifyCashbookEntryRequest modifyCashbookEntryRequest) throws ApiException {
        okhttp3.Call localVarCall = modifyCashbookEntryValidateBeforeCall(companyId, documentId, modifyCashbookEntryRequest, null);
        Type localVarReturnType = new TypeToken<ModifyCashbookEntryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Modify Cashbook Entry (asynchronously)
     * Modifies the specified cashbook entry.
     * @param companyId The ID of the company. (required)
     * @param documentId The ID of the document. (required)
     * @param modifyCashbookEntryRequest Cashbook Entry (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The modified Cashbook Entry </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyCashbookEntryAsync(Integer companyId, Integer documentId, ModifyCashbookEntryRequest modifyCashbookEntryRequest, final ApiCallback<ModifyCashbookEntryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyCashbookEntryValidateBeforeCall(companyId, documentId, modifyCashbookEntryRequest, _callback);
        Type localVarReturnType = new TypeToken<ModifyCashbookEntryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}