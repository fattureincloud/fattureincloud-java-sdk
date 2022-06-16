/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.18
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
    date = "2022-06-16T10:37:15.055150Z[Etc/UTC]")
public class GetUserInfoResponse {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";

  @SerializedName(SERIALIZED_NAME_DATA)
  private User data;

  public static final String SERIALIZED_NAME_INFO = "info";

  @SerializedName(SERIALIZED_NAME_INFO)
  private GetUserInfoResponseInfo info;

  public static final String SERIALIZED_NAME_EMAIL_CONFIRMATION_STATE = "email_confirmation_state";

  @SerializedName(SERIALIZED_NAME_EMAIL_CONFIRMATION_STATE)
  private GetUserInfoResponseEmailConfirmationState emailConfirmationState;

  public GetUserInfoResponse() {}

  public GetUserInfoResponse data(User data) {

    this.data = data;
    return this;
  }

  /**
   * Get data
   *
   * @return data
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public User getData() {
    return data;
  }

  public void setData(User data) {
    this.data = data;
  }

  public GetUserInfoResponse info(GetUserInfoResponseInfo info) {

    this.info = info;
    return this;
  }

  /**
   * Get info
   *
   * @return info
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public GetUserInfoResponseInfo getInfo() {
    return info;
  }

  public void setInfo(GetUserInfoResponseInfo info) {
    this.info = info;
  }

  public GetUserInfoResponse emailConfirmationState(
      GetUserInfoResponseEmailConfirmationState emailConfirmationState) {

    this.emailConfirmationState = emailConfirmationState;
    return this;
  }

  /**
   * Get emailConfirmationState
   *
   * @return emailConfirmationState
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public GetUserInfoResponseEmailConfirmationState getEmailConfirmationState() {
    return emailConfirmationState;
  }

  public void setEmailConfirmationState(
      GetUserInfoResponseEmailConfirmationState emailConfirmationState) {
    this.emailConfirmationState = emailConfirmationState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserInfoResponse getUserInfoResponse = (GetUserInfoResponse) o;
    return Objects.equals(this.data, getUserInfoResponse.data)
        && Objects.equals(this.info, getUserInfoResponse.info)
        && Objects.equals(this.emailConfirmationState, getUserInfoResponse.emailConfirmationState);
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
    return Objects.hash(data, info, emailConfirmationState);
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
    sb.append("class GetUserInfoResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    emailConfirmationState: ")
        .append(toIndentedString(emailConfirmationState))
        .append("\n");
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
    openapiFields.add("data");
    openapiFields.add("info");
    openapiFields.add("email_confirmation_state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to GetUserInfoResponse
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (GetUserInfoResponse.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in GetUserInfoResponse is not found in the empty JSON"
                    + " string",
                GetUserInfoResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!GetUserInfoResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `GetUserInfoResponse`"
                    + " properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    // validate the optional field `data`
    if ((jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull())
        && !jsonObj.get("data").isJsonPrimitive()) {
      User.validateJsonObject(jsonObj.getAsJsonObject("data"));
    }
    // validate the optional field `info`
    if ((jsonObj.get("info") != null && !jsonObj.get("info").isJsonNull())
        && !jsonObj.get("info").isJsonPrimitive()) {
      GetUserInfoResponseInfo.validateJsonObject(jsonObj.getAsJsonObject("info"));
    }
    // validate the optional field `email_confirmation_state`
    if ((jsonObj.get("email_confirmation_state") != null
            && !jsonObj.get("email_confirmation_state").isJsonNull())
        && !jsonObj.get("email_confirmation_state").isJsonPrimitive()) {
      GetUserInfoResponseEmailConfirmationState.validateJsonObject(
          jsonObj.getAsJsonObject("email_confirmation_state"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GetUserInfoResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GetUserInfoResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GetUserInfoResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GetUserInfoResponse.class));

      return (TypeAdapter<T>)
          new TypeAdapter<GetUserInfoResponse>() {
            @Override
            public void write(JsonWriter out, GetUserInfoResponse value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public GetUserInfoResponse read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of GetUserInfoResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetUserInfoResponse
   * @throws IOException if the JSON string is invalid with respect to GetUserInfoResponse
   */
  public static GetUserInfoResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetUserInfoResponse.class);
  }

  /**
   * Convert an instance of GetUserInfoResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
