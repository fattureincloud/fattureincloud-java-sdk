/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.21
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
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** ArchiveDocument */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-11-14T07:38:51.580Z[Etc/UTC]")
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
   * Archive document unique identifier.
   *
   * @return id
   */
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
   *
   * @return date
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Archive document date.")
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
   *
   * @return description
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Archive Document description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * [Read Only] Absolute url of the attached file. Authomatically set if a valid attachment token
   * is passed via POST /archive or PUT /archive/{documentId}.
   *
   * @return attachmentUrl
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "[Read Only] Absolute url of the attached file. Authomatically set if a valid attachment token is passed via POST /archive or PUT /archive/{documentId}.")
  public String getAttachmentUrl() {
    return attachmentUrl;
  }

  public ArchiveDocument category(String category) {

    this.category = category;
    return this;
  }

  /**
   * Archive document category.
   *
   * @return category
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Archive document category.")
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
   * [Write Only] [Required] Attachment token returned by POST /archive/attachment. Used to attach
   * the file already uploaded.
   *
   * @return attachmentToken
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "[Write Only]  [Required] Attachment token returned by POST /archive/attachment. Used to attach the file already uploaded.")
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

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("date");
    openapiFields.add("description");
    openapiFields.add("attachment_url");
    openapiFields.add("category");
    openapiFields.add("attachment_token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to ArchiveDocument
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (ArchiveDocument.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ArchiveDocument is not found in the empty JSON string",
                ArchiveDocument.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!ArchiveDocument.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ArchiveDocument` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
        && !jsonObj.get("description").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `description` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("description").toString()));
    }
    if ((jsonObj.get("attachment_url") != null && !jsonObj.get("attachment_url").isJsonNull())
        && !jsonObj.get("attachment_url").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `attachment_url` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("attachment_url").toString()));
    }
    if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull())
        && !jsonObj.get("category").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `category` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("category").toString()));
    }
    if ((jsonObj.get("attachment_token") != null && !jsonObj.get("attachment_token").isJsonNull())
        && !jsonObj.get("attachment_token").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `attachment_token` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("attachment_token").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ArchiveDocument.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ArchiveDocument' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ArchiveDocument> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ArchiveDocument.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ArchiveDocument>() {
            @Override
            public void write(JsonWriter out, ArchiveDocument value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ArchiveDocument read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ArchiveDocument given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ArchiveDocument
   * @throws IOException if the JSON string is invalid with respect to ArchiveDocument
   */
  public static ArchiveDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArchiveDocument.class);
  }

  /**
   * Convert an instance of ArchiveDocument to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
