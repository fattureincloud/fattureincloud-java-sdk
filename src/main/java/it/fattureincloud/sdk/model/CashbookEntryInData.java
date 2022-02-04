/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.10
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.fattureincloud.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.fattureincloud.sdk.model.PaymentAccount;
import java.io.IOException;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

/**
 * CashbookEntryInData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T08:45:03.999Z[Etc/UTC]")
public class CashbookEntryInData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT_IN = "amount_in";
  @SerializedName(SERIALIZED_NAME_AMOUNT_IN)
  private BigDecimal amountIn;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT_IN = "payment_account_in";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT_IN)
  private PaymentAccount paymentAccountIn;


  public CashbookEntryInData amountIn(BigDecimal amountIn) {
    
    this.amountIn = amountIn;
    return this;
  }

   /**
   * Total amount in.
   * @return amountIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount in.")

  public BigDecimal getAmountIn() {
    return amountIn;
  }


  public void setAmountIn(BigDecimal amountIn) {
    this.amountIn = amountIn;
  }


  public CashbookEntryInData paymentAccountIn(PaymentAccount paymentAccountIn) {
    
    this.paymentAccountIn = paymentAccountIn;
    return this;
  }

   /**
   * Get paymentAccountIn
   * @return paymentAccountIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentAccount getPaymentAccountIn() {
    return paymentAccountIn;
  }


  public void setPaymentAccountIn(PaymentAccount paymentAccountIn) {
    this.paymentAccountIn = paymentAccountIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashbookEntryInData cashbookEntryInData = (CashbookEntryInData) o;
    return Objects.equals(this.amountIn, cashbookEntryInData.amountIn) &&
        Objects.equals(this.paymentAccountIn, cashbookEntryInData.paymentAccountIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountIn, paymentAccountIn);
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
    sb.append("class CashbookEntryInData {\n");
    sb.append("    amountIn: ").append(toIndentedString(amountIn)).append("\n");
    sb.append("    paymentAccountIn: ").append(toIndentedString(paymentAccountIn)).append("\n");
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

