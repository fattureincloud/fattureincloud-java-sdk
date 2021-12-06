

# ReceivedDocumentPaymentsList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique identifier. |  [optional]
**amount** | **BigDecimal** | Amount of items. |  [optional]
**dueDate** | **LocalDate** | Due date |  [optional]
**paidDate** | **LocalDate** | Paid date |  [optional]
**paymentTerms** | [**ReceivedDocumentPaymentTerms**](ReceivedDocumentPaymentTerms.md) |  |  [optional]
**status** | **String** | Payment status. |  [optional]
**paymentAccount** | [**PaymentAccount**](PaymentAccount.md) |  |  [optional]


## Implemented Interfaces

* Serializable


