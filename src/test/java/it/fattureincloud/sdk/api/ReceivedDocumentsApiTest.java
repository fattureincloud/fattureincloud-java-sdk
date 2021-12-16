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


package it.fattureincloud.sdk.api;

import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.model.CreateReceivedDocumentRequest;
import it.fattureincloud.sdk.model.CreateReceivedDocumentResponse;
import java.io.File;
import it.fattureincloud.sdk.model.GetExistingReceivedDocumentTotalsRequest;
import it.fattureincloud.sdk.model.GetExistingReceivedDocumentTotalsResponse;
import it.fattureincloud.sdk.model.GetNewReceivedDocumentTotalsRequest;
import it.fattureincloud.sdk.model.GetNewReceivedDocumentTotalsResponse;
import it.fattureincloud.sdk.model.GetReceivedDocumentPreCreateInfoResponse;
import it.fattureincloud.sdk.model.GetReceivedDocumentResponse;
import it.fattureincloud.sdk.model.ListReceivedDocumentsResponse;
import it.fattureincloud.sdk.model.ModifyReceivedDocumentRequest;
import it.fattureincloud.sdk.model.ModifyReceivedDocumentResponse;
import it.fattureincloud.sdk.model.UploadReceivedDocumentAttachmentResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReceivedDocumentsApi
 */
@Ignore
public class ReceivedDocumentsApiTest {

    private final ReceivedDocumentsApi api = new ReceivedDocumentsApi();

    
    /**
     * Create Received Document
     *
     * Creates a new document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReceivedDocumentTest() throws ApiException {
        Integer companyId = null;
        CreateReceivedDocumentRequest createReceivedDocumentRequest = null;
                CreateReceivedDocumentResponse response = api.createReceivedDocument(companyId, createReceivedDocumentRequest);
        // TODO: test validations
    }
    
    /**
     * Delete Received Document
     *
     * Deletes the specified document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReceivedDocumentTest() throws ApiException {
        Integer companyId = null;
        Integer documentId = null;
                api.deleteReceivedDocument(companyId, documentId);
        // TODO: test validations
    }
    
    /**
     * Delete Received Document Attachment
     *
     * Removes the attachment of the specified document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReceivedDocumentAttachmentTest() throws ApiException {
        Integer companyId = null;
        Integer documentId = null;
                api.deleteReceivedDocumentAttachment(companyId, documentId);
        // TODO: test validations
    }
    
    /**
     * Get Existing Received Document Totals
     *
     * Returns the totals for the specified document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExistingReceivedDocumentTotalsTest() throws ApiException {
        Integer companyId = null;
        Integer documentId = null;
        GetExistingReceivedDocumentTotalsRequest getExistingReceivedDocumentTotalsRequest = null;
                GetExistingReceivedDocumentTotalsResponse response = api.getExistingReceivedDocumentTotals(companyId, documentId, getExistingReceivedDocumentTotalsRequest);
        // TODO: test validations
    }
    
    /**
     * Get New Received Document Totals
     *
     * Returns the totals for a new document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNewReceivedDocumentTotalsTest() throws ApiException {
        Integer companyId = null;
        GetNewReceivedDocumentTotalsRequest getNewReceivedDocumentTotalsRequest = null;
                GetNewReceivedDocumentTotalsResponse response = api.getNewReceivedDocumentTotals(companyId, getNewReceivedDocumentTotalsRequest);
        // TODO: test validations
    }
    
    /**
     * Get Received Document
     *
     * Gets the specified document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReceivedDocumentTest() throws ApiException {
        Integer companyId = null;
        Integer documentId = null;
        String fields = null;
        String fieldset = null;
                GetReceivedDocumentResponse response = api.getReceivedDocument(companyId, documentId, fields, fieldset);
        // TODO: test validations
    }
    
    /**
     * Get Received Document Pre-Create Info
     *
     * Retrieves the information useful while creating a new document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReceivedDocumentPreCreateInfoTest() throws ApiException {
        Integer companyId = null;
        String type = null;
                GetReceivedDocumentPreCreateInfoResponse response = api.getReceivedDocumentPreCreateInfo(companyId, type);
        // TODO: test validations
    }
    
    /**
     * List Received Documents
     *
     * Lists the received documents.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listReceivedDocumentsTest() throws ApiException {
        Integer companyId = null;
        String type = null;
        String fields = null;
        String fieldset = null;
        String sort = null;
        Integer page = null;
        Integer perPage = null;
                ListReceivedDocumentsResponse response = api.listReceivedDocuments(companyId, type, fields, fieldset, sort, page, perPage);
        // TODO: test validations
    }
    
    /**
     * Modify Received Document
     *
     * Modifies the specified document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyReceivedDocumentTest() throws ApiException {
        Integer companyId = null;
        Integer documentId = null;
        ModifyReceivedDocumentRequest modifyReceivedDocumentRequest = null;
                ModifyReceivedDocumentResponse response = api.modifyReceivedDocument(companyId, documentId, modifyReceivedDocumentRequest);
        // TODO: test validations
    }
    
    /**
     * Upload Received Document Attachment
     *
     * Uploads an attachment destined to a received document. The actual association between the document and the attachment must be implemented separately, using the returned token.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadReceivedDocumentAttachmentTest() throws ApiException {
        Integer companyId = null;
        String filename = null;
        File attachment = null;
                UploadReceivedDocumentAttachmentResponse response = api.uploadReceivedDocumentAttachment(companyId, filename, attachment);
        // TODO: test validations
    }
    
}
