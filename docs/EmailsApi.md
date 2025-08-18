# EmailsApi

All URIs are relative to *https://api-v2.fattureincloud.it*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listEmails**](EmailsApi.md#listEmails) | **GET** /c/{company_id}/emails | List Emails |



## listEmails

> ListEmailsResponse listEmails(companyId, fields, fieldset, sort, page, perPage, q)

List Emails

List Emails.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.EmailsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    EmailsApi apiInstance = new EmailsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    String fields = "fields_example"; // String | List of comma-separated fields.
    String fieldset = "basic"; // String | Name of the fieldset.
    String sort = "sort_example"; // String | List of comma-separated fields for result sorting (minus for desc sorting).
    Integer page = 1; // Integer | The page to retrieve.
    Integer perPage = 5; // Integer | The size of the page.
    String q = "q_example"; // String | Query for filtering the results.
    try {
      ListEmailsResponse result = apiInstance.listEmails(companyId, fields, fieldset, sort, page, perPage, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailsApi#listEmails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **Integer**| The ID of the company. | |
| **fields** | **String**| List of comma-separated fields. | [optional] |
| **fieldset** | **String**| Name of the fieldset. | [optional] [enum: basic, detailed] |
| **sort** | **String**| List of comma-separated fields for result sorting (minus for desc sorting). | [optional] |
| **page** | **Integer**| The page to retrieve. | [optional] [default to 1] |
| **perPage** | **Integer**| The size of the page. | [optional] [default to 5] |
| **q** | **String**| Query for filtering the results. | [optional] |

### Return type

[**ListEmailsResponse**](ListEmailsResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |

