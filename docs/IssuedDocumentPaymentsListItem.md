

# IssuedDocumentPaymentsListItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Issued document payment item id |  [optional] |
|**dueDate** | **LocalDate** | Issued document payment due date |  [optional] |
|**amount** | **BigDecimal** | Issued document payment amount |  [optional] |
|**status** | **IssuedDocumentStatus** |  |  [optional] |
|**paymentAccount** | [**PaymentAccount**](PaymentAccount.md) |  |  [optional] |
|**paidDate** | **LocalDate** | Issued document payment date [Only if status is paid] |  [optional] |
|**eiRaw** | **Object** | Issued document payment advanced raw attributes for e-invoices |  [optional] |
|**paymentTerms** | [**IssuedDocumentPaymentsListItemPaymentTerms**](IssuedDocumentPaymentsListItemPaymentTerms.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


