

# ArchiveDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Archive document unique identifier. |  [optional] |
|**date** | **LocalDate** | Archive document date. |  [optional] |
|**description** | **String** | Archive Document description. |  [optional] |
|**attachmentUrl** | **String** | [Read Only] Absolute url of the attached file. Authomatically set if a valid attachment token is passed via POST /archive or PUT /archive/{documentId}. |  [optional] [readonly] |
|**category** | **String** | Archive document category. |  [optional] |
|**attachmentToken** | **String** | [Write Only]  [Required] Attachment token returned by POST /archive/attachment. Used to attach the file already uploaded. |  [optional] |


## Implemented Interfaces

* Serializable


