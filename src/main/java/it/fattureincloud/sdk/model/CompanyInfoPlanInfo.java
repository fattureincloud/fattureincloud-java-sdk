/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.14
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * CompanyInfoPlanInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-16T10:27:27.647Z[Etc/UTC]")
public class CompanyInfoPlanInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_LIMITS = "limits";
    @SerializedName(SERIALIZED_NAME_LIMITS)
    private CompanyInfoPlanInfoLimits limits;

    public static final String SERIALIZED_NAME_FUNCTIONS = "functions";
    @SerializedName(SERIALIZED_NAME_FUNCTIONS)
    private CompanyInfoPlanInfoFunctions functions;

    public static final String SERIALIZED_NAME_FUNCTIONS_STATUS = "functions_status";
    @SerializedName(SERIALIZED_NAME_FUNCTIONS_STATUS)
    private CompanyInfoPlanInfoFunctionsStatus functionsStatus;

    public CompanyInfoPlanInfo() {
    }

    public CompanyInfoPlanInfo limits(CompanyInfoPlanInfoLimits limits) {

        this.limits = limits;
        return this;
    }

    /**
     * Get limits
     *
     * @return limits
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public CompanyInfoPlanInfoLimits getLimits() {
        return limits;
    }


    public void setLimits(CompanyInfoPlanInfoLimits limits) {
        this.limits = limits;
    }


    public CompanyInfoPlanInfo functions(CompanyInfoPlanInfoFunctions functions) {

        this.functions = functions;
        return this;
    }

    /**
     * Get functions
     *
     * @return functions
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public CompanyInfoPlanInfoFunctions getFunctions() {
        return functions;
    }


    public void setFunctions(CompanyInfoPlanInfoFunctions functions) {
        this.functions = functions;
    }


    public CompanyInfoPlanInfo functionsStatus(CompanyInfoPlanInfoFunctionsStatus functionsStatus) {

        this.functionsStatus = functionsStatus;
        return this;
    }

    /**
     * Get functionsStatus
     *
     * @return functionsStatus
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public CompanyInfoPlanInfoFunctionsStatus getFunctionsStatus() {
        return functionsStatus;
    }


    public void setFunctionsStatus(CompanyInfoPlanInfoFunctionsStatus functionsStatus) {
        this.functionsStatus = functionsStatus;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompanyInfoPlanInfo companyInfoPlanInfo = (CompanyInfoPlanInfo) o;
        return Objects.equals(this.limits, companyInfoPlanInfo.limits) &&
                Objects.equals(this.functions, companyInfoPlanInfo.functions) &&
                Objects.equals(this.functionsStatus, companyInfoPlanInfo.functionsStatus);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(limits, functions, functionsStatus);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompanyInfoPlanInfo {\n");
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
        sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
        sb.append("    functionsStatus: ").append(toIndentedString(functionsStatus)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

