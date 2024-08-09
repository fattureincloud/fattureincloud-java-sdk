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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** EmailData */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-08-09T09:03:55.704569Z[Etc/UTC]",
    comments = "Generator version: 7.7.0")
public class EmailData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RECIPIENT_EMAIL = "recipient_email";

  @SerializedName(SERIALIZED_NAME_RECIPIENT_EMAIL)
  private String recipientEmail;

  public static final String SERIALIZED_NAME_DEFAULT_SENDER_EMAIL = "default_sender_email";

  @SerializedName(SERIALIZED_NAME_DEFAULT_SENDER_EMAIL)
  private EmailDataDefaultSenderEmail defaultSenderEmail;

  public static final String SERIALIZED_NAME_SENDER_EMAILS_LIST = "sender_emails_list";

  @SerializedName(SERIALIZED_NAME_SENDER_EMAILS_LIST)
  private List<SenderEmail> senderEmailsList;

  public static final String SERIALIZED_NAME_CC_EMAIL = "cc_email";

  @SerializedName(SERIALIZED_NAME_CC_EMAIL)
  private String ccEmail;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";

  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_BODY = "body";

  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_DOCUMENT_EXISTS = "document_exists";

  @SerializedName(SERIALIZED_NAME_DOCUMENT_EXISTS)
  private Boolean documentExists;

  public static final String SERIALIZED_NAME_DELIVERY_NOTE_EXISTS = "delivery_note_exists";

  @SerializedName(SERIALIZED_NAME_DELIVERY_NOTE_EXISTS)
  private Boolean deliveryNoteExists;

  public static final String SERIALIZED_NAME_ATTACHMENT_EXISTS = "attachment_exists";

  @SerializedName(SERIALIZED_NAME_ATTACHMENT_EXISTS)
  private Boolean attachmentExists;

  public static final String SERIALIZED_NAME_ACCOMPANYING_INVOICE_EXISTS =
      "accompanying_invoice_exists";

  @SerializedName(SERIALIZED_NAME_ACCOMPANYING_INVOICE_EXISTS)
  private Boolean accompanyingInvoiceExists;

  public static final String SERIALIZED_NAME_DEFAULT_ATTACH_PDF = "default_attach_pdf";

  @SerializedName(SERIALIZED_NAME_DEFAULT_ATTACH_PDF)
  private Boolean defaultAttachPdf;

  public EmailData() {}

  public EmailData recipientEmail(String recipientEmail) {

    this.recipientEmail = recipientEmail;
    return this;
  }

  /**
   * Email recipient
   *
   * @return recipientEmail
   */
  @javax.annotation.Nullable
  public String getRecipientEmail() {
    return recipientEmail;
  }

  public void setRecipientEmail(String recipientEmail) {
    this.recipientEmail = recipientEmail;
  }

  public EmailData defaultSenderEmail(EmailDataDefaultSenderEmail defaultSenderEmail) {

    this.defaultSenderEmail = defaultSenderEmail;
    return this;
  }

  /**
   * Get defaultSenderEmail
   *
   * @return defaultSenderEmail
   */
  @javax.annotation.Nullable
  public EmailDataDefaultSenderEmail getDefaultSenderEmail() {
    return defaultSenderEmail;
  }

  public void setDefaultSenderEmail(EmailDataDefaultSenderEmail defaultSenderEmail) {
    this.defaultSenderEmail = defaultSenderEmail;
  }

  public EmailData senderEmailsList(List<SenderEmail> senderEmailsList) {

    this.senderEmailsList = senderEmailsList;
    return this;
  }

  public EmailData addSenderEmailsListItem(SenderEmail senderEmailsListItem) {
    if (this.senderEmailsList == null) {
      this.senderEmailsList = new ArrayList<>();
    }
    this.senderEmailsList.add(senderEmailsListItem);
    return this;
  }

  /**
   * List of all emails from which the document can be sent
   *
   * @return senderEmailsList
   */
  @javax.annotation.Nullable
  public List<SenderEmail> getSenderEmailsList() {
    return senderEmailsList;
  }

  public void setSenderEmailsList(List<SenderEmail> senderEmailsList) {
    this.senderEmailsList = senderEmailsList;
  }

  public EmailData ccEmail(String ccEmail) {

    this.ccEmail = ccEmail;
    return this;
  }

  /**
   * Email cc [by default is the logged company email]
   *
   * @return ccEmail
   */
  @javax.annotation.Nullable
  public String getCcEmail() {
    return ccEmail;
  }

  public void setCcEmail(String ccEmail) {
    this.ccEmail = ccEmail;
  }

  public EmailData subject(String subject) {

    this.subject = subject;
    return this;
  }

  /**
   * Email subject
   *
   * @return subject
   */
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public EmailData body(String body) {

    this.body = body;
    return this;
  }

  /**
   * Email body
   *
   * @return body
   */
  @javax.annotation.Nullable
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public EmailData documentExists(Boolean documentExists) {

    this.documentExists = documentExists;
    return this;
  }

  /**
   * Document exists if it is not a delivery note
   *
   * @return documentExists
   */
  @javax.annotation.Nullable
  public Boolean getDocumentExists() {
    return documentExists;
  }

  public void setDocumentExists(Boolean documentExists) {
    this.documentExists = documentExists;
  }

  public EmailData deliveryNoteExists(Boolean deliveryNoteExists) {

    this.deliveryNoteExists = deliveryNoteExists;
    return this;
  }

  /**
   * Document is a delivery note
   *
   * @return deliveryNoteExists
   */
  @javax.annotation.Nullable
  public Boolean getDeliveryNoteExists() {
    return deliveryNoteExists;
  }

  public void setDeliveryNoteExists(Boolean deliveryNoteExists) {
    this.deliveryNoteExists = deliveryNoteExists;
  }

  public EmailData attachmentExists(Boolean attachmentExists) {

    this.attachmentExists = attachmentExists;
    return this;
  }

  /**
   * Document has attachment
   *
   * @return attachmentExists
   */
  @javax.annotation.Nullable
  public Boolean getAttachmentExists() {
    return attachmentExists;
  }

  public void setAttachmentExists(Boolean attachmentExists) {
    this.attachmentExists = attachmentExists;
  }

  public EmailData accompanyingInvoiceExists(Boolean accompanyingInvoiceExists) {

    this.accompanyingInvoiceExists = accompanyingInvoiceExists;
    return this;
  }

  /**
   * Document has accompanying invoice
   *
   * @return accompanyingInvoiceExists
   */
  @javax.annotation.Nullable
  public Boolean getAccompanyingInvoiceExists() {
    return accompanyingInvoiceExists;
  }

  public void setAccompanyingInvoiceExists(Boolean accompanyingInvoiceExists) {
    this.accompanyingInvoiceExists = accompanyingInvoiceExists;
  }

  public EmailData defaultAttachPdf(Boolean defaultAttachPdf) {

    this.defaultAttachPdf = defaultAttachPdf;
    return this;
  }

  /**
   * Attach document pdf
   *
   * @return defaultAttachPdf
   */
  @javax.annotation.Nullable
  public Boolean getDefaultAttachPdf() {
    return defaultAttachPdf;
  }

  public void setDefaultAttachPdf(Boolean defaultAttachPdf) {
    this.defaultAttachPdf = defaultAttachPdf;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailData emailData = (EmailData) o;
    return Objects.equals(this.recipientEmail, emailData.recipientEmail)
        && Objects.equals(this.defaultSenderEmail, emailData.defaultSenderEmail)
        && Objects.equals(this.senderEmailsList, emailData.senderEmailsList)
        && Objects.equals(this.ccEmail, emailData.ccEmail)
        && Objects.equals(this.subject, emailData.subject)
        && Objects.equals(this.body, emailData.body)
        && Objects.equals(this.documentExists, emailData.documentExists)
        && Objects.equals(this.deliveryNoteExists, emailData.deliveryNoteExists)
        && Objects.equals(this.attachmentExists, emailData.attachmentExists)
        && Objects.equals(this.accompanyingInvoiceExists, emailData.accompanyingInvoiceExists)
        && Objects.equals(this.defaultAttachPdf, emailData.defaultAttachPdf);
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
    return Objects.hash(
        recipientEmail,
        defaultSenderEmail,
        senderEmailsList,
        ccEmail,
        subject,
        body,
        documentExists,
        deliveryNoteExists,
        attachmentExists,
        accompanyingInvoiceExists,
        defaultAttachPdf);
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
    sb.append("class EmailData {\n");
    sb.append("    recipientEmail: ").append(toIndentedString(recipientEmail)).append("\n");
    sb.append("    defaultSenderEmail: ").append(toIndentedString(defaultSenderEmail)).append("\n");
    sb.append("    senderEmailsList: ").append(toIndentedString(senderEmailsList)).append("\n");
    sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    documentExists: ").append(toIndentedString(documentExists)).append("\n");
    sb.append("    deliveryNoteExists: ").append(toIndentedString(deliveryNoteExists)).append("\n");
    sb.append("    attachmentExists: ").append(toIndentedString(attachmentExists)).append("\n");
    sb.append("    accompanyingInvoiceExists: ")
        .append(toIndentedString(accompanyingInvoiceExists))
        .append("\n");
    sb.append("    defaultAttachPdf: ").append(toIndentedString(defaultAttachPdf)).append("\n");
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
