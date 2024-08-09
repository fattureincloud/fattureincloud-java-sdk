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
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Currency */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-09T09:03:55.704569Z[Etc/UTC]",
    comments = "Generator version: 7.7.0")
public class Currency implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";

  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE = "exchange_rate";

  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE)
  private String exchangeRate;

  public static final String SERIALIZED_NAME_HTML_SYMBOL = "html_symbol";

  @SerializedName(SERIALIZED_NAME_HTML_SYMBOL)
  private String htmlSymbol;

  public Currency() {}

  public Currency id(String id) {

    this.id = id;
    return this;
  }

  /**
   * Currency code
   *
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Currency symbol(String symbol) {

    this.symbol = symbol;
    return this;
  }

  /**
   * Currency symbol
   *
   * @return symbol
   */
  @javax.annotation.Nullable
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Currency exchangeRate(String exchangeRate) {

    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * Currency exchange rate (EUR to this)
   *
   * @return exchangeRate
   */
  @javax.annotation.Nullable
  public String getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public Currency htmlSymbol(String htmlSymbol) {

    this.htmlSymbol = htmlSymbol;
    return this;
  }

  /**
   * Currency html code
   *
   * @return htmlSymbol
   */
  @javax.annotation.Nullable
  public String getHtmlSymbol() {
    return htmlSymbol;
  }

  public void setHtmlSymbol(String htmlSymbol) {
    this.htmlSymbol = htmlSymbol;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currency currency = (Currency) o;
    return Objects.equals(this.id, currency.id)
        && Objects.equals(this.symbol, currency.symbol)
        && Objects.equals(this.exchangeRate, currency.exchangeRate)
        && Objects.equals(this.htmlSymbol, currency.htmlSymbol);
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
    return Objects.hash(id, symbol, exchangeRate, htmlSymbol);
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
    sb.append("class Currency {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    htmlSymbol: ").append(toIndentedString(htmlSymbol)).append("\n");
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
