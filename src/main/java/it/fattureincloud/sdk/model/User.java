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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.fattureincloud.sdk.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@ApiModel(description = "")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-11-14T07:38:51.580Z[Etc/UTC]")
public class User implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";

  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";

  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";

  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_HASH = "hash";

  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_PICTURE = "picture";

  @SerializedName(SERIALIZED_NAME_PICTURE)
  private String picture;

  public User() {}

  public User id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * User identifier.
   *
   * @return id
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "User identifier.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public User name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Full name of the user.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mario Rossi", value = "Full name of the user.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User firstName(String firstName) {

    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the user.
   *
   * @return firstName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mario", value = "First name of the user.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {

    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the user.
   *
   * @return lastName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Rossi", value = "Last name of the user.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User email(String email) {

    this.email = email;
    return this;
  }

  /**
   * Email of the user.
   *
   * @return email
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mario.rossi@example.com", value = "Email of the user.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User hash(String hash) {

    this.hash = hash;
    return this;
  }

  /**
   * Get hash
   *
   * @return hash
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5add29e1234532a1bf2ed7b612043029", value = "")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public User picture(String picture) {

    this.picture = picture;
    return this;
  }

  /**
   * Picture of the user.
   *
   * @return picture
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "picture.jpg", value = "Picture of the user.")
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id)
        && Objects.equals(this.name, user.name)
        && Objects.equals(this.firstName, user.firstName)
        && Objects.equals(this.lastName, user.lastName)
        && Objects.equals(this.email, user.email)
        && Objects.equals(this.hash, user.hash)
        && Objects.equals(this.picture, user.picture);
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
    return Objects.hash(id, name, firstName, lastName, email, hash, picture);
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
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("email");
    openapiFields.add("hash");
    openapiFields.add("picture");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to User
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (User.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in User is not found in the empty JSON string",
                User.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
    // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
      if (!User.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `User` properties. JSON: %s",
                entry.getKey(), jsonObj.toString()));
      }
    }
    if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
        && !jsonObj.get("name").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `name` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("name").toString()));
    }
    if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull())
        && !jsonObj.get("first_name").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `first_name` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("first_name").toString()));
    }
    if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull())
        && !jsonObj.get("last_name").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `last_name` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("last_name").toString()));
    }
    if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull())
        && !jsonObj.get("email").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `email` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("email").toString()));
    }
    if ((jsonObj.get("hash") != null && !jsonObj.get("hash").isJsonNull())
        && !jsonObj.get("hash").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `hash` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("hash").toString()));
    }
    if ((jsonObj.get("picture") != null && !jsonObj.get("picture").isJsonNull())
        && !jsonObj.get("picture").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `picture` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("picture").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!User.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'User' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<User> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(User.class));

      return (TypeAdapter<T>)
          new TypeAdapter<User>() {
            @Override
            public void write(JsonWriter out, User value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public User read(JsonReader in) throws IOException {
              JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
              validateJsonObject(jsonObj);
              return thisAdapter.fromJsonTree(jsonObj);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of User given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of User
   * @throws IOException if the JSON string is invalid with respect to User
   */
  public static User fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User.class);
  }

  /**
   * Convert an instance of User to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
