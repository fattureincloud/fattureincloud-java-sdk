

# Receipt


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Receipt id |  [optional] |
|**date** | **LocalDate** | Receipt date |  [optional] |
|**number** | **BigDecimal** | Receipt number |  [optional] |
|**numeration** | **String** | Receipt numeration |  [optional] |
|**amountNet** | **BigDecimal** | Receipt total net amount |  [optional] |
|**amountVat** | **BigDecimal** | Receipt total vat amount |  [optional] |
|**amountGross** | **BigDecimal** | Receipt total gross amount |  [optional] |
|**useGrossPrices** | **Boolean** | Receipt uses gross prices |  [optional] |
|**type** | **ReceiptType** |  |  [optional] |
|**description** | **String** | Receipt description |  [optional] |
|**rcCenter** | **String** | Receipt revenue center |  [optional] |
|**createdAt** | **String** | Receipt creation date |  [optional] |
|**updatedAt** | **String** | Receipt last update date |  [optional] |
|**paymentAccount** | [**PaymentAccount**](PaymentAccount.md) |  |  [optional] |
|**itemsList** | [**List&lt;ReceiptItemsListItem&gt;**](ReceiptItemsListItem.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


