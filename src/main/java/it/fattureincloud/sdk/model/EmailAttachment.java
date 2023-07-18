/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.29
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;

/** EmailAttachment */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2023-07-17T10:04:00.151Z[Etc/UTC]")
public class EmailAttachment implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FILENAME = "filename";

  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public EmailAttachment() {}

  public EmailAttachment filename(String filename) {

    this.filename = filename;
    return this;
  }

  /**
   * Email attachment filename
   *
   * @return filename
   */
  @javax.annotation.Nullable
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public EmailAttachment url(String url) {

    this.url = url;
    return this;
  }

  /**
   * Email attachment url
   *
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailAttachment emailAttachment = (EmailAttachment) o;
    return Objects.equals(this.filename, emailAttachment.filename)
        && Objects.equals(this.url, emailAttachment.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAttachment {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
