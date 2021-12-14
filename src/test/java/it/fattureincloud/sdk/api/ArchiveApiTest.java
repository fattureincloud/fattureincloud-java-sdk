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
import it.fattureincloud.sdk.model.CreateArchiveDocumentRequest;
import it.fattureincloud.sdk.model.CreateArchiveDocumentResponse;
import java.io.File;
import it.fattureincloud.sdk.model.GetArchiveDocumentResponse;
import it.fattureincloud.sdk.model.ListArchiveDocumentsResponse;
import it.fattureincloud.sdk.model.ModifyArchiveDocumentRequest;
import it.fattureincloud.sdk.model.ModifyArchiveDocumentResponse;
import it.fattureincloud.sdk.model.UploadArchiveAttachmentResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ArchiveApi
 */
@Ignore
public class ArchiveApiTest {

    private final ArchiveApi api = new ArchiveApi();

    
    /**
     * Create Archive Document
     *
     * Creates a new archive document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createArchiveDocumentTest() throws ApiException {
        Integer companyId = null;
        CreateArchiveDocumentRequest createArchiveDocumentRequest = null;
                CreateArchiveDocumentResponse response = api.createArchiveDocument(companyId, createArchiveDocumentRequest);
        // TODO: test validations
    }
    
    /**
     * Delete Archive Document
     *
     * Deletes the specified archive document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteArchiveDocumentTest() throws ApiException {
        Integer companyId = null;
        Integer documentId = null;
                api.deleteArchiveDocument(companyId, documentId);
        // TODO: test validations
    }
    
    /**
     * Get Archive Document
     *
     * Gets the specified archive document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getArchiveDocumentTest() throws ApiException {
        Integer companyId = null;
        Integer documentId = null;
        String fields = null;
        String fieldset = null;
                GetArchiveDocumentResponse response = api.getArchiveDocument(companyId, documentId, fields, fieldset);
        // TODO: test validations
    }
    
    /**
     * List Archive Documents
     *
     * Lists the archive documents.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listArchiveDocumentsTest() throws ApiException {
        Integer companyId = null;
        String fields = null;
        String fieldset = null;
        String sort = null;
        Integer page = null;
        Integer perPage = null;
                ListArchiveDocumentsResponse response = api.listArchiveDocuments(companyId, fields, fieldset, sort, page, perPage);
        // TODO: test validations
    }
    
    /**
     * Modify Archive Document
     *
     * Modifies the specified archive document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyArchiveDocumentTest() throws ApiException {
        Integer companyId = null;
        Integer documentId = null;
        ModifyArchiveDocumentRequest modifyArchiveDocumentRequest = null;
                ModifyArchiveDocumentResponse response = api.modifyArchiveDocument(companyId, documentId, modifyArchiveDocumentRequest);
        // TODO: test validations
    }
    
    /**
     * Upload Archive Document Attachment
     *
     * Uploads an attachment destined to an archive document. The actual association between the document and the attachment must be implemented separately, using the returned token.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadArchiveDocumentAttachmentTest() throws ApiException {
        Integer companyId = null;
        String filename = null;
        File attachment = null;
                UploadArchiveAttachmentResponse response = api.uploadArchiveDocumentAttachment(companyId, filename, attachment);
        // TODO: test validations
    }
    
}