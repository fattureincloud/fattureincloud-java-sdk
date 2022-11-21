

# Email



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Email unique identifier. |  [optional] |
|**status** | **EmailStatus** |  |  [optional] |
|**sentDate** | **OffsetDateTime** | Email sent date. |  [optional] |
|**errorsCount** | **Integer** | Errors count. |  [optional] |
|**errorLog** | **String** | Error log. |  [optional] |
|**fromEmail** | **String** | Sender email. |  [optional] |
|**fromName** | **String** | Sender name. |  [optional] |
|**toEmail** | **String** | Recipient email. |  [optional] |
|**toName** | **String** | Receipient email. |  [optional] |
|**subject** | **String** | Email subject. |  [optional] |
|**content** | **String** | Email content. |  [optional] |
|**copyTo** | **String** |  |  [optional] |
|**recipientStatus** | **EmailRecipientStatus** |  |  [optional] |
|**recipientDate** | **OffsetDateTime** |  |  [optional] |
|**kind** | **String** | Email kind. |  [optional] |
|**attachments** | [**List&lt;EmailAttachment&gt;**](EmailAttachment.md) | Email attachments. |  [optional] |


## Implemented Interfaces

* Serializable


