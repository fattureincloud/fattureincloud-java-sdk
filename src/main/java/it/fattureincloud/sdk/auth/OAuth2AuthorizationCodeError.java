package it.fattureincloud.sdk.auth;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class OAuth2AuthorizationCodeError {
    @SerializedName(value = "error")
    private String error;
    @SerializedName(value = "error_description")
    private String errorDescription;
    @SerializedName(value = "code")
    private Integer code;

    public OAuth2AuthorizationCodeError(String error, String errorDescription, Integer code) {
        this.error = error;
        this.errorDescription = errorDescription;
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OAuth2AuthorizationCodeError that = (OAuth2AuthorizationCodeError) o;
        return Objects.equals(error, that.error) && Objects.equals(errorDescription, that.errorDescription) && Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, errorDescription, code);
    }

    @Override
    public String toString() {
        return "OAuth2AuthorizationCodeError{" +
                "error='" + error + '\'' +
                ", errorDescription='" + errorDescription + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
