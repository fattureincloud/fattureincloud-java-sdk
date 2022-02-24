/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.13
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.fattureincloud.sdk.api;

import com.google.gson.reflect.TypeToken;
import it.fattureincloud.sdk.*;
import it.fattureincloud.sdk.model.GetCompanyInfoResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompaniesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CompaniesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CompaniesApi(ApiClient apiClient) {
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
     * Build call for getCompanyInfo
     *
     * @param companyId The ID of the company. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Company info. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getCompanyInfoCall(Integer companyId, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[]{};

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
        String localVarPath = "/c/{company_id}/company/info"
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

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[]{"OAuth2AuthenticationCodeFlow"};
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCompanyInfoValidateBeforeCall(Integer companyId, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling getCompanyInfo(Async)");
        }


        okhttp3.Call localVarCall = getCompanyInfoCall(companyId, _callback);
        return localVarCall;

    }

    /**
     * Get Company Info
     * Gets the company detailed info.
     *
     * @param companyId The ID of the company. (required)
     * @return GetCompanyInfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Company info. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
     * </table>
     */
    public GetCompanyInfoResponse getCompanyInfo(Integer companyId) throws ApiException {
        ApiResponse<GetCompanyInfoResponse> localVarResp = getCompanyInfoWithHttpInfo(companyId);
        return localVarResp.getData();
    }

    /**
     * Get Company Info
     * Gets the company detailed info.
     *
     * @param companyId The ID of the company. (required)
     * @return ApiResponse&lt;GetCompanyInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Company info. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<GetCompanyInfoResponse> getCompanyInfoWithHttpInfo(Integer companyId) throws ApiException {
        okhttp3.Call localVarCall = getCompanyInfoValidateBeforeCall(companyId, null);
        Type localVarReturnType = new TypeToken<GetCompanyInfoResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Company Info (asynchronously)
     * Gets the company detailed info.
     *
     * @param companyId The ID of the company. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Company info. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getCompanyInfoAsync(Integer companyId, final ApiCallback<GetCompanyInfoResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCompanyInfoValidateBeforeCall(companyId, _callback);
        Type localVarReturnType = new TypeToken<GetCompanyInfoResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
