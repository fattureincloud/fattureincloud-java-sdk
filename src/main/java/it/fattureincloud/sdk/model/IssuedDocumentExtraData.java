/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Issued document extra data [TS fields follow the technical specifications provided by
 * \&quot;Sistema Tessera Sanitaria\&quot;]
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-06-17T06:54:20.410889Z[Etc/UTC]",
    comments = "Generator version: 7.6.0")
public class IssuedDocumentExtraData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MULTIFATTURE_SENT = "multifatture_sent";

  @SerializedName(SERIALIZED_NAME_MULTIFATTURE_SENT)
  private Integer multifattureSent;

  public static final String SERIALIZED_NAME_TS_COMMUNICATION = "ts_communication";

  @SerializedName(SERIALIZED_NAME_TS_COMMUNICATION)
  private Boolean tsCommunication;

  public static final String SERIALIZED_NAME_TS_FLAG_TIPO_SPESA = "ts_flag_tipo_spesa";

  @SerializedName(SERIALIZED_NAME_TS_FLAG_TIPO_SPESA)
  private BigDecimal tsFlagTipoSpesa;

  public static final String SERIALIZED_NAME_TS_PAGAMENTO_TRACCIATO = "ts_pagamento_tracciato";

  @SerializedName(SERIALIZED_NAME_TS_PAGAMENTO_TRACCIATO)
  private Boolean tsPagamentoTracciato;

  public static final String SERIALIZED_NAME_TS_TIPO_SPESA = "ts_tipo_spesa";

  @SerializedName(SERIALIZED_NAME_TS_TIPO_SPESA)
  private String tsTipoSpesa;

  public static final String SERIALIZED_NAME_TS_OPPOSIZIONE = "ts_opposizione";

  @SerializedName(SERIALIZED_NAME_TS_OPPOSIZIONE)
  private Boolean tsOpposizione;

  public static final String SERIALIZED_NAME_TS_STATUS = "ts_status";

  @SerializedName(SERIALIZED_NAME_TS_STATUS)
  private Integer tsStatus;

  public static final String SERIALIZED_NAME_TS_FILE_ID = "ts_file_id";

  @SerializedName(SERIALIZED_NAME_TS_FILE_ID)
  private String tsFileId;

  public static final String SERIALIZED_NAME_TS_SENT_DATE = "ts_sent_date";

  @SerializedName(SERIALIZED_NAME_TS_SENT_DATE)
  private LocalDate tsSentDate;

  public static final String SERIALIZED_NAME_TS_FULL_AMOUNT = "ts_full_amount";

  @SerializedName(SERIALIZED_NAME_TS_FULL_AMOUNT)
  private Boolean tsFullAmount;

  public static final String SERIALIZED_NAME_IMPORTED_BY = "imported_by";

  @SerializedName(SERIALIZED_NAME_IMPORTED_BY)
  private String importedBy;

  public IssuedDocumentExtraData() {}

  public IssuedDocumentExtraData multifattureSent(Integer multifattureSent) {

    this.multifattureSent = multifattureSent;
    return this;
  }

  /**
   * Get multifattureSent
   *
   * @return multifattureSent
   */
  @javax.annotation.Nullable
  public Integer getMultifattureSent() {
    return multifattureSent;
  }

  public void setMultifattureSent(Integer multifattureSent) {
    this.multifattureSent = multifattureSent;
  }

  public IssuedDocumentExtraData tsCommunication(Boolean tsCommunication) {

    this.tsCommunication = tsCommunication;
    return this;
  }

  /**
   * Send issued document to \&quot;Sistema Tessera Sanitaria\&quot;
   *
   * @return tsCommunication
   */
  @javax.annotation.Nullable
  public Boolean getTsCommunication() {
    return tsCommunication;
  }

  public void setTsCommunication(Boolean tsCommunication) {
    this.tsCommunication = tsCommunication;
  }

  public IssuedDocumentExtraData tsFlagTipoSpesa(BigDecimal tsFlagTipoSpesa) {

    this.tsFlagTipoSpesa = tsFlagTipoSpesa;
    return this;
  }

  /**
   * Issued document ts \&quot;tipo spesa\&quot; [TK, FC, FV, SV,SP, AD, AS, ECG, SR]
   *
   * @return tsFlagTipoSpesa
   */
  @javax.annotation.Nullable
  public BigDecimal getTsFlagTipoSpesa() {
    return tsFlagTipoSpesa;
  }

  public void setTsFlagTipoSpesa(BigDecimal tsFlagTipoSpesa) {
    this.tsFlagTipoSpesa = tsFlagTipoSpesa;
  }

  public IssuedDocumentExtraData tsPagamentoTracciato(Boolean tsPagamentoTracciato) {

    this.tsPagamentoTracciato = tsPagamentoTracciato;
    return this;
  }

  /**
   * Issued document ts traced payment
   *
   * @return tsPagamentoTracciato
   */
  @javax.annotation.Nullable
  public Boolean getTsPagamentoTracciato() {
    return tsPagamentoTracciato;
  }

  public void setTsPagamentoTracciato(Boolean tsPagamentoTracciato) {
    this.tsPagamentoTracciato = tsPagamentoTracciato;
  }

  public IssuedDocumentExtraData tsTipoSpesa(String tsTipoSpesa) {

    this.tsTipoSpesa = tsTipoSpesa;
    return this;
  }

  /**
   * Can be [ &#39;TK&#39;, &#39;FC&#39;, &#39;FV&#39;, &#39;SV&#39;, &#39;SP&#39;, &#39;AD&#39;,
   * &#39;AS&#39;, &#39;SR&#39;, &#39;CT&#39;, &#39;PI&#39;, &#39;IC&#39;, &#39;AA&#39; ]. Refer to
   * the technical specifications to learn more.
   *
   * @return tsTipoSpesa
   */
  @javax.annotation.Nullable
  public String getTsTipoSpesa() {
    return tsTipoSpesa;
  }

  public void setTsTipoSpesa(String tsTipoSpesa) {
    this.tsTipoSpesa = tsTipoSpesa;
  }

  public IssuedDocumentExtraData tsOpposizione(Boolean tsOpposizione) {

    this.tsOpposizione = tsOpposizione;
    return this;
  }

  /**
   * Issued document ts \&quot;opposizione\&quot;
   *
   * @return tsOpposizione
   */
  @javax.annotation.Nullable
  public Boolean getTsOpposizione() {
    return tsOpposizione;
  }

  public void setTsOpposizione(Boolean tsOpposizione) {
    this.tsOpposizione = tsOpposizione;
  }

  public IssuedDocumentExtraData tsStatus(Integer tsStatus) {

    this.tsStatus = tsStatus;
    return this;
  }

  /**
   * Issued document ts status
   *
   * @return tsStatus
   */
  @javax.annotation.Nullable
  public Integer getTsStatus() {
    return tsStatus;
  }

  public void setTsStatus(Integer tsStatus) {
    this.tsStatus = tsStatus;
  }

  public IssuedDocumentExtraData tsFileId(String tsFileId) {

    this.tsFileId = tsFileId;
    return this;
  }

  /**
   * Issued document ts file id
   *
   * @return tsFileId
   */
  @javax.annotation.Nullable
  public String getTsFileId() {
    return tsFileId;
  }

  public void setTsFileId(String tsFileId) {
    this.tsFileId = tsFileId;
  }

  public IssuedDocumentExtraData tsSentDate(LocalDate tsSentDate) {

    this.tsSentDate = tsSentDate;
    return this;
  }

  /**
   * Issued document ts sent date
   *
   * @return tsSentDate
   */
  @javax.annotation.Nullable
  public LocalDate getTsSentDate() {
    return tsSentDate;
  }

  public void setTsSentDate(LocalDate tsSentDate) {
    this.tsSentDate = tsSentDate;
  }

  public IssuedDocumentExtraData tsFullAmount(Boolean tsFullAmount) {

    this.tsFullAmount = tsFullAmount;
    return this;
  }

  /**
   * Issued document ts total amount
   *
   * @return tsFullAmount
   */
  @javax.annotation.Nullable
  public Boolean getTsFullAmount() {
    return tsFullAmount;
  }

  public void setTsFullAmount(Boolean tsFullAmount) {
    this.tsFullAmount = tsFullAmount;
  }

  public IssuedDocumentExtraData importedBy(String importedBy) {

    this.importedBy = importedBy;
    return this;
  }

  /**
   * Issued document imported by software
   *
   * @return importedBy
   */
  @javax.annotation.Nullable
  public String getImportedBy() {
    return importedBy;
  }

  public void setImportedBy(String importedBy) {
    this.importedBy = importedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentExtraData issuedDocumentExtraData = (IssuedDocumentExtraData) o;
    return Objects.equals(this.multifattureSent, issuedDocumentExtraData.multifattureSent)
        && Objects.equals(this.tsCommunication, issuedDocumentExtraData.tsCommunication)
        && Objects.equals(this.tsFlagTipoSpesa, issuedDocumentExtraData.tsFlagTipoSpesa)
        && Objects.equals(this.tsPagamentoTracciato, issuedDocumentExtraData.tsPagamentoTracciato)
        && Objects.equals(this.tsTipoSpesa, issuedDocumentExtraData.tsTipoSpesa)
        && Objects.equals(this.tsOpposizione, issuedDocumentExtraData.tsOpposizione)
        && Objects.equals(this.tsStatus, issuedDocumentExtraData.tsStatus)
        && Objects.equals(this.tsFileId, issuedDocumentExtraData.tsFileId)
        && Objects.equals(this.tsSentDate, issuedDocumentExtraData.tsSentDate)
        && Objects.equals(this.tsFullAmount, issuedDocumentExtraData.tsFullAmount)
        && Objects.equals(this.importedBy, issuedDocumentExtraData.importedBy);
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
    return Objects.hash(
        multifattureSent,
        tsCommunication,
        tsFlagTipoSpesa,
        tsPagamentoTracciato,
        tsTipoSpesa,
        tsOpposizione,
        tsStatus,
        tsFileId,
        tsSentDate,
        tsFullAmount,
        importedBy);
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
    sb.append("class IssuedDocumentExtraData {\n");
    sb.append("    multifattureSent: ").append(toIndentedString(multifattureSent)).append("\n");
    sb.append("    tsCommunication: ").append(toIndentedString(tsCommunication)).append("\n");
    sb.append("    tsFlagTipoSpesa: ").append(toIndentedString(tsFlagTipoSpesa)).append("\n");
    sb.append("    tsPagamentoTracciato: ")
        .append(toIndentedString(tsPagamentoTracciato))
        .append("\n");
    sb.append("    tsTipoSpesa: ").append(toIndentedString(tsTipoSpesa)).append("\n");
    sb.append("    tsOpposizione: ").append(toIndentedString(tsOpposizione)).append("\n");
    sb.append("    tsStatus: ").append(toIndentedString(tsStatus)).append("\n");
    sb.append("    tsFileId: ").append(toIndentedString(tsFileId)).append("\n");
    sb.append("    tsSentDate: ").append(toIndentedString(tsSentDate)).append("\n");
    sb.append("    tsFullAmount: ").append(toIndentedString(tsFullAmount)).append("\n");
    sb.append("    importedBy: ").append(toIndentedString(importedBy)).append("\n");
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
