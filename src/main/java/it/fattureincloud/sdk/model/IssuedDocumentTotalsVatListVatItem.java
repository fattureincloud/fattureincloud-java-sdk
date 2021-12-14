/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.7
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
import java.io.IOException;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * IssuedDocumentTotalsVatListVatItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-14T16:12:54.353Z[GMT]")
public class IssuedDocumentTotalsVatListVatItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT_NET = "amount_net";
  @SerializedName(SERIALIZED_NAME_AMOUNT_NET)
  private BigDecimal amountNet;

  public static final String SERIALIZED_NAME_AMOUNT_VAT = "amount_vat";
  @SerializedName(SERIALIZED_NAME_AMOUNT_VAT)
  private BigDecimal amountVat;


  public IssuedDocumentTotalsVatListVatItem amountNet(BigDecimal amountNet) {
    
    this.amountNet = amountNet;
    return this;
  }

   /**
   * Get amountNet
   * @return amountNet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAmountNet() {
    return amountNet;
  }


  public void setAmountNet(BigDecimal amountNet) {
    this.amountNet = amountNet;
  }


  public IssuedDocumentTotalsVatListVatItem amountVat(BigDecimal amountVat) {
    
    this.amountVat = amountVat;
    return this;
  }

   /**
   * Get amountVat
   * @return amountVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAmountVat() {
    return amountVat;
  }


  public void setAmountVat(BigDecimal amountVat) {
    this.amountVat = amountVat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentTotalsVatListVatItem issuedDocumentTotalsVatListVatItem = (IssuedDocumentTotalsVatListVatItem) o;
    return Objects.equals(this.amountNet, issuedDocumentTotalsVatListVatItem.amountNet) &&
        Objects.equals(this.amountVat, issuedDocumentTotalsVatListVatItem.amountVat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountNet, amountVat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuedDocumentTotalsVatListVatItem {\n");
    sb.append("    amountNet: ").append(toIndentedString(amountNet)).append("\n");
    sb.append("    amountVat: ").append(toIndentedString(amountVat)).append("\n");
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

