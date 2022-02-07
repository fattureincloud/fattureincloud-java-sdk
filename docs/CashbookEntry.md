

# CashbookEntry


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Cashbook unique identifier. | 
**date** | **LocalDate** | Cashbook date. | 
**description** | **String** | Cashbook description. | 
**kind** | **CashbookEntryKind** |  | 
**type** | **CashbookEntryType** |  |  [optional]
**entityName** | **String** | Entity name. |  [optional]
**document** | [**CashbookEntryDocument**](CashbookEntryDocument.md) |  |  [optional]
**amountIn** | **BigDecimal** | [Only for cashbook entry in] Total amount in. |  [optional]
**paymentAccountIn** | [**PaymentAccount**](PaymentAccount.md) |  |  [optional]
**amountOut** | **BigDecimal** | [Only for cashbook entry out] Total amount out. |  [optional]
**paymentAccountOut** | [**PaymentAccount**](PaymentAccount.md) |  |  [optional]


## Implemented Interfaces

* Serializable


