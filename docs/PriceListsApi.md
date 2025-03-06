# PriceListsApi

All URIs are relative to *https://api-v2.fattureincloud.it*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPriceListItems**](PriceListsApi.md#getPriceListItems) | **GET** /c/{company_id}/price_lists/{price_list_id}/items | Get PriceList Items List |
| [**getPriceLists**](PriceListsApi.md#getPriceLists) | **GET** /c/{company_id}/price_lists | Get PriceLists |



## getPriceListItems

> GetPriceListItemsResponse getPriceListItems(companyId, priceListId)

Get PriceList Items List

Retrieves all the Items of a PriceList

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.PriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    String priceListId = "priceListId_example"; // String | 
    try {
      GetPriceListItemsResponse result = apiInstance.getPriceListItems(companyId, priceListId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#getPriceListItems");
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
| **priceListId** | **String**|  | |

### Return type

[**GetPriceListItemsResponse**](GetPriceListItemsResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |


## getPriceLists

> ListPriceListsResponse getPriceLists(companyId)

Get PriceLists

Retrieves all price lists of the company

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.PriceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    PriceListsApi apiInstance = new PriceListsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    try {
      ListPriceListsResponse result = apiInstance.getPriceLists(companyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListsApi#getPriceLists");
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

[**ListPriceListsResponse**](ListPriceListsResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |

