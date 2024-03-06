

# Company


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Company id |  [optional] |
|**name** | **String** | Company name |  [optional] |
|**type** | **CompanyType** |  |  [optional] |
|**accessToken** | **String** | Company authentication token for this company. [Only if type&#x3D;company] |  [optional] |
|**controlledCompanies** | [**List&lt;ControlledCompany&gt;**](ControlledCompany.md) | Company list of controlled companies [Only if type&#x3D;accountant] |  [optional] |
|**ficLicenseExpire** | **LocalDate** |  |  [optional] |
|**ficPlan** | **FattureInCloudPlanType** |  |  [optional] |
|**connectionId** | **Integer** | Company connection id |  [optional] |
|**taxCode** | **String** | Company tax code |  [optional] |
|**vatNumber** | **String** | Company vat number |  [optional] |


## Implemented Interfaces

* Serializable


