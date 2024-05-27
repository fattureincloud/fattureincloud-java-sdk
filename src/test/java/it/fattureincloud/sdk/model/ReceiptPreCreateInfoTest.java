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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Model tests for ReceiptPreCreateInfo */
public class ReceiptPreCreateInfoTest {
  private ReceiptPreCreateInfo model;

  @BeforeEach
  public void init() {
    HashMap<String, Integer> n2022 = new HashMap<>();
    n2022.put("fatture", 22);
    n2022.put("in", 2);
    n2022.put("cloud", 1988);
    HashMap<String, Integer> n2021 = new HashMap<>();
    n2021.put("a", 1);
    n2021.put("b", 2);
    n2021.put("c", 3);
    HashMap<String, Map<String, Integer>> numerationsTest = new HashMap<>();
    numerationsTest.put("2022", n2022);
    numerationsTest.put("2021", n2021);

    model =
        new ReceiptPreCreateInfo()
            .numerations(numerationsTest)
            .addNumerationsListItem("num")
            .addRcCentersListItem("bg")
            .addPaymentAccountsListItem(new PaymentAccount().id(1))
            .addCategoriesListItem("cat6")
            .addVatTypesListItem(new VatType().id(1));
  }

  /** Model tests for ReceiptPreCreateInfo */
  @Test
  public void testReceiptPreCreateInfo() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"numerations\":{\"2022\":{\"cloud\":1988,\"in\":2,\"fatture\":22},\"2021\":{\"a\":1,\"b\":2,\"c\":3}},\"numerations_list\":[\"num\"],\"rc_centers_list\":[\"bg\"],\"payment_accounts_list\":[{\"id\":1,\"type\":\"standard\"}],\"categories_list\":[\"cat6\"],\"vat_types_list\":[{\"id\":1}]}";
    assertEquals(str, json);
    ReceiptPreCreateInfo generated = gson.fromJson(str, ReceiptPreCreateInfo.class);
    assertEquals(model, generated);

    Object o = model;
    assertEquals(model, o);
    assertFalse(model.equals(null));
    assertFalse(model.equals(Integer.getInteger("5")));
  }

  /** Test the property 'numerations' */
  @Test
  public void numerationsTest() {
    HashMap<String, Integer> n2022 = new HashMap<>();
    n2022.put("fatture", 22);
    n2022.put("in", 2);
    n2022.put("cloud", 1988);
    HashMap<String, Integer> n2021 = new HashMap<>();
    n2021.put("a", 1);
    n2021.put("b", 2);
    n2021.put("c", 3);
    HashMap<String, Map<String, Integer>> numerationsTest = new HashMap<>();
    numerationsTest.put("2022", n2022);
    numerationsTest.put("2021", n2021);

    HashMap<String, Integer> n2019 = new HashMap<>();
    n2019.put("a", 1);

    HashMap<String, Map<String, Integer>> numerationsTest2 = new HashMap<>();
    numerationsTest2.put("2019", n2019);

    HashMap<String, Integer> n2018 = new HashMap<>();
    n2018.put("b", 999);

    HashMap<String, Map<String, Integer>> numerationsTest3 = new HashMap<>();
    numerationsTest3.put("2018", n2018);

    assertEquals(numerationsTest, model.getNumerations());
    model.setNumerations(numerationsTest2);
    assertEquals(numerationsTest2, model.getNumerations());

    ReceiptPreCreateInfo a = model.numerations(numerationsTest3);
    ReceiptPreCreateInfo expected =
        new ReceiptPreCreateInfo()
            .numerations(numerationsTest3)
            .addNumerationsListItem("num")
            .addRcCentersListItem("bg")
            .addPaymentAccountsListItem(new PaymentAccount().id(1))
            .addCategoriesListItem("cat6")
            .addVatTypesListItem(new VatType().id(1));
    assertEquals(expected, a);
  }

  /** Test the property 'numerationsList' */
  @Test
  public void numerationsListTest() {
    assertEquals(Arrays.asList("num"), model.getNumerationsList());
    model.addNumerationsListItem("mun");
    assertEquals(Arrays.asList("num", "mun"), model.getNumerationsList());

    HashMap<String, Integer> n2022 = new HashMap<>();
    n2022.put("fatture", 22);
    n2022.put("in", 2);
    n2022.put("cloud", 1988);
    HashMap<String, Integer> n2021 = new HashMap<>();
    n2021.put("a", 1);
    n2021.put("b", 2);
    n2021.put("c", 3);
    HashMap<String, Map<String, Integer>> numerationsTest = new HashMap<>();
    numerationsTest.put("2022", n2022);
    numerationsTest.put("2021", n2021);

    model.setNumerationsList(Arrays.asList("sum", "mus"));
    ReceiptPreCreateInfo a = model;
    ReceiptPreCreateInfo expected =
        new ReceiptPreCreateInfo()
            .numerations(numerationsTest)
            .addNumerationsListItem("sum")
            .addNumerationsListItem("mus")
            .addRcCentersListItem("bg")
            .addPaymentAccountsListItem(new PaymentAccount().id(1))
            .addCategoriesListItem("cat6")
            .addVatTypesListItem(new VatType().id(1));
    assertEquals(expected, a);
  }

  /** Test the property 'rcCentersList' */
  @Test
  public void rcCentersListTest() {
    assertEquals(Arrays.asList("bg"), model.getRcCentersList());
    model.addRcCentersListItem("mi");
    assertEquals(Arrays.asList("bg", "mi"), model.getRcCentersList());

    HashMap<String, Integer> n2022 = new HashMap<>();
    n2022.put("fatture", 22);
    n2022.put("in", 2);
    n2022.put("cloud", 1988);
    HashMap<String, Integer> n2021 = new HashMap<>();
    n2021.put("a", 1);
    n2021.put("b", 2);
    n2021.put("c", 3);
    HashMap<String, Map<String, Integer>> numerationsTest = new HashMap<>();
    numerationsTest.put("2022", n2022);
    numerationsTest.put("2021", n2021);

    model.setRcCentersList(Arrays.asList("bs", "sb"));
    ReceiptPreCreateInfo a = model;
    ReceiptPreCreateInfo expected =
        new ReceiptPreCreateInfo()
            .numerations(numerationsTest)
            .addNumerationsListItem("num")
            .addRcCentersListItem("bs")
            .addRcCentersListItem("sb")
            .addPaymentAccountsListItem(new PaymentAccount().id(1))
            .addCategoriesListItem("cat6")
            .addVatTypesListItem(new VatType().id(1));
    assertEquals(expected, a);
  }

  /** Test the property 'paymentAccountsList' */
  @Test
  public void paymentAccountsListTest() {
    assertEquals(Arrays.asList("bg"), model.getRcCentersList());
    model.addRcCentersListItem("mi");
    assertEquals(Arrays.asList("bg", "mi"), model.getRcCentersList());

    HashMap<String, Integer> n2022 = new HashMap<>();
    n2022.put("fatture", 22);
    n2022.put("in", 2);
    n2022.put("cloud", 1988);
    HashMap<String, Integer> n2021 = new HashMap<>();
    n2021.put("a", 1);
    n2021.put("b", 2);
    n2021.put("c", 3);
    HashMap<String, Map<String, Integer>> numerationsTest = new HashMap<>();
    numerationsTest.put("2022", n2022);
    numerationsTest.put("2021", n2021);

    model.setRcCentersList(Arrays.asList("bs", "sb"));
    ReceiptPreCreateInfo a = model;
    ReceiptPreCreateInfo expected =
        new ReceiptPreCreateInfo()
            .numerations(numerationsTest)
            .addNumerationsListItem("num")
            .addRcCentersListItem("bs")
            .addRcCentersListItem("sb")
            .addPaymentAccountsListItem(new PaymentAccount().id(1))
            .addCategoriesListItem("cat6")
            .addVatTypesListItem(new VatType().id(1));
    assertEquals(expected, a);
  }

  /** Test the property 'categoriesList' */
  @Test
  public void categoriesListTest() {
    assertEquals(Arrays.asList("cat6"), model.getCategoriesList());
    model.addCategoriesListItem("cat5");
    assertEquals(Arrays.asList("cat6", "cat5"), model.getCategoriesList());

    HashMap<String, Integer> n2022 = new HashMap<>();
    n2022.put("fatture", 22);
    n2022.put("in", 2);
    n2022.put("cloud", 1988);
    HashMap<String, Integer> n2021 = new HashMap<>();
    n2021.put("a", 1);
    n2021.put("b", 2);
    n2021.put("c", 3);
    HashMap<String, Map<String, Integer>> numerationsTest = new HashMap<>();
    numerationsTest.put("2022", n2022);
    numerationsTest.put("2021", n2021);

    model.setCategoriesList(Arrays.asList("cat7", "cat8"));
    ReceiptPreCreateInfo a = model;
    ReceiptPreCreateInfo expected =
        new ReceiptPreCreateInfo()
            .numerations(numerationsTest)
            .addNumerationsListItem("num")
            .addRcCentersListItem("bg")
            .addPaymentAccountsListItem(new PaymentAccount().id(1))
            .addCategoriesListItem("cat7")
            .addCategoriesListItem("cat8")
            .addVatTypesListItem(new VatType().id(1));
    assertEquals(expected, a);
  }

  /** Test the property 'vatTypesList' */
  @Test
  public void vatTypesListTest() {
    assertEquals(Arrays.asList(new VatType().id(1)), model.getVatTypesList());
    model.addVatTypesListItem(new VatType().id(2));
    assertEquals(Arrays.asList(new VatType().id(1), new VatType().id(2)), model.getVatTypesList());

    HashMap<String, Integer> n2022 = new HashMap<>();
    n2022.put("fatture", 22);
    n2022.put("in", 2);
    n2022.put("cloud", 1988);
    HashMap<String, Integer> n2021 = new HashMap<>();
    n2021.put("a", 1);
    n2021.put("b", 2);
    n2021.put("c", 3);
    HashMap<String, Map<String, Integer>> numerationsTest = new HashMap<>();
    numerationsTest.put("2022", n2022);
    numerationsTest.put("2021", n2021);

    model.setVatTypesList(Arrays.asList(new VatType().id(3), new VatType().id(4)));
    ReceiptPreCreateInfo a = model;
    ReceiptPreCreateInfo expected =
        new ReceiptPreCreateInfo()
            .numerations(numerationsTest)
            .addNumerationsListItem("num")
            .addRcCentersListItem("bg")
            .addPaymentAccountsListItem(new PaymentAccount().id(1))
            .addCategoriesListItem("cat6")
            .addVatTypesListItem(new VatType().id(3))
            .addVatTypesListItem(new VatType().id(4));
    assertEquals(expected, a);
  }
}
