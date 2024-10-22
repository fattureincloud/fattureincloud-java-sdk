/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.2
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-10-22T15:13:22.680184Z[Etc/UTC]",
    comments = "Generator version: 7.9.0")
public class Permissions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FIC_SITUATION = "fic_situation";

  @SerializedName(SERIALIZED_NAME_FIC_SITUATION)
  private PermissionLevel ficSituation;

  public static final String SERIALIZED_NAME_FIC_CLIENTS = "fic_clients";

  @SerializedName(SERIALIZED_NAME_FIC_CLIENTS)
  private PermissionLevel ficClients;

  public static final String SERIALIZED_NAME_FIC_SUPPLIERS = "fic_suppliers";

  @SerializedName(SERIALIZED_NAME_FIC_SUPPLIERS)
  private PermissionLevel ficSuppliers;

  public static final String SERIALIZED_NAME_FIC_PRODUCTS = "fic_products";

  @SerializedName(SERIALIZED_NAME_FIC_PRODUCTS)
  private PermissionLevel ficProducts;

  public static final String SERIALIZED_NAME_FIC_ISSUED_DOCUMENTS = "fic_issued_documents";

  @SerializedName(SERIALIZED_NAME_FIC_ISSUED_DOCUMENTS)
  private PermissionLevel ficIssuedDocuments;

  public static final String SERIALIZED_NAME_FIC_RECEIVED_DOCUMENTS = "fic_received_documents";

  @SerializedName(SERIALIZED_NAME_FIC_RECEIVED_DOCUMENTS)
  private PermissionLevel ficReceivedDocuments;

  public static final String SERIALIZED_NAME_FIC_RECEIPTS = "fic_receipts";

  @SerializedName(SERIALIZED_NAME_FIC_RECEIPTS)
  private PermissionLevel ficReceipts;

  public static final String SERIALIZED_NAME_FIC_CALENDAR = "fic_calendar";

  @SerializedName(SERIALIZED_NAME_FIC_CALENDAR)
  private PermissionLevel ficCalendar;

  public static final String SERIALIZED_NAME_FIC_ARCHIVE = "fic_archive";

  @SerializedName(SERIALIZED_NAME_FIC_ARCHIVE)
  private PermissionLevel ficArchive;

  public static final String SERIALIZED_NAME_FIC_TAXES = "fic_taxes";

  @SerializedName(SERIALIZED_NAME_FIC_TAXES)
  private PermissionLevel ficTaxes;

  public static final String SERIALIZED_NAME_FIC_STOCK = "fic_stock";

  @SerializedName(SERIALIZED_NAME_FIC_STOCK)
  private PermissionLevel ficStock;

  public static final String SERIALIZED_NAME_FIC_CASHBOOK = "fic_cashbook";

  @SerializedName(SERIALIZED_NAME_FIC_CASHBOOK)
  private PermissionLevel ficCashbook;

  public static final String SERIALIZED_NAME_FIC_SETTINGS = "fic_settings";

  @SerializedName(SERIALIZED_NAME_FIC_SETTINGS)
  private PermissionLevel ficSettings;

  public static final String SERIALIZED_NAME_FIC_EMAILS = "fic_emails";

  @SerializedName(SERIALIZED_NAME_FIC_EMAILS)
  private PermissionLevel ficEmails;

  public static final String SERIALIZED_NAME_FIC_EXPORT = "fic_export";

  @SerializedName(SERIALIZED_NAME_FIC_EXPORT)
  private PermissionLevel ficExport;

  public static final String SERIALIZED_NAME_FIC_IMPORT_BANKSTATEMENTS =
      "fic_import_bankstatements";

  @SerializedName(SERIALIZED_NAME_FIC_IMPORT_BANKSTATEMENTS)
  private PermissionLevel ficImportBankstatements;

  public static final String SERIALIZED_NAME_FIC_IMPORT_CLIENTS_SUPPLIERS =
      "fic_import_clients_suppliers";

  @SerializedName(SERIALIZED_NAME_FIC_IMPORT_CLIENTS_SUPPLIERS)
  private PermissionLevel ficImportClientsSuppliers;

  public static final String SERIALIZED_NAME_FIC_IMPORT_ISSUED_DOCUMENTS =
      "fic_import_issued_documents";

  @SerializedName(SERIALIZED_NAME_FIC_IMPORT_ISSUED_DOCUMENTS)
  private PermissionLevel ficImportIssuedDocuments;

  public static final String SERIALIZED_NAME_FIC_IMPORT_PRODUCTS = "fic_import_products";

  @SerializedName(SERIALIZED_NAME_FIC_IMPORT_PRODUCTS)
  private PermissionLevel ficImportProducts;

  public static final String SERIALIZED_NAME_FIC_RECURRING = "fic_recurring";

  @SerializedName(SERIALIZED_NAME_FIC_RECURRING)
  private PermissionLevel ficRecurring;

  public static final String SERIALIZED_NAME_FIC_RIBA = "fic_riba";

  @SerializedName(SERIALIZED_NAME_FIC_RIBA)
  private PermissionLevel ficRiba;

  public static final String SERIALIZED_NAME_DIC_EMPLOYEES = "dic_employees";

  @SerializedName(SERIALIZED_NAME_DIC_EMPLOYEES)
  private PermissionLevel dicEmployees;

  public static final String SERIALIZED_NAME_DIC_SETTINGS = "dic_settings";

  @SerializedName(SERIALIZED_NAME_DIC_SETTINGS)
  private PermissionLevel dicSettings;

  public static final String SERIALIZED_NAME_DIC_TIMESHEET = "dic_timesheet";

  @SerializedName(SERIALIZED_NAME_DIC_TIMESHEET)
  private PermissionLevel dicTimesheet;

  public static final String SERIALIZED_NAME_FIC_ISSUED_DOCUMENTS_DETAILED =
      "fic_issued_documents_detailed";

  @SerializedName(SERIALIZED_NAME_FIC_ISSUED_DOCUMENTS_DETAILED)
  private PermissionsFicIssuedDocumentsDetailed ficIssuedDocumentsDetailed;

  public Permissions() {}

  public Permissions ficSituation(PermissionLevel ficSituation) {

    this.ficSituation = ficSituation;
    return this;
  }

  /**
   * Get ficSituation
   *
   * @return ficSituation
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicSituation() {
    return ficSituation;
  }

  public void setFicSituation(PermissionLevel ficSituation) {
    this.ficSituation = ficSituation;
  }

  public Permissions ficClients(PermissionLevel ficClients) {

    this.ficClients = ficClients;
    return this;
  }

  /**
   * Get ficClients
   *
   * @return ficClients
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicClients() {
    return ficClients;
  }

  public void setFicClients(PermissionLevel ficClients) {
    this.ficClients = ficClients;
  }

  public Permissions ficSuppliers(PermissionLevel ficSuppliers) {

    this.ficSuppliers = ficSuppliers;
    return this;
  }

  /**
   * Get ficSuppliers
   *
   * @return ficSuppliers
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicSuppliers() {
    return ficSuppliers;
  }

  public void setFicSuppliers(PermissionLevel ficSuppliers) {
    this.ficSuppliers = ficSuppliers;
  }

  public Permissions ficProducts(PermissionLevel ficProducts) {

    this.ficProducts = ficProducts;
    return this;
  }

  /**
   * Get ficProducts
   *
   * @return ficProducts
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicProducts() {
    return ficProducts;
  }

  public void setFicProducts(PermissionLevel ficProducts) {
    this.ficProducts = ficProducts;
  }

  public Permissions ficIssuedDocuments(PermissionLevel ficIssuedDocuments) {

    this.ficIssuedDocuments = ficIssuedDocuments;
    return this;
  }

  /**
   * Get ficIssuedDocuments
   *
   * @return ficIssuedDocuments
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicIssuedDocuments() {
    return ficIssuedDocuments;
  }

  public void setFicIssuedDocuments(PermissionLevel ficIssuedDocuments) {
    this.ficIssuedDocuments = ficIssuedDocuments;
  }

  public Permissions ficReceivedDocuments(PermissionLevel ficReceivedDocuments) {

    this.ficReceivedDocuments = ficReceivedDocuments;
    return this;
  }

  /**
   * Get ficReceivedDocuments
   *
   * @return ficReceivedDocuments
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicReceivedDocuments() {
    return ficReceivedDocuments;
  }

  public void setFicReceivedDocuments(PermissionLevel ficReceivedDocuments) {
    this.ficReceivedDocuments = ficReceivedDocuments;
  }

  public Permissions ficReceipts(PermissionLevel ficReceipts) {

    this.ficReceipts = ficReceipts;
    return this;
  }

  /**
   * Get ficReceipts
   *
   * @return ficReceipts
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicReceipts() {
    return ficReceipts;
  }

  public void setFicReceipts(PermissionLevel ficReceipts) {
    this.ficReceipts = ficReceipts;
  }

  public Permissions ficCalendar(PermissionLevel ficCalendar) {

    this.ficCalendar = ficCalendar;
    return this;
  }

  /**
   * Get ficCalendar
   *
   * @return ficCalendar
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicCalendar() {
    return ficCalendar;
  }

  public void setFicCalendar(PermissionLevel ficCalendar) {
    this.ficCalendar = ficCalendar;
  }

  public Permissions ficArchive(PermissionLevel ficArchive) {

    this.ficArchive = ficArchive;
    return this;
  }

  /**
   * Get ficArchive
   *
   * @return ficArchive
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicArchive() {
    return ficArchive;
  }

  public void setFicArchive(PermissionLevel ficArchive) {
    this.ficArchive = ficArchive;
  }

  public Permissions ficTaxes(PermissionLevel ficTaxes) {

    this.ficTaxes = ficTaxes;
    return this;
  }

  /**
   * Get ficTaxes
   *
   * @return ficTaxes
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicTaxes() {
    return ficTaxes;
  }

  public void setFicTaxes(PermissionLevel ficTaxes) {
    this.ficTaxes = ficTaxes;
  }

  public Permissions ficStock(PermissionLevel ficStock) {

    this.ficStock = ficStock;
    return this;
  }

  /**
   * Get ficStock
   *
   * @return ficStock
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicStock() {
    return ficStock;
  }

  public void setFicStock(PermissionLevel ficStock) {
    this.ficStock = ficStock;
  }

  public Permissions ficCashbook(PermissionLevel ficCashbook) {

    this.ficCashbook = ficCashbook;
    return this;
  }

  /**
   * Get ficCashbook
   *
   * @return ficCashbook
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicCashbook() {
    return ficCashbook;
  }

  public void setFicCashbook(PermissionLevel ficCashbook) {
    this.ficCashbook = ficCashbook;
  }

  public Permissions ficSettings(PermissionLevel ficSettings) {

    this.ficSettings = ficSettings;
    return this;
  }

  /**
   * Get ficSettings
   *
   * @return ficSettings
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicSettings() {
    return ficSettings;
  }

  public void setFicSettings(PermissionLevel ficSettings) {
    this.ficSettings = ficSettings;
  }

  public Permissions ficEmails(PermissionLevel ficEmails) {

    this.ficEmails = ficEmails;
    return this;
  }

  /**
   * Get ficEmails
   *
   * @return ficEmails
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicEmails() {
    return ficEmails;
  }

  public void setFicEmails(PermissionLevel ficEmails) {
    this.ficEmails = ficEmails;
  }

  public Permissions ficExport(PermissionLevel ficExport) {

    this.ficExport = ficExport;
    return this;
  }

  /**
   * Get ficExport
   *
   * @return ficExport
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicExport() {
    return ficExport;
  }

  public void setFicExport(PermissionLevel ficExport) {
    this.ficExport = ficExport;
  }

  public Permissions ficImportBankstatements(PermissionLevel ficImportBankstatements) {

    this.ficImportBankstatements = ficImportBankstatements;
    return this;
  }

  /**
   * Get ficImportBankstatements
   *
   * @return ficImportBankstatements
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicImportBankstatements() {
    return ficImportBankstatements;
  }

  public void setFicImportBankstatements(PermissionLevel ficImportBankstatements) {
    this.ficImportBankstatements = ficImportBankstatements;
  }

  public Permissions ficImportClientsSuppliers(PermissionLevel ficImportClientsSuppliers) {

    this.ficImportClientsSuppliers = ficImportClientsSuppliers;
    return this;
  }

  /**
   * Get ficImportClientsSuppliers
   *
   * @return ficImportClientsSuppliers
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicImportClientsSuppliers() {
    return ficImportClientsSuppliers;
  }

  public void setFicImportClientsSuppliers(PermissionLevel ficImportClientsSuppliers) {
    this.ficImportClientsSuppliers = ficImportClientsSuppliers;
  }

  public Permissions ficImportIssuedDocuments(PermissionLevel ficImportIssuedDocuments) {

    this.ficImportIssuedDocuments = ficImportIssuedDocuments;
    return this;
  }

  /**
   * Get ficImportIssuedDocuments
   *
   * @return ficImportIssuedDocuments
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicImportIssuedDocuments() {
    return ficImportIssuedDocuments;
  }

  public void setFicImportIssuedDocuments(PermissionLevel ficImportIssuedDocuments) {
    this.ficImportIssuedDocuments = ficImportIssuedDocuments;
  }

  public Permissions ficImportProducts(PermissionLevel ficImportProducts) {

    this.ficImportProducts = ficImportProducts;
    return this;
  }

  /**
   * Get ficImportProducts
   *
   * @return ficImportProducts
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicImportProducts() {
    return ficImportProducts;
  }

  public void setFicImportProducts(PermissionLevel ficImportProducts) {
    this.ficImportProducts = ficImportProducts;
  }

  public Permissions ficRecurring(PermissionLevel ficRecurring) {

    this.ficRecurring = ficRecurring;
    return this;
  }

  /**
   * Get ficRecurring
   *
   * @return ficRecurring
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicRecurring() {
    return ficRecurring;
  }

  public void setFicRecurring(PermissionLevel ficRecurring) {
    this.ficRecurring = ficRecurring;
  }

  public Permissions ficRiba(PermissionLevel ficRiba) {

    this.ficRiba = ficRiba;
    return this;
  }

  /**
   * Get ficRiba
   *
   * @return ficRiba
   */
  @javax.annotation.Nullable
  public PermissionLevel getFicRiba() {
    return ficRiba;
  }

  public void setFicRiba(PermissionLevel ficRiba) {
    this.ficRiba = ficRiba;
  }

  public Permissions dicEmployees(PermissionLevel dicEmployees) {

    this.dicEmployees = dicEmployees;
    return this;
  }

  /**
   * Get dicEmployees
   *
   * @return dicEmployees
   */
  @javax.annotation.Nullable
  public PermissionLevel getDicEmployees() {
    return dicEmployees;
  }

  public void setDicEmployees(PermissionLevel dicEmployees) {
    this.dicEmployees = dicEmployees;
  }

  public Permissions dicSettings(PermissionLevel dicSettings) {

    this.dicSettings = dicSettings;
    return this;
  }

  /**
   * Get dicSettings
   *
   * @return dicSettings
   */
  @javax.annotation.Nullable
  public PermissionLevel getDicSettings() {
    return dicSettings;
  }

  public void setDicSettings(PermissionLevel dicSettings) {
    this.dicSettings = dicSettings;
  }

  public Permissions dicTimesheet(PermissionLevel dicTimesheet) {

    this.dicTimesheet = dicTimesheet;
    return this;
  }

  /**
   * Get dicTimesheet
   *
   * @return dicTimesheet
   */
  @javax.annotation.Nullable
  public PermissionLevel getDicTimesheet() {
    return dicTimesheet;
  }

  public void setDicTimesheet(PermissionLevel dicTimesheet) {
    this.dicTimesheet = dicTimesheet;
  }

  public Permissions ficIssuedDocumentsDetailed(
      PermissionsFicIssuedDocumentsDetailed ficIssuedDocumentsDetailed) {

    this.ficIssuedDocumentsDetailed = ficIssuedDocumentsDetailed;
    return this;
  }

  /**
   * Get ficIssuedDocumentsDetailed
   *
   * @return ficIssuedDocumentsDetailed
   */
  @javax.annotation.Nullable
  public PermissionsFicIssuedDocumentsDetailed getFicIssuedDocumentsDetailed() {
    return ficIssuedDocumentsDetailed;
  }

  public void setFicIssuedDocumentsDetailed(
      PermissionsFicIssuedDocumentsDetailed ficIssuedDocumentsDetailed) {
    this.ficIssuedDocumentsDetailed = ficIssuedDocumentsDetailed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permissions permissions = (Permissions) o;
    return Objects.equals(this.ficSituation, permissions.ficSituation)
        && Objects.equals(this.ficClients, permissions.ficClients)
        && Objects.equals(this.ficSuppliers, permissions.ficSuppliers)
        && Objects.equals(this.ficProducts, permissions.ficProducts)
        && Objects.equals(this.ficIssuedDocuments, permissions.ficIssuedDocuments)
        && Objects.equals(this.ficReceivedDocuments, permissions.ficReceivedDocuments)
        && Objects.equals(this.ficReceipts, permissions.ficReceipts)
        && Objects.equals(this.ficCalendar, permissions.ficCalendar)
        && Objects.equals(this.ficArchive, permissions.ficArchive)
        && Objects.equals(this.ficTaxes, permissions.ficTaxes)
        && Objects.equals(this.ficStock, permissions.ficStock)
        && Objects.equals(this.ficCashbook, permissions.ficCashbook)
        && Objects.equals(this.ficSettings, permissions.ficSettings)
        && Objects.equals(this.ficEmails, permissions.ficEmails)
        && Objects.equals(this.ficExport, permissions.ficExport)
        && Objects.equals(this.ficImportBankstatements, permissions.ficImportBankstatements)
        && Objects.equals(this.ficImportClientsSuppliers, permissions.ficImportClientsSuppliers)
        && Objects.equals(this.ficImportIssuedDocuments, permissions.ficImportIssuedDocuments)
        && Objects.equals(this.ficImportProducts, permissions.ficImportProducts)
        && Objects.equals(this.ficRecurring, permissions.ficRecurring)
        && Objects.equals(this.ficRiba, permissions.ficRiba)
        && Objects.equals(this.dicEmployees, permissions.dicEmployees)
        && Objects.equals(this.dicSettings, permissions.dicSettings)
        && Objects.equals(this.dicTimesheet, permissions.dicTimesheet)
        && Objects.equals(this.ficIssuedDocumentsDetailed, permissions.ficIssuedDocumentsDetailed);
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
        ficSituation,
        ficClients,
        ficSuppliers,
        ficProducts,
        ficIssuedDocuments,
        ficReceivedDocuments,
        ficReceipts,
        ficCalendar,
        ficArchive,
        ficTaxes,
        ficStock,
        ficCashbook,
        ficSettings,
        ficEmails,
        ficExport,
        ficImportBankstatements,
        ficImportClientsSuppliers,
        ficImportIssuedDocuments,
        ficImportProducts,
        ficRecurring,
        ficRiba,
        dicEmployees,
        dicSettings,
        dicTimesheet,
        ficIssuedDocumentsDetailed);
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
    sb.append("class Permissions {\n");
    sb.append("    ficSituation: ").append(toIndentedString(ficSituation)).append("\n");
    sb.append("    ficClients: ").append(toIndentedString(ficClients)).append("\n");
    sb.append("    ficSuppliers: ").append(toIndentedString(ficSuppliers)).append("\n");
    sb.append("    ficProducts: ").append(toIndentedString(ficProducts)).append("\n");
    sb.append("    ficIssuedDocuments: ").append(toIndentedString(ficIssuedDocuments)).append("\n");
    sb.append("    ficReceivedDocuments: ")
        .append(toIndentedString(ficReceivedDocuments))
        .append("\n");
    sb.append("    ficReceipts: ").append(toIndentedString(ficReceipts)).append("\n");
    sb.append("    ficCalendar: ").append(toIndentedString(ficCalendar)).append("\n");
    sb.append("    ficArchive: ").append(toIndentedString(ficArchive)).append("\n");
    sb.append("    ficTaxes: ").append(toIndentedString(ficTaxes)).append("\n");
    sb.append("    ficStock: ").append(toIndentedString(ficStock)).append("\n");
    sb.append("    ficCashbook: ").append(toIndentedString(ficCashbook)).append("\n");
    sb.append("    ficSettings: ").append(toIndentedString(ficSettings)).append("\n");
    sb.append("    ficEmails: ").append(toIndentedString(ficEmails)).append("\n");
    sb.append("    ficExport: ").append(toIndentedString(ficExport)).append("\n");
    sb.append("    ficImportBankstatements: ")
        .append(toIndentedString(ficImportBankstatements))
        .append("\n");
    sb.append("    ficImportClientsSuppliers: ")
        .append(toIndentedString(ficImportClientsSuppliers))
        .append("\n");
    sb.append("    ficImportIssuedDocuments: ")
        .append(toIndentedString(ficImportIssuedDocuments))
        .append("\n");
    sb.append("    ficImportProducts: ").append(toIndentedString(ficImportProducts)).append("\n");
    sb.append("    ficRecurring: ").append(toIndentedString(ficRecurring)).append("\n");
    sb.append("    ficRiba: ").append(toIndentedString(ficRiba)).append("\n");
    sb.append("    dicEmployees: ").append(toIndentedString(dicEmployees)).append("\n");
    sb.append("    dicSettings: ").append(toIndentedString(dicSettings)).append("\n");
    sb.append("    dicTimesheet: ").append(toIndentedString(dicTimesheet)).append("\n");
    sb.append("    ficIssuedDocumentsDetailed: ")
        .append(toIndentedString(ficIssuedDocumentsDetailed))
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
