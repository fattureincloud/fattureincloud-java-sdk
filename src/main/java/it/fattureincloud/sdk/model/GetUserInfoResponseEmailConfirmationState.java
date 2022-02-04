/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.10
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
import java.io.Serializable;

/**
 * GetUserInfoResponseEmailConfirmationState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T08:45:03.999Z[Etc/UTC]")
public class GetUserInfoResponseEmailConfirmationState implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NEED_CONFIRMATION = "need_confirmation";
  @SerializedName(SERIALIZED_NAME_NEED_CONFIRMATION)
  private Boolean needConfirmation;


  public GetUserInfoResponseEmailConfirmationState needConfirmation(Boolean needConfirmation) {
    
    this.needConfirmation = needConfirmation;
    return this;
  }

   /**
   * Get needConfirmation
   * @return needConfirmation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNeedConfirmation() {
    return needConfirmation;
  }


  public void setNeedConfirmation(Boolean needConfirmation) {
    this.needConfirmation = needConfirmation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserInfoResponseEmailConfirmationState getUserInfoResponseEmailConfirmationState = (GetUserInfoResponseEmailConfirmationState) o;
    return Objects.equals(this.needConfirmation, getUserInfoResponseEmailConfirmationState.needConfirmation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(needConfirmation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserInfoResponseEmailConfirmationState {\n");
    sb.append("    needConfirmation: ").append(toIndentedString(needConfirmation)).append("\n");
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

