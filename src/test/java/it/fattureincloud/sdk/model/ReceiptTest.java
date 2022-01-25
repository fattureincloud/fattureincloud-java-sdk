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

import com.google.gson.Gson;
import it.fattureincloud.sdk.JSON;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for Receipt
 */
public class ReceiptTest {
    private Receipt model;

    @BeforeEach
    public void init() {
        model = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));

    }

    /**
     * Model tests for Receipt
     */
    @Test
    public void testReceipt() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"id\":10,\"date\":\"2021-12-25\",\"number\":10,\"numeration\":\"num\",\"amount_net\":10,\"amount_vat\":10,\"amount_gross\":10,\"use_gross_prices\":true,\"type\":\"till_receipt\",\"description\":\"descr\",\"rc_center\":\"bg\",\"created_at\":\"2021-10-10\",\"updated_at\":\"2021-10-10\",\"payment_account\":{\"id\":1,\"type\":\"standard\"},\"items_list\":[{\"id\":1}]}";
        assertEquals(str, json);
        Receipt generated = gson.fromJson(str, Receipt.class);
        assertEquals(model, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        assertEquals(10, model.getId());
        model.setId(11);
        assertEquals(11, model.getId());

        Receipt a = model.id(10);
        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'date'
     */
    @Test
    public void dateTest() {
        assertEquals(LocalDate.of(2021, 12, 25), model.getDate());
        model.setDate(LocalDate.of(2021, 12, 26));
        assertEquals(LocalDate.of(2021, 12, 26), model.getDate());

        Receipt a = model.date(LocalDate.of(2021, 12, 25));
        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'number'
     */
    @Test
    public void numberTest() {
        assertEquals(BigDecimal.valueOf(10), model.getNumber());
        model.setNumber(BigDecimal.valueOf(11));
        assertEquals(BigDecimal.valueOf(11), model.getNumber());

        Receipt a = model.number(BigDecimal.valueOf(10));
        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'numeration'
     */
    @Test
    public void numerationTest() {
        assertEquals("num", model.getNumeration());
        model.setNumeration("numV2");
        assertEquals("numV2", model.getNumeration());

        Receipt a = model.numeration("num");
        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'amountNet'
     */
    @Test
    public void amountNetTest() {
        assertEquals(BigDecimal.valueOf(10), model.getAmountNet());
        model.setAmountNet(BigDecimal.valueOf(11));
        assertEquals(BigDecimal.valueOf(11), model.getAmountNet());

        Receipt a = model.amountNet(BigDecimal.valueOf(10));
        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'amountVat'
     */
    @Test
    public void amountVatTest() {
        assertEquals(BigDecimal.valueOf(10), model.getAmountVat());
        model.setAmountVat(BigDecimal.valueOf(11));
        assertEquals(BigDecimal.valueOf(11), model.getAmountVat());

        Receipt a = model.amountVat(BigDecimal.valueOf(10));
        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'amountGross'
     */
    @Test
    public void amountGrossTest() {
        assertEquals(BigDecimal.valueOf(10), model.getAmountGross());
        model.setAmountGross(BigDecimal.valueOf(11));
        assertEquals(BigDecimal.valueOf(11), model.getAmountGross());

        Receipt a = model.amountGross(BigDecimal.valueOf(10));
        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'useGrossPrices'
     */
    @Test
    public void useGrossPricesTest() {
        assertEquals(true, model.getUseGrossPrices());
        model.setUseGrossPrices(false);
        assertEquals(false, model.getUseGrossPrices());

        Receipt a = model.useGrossPrices(true);
        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        assertEquals(ReceiptType.TILL_RECEIPT, model.getType());
        model.setType(ReceiptType.SALES_RECEIPT);
        assertEquals(ReceiptType.SALES_RECEIPT, model.getType());

        Receipt a = model.type(ReceiptType.TILL_RECEIPT);
        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        assertEquals("descr", model.getDescription());
        model.setDescription("descrV2");
        assertEquals("descrV2", model.getDescription());

        Receipt a = model.description("descr");
        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'rcCenter'
     */
    @Test
    public void rcCenterTest() {
        assertEquals("bg", model.getRcCenter());
        model.setRcCenter("mi");
        assertEquals("mi", model.getRcCenter());

        Receipt a = model.rcCenter("bg");
        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        assertEquals("2021-10-10", model.getCreatedAt());
        model.setCreatedAt("2021-10-11");
        assertEquals("2021-10-11", model.getCreatedAt());

        Receipt a = model.createdAt("2021-10-10");
        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        assertEquals("2021-10-10", model.getUpdatedAt());
        model.setUpdatedAt("2021-10-11");
        assertEquals("2021-10-11", model.getUpdatedAt());

        Receipt a = model.updatedAt("2021-10-10");
        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'paymentAccount'
     */
    @Test
    public void paymentAccountTest() {
        assertEquals(new PaymentAccount().id(1), model.getPaymentAccount());
        model.setPaymentAccount(new PaymentAccount().id(2));
        assertEquals(new PaymentAccount().id(2), model.getPaymentAccount());

        Receipt a = model.paymentAccount(new PaymentAccount().id(1));
        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(1));
        assertEquals(expected, a);
    }

    /**
     * Test the property 'itemsList'
     */
    @Test
    public void itemsListTest() {
        assertEquals(Arrays.asList(new ReceiptItemsListItem().id(1)), model.getItemsList());
        model.addItemsListItem(new ReceiptItemsListItem().id(2));
        assertEquals(Arrays.asList(new ReceiptItemsListItem().id(1), new ReceiptItemsListItem().id(2)), model.getItemsList());

        model.setItemsList(Arrays.asList(new ReceiptItemsListItem().id(3), new ReceiptItemsListItem().id(4)));
        Receipt a = model.paymentAccount(new PaymentAccount().id(1));
        Receipt expected = new Receipt()
                .id(10)
                .date(LocalDate.of(2021, 12, 25))
                .number(BigDecimal.valueOf(10))
                .numeration("num")
                .amountNet(BigDecimal.valueOf(10))
                .amountVat(BigDecimal.valueOf(10))
                .amountGross(BigDecimal.valueOf(10))
                .useGrossPrices(true)
                .type(ReceiptType.TILL_RECEIPT)
                .description("descr")
                .rcCenter("bg")
                .createdAt("2021-10-10")
                .updatedAt("2021-10-10")
                .paymentAccount(new PaymentAccount().id(1))
                .addItemsListItem(new ReceiptItemsListItem().id(3))
                .addItemsListItem(new ReceiptItemsListItem().id(4));
        assertEquals(expected, a);
    }

}
