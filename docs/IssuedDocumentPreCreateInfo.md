

# IssuedDocumentPreCreateInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numerations** | **Object** | Next numbers by year and numeration name (for the given document type). |  [optional]
**dnNumerations** | **Object** | Next numbers by year and numeration name (for delivery_notes). |  [optional]
**defaultValues** | [**IssuedDocumentPreCreateInfoDefaultValues**](IssuedDocumentPreCreateInfoDefaultValues.md) |  |  [optional]
**extraDataDefaultValues** | [**IssuedDocumentPreCreateInfoExtraDataDefaultValues**](IssuedDocumentPreCreateInfoExtraDataDefaultValues.md) |  |  [optional]
**itemsDefaultValues** | [**IssuedDocumentPreCreateInfoItemsDefaultValues**](IssuedDocumentPreCreateInfoItemsDefaultValues.md) |  |  [optional]
**countriesList** | **List&lt;String&gt;** | Countries list. |  [optional]
**currenciesList** | [**List&lt;Currency&gt;**](Currency.md) | Currencies list. |  [optional]
**templatesList** | [**List&lt;DocumentTemplate&gt;**](DocumentTemplate.md) | Document templates list. |  [optional]
**dnTemplatesList** | [**List&lt;DocumentTemplate&gt;**](DocumentTemplate.md) | Delivery note templates list. |  [optional]
**aiTemplatesList** | [**List&lt;DocumentTemplate&gt;**](DocumentTemplate.md) | Accompanying invoice templates list. |  [optional]
**paymentMethodsList** | [**List&lt;PaymentMethod&gt;**](PaymentMethod.md) | Payment methods list. |  [optional]
**paymentAccountsList** | [**List&lt;PaymentAccount&gt;**](PaymentAccount.md) | Payment accounts list. |  [optional]
**vatTypesList** | [**List&lt;VatType&gt;**](VatType.md) | Vat types list. |  [optional]


## Implemented Interfaces

* Serializable


