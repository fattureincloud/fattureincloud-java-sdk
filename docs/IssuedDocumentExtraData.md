

# IssuedDocumentExtraData

Issued document extra data [TS fields follow the technical specifications provided by \"Sistema Tessera Sanitaria\"]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**showSofortButton** | **Boolean** |  |  [optional] |
|**multifattureSent** | **Integer** |  |  [optional] |
|**tsCommunication** | **Boolean** | Send issued document to \&quot;Sistema Tessera Sanitaria\&quot; |  [optional] |
|**tsFlagTipoSpesa** | **BigDecimal** | Issued document ts \&quot;tipo spesa\&quot; [TK, FC, FV, SV,SP, AD, AS, ECG, SR] |  [optional] |
|**tsPagamentoTracciato** | **Boolean** | Issued document ts traced payment |  [optional] |
|**tsTipoSpesa** | **String** | Can be [ &#39;TK&#39;, &#39;FC&#39;, &#39;FV&#39;, &#39;SV&#39;, &#39;SP&#39;, &#39;AD&#39;, &#39;AS&#39;, &#39;SR&#39;, &#39;CT&#39;, &#39;PI&#39;, &#39;IC&#39;, &#39;AA&#39; ]. Refer to the technical specifications to learn more. |  [optional] |
|**tsOpposizione** | **Boolean** | Issued document ts \&quot;opposizione\&quot; |  [optional] |
|**tsStatus** | **Integer** | Issued document ts status |  [optional] |
|**tsFileId** | **String** | Issued document ts file id |  [optional] |
|**tsSentDate** | **LocalDate** | Issued document ts sent date |  [optional] |
|**tsFullAmount** | **Boolean** | Issued document ts total amount |  [optional] |
|**importedBy** | **String** | Issued document imported by software |  [optional] |


## Implemented Interfaces

* Serializable


