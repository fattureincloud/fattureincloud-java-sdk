/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.13
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-22T10:45:37.104Z[Etc/UTC]")
public class MonthlyTotal implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NET = "net";
  @SerializedName(SERIALIZED_NAME_NET)
  private BigDecimal net;

  public static final String SERIALIZED_NAME_GROSS = "gross";
  @SerializedName(SERIALIZED_NAME_GROSS)
  private BigDecimal gross;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private BigDecimal count;


  public MonthlyTotal net(BigDecimal net) {
    
    this.net = net;
    return this;
  }

   /**
   * Monthly total net amount.
   * @return net
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Monthly total net amount.")

  public BigDecimal getNet() {
    return net;
  }


  public void setNet(BigDecimal net) {
    this.net = net;
  }


  public MonthlyTotal gross(BigDecimal gross) {
    
    this.gross = gross;
    return this;
  }

   /**
   * Monthly total gross amount.
   * @return gross
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Monthly total gross amount.")

  public BigDecimal getGross() {
    return gross;
  }


  public void setGross(BigDecimal gross) {
    this.gross = gross;
  }


  public MonthlyTotal count(BigDecimal count) {
    
    this.count = count;
    return this;
  }

   /**
   * Monthly total receipt number.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Monthly total receipt number.")

  public BigDecimal getCount() {
    return count;
  }


  public void setCount(BigDecimal count) {
    this.count = count;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonthlyTotal monthlyTotal = (MonthlyTotal) o;
    return Objects.equals(this.net, monthlyTotal.net) &&
        Objects.equals(this.gross, monthlyTotal.gross) &&
        Objects.equals(this.count, monthlyTotal.count);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(net, gross, count);
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
    sb.append("class MonthlyTotal {\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    gross: ").append(toIndentedString(gross)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

