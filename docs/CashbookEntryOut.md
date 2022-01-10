

# CashbookEntryOut


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Cashbook unique identifier. | 
**date** | **LocalDate** | Cashbook date. | 
**description** | **String** | Cashbook description. | 
**kind** | **CashbookEntryKind** |  | 
**type** | **CashbookEntryType** |  |  [optional]
**entityName** | **String** | Entity name. |  [optional]
**document** | [**CashbookEntryDataDocument**](CashbookEntryDataDocument.md) |  |  [optional]
**amountOut** | **BigDecimal** | Total amount out. |  [optional]
**paymentAccountOut** | [**PaymentAccount**](PaymentAccount.md) |  |  [optional]


## Implemented Interfaces

* Serializable


