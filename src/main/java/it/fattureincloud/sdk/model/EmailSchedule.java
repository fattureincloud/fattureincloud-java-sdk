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
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** EmailSchedule */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-02-06T15:44:01.481Z[Etc/UTC]")
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

  public EmailSchedule() {}

  public EmailSchedule senderId(Integer senderId) {

    this.senderId = senderId;
    return this;
  }

  /**
   * Sender id. Required if &#x60;sender_email&#x60; is not specified
   *
   * @return senderId
   */
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
   *
   * @return senderEmail
   */
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
   *
   * @return recipientEmail
   */
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
   *
   * @return subject
   */
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
   *
   * @return body
   */
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
   *
   * @return include
   */
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
   *
   * @return attachPdf
   */
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
   * If set to true, a copy of the email will be sent to the &#x60;cc_email&#x60; specified by
   * &#x60;Get email data&#x60;
   *
   * @return sendCopy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If set to true, a copy of the email will be sent to the `cc_email` specified by `Get email data`")
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
    return Objects.equals(this.senderId, emailSchedule.senderId)
        && Objects.equals(this.senderEmail, emailSchedule.senderEmail)
        && Objects.equals(this.recipientEmail, emailSchedule.recipientEmail)
        && Objects.equals(this.subject, emailSchedule.subject)
        && Objects.equals(this.body, emailSchedule.body)
        && Objects.equals(this.include, emailSchedule.include)
        && Objects.equals(this.attachPdf, emailSchedule.attachPdf)
        && Objects.equals(this.sendCopy, emailSchedule.sendCopy);
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
        senderId, senderEmail, recipientEmail, subject, body, include, attachPdf, sendCopy);
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
    openapiFields.add("sender_id");
    openapiFields.add("sender_email");
    openapiFields.add("recipient_email");
    openapiFields.add("subject");
    openapiFields.add("body");
    openapiFields.add("include");
    openapiFields.add("attach_pdf");
    openapiFields.add("send_copy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to EmailSchedule
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (EmailSchedule.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in EmailSchedule is not found in the empty JSON string",
                EmailSchedule.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!EmailSchedule.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `EmailSchedule` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("sender_email") != null && !jsonObj.get("sender_email").isJsonNull())
        && !jsonObj.get("sender_email").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `sender_email` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("sender_email").toString()));
    }
    if ((jsonObj.get("recipient_email") != null && !jsonObj.get("recipient_email").isJsonNull())
        && !jsonObj.get("recipient_email").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `recipient_email` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("recipient_email").toString()));
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
    // validate the optional field `include`
    if ((jsonObj.get("include") != null && !jsonObj.get("include").isJsonNull())
        && !jsonObj.get("include").isJsonPrimitive()) {
      EmailScheduleInclude.validateJsonObject(jsonObj.getAsJsonObject("include"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!EmailSchedule.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'EmailSchedule' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<EmailSchedule> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(EmailSchedule.class));

      return (TypeAdapter<T>)
          new TypeAdapter<EmailSchedule>() {
            @Override
            public void write(JsonWriter out, EmailSchedule value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public EmailSchedule read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of EmailSchedule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmailSchedule
   * @throws IOException if the JSON string is invalid with respect to EmailSchedule
   */
  public static EmailSchedule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailSchedule.class);
  }

  /**
   * Convert an instance of EmailSchedule to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
