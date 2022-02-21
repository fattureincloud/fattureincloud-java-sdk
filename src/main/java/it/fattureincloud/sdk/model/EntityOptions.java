/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.12
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
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

/**
 * EntityOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-21T14:15:24.489Z[Etc/UTC]")
public class EntityOptions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ENTITY_SEARCH_FIELDS = "entity_search_fields";
  @SerializedName(SERIALIZED_NAME_ENTITY_SEARCH_FIELDS)
  private String entitySearchFields;

  public static final String SERIALIZED_NAME_ENTITY_AUTOCOMPLETE = "entity_autocomplete";
  @SerializedName(SERIALIZED_NAME_ENTITY_AUTOCOMPLETE)
  private Boolean entityAutocomplete;

  public static final String SERIALIZED_NAME_ENTITY_CREATE = "entity_create";
  @SerializedName(SERIALIZED_NAME_ENTITY_CREATE)
  private Boolean entityCreate;

  public static final String SERIALIZED_NAME_ENTITY_UPDATE = "entity_update";
  @SerializedName(SERIALIZED_NAME_ENTITY_UPDATE)
  private String entityUpdate;


  public EntityOptions entitySearchFields(String entitySearchFields) {
    
    this.entitySearchFields = entitySearchFields;
    return this;
  }

   /**
   * Get entitySearchFields
   * @return entitySearchFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "entity.id,tax_code,vat_number,code", value = "")

  public String getEntitySearchFields() {
    return entitySearchFields;
  }


  public void setEntitySearchFields(String entitySearchFields) {
    this.entitySearchFields = entitySearchFields;
  }


  public EntityOptions entityAutocomplete(Boolean entityAutocomplete) {
    
    this.entityAutocomplete = entityAutocomplete;
    return this;
  }

   /**
   * Get entityAutocomplete
   * @return entityAutocomplete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEntityAutocomplete() {
    return entityAutocomplete;
  }


  public void setEntityAutocomplete(Boolean entityAutocomplete) {
    this.entityAutocomplete = entityAutocomplete;
  }


  public EntityOptions entityCreate(Boolean entityCreate) {
    
    this.entityCreate = entityCreate;
    return this;
  }

   /**
   * Get entityCreate
   * @return entityCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEntityCreate() {
    return entityCreate;
  }


  public void setEntityCreate(Boolean entityCreate) {
    this.entityCreate = entityCreate;
  }


  public EntityOptions entityUpdate(String entityUpdate) {
    
    this.entityUpdate = entityUpdate;
    return this;
  }

   /**
   * Get entityUpdate
   * @return entityUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEntityUpdate() {
    return entityUpdate;
  }


  public void setEntityUpdate(String entityUpdate) {
    this.entityUpdate = entityUpdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityOptions entityOptions = (EntityOptions) o;
    return Objects.equals(this.entitySearchFields, entityOptions.entitySearchFields) &&
        Objects.equals(this.entityAutocomplete, entityOptions.entityAutocomplete) &&
        Objects.equals(this.entityCreate, entityOptions.entityCreate) &&
        Objects.equals(this.entityUpdate, entityOptions.entityUpdate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitySearchFields, entityAutocomplete, entityCreate, entityUpdate);
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
    sb.append("class EntityOptions {\n");
    sb.append("    entitySearchFields: ").append(toIndentedString(entitySearchFields)).append("\n");
    sb.append("    entityAutocomplete: ").append(toIndentedString(entityAutocomplete)).append("\n");
    sb.append("    entityCreate: ").append(toIndentedString(entityCreate)).append("\n");
    sb.append("    entityUpdate: ").append(toIndentedString(entityUpdate)).append("\n");
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

