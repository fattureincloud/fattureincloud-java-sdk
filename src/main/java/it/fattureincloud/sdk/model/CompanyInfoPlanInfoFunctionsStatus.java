/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.3
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;

/** CompanyInfoPlanInfoFunctionsStatus */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-30T09:09:50.123536Z[Etc/UTC]",
    comments = "Generator version: 7.9.0")
public class CompanyInfoPlanInfoFunctionsStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TS_DIGITAL = "ts_digital";

  @SerializedName(SERIALIZED_NAME_TS_DIGITAL)
  private FunctionStatus tsDigital;

  public static final String SERIALIZED_NAME_TS_PAY = "ts_pay";

  @SerializedName(SERIALIZED_NAME_TS_PAY)
  private FunctionStatus tsPay;

  public CompanyInfoPlanInfoFunctionsStatus() {}

  public CompanyInfoPlanInfoFunctionsStatus tsDigital(FunctionStatus tsDigital) {

    this.tsDigital = tsDigital;
    return this;
  }

  /**
   * Get tsDigital
   *
   * @return tsDigital
   */
  @javax.annotation.Nullable
  public FunctionStatus getTsDigital() {
    return tsDigital;
  }

  public void setTsDigital(FunctionStatus tsDigital) {
    this.tsDigital = tsDigital;
  }

  public CompanyInfoPlanInfoFunctionsStatus tsPay(FunctionStatus tsPay) {

    this.tsPay = tsPay;
    return this;
  }

  /**
   * Get tsPay
   *
   * @return tsPay
   */
  @javax.annotation.Nullable
  public FunctionStatus getTsPay() {
    return tsPay;
  }

  public void setTsPay(FunctionStatus tsPay) {
    this.tsPay = tsPay;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyInfoPlanInfoFunctionsStatus companyInfoPlanInfoFunctionsStatus =
        (CompanyInfoPlanInfoFunctionsStatus) o;
    return Objects.equals(this.tsDigital, companyInfoPlanInfoFunctionsStatus.tsDigital)
        && Objects.equals(this.tsPay, companyInfoPlanInfoFunctionsStatus.tsPay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tsDigital, tsPay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyInfoPlanInfoFunctionsStatus {\n");
    sb.append("    tsDigital: ").append(toIndentedString(tsDigital)).append("\n");
    sb.append("    tsPay: ").append(toIndentedString(tsPay)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
