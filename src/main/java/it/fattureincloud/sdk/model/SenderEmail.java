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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * SenderEmail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-16T10:27:27.647Z[Etc/UTC]")
public class SenderEmail implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;

    public static final String SERIALIZED_NAME_EMAIL = "email";
    @SerializedName(SERIALIZED_NAME_EMAIL)
    private String email;

    public SenderEmail() {
    }

    public SenderEmail id(Integer id) {

        this.id = id;
        return this;
    }

    /**
     * Id
     *
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Id")

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public SenderEmail email(String email) {

        this.email = email;
        return this;
    }

    /**
     * Email address
     *
     * @return email
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Email address")

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SenderEmail senderEmail = (SenderEmail) o;
        return Objects.equals(this.id, senderEmail.id) &&
                Objects.equals(this.email, senderEmail.email);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
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
        sb.append("class SenderEmail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

