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


package it.fattureincloud.sdk.api;

import it.fattureincloud.sdk.ApiClient;
import it.fattureincloud.sdk.ApiException;
import it.fattureincloud.sdk.model.*;
import okhttp3.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * API tests for ArchiveApi
 */
public class ArchiveApiTest {

    private static ArchiveApi mockApi(final String serializedBody, final Call remoteCall) throws IOException {
        final OkHttpClient okHttpClient = Mockito.mock(OkHttpClient.class);

        Response.Builder builder = new Response.Builder()
                .request(new Request.Builder().url("https://api-v2.fattureincloud.it").build())
                .protocol(Protocol.HTTP_1_1)
                .code(200)
                .message("");
        if (serializedBody != null) {
            builder = builder.body(
                    ResponseBody.create(
                            serializedBody,
                            MediaType.parse("application/json")
                    ));
        }

        final Response response = builder.build();

        Mockito.when(remoteCall.execute()).thenReturn(response);
        Mockito.when(okHttpClient.newCall(Mockito.any())).thenReturn(remoteCall);

        ApiClient client = new ApiClient(okHttpClient);

        return new ArchiveApi(client);
    }

    /**
     * Create Archive Document
     * <p>
     * Creates a new archive document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createArchiveDocumentTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":12345,\"date\":\"2021-08-20\",\"description\":\"spesa 2\",\"category\":\"Altri documenti\",\"attachment_token\":\"jwfbaiuwbfoiewfoa8weohafw7gefa9we\"}}";

        Call mockCall = Mockito.mock(Call.class);
        ArchiveApi api = mockApi(result, mockCall);

        Integer companyId = 11111;

        ArchiveDocument archiveDocument = new ArchiveDocument()
                .id(1235)
                .date(LocalDate.parse("2021-08-20"))
                .category("Altri documenti")
                .description("spesa 1")
                .attachmentToken("jwfbaiuwbfoiewfoa8weohafw7gefa9we");

        ArchiveDocument expected = archiveDocument
                .id(12345)
                .description("spesa 2");

        CreateArchiveDocumentRequest createArchiveDocumentRequest = new CreateArchiveDocumentRequest().data(archiveDocument);

        CreateArchiveDocumentResponse response = api.createArchiveDocument(companyId, createArchiveDocumentRequest);

        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Delete Archive Document
     * <p>
     * Deletes the specified archive document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteArchiveDocumentTest() throws ApiException, IOException {
        Call mockCall = Mockito.mock(Call.class);
        ArchiveApi api = mockApi(null, mockCall);

        Integer companyId = 11111;
        Integer archiveDocumentId = 16451;
        api.deleteArchiveDocument(companyId, archiveDocumentId);
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Get Archive Document
     * <p>
     * Gets the specified archive document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getArchiveDocumentTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":12345,\"date\":\"2021-08-20\",\"description\":\"spesa 2\",\"category\":\"Altri documenti\",\"attachment_token\":\"jwfbaiuwbfoiewfoa8weohafw7gefa9we\"}}";

        Call mockCall = Mockito.mock(Call.class);
        ArchiveApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        Integer archiveDocumentId = 16451;
        String fields = null;
        String fieldset = null;

        ArchiveDocument expected = new ArchiveDocument()
                .id(12345)
                .date(LocalDate.parse("2021-08-20"))
                .category("Altri documenti")
                .description("spesa 2")
                .attachmentToken("jwfbaiuwbfoiewfoa8weohafw7gefa9we");

        GetArchiveDocumentResponse response = api.getArchiveDocument(companyId, archiveDocumentId, fields, fieldset);
        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * List Archive Documents
     * <p>
     * Lists the archive documents.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listArchiveDocumentsTest() throws ApiException, IOException {
        String result = "{\"current_page\":1,\"data\":[{\"id\":12345,\"date\":\"2021-08-20\",\"description\":\"spesa 2\",\"category\":\"Altri documenti\",\"attachment_token\":\"jwfbaiuwbfoiewfoa8weohafw7gefa9we\"},{\"id\":123456,\"date\":\"2021-08-20\",\"description\":\"spesa 2\",\"category\":\"Altri documenti\",\"attachment_token\":\"jwfbaiuwbfoiewfoa8weohafw7gefa9we\"}],\"first_page_url\":\"page=1\",\"from\":1,\"last_page\":2,\"last_page_url\":\"page=2\",\"next_page_url\":\"page=2\",\"path\":\"entities/clients\",\"per_page\":5,\"prev_page_url\":null,\"to\":50,\"total\":8}";

        Call mockCall = Mockito.mock(Call.class);
        ArchiveApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        String fields = null;
        String fieldset = null;
        String sort = null;
        Integer page = 1;
        Integer perPage = 5;
        String q = null;

        ArchiveDocument archiveDocument1 = new ArchiveDocument()
                .id(12345)
                .date(LocalDate.parse("2021-08-20"))
                .category("Altri documenti")
                .description("spesa 2")
                .attachmentToken("jwfbaiuwbfoiewfoa8weohafw7gefa9we");

        ArchiveDocument archiveDocument2 = new ArchiveDocument()
                .id(123456)
                .date(LocalDate.parse("2021-08-20"))
                .category("Altri documenti")
                .description("spesa 2")
                .attachmentToken("jwfbaiuwbfoiewfoa8weohafw7gefa9we");

        List<ArchiveDocument> expected = Arrays.asList(archiveDocument1, archiveDocument2);

        ListArchiveDocumentsResponse response = api.listArchiveDocuments(companyId, fields, fieldset, sort, page, perPage, q);
        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Modify Archive Document
     * <p>
     * Modifies the specified archive document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyArchiveDocumentTest() throws ApiException, IOException {
        String result = "{\"data\":{\"id\":12345,\"date\":\"2021-08-20\",\"description\":\"spesa 2\",\"category\":\"Altri documenti\",\"attachment_token\":\"jwfbaiuwbfoiewfoa8weohafw7gefa9we\"}}";

        Call mockCall = Mockito.mock(Call.class);
        ArchiveApi api = mockApi(result, mockCall);

        Integer companyId = 2;
        Integer archiveDocumentId = 2;

        ArchiveDocument archiveDocument = new ArchiveDocument()
                .id(1235)
                .date(LocalDate.parse("2021-08-20"))
                .category("Altri documenti")
                .description("spesa 1")
                .attachmentToken("jwfbaiuwbfoiewfoa8weohafw7gefa9we");

        ArchiveDocument expected = archiveDocument
                .id(12345)
                .description("spesa 2");

        ModifyArchiveDocumentRequest modifyArchiveDocumentRequest = new ModifyArchiveDocumentRequest().data(archiveDocument);

        ModifyArchiveDocumentResponse response = api.modifyArchiveDocument(companyId, archiveDocumentId, modifyArchiveDocumentRequest);

        assertEquals(expected, response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

    /**
     * Upload Archive Document Attachment
     * <p>
     * Uploads an attachment destined to an archive document. The actual association between the document and the attachment must be implemented separately, using the returned token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadArchiveDocumentAttachmentTest() throws ApiException, IOException {
        String result = "{\"data\":{\"attachment_token\":\"YmMyNWYxYzIwMTU3N212ABCDZjZiMzg5OWY0ODNkZDQveXl5LmRvYw\"}}";

        Call mockCall = Mockito.mock(Call.class);
        ArchiveApi api = mockApi(result, mockCall);

        Integer companyId = 11111;
        UploadArchiveAttachmentResponse expected = new UploadArchiveAttachmentResponse()
                .data(new AttachmentData()
                        .attachmentToken("YmMyNWYxYzIwMTU3N212ABCDZjZiMzg5OWY0ODNkZDQveXl5LmRvYw")
                );

        UploadArchiveAttachmentResponse response = api.uploadArchiveDocumentAttachment(companyId, "filename", null);

        assertEquals(expected.getData(), response.getData());
        Mockito.verify(mockCall, Mockito.only()).execute();
    }

}
