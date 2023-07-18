

# ReceivedDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Received document id |  [optional] |
|**type** | **ReceivedDocumentType** |  |  [optional] |
|**entity** | [**Entity**](Entity.md) |  |  [optional] |
|**date** | **LocalDate** | Received document date [defaults to today&#39;s date] |  [optional] |
|**category** | **String** | Received document category |  [optional] |
|**description** | **String** | Received document description |  [optional] |
|**amountNet** | **BigDecimal** | Received document total net amount |  [optional] |
|**amountVat** | **BigDecimal** | Received document total vat amount |  [optional] |
|**amountWithholdingTax** | **BigDecimal** | Received document withholding tax amount |  [optional] |
|**amountOtherWithholdingTax** | **BigDecimal** | Received document other withholding tax amount |  [optional] |
|**amountGross** | **BigDecimal** | [Read Only] Received document total gross amount |  [optional] [readonly] |
|**amortization** | **BigDecimal** | Received document amortization value |  [optional] |
|**rcCenter** | **String** | Received document revenue center |  [optional] |
|**invoiceNumber** | **String** | Received document invoice number |  [optional] |
|**isMarked** | **Boolean** | Received document is marked |  [optional] |
|**isDetailed** | **Boolean** | Received document has items |  [optional] |
|**eInvoice** | **Boolean** | [Read Only] Received document is an e-invoice |  [optional] |
|**nextDueDate** | **LocalDate** | [Read Only] Received document date of the next not paid payment |  [optional] [readonly] |
|**currency** | [**Currency**](Currency.md) |  |  [optional] |
|**taxDeductibility** | **BigDecimal** | Received document tax deducibility percentage |  [optional] |
|**vatDeductibility** | **BigDecimal** | Received document vat deducibility percentage |  [optional] |
|**itemsList** | [**List&lt;ReceivedDocumentItemsListItem&gt;**](ReceivedDocumentItemsListItem.md) |  |  [optional] |
|**paymentsList** | [**List&lt;ReceivedDocumentPaymentsListItem&gt;**](ReceivedDocumentPaymentsListItem.md) |  |  [optional] |
|**attachmentUrl** | **String** | [Temporary] [Read Only] Received document url of the attached file |  [optional] [readonly] |
|**attachmentPreviewUrl** | **String** | [Temporary] [Read Only] Received document url of the attachment preview |  [optional] [readonly] |
|**autoCalculate** | **Boolean** | Received document total items amount and total payments amount can differ if this field is set to false |  [optional] |
|**attachmentToken** | **String** | [Write Only] Received document attachment token returned by POST /received_documents/attachment |  [optional] |
|**createdAt** | **String** | Received document creation date |  [optional] |
|**updatedAt** | **String** | Received document last update date |  [optional] |


## Implemented Interfaces

* Serializable


