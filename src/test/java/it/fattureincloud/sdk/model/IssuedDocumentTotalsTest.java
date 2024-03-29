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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import com.google.gson.Gson;
import it.fattureincloud.sdk.JSON;
import java.math.BigDecimal;
import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Model tests for IssuedDocumentTotals */
public class IssuedDocumentTotalsTest {
  private IssuedDocumentTotals model;

  @BeforeEach
  public void init() {
    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    model =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
  }

  /** Model tests for IssuedDocumentTotals */
  @Test
  public void testIssuedDocumentTotals() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"amount_net\":10,\"amount_rivalsa\":10,\"amount_net_with_rivalsa\":10,\"amount_cassa\":10,\"taxable_amount\":10,\"not_taxable_amount\":10,\"amount_vat\":10,\"amount_gross\":10,\"taxable_amount_withholding_tax\":10,\"amount_withholding_tax\":10,\"taxable_amount_other_withholding_tax\":10,\"amount_other_withholding_tax\":10,\"stamp_duty\":10,\"amount_due\":10,\"is_enasarco_maximal_exceeded\":true,\"payments_sum\":10,\"vat_list\":{\"22\":{\"amount_net\":12}}}";
    assertEquals(str, json);
    IssuedDocumentTotals generated = gson.fromJson(str, IssuedDocumentTotals.class);
    assertEquals(model, generated);

    Object o = model;
    assertEquals(model, o);
    assertFalse(model.equals(null));
    assertFalse(model.equals(Integer.getInteger("5")));
  }

  /** Test the property 'amountNet' */
  @Test
  public void amountNetTest() {
    assertEquals(BigDecimal.valueOf(10), model.getAmountNet());
    model.setAmountNet(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getAmountNet());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.amountNet(BigDecimal.valueOf(10));
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'amountRivalsa' */
  @Test
  public void amountRivalsaTest() {
    assertEquals(BigDecimal.valueOf(10), model.getAmountRivalsa());
    model.setAmountRivalsa(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getAmountRivalsa());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.amountRivalsa(BigDecimal.valueOf(10));
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'amountNetWithRivalsa' */
  @Test
  public void amountNetWithRivalsaTest() {
    assertEquals(BigDecimal.valueOf(10), model.getAmountNetWithRivalsa());
    model.setAmountNetWithRivalsa(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getAmountNetWithRivalsa());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.amountNetWithRivalsa(BigDecimal.valueOf(10));
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'amountCassa' */
  @Test
  public void amountCassaTest() {
    assertEquals(BigDecimal.valueOf(10), model.getAmountCassa());
    model.setAmountCassa(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getAmountCassa());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.amountCassa(BigDecimal.valueOf(10));
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'taxableAmount' */
  @Test
  public void taxableAmountTest() {
    assertEquals(BigDecimal.valueOf(10), model.getTaxableAmount());
    model.setTaxableAmount(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getTaxableAmount());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.taxableAmount(BigDecimal.valueOf(10));
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'notTaxableAmount' */
  @Test
  public void notTaxableAmountTest() {
    assertEquals(BigDecimal.valueOf(10), model.getNotTaxableAmount());
    model.setNotTaxableAmount(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getNotTaxableAmount());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.notTaxableAmount(BigDecimal.valueOf(10));
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'amountVat' */
  @Test
  public void amountVatTest() {
    assertEquals(BigDecimal.valueOf(10), model.getAmountVat());
    model.setAmountVat(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getAmountVat());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.amountVat(BigDecimal.valueOf(10));
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'amountGross' */
  @Test
  public void amountGrossTest() {
    assertEquals(BigDecimal.valueOf(10), model.getAmountGross());
    model.setAmountGross(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getAmountGross());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.amountGross(BigDecimal.valueOf(10));
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'taxableAmountWithholdingTax' */
  @Test
  public void taxableAmountWithholdingTaxTest() {
    assertEquals(BigDecimal.valueOf(10), model.getTaxableAmountWithholdingTax());
    model.setTaxableAmountWithholdingTax(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getTaxableAmountWithholdingTax());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.taxableAmountWithholdingTax(BigDecimal.valueOf(10));
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'amountWithholdingTax' */
  @Test
  public void amountWithholdingTaxTest() {
    assertEquals(BigDecimal.valueOf(10), model.getAmountWithholdingTax());
    model.setAmountWithholdingTax(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getAmountWithholdingTax());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.amountWithholdingTax(BigDecimal.valueOf(10));
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'taxableAmountOtherWithholdingTax' */
  @Test
  public void taxableAmountOtherWithholdingTaxTest() {
    assertEquals(BigDecimal.valueOf(10), model.getTaxableAmountOtherWithholdingTax());
    model.setTaxableAmountOtherWithholdingTax(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getTaxableAmountOtherWithholdingTax());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10));
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'amountOtherWithholdingTax' */
  @Test
  public void amountOtherWithholdingTaxTest() {
    assertEquals(BigDecimal.valueOf(10), model.getAmountOtherWithholdingTax());
    model.setAmountOtherWithholdingTax(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getAmountOtherWithholdingTax());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.amountOtherWithholdingTax(BigDecimal.valueOf(10));
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'stampDuty' */
  @Test
  public void stampDutyTest() {
    assertEquals(BigDecimal.valueOf(10), model.getStampDuty());
    model.setStampDuty(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getStampDuty());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.stampDuty(BigDecimal.valueOf(10));
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'amountDue' */
  @Test
  public void amountDueTest() {
    assertEquals(BigDecimal.valueOf(10), model.getAmountDue());
    model.setAmountDue(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getAmountDue());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.amountDue(BigDecimal.valueOf(10));
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'isEnasarcoMaximalExceeded' */
  @Test
  public void isEnasarcoMaximalExceededTest() {
    assertEquals(true, model.getIsEnasarcoMaximalExceeded());
    model.setIsEnasarcoMaximalExceeded(false);
    assertEquals(false, model.getIsEnasarcoMaximalExceeded());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.isEnasarcoMaximalExceeded(true);
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'paymentsSum' */
  @Test
  public void paymentsSumTest() {
    assertEquals(BigDecimal.valueOf(10), model.getPaymentsSum());
    model.setPaymentsSum(BigDecimal.valueOf(100));
    assertEquals(BigDecimal.valueOf(100), model.getPaymentsSum());

    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(10)).amountNet(BigDecimal.valueOf(12)));

    IssuedDocumentTotals i = model.paymentsSum(BigDecimal.valueOf(10));
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest);
    assertEquals(expected, i);
  }

  /** Test the property 'vatList' */
  @Test
  public void vatListTest() {
    HashMap<String, VatItem> vatListTest = new HashMap<>();
    vatListTest.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(2)).amountNet(BigDecimal.valueOf(12)));

    HashMap<String, VatItem> vatListTest2 = new HashMap<>();
    vatListTest2.put(
        "22", new VatItem().amountNet(BigDecimal.valueOf(2)).amountNet(BigDecimal.valueOf(88)));
    vatListTest2.put(
        "69", new VatItem().amountNet(BigDecimal.valueOf(99)).amountNet(BigDecimal.valueOf(66)));

    HashMap<String, VatItem> vatListTest3 = new HashMap<>();
    vatListTest3.put(
        "1", new VatItem().amountNet(BigDecimal.valueOf(2)).amountNet(BigDecimal.valueOf(3)));

    assertEquals(vatListTest, model.getVatList());
    model.setVatList(vatListTest2);
    assertEquals(vatListTest2, model.getVatList());

    IssuedDocumentTotals i = model.vatList(vatListTest3);
    IssuedDocumentTotals expected =
        new IssuedDocumentTotals()
            .amountNet(BigDecimal.valueOf(10))
            .amountRivalsa(BigDecimal.valueOf(10))
            .amountNetWithRivalsa(BigDecimal.valueOf(10))
            .amountCassa(BigDecimal.valueOf(10))
            .taxableAmount(BigDecimal.valueOf(10))
            .notTaxableAmount(BigDecimal.valueOf(10))
            .amountVat(BigDecimal.valueOf(10))
            .amountGross(BigDecimal.valueOf(10))
            .taxableAmountWithholdingTax(BigDecimal.valueOf(10))
            .amountWithholdingTax(BigDecimal.valueOf(10))
            .taxableAmountOtherWithholdingTax(BigDecimal.valueOf(10))
            .amountOtherWithholdingTax(BigDecimal.valueOf(10))
            .stampDuty((BigDecimal.valueOf(10)))
            .amountDue((BigDecimal.valueOf(10)))
            .isEnasarcoMaximalExceeded(true)
            .paymentsSum((BigDecimal.valueOf(10)))
            .vatList(vatListTest3);
    assertEquals(expected, i);
  }
}
