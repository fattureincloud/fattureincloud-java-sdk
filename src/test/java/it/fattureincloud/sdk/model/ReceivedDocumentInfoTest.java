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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Model tests for ReceivedDocumentInfo */
public class ReceivedDocumentInfoTest {
  private ReceivedDocumentInfo model;

  @BeforeEach
  public void init() {
    model =
        new ReceivedDocumentInfo()
            .defaultValues(new ReceivedDocumentInfoDefaultValues().detailed(false))
            .itemsDefaultValues(
                new ReceivedDocumentInfoItemsDefaultValues().vat(BigDecimal.valueOf(10)))
            .addCountriesListItem("Italia")
            .addCurrenciesListItem(new Currency().id("EUR"))
            .addCategoriesListItem("cat6")
            .addPaymentAccountsListItem(new PaymentAccount().id(1))
            .addVatTypesListItem(new VatType().id(1));
  }

  /** Model tests for ReceivedDocumentInfo */
  @Test
  public void testReceivedDocumentInfo() {
    JSON jsonManager = new JSON();
    Gson gson = jsonManager.getGson();
    String json = gson.toJson(model);
    String str =
        "{\"default_values\":{\"detailed\":false},\"items_default_values\":{\"vat\":10},\"countries_list\":[\"Italia\"],\"currencies_list\":[{\"id\":\"EUR\"}],\"categories_list\":[\"cat6\"],\"payment_accounts_list\":[{\"id\":1,\"type\":\"standard\"}],\"vat_types_list\":[{\"id\":1}]}";
    assertEquals(str, json);
    ReceivedDocumentInfo generated = gson.fromJson(str, ReceivedDocumentInfo.class);
    assertEquals(model, generated);

    Object o = model;
    assertEquals(model, o);
    assertFalse(model.equals(null));
    assertFalse(model.equals(Integer.getInteger("5")));
  }

  /** Test the property 'defaultValues' */
  @Test
  public void defaultValuesTest() {
    assertEquals(new ReceivedDocumentInfoDefaultValues().detailed(false), model.getDefaultValues());
    model.setDefaultValues(new ReceivedDocumentInfoDefaultValues().detailed(true));
    assertEquals(new ReceivedDocumentInfoDefaultValues().detailed(true), model.getDefaultValues());

    ReceivedDocumentInfo a =
        model.defaultValues(new ReceivedDocumentInfoDefaultValues().detailed(false));
    ReceivedDocumentInfo expected =
        new ReceivedDocumentInfo()
            .defaultValues(new ReceivedDocumentInfoDefaultValues().detailed(false))
            .itemsDefaultValues(
                new ReceivedDocumentInfoItemsDefaultValues().vat(BigDecimal.valueOf(10)))
            .addCountriesListItem("Italia")
            .addCategoriesListItem("cat6")
            .addCurrenciesListItem(new Currency().id("EUR"))
            .addPaymentAccountsListItem(new PaymentAccount().id(1))
            .addVatTypesListItem(new VatType().id(1));
    assertEquals(expected, a);
  }

  /** Test the property 'itemsDefaultValues' */
  @Test
  public void itemsDefaultValuesTest() {
    assertEquals(
        new ReceivedDocumentInfoItemsDefaultValues().vat(BigDecimal.valueOf(10)),
        model.getItemsDefaultValues());
    model.setItemsDefaultValues(
        new ReceivedDocumentInfoItemsDefaultValues().vat(BigDecimal.valueOf(101)));
    assertEquals(
        new ReceivedDocumentInfoItemsDefaultValues().vat(BigDecimal.valueOf(101)),
        model.getItemsDefaultValues());

    ReceivedDocumentInfo a =
        model.itemsDefaultValues(
            new ReceivedDocumentInfoItemsDefaultValues().vat(BigDecimal.valueOf(10)));
    ReceivedDocumentInfo expected =
        new ReceivedDocumentInfo()
            .defaultValues(new ReceivedDocumentInfoDefaultValues().detailed(false))
            .itemsDefaultValues(
                new ReceivedDocumentInfoItemsDefaultValues().vat(BigDecimal.valueOf(10)))
            .addCountriesListItem("Italia")
            .addCategoriesListItem("cat6")
            .addCurrenciesListItem(new Currency().id("EUR"))
            .addPaymentAccountsListItem(new PaymentAccount().id(1))
            .addVatTypesListItem(new VatType().id(1));
    assertEquals(expected, a);
  }

  /** Test the property 'countriesList' */
  @Test
  public void countriesListTest() {
    assertEquals(Arrays.asList("Italia"), model.getCountriesList());
    model.addCountriesListItem("Albania");
    assertEquals(Arrays.asList("Italia", "Albania"), model.getCountriesList());

    model.setCountriesList(Arrays.asList("Spagna", "Malta"));
    ReceivedDocumentInfo a =
        model.itemsDefaultValues(
            new ReceivedDocumentInfoItemsDefaultValues().vat(BigDecimal.valueOf(10)));
    ReceivedDocumentInfo expected =
        new ReceivedDocumentInfo()
            .defaultValues(new ReceivedDocumentInfoDefaultValues().detailed(false))
            .itemsDefaultValues(
                new ReceivedDocumentInfoItemsDefaultValues().vat(BigDecimal.valueOf(10)))
            .addCountriesListItem("Spagna")
            .addCountriesListItem("Malta")
            .addCurrenciesListItem(new Currency().id("EUR"))
            .addCategoriesListItem("cat6")
            .addPaymentAccountsListItem(new PaymentAccount().id(1))
            .addVatTypesListItem(new VatType().id(1));
    assertEquals(expected, a);
  }

  /** Test the property 'currenciesList' */
  @Test
  public void currenciesListTest() {
    assertEquals(Arrays.asList(new Currency().id("EUR")), model.getCurrenciesList());
    model.addCurrenciesListItem(new Currency().id("USD"));
    assertEquals(
        Arrays.asList(new Currency().id("EUR"), new Currency().id("USD")),
        model.getCurrenciesList());
    List<Currency> currencyList = new ArrayList<Currency>();
    currencyList.add(new Currency().id("DNR"));
    currencyList.add(new Currency().id("AMR"));
    model.setCurrenciesList(currencyList);

    ReceivedDocumentInfo a = model;
    ReceivedDocumentInfo expected =
        new ReceivedDocumentInfo()
            .defaultValues(new ReceivedDocumentInfoDefaultValues().detailed(false))
            .itemsDefaultValues(
                new ReceivedDocumentInfoItemsDefaultValues().vat(BigDecimal.valueOf(10)))
            .addCountriesListItem("Italia")
            .addCategoriesListItem("cat6")
            .addCurrenciesListItem(new Currency().id("DNR"))
            .addCurrenciesListItem(new Currency().id("AMR"))
            .addPaymentAccountsListItem(new PaymentAccount().id(1))
            .addVatTypesListItem(new VatType().id(1));
    assertEquals(expected, a);
  }

  /** Test the property 'categoriesList' */
  @Test
  public void categoriesListTest() {
    assertEquals(Arrays.asList("cat6"), model.getCategoriesList());
    model.addCategoriesListItem("cat5");
    assertEquals(Arrays.asList("cat6", "cat5"), model.getCategoriesList());

    model.setCategoriesList(Arrays.asList("cat7", "cat8"));
    ReceivedDocumentInfo a = model;
    ReceivedDocumentInfo expected =
        new ReceivedDocumentInfo()
            .defaultValues(new ReceivedDocumentInfoDefaultValues().detailed(false))
            .itemsDefaultValues(
                new ReceivedDocumentInfoItemsDefaultValues().vat(BigDecimal.valueOf(10)))
            .addCountriesListItem("Italia")
            .addCategoriesListItem("cat7")
            .addCategoriesListItem("cat8")
            .addCurrenciesListItem(new Currency().id("EUR"))
            .addPaymentAccountsListItem(new PaymentAccount().id(1))
            .addVatTypesListItem(new VatType().id(1));
    assertEquals(expected, a);
  }

  /** Test the property 'paymentAccountsList' */
  @Test
  public void paymentAccountsListTest() {
    assertEquals(Arrays.asList(new PaymentAccount().id(1)), model.getPaymentAccountsList());
    model.addPaymentAccountsListItem(new PaymentAccount().id(2));
    assertEquals(
        Arrays.asList(new PaymentAccount().id(1), new PaymentAccount().id(2)),
        model.getPaymentAccountsList());

    model.setPaymentAccountsList(
        Arrays.asList(new PaymentAccount().id(3), new PaymentAccount().id(4)));
    ReceivedDocumentInfo a = model;
    ReceivedDocumentInfo expected =
        new ReceivedDocumentInfo()
            .defaultValues(new ReceivedDocumentInfoDefaultValues().detailed(false))
            .itemsDefaultValues(
                new ReceivedDocumentInfoItemsDefaultValues().vat(BigDecimal.valueOf(10)))
            .addCountriesListItem("Italia")
            .addCategoriesListItem("cat6")
            .addCurrenciesListItem(new Currency().id("EUR"))
            .addPaymentAccountsListItem(new PaymentAccount().id(3))
            .addPaymentAccountsListItem(new PaymentAccount().id(4))
            .addVatTypesListItem(new VatType().id(1));
    assertEquals(expected, a);
  }

  /** Test the property 'vatTypesList' */
  @Test
  public void vatTypesListTest() {
    assertEquals(Arrays.asList(new VatType().id(1)), model.getVatTypesList());
    model.addVatTypesListItem(new VatType().id(2));
    assertEquals(Arrays.asList(new VatType().id(1), new VatType().id(2)), model.getVatTypesList());

    model.setVatTypesList(Arrays.asList(new VatType().id(3), new VatType().id(4)));
    ReceivedDocumentInfo a = model;
    ReceivedDocumentInfo expected =
        new ReceivedDocumentInfo()
            .defaultValues(new ReceivedDocumentInfoDefaultValues().detailed(false))
            .itemsDefaultValues(
                new ReceivedDocumentInfoItemsDefaultValues().vat(BigDecimal.valueOf(10)))
            .addCountriesListItem("Italia")
            .addCategoriesListItem("cat6")
            .addCurrenciesListItem(new Currency().id("EUR"))
            .addPaymentAccountsListItem(new PaymentAccount().id(1))
            .addVatTypesListItem(new VatType().id(3))
            .addVatTypesListItem(new VatType().id(4));
    assertEquals(expected, a);
  }
}
