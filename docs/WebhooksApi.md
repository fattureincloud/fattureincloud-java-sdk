# WebhooksApi

All URIs are relative to *https://api-v2.fattureincloud.it*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhooksSubscription**](WebhooksApi.md#createWebhooksSubscription) | **POST** /c/{company_id}/subscriptions | Create a Webhook Subscription |
| [**deleteWebhooksSubscription**](WebhooksApi.md#deleteWebhooksSubscription) | **DELETE** /c/{company_id}/subscriptions/{subscription_id} | Delete Webhooks Subscription |
| [**getWebhooksSubscription**](WebhooksApi.md#getWebhooksSubscription) | **GET** /c/{company_id}/subscriptions/{subscription_id} | Get Webhooks Subscription |
| [**listWebhooksSubscriptions**](WebhooksApi.md#listWebhooksSubscriptions) | **GET** /c/{company_id}/subscriptions | List Webhooks Subscriptions |
| [**modifyWebhooksSubscription**](WebhooksApi.md#modifyWebhooksSubscription) | **PUT** /c/{company_id}/subscriptions/{subscription_id} | Modify Webhooks Subscription |



## createWebhooksSubscription

> CreateWebhooksSubscriptionResponse createWebhooksSubscription(companyId, createWebhooksSubscriptionRequest)

Create a Webhook Subscription

Register some webhooks Subscriptions.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    CreateWebhooksSubscriptionRequest createWebhooksSubscriptionRequest = new CreateWebhooksSubscriptionRequest(); // CreateWebhooksSubscriptionRequest | 
    try {
      CreateWebhooksSubscriptionResponse result = apiInstance.createWebhooksSubscription(companyId, createWebhooksSubscriptionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#createWebhooksSubscription");
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
| **createWebhooksSubscriptionRequest** | [**CreateWebhooksSubscriptionRequest**](CreateWebhooksSubscriptionRequest.md)|  | [optional] |

### Return type

[**CreateWebhooksSubscriptionResponse**](CreateWebhooksSubscriptionResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |


## deleteWebhooksSubscription

> deleteWebhooksSubscription(companyId, subscriptionId)

Delete Webhooks Subscription

Delete a webhooks subscription.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    String subscriptionId = "SUB123"; // String | The ID of the subscription.
    try {
      apiInstance.deleteWebhooksSubscription(companyId, subscriptionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#deleteWebhooksSubscription");
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
| **subscriptionId** | **String**| The ID of the subscription. | |

### Return type

null (empty response body)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getWebhooksSubscription

> GetWebhooksSubscriptionResponse getWebhooksSubscription(companyId, subscriptionId)

Get Webhooks Subscription

Get a webhooks subscription.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    String subscriptionId = "SUB123"; // String | The ID of the subscription.
    try {
      GetWebhooksSubscriptionResponse result = apiInstance.getWebhooksSubscription(companyId, subscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getWebhooksSubscription");
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
| **subscriptionId** | **String**| The ID of the subscription. | |

### Return type

[**GetWebhooksSubscriptionResponse**](GetWebhooksSubscriptionResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |


## listWebhooksSubscriptions

> ListWebhooksSubscriptionsResponse listWebhooksSubscriptions(companyId)

List Webhooks Subscriptions

List active webhooks subscriptions.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    try {
      ListWebhooksSubscriptionsResponse result = apiInstance.listWebhooksSubscriptions(companyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#listWebhooksSubscriptions");
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

[**ListWebhooksSubscriptionsResponse**](ListWebhooksSubscriptionsResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |


## modifyWebhooksSubscription

> ModifyWebhooksSubscriptionResponse modifyWebhooksSubscription(companyId, subscriptionId, modifyWebhooksSubscriptionRequest)

Modify Webhooks Subscription

Edit a webhooks subscription.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    String subscriptionId = "SUB123"; // String | The ID of the subscription.
    ModifyWebhooksSubscriptionRequest modifyWebhooksSubscriptionRequest = new ModifyWebhooksSubscriptionRequest(); // ModifyWebhooksSubscriptionRequest | 
    try {
      ModifyWebhooksSubscriptionResponse result = apiInstance.modifyWebhooksSubscription(companyId, subscriptionId, modifyWebhooksSubscriptionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#modifyWebhooksSubscription");
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
| **subscriptionId** | **String**| The ID of the subscription. | |
| **modifyWebhooksSubscriptionRequest** | [**ModifyWebhooksSubscriptionRequest**](ModifyWebhooksSubscriptionRequest.md)|  | [optional] |

### Return type

[**ModifyWebhooksSubscriptionResponse**](ModifyWebhooksSubscriptionResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |

