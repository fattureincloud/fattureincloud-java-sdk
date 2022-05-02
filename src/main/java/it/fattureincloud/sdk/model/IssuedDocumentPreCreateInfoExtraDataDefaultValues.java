/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.15
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** IssuedDocumentPreCreateInfoExtraDataDefaultValues */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-05-02T14:07:51.629401Z[GMT]")
public class IssuedDocumentPreCreateInfoExtraDataDefaultValues implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TS_COMMUNICATION = "ts_communication";

  @SerializedName(SERIALIZED_NAME_TS_COMMUNICATION)
  private Boolean tsCommunication;

  public static final String SERIALIZED_NAME_TS_TIPO_SPESA = "ts_tipo_spesa";

  @SerializedName(SERIALIZED_NAME_TS_TIPO_SPESA)
  private String tsTipoSpesa;

  public static final String SERIALIZED_NAME_TS_FLAG_TIPO_SPESA = "ts_flag_tipo_spesa";

  @SerializedName(SERIALIZED_NAME_TS_FLAG_TIPO_SPESA)
  private Integer tsFlagTipoSpesa;

  public static final String SERIALIZED_NAME_TS_PAGAMENTO_TRACCIATO = "ts_pagamento_tracciato";

  @SerializedName(SERIALIZED_NAME_TS_PAGAMENTO_TRACCIATO)
  private Boolean tsPagamentoTracciato;

  public IssuedDocumentPreCreateInfoExtraDataDefaultValues() {}

  public IssuedDocumentPreCreateInfoExtraDataDefaultValues tsCommunication(
      Boolean tsCommunication) {

    this.tsCommunication = tsCommunication;
    return this;
  }

  /**
   * Get tsCommunication
   *
   * @return tsCommunication
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getTsCommunication() {
    return tsCommunication;
  }

  public void setTsCommunication(Boolean tsCommunication) {
    this.tsCommunication = tsCommunication;
  }

  public IssuedDocumentPreCreateInfoExtraDataDefaultValues tsTipoSpesa(String tsTipoSpesa) {

    this.tsTipoSpesa = tsTipoSpesa;
    return this;
  }

  /**
   * Get tsTipoSpesa
   *
   * @return tsTipoSpesa
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getTsTipoSpesa() {
    return tsTipoSpesa;
  }

  public void setTsTipoSpesa(String tsTipoSpesa) {
    this.tsTipoSpesa = tsTipoSpesa;
  }

  public IssuedDocumentPreCreateInfoExtraDataDefaultValues tsFlagTipoSpesa(
      Integer tsFlagTipoSpesa) {

    this.tsFlagTipoSpesa = tsFlagTipoSpesa;
    return this;
  }

  /**
   * Get tsFlagTipoSpesa
   *
   * @return tsFlagTipoSpesa
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getTsFlagTipoSpesa() {
    return tsFlagTipoSpesa;
  }

  public void setTsFlagTipoSpesa(Integer tsFlagTipoSpesa) {
    this.tsFlagTipoSpesa = tsFlagTipoSpesa;
  }

  public IssuedDocumentPreCreateInfoExtraDataDefaultValues tsPagamentoTracciato(
      Boolean tsPagamentoTracciato) {

    this.tsPagamentoTracciato = tsPagamentoTracciato;
    return this;
  }

  /**
   * Get tsPagamentoTracciato
   *
   * @return tsPagamentoTracciato
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getTsPagamentoTracciato() {
    return tsPagamentoTracciato;
  }

  public void setTsPagamentoTracciato(Boolean tsPagamentoTracciato) {
    this.tsPagamentoTracciato = tsPagamentoTracciato;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentPreCreateInfoExtraDataDefaultValues
        issuedDocumentPreCreateInfoExtraDataDefaultValues =
            (IssuedDocumentPreCreateInfoExtraDataDefaultValues) o;
    return Objects.equals(
            this.tsCommunication, issuedDocumentPreCreateInfoExtraDataDefaultValues.tsCommunication)
        && Objects.equals(
            this.tsTipoSpesa, issuedDocumentPreCreateInfoExtraDataDefaultValues.tsTipoSpesa)
        && Objects.equals(
            this.tsFlagTipoSpesa, issuedDocumentPreCreateInfoExtraDataDefaultValues.tsFlagTipoSpesa)
        && Objects.equals(
            this.tsPagamentoTracciato,
            issuedDocumentPreCreateInfoExtraDataDefaultValues.tsPagamentoTracciato);
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
    return Objects.hash(tsCommunication, tsTipoSpesa, tsFlagTipoSpesa, tsPagamentoTracciato);
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
    sb.append("class IssuedDocumentPreCreateInfoExtraDataDefaultValues {\n");
    sb.append("    tsCommunication: ").append(toIndentedString(tsCommunication)).append("\n");
    sb.append("    tsTipoSpesa: ").append(toIndentedString(tsTipoSpesa)).append("\n");
    sb.append("    tsFlagTipoSpesa: ").append(toIndentedString(tsFlagTipoSpesa)).append("\n");
    sb.append("    tsPagamentoTracciato: ")
        .append(toIndentedString(tsPagamentoTracciato))
        .append("\n");
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
