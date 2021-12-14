

# Company



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Company unique identifier. |  [optional]
**name** | **String** | Company name. |  [optional]
**type** | **CompanyType** |  |  [optional]
**accessToken** | **String** | CompanyAuthentication token for this company. [Only if type&#x3D;company] |  [optional]
**controlledCompanies** | [**List&lt;Company&gt;**](Company.md) | List of controlled companies. [Only if type&#x3D;accountant] |  [optional]
**connectionId** | **BigDecimal** | Company connection id. |  [optional]
**taxCode** | **String** | Tax code. |  [optional]


## Implemented Interfaces

* Serializable

