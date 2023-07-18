/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.29
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** WebhooksSubscription */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-07-17T10:04:00.151Z[Etc/UTC]")
public class WebhooksSubscription implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SINK = "sink";

  @SerializedName(SERIALIZED_NAME_SINK)
  private String sink;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";

  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public static final String SERIALIZED_NAME_TYPES = "types";

  @SerializedName(SERIALIZED_NAME_TYPES)
  private List<EventType> types = null;

  public WebhooksSubscription() {}

  public WebhooksSubscription id(String id) {

    this.id = id;
    return this;
  }

  /**
   * Webhooks subscription id
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

  public WebhooksSubscription sink(String sink) {

    this.sink = sink;
    return this;
  }

  /**
   * Webhooks callback uri.
   *
   * @return sink
   */
  @javax.annotation.Nullable
  public String getSink() {
    return sink;
  }

  public void setSink(String sink) {
    this.sink = sink;
  }

  public WebhooksSubscription verified(Boolean verified) {

    this.verified = verified;
    return this;
  }

  /**
   * [Read Only] True if the webhooks subscription has been verified.
   *
   * @return verified
   */
  @javax.annotation.Nullable
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public WebhooksSubscription types(List<EventType> types) {

    this.types = types;
    return this;
  }

  public WebhooksSubscription addTypesItem(EventType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Webhooks events types.
   *
   * @return types
   */
  @javax.annotation.Nullable
  public List<EventType> getTypes() {
    return types;
  }

  public void setTypes(List<EventType> types) {
    this.types = types;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksSubscription webhooksSubscription = (WebhooksSubscription) o;
    return Objects.equals(this.id, webhooksSubscription.id)
        && Objects.equals(this.sink, webhooksSubscription.sink)
        && Objects.equals(this.verified, webhooksSubscription.verified)
        && Objects.equals(this.types, webhooksSubscription.types);
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
    return Objects.hash(id, sink, verified, types);
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
    sb.append("class WebhooksSubscription {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sink: ").append(toIndentedString(sink)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
