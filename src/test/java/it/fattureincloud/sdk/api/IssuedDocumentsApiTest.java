/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.11
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.gson.Gson;
import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.JSON;
import it.fattureincloud.sdk.model.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import okhttp3.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/** API tests for IssuedDocumentsApi */
public class IssuedDocumentsApiTest {

  private static IssuedDocumentsApi mockApi(final String serializedBody, final Call remoteCall)
      throws IOException {
    final OkHttpClient okHttpClient = Mockito.mock(OkHttpClient.class);

    Response.Builder builder =
        new Response.Builder()
            .request(new Request.Builder().url("https://api-v2.fattureincloud.it").build())
            .protocol(Protocol.HTTP_1_1)
            .code(200)
            .message("");
    if (serializedBody != null) {
      builder =
          builder.body(ResponseBody.create(serializedBody, MediaType.parse("application/json")));
    }

    final Response response = builder.build();

    Mockito.when(remoteCall.execute()).thenReturn(response);
    Mockito.when(okHttpClient.newCall(Mockito.any())).thenReturn(remoteCall);

    ApiClient client = new ApiClient(okHttpClient);

    return new IssuedDocumentsApi(client);
  }

  /**
   * Create Issued Document
   *
   * <p>Creates a new document.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void createIssuedDocumentTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"id\":12345,\"type\":\"receipt\",\"year\":2021,\"numeration\":\"rec123\",\"subject\":\"\",\"visible_subject\":\"\",\"rc_center\":\"\",\"ei_cassa_type\":null,\"ei_withholding_tax_causal\":null,\"ei_other_withholding_tax_type\":null,\"ei_other_withholding_tax_causal\":null,\"stamp_duty\":0,\"use_gross_prices\":false,\"e_invoice\":false,\"delivery_note\":false,\"accompanying_invoice\":false,\"amount_net\":68.18,\"amount_vat\":6.82,\"amount_gross\":75,\"amount_due_discount\":0,\"amount_rivalsa\":0,\"amount_cassa\":0,\"amount_withholding_tax\":0,\"amount_other_withholding_tax\":0,\"h_margins\":15,\"v_margins\":16,\"show_payment_method\":false,\"show_payments\":true,\"show_totals\":\"all\",\"show_paypal_button\":true,\"show_notification_button\":false,\"is_marked\":false,\"entity\":{\"id\":54321,\"name\":\"Mary"
            + " Red S.r.L.\",\"vat_number\":\"IT05432181211\",\"tax_code\":\"IT05432181211\",\"address_street\":\"Corso"
            + " impero,"
            + " 66\",\"address_postal_code\":\"20900\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"certified_email\":\"mary@pec.red.com\",\"ei_code\":\"ABCXCR1\"},\"date\":\"2021-08-20\",\"number\":1,\"currency\":{\"id\":\"EUR\",\"exchange_rate\":\"1.00000\",\"symbol\":\"\\u20ac\"},\"language\":{\"code\":\"it\",\"name\":\"Italiano\"},\"notes\":\"\",\"rivalsa\":0,\"cassa\":0,\"withholding_tax\":0,\"withholding_tax_taxable\":100,\"other_withholding_tax\":0,\"payment_method\":{\"id\":4,\"name\":\"Credit"
            + " card\"},\"use_split_payment\":false,\"items_list\":[{\"product_id\":5432,\"code\":\"SG3\",\"name\":\"Soggiorno\",\"measure\":\"\",\"net_price\":68.18182,\"category\":\"\",\"id\":277876033,\"gross_price\":75,\"apply_withholding_taxes\":true,\"discount\":0,\"discount_highlight\":false,\"qty\":1,\"vat\":{\"id\":3,\"value\":10,\"description\":\"\"},\"stock\":false,\"description\":\"\",\"not_taxable\":false}],\"payments_list\":[{\"amount\":75,\"due_date\":\"2020-08-23\",\"paid_date\":null,\"id\":69078013,\"status\":\"not_paid\",\"payment_account\":null}],\"attachment_url\":\"kdijrnf893hnwkfk45f50f.pdf\",\"seen_date\":null,\"next_due_date\":\"2020-08-23\",\"template\":{\"id\":2821,\"name\":\"Light"
            + " Smoke\"},\"extra_data\":null,\"url\":\"y12h45rn9yf2mse0p43t7ec90vr.pdf\",\"show_tspay_button\":false}}";

    Call mockCall = Mockito.mock(Call.class);
    IssuedDocumentsApi api = mockApi(result, mockCall);

    Integer companyId = 11111;

    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    CreateIssuedDocumentRequest issuedDocument =
        gson.fromJson(result, CreateIssuedDocumentRequest.class);

    CreateIssuedDocumentRequest createIssuedDocumentRequest = issuedDocument;

    CreateIssuedDocumentResponse response =
        api.createIssuedDocument(companyId, createIssuedDocumentRequest);

    assertEquals(issuedDocument.getData(), response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Delete Issued Document
   *
   * <p>Deletes the specified document.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteIssuedDocumentTest() throws ApiException, IOException {
    Call mockCall = Mockito.mock(Call.class);
    IssuedDocumentsApi api = mockApi(null, mockCall);

    Integer companyId = 11111;
    Integer issuedDocumentId = 16451;
    api.deleteIssuedDocument(companyId, issuedDocumentId);
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Delete Issued Document Attachment
   *
   * <p>Removes the attachment of the specified document.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteIssuedDocumentAttachmentTest() throws ApiException, IOException {
    Call mockCall = Mockito.mock(Call.class);
    IssuedDocumentsApi api = mockApi(null, mockCall);

    Integer companyId = 11111;
    Integer issuedDocumentId = 16451;
    api.deleteIssuedDocumentAttachment(companyId, issuedDocumentId);
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Get Email Data
   *
   * <p>Gets the pre-compiled email details.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getEmailDataTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"recipient_email\":\"mary.red@example.com\",\"default_sender_email\":{\"id\":0,\"email\":\"no-reply@fattureincloud.it\"},\"sender_emails_list\":[{\"id\":0,\"email\":\"no-reply@fattureincloud.it\"},{\"id\":888,\"email\":\"mariorossi@fattureincloud.it\"}],\"cc_email\":\"m.rossi@exxample.com\",\"subject\":\"Nostra"
            + " pro forma nr. 1\",\"body\":\"Gentile Mario Rossi,<br>per vedere la nostra pro forma"
            + " di  o per scaricarne una copia in versione PDF prema sul bottone"
            + " sottoastante.<br><br>{{allegati}}<br><br>Cordiali saluti,<br><b>Mario"
            + " Rossi<\\/b>\",\"document_exists\":true,\"delivery_note_exists\":false,\"attachment_exists\":false,\"accompanying_invoice_exists\":false}}";

    Call mockCall = Mockito.mock(Call.class);
    IssuedDocumentsApi api = mockApi(result, mockCall);

    Integer companyId = 11111;
    Integer issuedDocumentId = 16451;

    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    GetEmailDataResponse emailData = gson.fromJson(result, GetEmailDataResponse.class);

    GetEmailDataResponse response = api.getEmailData(companyId, issuedDocumentId);
    assertEquals(emailData.getData(), response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Get Existing Issued Document Totals
   *
   * <p>Returns the totals for a specified document.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getExistingIssuedDocumentTotalsTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"amount_net\":10,\"amount_vat\":10,\"amount_gross\":10,\"amount_withholding_tax\":10,\"amount_other_withholding_tax\":10,\"amount_due\":10,\"payments_sum\":10}}";

    Call mockCall = Mockito.mock(Call.class);
    IssuedDocumentsApi api = mockApi(result, mockCall);

    Integer companyId = 11111;
    Integer issuedDocumentId = 16451;

    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountDue((BigDecimal.valueOf(10)))
            .paymentsSum((BigDecimal.valueOf(10)));

    GetExistingIssuedDocumentTotalsRequest getExistingIssuedDocumentTotalsRequest =
        new GetExistingIssuedDocumentTotalsRequest();
    GetExistingIssuedDocumentTotalsResponse response =
        api.getExistingIssuedDocumentTotals(
            companyId, issuedDocumentId, getExistingIssuedDocumentTotalsRequest);
    assertEquals(expected, response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Get Issued Document
   *
   * <p>Gets the specified document.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getIssuedDocumentTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"id\":12345,\"type\":\"receipt\",\"year\":2021,\"numeration\":\"rec123\",\"subject\":\"\",\"visible_subject\":\"\",\"rc_center\":\"\",\"ei_cassa_type\":null,\"ei_withholding_tax_causal\":null,\"ei_other_withholding_tax_type\":null,\"ei_other_withholding_tax_causal\":null,\"stamp_duty\":0,\"use_gross_prices\":false,\"e_invoice\":false,\"delivery_note\":false,\"accompanying_invoice\":false,\"amount_net\":68.18,\"amount_vat\":6.82,\"amount_gross\":75,\"amount_due_discount\":0,\"amount_rivalsa\":0,\"amount_cassa\":0,\"amount_withholding_tax\":0,\"amount_other_withholding_tax\":0,\"h_margins\":15,\"v_margins\":16,\"show_payment_method\":false,\"show_payments\":true,\"show_totals\":\"all\",\"show_paypal_button\":true,\"show_notification_button\":false,\"is_marked\":false,\"entity\":{\"id\":54321,\"name\":\"Mary"
            + " Red S.r.L.\",\"vat_number\":\"IT05432181211\",\"tax_code\":\"IT05432181211\",\"address_street\":\"Corso"
            + " impero,"
            + " 66\",\"address_postal_code\":\"20900\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"certified_email\":\"mary@pec.red.com\",\"ei_code\":\"ABCXCR1\"},\"date\":\"2021-08-20\",\"number\":1,\"currency\":{\"id\":\"EUR\",\"exchange_rate\":\"1.00000\",\"symbol\":\"\\u20ac\"},\"language\":{\"code\":\"it\",\"name\":\"Italiano\"},\"notes\":\"\",\"rivalsa\":0,\"cassa\":0,\"withholding_tax\":0,\"withholding_tax_taxable\":100,\"other_withholding_tax\":0,\"payment_method\":{\"id\":4,\"name\":\"Credit"
            + " card\"},\"use_split_payment\":false,\"items_list\":[{\"product_id\":5432,\"code\":\"SG3\",\"name\":\"Soggiorno\",\"measure\":\"\",\"net_price\":68.18182,\"category\":\"\",\"id\":277876033,\"gross_price\":75,\"apply_withholding_taxes\":true,\"discount\":0,\"discount_highlight\":false,\"qty\":1,\"vat\":{\"id\":3,\"value\":10,\"description\":\"\"},\"stock\":false,\"description\":\"\",\"not_taxable\":false}],\"payments_list\":[{\"amount\":75,\"due_date\":\"2020-08-23\",\"paid_date\":null,\"id\":69078013,\"status\":\"not_paid\",\"payment_account\":null}],\"attachment_url\":\"kdijrnf893hnwkfk45f50f.pdf\",\"seen_date\":null,\"next_due_date\":\"2020-08-23\",\"template\":{\"id\":2821,\"name\":\"Light"
            + " Smoke\"},\"extra_data\":null,\"url\":\"y12h45rn9yf2mse0p43t7ec90vr.pdf\",\"show_tspay_button\":false}}";

    Call mockCall = Mockito.mock(Call.class);
    IssuedDocumentsApi api = mockApi(result, mockCall);

    Integer companyId = 11111;
    Integer issuedDocumentId = 16451;
    String fields = null;
    String fieldset = null;

    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    GetIssuedDocumentResponse issuedDocumentResponse =
        gson.fromJson(result, GetIssuedDocumentResponse.class);

    GetIssuedDocumentResponse response =
        api.getIssuedDocument(companyId, issuedDocumentId, fields, fieldset);
    assertEquals(issuedDocumentResponse.getData(), response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Get Issued Document Pre-create info
   *
   * <p>Retrieves the information useful while creating a new document.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getIssuedDocumentPreCreateInfoTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"default_values\":{\"default_template\":{\"id\":1},\"dn_template\":{\"id\":1},\"ai_template\":{\"id\":1},\"notes\":\"notes\",\"rivalsa\":1,\"cassa\":1,\"withholding_tax\":1,\"withholding_tax_taxable\":1,\"other_withholding_tax\":1,\"use_gross_prices\":true,\"payment_method\":{\"id\":1,\"type\":\"standard\"}},\"extra_data_default_values\":{\"ts_communication\":true,\"ts_tipo_spesa\":\"ts\",\"ts_flag_tipo_spesa\":1,\"ts_pagamento_tracciato\":true},\"items_default_values\":{\"vat\":{\"id\":1}},\"countries_list\":[\"Italia\",\"Marocco\"],\"currencies_list\":[{\"id\":\"EUR\"},{\"id\":\"DNR\"}],\"templates_list\":[{\"id\":1},{\"id\":2}],\"dn_templates_list\":[{\"id\":1},{\"id\":2}],\"ai_templates_list\":[{\"id\":1},{\"id\":2}],\"payment_methods_list\":[{\"id\":1,\"type\":\"standard\"},{\"id\":2,\"type\":\"standard\"}],\"payment_accounts_list\":[{\"id\":1,\"type\":\"standard\"},{\"id\":2,\"type\":\"standard\"}],\"vat_types_list\":[{\"id\":1},{\"id\":2}]}}";

    Call mockCall = Mockito.mock(Call.class);
    IssuedDocumentsApi api = mockApi(result, mockCall);

    Integer companyId = 11111;

    IssuedDocumentPreCreateInfo issuedDocumentPreCreateInfo =
        new IssuedDocumentPreCreateInfo()
            .numerations(null)
            .dnNumerations(null)
            .defaultValues(
                new IssuedDocumentPreCreateInfoDefaultValues()
                    .defaultTemplate(new DocumentTemplate().id(1))
                    .dnTemplate(new DocumentTemplate().id(1))
                    .aiTemplate(new DocumentTemplate().id(1))
                    .notes("notes")
                    .rivalsa(BigDecimal.valueOf(1))
                    .cassa(BigDecimal.valueOf(1))
                    .withholdingTax(BigDecimal.valueOf(1))
                    .withholdingTaxTaxable(BigDecimal.valueOf(1))
                    .otherWithholdingTax(BigDecimal.valueOf(1))
                    .useGrossPrices(true)
                    .paymentMethod(new PaymentMethod().id(1)))
            .extraDataDefaultValues(
                new IssuedDocumentPreCreateInfoExtraDataDefaultValues()
                    .tsCommunication(true)
                    .tsTipoSpesa("ts")
                    .tsFlagTipoSpesa(1)
                    .tsPagamentoTracciato(true))
            .itemsDefaultValues(
                new IssuedDocumentPreCreateInfoItemsDefaultValues().vat(new VatType().id(1)))
            .countriesList(Arrays.asList("Italia", "Marocco"))
            .currenciesList(Arrays.asList(new Currency().id("EUR"), new Currency().id("DNR")))
            .templatesList(
                Arrays.asList(new DocumentTemplate().id(1), new DocumentTemplate().id(2)))
            .dnTemplatesList(
                Arrays.asList(new DocumentTemplate().id(1), new DocumentTemplate().id(2)))
            .aiTemplatesList(
                Arrays.asList(new DocumentTemplate().id(1), new DocumentTemplate().id(2)))
            .paymentMethodsList(Arrays.asList(new PaymentMethod().id(1), new PaymentMethod().id(2)))
            .paymentAccountsList(
                Arrays.asList(new PaymentAccount().id(1), new PaymentAccount().id(2)))
            .vatTypesList(Arrays.asList(new VatType().id(1), new VatType().id(2)));

    GetIssuedDocumentPreCreateInfoResponse response =
        api.getIssuedDocumentPreCreateInfo(companyId, "invoice");
    assertEquals(issuedDocumentPreCreateInfo, response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Get New Issued Document Totals
   *
   * <p>Returns the totals for a new document.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getNewIssuedDocumentTotalsTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"amount_net\":10,\"amount_vat\":10,\"amount_gross\":10,\"amount_withholding_tax\":10,\"amount_other_withholding_tax\":10,\"amount_due\":10,\"payments_sum\":10}}";

    Call mockCall = Mockito.mock(Call.class);
    IssuedDocumentsApi api = mockApi(result, mockCall);

    Integer companyId = 11111;

    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountDue((BigDecimal.valueOf(10)))
            .paymentsSum((BigDecimal.valueOf(10)));

    String issuedDocumentJson =
        "{\"id\":12345,\"type\":\"receipt\",\"year\":2021,\"numeration\":\"rec123\",\"subject\":\"\",\"visible_subject\":\"\",\"rc_center\":\"\",\"ei_cassa_type\":null,\"ei_withholding_tax_causal\":null,\"ei_other_withholding_tax_type\":null,\"ei_other_withholding_tax_causal\":null,\"stamp_duty\":0,\"use_gross_prices\":false,\"e_invoice\":false,\"delivery_note\":false,\"accompanying_invoice\":false,\"amount_net\":68.18,\"amount_vat\":6.82,\"amount_gross\":75,\"amount_due_discount\":0,\"amount_rivalsa\":0,\"amount_cassa\":0,\"amount_withholding_tax\":0,\"amount_other_withholding_tax\":0,\"h_margins\":15,\"v_margins\":16,\"show_payment_method\":false,\"show_payments\":true,\"show_totals\":\"all\",\"show_paypal_button\":true,\"show_notification_button\":false,\"is_marked\":false,\"entity\":{\"id\":54321,\"name\":\"Mary"
            + " Red S.r.L.\",\"vat_number\":\"IT05432181211\",\"tax_code\":\"IT05432181211\",\"address_street\":\"Corso"
            + " impero,"
            + " 66\",\"address_postal_code\":\"20900\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"certified_email\":\"mary@pec.red.com\",\"ei_code\":\"ABCXCR1\"},\"date\":\"2021-08-20\",\"number\":1,\"currency\":{\"id\":\"EUR\",\"exchange_rate\":\"1.00000\",\"symbol\":\"\\u20ac\"},\"language\":{\"code\":\"it\",\"name\":\"Italiano\"},\"notes\":\"\",\"rivalsa\":0,\"cassa\":0,\"withholding_tax\":0,\"withholding_tax_taxable\":100,\"other_withholding_tax\":0,\"payment_method\":{\"id\":4,\"name\":\"Credit"
            + " card\"},\"use_split_payment\":false,\"items_list\":[{\"product_id\":5432,\"code\":\"SG3\",\"name\":\"Soggiorno\",\"measure\":\"\",\"net_price\":68.18182,\"category\":\"\",\"id\":277876033,\"gross_price\":75,\"apply_withholding_taxes\":true,\"discount\":0,\"discount_highlight\":false,\"qty\":1,\"vat\":{\"id\":3,\"value\":10,\"description\":\"\"},\"stock\":false,\"description\":\"\",\"not_taxable\":false}],\"payments_list\":[{\"amount\":75,\"due_date\":\"2020-08-23\",\"paid_date\":null,\"id\":69078013,\"status\":\"not_paid\",\"payment_account\":null}],\"attachment_url\":\"kdijrnf893hnwkfk45f50f.pdf\",\"seen_date\":null,\"next_due_date\":\"2020-08-23\",\"template\":{\"id\":2821,\"name\":\"Light"
            + " Smoke\"},\"extra_data\":null,\"url\":\"y12h45rn9yf2mse0p43t7ec90vr.pdf\",\"show_tspay_button\":false}";
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    IssuedDocument issuedDocument = gson.fromJson(issuedDocumentJson, IssuedDocument.class);

    GetNewIssuedDocumentTotalsRequest getNewIssuedDocumentTotalsRequest =
        new GetNewIssuedDocumentTotalsRequest().data(issuedDocument);

    GetNewIssuedDocumentTotalsResponse response =
        api.getNewIssuedDocumentTotals(companyId, getNewIssuedDocumentTotalsRequest);
    assertEquals(expected, response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * List Issued Documents
   *
   * <p>Lists the issued documents.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void listIssuedDocumentsTest() throws ApiException, IOException {
    String result =
        "{\"data\":[{\"id\":12345,\"type\":\"receipt\",\"year\":2021,\"numeration\":\"rec123\",\"subject\":\"\",\"visible_subject\":\"\",\"rc_center\":\"\",\"ei_cassa_type\":null,\"ei_withholding_tax_causal\":null,\"ei_other_withholding_tax_type\":null,\"ei_other_withholding_tax_causal\":null,\"stamp_duty\":0,\"use_gross_prices\":false,\"e_invoice\":false,\"delivery_note\":false,\"accompanying_invoice\":false,\"amount_net\":68.18,\"amount_vat\":6.82,\"amount_gross\":75,\"amount_due_discount\":0,\"amount_rivalsa\":0,\"amount_cassa\":0,\"amount_withholding_tax\":0,\"amount_other_withholding_tax\":0,\"h_margins\":15,\"v_margins\":16,\"show_payment_method\":false,\"show_payments\":true,\"show_totals\":\"all\",\"show_paypal_button\":true,\"show_notification_button\":false,\"is_marked\":false,\"entity\":{\"id\":54321,\"name\":\"Mary"
            + " Red S.r.L.\",\"vat_number\":\"IT05432181211\",\"tax_code\":\"IT05432181211\",\"address_street\":\"Corso"
            + " impero,"
            + " 66\",\"address_postal_code\":\"20900\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"certified_email\":\"mary@pec.red.com\",\"ei_code\":\"ABCXCR1\"},\"date\":\"2021-08-20\",\"number\":1,\"currency\":{\"id\":\"EUR\",\"exchange_rate\":\"1.00000\",\"symbol\":\"\\u20ac\"},\"language\":{\"code\":\"it\",\"name\":\"Italiano\"},\"notes\":\"\",\"rivalsa\":0,\"cassa\":0,\"withholding_tax\":0,\"withholding_tax_taxable\":100,\"other_withholding_tax\":0,\"payment_method\":{\"id\":4,\"name\":\"Credit"
            + " card\"},\"use_split_payment\":false,\"items_list\":[{\"product_id\":5432,\"code\":\"SG3\",\"name\":\"Soggiorno\",\"measure\":\"\",\"net_price\":68.18182,\"category\":\"\",\"id\":277876033,\"gross_price\":75,\"apply_withholding_taxes\":true,\"discount\":0,\"discount_highlight\":false,\"qty\":1,\"vat\":{\"id\":3,\"value\":10,\"description\":\"\"},\"stock\":false,\"description\":\"\",\"not_taxable\":false}],\"payments_list\":[{\"amount\":75,\"due_date\":\"2020-08-23\",\"paid_date\":null,\"id\":69078013,\"status\":\"not_paid\",\"payment_account\":null}],\"attachment_url\":\"kdijrnf893hnwkfk45f50f.pdf\",\"seen_date\":null,\"next_due_date\":\"2020-08-23\",\"template\":{\"id\":2821,\"name\":\"Light"
            + " Smoke\"},\"extra_data\":null,\"url\":\"y12h45rn9yf2mse0p43t7ec90vr.pdf\",\"show_tspay_button\":false},{\"id\":12345,\"type\":\"receipt\",\"year\":2021,\"numeration\":\"rec123\",\"subject\":\"\",\"visible_subject\":\"\",\"rc_center\":\"\",\"ei_cassa_type\":null,\"ei_withholding_tax_causal\":null,\"ei_other_withholding_tax_type\":null,\"ei_other_withholding_tax_causal\":null,\"stamp_duty\":0,\"use_gross_prices\":false,\"e_invoice\":false,\"delivery_note\":false,\"accompanying_invoice\":false,\"amount_net\":68.18,\"amount_vat\":6.82,\"amount_gross\":75,\"amount_due_discount\":0,\"amount_rivalsa\":0,\"amount_cassa\":0,\"amount_withholding_tax\":0,\"amount_other_withholding_tax\":0,\"h_margins\":15,\"v_margins\":16,\"show_payment_method\":false,\"show_payments\":true,\"show_totals\":\"all\",\"show_paypal_button\":true,\"show_notification_button\":false,\"is_marked\":false,\"entity\":{\"id\":54321,\"name\":\"Mary"
            + " Red S.r.L.\",\"vat_number\":\"IT05432181211\",\"tax_code\":\"IT05432181211\",\"address_street\":\"Corso"
            + " impero,"
            + " 66\",\"address_postal_code\":\"20900\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"certified_email\":\"mary@pec.red.com\",\"ei_code\":\"ABCXCR1\"},\"date\":\"2021-08-20\",\"number\":1,\"currency\":{\"id\":\"EUR\",\"exchange_rate\":\"1.00000\",\"symbol\":\"\\u20ac\"},\"language\":{\"code\":\"it\",\"name\":\"Italiano\"},\"notes\":\"\",\"rivalsa\":0,\"cassa\":0,\"withholding_tax\":0,\"withholding_tax_taxable\":100,\"other_withholding_tax\":0,\"payment_method\":{\"id\":4,\"name\":\"Credit"
            + " card\"},\"use_split_payment\":false,\"items_list\":[{\"product_id\":5432,\"code\":\"SG3\",\"name\":\"Soggiorno\",\"measure\":\"\",\"net_price\":68.18182,\"category\":\"\",\"id\":277876033,\"gross_price\":75,\"apply_withholding_taxes\":true,\"discount\":0,\"discount_highlight\":false,\"qty\":1,\"vat\":{\"id\":3,\"value\":10,\"description\":\"\"},\"stock\":false,\"description\":\"\",\"not_taxable\":false}],\"payments_list\":[{\"amount\":75,\"due_date\":\"2020-08-23\",\"paid_date\":null,\"id\":69078013,\"status\":\"not_paid\",\"payment_account\":null}],\"attachment_url\":\"kdijrnf893hnwkfk45f50f.pdf\",\"seen_date\":null,\"next_due_date\":\"2020-08-23\",\"template\":{\"id\":2821,\"name\":\"Light"
            + " Smoke\"},\"extra_data\":null,\"url\":\"y12h45rn9yf2mse0p43t7ec90vr.pdf\",\"show_tspay_button\":false}]}";

    Call mockCall = Mockito.mock(Call.class);
    IssuedDocumentsApi api = mockApi(result, mockCall);

    Integer companyId = 11111;
    String fields = null;
    String fieldset = null;

    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    ListIssuedDocumentsResponse listIssuedDocumentsResponse =
        gson.fromJson(result, ListIssuedDocumentsResponse.class);

    ListIssuedDocumentsResponse response =
        api.listIssuedDocuments(
            companyId, "invoice", fields, fieldset, null, null, null, null, null);
    assertEquals(listIssuedDocumentsResponse.getData(), response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Modify Issued Document
   *
   * <p>Modifies the specified document.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void modifyIssuedDocumentTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"id\":12345,\"type\":\"receipt\",\"year\":2021,\"numeration\":\"rec123\",\"subject\":\"\",\"visible_subject\":\"\",\"rc_center\":\"\",\"ei_cassa_type\":null,\"ei_withholding_tax_causal\":null,\"ei_other_withholding_tax_type\":null,\"ei_other_withholding_tax_causal\":null,\"stamp_duty\":0,\"use_gross_prices\":false,\"e_invoice\":false,\"delivery_note\":false,\"accompanying_invoice\":false,\"amount_net\":68.18,\"amount_vat\":6.82,\"amount_gross\":75,\"amount_due_discount\":0,\"amount_rivalsa\":0,\"amount_cassa\":0,\"amount_withholding_tax\":0,\"amount_other_withholding_tax\":0,\"h_margins\":15,\"v_margins\":16,\"show_payment_method\":false,\"show_payments\":true,\"show_totals\":\"all\",\"show_paypal_button\":true,\"show_notification_button\":false,\"is_marked\":false,\"entity\":{\"id\":54321,\"name\":\"Mary"
            + " Red S.r.L.\",\"vat_number\":\"IT05432181211\",\"tax_code\":\"IT05432181211\",\"address_street\":\"Corso"
            + " impero,"
            + " 66\",\"address_postal_code\":\"20900\",\"address_city\":\"Milano\",\"address_province\":\"MI\",\"address_extra\":\"\",\"country\":\"Italia\",\"certified_email\":\"mary@pec.red.com\",\"ei_code\":\"ABCXCR1\"},\"date\":\"2021-08-20\",\"number\":1,\"currency\":{\"id\":\"EUR\",\"exchange_rate\":\"1.00000\",\"symbol\":\"\\u20ac\"},\"language\":{\"code\":\"it\",\"name\":\"Italiano\"},\"notes\":\"\",\"rivalsa\":0,\"cassa\":0,\"withholding_tax\":0,\"withholding_tax_taxable\":100,\"other_withholding_tax\":0,\"payment_method\":{\"id\":4,\"name\":\"Credit"
            + " card\"},\"use_split_payment\":false,\"items_list\":[{\"product_id\":5432,\"code\":\"SG3\",\"name\":\"Soggiorno\",\"measure\":\"\",\"net_price\":68.18182,\"category\":\"\",\"id\":277876033,\"gross_price\":75,\"apply_withholding_taxes\":true,\"discount\":0,\"discount_highlight\":false,\"qty\":1,\"vat\":{\"id\":3,\"value\":10,\"description\":\"\"},\"stock\":false,\"description\":\"\",\"not_taxable\":false}],\"payments_list\":[{\"amount\":75,\"due_date\":\"2020-08-23\",\"paid_date\":null,\"id\":69078013,\"status\":\"not_paid\",\"payment_account\":null}],\"attachment_url\":\"kdijrnf893hnwkfk45f50f.pdf\",\"seen_date\":null,\"next_due_date\":\"2020-08-23\",\"template\":{\"id\":2821,\"name\":\"Light"
            + " Smoke\"},\"extra_data\":null,\"url\":\"y12h45rn9yf2mse0p43t7ec90vr.pdf\",\"show_tspay_button\":false}}";

    Call mockCall = Mockito.mock(Call.class);
    IssuedDocumentsApi api = mockApi(result, mockCall);

    Integer companyId = 2;
    Integer issuedDocumentId = 2;

    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    ModifyIssuedDocumentRequest issuedDocument =
        gson.fromJson(result, ModifyIssuedDocumentRequest.class);

    ModifyIssuedDocumentRequest modifyIssuedDocumentRequest = issuedDocument;

    ModifyIssuedDocumentResponse response =
        api.modifyIssuedDocument(companyId, issuedDocumentId, modifyIssuedDocumentRequest);

    assertEquals(issuedDocument.getData(), response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Schedule Email
   *
   * <p>Schedules the sending of a document by email.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void scheduleEmailTest() throws ApiException, IOException {
    Call mockCall = Mockito.mock(Call.class);
    IssuedDocumentsApi api = mockApi(null, mockCall);

    Integer companyId = 11111;
    Integer issuedDocumentId = 16451;
    String scheduleEmailRequestJson =
        "{\"data\":{\"sender_email\":\"mariorossi@fattureincloud.it\",\"recipient_email\":\"mary.red@example.com\",\"subject\":\"Nostra"
            + " pro forma nr. 1\",\"body\":\"Gentile Mario Rossi,<br>per vedere la nostra pro forma"
            + " di  o per scaricarne una copia in versione PDF prema sul bottone"
            + " sottostante.<br><br>{{allegati}}<br><br>Cordiali saluti,<br><b>Mario"
            + " Rossi<\\/b>\",\"include\":{\"document\":false,\"delivery_note\":false,\"attachment\":false,\"accompanying_invoice\":false},\"attach_pdf\":true,\"send_copy\":false}}";

    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    ScheduleEmailRequest scheduleEmailRequest =
        gson.fromJson(scheduleEmailRequestJson, ScheduleEmailRequest.class);

    api.scheduleEmail(companyId, issuedDocumentId, scheduleEmailRequest);
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Upload Issued Document Attachment
   *
   * <p>Uploads an attachment destined to an issued document. The actual association between the
   * document and the attachment must be implemented separately, using the returned token.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void uploadIssuedDocumentAttachmentTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"attachment_token\":\"YmMyNWYxYzIwMTU3N212ABCDZjZiMzg5OWY0ODNkZDQveXl5LmRvYw\"}}";

    Call mockCall = Mockito.mock(Call.class);
    IssuedDocumentsApi api = mockApi(result, mockCall);

    Integer companyId = 11111;
    UploadIssuedDocumentAttachmentResponse expected =
        new UploadIssuedDocumentAttachmentResponse()
            .data(
                new AttachmentData()
                    .attachmentToken("YmMyNWYxYzIwMTU3N212ABCDZjZiMzg5OWY0ODNkZDQveXl5LmRvYw"));

    UploadIssuedDocumentAttachmentResponse response =
        api.uploadIssuedDocumentAttachment(companyId, "filename", null);

    assertEquals(expected.getData(), response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Transform issued document
   *
   * <p>
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void transformIssuedDocumentAttachmentTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"id\":12345,\"type\":\"invoice\",\"show_totals\":\"all\"},\"options\":{\"create_from\":[\"82112399\"],\"transform\":true,\"keep_copy\":true}}";

    Call mockCall = Mockito.mock(Call.class);
    IssuedDocumentsApi api = mockApi(result, mockCall);

    Integer companyId = 11111;
    TransformIssuedDocumentResponse expected =
        new TransformIssuedDocumentResponse()
            .data(new IssuedDocument().id(12345).type(IssuedDocumentType.INVOICE))
            .options(
                new IssuedDocumentOptions()
                    .createFrom(Arrays.asList("82112399"))
                    .transform(true)
                    .keepCopy(true));

    TransformIssuedDocumentResponse response =
        api.transformIssuedDocument(companyId, 2, "proforma", 1, 1);

    assertEquals(expected.getData(), response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }

  /**
   * Join issued documents
   *
   * <p>
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void joinIssuedDocumentAttachmentTest() throws ApiException, IOException {
    String result =
        "{\"data\":{\"id\":12345,\"type\":\"invoice\",\"show_totals\":\"all\"},\"options\":{\"create_from\":[\"82112399\",\"82112400\"]}}";

    Call mockCall = Mockito.mock(Call.class);
    IssuedDocumentsApi api = mockApi(result, mockCall);

    Integer companyId = 11111;
    JoinIssuedDocumentsResponse expected =
        new JoinIssuedDocumentsResponse()
            .data(new IssuedDocument().id(12345).type(IssuedDocumentType.INVOICE))
            .options(new IssuedDocumentOptions().createFrom(Arrays.asList("82112399", "82112400")));

    JoinIssuedDocumentsResponse response = api.joinIssuedDocuments(companyId, "1234,4321", 1, 1);

    assertEquals(expected.getData(), response.getData());
    Mockito.verify(mockCall, Mockito.only()).execute();
  }
}
