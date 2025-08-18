

# PaymentMethod



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Payment method id |  [optional] |
|**name** | **String** | Payment method name |  [optional] |
|**type** | **PaymentMethodType** |  |  [optional] |
|**isDefault** | **Boolean** | Payment method is default |  [optional] |
|**defaultPaymentAccount** | [**PaymentAccount**](PaymentAccount.md) |  |  [optional] |
|**details** | [**List&lt;PaymentMethodDetails&gt;**](PaymentMethodDetails.md) | Payment method details |  [optional] |
|**bankIban** | **String** | Payment method bank iban |  [optional] |
|**bankName** | **String** | Payment method bank name |  [optional] |
|**bankBeneficiary** | **String** | Payment method bank beneficiary |  [optional] |
|**eiPaymentMethod** | **String** | E-invoice payment method |  [optional] |


## Implemented Interfaces

* Serializable


