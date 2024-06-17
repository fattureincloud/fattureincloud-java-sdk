/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Email */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-06-17T06:54:20.410889Z[Etc/UTC]",
    comments = "Generator version: 7.6.0")
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
  private List<EmailAttachment> attachments;

  public Email() {}

  public Email id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Email id
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
   * Email sent date
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
   * Email errors count
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
   * Email errors log
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
   * Email sender email
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
   * Email sender name
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
   * Email recipient email
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
   * Email receipient name
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

  public Email content(String content) {

    this.content = content;
    return this;
  }

  /**
   * Email content
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
   * Email cc
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
   * Email recipient date
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
   * Email kind
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
   * Email attachments
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

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
}
