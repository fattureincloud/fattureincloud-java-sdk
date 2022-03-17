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
 * City
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-16T10:27:27.647Z[Etc/UTC]")
public class City implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
    @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
    private String postalCode;

    public static final String SERIALIZED_NAME_CITY = "city";
    @SerializedName(SERIALIZED_NAME_CITY)
    private String city;

    public static final String SERIALIZED_NAME_PROVINCE = "province";
    @SerializedName(SERIALIZED_NAME_PROVINCE)
    private String province;

    public City() {
    }

    public City postalCode(String postalCode) {

        this.postalCode = postalCode;
        return this;
    }

    /**
     * City postal code.
     *
     * @return postalCode
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "City postal code.")

    public String getPostalCode() {
        return postalCode;
    }


    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public City city(String city) {

        this.city = city;
        return this;
    }

    /**
     * City name.
     *
     * @return city
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "City name.")

    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public City province(String province) {

        this.province = province;
        return this;
    }

    /**
     * Province.
     *
     * @return province
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Province.")

    public String getProvince() {
        return province;
    }


    public void setProvince(String province) {
        this.province = province;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City city = (City) o;
        return Objects.equals(this.postalCode, city.postalCode) &&
                Objects.equals(this.city, city.city) &&
                Objects.equals(this.province, city.province);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(postalCode, city, province);
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
        sb.append("class City {\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
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

