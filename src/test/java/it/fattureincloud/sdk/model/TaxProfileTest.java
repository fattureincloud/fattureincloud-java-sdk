/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.1.3
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.fattureincloud.sdk.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.Gson;
import it.fattureincloud.sdk.JSON;
import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Model tests for TaxProfile
 */
public class TaxProfileTest {
    private TaxProfile model;

    @BeforeEach
    public void init() {
        model =
            new TaxProfile()
                .companyType("individual")
                .companySubtype("artigiani")
                .profession("profession")
                .regime("forfettario_5")
                .rivalsaName("")
                .defaultRivalsa(new BigDecimal(0))
                .cassaName("")
                .defaultCassa(new BigDecimal(0))
                .defaultCassaTaxable(new BigDecimal(0))
                .cassa2Name("")
                .defaultCassa2(new BigDecimal(0))
                .defaultCassa2Taxable(new BigDecimal(0))
                .defaultWithholdingTax(new BigDecimal(0))
                .defaultWithholdingTaxTaxable(new BigDecimal(100))
                .defaultOtherWithholdingTax(new BigDecimal(0))
                .enasarco(false)
                .enasarcoType("enasarcoType")
                .contributionsPercentage(new BigDecimal(0))
                .profitCoefficient(new BigDecimal(0))
                .med(false)
                .defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
  }

    /**
     * Model tests for TaxProfile
     */
    @Test
    public void testTaxProfile() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"company_type\":\"individual\",\"company_subtype\":\"artigiani\",\"profession\":\"profession\",\"regime\":\"forfettario_5\",\"rivalsa_name\":\"\",\"default_rivalsa\":0,\"cassa_name\":\"\",\"default_cassa\":0,\"default_cassa_taxable\":0,\"cassa2_name\":\"\",\"default_cassa2\":0,\"default_cassa2_taxable\":0,\"default_withholding_tax\":0,\"default_withholding_tax_taxable\":100,\"default_other_withholding_tax\":0,\"enasarco\":false,\"enasarco_type\":\"enasarcoType\",\"contributions_percentage\":0,\"profit_coefficient\":0,\"med\":false,\"default_vat\":{\"id\":66,\"value\":0,\"description\":\"Contribuenti forfettari\",\"notes\":\"Operazione non soggetta a IVA ai sensi dell\\u0027art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni\",\"e_invoice\":true,\"ei_type\":\"2.2\",\"ei_description\":\"Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni\",\"is_disabled\":false}}";
        assertEquals(str, json);
        TaxProfile generated = gson.fromJson(str, TaxProfile.class);
        assertEquals(model, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'companyType'
     */
    @Test
    public void companyTypeTest() {
        assertEquals("individual", model.getCompanyType());
        model.setCompanyType("company");
        assertEquals("company", model.getCompanyType());

        TaxProfile a = model.companyType("person");
        TaxProfile expected = new TaxProfile().companyType("person").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'companySubtype'
     */
    @Test
    public void companySubtypeTest() {
        assertEquals("artigiani", model.getCompanySubtype());
        model.setCompanySubtype("professionisti");
        assertEquals("professionisti", model.getCompanySubtype());

        TaxProfile a = model.companySubtype("artigiani");
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'profession'
     */
    @Test
    public void professionTest() {
        assertEquals("profession", model.getProfession());
        model.setProfession("profession2");
        assertEquals("profession2", model.getProfession());

        TaxProfile a = model.profession("profession");
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'regime'
     */
    @Test
    public void regimeTest() {
        assertEquals("forfettario_5", model.getRegime());
        model.setRegime("forfettario_10");
        assertEquals("forfettario_10", model.getRegime());

        TaxProfile a = model.regime("forfettario_5");
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'rivalsaName'
     */
    @Test
    public void rivalsaNameTest() {
        assertEquals("", model.getRivalsaName());
        model.setRivalsaName("rivalsa");
        assertEquals("rivalsa", model.getRivalsaName());

        TaxProfile a = model.rivalsaName("");
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'defaultRivalsa'
     */
    @Test
    public void defaultRivalsaTest() {
        assertEquals(new BigDecimal(0), model.getDefaultRivalsa());
        model.setDefaultRivalsa(new BigDecimal(10));
        assertEquals(new BigDecimal(10), model.getDefaultRivalsa());

        TaxProfile a = model.defaultRivalsa(new BigDecimal(0));
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'cassaName'
     */
    @Test
    public void cassaNameTest() {
        assertEquals("", model.getCassaName());
        model.setCassaName("cassa");
        assertEquals("cassa", model.getCassaName());

        TaxProfile a = model.cassaName("");
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'defaultCassa'
     */
    @Test
    public void defaultCassaTest() {
        assertEquals(new BigDecimal(0), model.getDefaultCassa());
        model.setDefaultCassa(new BigDecimal(10));
        assertEquals(new BigDecimal(10), model.getDefaultCassa());

        TaxProfile a = model.defaultCassa(new BigDecimal(0));
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'defaultCassaTaxable'
     */
    @Test
    public void defaultCassaTaxableTest() {
        assertEquals(new BigDecimal(0), model.getDefaultCassaTaxable());
        model.setDefaultCassaTaxable(new BigDecimal(10));
        assertEquals(new BigDecimal(10), model.getDefaultCassaTaxable());

        TaxProfile a = model.defaultCassaTaxable(new BigDecimal(0));
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'cassa2Name'
     */
    @Test
    public void cassa2NameTest() {
        assertEquals("", model.getCassa2Name());
        model.setCassa2Name("cassa2");
        assertEquals("cassa2", model.getCassa2Name());

        TaxProfile a = model.cassa2Name("");
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'defaultCassa2'
     */
    @Test
    public void defaultCassa2Test() {
        assertEquals(new BigDecimal(0), model.getDefaultCassa2());
        model.setDefaultCassa2(new BigDecimal(10));
        assertEquals(new BigDecimal(10), model.getDefaultCassa2());

        TaxProfile a = model.defaultCassa2(new BigDecimal(0));
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'defaultCassa2Taxable'
     */
    @Test
    public void defaultCassa2TaxableTest() {
        assertEquals(new BigDecimal(0), model.getDefaultCassa2Taxable());
        model.setDefaultCassa2Taxable(new BigDecimal(10));
        assertEquals(new BigDecimal(10), model.getDefaultCassa2Taxable());

        TaxProfile a = model.defaultCassa2Taxable(new BigDecimal(0));
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'defaultWithholdingTax'
     */
    @Test
    public void defaultWithholdingTaxTest() {
        assertEquals(new BigDecimal(0), model.getDefaultWithholdingTax());
        model.setDefaultWithholdingTax(new BigDecimal(10));
        assertEquals(new BigDecimal(10), model.getDefaultWithholdingTax());

        TaxProfile a = model.defaultWithholdingTax(new BigDecimal(0));
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'defaultWithholdingTaxTaxable'
     */
    @Test
    public void defaultWithholdingTaxTaxableTest() {
        assertEquals(new BigDecimal(100), model.getDefaultWithholdingTaxTaxable());
        model.setDefaultWithholdingTaxTaxable(new BigDecimal(10));
        assertEquals(new BigDecimal(10), model.getDefaultWithholdingTaxTaxable());

        TaxProfile a = model.defaultWithholdingTaxTaxable(new BigDecimal(100));
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'defaultOtherWithholdingTax'
     */
    @Test
    public void defaultOtherWithholdingTaxTest() {
        assertEquals(new BigDecimal(0), model.getDefaultOtherWithholdingTax());
        model.setDefaultOtherWithholdingTax(new BigDecimal(10));
        assertEquals(new BigDecimal(10), model.getDefaultOtherWithholdingTax());

        TaxProfile a = model.defaultOtherWithholdingTax(new BigDecimal(0));
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'enasarco'
     */
    @Test
    public void enasarcoTest() {
        assertFalse(model.getEnasarco());
        model.setEnasarco(true);
        assertTrue(model.getEnasarco());

        TaxProfile a = model.enasarco(false);
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'enasarcoType'
     */
    @Test
    public void enasarcoTypeTest() {
        assertEquals("enasarcoType", model.getEnasarcoType());
        model.setEnasarcoType("enasarcoType2");
        assertEquals("enasarcoType2", model.getEnasarcoType());

        TaxProfile a = model.enasarcoType("enasarcoType");
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'contributionsPercentage'
     */
    @Test
    public void contributionsPercentageTest() {
        assertEquals(new BigDecimal(0), model.getContributionsPercentage());
        model.setContributionsPercentage(new BigDecimal(10));
        assertEquals(new BigDecimal(10), model.getContributionsPercentage());

        TaxProfile a = model.contributionsPercentage(new BigDecimal(0));
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'profitCoefficient'
     */
    @Test
    public void profitCoefficientTest() {
        assertEquals(new BigDecimal(0), model.getProfitCoefficient());
        model.setProfitCoefficient(new BigDecimal(10));
        assertEquals(new BigDecimal(10), model.getProfitCoefficient());

        TaxProfile a = model.profitCoefficient(new BigDecimal(0));
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'med'
     */
    @Test
    public void medTest() {
        assertFalse(model.getMed());
        model.setMed(true);
        assertTrue(model.getMed());

        TaxProfile a = model.med(false);
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'defaultVat'
     */
    @Test
    public void defaultVatTest() {
        VatType vat = new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false);
        assertEquals(vat, model.getDefaultVat());
        VatType vat2 = new VatType().id(77).value(new BigDecimal(10)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false);
        model.setDefaultVat(vat2);
        assertEquals(vat2, model.getDefaultVat());

        TaxProfile a = model.defaultVat(vat);
        TaxProfile expected = new TaxProfile().companyType("individual").companySubtype("artigiani").profession("profession").regime("forfettario_5").rivalsaName("").defaultRivalsa(new BigDecimal(0)).cassaName("").defaultCassa(new BigDecimal(0)).defaultCassaTaxable(new BigDecimal(0)).cassa2Name("").defaultCassa2(new BigDecimal(0)).defaultCassa2Taxable(new BigDecimal(0)).defaultWithholdingTax(new BigDecimal(0)).defaultWithholdingTaxTaxable(new BigDecimal(100)).defaultOtherWithholdingTax(new BigDecimal(0)).enasarco(false).enasarcoType("enasarcoType").contributionsPercentage(new BigDecimal(0)).profitCoefficient(new BigDecimal(0)).med(false).defaultVat(new VatType().id(66).value(new BigDecimal(0)).description("Contribuenti forfettari").notes("Operazione non soggetta a IVA ai sensi dell'art. 1, commi 54-89, Legge n. 190/2014 e succ. modifiche/integrazioni").eInvoice(true).eiType("2.2").eiDescription("Non soggetta art. 1/54-89 L. 190/2014 e succ. modifiche/integrazioni").isDisabled(false));
        assertEquals(expected, a);
    }

}
