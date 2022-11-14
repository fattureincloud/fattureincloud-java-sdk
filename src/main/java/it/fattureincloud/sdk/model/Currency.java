/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.21
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.fattureincloud.sdk.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@ApiModel(description = "")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-11-14T07:38:51.580Z[Etc/UTC]")
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
   * Currency code.
   *
   * @return id
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EUR", value = "Currency code.")
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
   * Currency symbol.
   *
   * @return symbol
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "€", value = "Currency symbol.")
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
   * Currency exchange rate (EUR to this).
   *
   * @return exchangeRate
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Currency exchange rate (EUR to this).")
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
   * Currency html code.
   *
   * @return htmlSymbol
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EUR", value = "Currency html code.")
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

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("symbol");
    openapiFields.add("exchange_rate");
    openapiFields.add("html_symbol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to Currency
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (Currency.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in Currency is not found in the empty JSON string",
                Currency.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!Currency.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `Currency` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull())
        && !jsonObj.get("id").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `id` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("id").toString()));
    }
    if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull())
        && !jsonObj.get("symbol").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `symbol` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("symbol").toString()));
    }
    if ((jsonObj.get("exchange_rate") != null && !jsonObj.get("exchange_rate").isJsonNull())
        && !jsonObj.get("exchange_rate").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `exchange_rate` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("exchange_rate").toString()));
    }
    if ((jsonObj.get("html_symbol") != null && !jsonObj.get("html_symbol").isJsonNull())
        && !jsonObj.get("html_symbol").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `html_symbol` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("html_symbol").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!Currency.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'Currency' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<Currency> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(Currency.class));

      return (TypeAdapter<T>)
          new TypeAdapter<Currency>() {
            @Override
            public void write(JsonWriter out, Currency value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public Currency read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of Currency given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Currency
   * @throws IOException if the JSON string is invalid with respect to Currency
   */
  public static Currency fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Currency.class);
  }

  /**
   * Convert an instance of Currency to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
