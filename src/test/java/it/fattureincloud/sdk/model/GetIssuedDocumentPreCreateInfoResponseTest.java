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


package it.fattureincloud.sdk.model;

import com.google.gson.Gson;
import it.fattureincloud.sdk.JSON;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for GetIssuedDocumentPreCreateInfoResponse
 */
public class GetIssuedDocumentPreCreateInfoResponseTest {
    private GetIssuedDocumentPreCreateInfoResponse model;

    @BeforeEach
    public void init() {
        model = new GetIssuedDocumentPreCreateInfoResponse()
                .data(
                        new IssuedDocumentPreCreateInfo()
                                .numerations(null)
                                .dnNumerations(null)
                                .defaultValues(new IssuedDocumentPreCreateInfoDefaultValues()
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
                                .extraDataDefaultValues(new IssuedDocumentPreCreateInfoExtraDataDefaultValues()
                                        .tsCommunication(true)
                                        .tsTipoSpesa("ts")
                                        .tsFlagTipoSpesa(1)
                                        .tsPagamentoTracciato(true))
                                .itemsDefaultValues(new IssuedDocumentPreCreateInfoItemsDefaultValues()
                                        .vat(new VatType().id(1)))
                                .countriesList(Arrays.asList("Italia", "Marocco"))
                                .currenciesList(Arrays.asList(new Currency().id("EUR"), new Currency().id("DNR")))
                                .templatesList(Arrays.asList(new DocumentTemplate().id(1), new DocumentTemplate().id(2)))
                                .dnTemplatesList(Arrays.asList(new DocumentTemplate().id(1), new DocumentTemplate().id(2)))
                                .aiTemplatesList(Arrays.asList(new DocumentTemplate().id(1), new DocumentTemplate().id(2)))
                                .paymentMethodsList(Arrays.asList(new PaymentMethod().id(1), new PaymentMethod().id(2)))
                                .paymentAccountsList(Arrays.asList(new PaymentAccount().id(1), new PaymentAccount().id(2)))
                                .vatTypesList(Arrays.asList(new VatType().id(1), new VatType().id(2)))
                );
    }

    /**
     * Model tests for GetIssuedDocumentPreCreateInfoResponse
     */
    @Test
    public void testGetIssuedDocumentPreCreateInfoResponse() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"data\":{\"default_values\":{\"default_template\":{\"id\":1},\"dn_template\":{\"id\":1},\"ai_template\":{\"id\":1},\"notes\":\"notes\",\"rivalsa\":1,\"cassa\":1,\"withholding_tax\":1,\"withholding_tax_taxable\":1,\"other_withholding_tax\":1,\"use_gross_prices\":true,\"payment_method\":{\"id\":1,\"type\":\"standard\"}},\"extra_data_default_values\":{\"ts_communication\":true,\"ts_tipo_spesa\":\"ts\",\"ts_flag_tipo_spesa\":1,\"ts_pagamento_tracciato\":true},\"items_default_values\":{\"vat\":{\"id\":1}},\"countries_list\":[\"Italia\",\"Marocco\"],\"currencies_list\":[{\"id\":\"EUR\"},{\"id\":\"DNR\"}],\"templates_list\":[{\"id\":1},{\"id\":2}],\"dn_templates_list\":[{\"id\":1},{\"id\":2}],\"ai_templates_list\":[{\"id\":1},{\"id\":2}],\"payment_methods_list\":[{\"id\":1,\"type\":\"standard\"},{\"id\":2,\"type\":\"standard\"}],\"payment_accounts_list\":[{\"id\":1,\"type\":\"standard\"},{\"id\":2,\"type\":\"standard\"}],\"vat_types_list\":[{\"id\":1},{\"id\":2}]}}";
        assertEquals(str, json);
        GetIssuedDocumentPreCreateInfoResponse generated = gson.fromJson(str, GetIssuedDocumentPreCreateInfoResponse.class);
        assertEquals(model, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'data'
     */
    @Test
    public void dataTest() {
        assertEquals(Arrays.asList("Italia", "Marocco"), model.getData().getCountriesList());
        model.getData().setCountriesList(Arrays.asList("Spagna", "Francia"));
        assertEquals(Arrays.asList("Spagna", "Francia"), model.getData().getCountriesList());
    }

}
