# FattureInCloud Java SDK

Fatture in Cloud API v2 - API Reference

- API version: 2.0.12

- Build date: 2022-02-21T14:15:24.489Z[Etc/UTC]

Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy. 

The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.

  For more information, please visit [https://www.fattureincloud.it](https://www.fattureincloud.it)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>it.fattureincloud</groupId>
  <artifactId>fattureincloud-java-sdk</artifactId>
  <version>2.0.4</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()
  }

  dependencies {
     implementation "it.fattureincloud:fattureincloud-java-sdk:2.0.4"
  }
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import it.fattureincloud.sdk.*;
import it.fattureincloud.sdk.auth.*;
import it.fattureincloud.sdk.model.*;
import it.fattureincloud.sdk.api.ArchiveApi;

public class ArchiveApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-v2.fattureincloud.it");
        
        // Configure OAuth2 access token for authorization: OAuth2AuthenticationCodeFlow
        OAuth OAuth2AuthenticationCodeFlow = (OAuth) defaultClient.getAuthentication("OAuth2AuthenticationCodeFlow");
        OAuth2AuthenticationCodeFlow.setAccessToken("YOUR ACCESS TOKEN");

        ArchiveApi apiInstance = new ArchiveApi(defaultClient);
        Integer companyId = 12345; // Integer | The ID of the company.
        CreateArchiveDocumentRequest createArchiveDocumentRequest = new CreateArchiveDocumentRequest(); // CreateArchiveDocumentRequest | The Archive Document.
        try {
            CreateArchiveDocumentResponse result = apiInstance.createArchiveDocument(companyId, createArchiveDocumentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArchiveApi#createArchiveDocument");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api-v2.fattureincloud.it*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ArchiveApi* | [**createArchiveDocument**](docs/ArchiveApi.md#createArchiveDocument) | **POST** /c/{company_id}/archive | Create Archive Document
*ArchiveApi* | [**deleteArchiveDocument**](docs/ArchiveApi.md#deleteArchiveDocument) | **DELETE** /c/{company_id}/archive/{document_id} | Delete Archive Document
*ArchiveApi* | [**getArchiveDocument**](docs/ArchiveApi.md#getArchiveDocument) | **GET** /c/{company_id}/archive/{document_id} | Get Archive Document
*ArchiveApi* | [**listArchiveDocuments**](docs/ArchiveApi.md#listArchiveDocuments) | **GET** /c/{company_id}/archive | List Archive Documents
*ArchiveApi* | [**modifyArchiveDocument**](docs/ArchiveApi.md#modifyArchiveDocument) | **PUT** /c/{company_id}/archive/{document_id} | Modify Archive Document
*ArchiveApi* | [**uploadArchiveDocumentAttachment**](docs/ArchiveApi.md#uploadArchiveDocumentAttachment) | **POST** /c/{company_id}/archive/attachment | Upload Archive Document Attachment
*CashbookApi* | [**createCashbookEntry**](docs/CashbookApi.md#createCashbookEntry) | **POST** /c/{company_id}/cashbook | Create Cashbook Entry
*CashbookApi* | [**deleteCashbookEntry**](docs/CashbookApi.md#deleteCashbookEntry) | **DELETE** /c/{company_id}/cashbook/{document_id} | Delete Cashbook Entry
*CashbookApi* | [**getCashbookEntry**](docs/CashbookApi.md#getCashbookEntry) | **GET** /c/{company_id}/cashbook/{document_id} | Get Cashbook Entry
*CashbookApi* | [**listCashbookEntries**](docs/CashbookApi.md#listCashbookEntries) | **GET** /c/{company_id}/cashbook | List Cashbook Entries
*CashbookApi* | [**modifyCashbookEntry**](docs/CashbookApi.md#modifyCashbookEntry) | **PUT** /c/{company_id}/cashbook/{document_id} | Modify Cashbook Entry
*ClientsApi* | [**createClient**](docs/ClientsApi.md#createClient) | **POST** /c/{company_id}/entities/clients | Create Client
*ClientsApi* | [**deleteClient**](docs/ClientsApi.md#deleteClient) | **DELETE** /c/{company_id}/entities/clients/{client_id} | Delete Client
*ClientsApi* | [**getClient**](docs/ClientsApi.md#getClient) | **GET** /c/{company_id}/entities/clients/{client_id} | Get Client
*ClientsApi* | [**listClients**](docs/ClientsApi.md#listClients) | **GET** /c/{company_id}/entities/clients | List Clients
*ClientsApi* | [**modifyClient**](docs/ClientsApi.md#modifyClient) | **PUT** /c/{company_id}/entities/clients/{client_id} | Modify Client
*CompaniesApi* | [**getCompanyInfo**](docs/CompaniesApi.md#getCompanyInfo) | **GET** /c/{company_id}/company/info | Get Company Info
*InfoApi* | [**listArchiveCategories**](docs/InfoApi.md#listArchiveCategories) | **GET** /c/{company_id}/info/archive_categories | List Archive Categories
*InfoApi* | [**listCities**](docs/InfoApi.md#listCities) | **GET** /info/cities | List Cities
*InfoApi* | [**listCostCenters**](docs/InfoApi.md#listCostCenters) | **GET** /c/{company_id}/info/cost_centers | List Cost Centers
*InfoApi* | [**listCountries**](docs/InfoApi.md#listCountries) | **GET** /info/countries | List Countries
*InfoApi* | [**listCurrencies**](docs/InfoApi.md#listCurrencies) | **GET** /info/currencies | List Currencies
*InfoApi* | [**listDeliveryNotesDefaultCausals**](docs/InfoApi.md#listDeliveryNotesDefaultCausals) | **GET** /info/dn_causals | List Delivery Notes Default Causals
*InfoApi* | [**listLanguages**](docs/InfoApi.md#listLanguages) | **GET** /info/languages | List Languages
*InfoApi* | [**listPaymentAccounts**](docs/InfoApi.md#listPaymentAccounts) | **GET** /c/{company_id}/info/payment_accounts | List Payment Accounts
*InfoApi* | [**listPaymentMethods**](docs/InfoApi.md#listPaymentMethods) | **GET** /c/{company_id}/info/payment_methods | List Payment Methods
*InfoApi* | [**listProductCategories**](docs/InfoApi.md#listProductCategories) | **GET** /c/{company_id}/info/product_categories | List Product Categories
*InfoApi* | [**listReceivedDocumentCategories**](docs/InfoApi.md#listReceivedDocumentCategories) | **GET** /c/{company_id}/info/received_document_categories | List Received Document Categories
*InfoApi* | [**listRevenueCenters**](docs/InfoApi.md#listRevenueCenters) | **GET** /c/{company_id}/info/revenue_centers | List Revenue Centers
*InfoApi* | [**listTemplates**](docs/InfoApi.md#listTemplates) | **GET** /info/templates | List Templates
*InfoApi* | [**listUnitsOfMeasure**](docs/InfoApi.md#listUnitsOfMeasure) | **GET** /info/measures | List Units of Measure
*InfoApi* | [**listVatTypes**](docs/InfoApi.md#listVatTypes) | **GET** /c/{company_id}/info/vat_types | List Vat Types
*IssuedDocumentsApi* | [**createIssuedDocument**](docs/IssuedDocumentsApi.md#createIssuedDocument) | **POST** /c/{company_id}/issued_documents | Create Issued Document
*IssuedDocumentsApi* | [**deleteIssuedDocument**](docs/IssuedDocumentsApi.md#deleteIssuedDocument) | **DELETE** /c/{company_id}/issued_documents/{document_id} | Delete Issued Document
*IssuedDocumentsApi* | [**deleteIssuedDocumentAttachment**](docs/IssuedDocumentsApi.md#deleteIssuedDocumentAttachment) | **DELETE** /c/{company_id}/issued_documents/{document_id}/attachment | Delete Issued Document Attachment
*IssuedDocumentsApi* | [**getEmailData**](docs/IssuedDocumentsApi.md#getEmailData) | **GET** /c/{company_id}/issued_documents/{document_id}/email | Get Email Data
*IssuedDocumentsApi* | [**getExistingIssuedDocumentTotals**](docs/IssuedDocumentsApi.md#getExistingIssuedDocumentTotals) | **POST** /c/{company_id}/issued_documents/{document_id}/totals | Get Existing Issued Document Totals
*IssuedDocumentsApi* | [**getIssuedDocument**](docs/IssuedDocumentsApi.md#getIssuedDocument) | **GET** /c/{company_id}/issued_documents/{document_id} | Get Issued Document
*IssuedDocumentsApi* | [**getIssuedDocumentPreCreateInfo**](docs/IssuedDocumentsApi.md#getIssuedDocumentPreCreateInfo) | **GET** /c/{company_id}/issued_documents/info | Get Issued Document Pre-create info
*IssuedDocumentsApi* | [**getNewIssuedDocumentTotals**](docs/IssuedDocumentsApi.md#getNewIssuedDocumentTotals) | **POST** /c/{company_id}/issued_documents/totals | Get New Issued Document Totals
*IssuedDocumentsApi* | [**listIssuedDocuments**](docs/IssuedDocumentsApi.md#listIssuedDocuments) | **GET** /c/{company_id}/issued_documents | List Issued Documents
*IssuedDocumentsApi* | [**modifyIssuedDocument**](docs/IssuedDocumentsApi.md#modifyIssuedDocument) | **PUT** /c/{company_id}/issued_documents/{document_id} | Modify Issued Document
*IssuedDocumentsApi* | [**scheduleEmail**](docs/IssuedDocumentsApi.md#scheduleEmail) | **POST** /c/{company_id}/issued_documents/{document_id}/email | Schedule Email
*IssuedDocumentsApi* | [**uploadIssuedDocumentAttachment**](docs/IssuedDocumentsApi.md#uploadIssuedDocumentAttachment) | **POST** /c/{company_id}/issued_documents/attachment | Upload Issued Document Attachment
*IssuedEInvoicesApi* | [**getEInvoiceRejectionReason**](docs/IssuedEInvoicesApi.md#getEInvoiceRejectionReason) | **GET** /c/{company_id}/issued_documents/{document_id}/e_invoice/error_reason | Get EInvoice rejection reason
*IssuedEInvoicesApi* | [**getEInvoiceXml**](docs/IssuedEInvoicesApi.md#getEInvoiceXml) | **GET** /c/{company_id}/issued_documents/{document_id}/e_invoice/xml | Get e-invoice XML
*IssuedEInvoicesApi* | [**sendEInvoice**](docs/IssuedEInvoicesApi.md#sendEInvoice) | **POST** /c/{company_id}/issued_documents/{document_id}/e_invoice/send | Send the e-invoice
*IssuedEInvoicesApi* | [**verifyEInvoiceXml**](docs/IssuedEInvoicesApi.md#verifyEInvoiceXml) | **GET** /c/{company_id}/issued_documents/{document_id}/e_invoice/xml_verify | Verify e-invoice xml
*ProductsApi* | [**createProduct**](docs/ProductsApi.md#createProduct) | **POST** /c/{company_id}/products | Create Product
*ProductsApi* | [**deleteProduct**](docs/ProductsApi.md#deleteProduct) | **DELETE** /c/{company_id}/products/{product_id} | Delete Product
*ProductsApi* | [**getProduct**](docs/ProductsApi.md#getProduct) | **GET** /c/{company_id}/products/{product_id} | Get Product
*ProductsApi* | [**listProducts**](docs/ProductsApi.md#listProducts) | **GET** /c/{company_id}/products | List Products
*ProductsApi* | [**modifyProduct**](docs/ProductsApi.md#modifyProduct) | **PUT** /c/{company_id}/products/{product_id} | Modify Product
*ReceiptsApi* | [**createReceipt**](docs/ReceiptsApi.md#createReceipt) | **POST** /c/{company_id}/receipts | Create Receipt
*ReceiptsApi* | [**deleteReceipt**](docs/ReceiptsApi.md#deleteReceipt) | **DELETE** /c/{company_id}/receipts/{document_id} | Delete Receipt
*ReceiptsApi* | [**getReceipt**](docs/ReceiptsApi.md#getReceipt) | **GET** /c/{company_id}/receipts/{document_id} | Get Receipt
*ReceiptsApi* | [**getReceiptPreCreateInfo**](docs/ReceiptsApi.md#getReceiptPreCreateInfo) | **GET** /c/{company_id}/receipts/info | Get Receipt Pre-Create Info
*ReceiptsApi* | [**getReceiptsMonthlyTotals**](docs/ReceiptsApi.md#getReceiptsMonthlyTotals) | **GET** /c/{company_id}/receipts/monthly_totals | Get Receipts Monthly Totals
*ReceiptsApi* | [**listReceipts**](docs/ReceiptsApi.md#listReceipts) | **GET** /c/{company_id}/receipts | List Receipts
*ReceiptsApi* | [**modifyReceipt**](docs/ReceiptsApi.md#modifyReceipt) | **PUT** /c/{company_id}/receipts/{document_id} | Modify Receipt
*ReceivedDocumentsApi* | [**createReceivedDocument**](docs/ReceivedDocumentsApi.md#createReceivedDocument) | **POST** /c/{company_id}/received_documents | Create Received Document
*ReceivedDocumentsApi* | [**deleteReceivedDocument**](docs/ReceivedDocumentsApi.md#deleteReceivedDocument) | **DELETE** /c/{company_id}/received_documents/{document_id} | Delete Received Document
*ReceivedDocumentsApi* | [**deleteReceivedDocumentAttachment**](docs/ReceivedDocumentsApi.md#deleteReceivedDocumentAttachment) | **DELETE** /c/{company_id}/received_documents/{document_id}/attachment | Delete Received Document Attachment
*ReceivedDocumentsApi* | [**getExistingReceivedDocumentTotals**](docs/ReceivedDocumentsApi.md#getExistingReceivedDocumentTotals) | **POST** /c/{company_id}/received_documents/{document_id}/totals | Get Existing Received Document Totals
*ReceivedDocumentsApi* | [**getNewReceivedDocumentTotals**](docs/ReceivedDocumentsApi.md#getNewReceivedDocumentTotals) | **POST** /c/{company_id}/received_documents/totals | Get New Received Document Totals
*ReceivedDocumentsApi* | [**getReceivedDocument**](docs/ReceivedDocumentsApi.md#getReceivedDocument) | **GET** /c/{company_id}/received_documents/{document_id} | Get Received Document
*ReceivedDocumentsApi* | [**getReceivedDocumentPreCreateInfo**](docs/ReceivedDocumentsApi.md#getReceivedDocumentPreCreateInfo) | **GET** /c/{company_id}/received_documents/info | Get Received Document Pre-Create Info
*ReceivedDocumentsApi* | [**listReceivedDocuments**](docs/ReceivedDocumentsApi.md#listReceivedDocuments) | **GET** /c/{company_id}/received_documents | List Received Documents
*ReceivedDocumentsApi* | [**modifyReceivedDocument**](docs/ReceivedDocumentsApi.md#modifyReceivedDocument) | **PUT** /c/{company_id}/received_documents/{document_id} | Modify Received Document
*ReceivedDocumentsApi* | [**uploadReceivedDocumentAttachment**](docs/ReceivedDocumentsApi.md#uploadReceivedDocumentAttachment) | **POST** /c/{company_id}/received_documents/attachment | Upload Received Document Attachment
*SettingsApi* | [**createPaymentAccount**](docs/SettingsApi.md#createPaymentAccount) | **POST** /c/{company_id}/settings/payment_accounts | Create Payment Account
*SettingsApi* | [**createPaymentMethod**](docs/SettingsApi.md#createPaymentMethod) | **POST** /c/{company_id}/settings/payment_methods | Create Payment Method
*SettingsApi* | [**createVatType**](docs/SettingsApi.md#createVatType) | **POST** /c/{company_id}/settings/vat_types | Create Vat Type
*SettingsApi* | [**deletePaymentAccount**](docs/SettingsApi.md#deletePaymentAccount) | **DELETE** /c/{company_id}/settings/payment_accounts/{payment_account_id} | Delete Payment Account
*SettingsApi* | [**deletePaymentMethod**](docs/SettingsApi.md#deletePaymentMethod) | **DELETE** /c/{company_id}/settings/payment_methods/{payment_method_id} | Delete Payment Method
*SettingsApi* | [**deleteVatType**](docs/SettingsApi.md#deleteVatType) | **DELETE** /c/{company_id}/settings/vat_types/{vat_type_id} | Delete Vat Type
*SettingsApi* | [**getPaymentAccount**](docs/SettingsApi.md#getPaymentAccount) | **GET** /c/{company_id}/settings/payment_accounts/{payment_account_id} | Get Payment Account
*SettingsApi* | [**getPaymentMethod**](docs/SettingsApi.md#getPaymentMethod) | **GET** /c/{company_id}/settings/payment_methods/{payment_method_id} | Get Payment Method
*SettingsApi* | [**getVatType**](docs/SettingsApi.md#getVatType) | **GET** /c/{company_id}/settings/vat_types/{vat_type_id} | Get Vat Type
*SettingsApi* | [**modifyPaymentAccount**](docs/SettingsApi.md#modifyPaymentAccount) | **PUT** /c/{company_id}/settings/payment_accounts/{payment_account_id} | Modify Payment Account
*SettingsApi* | [**modifyPaymentMethod**](docs/SettingsApi.md#modifyPaymentMethod) | **PUT** /c/{company_id}/settings/payment_methods/{payment_method_id} | Modify Payment Method
*SettingsApi* | [**modifyVatType**](docs/SettingsApi.md#modifyVatType) | **PUT** /c/{company_id}/settings/vat_types/{vat_type_id} | Modify Vat Type
*SuppliersApi* | [**createSupplier**](docs/SuppliersApi.md#createSupplier) | **POST** /c/{company_id}/entities/suppliers | Create Supplier
*SuppliersApi* | [**deleteSupplier**](docs/SuppliersApi.md#deleteSupplier) | **DELETE** /c/{company_id}/entities/suppliers/{supplier_id} | Delete Supplier
*SuppliersApi* | [**getSupplier**](docs/SuppliersApi.md#getSupplier) | **GET** /c/{company_id}/entities/suppliers/{supplier_id} | Get Supplier
*SuppliersApi* | [**listSuppliers**](docs/SuppliersApi.md#listSuppliers) | **GET** /c/{company_id}/entities/suppliers | List Suppliers
*SuppliersApi* | [**modifySupplier**](docs/SuppliersApi.md#modifySupplier) | **PUT** /c/{company_id}/entities/suppliers/{supplier_id} | Modify Supplier
*TaxesApi* | [**createF24**](docs/TaxesApi.md#createF24) | **POST** /c/{company_id}/taxes | Create F24
*TaxesApi* | [**deleteF24**](docs/TaxesApi.md#deleteF24) | **DELETE** /c/{company_id}/taxes/{document_id} | Delete F24
*TaxesApi* | [**deleteF24Attachment**](docs/TaxesApi.md#deleteF24Attachment) | **DELETE** /c/{company_id}/taxes/{document_id}/attachment | Delete F24 Attachment
*TaxesApi* | [**getF24**](docs/TaxesApi.md#getF24) | **GET** /c/{company_id}/taxes/{document_id} | Get F24
*TaxesApi* | [**listF24**](docs/TaxesApi.md#listF24) | **GET** /c/{company_id}/taxes | List F24
*TaxesApi* | [**modifyF24**](docs/TaxesApi.md#modifyF24) | **PUT** /c/{company_id}/taxes/{document_id} | Modify F24
*TaxesApi* | [**uploadF24Attachment**](docs/TaxesApi.md#uploadF24Attachment) | **POST** /c/{company_id}/taxes/attachment | Upload F24 Attachment
*UserApi* | [**getUserInfo**](docs/UserApi.md#getUserInfo) | **GET** /user/info | Get User Info
*UserApi* | [**listUserCompanies**](docs/UserApi.md#listUserCompanies) | **GET** /user/companies | List User Companies


## Documentation for Models

 - [ArchiveDocument](docs/ArchiveDocument.md)
 - [AttachmentData](docs/AttachmentData.md)
 - [CashbookEntry](docs/CashbookEntry.md)
 - [CashbookEntryDocument](docs/CashbookEntryDocument.md)
 - [CashbookEntryKind](docs/CashbookEntryKind.md)
 - [CashbookEntryType](docs/CashbookEntryType.md)
 - [City](docs/City.md)
 - [Client](docs/Client.md)
 - [ClientType](docs/ClientType.md)
 - [Company](docs/Company.md)
 - [CompanyInfo](docs/CompanyInfo.md)
 - [CompanyInfoAccessInfo](docs/CompanyInfoAccessInfo.md)
 - [CompanyInfoPlanInfo](docs/CompanyInfoPlanInfo.md)
 - [CompanyInfoPlanInfoFunctions](docs/CompanyInfoPlanInfoFunctions.md)
 - [CompanyInfoPlanInfoFunctionsStatus](docs/CompanyInfoPlanInfoFunctionsStatus.md)
 - [CompanyInfoPlanInfoLimits](docs/CompanyInfoPlanInfoLimits.md)
 - [CompanyType](docs/CompanyType.md)
 - [ControlledCompany](docs/ControlledCompany.md)
 - [CreateArchiveDocumentRequest](docs/CreateArchiveDocumentRequest.md)
 - [CreateArchiveDocumentResponse](docs/CreateArchiveDocumentResponse.md)
 - [CreateCashbookEntryRequest](docs/CreateCashbookEntryRequest.md)
 - [CreateCashbookEntryResponse](docs/CreateCashbookEntryResponse.md)
 - [CreateClientRequest](docs/CreateClientRequest.md)
 - [CreateClientResponse](docs/CreateClientResponse.md)
 - [CreateF24Request](docs/CreateF24Request.md)
 - [CreateF24Response](docs/CreateF24Response.md)
 - [CreateIssuedDocumentRequest](docs/CreateIssuedDocumentRequest.md)
 - [CreateIssuedDocumentResponse](docs/CreateIssuedDocumentResponse.md)
 - [CreatePaymentAccountRequest](docs/CreatePaymentAccountRequest.md)
 - [CreatePaymentAccountResponse](docs/CreatePaymentAccountResponse.md)
 - [CreatePaymentMethodRequest](docs/CreatePaymentMethodRequest.md)
 - [CreatePaymentMethodResponse](docs/CreatePaymentMethodResponse.md)
 - [CreateProductRequest](docs/CreateProductRequest.md)
 - [CreateProductResponse](docs/CreateProductResponse.md)
 - [CreateReceiptRequest](docs/CreateReceiptRequest.md)
 - [CreateReceiptResponse](docs/CreateReceiptResponse.md)
 - [CreateReceivedDocumentRequest](docs/CreateReceivedDocumentRequest.md)
 - [CreateReceivedDocumentResponse](docs/CreateReceivedDocumentResponse.md)
 - [CreateSupplierRequest](docs/CreateSupplierRequest.md)
 - [CreateSupplierResponse](docs/CreateSupplierResponse.md)
 - [CreateVatTypeRequest](docs/CreateVatTypeRequest.md)
 - [CreateVatTypeResponse](docs/CreateVatTypeResponse.md)
 - [Currency](docs/Currency.md)
 - [DefaultPaymentTermsType](docs/DefaultPaymentTermsType.md)
 - [DocumentTemplate](docs/DocumentTemplate.md)
 - [EinvoiceRejectionReason](docs/EinvoiceRejectionReason.md)
 - [EmailData](docs/EmailData.md)
 - [EmailDataDefaultSenderEmail](docs/EmailDataDefaultSenderEmail.md)
 - [EmailSchedule](docs/EmailSchedule.md)
 - [EmailScheduleInclude](docs/EmailScheduleInclude.md)
 - [Entity](docs/Entity.md)
 - [EntityOptions](docs/EntityOptions.md)
 - [EntityType](docs/EntityType.md)
 - [F24](docs/F24.md)
 - [F24Status](docs/F24Status.md)
 - [FunctionStatus](docs/FunctionStatus.md)
 - [GetArchiveDocumentResponse](docs/GetArchiveDocumentResponse.md)
 - [GetCashbookEntryResponse](docs/GetCashbookEntryResponse.md)
 - [GetClientResponse](docs/GetClientResponse.md)
 - [GetCompanyInfoResponse](docs/GetCompanyInfoResponse.md)
 - [GetEInvoiceRejectionReasonResponse](docs/GetEInvoiceRejectionReasonResponse.md)
 - [GetEmailDataResponse](docs/GetEmailDataResponse.md)
 - [GetExistingIssuedDocumentTotalsRequest](docs/GetExistingIssuedDocumentTotalsRequest.md)
 - [GetExistingIssuedDocumentTotalsResponse](docs/GetExistingIssuedDocumentTotalsResponse.md)
 - [GetExistingReceivedDocumentTotalsRequest](docs/GetExistingReceivedDocumentTotalsRequest.md)
 - [GetExistingReceivedDocumentTotalsResponse](docs/GetExistingReceivedDocumentTotalsResponse.md)
 - [GetF24Response](docs/GetF24Response.md)
 - [GetIssuedDocumentPreCreateInfoResponse](docs/GetIssuedDocumentPreCreateInfoResponse.md)
 - [GetIssuedDocumentResponse](docs/GetIssuedDocumentResponse.md)
 - [GetNewIssuedDocumentTotalsRequest](docs/GetNewIssuedDocumentTotalsRequest.md)
 - [GetNewIssuedDocumentTotalsResponse](docs/GetNewIssuedDocumentTotalsResponse.md)
 - [GetNewReceivedDocumentTotalsRequest](docs/GetNewReceivedDocumentTotalsRequest.md)
 - [GetNewReceivedDocumentTotalsResponse](docs/GetNewReceivedDocumentTotalsResponse.md)
 - [GetPaymentAccountResponse](docs/GetPaymentAccountResponse.md)
 - [GetPaymentMethodResponse](docs/GetPaymentMethodResponse.md)
 - [GetProductResponse](docs/GetProductResponse.md)
 - [GetReceiptPreCreateInfoResponse](docs/GetReceiptPreCreateInfoResponse.md)
 - [GetReceiptResponse](docs/GetReceiptResponse.md)
 - [GetReceiptsMonthlyTotalsResponse](docs/GetReceiptsMonthlyTotalsResponse.md)
 - [GetReceivedDocumentPreCreateInfoResponse](docs/GetReceivedDocumentPreCreateInfoResponse.md)
 - [GetReceivedDocumentResponse](docs/GetReceivedDocumentResponse.md)
 - [GetSupplierResponse](docs/GetSupplierResponse.md)
 - [GetUserInfoResponse](docs/GetUserInfoResponse.md)
 - [GetUserInfoResponseEmailConfirmationState](docs/GetUserInfoResponseEmailConfirmationState.md)
 - [GetUserInfoResponseInfo](docs/GetUserInfoResponseInfo.md)
 - [GetVatTypeResponse](docs/GetVatTypeResponse.md)
 - [IssuedDocument](docs/IssuedDocument.md)
 - [IssuedDocumentEiData](docs/IssuedDocumentEiData.md)
 - [IssuedDocumentExtraData](docs/IssuedDocumentExtraData.md)
 - [IssuedDocumentItemsListItem](docs/IssuedDocumentItemsListItem.md)
 - [IssuedDocumentOptions](docs/IssuedDocumentOptions.md)
 - [IssuedDocumentPaymentsListItem](docs/IssuedDocumentPaymentsListItem.md)
 - [IssuedDocumentPreCreateInfo](docs/IssuedDocumentPreCreateInfo.md)
 - [IssuedDocumentPreCreateInfoDefaultValues](docs/IssuedDocumentPreCreateInfoDefaultValues.md)
 - [IssuedDocumentPreCreateInfoExtraDataDefaultValues](docs/IssuedDocumentPreCreateInfoExtraDataDefaultValues.md)
 - [IssuedDocumentPreCreateInfoItemsDefaultValues](docs/IssuedDocumentPreCreateInfoItemsDefaultValues.md)
 - [IssuedDocumentStatus](docs/IssuedDocumentStatus.md)
 - [IssuedDocumentTotals](docs/IssuedDocumentTotals.md)
 - [IssuedDocumentType](docs/IssuedDocumentType.md)
 - [Language](docs/Language.md)
 - [ListArchiveCategoriesResponse](docs/ListArchiveCategoriesResponse.md)
 - [ListArchiveDocumentsResponse](docs/ListArchiveDocumentsResponse.md)
 - [ListArchiveDocumentsResponsePage](docs/ListArchiveDocumentsResponsePage.md)
 - [ListCashbookEntriesResponse](docs/ListCashbookEntriesResponse.md)
 - [ListCitiesResponse](docs/ListCitiesResponse.md)
 - [ListClientsResponse](docs/ListClientsResponse.md)
 - [ListClientsResponsePage](docs/ListClientsResponsePage.md)
 - [ListCostCentersResponse](docs/ListCostCentersResponse.md)
 - [ListCountriesResponse](docs/ListCountriesResponse.md)
 - [ListCurrenciesResponse](docs/ListCurrenciesResponse.md)
 - [ListDeliveryNotesDefaultCausalsResponse](docs/ListDeliveryNotesDefaultCausalsResponse.md)
 - [ListF24Response](docs/ListF24Response.md)
 - [ListF24ResponseAggregatedData](docs/ListF24ResponseAggregatedData.md)
 - [ListF24ResponseAggregation](docs/ListF24ResponseAggregation.md)
 - [ListF24ResponsePage](docs/ListF24ResponsePage.md)
 - [ListIssuedDocumentsResponse](docs/ListIssuedDocumentsResponse.md)
 - [ListIssuedDocumentsResponsePage](docs/ListIssuedDocumentsResponsePage.md)
 - [ListLanguagesResponse](docs/ListLanguagesResponse.md)
 - [ListPaymentAccountsResponse](docs/ListPaymentAccountsResponse.md)
 - [ListPaymentMethodsResponse](docs/ListPaymentMethodsResponse.md)
 - [ListProductCategoriesResponse](docs/ListProductCategoriesResponse.md)
 - [ListProductsResponse](docs/ListProductsResponse.md)
 - [ListProductsResponsePage](docs/ListProductsResponsePage.md)
 - [ListReceiptsResponse](docs/ListReceiptsResponse.md)
 - [ListReceiptsResponsePage](docs/ListReceiptsResponsePage.md)
 - [ListReceivedDocumentCategoriesResponse](docs/ListReceivedDocumentCategoriesResponse.md)
 - [ListReceivedDocumentsResponse](docs/ListReceivedDocumentsResponse.md)
 - [ListReceivedDocumentsResponsePage](docs/ListReceivedDocumentsResponsePage.md)
 - [ListRevenueCentersResponse](docs/ListRevenueCentersResponse.md)
 - [ListSuppliersResponse](docs/ListSuppliersResponse.md)
 - [ListSuppliersResponsePage](docs/ListSuppliersResponsePage.md)
 - [ListTemplatesResponse](docs/ListTemplatesResponse.md)
 - [ListUnitsOfMeasureResponse](docs/ListUnitsOfMeasureResponse.md)
 - [ListUserCompaniesResponse](docs/ListUserCompaniesResponse.md)
 - [ListUserCompaniesResponseData](docs/ListUserCompaniesResponseData.md)
 - [ListVatTypesResponse](docs/ListVatTypesResponse.md)
 - [ModifyArchiveDocumentRequest](docs/ModifyArchiveDocumentRequest.md)
 - [ModifyArchiveDocumentResponse](docs/ModifyArchiveDocumentResponse.md)
 - [ModifyCashbookEntryRequest](docs/ModifyCashbookEntryRequest.md)
 - [ModifyCashbookEntryResponse](docs/ModifyCashbookEntryResponse.md)
 - [ModifyClientRequest](docs/ModifyClientRequest.md)
 - [ModifyClientResponse](docs/ModifyClientResponse.md)
 - [ModifyF24Request](docs/ModifyF24Request.md)
 - [ModifyF24Response](docs/ModifyF24Response.md)
 - [ModifyIssuedDocumentRequest](docs/ModifyIssuedDocumentRequest.md)
 - [ModifyIssuedDocumentResponse](docs/ModifyIssuedDocumentResponse.md)
 - [ModifyPaymentAccountRequest](docs/ModifyPaymentAccountRequest.md)
 - [ModifyPaymentAccountResponse](docs/ModifyPaymentAccountResponse.md)
 - [ModifyPaymentMethodRequest](docs/ModifyPaymentMethodRequest.md)
 - [ModifyPaymentMethodResponse](docs/ModifyPaymentMethodResponse.md)
 - [ModifyProductRequest](docs/ModifyProductRequest.md)
 - [ModifyProductResponse](docs/ModifyProductResponse.md)
 - [ModifyReceiptRequest](docs/ModifyReceiptRequest.md)
 - [ModifyReceiptResponse](docs/ModifyReceiptResponse.md)
 - [ModifyReceivedDocumentRequest](docs/ModifyReceivedDocumentRequest.md)
 - [ModifyReceivedDocumentResponse](docs/ModifyReceivedDocumentResponse.md)
 - [ModifySupplierRequest](docs/ModifySupplierRequest.md)
 - [ModifySupplierResponse](docs/ModifySupplierResponse.md)
 - [ModifyVatTypeRequest](docs/ModifyVatTypeRequest.md)
 - [ModifyVatTypeResponse](docs/ModifyVatTypeResponse.md)
 - [MonthlyTotal](docs/MonthlyTotal.md)
 - [OriginalDocumentType](docs/OriginalDocumentType.md)
 - [Pagination](docs/Pagination.md)
 - [PaymentAccount](docs/PaymentAccount.md)
 - [PaymentAccountType](docs/PaymentAccountType.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PaymentMethodDetails](docs/PaymentMethodDetails.md)
 - [PaymentMethodType](docs/PaymentMethodType.md)
 - [PermissionLevel](docs/PermissionLevel.md)
 - [Permissions](docs/Permissions.md)
 - [PermissionsFicIssuedDocumentsDetailed](docs/PermissionsFicIssuedDocumentsDetailed.md)
 - [Product](docs/Product.md)
 - [Receipt](docs/Receipt.md)
 - [ReceiptItemsListItem](docs/ReceiptItemsListItem.md)
 - [ReceiptPreCreateInfo](docs/ReceiptPreCreateInfo.md)
 - [ReceiptType](docs/ReceiptType.md)
 - [ReceivedDocument](docs/ReceivedDocument.md)
 - [ReceivedDocumentEntity](docs/ReceivedDocumentEntity.md)
 - [ReceivedDocumentInfo](docs/ReceivedDocumentInfo.md)
 - [ReceivedDocumentInfoDefaultValues](docs/ReceivedDocumentInfoDefaultValues.md)
 - [ReceivedDocumentInfoItemsDefaultValues](docs/ReceivedDocumentInfoItemsDefaultValues.md)
 - [ReceivedDocumentItemsListItem](docs/ReceivedDocumentItemsListItem.md)
 - [ReceivedDocumentPaymentsListItem](docs/ReceivedDocumentPaymentsListItem.md)
 - [ReceivedDocumentPaymentsListItemPaymentTerms](docs/ReceivedDocumentPaymentsListItemPaymentTerms.md)
 - [ReceivedDocumentTotals](docs/ReceivedDocumentTotals.md)
 - [ReceivedDocumentType](docs/ReceivedDocumentType.md)
 - [ScheduleEmailRequest](docs/ScheduleEmailRequest.md)
 - [SendEInvoiceRequest](docs/SendEInvoiceRequest.md)
 - [SendEInvoiceRequestData](docs/SendEInvoiceRequestData.md)
 - [SendEInvoiceResponse](docs/SendEInvoiceResponse.md)
 - [SendEInvoiceResponseData](docs/SendEInvoiceResponseData.md)
 - [SenderEmail](docs/SenderEmail.md)
 - [ShowTotalsMode](docs/ShowTotalsMode.md)
 - [Supplier](docs/Supplier.md)
 - [SupplierType](docs/SupplierType.md)
 - [UploadArchiveAttachmentResponse](docs/UploadArchiveAttachmentResponse.md)
 - [UploadF24AttachmentResponse](docs/UploadF24AttachmentResponse.md)
 - [UploadIssuedDocumentAttachmentResponse](docs/UploadIssuedDocumentAttachmentResponse.md)
 - [UploadReceivedDocumentAttachmentResponse](docs/UploadReceivedDocumentAttachmentResponse.md)
 - [User](docs/User.md)
 - [UserCompanyRole](docs/UserCompanyRole.md)
 - [VatItem](docs/VatItem.md)
 - [VatKind](docs/VatKind.md)
 - [VatType](docs/VatType.md)
 - [VerifyEInvoiceXmlErrorResponse](docs/VerifyEInvoiceXmlErrorResponse.md)
 - [VerifyEInvoiceXmlErrorResponseError](docs/VerifyEInvoiceXmlErrorResponseError.md)
 - [VerifyEInvoiceXmlErrorResponseExtra](docs/VerifyEInvoiceXmlErrorResponseExtra.md)
 - [VerifyEInvoiceXmlResponse](docs/VerifyEInvoiceXmlResponse.md)
 - [VerifyEInvoiceXmlResponseData](docs/VerifyEInvoiceXmlResponseData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### OAuth2AuthenticationCodeFlow


- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://api-v2.fattureincloud.it/oauth/authorize
- **Scopes**: 
  - **entity.clients:r**: 
  - **entity.clients:a**: 
  - **entity.suppliers:r**: 
  - **entity.suppliers:a**: 
  - **products:r**: 
  - **products:a**: 
  - **issued_documents.invoice:r**: 
  - **issued_documents.credit_note:r**: 
  - **issued_documents.receipt:r**: 
  - **issued_documents.order:r**: 
  - **issued_documents.quote:r**: 
  - **issued_documents.proforma:r**: 
  - **issued_documents.delivery_note:r**: 
  - **issued_documents.invoice:a**: 
  - **issued_documents.credit_note:a**: 
  - **issued_documents.receipt:a**: 
  - **issued_documents.order:a**: 
  - **issued_documents.quote:a**: 
  - **issued_documents.proforma:a**: 
  - **issued_documents.delivery_note:a**: 
  - **received_documents:r**: 
  - **received_documents:a**: 
  - **stock:r**: 
  - **stock:a**: 
  - **receipts:r**: 
  - **receipts:a**: 
  - **taxes:r**: 
  - **taxes:a**: 
  - **archive:r**: 
  - **archive:a**: 
  - **cashbook:r**: 
  - **cashbook:a**: 
  - **settings:r**: 
  - **settings:a**: 
  - **situation:r**: 


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@fattureincloud.it

