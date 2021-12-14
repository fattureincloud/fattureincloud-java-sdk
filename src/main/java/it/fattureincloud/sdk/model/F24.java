/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.7
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
import it.fattureincloud.sdk.model.F24Status;
import it.fattureincloud.sdk.model.PaymentAccount;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

/**
 * F24
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-14T16:12:54.353Z[GMT]")
public class F24 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private LocalDate dueDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private F24Status status;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT = "payment_account";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT)
  private PaymentAccount paymentAccount;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_ATTACHMENT_URL = "attachment_url";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_URL)
  private String attachmentUrl;

  public static final String SERIALIZED_NAME_ATTACHMENT_TOKEN = "attachment_token";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_TOKEN)
  private String attachmentToken;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public F24 id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique F24 identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique F24 identifier.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public F24 dueDate(LocalDate dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Due date.
   * @return dueDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Mon Feb 12 00:00:00 GMT 2018", required = true, value = "Due date.")

  public LocalDate getDueDate() {
    return dueDate;
  }


  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }


  public F24 status(F24Status status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public F24Status getStatus() {
    return status;
  }


  public void setStatus(F24Status status) {
    this.status = status;
  }


  public F24 paymentAccount(PaymentAccount paymentAccount) {
    
    this.paymentAccount = paymentAccount;
    return this;
  }

   /**
   * Get paymentAccount
   * @return paymentAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentAccount getPaymentAccount() {
    return paymentAccount;
  }


  public void setPaymentAccount(PaymentAccount paymentAccount) {
    this.paymentAccount = paymentAccount;
  }


  public F24 amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Taxes amount.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "300", required = true, value = "Taxes amount.")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


   /**
   * [Read Only] Absolute url of the attached file. Authomatically set if a valid attachment token is passed via POST /taxes or PUT /taxes/{documentId}.
   * @return attachmentUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Read Only] Absolute url of the attached file. Authomatically set if a valid attachment token is passed via POST /taxes or PUT /taxes/{documentId}.")

  public String getAttachmentUrl() {
    return attachmentUrl;
  }




  public F24 attachmentToken(String attachmentToken) {
    
    this.attachmentToken = attachmentToken;
    return this;
  }

   /**
   * [Write Only] Attachment token returned by POST /taxes/attachment. Used to attach the file already uploaded.
   * @return attachmentToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Write Only] Attachment token returned by POST /taxes/attachment. Used to attach the file already uploaded.")

  public String getAttachmentToken() {
    return attachmentToken;
  }


  public void setAttachmentToken(String attachmentToken) {
    this.attachmentToken = attachmentToken;
  }


  public F24 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Name or brief description.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name or brief description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    F24 F24 = (F24) o;
    return Objects.equals(this.id, F24.id) &&
        Objects.equals(this.dueDate, F24.dueDate) &&
        Objects.equals(this.status, F24.status) &&
        Objects.equals(this.paymentAccount, F24.paymentAccount) &&
        Objects.equals(this.amount, F24.amount) &&
        Objects.equals(this.attachmentUrl, F24.attachmentUrl) &&
        Objects.equals(this.attachmentToken, F24.attachmentToken) &&
        Objects.equals(this.description, F24.description);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dueDate, status, paymentAccount, amount, attachmentUrl, attachmentToken, description);
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
    sb.append("class F24 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentAccount: ").append(toIndentedString(paymentAccount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    attachmentUrl: ").append(toIndentedString(attachmentUrl)).append("\n");
    sb.append("    attachmentToken: ").append(toIndentedString(attachmentToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
