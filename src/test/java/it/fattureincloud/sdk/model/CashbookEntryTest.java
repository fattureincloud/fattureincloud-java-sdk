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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.fattureincloud.sdk.model.CashbookEntryDataDocument;
import it.fattureincloud.sdk.model.CashbookEntryIn;
import it.fattureincloud.sdk.model.CashbookEntryKind;
import it.fattureincloud.sdk.model.CashbookEntryOut;
import it.fattureincloud.sdk.model.CashbookEntryType;
import it.fattureincloud.sdk.model.PaymentAccount;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.openapitools.jackson.nullable.JsonNullable;


/**
 * Model tests for CashbookEntry
 */
public class CashbookEntryTest {
    private final CashbookEntry model = new CashbookEntry();

    /**
     * Model tests for CashbookEntry
     */
    @Test
    public void testCashbookEntry() {
        // TODO: test CashbookEntry
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'date'
     */
    @Test
    public void dateTest() {
        // TODO: test date
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'kind'
     */
    @Test
    public void kindTest() {
        // TODO: test kind
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'entityName'
     */
    @Test
    public void entityNameTest() {
        // TODO: test entityName
    }

    /**
     * Test the property 'document'
     */
    @Test
    public void documentTest() {
        // TODO: test document
    }

    /**
     * Test the property 'amountIn'
     */
    @Test
    public void amountInTest() {
        // TODO: test amountIn
    }

    /**
     * Test the property 'paymentAccountIn'
     */
    @Test
    public void paymentAccountInTest() {
        // TODO: test paymentAccountIn
    }

    /**
     * Test the property 'amountOut'
     */
    @Test
    public void amountOutTest() {
        // TODO: test amountOut
    }

    /**
     * Test the property 'paymentAccountOut'
     */
    @Test
    public void paymentAccountOutTest() {
        // TODO: test paymentAccountOut
    }

}
