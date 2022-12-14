/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.24
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

/** EmailScheduleInclude */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-13T15:06:28.671Z[Etc/UTC]")
public class EmailScheduleInclude implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";

  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private Boolean document;

  public static final String SERIALIZED_NAME_DELIVERY_NOTE = "delivery_note";

  @SerializedName(SERIALIZED_NAME_DELIVERY_NOTE)
  private Boolean deliveryNote;

  public static final String SERIALIZED_NAME_ATTACHMENT = "attachment";

  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  private Boolean attachment;

  public static final String SERIALIZED_NAME_ACCOMPANYING_INVOICE = "accompanying_invoice";

  @SerializedName(SERIALIZED_NAME_ACCOMPANYING_INVOICE)
  private Boolean accompanyingInvoice;

  public EmailScheduleInclude() {}

  public EmailScheduleInclude document(Boolean document) {

    this.document = document;
    return this;
  }

  /**
   * If set to true, the email will have a button to view the document
   *
   * @return document
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to true, the email will have a button to view the document")
  public Boolean getDocument() {
    return document;
  }

  public void setDocument(Boolean document) {
    this.document = document;
  }

  public EmailScheduleInclude deliveryNote(Boolean deliveryNote) {

    this.deliveryNote = deliveryNote;
    return this;
  }

  /**
   * If set to true, the email will have a button to view the delivery note
   *
   * @return deliveryNote
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "If set to true, the email will have a button to view the delivery note")
  public Boolean getDeliveryNote() {
    return deliveryNote;
  }

  public void setDeliveryNote(Boolean deliveryNote) {
    this.deliveryNote = deliveryNote;
  }

  public EmailScheduleInclude attachment(Boolean attachment) {

    this.attachment = attachment;
    return this;
  }

  /**
   * If set to true, the email will have a button to view the attachment
   *
   * @return attachment
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to true, the email will have a button to view the attachment")
  public Boolean getAttachment() {
    return attachment;
  }

  public void setAttachment(Boolean attachment) {
    this.attachment = attachment;
  }

  public EmailScheduleInclude accompanyingInvoice(Boolean accompanyingInvoice) {

    this.accompanyingInvoice = accompanyingInvoice;
    return this;
  }

  /**
   * If set to true, the email will have a button to view the accompanying invoice
   *
   * @return accompanyingInvoice
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "If set to true, the email will have a button to view the accompanying invoice")
  public Boolean getAccompanyingInvoice() {
    return accompanyingInvoice;
  }

  public void setAccompanyingInvoice(Boolean accompanyingInvoice) {
    this.accompanyingInvoice = accompanyingInvoice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailScheduleInclude emailScheduleInclude = (EmailScheduleInclude) o;
    return Objects.equals(this.document, emailScheduleInclude.document)
        && Objects.equals(this.deliveryNote, emailScheduleInclude.deliveryNote)
        && Objects.equals(this.attachment, emailScheduleInclude.attachment)
        && Objects.equals(this.accompanyingInvoice, emailScheduleInclude.accompanyingInvoice);
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
    return Objects.hash(document, deliveryNote, attachment, accompanyingInvoice);
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
    sb.append("class EmailScheduleInclude {\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    deliveryNote: ").append(toIndentedString(deliveryNote)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    accompanyingInvoice: ")
        .append(toIndentedString(accompanyingInvoice))
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
    openapiFields.add("document");
    openapiFields.add("delivery_note");
    openapiFields.add("attachment");
    openapiFields.add("accompanying_invoice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to EmailScheduleInclude
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (EmailScheduleInclude.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in EmailScheduleInclude is not found in the empty JSON string",
                EmailScheduleInclude.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!EmailScheduleInclude.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `EmailScheduleInclude` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!EmailScheduleInclude.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'EmailScheduleInclude' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<EmailScheduleInclude> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(EmailScheduleInclude.class));

      return (TypeAdapter<T>)
          new TypeAdapter<EmailScheduleInclude>() {
            @Override
            public void write(JsonWriter out, EmailScheduleInclude value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public EmailScheduleInclude read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of EmailScheduleInclude given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmailScheduleInclude
   * @throws IOException if the JSON string is invalid with respect to EmailScheduleInclude
   */
  public static EmailScheduleInclude fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailScheduleInclude.class);
  }

  /**
   * Convert an instance of EmailScheduleInclude to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
