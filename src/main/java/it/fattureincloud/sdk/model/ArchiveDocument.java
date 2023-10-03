/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.30
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ArchiveDocument */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-10-03T08:26:02.123402Z[Etc/UTC]")
public class ArchiveDocument implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DATE = "date";

  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ATTACHMENT_URL = "attachment_url";

  @SerializedName(SERIALIZED_NAME_ATTACHMENT_URL)
  private String attachmentUrl;

  public static final String SERIALIZED_NAME_CATEGORY = "category";

  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_ATTACHMENT_TOKEN = "attachment_token";

  @SerializedName(SERIALIZED_NAME_ATTACHMENT_TOKEN)
  private String attachmentToken;

  public ArchiveDocument() {}

  public ArchiveDocument(String attachmentUrl) {
    this();
    this.attachmentUrl = attachmentUrl;
  }

  public ArchiveDocument id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Archive document id
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

  public ArchiveDocument date(LocalDate date) {

    this.date = date;
    return this;
  }

  /**
   * Archive document date
   *
   * @return date
   */
  @javax.annotation.Nullable
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ArchiveDocument description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Archive Document description
   *
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * [Temporary] [Read Only] Archive Document url of the attached file
   *
   * @return attachmentUrl
   */
  @javax.annotation.Nullable
  public String getAttachmentUrl() {
    return attachmentUrl;
  }

  public ArchiveDocument category(String category) {

    this.category = category;
    return this;
  }

  /**
   * Archive document category
   *
   * @return category
   */
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ArchiveDocument attachmentToken(String attachmentToken) {

    this.attachmentToken = attachmentToken;
    return this;
  }

  /**
   * [Write Only] [Required] Archive document attachment token returned by POST /archive/attachment
   *
   * @return attachmentToken
   */
  @javax.annotation.Nullable
  public String getAttachmentToken() {
    return attachmentToken;
  }

  public void setAttachmentToken(String attachmentToken) {
    this.attachmentToken = attachmentToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchiveDocument archiveDocument = (ArchiveDocument) o;
    return Objects.equals(this.id, archiveDocument.id)
        && Objects.equals(this.date, archiveDocument.date)
        && Objects.equals(this.description, archiveDocument.description)
        && Objects.equals(this.attachmentUrl, archiveDocument.attachmentUrl)
        && Objects.equals(this.category, archiveDocument.category)
        && Objects.equals(this.attachmentToken, archiveDocument.attachmentToken);
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
    return Objects.hash(id, date, description, attachmentUrl, category, attachmentToken);
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
    sb.append("class ArchiveDocument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    attachmentUrl: ").append(toIndentedString(attachmentUrl)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    attachmentToken: ").append(toIndentedString(attachmentToken)).append("\n");
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
