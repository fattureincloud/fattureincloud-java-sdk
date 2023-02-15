/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.26
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-02-13T13:42:26.512Z[Etc/UTC]")
public class Email implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private EmailStatus status;

  public static final String SERIALIZED_NAME_SENT_DATE = "sent_date";

  @SerializedName(SERIALIZED_NAME_SENT_DATE)
  private OffsetDateTime sentDate;

  public static final String SERIALIZED_NAME_ERRORS_COUNT = "errors_count";

  @SerializedName(SERIALIZED_NAME_ERRORS_COUNT)
  private Integer errorsCount;

  public static final String SERIALIZED_NAME_ERROR_LOG = "error_log";

  @SerializedName(SERIALIZED_NAME_ERROR_LOG)
  private String errorLog;

  public static final String SERIALIZED_NAME_FROM_EMAIL = "from_email";

  @SerializedName(SERIALIZED_NAME_FROM_EMAIL)
  private String fromEmail;

  public static final String SERIALIZED_NAME_FROM_NAME = "from_name";

  @SerializedName(SERIALIZED_NAME_FROM_NAME)
  private String fromName;

  public static final String SERIALIZED_NAME_TO_EMAIL = "to_email";

  @SerializedName(SERIALIZED_NAME_TO_EMAIL)
  private String toEmail;

  public static final String SERIALIZED_NAME_TO_NAME = "to_name";

  @SerializedName(SERIALIZED_NAME_TO_NAME)
  private String toName;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";

  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_CONTENT = "content";

  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_COPY_TO = "copy_to";

  @SerializedName(SERIALIZED_NAME_COPY_TO)
  private String copyTo;

  public static final String SERIALIZED_NAME_RECIPIENT_STATUS = "recipient_status";

  @SerializedName(SERIALIZED_NAME_RECIPIENT_STATUS)
  private EmailRecipientStatus recipientStatus;

  public static final String SERIALIZED_NAME_RECIPIENT_DATE = "recipient_date";

  @SerializedName(SERIALIZED_NAME_RECIPIENT_DATE)
  private OffsetDateTime recipientDate;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";

  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<EmailAttachment> attachments = null;

  public Email() {}

  public Email id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Email unique identifier.
   *
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Email status(EmailStatus status) {

    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @javax.annotation.Nullable
  public EmailStatus getStatus() {
    return status;
  }

  public void setStatus(EmailStatus status) {
    this.status = status;
  }

  public Email sentDate(OffsetDateTime sentDate) {

    this.sentDate = sentDate;
    return this;
  }

  /**
   * Email sent date.
   *
   * @return sentDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSentDate() {
    return sentDate;
  }

  public void setSentDate(OffsetDateTime sentDate) {
    this.sentDate = sentDate;
  }

  public Email errorsCount(Integer errorsCount) {

    this.errorsCount = errorsCount;
    return this;
  }

  /**
   * Errors count.
   *
   * @return errorsCount
   */
  @javax.annotation.Nullable
  public Integer getErrorsCount() {
    return errorsCount;
  }

  public void setErrorsCount(Integer errorsCount) {
    this.errorsCount = errorsCount;
  }

  public Email errorLog(String errorLog) {

    this.errorLog = errorLog;
    return this;
  }

  /**
   * Error log.
   *
   * @return errorLog
   */
  @javax.annotation.Nullable
  public String getErrorLog() {
    return errorLog;
  }

  public void setErrorLog(String errorLog) {
    this.errorLog = errorLog;
  }

  public Email fromEmail(String fromEmail) {

    this.fromEmail = fromEmail;
    return this;
  }

  /**
   * Sender email.
   *
   * @return fromEmail
   */
  @javax.annotation.Nullable
  public String getFromEmail() {
    return fromEmail;
  }

  public void setFromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
  }

  public Email fromName(String fromName) {

    this.fromName = fromName;
    return this;
  }

  /**
   * Sender name.
   *
   * @return fromName
   */
  @javax.annotation.Nullable
  public String getFromName() {
    return fromName;
  }

  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  public Email toEmail(String toEmail) {

    this.toEmail = toEmail;
    return this;
  }

  /**
   * Recipient email.
   *
   * @return toEmail
   */
  @javax.annotation.Nullable
  public String getToEmail() {
    return toEmail;
  }

  public void setToEmail(String toEmail) {
    this.toEmail = toEmail;
  }

  public Email toName(String toName) {

    this.toName = toName;
    return this;
  }

  /**
   * Receipient email.
   *
   * @return toName
   */
  @javax.annotation.Nullable
  public String getToName() {
    return toName;
  }

  public void setToName(String toName) {
    this.toName = toName;
  }

  public Email subject(String subject) {

    this.subject = subject;
    return this;
  }

  /**
   * Email subject.
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

  public Email content(String content) {

    this.content = content;
    return this;
  }

  /**
   * Email content.
   *
   * @return content
   */
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Email copyTo(String copyTo) {

    this.copyTo = copyTo;
    return this;
  }

  /**
   * Get copyTo
   *
   * @return copyTo
   */
  @javax.annotation.Nullable
  public String getCopyTo() {
    return copyTo;
  }

  public void setCopyTo(String copyTo) {
    this.copyTo = copyTo;
  }

  public Email recipientStatus(EmailRecipientStatus recipientStatus) {

    this.recipientStatus = recipientStatus;
    return this;
  }

  /**
   * Get recipientStatus
   *
   * @return recipientStatus
   */
  @javax.annotation.Nullable
  public EmailRecipientStatus getRecipientStatus() {
    return recipientStatus;
  }

  public void setRecipientStatus(EmailRecipientStatus recipientStatus) {
    this.recipientStatus = recipientStatus;
  }

  public Email recipientDate(OffsetDateTime recipientDate) {

    this.recipientDate = recipientDate;
    return this;
  }

  /**
   * Get recipientDate
   *
   * @return recipientDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getRecipientDate() {
    return recipientDate;
  }

  public void setRecipientDate(OffsetDateTime recipientDate) {
    this.recipientDate = recipientDate;
  }

  public Email kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Email kind.
   *
   * @return kind
   */
  @javax.annotation.Nullable
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Email attachments(List<EmailAttachment> attachments) {

    this.attachments = attachments;
    return this;
  }

  public Email addAttachmentsItem(EmailAttachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Email attachments.
   *
   * @return attachments
   */
  @javax.annotation.Nullable
  public List<EmailAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<EmailAttachment> attachments) {
    this.attachments = attachments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Email email = (Email) o;
    return Objects.equals(this.id, email.id)
        && Objects.equals(this.status, email.status)
        && Objects.equals(this.sentDate, email.sentDate)
        && Objects.equals(this.errorsCount, email.errorsCount)
        && Objects.equals(this.errorLog, email.errorLog)
        && Objects.equals(this.fromEmail, email.fromEmail)
        && Objects.equals(this.fromName, email.fromName)
        && Objects.equals(this.toEmail, email.toEmail)
        && Objects.equals(this.toName, email.toName)
        && Objects.equals(this.subject, email.subject)
        && Objects.equals(this.content, email.content)
        && Objects.equals(this.copyTo, email.copyTo)
        && Objects.equals(this.recipientStatus, email.recipientStatus)
        && Objects.equals(this.recipientDate, email.recipientDate)
        && Objects.equals(this.kind, email.kind)
        && Objects.equals(this.attachments, email.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        status,
        sentDate,
        errorsCount,
        errorLog,
        fromEmail,
        fromName,
        toEmail,
        toName,
        subject,
        content,
        copyTo,
        recipientStatus,
        recipientDate,
        kind,
        attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sentDate: ").append(toIndentedString(sentDate)).append("\n");
    sb.append("    errorsCount: ").append(toIndentedString(errorsCount)).append("\n");
    sb.append("    errorLog: ").append(toIndentedString(errorLog)).append("\n");
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
    sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
    sb.append("    toEmail: ").append(toIndentedString(toEmail)).append("\n");
    sb.append("    toName: ").append(toIndentedString(toName)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    copyTo: ").append(toIndentedString(copyTo)).append("\n");
    sb.append("    recipientStatus: ").append(toIndentedString(recipientStatus)).append("\n");
    sb.append("    recipientDate: ").append(toIndentedString(recipientDate)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("sent_date");
    openapiFields.add("errors_count");
    openapiFields.add("error_log");
    openapiFields.add("from_email");
    openapiFields.add("from_name");
    openapiFields.add("to_email");
    openapiFields.add("to_name");
    openapiFields.add("subject");
    openapiFields.add("content");
    openapiFields.add("copy_to");
    openapiFields.add("recipient_status");
    openapiFields.add("recipient_date");
    openapiFields.add("kind");
    openapiFields.add("attachments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to Email
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (!Email.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in Email is not found in the empty JSON string",
                Email.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!Email.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `Email` properties. JSON:"
                    + " %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("error_log") != null && !jsonObj.get("error_log").isJsonNull())
        && !jsonObj.get("error_log").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `error_log` to be a primitive type in the JSON string but got"
                  + " `%s`",
              jsonObj.get("error_log").toString()));
    }
    if ((jsonObj.get("from_email") != null && !jsonObj.get("from_email").isJsonNull())
        && !jsonObj.get("from_email").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `from_email` to be a primitive type in the JSON string but got"
                  + " `%s`",
              jsonObj.get("from_email").toString()));
    }
    if ((jsonObj.get("from_name") != null && !jsonObj.get("from_name").isJsonNull())
        && !jsonObj.get("from_name").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `from_name` to be a primitive type in the JSON string but got"
                  + " `%s`",
              jsonObj.get("from_name").toString()));
    }
    if ((jsonObj.get("to_email") != null && !jsonObj.get("to_email").isJsonNull())
        && !jsonObj.get("to_email").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `to_email` to be a primitive type in the JSON string but got"
                  + " `%s`",
              jsonObj.get("to_email").toString()));
    }
    if ((jsonObj.get("to_name") != null && !jsonObj.get("to_name").isJsonNull())
        && !jsonObj.get("to_name").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `to_name` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("to_name").toString()));
    }
    if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull())
        && !jsonObj.get("subject").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `subject` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("subject").toString()));
    }
    if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull())
        && !jsonObj.get("content").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `content` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("content").toString()));
    }
    if ((jsonObj.get("copy_to") != null && !jsonObj.get("copy_to").isJsonNull())
        && !jsonObj.get("copy_to").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `copy_to` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("copy_to").toString()));
    }
    if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull())
        && !jsonObj.get("kind").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `kind` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("kind").toString()));
    }
    if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
      JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
      if (jsonArrayattachments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("attachments").isJsonArray()) {
          throw new IllegalArgumentException(
              String.format(
                  "Expected the field `attachments` to be an array in the JSON string but got `%s`",
                  jsonObj.get("attachments").toString()));
        }

        // validate the optional field `attachments` (array)
        for (int i = 0; i < jsonArrayattachments.size(); i++) {
          EmailAttachment.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
        }
        ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!Email.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'Email' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<Email> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(Email.class));

      return (TypeAdapter<T>)
          new TypeAdapter<Email>() {
            @Override
            public void write(JsonWriter out, Email value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public Email read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of Email given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Email
   * @throws IOException if the JSON string is invalid with respect to Email
   */
  public static Email fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Email.class);
  }

  /**
   * Convert an instance of Email to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
