/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.15
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** EInvoiceRejectionReason */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-05-02T14:07:51.629401Z[GMT]")
public class EInvoiceRejectionReason implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_REASON = "reason";

  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_EI_STATUS = "ei_status";

  @SerializedName(SERIALIZED_NAME_EI_STATUS)
  private String eiStatus;

  public static final String SERIALIZED_NAME_SOLUTION = "solution";

  @SerializedName(SERIALIZED_NAME_SOLUTION)
  private String solution;

  public static final String SERIALIZED_NAME_CODE = "code";

  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DATE = "date";

  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public EInvoiceRejectionReason() {}

  public EInvoiceRejectionReason reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * Rejection reason.
   *
   * @return reason
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rejection reason.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public EInvoiceRejectionReason eiStatus(String eiStatus) {

    this.eiStatus = eiStatus;
    return this;
  }

  /**
   * E-invoice status.
   *
   * @return eiStatus
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "E-invoice status.")
  public String getEiStatus() {
    return eiStatus;
  }

  public void setEiStatus(String eiStatus) {
    this.eiStatus = eiStatus;
  }

  public EInvoiceRejectionReason solution(String solution) {

    this.solution = solution;
    return this;
  }

  /**
   * Error solution.
   *
   * @return solution
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error solution.")
  public String getSolution() {
    return solution;
  }

  public void setSolution(String solution) {
    this.solution = solution;
  }

  public EInvoiceRejectionReason code(String code) {

    this.code = code;
    return this;
  }

  /**
   * Error code.
   *
   * @return code
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public EInvoiceRejectionReason date(LocalDate date) {

    this.date = date;
    return this;
  }

  /**
   * Rejection date.
   *
   * @return date
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rejection date.")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EInvoiceRejectionReason einvoiceRejectionReason = (EInvoiceRejectionReason) o;
    return Objects.equals(this.reason, einvoiceRejectionReason.reason)
        && Objects.equals(this.eiStatus, einvoiceRejectionReason.eiStatus)
        && Objects.equals(this.solution, einvoiceRejectionReason.solution)
        && Objects.equals(this.code, einvoiceRejectionReason.code)
        && Objects.equals(this.date, einvoiceRejectionReason.date);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b
        || (a != null
            && b != null
            && a.isPresent()
            && b.isPresent()
            && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, eiStatus, solution, code, date);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EInvoiceRejectionReason {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    eiStatus: ").append(toIndentedString(eiStatus)).append("\n");
    sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
