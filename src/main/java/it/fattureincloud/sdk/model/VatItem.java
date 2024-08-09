/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.1
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

/** VatItem */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-09T10:31:32.240591Z[Etc/UTC]",
    comments = "Generator version: 7.7.0")
public class VatItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT_NET = "amount_net";

  @SerializedName(SERIALIZED_NAME_AMOUNT_NET)
  private BigDecimal amountNet;

  public static final String SERIALIZED_NAME_AMOUNT_VAT = "amount_vat";

  @SerializedName(SERIALIZED_NAME_AMOUNT_VAT)
  private BigDecimal amountVat;

  public VatItem() {}

  public VatItem amountNet(BigDecimal amountNet) {

    this.amountNet = amountNet;
    return this;
  }

  /**
   * Vat item net amount
   *
   * @return amountNet
   */
  @javax.annotation.Nullable
  public BigDecimal getAmountNet() {
    return amountNet;
  }

  public void setAmountNet(BigDecimal amountNet) {
    this.amountNet = amountNet;
  }

  public VatItem amountVat(BigDecimal amountVat) {

    this.amountVat = amountVat;
    return this;
  }

  /**
   * Vat item vat amount
   *
   * @return amountVat
   */
  @javax.annotation.Nullable
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
    VatItem vatItem = (VatItem) o;
    return Objects.equals(this.amountNet, vatItem.amountNet)
        && Objects.equals(this.amountVat, vatItem.amountVat);
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
    return Objects.hash(amountNet, amountVat);
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
    sb.append("class VatItem {\n");
    sb.append("    amountNet: ").append(toIndentedString(amountNet)).append("\n");
    sb.append("    amountVat: ").append(toIndentedString(amountVat)).append("\n");
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
