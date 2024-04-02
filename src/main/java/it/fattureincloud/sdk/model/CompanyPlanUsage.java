/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.32
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** CompanyPlanUsage */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-04-02T08:46:44.590061Z[Etc/UTC]",
    comments = "Generator version: 7.4.0")
public class CompanyPlanUsage implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LIMIT = "limit";

  @SerializedName(SERIALIZED_NAME_LIMIT)
  private BigDecimal limit;

  public static final String SERIALIZED_NAME_USAGE = "usage";

  @SerializedName(SERIALIZED_NAME_USAGE)
  private BigDecimal usage;

  public CompanyPlanUsage() {}

  public CompanyPlanUsage limit(BigDecimal limit) {

    this.limit = limit;
    return this;
  }

  /**
   * Plan limit
   *
   * @return limit
   */
  @javax.annotation.Nullable
  public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  public CompanyPlanUsage usage(BigDecimal usage) {

    this.usage = usage;
    return this;
  }

  /**
   * Plan usage
   *
   * @return usage
   */
  @javax.annotation.Nullable
  public BigDecimal getUsage() {
    return usage;
  }

  public void setUsage(BigDecimal usage) {
    this.usage = usage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyPlanUsage companyPlanUsage = (CompanyPlanUsage) o;
    return Objects.equals(this.limit, companyPlanUsage.limit)
        && Objects.equals(this.usage, companyPlanUsage.usage);
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
    return Objects.hash(limit, usage);
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
    sb.append("class CompanyPlanUsage {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
