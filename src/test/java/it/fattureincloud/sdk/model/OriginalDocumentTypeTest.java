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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Model tests for OriginalDocumentType
 */
public class OriginalDocumentTypeTest {
    /**
     * Model tests for OriginalDocumentType
     */
    @Test
    public void testOriginalDocumentType() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();

        assertEquals("\"ordine\"", gson.toJson(OriginalDocumentType.ORDINE));
        assertEquals("\"contratto\"", gson.toJson(OriginalDocumentType.CONTRATTO));
        assertEquals("\"convenzione\"", gson.toJson(OriginalDocumentType.CONVENZIONE));

        assertEquals(OriginalDocumentType.ORDINE, gson.fromJson("\"ordine\"", OriginalDocumentType.class));
        assertEquals(OriginalDocumentType.CONTRATTO, gson.fromJson("\"contratto\"", OriginalDocumentType.class));
        assertEquals(OriginalDocumentType.CONVENZIONE, gson.fromJson("\"convenzione\"", OriginalDocumentType.class));

        assertEquals("ordine", OriginalDocumentType.ORDINE.getValue());
        assertEquals("contratto", OriginalDocumentType.CONTRATTO.getValue());
        assertEquals("convenzione", OriginalDocumentType.CONVENZIONE.getValue());

        assertEquals("ordine", OriginalDocumentType.ORDINE.toString());
        assertEquals("contratto", OriginalDocumentType.CONTRATTO.toString());
        assertEquals("convenzione", OriginalDocumentType.CONVENZIONE.toString());

        assertEquals(OriginalDocumentType.ORDINE, OriginalDocumentType.fromValue("ordine"));
        assertEquals(OriginalDocumentType.CONTRATTO, OriginalDocumentType.fromValue("contratto"));
        assertEquals(OriginalDocumentType.CONVENZIONE, OriginalDocumentType.fromValue("convenzione"));

    }

}
