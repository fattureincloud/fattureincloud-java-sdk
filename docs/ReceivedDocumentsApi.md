# ReceivedDocumentsApi

All URIs are relative to *https://api-v2.fattureincloud.it*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReceivedDocument**](ReceivedDocumentsApi.md#createReceivedDocument) | **POST** /c/{company_id}/received_documents | Create Received Document |
| [**deleteBinReceivedDocument**](ReceivedDocumentsApi.md#deleteBinReceivedDocument) | **DELETE** /c/{company_id}/bin/received_documents/{document_id} |  |
| [**deleteReceivedDocument**](ReceivedDocumentsApi.md#deleteReceivedDocument) | **DELETE** /c/{company_id}/received_documents/{document_id} | Delete Received Document |
| [**deleteReceivedDocumentAttachment**](ReceivedDocumentsApi.md#deleteReceivedDocumentAttachment) | **DELETE** /c/{company_id}/received_documents/{document_id}/attachment | Delete Received Document Attachment |
| [**getBinReceivedDocument**](ReceivedDocumentsApi.md#getBinReceivedDocument) | **GET** /c/{company_id}/bin/received_documents/{document_id} | Get Bin Received Documents List |
| [**getExistingReceivedDocumentTotals**](ReceivedDocumentsApi.md#getExistingReceivedDocumentTotals) | **POST** /c/{company_id}/received_documents/{document_id}/totals | Get Existing Received Document Totals |
| [**getNewReceivedDocumentTotals**](ReceivedDocumentsApi.md#getNewReceivedDocumentTotals) | **POST** /c/{company_id}/received_documents/totals | Get New Received Document Totals |
| [**getReceivedDocument**](ReceivedDocumentsApi.md#getReceivedDocument) | **GET** /c/{company_id}/received_documents/{document_id} | Get Received Document |
| [**getReceivedDocumentPreCreateInfo**](ReceivedDocumentsApi.md#getReceivedDocumentPreCreateInfo) | **GET** /c/{company_id}/received_documents/info | Get Received Document Pre-Create Info |
| [**listBinReceivedDocuments**](ReceivedDocumentsApi.md#listBinReceivedDocuments) | **GET** /c/{company_id}/bin/received_documents | Get Bin Received Documents List |
| [**listReceivedDocuments**](ReceivedDocumentsApi.md#listReceivedDocuments) | **GET** /c/{company_id}/received_documents | List Received Documents |
| [**modifyReceivedDocument**](ReceivedDocumentsApi.md#modifyReceivedDocument) | **PUT** /c/{company_id}/received_documents/{document_id} | Modify Received Document |
| [**recoverBinReceivedDocument**](ReceivedDocumentsApi.md#recoverBinReceivedDocument) | **POST** /c/{company_id}/bin/received_documents/{document_id}/recover |  |
| [**uploadReceivedDocumentAttachment**](ReceivedDocumentsApi.md#uploadReceivedDocumentAttachment) | **POST** /c/{company_id}/received_documents/attachment | Upload Received Document Attachment |



## createReceivedDocument

> CreateReceivedDocumentResponse createReceivedDocument(companyId, createReceivedDocumentRequest)

Create Received Document

Creates a new document.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.ReceivedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    CreateReceivedDocumentRequest createReceivedDocumentRequest = new CreateReceivedDocumentRequest(); // CreateReceivedDocumentRequest | Document to create
    try {
      CreateReceivedDocumentResponse result = apiInstance.createReceivedDocument(companyId, createReceivedDocumentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivedDocumentsApi#createReceivedDocument");
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
| **createReceivedDocumentRequest** | [**CreateReceivedDocumentRequest**](CreateReceivedDocumentRequest.md)| Document to create | [optional] |

### Return type

[**CreateReceivedDocumentResponse**](CreateReceivedDocumentResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Document created. |  -  |


## deleteBinReceivedDocument

> deleteBinReceivedDocument(companyId, documentId)



Delete Bin Received Document

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.ReceivedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    Integer documentId = 56; // Integer | The ID of the document.
    try {
      apiInstance.deleteBinReceivedDocument(companyId, documentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivedDocumentsApi#deleteBinReceivedDocument");
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
| **documentId** | **Integer**| The ID of the document. | |

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


## deleteReceivedDocument

> deleteReceivedDocument(companyId, documentId)

Delete Received Document

Deletes the specified document.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.ReceivedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    Integer documentId = 56; // Integer | The ID of the document.
    try {
      apiInstance.deleteReceivedDocument(companyId, documentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivedDocumentsApi#deleteReceivedDocument");
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
| **documentId** | **Integer**| The ID of the document. | |

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
| **200** | Document removed. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |


## deleteReceivedDocumentAttachment

> deleteReceivedDocumentAttachment(companyId, documentId)

Delete Received Document Attachment

Removes the attachment of the specified document.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.ReceivedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    Integer documentId = 56; // Integer | The ID of the document.
    try {
      apiInstance.deleteReceivedDocumentAttachment(companyId, documentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivedDocumentsApi#deleteReceivedDocumentAttachment");
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
| **documentId** | **Integer**| The ID of the document. | |

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
| **200** | File removed |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |


## getBinReceivedDocument

> GetBinIssuedDocumentResponse getBinReceivedDocument(companyId, documentId)

Get Bin Received Documents List

Get bin issued documents detail

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.ReceivedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    Integer documentId = 56; // Integer | The ID of the document.
    try {
      GetBinIssuedDocumentResponse result = apiInstance.getBinReceivedDocument(companyId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivedDocumentsApi#getBinReceivedDocument");
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
| **documentId** | **Integer**| The ID of the document. | |

### Return type

[**GetBinIssuedDocumentResponse**](GetBinIssuedDocumentResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bin issued document details |  -  |


## getExistingReceivedDocumentTotals

> GetExistingReceivedDocumentTotalsResponse getExistingReceivedDocumentTotals(companyId, documentId, getExistingReceivedDocumentTotalsRequest)

Get Existing Received Document Totals

Returns the totals for the specified document.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.ReceivedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    Integer documentId = 56; // Integer | The ID of the document.
    GetExistingReceivedDocumentTotalsRequest getExistingReceivedDocumentTotalsRequest = new GetExistingReceivedDocumentTotalsRequest(); // GetExistingReceivedDocumentTotalsRequest | Received document.
    try {
      GetExistingReceivedDocumentTotalsResponse result = apiInstance.getExistingReceivedDocumentTotals(companyId, documentId, getExistingReceivedDocumentTotalsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivedDocumentsApi#getExistingReceivedDocumentTotals");
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
| **documentId** | **Integer**| The ID of the document. | |
| **getExistingReceivedDocumentTotalsRequest** | [**GetExistingReceivedDocumentTotalsRequest**](GetExistingReceivedDocumentTotalsRequest.md)| Received document. | [optional] |

### Return type

[**GetExistingReceivedDocumentTotalsResponse**](GetExistingReceivedDocumentTotalsResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Document Totals. |  -  |


## getNewReceivedDocumentTotals

> GetNewReceivedDocumentTotalsResponse getNewReceivedDocumentTotals(companyId, getNewReceivedDocumentTotalsRequest)

Get New Received Document Totals

Returns the totals for a new document.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.ReceivedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    GetNewReceivedDocumentTotalsRequest getNewReceivedDocumentTotalsRequest = new GetNewReceivedDocumentTotalsRequest(); // GetNewReceivedDocumentTotalsRequest | Received document.
    try {
      GetNewReceivedDocumentTotalsResponse result = apiInstance.getNewReceivedDocumentTotals(companyId, getNewReceivedDocumentTotalsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivedDocumentsApi#getNewReceivedDocumentTotals");
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
| **getNewReceivedDocumentTotalsRequest** | [**GetNewReceivedDocumentTotalsRequest**](GetNewReceivedDocumentTotalsRequest.md)| Received document. | [optional] |

### Return type

[**GetNewReceivedDocumentTotalsResponse**](GetNewReceivedDocumentTotalsResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Document Totals. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |


## getReceivedDocument

> GetReceivedDocumentResponse getReceivedDocument(companyId, documentId, fields, fieldset)

Get Received Document

Gets the specified document.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.ReceivedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    Integer documentId = 56; // Integer | The ID of the document.
    String fields = "fields_example"; // String | List of comma-separated fields.
    String fieldset = "basic"; // String | Name of the fieldset.
    try {
      GetReceivedDocumentResponse result = apiInstance.getReceivedDocument(companyId, documentId, fields, fieldset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivedDocumentsApi#getReceivedDocument");
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
| **documentId** | **Integer**| The ID of the document. | |
| **fields** | **String**| List of comma-separated fields. | [optional] |
| **fieldset** | **String**| Name of the fieldset. | [optional] [enum: basic, detailed] |

### Return type

[**GetReceivedDocumentResponse**](GetReceivedDocumentResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Document details. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |


## getReceivedDocumentPreCreateInfo

> GetReceivedDocumentPreCreateInfoResponse getReceivedDocumentPreCreateInfo(companyId, type)

Get Received Document Pre-Create Info

Retrieves the information useful while creating a new document.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.ReceivedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    String type = "expense"; // String | The type of the received document.
    try {
      GetReceivedDocumentPreCreateInfoResponse result = apiInstance.getReceivedDocumentPreCreateInfo(companyId, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivedDocumentsApi#getReceivedDocumentPreCreateInfo");
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
| **type** | **String**| The type of the received document. | [enum: expense, passive_credit_note, passive_delivery_note, self_invoice] |

### Return type

[**GetReceivedDocumentPreCreateInfoResponse**](GetReceivedDocumentPreCreateInfoResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pre-create info |  -  |


## listBinReceivedDocuments

> ListBinReceivedDocuments listBinReceivedDocuments(companyId)

Get Bin Received Documents List

Get bin Received documents list

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.ReceivedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    try {
      ListBinReceivedDocuments result = apiInstance.listBinReceivedDocuments(companyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivedDocumentsApi#listBinReceivedDocuments");
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

[**ListBinReceivedDocuments**](ListBinReceivedDocuments.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |


## listReceivedDocuments

> ListReceivedDocumentsResponse listReceivedDocuments(companyId, type, fields, fieldset, sort, page, perPage, q)

List Received Documents

Lists the received documents.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.ReceivedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    String type = "expense"; // String | The type of the received document.
    String fields = "fields_example"; // String | List of comma-separated fields.
    String fieldset = "basic"; // String | Name of the fieldset.
    String sort = "sort_example"; // String | List of comma-separated fields for result sorting (minus for desc sorting).
    Integer page = 1; // Integer | The page to retrieve.
    Integer perPage = 5; // Integer | The size of the page.
    String q = "q_example"; // String | Query for filtering the results.
    try {
      ListReceivedDocumentsResponse result = apiInstance.listReceivedDocuments(companyId, type, fields, fieldset, sort, page, perPage, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivedDocumentsApi#listReceivedDocuments");
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
| **type** | **String**| The type of the received document. | [enum: expense, passive_credit_note, passive_delivery_note, self_invoice] |
| **fields** | **String**| List of comma-separated fields. | [optional] |
| **fieldset** | **String**| Name of the fieldset. | [optional] [enum: basic, detailed] |
| **sort** | **String**| List of comma-separated fields for result sorting (minus for desc sorting). | [optional] |
| **page** | **Integer**| The page to retrieve. | [optional] [default to 1] |
| **perPage** | **Integer**| The size of the page. | [optional] [default to 5] |
| **q** | **String**| Query for filtering the results. | [optional] |

### Return type

[**ListReceivedDocumentsResponse**](ListReceivedDocumentsResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Results list. |  -  |
| **401** | Unauthorized |  -  |


## modifyReceivedDocument

> ModifyReceivedDocumentResponse modifyReceivedDocument(companyId, documentId, modifyReceivedDocumentRequest)

Modify Received Document

Modifies the specified document.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.ReceivedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    Integer documentId = 56; // Integer | The ID of the document.
    ModifyReceivedDocumentRequest modifyReceivedDocumentRequest = new ModifyReceivedDocumentRequest(); // ModifyReceivedDocumentRequest | Modified document.
    try {
      ModifyReceivedDocumentResponse result = apiInstance.modifyReceivedDocument(companyId, documentId, modifyReceivedDocumentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivedDocumentsApi#modifyReceivedDocument");
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
| **documentId** | **Integer**| The ID of the document. | |
| **modifyReceivedDocumentRequest** | [**ModifyReceivedDocumentRequest**](ModifyReceivedDocumentRequest.md)| Modified document. | [optional] |

### Return type

[**ModifyReceivedDocumentResponse**](ModifyReceivedDocumentResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Modified document. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |


## recoverBinReceivedDocument

> recoverBinReceivedDocument(companyId, documentId)



Recover Received Document From The Bin

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.ReceivedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    Integer documentId = 56; // Integer | The ID of the document.
    try {
      apiInstance.recoverBinReceivedDocument(companyId, documentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivedDocumentsApi#recoverBinReceivedDocument");
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
| **documentId** | **Integer**| The ID of the document. | |

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


## uploadReceivedDocumentAttachment

> UploadReceivedDocumentAttachmentResponse uploadReceivedDocumentAttachment(companyId, filename, attachment)

Upload Received Document Attachment

Uploads an attachment destined to a received document. The actual association between the document and the attachment must be implemented separately, using the returned token.

### Example
```java
// Import classes:
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.Configuration;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.models.*;
import it.fattureincloud.sdk.api.ReceivedDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-v2.fattureincloud.it");
    
    // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
    OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
    OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

    ReceivedDocumentsApi apiInstance = new ReceivedDocumentsApi(defaultClient);
    Integer companyId = 12345; // Integer | The ID of the company.
    String filename = "filename_example"; // String | Attachment file name
    File attachment = new File("/path/to/file"); // File | Attachment file [.png, .jpg, .gif, .pdf, .zip, .xls, .xlsx, .doc, .docx]
    try {
      UploadReceivedDocumentAttachmentResponse result = apiInstance.uploadReceivedDocumentAttachment(companyId, filename, attachment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceivedDocumentsApi#uploadReceivedDocumentAttachment");
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
| **filename** | **String**| Attachment file name | [optional] |
| **attachment** | **File**| Attachment file [.png, .jpg, .gif, .pdf, .zip, .xls, .xlsx, .doc, .docx] | [optional] |

### Return type

[**UploadReceivedDocumentAttachmentResponse**](UploadReceivedDocumentAttachmentResponse.md)

### Authorization

[OAuth2AuthenticationCodeFlow](../README.md#OAuth2AuthenticationCodeFlow)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Attachment Token. |  -  |
| **401** | Unauthorized |  -  |

