

# CashbookEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Cashbook id |  [optional] |
|**date** | **LocalDate** | Cashbook date |  [optional] |
|**description** | **String** | Cashbook description |  [optional] |
|**kind** | **CashbookEntryKind** |  |  [optional] |
|**type** | **CashbookEntryType** |  |  [optional] |
|**entityName** | **String** | Cashbook entity name |  [optional] |
|**document** | [**CashbookEntryDocument**](CashbookEntryDocument.md) |  |  [optional] |
|**amountIn** | **BigDecimal** | [Only for cashbook entry in] Cashbook total amount in |  [optional] |
|**paymentAccountIn** | [**PaymentAccount**](PaymentAccount.md) |  |  [optional] |
|**amountOut** | **BigDecimal** | [Only for cashbook entry out] Cashbook total amount out |  [optional] |
|**paymentAccountOut** | [**PaymentAccount**](PaymentAccount.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


