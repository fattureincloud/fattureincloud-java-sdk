

# Email


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Email id |  [optional] |
|**status** | **EmailStatus** |  |  [optional] |
|**sentDate** | **OffsetDateTime** | Email sent date |  [optional] |
|**errorsCount** | **Integer** | Email errors count |  [optional] |
|**errorLog** | **String** | Email errors log |  [optional] |
|**fromEmail** | **String** | Email sender email |  [optional] |
|**fromName** | **String** | Email sender name |  [optional] |
|**toEmail** | **String** | Email recipient email |  [optional] |
|**toName** | **String** | Email receipient name |  [optional] |
|**subject** | **String** | Email subject |  [optional] |
|**content** | **String** | Email content |  [optional] |
|**copyTo** | **String** | Email cc |  [optional] |
|**recipientStatus** | **EmailRecipientStatus** |  |  [optional] |
|**recipientDate** | **OffsetDateTime** | Email recipient date |  [optional] |
|**kind** | **String** | Email kind |  [optional] |
|**attachments** | [**List&lt;EmailAttachment&gt;**](EmailAttachment.md) | Email attachments |  [optional] |


## Implemented Interfaces

* Serializable


