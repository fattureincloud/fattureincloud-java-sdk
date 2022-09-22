/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.20
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
import java.math.BigDecimal;
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
    date = "2022-09-20T06:22:23.527Z[Etc/UTC]")
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

  public MonthlyTotal() {}

  public MonthlyTotal net(BigDecimal net) {

    this.net = net;
    return this;
  }

  /**
   * Monthly total net amount.
   *
   * @return net
   */
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
   *
   * @return gross
   */
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
   *
   * @return count
   */
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
    return Objects.equals(this.net, monthlyTotal.net)
        && Objects.equals(this.gross, monthlyTotal.gross)
        && Objects.equals(this.count, monthlyTotal.count);
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
    return Objects.hash(net, gross, count);
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
    sb.append("class MonthlyTotal {\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    gross: ").append(toIndentedString(gross)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
    openapiFields.add("net");
    openapiFields.add("gross");
    openapiFields.add("count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to MonthlyTotal
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (MonthlyTotal.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in MonthlyTotal is not found in the empty JSON string",
                MonthlyTotal.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!MonthlyTotal.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `MonthlyTotal` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!MonthlyTotal.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'MonthlyTotal' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<MonthlyTotal> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(MonthlyTotal.class));

      return (TypeAdapter<T>)
          new TypeAdapter<MonthlyTotal>() {
            @Override
            public void write(JsonWriter out, MonthlyTotal value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public MonthlyTotal read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of MonthlyTotal given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MonthlyTotal
   * @throws IOException if the JSON string is invalid with respect to MonthlyTotal
   */
  public static MonthlyTotal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MonthlyTotal.class);
  }

  /**
   * Convert an instance of MonthlyTotal to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
