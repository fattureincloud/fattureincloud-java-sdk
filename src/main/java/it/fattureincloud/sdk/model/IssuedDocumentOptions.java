/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.3
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

/** IssuedDocumentOptions */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-30T09:09:50.123536Z[Etc/UTC]",
    comments = "Generator version: 7.9.0")
public class IssuedDocumentOptions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FIX_PAYMENTS = "fix_payments";

  @SerializedName(SERIALIZED_NAME_FIX_PAYMENTS)
  private Boolean fixPayments;

  public static final String SERIALIZED_NAME_CREATE_FROM = "create_from";

  @SerializedName(SERIALIZED_NAME_CREATE_FROM)
  private List<String> createFrom;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";

  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private Boolean transform;

  public static final String SERIALIZED_NAME_KEEP_COPY = "keep_copy";

  @SerializedName(SERIALIZED_NAME_KEEP_COPY)
  private Boolean keepCopy;

  public static final String SERIALIZED_NAME_JOIN_TYPE = "join_type";

  @SerializedName(SERIALIZED_NAME_JOIN_TYPE)
  private String joinType;

  public IssuedDocumentOptions() {}

  public IssuedDocumentOptions fixPayments(Boolean fixPayments) {

    this.fixPayments = fixPayments;
    return this;
  }

  /**
   * Fixes your last payment amount to match your document total
   *
   * @return fixPayments
   */
  @javax.annotation.Nullable
  public Boolean getFixPayments() {
    return fixPayments;
  }

  public void setFixPayments(Boolean fixPayments) {
    this.fixPayments = fixPayments;
  }

  public IssuedDocumentOptions createFrom(List<String> createFrom) {

    this.createFrom = createFrom;
    return this;
  }

  public IssuedDocumentOptions addCreateFromItem(String createFromItem) {
    if (this.createFrom == null) {
      this.createFrom = new ArrayList<>();
    }
    this.createFrom.add(createFromItem);
    return this;
  }

  /**
   * Original documents ids [only for join/transform]
   *
   * @return createFrom
   */
  @javax.annotation.Nullable
  public List<String> getCreateFrom() {
    return createFrom;
  }

  public void setCreateFrom(List<String> createFrom) {
    this.createFrom = createFrom;
  }

  public IssuedDocumentOptions transform(Boolean transform) {

    this.transform = transform;
    return this;
  }

  /**
   * Tranform a document [only for transform]
   *
   * @return transform
   */
  @javax.annotation.Nullable
  public Boolean getTransform() {
    return transform;
  }

  public void setTransform(Boolean transform) {
    this.transform = transform;
  }

  public IssuedDocumentOptions keepCopy(Boolean keepCopy) {

    this.keepCopy = keepCopy;
    return this;
  }

  /**
   * Keep original document [only for transform]
   *
   * @return keepCopy
   */
  @javax.annotation.Nullable
  public Boolean getKeepCopy() {
    return keepCopy;
  }

  public void setKeepCopy(Boolean keepCopy) {
    this.keepCopy = keepCopy;
  }

  public IssuedDocumentOptions joinType(String joinType) {

    this.joinType = joinType;
    return this;
  }

  /**
   * Join type [only for join]
   *
   * @return joinType
   */
  @javax.annotation.Nullable
  public String getJoinType() {
    return joinType;
  }

  public void setJoinType(String joinType) {
    this.joinType = joinType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentOptions issuedDocumentOptions = (IssuedDocumentOptions) o;
    return Objects.equals(this.fixPayments, issuedDocumentOptions.fixPayments)
        && Objects.equals(this.createFrom, issuedDocumentOptions.createFrom)
        && Objects.equals(this.transform, issuedDocumentOptions.transform)
        && Objects.equals(this.keepCopy, issuedDocumentOptions.keepCopy)
        && Objects.equals(this.joinType, issuedDocumentOptions.joinType);
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
    return Objects.hash(fixPayments, createFrom, transform, keepCopy, joinType);
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
    sb.append("class IssuedDocumentOptions {\n");
    sb.append("    fixPayments: ").append(toIndentedString(fixPayments)).append("\n");
    sb.append("    createFrom: ").append(toIndentedString(createFrom)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    keepCopy: ").append(toIndentedString(keepCopy)).append("\n");
    sb.append("    joinType: ").append(toIndentedString(joinType)).append("\n");
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
