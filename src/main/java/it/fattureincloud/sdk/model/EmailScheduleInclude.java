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

/** EmailScheduleInclude */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-09T10:31:32.240591Z[Etc/UTC]",
    comments = "Generator version: 7.7.0")
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
   * Include a button to view the document
   *
   * @return document
   */
  @javax.annotation.Nullable
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
   * Include a button to view the delivery note
   *
   * @return deliveryNote
   */
  @javax.annotation.Nullable
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
   * Include a button to view the attachment
   *
   * @return attachment
   */
  @javax.annotation.Nullable
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
   * Include a button to view the accompanying invoice
   *
   * @return accompanyingInvoice
   */
  @javax.annotation.Nullable
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
}
