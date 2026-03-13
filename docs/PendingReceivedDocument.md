

# PendingReceivedDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Pending received document id |  [optional] |
|**date** | **LocalDate** | Pending received document date |  [optional] |
|**subject** | **String** | Pending received document subject |  [optional] |
|**filename** | **String** | Pending received document filename |  [optional] |
|**type** | **PendingReceivedDocumentType** |  |  [optional] |
|**attachmentUrl** | **String** | [Temporary] [Read Only] Pending received document url of the attached file |  [optional] [readonly] |
|**amountGross** | **BigDecimal** | [Read Only] Pending received document total gross amount |  [optional] [readonly] |
|**currency** | [**Currency**](Currency.md) |  |  [optional] |
|**documentType** | **ReceivedDocumentType** |  |  [optional] |
|**supplierName** | **String** | Pending received document supplier name |  [optional] |
|**costCenter** | **String** | Pending received document cost center |  [optional] |
|**category** | **String** | Pending received document category |  [optional] |
|**otherAttachments** | [**List&lt;Attachment&gt;**](Attachment.md) | Pending received document other attachments |  [optional] |
|**emssionDate** | **LocalDate** | Pending received document emission date |  [optional] |
|**paymentsList** | [**List&lt;PendingReceivedDocumentPaymentsListItem&gt;**](PendingReceivedDocumentPaymentsListItem.md) |  |  [optional] |
|**amountNet** | **BigDecimal** | Pending received document total net amount |  [optional] |
|**amountVat** | **BigDecimal** | Pending received document total vat amount |  [optional] |
|**importError** | **String** | Pending received document import error |  [optional] |
|**extractedData** | [**PendingReceivedDocumentExtractedData**](PendingReceivedDocumentExtractedData.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


