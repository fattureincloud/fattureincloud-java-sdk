/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.8
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
 * CashbookEntryOutData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-11T09:47:17.167Z[Etc/UTC]")
public class CashbookEntryOutData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT_OUT = "amount_out";
  @SerializedName(SERIALIZED_NAME_AMOUNT_OUT)
  private BigDecimal amountOut;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT_OUT = "payment_account_out";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT_OUT)
  private PaymentAccount paymentAccountOut;

  public CashbookEntryOutData() { 
  }

  public CashbookEntryOutData amountOut(BigDecimal amountOut) {
    
    this.amountOut = amountOut;
    return this;
  }

   /**
   * Total amount out.
   * @return amountOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount out.")

  public BigDecimal getAmountOut() {
    return amountOut;
  }


  public void setAmountOut(BigDecimal amountOut) {
    this.amountOut = amountOut;
  }


  public CashbookEntryOutData paymentAccountOut(PaymentAccount paymentAccountOut) {
    
    this.paymentAccountOut = paymentAccountOut;
    return this;
  }

   /**
   * Get paymentAccountOut
   * @return paymentAccountOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentAccount getPaymentAccountOut() {
    return paymentAccountOut;
  }


  public void setPaymentAccountOut(PaymentAccount paymentAccountOut) {
    this.paymentAccountOut = paymentAccountOut;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashbookEntryOutData cashbookEntryOutData = (CashbookEntryOutData) o;
    return Objects.equals(this.amountOut, cashbookEntryOutData.amountOut) &&
        Objects.equals(this.paymentAccountOut, cashbookEntryOutData.paymentAccountOut);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountOut, paymentAccountOut);
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
    sb.append("class CashbookEntryOutData {\n");
    sb.append("    amountOut: ").append(toIndentedString(amountOut)).append("\n");
    sb.append("    paymentAccountOut: ").append(toIndentedString(paymentAccountOut)).append("\n");
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

