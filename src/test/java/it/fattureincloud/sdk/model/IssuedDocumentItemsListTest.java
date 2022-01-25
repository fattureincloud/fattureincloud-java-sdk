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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for IssuedDocumentItemsList
 */
public class IssuedDocumentItemsListTest {
    private IssuedDocumentItemsList model;

    @BeforeEach
    public void init() {
        model = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
    }

    /**
     * Model tests for IssuedDocumentItemsList
     */
    @Test
    public void testIssuedDocumentItemsList() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"product_id\":12345,\"code\":\"cod3\",\"name\":\"prodott1\",\"category\":\"cat5\",\"description\":\"primo\",\"qty\":99,\"measure\":\"big\",\"net_price\":10,\"gross_price\":10,\"vat\":{\"id\":1,\"editable\":true},\"not_taxable\":true,\"apply_withholding_taxes\":true,\"discount\":0,\"discount_highlight\":true,\"in_ddt\":true,\"stock\":true}";
        assertEquals(str, json);
        IssuedDocumentItemsList generated = gson.fromJson(str, IssuedDocumentItemsList.class);
        assertEquals(model, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'productId'
     */
    @Test
    public void productIdTest() {
        assertEquals(12345, model.getProductId());
        model.setProductId(33333);
        assertEquals(33333, model.getProductId());

        IssuedDocumentItemsList a = model.productId(12345);
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

    /**
     * Test the property 'code'
     */
    @Test
    public void codeTest() {
        assertEquals("cod3", model.getCode());
        model.setCode("33333");
        assertEquals("33333", model.getCode());

        IssuedDocumentItemsList a = model.code("cod3");
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        assertEquals("prodott1", model.getName());
        model.setName("prodott2");
        assertEquals("prodott2", model.getName());

        IssuedDocumentItemsList a = model.name("prodott1");
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        assertEquals("primo", model.getDescription());
        model.setDescription("sec");
        assertEquals("sec", model.getDescription());

        IssuedDocumentItemsList a = model.description("primo");
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

    /**
     * Test the property 'category'
     */
    @Test
    public void categoryTest() {
        assertEquals("cat5", model.getCategory());
        model.setCategory("cat6");
        assertEquals("cat6", model.getCategory());

        IssuedDocumentItemsList a = model.category("cat5");
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }
    
    /**
     * Test the property 'qty'
     */
    @Test
    public void qtyTest() {
        assertEquals(BigDecimal.valueOf(99), model.getQty());
        model.setQty(BigDecimal.valueOf(100));
        assertEquals(BigDecimal.valueOf(100), model.getQty());

        IssuedDocumentItemsList a = model.qty(BigDecimal.valueOf(99));
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

    /**
     * Test the property 'measure'
     */
    @Test
    public void measureTest() {
        assertEquals("big", model.getMeasure());
        model.setMeasure("small");
        assertEquals("small", model.getMeasure());

        IssuedDocumentItemsList a = model.measure("big");
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

    /**
     * Test the property 'netPrice'
     */
    @Test
    public void netPriceTest() {
        assertEquals(BigDecimal.valueOf(10), model.getNetPrice());
        model.setNetPrice(BigDecimal.valueOf(100));
        assertEquals(BigDecimal.valueOf(100), model.getNetPrice());

        IssuedDocumentItemsList a = model.netPrice(BigDecimal.valueOf(10));
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

    /**
     * Test the property 'grossPrice'
     */
    @Test
    public void grossPriceTest() {
        assertEquals(BigDecimal.valueOf(10), model.getGrossPrice());
        model.setGrossPrice(BigDecimal.valueOf(100));
        assertEquals(BigDecimal.valueOf(100), model.getGrossPrice());

        IssuedDocumentItemsList a = model.grossPrice(BigDecimal.valueOf(10));
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

    /**
     * Test the property 'vat'
     */
    @Test
    public void vatTest() {
        assertEquals(new VatType().id(1), model.getVat());
        model.setVat(new VatType().id(11));
        assertEquals(new VatType().id(11), model.getVat());

        IssuedDocumentItemsList a = model.vat(new VatType().id(1));
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

    /**
     * Test the property 'notTaxable'
     */
    @Test
    public void notTaxableTest() {
        assertEquals(true, model.getNotTaxable());
        model.setNotTaxable(false);
        assertEquals(false, model.getNotTaxable());

        IssuedDocumentItemsList a = model.notTaxable(true);
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

    /**
     * Test the property 'applyWithholdingTaxes'
     */
    @Test
    public void applyWithholdingTaxesTest() {
        assertEquals(true, model.getApplyWithholdingTaxes());
        model.setApplyWithholdingTaxes(false);
        assertEquals(false, model.getApplyWithholdingTaxes());

        IssuedDocumentItemsList a = model.applyWithholdingTaxes(true);
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

    /**
     * Test the property 'discount'
     */
    @Test
    public void discountTest() {
        assertEquals(BigDecimal.valueOf(0), model.getDiscount());
        model.setDiscount(BigDecimal.valueOf(10));
        assertEquals(BigDecimal.valueOf(10), model.getDiscount());

        IssuedDocumentItemsList a = model.discount(BigDecimal.valueOf(0));
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

    /**
     * Test the property 'discountHighlight'
     */
    @Test
    public void discountHighlightTest() {
        assertEquals(true, model.getDiscountHighlight());
        model.setDiscountHighlight(false);
        assertEquals(false, model.getDiscountHighlight());

        IssuedDocumentItemsList a = model.discountHighlight(true);
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

    /**
     * Test the property 'inDdt'
     */
    @Test
    public void inDdtTest() {
        assertEquals(true, model.getInDdt());
        model.setInDdt(false);
        assertEquals(false, model.getInDdt());

        IssuedDocumentItemsList a = model.inDdt(true);
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

    /**
     * Test the property 'stock'
     */
    @Test
    public void stockTest() {
        assertEquals(true, model.getStock());
        model.setStock(false);
        assertEquals(false, model.getStock());

        IssuedDocumentItemsList a = model.stock(true);
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

    /**
     * Test the property 'eiRaw'
     */
    @Test
    public void eiRawTest() {
        assertEquals(null, model.getEiRaw());
        model.setEiRaw(false);
        assertEquals(false, model.getEiRaw());

        IssuedDocumentItemsList a = model.eiRaw(null);
        IssuedDocumentItemsList expected = new IssuedDocumentItemsList()
                .productId(12345)
                .code("cod3")
                .name("prodott1")
                .description("primo")
                .category("cat5")
                .qty(BigDecimal.valueOf(99))
                .measure("big")
                .netPrice(BigDecimal.valueOf(10))
                .grossPrice(BigDecimal.valueOf(10))
                .notTaxable(true)
                .applyWithholdingTaxes(true)
                .discount(BigDecimal.valueOf(0))
                .discountHighlight(true)
                .inDdt(true)
                .stock(true)
                .vat(new VatType()
                        .id(1)
                )
                .eiRaw(null);
        assertEquals(expected, a);
    }

}
