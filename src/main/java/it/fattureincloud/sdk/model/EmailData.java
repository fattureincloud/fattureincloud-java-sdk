/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.25
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import it.fattureincloud.sdk.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-02-07T13:36:20.600Z[Etc/UTC]")
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
  private List<SenderEmail> senderEmailsList = null;

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
   * Recipient&#39;s email
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
      this.senderEmailsList = null;
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
   * By default is the logged company email. This is the email address to which a copy will be sent.
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
   * If the document is not a delivery note, this flag will be set to true
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
   * If the document is a delivery note, this flag will be set to true
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
   * If the document has one or more attachments, this flag will be set to true
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
   * If an accompanying invoice exists, this flag will be set to true
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
   * If a pdf is attached, this flag will be set to true
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

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("recipient_email");
    openapiFields.add("default_sender_email");
    openapiFields.add("sender_emails_list");
    openapiFields.add("cc_email");
    openapiFields.add("subject");
    openapiFields.add("body");
    openapiFields.add("document_exists");
    openapiFields.add("delivery_note_exists");
    openapiFields.add("attachment_exists");
    openapiFields.add("accompanying_invoice_exists");
    openapiFields.add("default_attach_pdf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to EmailData
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (!EmailData.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON object is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in EmailData is not found in the empty JSON string",
                EmailData.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!EmailData.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `EmailData` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("recipient_email") != null && !jsonObj.get("recipient_email").isJsonNull())
        && !jsonObj.get("recipient_email").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `recipient_email` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("recipient_email").toString()));
    }
    // validate the optional field `default_sender_email`
    if (jsonObj.get("default_sender_email") != null
        && !jsonObj.get("default_sender_email").isJsonNull()) {
      EmailDataDefaultSenderEmail.validateJsonObject(
          jsonObj.getAsJsonObject("default_sender_email"));
    }
    if (jsonObj.get("sender_emails_list") != null
        && !jsonObj.get("sender_emails_list").isJsonNull()) {
      JsonArray jsonArraysenderEmailsList = jsonObj.getAsJsonArray("sender_emails_list");
      if (jsonArraysenderEmailsList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sender_emails_list").isJsonArray()) {
          throw new IllegalArgumentException(
              String.format(
                  "Expected the field `sender_emails_list` to be an array in the JSON string but got `%s`",
                  jsonObj.get("sender_emails_list").toString()));
        }

        // validate the optional field `sender_emails_list` (array)
        for (int i = 0; i < jsonArraysenderEmailsList.size(); i++) {
          SenderEmail.validateJsonObject(jsonArraysenderEmailsList.get(i).getAsJsonObject());
        }
        ;
      }
    }
    if ((jsonObj.get("cc_email") != null && !jsonObj.get("cc_email").isJsonNull())
        && !jsonObj.get("cc_email").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `cc_email` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("cc_email").toString()));
    }
    if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull())
        && !jsonObj.get("subject").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `subject` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("subject").toString()));
    }
    if ((jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull())
        && !jsonObj.get("body").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `body` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("body").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!EmailData.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'EmailData' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<EmailData> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(EmailData.class));

      return (TypeAdapter<T>)
          new TypeAdapter<EmailData>() {
            @Override
            public void write(JsonWriter out, EmailData value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public EmailData read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of EmailData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmailData
   * @throws IOException if the JSON string is invalid with respect to EmailData
   */
  public static EmailData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailData.class);
  }

  /**
   * Convert an instance of EmailData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
