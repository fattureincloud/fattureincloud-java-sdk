/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.14
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.fattureincloud.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.fattureincloud.sdk.model.EmailScheduleInclude;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

/**
 * EmailSchedule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-31T13:16:33.658Z[GMT]")
public class EmailSchedule implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SENDER_ID = "sender_id";
  @SerializedName(SERIALIZED_NAME_SENDER_ID)
  private Integer senderId;

  public static final String SERIALIZED_NAME_SENDER_EMAIL = "sender_email";
  @SerializedName(SERIALIZED_NAME_SENDER_EMAIL)
  private String senderEmail;

  public static final String SERIALIZED_NAME_RECIPIENT_EMAIL = "recipient_email";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_EMAIL)
  private String recipientEmail;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_INCLUDE = "include";
  @SerializedName(SERIALIZED_NAME_INCLUDE)
  private EmailScheduleInclude include;

  public static final String SERIALIZED_NAME_ATTACH_PDF = "attach_pdf";
  @SerializedName(SERIALIZED_NAME_ATTACH_PDF)
  private Boolean attachPdf;

  public static final String SERIALIZED_NAME_SEND_COPY = "send_copy";
  @SerializedName(SERIALIZED_NAME_SEND_COPY)
  private Boolean sendCopy;

  public EmailSchedule() { 
  }

  public EmailSchedule senderId(Integer senderId) {
    
    this.senderId = senderId;
    return this;
  }

   /**
   * Sender id. Required if &#x60;sender_email&#x60; is not specified
   * @return senderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sender id. Required if `sender_email` is not specified")

  public Integer getSenderId() {
    return senderId;
  }


  public void setSenderId(Integer senderId) {
    this.senderId = senderId;
  }


  public EmailSchedule senderEmail(String senderEmail) {
    
    this.senderEmail = senderEmail;
    return this;
  }

   /**
   * Sender email. Required if &#x60;sender_id&#x60; is not specified
   * @return senderEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sender email. Required if `sender_id` is not specified")

  public String getSenderEmail() {
    return senderEmail;
  }


  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }


  public EmailSchedule recipientEmail(String recipientEmail) {
    
    this.recipientEmail = recipientEmail;
    return this;
  }

   /**
   * One or more comma separated recipient emails
   * @return recipientEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One or more comma separated recipient emails")

  public String getRecipientEmail() {
    return recipientEmail;
  }


  public void setRecipientEmail(String recipientEmail) {
    this.recipientEmail = recipientEmail;
  }


  public EmailSchedule subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Email subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email subject")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public EmailSchedule body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Email body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email body")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public EmailSchedule include(EmailScheduleInclude include) {
    
    this.include = include;
    return this;
  }

   /**
   * Get include
   * @return include
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmailScheduleInclude getInclude() {
    return include;
  }


  public void setInclude(EmailScheduleInclude include) {
    this.include = include;
  }


  public EmailSchedule attachPdf(Boolean attachPdf) {
    
    this.attachPdf = attachPdf;
    return this;
  }

   /**
   * If set to true, documents will be sent as PDF attachments too
   * @return attachPdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to true, documents will be sent as PDF attachments too")

  public Boolean getAttachPdf() {
    return attachPdf;
  }


  public void setAttachPdf(Boolean attachPdf) {
    this.attachPdf = attachPdf;
  }


  public EmailSchedule sendCopy(Boolean sendCopy) {
    
    this.sendCopy = sendCopy;
    return this;
  }

   /**
   * If set to true, a copy of the email will be sent to the &#x60;cc_email&#x60; specified by &#x60;Get email data&#x60;
   * @return sendCopy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to true, a copy of the email will be sent to the `cc_email` specified by `Get email data`")

  public Boolean getSendCopy() {
    return sendCopy;
  }


  public void setSendCopy(Boolean sendCopy) {
    this.sendCopy = sendCopy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailSchedule emailSchedule = (EmailSchedule) o;
    return Objects.equals(this.senderId, emailSchedule.senderId) &&
        Objects.equals(this.senderEmail, emailSchedule.senderEmail) &&
        Objects.equals(this.recipientEmail, emailSchedule.recipientEmail) &&
        Objects.equals(this.subject, emailSchedule.subject) &&
        Objects.equals(this.body, emailSchedule.body) &&
        Objects.equals(this.include, emailSchedule.include) &&
        Objects.equals(this.attachPdf, emailSchedule.attachPdf) &&
        Objects.equals(this.sendCopy, emailSchedule.sendCopy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(senderId, senderEmail, recipientEmail, subject, body, include, attachPdf, sendCopy);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSchedule {\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    recipientEmail: ").append(toIndentedString(recipientEmail)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    attachPdf: ").append(toIndentedString(attachPdf)).append("\n");
    sb.append("    sendCopy: ").append(toIndentedString(sendCopy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

