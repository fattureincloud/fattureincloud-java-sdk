/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.7
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
import java.io.IOException;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * ArchiveDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-06T09:53:36.300Z[GMT]")
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


  public ArchiveDocument id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Archive document unique identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Archive document unique identifier.")

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
   * Archive document date.
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Archive document date.")

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
   * Archive Document description.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Archive Document description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * [Read Only] Absolute url of the attached file. Authomatically set if a valid attachment token is passed via POST /archive or PUT /archive/{documentId}.
   * @return attachmentUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Read Only] Absolute url of the attached file. Authomatically set if a valid attachment token is passed via POST /archive or PUT /archive/{documentId}.")

  public String getAttachmentUrl() {
    return attachmentUrl;
  }




  public ArchiveDocument category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Archive document category.
   * @return category
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Archive document category.")

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
   * [Write Only]  [Required] Attachment token returned by POST /archive/attachment. Used to attach the file already uploaded.
   * @return attachmentToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Write Only]  [Required] Attachment token returned by POST /archive/attachment. Used to attach the file already uploaded.")

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
    return Objects.equals(this.id, archiveDocument.id) &&
        Objects.equals(this.date, archiveDocument.date) &&
        Objects.equals(this.description, archiveDocument.description) &&
        Objects.equals(this.attachmentUrl, archiveDocument.attachmentUrl) &&
        Objects.equals(this.category, archiveDocument.category) &&
        Objects.equals(this.attachmentToken, archiveDocument.attachmentToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, description, attachmentUrl, category, attachmentToken);
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

