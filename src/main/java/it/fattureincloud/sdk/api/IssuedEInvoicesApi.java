/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.15
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
import it.fattureincloud.sdk.model.GetEInvoiceRejectionReasonResponse;
import it.fattureincloud.sdk.model.SendEInvoiceRequest;
import it.fattureincloud.sdk.model.SendEInvoiceResponse;
import it.fattureincloud.sdk.model.VerifyEInvoiceXmlResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssuedEInvoicesApi {
  private ApiClient localVarApiClient;
  private int localHostIndex;
  private String localCustomBaseUrl;

  public IssuedEInvoicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssuedEInvoicesApi(ApiClient apiClient) {
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
   * Build call for getEInvoiceRejectionReason
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getEInvoiceRejectionReasonCall(
      Integer companyId, Integer documentId, final ApiCallback _callback) throws ApiException {
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
        "/c/{company_id}/issued_documents/{document_id}/e_invoice/error_reason"
            .replaceAll(
                "\\{" + "company_id" + "\\}", localVarApiClient.escapeString(companyId.toString()))
            .replaceAll(
                "\\{" + "document_id" + "\\}",
                localVarApiClient.escapeString(documentId.toString()));

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
  private okhttp3.Call getEInvoiceRejectionReasonValidateBeforeCall(
      Integer companyId, Integer documentId, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      throw new ApiException(
          "Missing the required parameter 'companyId' when calling"
              + " getEInvoiceRejectionReason(Async)");
    }

    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(
          "Missing the required parameter 'documentId' when calling"
              + " getEInvoiceRejectionReason(Async)");
    }

    okhttp3.Call localVarCall = getEInvoiceRejectionReasonCall(companyId, documentId, _callback);
    return localVarCall;
  }

  /**
   * Get e-invoice rejection reason Get e-invoice rejection reason
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @return GetEInvoiceRejectionReasonResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * </table>
   */
  public GetEInvoiceRejectionReasonResponse getEInvoiceRejectionReason(
      Integer companyId, Integer documentId) throws ApiException {
    ApiResponse<GetEInvoiceRejectionReasonResponse> localVarResp =
        getEInvoiceRejectionReasonWithHttpInfo(companyId, documentId);
    return localVarResp.getData();
  }

  /**
   * Get e-invoice rejection reason Get e-invoice rejection reason
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @return ApiResponse&lt;GetEInvoiceRejectionReasonResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<GetEInvoiceRejectionReasonResponse> getEInvoiceRejectionReasonWithHttpInfo(
      Integer companyId, Integer documentId) throws ApiException {
    okhttp3.Call localVarCall =
        getEInvoiceRejectionReasonValidateBeforeCall(companyId, documentId, null);
    Type localVarReturnType = new TypeToken<GetEInvoiceRejectionReasonResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get e-invoice rejection reason (asynchronously) Get e-invoice rejection reason
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getEInvoiceRejectionReasonAsync(
      Integer companyId,
      Integer documentId,
      final ApiCallback<GetEInvoiceRejectionReasonResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getEInvoiceRejectionReasonValidateBeforeCall(companyId, documentId, _callback);
    Type localVarReturnType = new TypeToken<GetEInvoiceRejectionReasonResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for getEInvoiceXml
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @param includeAttachment Include the attachment to the XML e-invoice. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getEInvoiceXmlCall(
      Integer companyId, Integer documentId, Boolean includeAttachment, final ApiCallback _callback)
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
        "/c/{company_id}/issued_documents/{document_id}/e_invoice/xml"
            .replaceAll(
                "\\{" + "company_id" + "\\}", localVarApiClient.escapeString(companyId.toString()))
            .replaceAll(
                "\\{" + "document_id" + "\\}",
                localVarApiClient.escapeString(documentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (includeAttachment != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("include_attachment", includeAttachment));
    }

    final String[] localVarAccepts = {"text/xml"};
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
  private okhttp3.Call getEInvoiceXmlValidateBeforeCall(
      Integer companyId, Integer documentId, Boolean includeAttachment, final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      throw new ApiException(
          "Missing the required parameter 'companyId' when calling getEInvoiceXml(Async)");
    }

    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(
          "Missing the required parameter 'documentId' when calling getEInvoiceXml(Async)");
    }

    okhttp3.Call localVarCall =
        getEInvoiceXmlCall(companyId, documentId, includeAttachment, _callback);
    return localVarCall;
  }

  /**
   * Get e-invoice XML Downloads the e-invoice in XML format.
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @param includeAttachment Include the attachment to the XML e-invoice. (optional)
   * @return String
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public String getEInvoiceXml(Integer companyId, Integer documentId, Boolean includeAttachment)
      throws ApiException {
    ApiResponse<String> localVarResp =
        getEInvoiceXmlWithHttpInfo(companyId, documentId, includeAttachment);
    return localVarResp.getData();
  }

  /**
   * Get e-invoice XML Downloads the e-invoice in XML format.
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @param includeAttachment Include the attachment to the XML e-invoice. (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<String> getEInvoiceXmlWithHttpInfo(
      Integer companyId, Integer documentId, Boolean includeAttachment) throws ApiException {
    okhttp3.Call localVarCall =
        getEInvoiceXmlValidateBeforeCall(companyId, documentId, includeAttachment, null);
    Type localVarReturnType = new TypeToken<String>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get e-invoice XML (asynchronously) Downloads the e-invoice in XML format.
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @param includeAttachment Include the attachment to the XML e-invoice. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getEInvoiceXmlAsync(
      Integer companyId,
      Integer documentId,
      Boolean includeAttachment,
      final ApiCallback<String> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getEInvoiceXmlValidateBeforeCall(companyId, documentId, includeAttachment, _callback);
    Type localVarReturnType = new TypeToken<String>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for sendEInvoice
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @param sendEInvoiceRequest (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call sendEInvoiceCall(
      Integer companyId,
      Integer documentId,
      SendEInvoiceRequest sendEInvoiceRequest,
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

    Object localVarPostBody = sendEInvoiceRequest;

    // create path and map variables
    String localVarPath =
        "/c/{company_id}/issued_documents/{document_id}/e_invoice/send"
            .replaceAll(
                "\\{" + "company_id" + "\\}", localVarApiClient.escapeString(companyId.toString()))
            .replaceAll(
                "\\{" + "document_id" + "\\}",
                localVarApiClient.escapeString(documentId.toString()));

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
  private okhttp3.Call sendEInvoiceValidateBeforeCall(
      Integer companyId,
      Integer documentId,
      SendEInvoiceRequest sendEInvoiceRequest,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      throw new ApiException(
          "Missing the required parameter 'companyId' when calling sendEInvoice(Async)");
    }

    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(
          "Missing the required parameter 'documentId' when calling sendEInvoice(Async)");
    }

    okhttp3.Call localVarCall =
        sendEInvoiceCall(companyId, documentId, sendEInvoiceRequest, _callback);
    return localVarCall;
  }

  /**
   * Send the e-invoice Sends the e-invoice to SDI.
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @param sendEInvoiceRequest (optional)
   * @return SendEInvoiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public SendEInvoiceResponse sendEInvoice(
      Integer companyId, Integer documentId, SendEInvoiceRequest sendEInvoiceRequest)
      throws ApiException {
    ApiResponse<SendEInvoiceResponse> localVarResp =
        sendEInvoiceWithHttpInfo(companyId, documentId, sendEInvoiceRequest);
    return localVarResp.getData();
  }

  /**
   * Send the e-invoice Sends the e-invoice to SDI.
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @param sendEInvoiceRequest (optional)
   * @return ApiResponse&lt;SendEInvoiceResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<SendEInvoiceResponse> sendEInvoiceWithHttpInfo(
      Integer companyId, Integer documentId, SendEInvoiceRequest sendEInvoiceRequest)
      throws ApiException {
    okhttp3.Call localVarCall =
        sendEInvoiceValidateBeforeCall(companyId, documentId, sendEInvoiceRequest, null);
    Type localVarReturnType = new TypeToken<SendEInvoiceResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Send the e-invoice (asynchronously) Sends the e-invoice to SDI.
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @param sendEInvoiceRequest (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call sendEInvoiceAsync(
      Integer companyId,
      Integer documentId,
      SendEInvoiceRequest sendEInvoiceRequest,
      final ApiCallback<SendEInvoiceResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        sendEInvoiceValidateBeforeCall(companyId, documentId, sendEInvoiceRequest, _callback);
    Type localVarReturnType = new TypeToken<SendEInvoiceResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for verifyEInvoiceXml
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * <tr><td> 422 </td><td> Example response </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call verifyEInvoiceXmlCall(
      Integer companyId, Integer documentId, final ApiCallback _callback) throws ApiException {
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
        "/c/{company_id}/issued_documents/{document_id}/e_invoice/xml_verify"
            .replaceAll(
                "\\{" + "company_id" + "\\}", localVarApiClient.escapeString(companyId.toString()))
            .replaceAll(
                "\\{" + "document_id" + "\\}",
                localVarApiClient.escapeString(documentId.toString()));

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
  private okhttp3.Call verifyEInvoiceXmlValidateBeforeCall(
      Integer companyId, Integer documentId, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      throw new ApiException(
          "Missing the required parameter 'companyId' when calling verifyEInvoiceXml(Async)");
    }

    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(
          "Missing the required parameter 'documentId' when calling verifyEInvoiceXml(Async)");
    }

    okhttp3.Call localVarCall = verifyEInvoiceXmlCall(companyId, documentId, _callback);
    return localVarCall;
  }

  /**
   * Verify e-invoice XML Verifies the e-invoice XML format. Checks if all of the mandatory fields
   * are filled and compliant to the right format.
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @return VerifyEInvoiceXmlResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * <tr><td> 422 </td><td> Example response </td><td>  -  </td></tr>
   * </table>
   */
  public VerifyEInvoiceXmlResponse verifyEInvoiceXml(Integer companyId, Integer documentId)
      throws ApiException {
    ApiResponse<VerifyEInvoiceXmlResponse> localVarResp =
        verifyEInvoiceXmlWithHttpInfo(companyId, documentId);
    return localVarResp.getData();
  }

  /**
   * Verify e-invoice XML Verifies the e-invoice XML format. Checks if all of the mandatory fields
   * are filled and compliant to the right format.
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @return ApiResponse&lt;VerifyEInvoiceXmlResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * <tr><td> 422 </td><td> Example response </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<VerifyEInvoiceXmlResponse> verifyEInvoiceXmlWithHttpInfo(
      Integer companyId, Integer documentId) throws ApiException {
    okhttp3.Call localVarCall = verifyEInvoiceXmlValidateBeforeCall(companyId, documentId, null);
    Type localVarReturnType = new TypeToken<VerifyEInvoiceXmlResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Verify e-invoice XML (asynchronously) Verifies the e-invoice XML format. Checks if all of the
   * mandatory fields are filled and compliant to the right format.
   *
   * @param companyId The ID of the company. (required)
   * @param documentId The ID of the document. (required)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   * <tr><td> 422 </td><td> Example response </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call verifyEInvoiceXmlAsync(
      Integer companyId, Integer documentId, final ApiCallback<VerifyEInvoiceXmlResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        verifyEInvoiceXmlValidateBeforeCall(companyId, documentId, _callback);
    Type localVarReturnType = new TypeToken<VerifyEInvoiceXmlResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
