

# IssuedDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Issued document id |  [optional] |
|**entity** | [**Entity**](Entity.md) |  |  [optional] |
|**type** | **IssuedDocumentType** |  |  [optional] |
|**number** | **Integer** | Issued document number [If not specified, next number is used] |  [optional] |
|**numeration** | **String** | Issued document numeration [Not available if type&#x3D;delivery_note] |  [optional] |
|**date** | **LocalDate** | Issued document date [defaults to today&#39;s date] |  [optional] |
|**year** | **Integer** | Issued document year |  [optional] |
|**currency** | [**Currency**](Currency.md) |  |  [optional] |
|**language** | [**Language**](Language.md) |  |  [optional] |
|**subject** | **String** | Issued document subject |  [optional] |
|**visibleSubject** | **String** | Issued document visible subject |  [optional] |
|**rcCenter** | **String** | Issued document revenue center [or cost center if type&#x3D;supplier_order]. |  [optional] |
|**notes** | **String** | Issued document extra notes |  [optional] |
|**rivalsa** | **BigDecimal** | Issued document \&quot;Rivalsa INPS\&quot; percentual value |  [optional] |
|**cassa** | **BigDecimal** | Issued document \&quot;Cassa previdenziale\&quot; percentual value |  [optional] |
|**amountCassa** | **BigDecimal** | [Read Only] Issued document cassa amount. |  [optional] [readonly] |
|**cassaTaxable** | **BigDecimal** | Issued document cassa taxable percentage |  [optional] |
|**amountCassaTaxable** | **BigDecimal** | [Can be set only if cassa_taxable is NULL] Issued document cassa taxable amount |  [optional] |
|**cassa2** | **BigDecimal** | Issued document \&quot;Cassa previdenziale 2\&quot; percentual value |  [optional] |
|**amountCassa2** | **BigDecimal** | [Read Only] Issued document cassa2 amount |  [optional] [readonly] |
|**cassa2Taxable** | **BigDecimal** | Issued document cassa2 taxable percentage |  [optional] |
|**amountCassa2Taxable** | **BigDecimal** | [Can be set only if cassa2_taxable is NULL] Issued document cassa2 taxable amount |  [optional] |
|**globalCassaTaxable** | **BigDecimal** | Issued document global cassa taxable percentage |  [optional] |
|**amountGlobalCassaTaxable** | **BigDecimal** | [Can be set only if global_cassa_taxable is NULL] Issued document global cassa taxable amount |  [optional] |
|**withholdingTax** | **BigDecimal** | Issued document withholding tax (ritenuta d&#39;acconto) percentual value |  [optional] |
|**withholdingTaxTaxable** | **BigDecimal** | Issued document withholding tax taxable (imponibile) percentual value |  [optional] |
|**otherWithholdingTax** | **BigDecimal** | Issued document other withholding tax (altra ritenuta) percentual value |  [optional] |
|**stampDuty** | **BigDecimal** | Issued document stamp duty value [0 if not present] |  [optional] |
|**paymentMethod** | [**PaymentMethod**](PaymentMethod.md) |  |  [optional] |
|**useSplitPayment** | **Boolean** | Issued document uses split payment |  [optional] |
|**useGrossPrices** | **Boolean** | Issued document uses gross prices |  [optional] |
|**eInvoice** | **Boolean** | Issued document is an e-invoice. |  [optional] |
|**eiData** | [**IssuedDocumentEiData**](IssuedDocumentEiData.md) |  |  [optional] |
|**eiCassaType** | **String** | E-invoice cassa type |  [optional] |
|**eiCassa2Type** | **String** | E-invoice cassa2 type |  [optional] |
|**eiWithholdingTaxCausal** | **String** | E-invoice withholding tax causal |  [optional] |
|**eiOtherWithholdingTaxType** | **String** | E-invoice other withholding tax type |  [optional] |
|**eiOtherWithholdingTaxCausal** | **String** | E-invoice other withholding tax causal |  [optional] |
|**itemsList** | [**List&lt;IssuedDocumentItemsListItem&gt;**](IssuedDocumentItemsListItem.md) |  |  [optional] |
|**paymentsList** | [**List&lt;IssuedDocumentPaymentsListItem&gt;**](IssuedDocumentPaymentsListItem.md) |  |  [optional] |
|**template** | [**DocumentTemplate**](DocumentTemplate.md) |  |  [optional] |
|**deliveryNoteTemplate** | [**DocumentTemplate**](DocumentTemplate.md) |  |  [optional] |
|**accInvTemplate** | [**DocumentTemplate**](DocumentTemplate.md) |  |  [optional] |
|**hMargins** | **Integer** | Issued document PDF horizontal margins |  [optional] |
|**vMargins** | **Integer** | Issued document PDF vertical margins |  [optional] |
|**showPayments** | **Boolean** | Show the expiration dates of the payments on the document |  [optional] |
|**showPaymentMethod** | **Boolean** | Show the payment method details on the document |  [optional] |
|**showTotals** | **ShowTotalsMode** |  |  [optional] |
|**showPaypalButton** | **Boolean** | Show paypal button in the PDF |  [optional] |
|**showNotificationButton** | **Boolean** | Show notification button in the PDF |  [optional] |
|**showTspayButton** | **Boolean** | Show ts pay button in the PDF |  [optional] |
|**deliveryNote** | **Boolean** | Issued document has delivery note |  [optional] |
|**accompanyingInvoice** | **Boolean** | Issued document has an accompanying invoice |  [optional] |
|**dnNumber** | **Integer** | Issued document attached delivery note number |  [optional] |
|**dnDate** | **LocalDate** | Issued document attached delivery note date |  [optional] |
|**dnAiPackagesNumber** | **String** | Issued document attached delivery note number of packages |  [optional] |
|**dnAiWeight** | **String** | Issued document attached delivery note package weight |  [optional] |
|**dnAiCausal** | **String** | Issued document attached delivery note causal |  [optional] |
|**dnAiDestination** | **String** | Issued document attached delivery note destination |  [optional] |
|**dnAiTransporter** | **String** | Issued document attached delivery note transporter |  [optional] |
|**dnAiNotes** | **String** | Issued document attached delivery note notes |  [optional] |
|**isMarked** | **Boolean** | Issued document is marked |  [optional] |
|**amountNet** | **BigDecimal** | [Read only] Issued document total net amount |  [optional] [readonly] |
|**amountVat** | **BigDecimal** | [Read Only] Issued document total vat amount |  [optional] [readonly] |
|**amountGross** | **BigDecimal** | [Read Only] Issued document total gross amount |  [optional] [readonly] |
|**amountDueDiscount** | **BigDecimal** | Issued document amount due discount |  [optional] |
|**amountRivalsa** | **BigDecimal** | [Read Only] Issued document rivalsa amount |  [optional] [readonly] |
|**amountRivalsaTaxable** | **BigDecimal** | Issued document taxable rivalsa amount |  [optional] |
|**amountWithholdingTax** | **BigDecimal** | [Read Only] Issued document withholding tax amount (ritenuta d&#39;acconto). |  [optional] [readonly] |
|**amountWithholdingTaxTaxable** | **BigDecimal** | Issued document taxable withholding tax amount |  [optional] |
|**amountOtherWithholdingTax** | **BigDecimal** | [Read Only] Issued document other withholding tax amount (altra ritenuta) |  [optional] [readonly] |
|**amountOtherWithholdingTaxTaxable** | **BigDecimal** | Issued document taxable other withholding tax amount |  [optional] |
|**amountEnasarcoTaxable** | **BigDecimal** | Issued document taxable enasarco amount |  [optional] |
|**extraData** | [**IssuedDocumentExtraData**](IssuedDocumentExtraData.md) |  |  [optional] |
|**seenDate** | **LocalDate** | Issued document seen date |  [optional] |
|**nextDueDate** | **LocalDate** | Issued document date of the next not paid payment |  [optional] |
|**url** | **String** | [Temporary] [Read Only] Issued document url of the document PDF file |  [optional] |
|**dnUrl** | **String** | [Temporary] [Read Only] Issued document url of the attached delivery note PDF file |  [optional] |
|**aiUrl** | **String** | [Temporary] [Read Only] Issued document url of the accompanying invoice PDF file |  [optional] |
|**attachmentUrl** | **String** | [Temporary] [Read Only] Issued document url of the attached file |  [optional] [readonly] |
|**attachmentToken** | **String** | [Write Only] Issued document attachment token returned by POST /issued_documents/attachment |  [optional] |
|**eiRaw** | **Object** | Issued document advanced raw attributes for e-invoices |  [optional] |
|**eiStatus** | [**EiStatusEnum**](#EiStatusEnum) | [Read only] Status of the e-invoice.   * **attempt** - We are trying to send the invoice, please wait up to 2 hours   * **missing** - The invoice is missing   * **not_sent** - The invoice has yet to be sent   * **sent** - The invoice was sent   * **pending** - The checks for the digital signature and sending are in progress   * **processing** - The SDI is delivering the invoice to the customer   * **error** - An error occurred while handling the invoice, please try to resend it or contact support   * **discarded** - The invoice has been rejected by the SDI, so it must be corrected and re-sent   * **not_delivered** - The SDI was unable to deliver the invoice   * **accepted** - The customer accepted the invoice   * **rejected** - The customer rejected the invoice, so it must be corrected   * **no_response** - A response has not yet been received whithin the deadline, contact the customer to ascertain the status of the invoice   * **manual_accepted** - The customer accepted the invoice   * **manual_rejected** - The customer rejected the invoice  |  [optional] |
|**createdAt** | **String** | Issued document creation date |  [optional] |
|**updatedAt** | **String** | Issued document last update date |  [optional] |



## Enum: EiStatusEnum

| Name | Value |
|---- | -----|
| ATTEMPT | &quot;attempt&quot; |
| MISSING | &quot;missing&quot; |
| NOT_SENT | &quot;not_sent&quot; |
| SENT | &quot;sent&quot; |
| PENDING | &quot;pending&quot; |
| PROCESSING | &quot;processing&quot; |
| ERROR | &quot;error&quot; |
| DISCARDED | &quot;discarded&quot; |
| NOT_DELIVERED | &quot;not_delivered&quot; |
| ACCEPTED | &quot;accepted&quot; |
| REJECTED | &quot;rejected&quot; |
| NO_RESPONSE | &quot;no_response&quot; |
| MANUAL_ACCEPTED | &quot;manual_accepted&quot; |
| MANUAL_REJECTED | &quot;manual_rejected&quot; |


## Implemented Interfaces

* Serializable


