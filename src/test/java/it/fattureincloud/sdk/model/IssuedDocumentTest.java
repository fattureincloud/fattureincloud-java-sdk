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
import it.fattureincloud.sdk.model.Currency;
import it.fattureincloud.sdk.model.DocumentTemplate;
import it.fattureincloud.sdk.model.Entity;
import it.fattureincloud.sdk.model.IssuedDocumentEiData;
import it.fattureincloud.sdk.model.IssuedDocumentExtraData;
import it.fattureincloud.sdk.model.IssuedDocumentItemsList;
import it.fattureincloud.sdk.model.IssuedDocumentPaymentsList;
import it.fattureincloud.sdk.model.IssuedDocumentRefersTo;
import it.fattureincloud.sdk.model.IssuedDocumentType;
import it.fattureincloud.sdk.model.Language;
import it.fattureincloud.sdk.model.PaymentMethod;
import it.fattureincloud.sdk.model.ShowTotalsMode;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for IssuedDocument
 */
public class IssuedDocumentTest {
    private final IssuedDocument model = new IssuedDocument();

    /**
     * Model tests for IssuedDocument
     */
    @Test
    public void testIssuedDocument() {
        // TODO: test IssuedDocument
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'entity'
     */
    @Test
    public void entityTest() {
        // TODO: test entity
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'number'
     */
    @Test
    public void numberTest() {
        // TODO: test number
    }

    /**
     * Test the property 'numeration'
     */
    @Test
    public void numerationTest() {
        // TODO: test numeration
    }

    /**
     * Test the property 'date'
     */
    @Test
    public void dateTest() {
        // TODO: test date
    }

    /**
     * Test the property 'currency'
     */
    @Test
    public void currencyTest() {
        // TODO: test currency
    }

    /**
     * Test the property 'language'
     */
    @Test
    public void languageTest() {
        // TODO: test language
    }

    /**
     * Test the property 'subject'
     */
    @Test
    public void subjectTest() {
        // TODO: test subject
    }

    /**
     * Test the property 'visibleSubject'
     */
    @Test
    public void visibleSubjectTest() {
        // TODO: test visibleSubject
    }

    /**
     * Test the property 'rcCenter'
     */
    @Test
    public void rcCenterTest() {
        // TODO: test rcCenter
    }

    /**
     * Test the property 'notes'
     */
    @Test
    public void notesTest() {
        // TODO: test notes
    }

    /**
     * Test the property 'rivalsa'
     */
    @Test
    public void rivalsaTest() {
        // TODO: test rivalsa
    }

    /**
     * Test the property 'cassa'
     */
    @Test
    public void cassaTest() {
        // TODO: test cassa
    }

    /**
     * Test the property 'withholdingTax'
     */
    @Test
    public void withholdingTaxTest() {
        // TODO: test withholdingTax
    }

    /**
     * Test the property 'withholdingTaxTaxable'
     */
    @Test
    public void withholdingTaxTaxableTest() {
        // TODO: test withholdingTaxTaxable
    }

    /**
     * Test the property 'otherWithholdingTax'
     */
    @Test
    public void otherWithholdingTaxTest() {
        // TODO: test otherWithholdingTax
    }

    /**
     * Test the property 'stampDuty'
     */
    @Test
    public void stampDutyTest() {
        // TODO: test stampDuty
    }

    /**
     * Test the property 'paymentMethod'
     */
    @Test
    public void paymentMethodTest() {
        // TODO: test paymentMethod
    }

    /**
     * Test the property 'useSplitPayment'
     */
    @Test
    public void useSplitPaymentTest() {
        // TODO: test useSplitPayment
    }

    /**
     * Test the property 'useGrossPrices'
     */
    @Test
    public void useGrossPricesTest() {
        // TODO: test useGrossPrices
    }

    /**
     * Test the property 'eInvoice'
     */
    @Test
    public void eInvoiceTest() {
        // TODO: test eInvoice
    }

    /**
     * Test the property 'eiData'
     */
    @Test
    public void eiDataTest() {
        // TODO: test eiData
    }

    /**
     * Test the property 'itemsList'
     */
    @Test
    public void itemsListTest() {
        // TODO: test itemsList
    }

    /**
     * Test the property 'paymentsList'
     */
    @Test
    public void paymentsListTest() {
        // TODO: test paymentsList
    }

    /**
     * Test the property 'template'
     */
    @Test
    public void templateTest() {
        // TODO: test template
    }

    /**
     * Test the property 'deliveryNoteTemplate'
     */
    @Test
    public void deliveryNoteTemplateTest() {
        // TODO: test deliveryNoteTemplate
    }

    /**
     * Test the property 'accInvTemplate'
     */
    @Test
    public void accInvTemplateTest() {
        // TODO: test accInvTemplate
    }

    /**
     * Test the property 'hMargins'
     */
    @Test
    public void hMarginsTest() {
        // TODO: test hMargins
    }

    /**
     * Test the property 'showPayments'
     */
    @Test
    public void showPaymentsTest() {
        // TODO: test showPayments
    }

    /**
     * Test the property 'showPaymentMethod'
     */
    @Test
    public void showPaymentMethodTest() {
        // TODO: test showPaymentMethod
    }

    /**
     * Test the property 'showTotals'
     */
    @Test
    public void showTotalsTest() {
        // TODO: test showTotals
    }

    /**
     * Test the property 'vMargins'
     */
    @Test
    public void vMarginsTest() {
        // TODO: test vMargins
    }

    /**
     * Test the property 'showPaypalButton'
     */
    @Test
    public void showPaypalButtonTest() {
        // TODO: test showPaypalButton
    }

    /**
     * Test the property 'showNotificationButton'
     */
    @Test
    public void showNotificationButtonTest() {
        // TODO: test showNotificationButton
    }

    /**
     * Test the property 'deliveryNote'
     */
    @Test
    public void deliveryNoteTest() {
        // TODO: test deliveryNote
    }

    /**
     * Test the property 'accompanyingInvoice'
     */
    @Test
    public void accompanyingInvoiceTest() {
        // TODO: test accompanyingInvoice
    }

    /**
     * Test the property 'dnNumber'
     */
    @Test
    public void dnNumberTest() {
        // TODO: test dnNumber
    }

    /**
     * Test the property 'dnDate'
     */
    @Test
    public void dnDateTest() {
        // TODO: test dnDate
    }

    /**
     * Test the property 'dnAiPackagesNumber'
     */
    @Test
    public void dnAiPackagesNumberTest() {
        // TODO: test dnAiPackagesNumber
    }

    /**
     * Test the property 'dnAiWeight'
     */
    @Test
    public void dnAiWeightTest() {
        // TODO: test dnAiWeight
    }

    /**
     * Test the property 'dnAiCausal'
     */
    @Test
    public void dnAiCausalTest() {
        // TODO: test dnAiCausal
    }

    /**
     * Test the property 'dnAiDestination'
     */
    @Test
    public void dnAiDestinationTest() {
        // TODO: test dnAiDestination
    }

    /**
     * Test the property 'dnAiTransporter'
     */
    @Test
    public void dnAiTransporterTest() {
        // TODO: test dnAiTransporter
    }

    /**
     * Test the property 'dnAiNotes'
     */
    @Test
    public void dnAiNotesTest() {
        // TODO: test dnAiNotes
    }

    /**
     * Test the property 'refersTo'
     */
    @Test
    public void refersToTest() {
        // TODO: test refersTo
    }

    /**
     * Test the property 'isMarked'
     */
    @Test
    public void isMarkedTest() {
        // TODO: test isMarked
    }

    /**
     * Test the property 'amountNet'
     */
    @Test
    public void amountNetTest() {
        // TODO: test amountNet
    }

    /**
     * Test the property 'amountVat'
     */
    @Test
    public void amountVatTest() {
        // TODO: test amountVat
    }

    /**
     * Test the property 'amountGross'
     */
    @Test
    public void amountGrossTest() {
        // TODO: test amountGross
    }

    /**
     * Test the property 'amountRivalsa'
     */
    @Test
    public void amountRivalsaTest() {
        // TODO: test amountRivalsa
    }

    /**
     * Test the property 'amountCassa'
     */
    @Test
    public void amountCassaTest() {
        // TODO: test amountCassa
    }

    /**
     * Test the property 'amountWithholdingTax'
     */
    @Test
    public void amountWithholdingTaxTest() {
        // TODO: test amountWithholdingTax
    }

    /**
     * Test the property 'amountOtherWithholdingTax'
     */
    @Test
    public void amountOtherWithholdingTaxTest() {
        // TODO: test amountOtherWithholdingTax
    }

    /**
     * Test the property 'extraData'
     */
    @Test
    public void extraDataTest() {
        // TODO: test extraData
    }

    /**
     * Test the property 'seenDate'
     */
    @Test
    public void seenDateTest() {
        // TODO: test seenDate
    }

    /**
     * Test the property 'nextDueDate'
     */
    @Test
    public void nextDueDateTest() {
        // TODO: test nextDueDate
    }

    /**
     * Test the property 'url'
     */
    @Test
    public void urlTest() {
        // TODO: test url
    }

    /**
     * Test the property 'attachmentUrl'
     */
    @Test
    public void attachmentUrlTest() {
        // TODO: test attachmentUrl
    }

    /**
     * Test the property 'attachmentToken'
     */
    @Test
    public void attachmentTokenTest() {
        // TODO: test attachmentToken
    }

    /**
     * Test the property 'eiRaw'
     */
    @Test
    public void eiRawTest() {
        // TODO: test eiRaw
    }

    /**
     * Test the property 'showTspayButton'
     */
    @Test
    public void showTspayButtonTest() {
        // TODO: test showTspayButton
    }

    /**
     * Test the property 'year'
     */
    @Test
    public void yearTest() {
        // TODO: test year
    }

    /**
     * Test the property 'amountRivalsaTaxable'
     */
    @Test
    public void amountRivalsaTaxableTest() {
        // TODO: test amountRivalsaTaxable
    }

    /**
     * Test the property 'amountGlobalCassaTaxable'
     */
    @Test
    public void amountGlobalCassaTaxableTest() {
        // TODO: test amountGlobalCassaTaxable
    }

    /**
     * Test the property 'amountCassaTaxable'
     */
    @Test
    public void amountCassaTaxableTest() {
        // TODO: test amountCassaTaxable
    }

    /**
     * Test the property 'amountCassa2'
     */
    @Test
    public void amountCassa2Test() {
        // TODO: test amountCassa2
    }

    /**
     * Test the property 'amountCassa2Taxable'
     */
    @Test
    public void amountCassa2TaxableTest() {
        // TODO: test amountCassa2Taxable
    }

    /**
     * Test the property 'amountWithholdingTaxTaxable'
     */
    @Test
    public void amountWithholdingTaxTaxableTest() {
        // TODO: test amountWithholdingTaxTaxable
    }

    /**
     * Test the property 'amountEnasarcoTaxable'
     */
    @Test
    public void amountEnasarcoTaxableTest() {
        // TODO: test amountEnasarcoTaxable
    }

    /**
     * Test the property 'amountOtherWithholdingTaxTaxable'
     */
    @Test
    public void amountOtherWithholdingTaxTaxableTest() {
        // TODO: test amountOtherWithholdingTaxTaxable
    }

    /**
     * Test the property 'eiCassaType'
     */
    @Test
    public void eiCassaTypeTest() {
        // TODO: test eiCassaType
    }

    /**
     * Test the property 'eiCassa2Type'
     */
    @Test
    public void eiCassa2TypeTest() {
        // TODO: test eiCassa2Type
    }

    /**
     * Test the property 'eiWithholdingTaxCausal'
     */
    @Test
    public void eiWithholdingTaxCausalTest() {
        // TODO: test eiWithholdingTaxCausal
    }

    /**
     * Test the property 'eiOtherWithholdingTaxType'
     */
    @Test
    public void eiOtherWithholdingTaxTypeTest() {
        // TODO: test eiOtherWithholdingTaxType
    }

    /**
     * Test the property 'eiOtherWithholdingTaxCausal'
     */
    @Test
    public void eiOtherWithholdingTaxCausalTest() {
        // TODO: test eiOtherWithholdingTaxCausal
    }

    /**
     * Test the property 'amountDueDiscount'
     */
    @Test
    public void amountDueDiscountTest() {
        // TODO: test amountDueDiscount
    }

}