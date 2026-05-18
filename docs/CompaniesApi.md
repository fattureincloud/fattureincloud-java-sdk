# CompaniesApi

All URIs are relative to *https://api-v2.fattureincloud.it*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCompanyInfo**](CompaniesApi.md#getCompanyInfo) | **GET** /c/{company_id}/company/info | Get Company Info |
| [**getCompanyPlanUsage**](CompaniesApi.md#getCompanyPlanUsage) | **GET** /c/{company_id}/company/plan_usage | Get Company Plan Usage |



## getCompanyInfo

> GetCompanyInfoResponse getCompanyInfo(companyId)

Get Company Info

Gets the company detailed info.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.CompaniesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    CompaniesApi apiInstance = new CompaniesApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    try {
      GetCompanyInfoResponse result = apiInstance.getCompanyInfo(companyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#getCompanyInfo");
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

### Return type

[**GetCompanyInfoResponse**](GetCompanyInfoResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Company info. |  * RateLimit-HourlyRemaining -  <br>  * RateLimit-HourlyLimit -  <br>  * RateLimit-MonthlyRemaining -  <br>  * RateLimit-MonthlyLimit -  <br>  |
| **400** | ErrorResponse |  * Retry-After -  <br>  |
| **401** | ErrorResponse |  * Retry-After -  <br>  |
| **403** | ErrorResponse |  * Retry-After -  <br>  |
| **404** | ErrorResponse |  * Retry-After -  <br>  |
| **405** | ErrorResponse |  * Retry-After -  <br>  |
| **409** | ErrorResponse |  * Retry-After -  <br>  |
| **422** | ErrorResponse |  * Retry-After -  <br>  |
| **429** | ErrorResponse |  * Retry-After -  <br>  |
| **500** | ErrorResponse |  * Retry-After -  <br>  |


## getCompanyPlanUsage

> GetCompanyPlanUsageResponse getCompanyPlanUsage(companyId, category)

Get Company Plan Usage

Gets the company limits usage.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.CompaniesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    CompaniesApi apiInstance = new CompaniesApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    String category = "clients"; // String | Category
    try {
      GetCompanyPlanUsageResponse result = apiInstance.getCompanyPlanUsage(companyId, category);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#getCompanyPlanUsage");
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
| **category** | **String**| Category | [enum: clients, suppliers, products, documents] |

### Return type

[**GetCompanyPlanUsageResponse**](GetCompanyPlanUsageResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  * RateLimit-HourlyRemaining -  <br>  * RateLimit-HourlyLimit -  <br>  * RateLimit-MonthlyRemaining -  <br>  * RateLimit-MonthlyLimit -  <br>  |
| **400** | ErrorResponse |  * Retry-After -  <br>  |
| **401** | ErrorResponse |  * Retry-After -  <br>  |
| **403** | ErrorResponse |  * Retry-After -  <br>  |
| **404** | ErrorResponse |  * Retry-After -  <br>  |
| **405** | ErrorResponse |  * Retry-After -  <br>  |
| **409** | ErrorResponse |  * Retry-After -  <br>  |
| **422** | ErrorResponse |  * Retry-After -  <br>  |
| **429** | ErrorResponse |  * Retry-After -  <br>  |
| **500** | ErrorResponse |  * Retry-After -  <br>  |

