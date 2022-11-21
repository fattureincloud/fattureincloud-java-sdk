/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 500.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.22
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.fattureincloud.sdk.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.fattureincloud.sdk.JSON;
import it.fattureincloud.sdk.model.IssuedDocument;
import it.fattureincloud.sdk.model.IssuedDocumentOptions;
import java.io.IOException;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for TransformIssuedDocumentResponse
 */
public class TransformIssuedDocumentResponseTest {
    private TransformIssuedDocumentResponse model;

    @BeforeEach
    public void init() {
        model = new TransformIssuedDocumentResponse()
                .data(
                        new IssuedDocument()
                                .id(12345)
                                .type(IssuedDocumentType.INVOICE)
                )
                .options(
                        new IssuedDocumentOptions()
                                .createFrom(Arrays.asList("82112399"))
                                .transform(true)
                                .keepCopy(true)
                );
    }


    /**
     * Model tests for TransformIssuedDocumentResponse
     */
    @Test
    public void testTransformIssuedDocumentResponse() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"data\":{\"id\":12345,\"type\":\"invoice\",\"show_totals\":\"all\"},\"options\":{\"create_from\":[\"82112399\"],\"transform\":true,\"keep_copy\":true}}";
        assertEquals(str, json);
        TransformIssuedDocumentResponse generated = gson.fromJson(str, TransformIssuedDocumentResponse.class);
        assertEquals(model, generated);

        Object o = model;
        assertEquals(model, o);
        assertFalse(model.equals(null));
        assertFalse(model.equals(Integer.getInteger("5")));
    }

    /**
     * Test the property 'data'
     */
    @Test
    public void dataTest() {
        assertEquals(12345, model.getData().getId());
        model.setData(new IssuedDocument().id(2));
        assertEquals(2, model.getData().getId());

        model.data(new IssuedDocument().id(12345));
        TransformIssuedDocumentResponse actual = new TransformIssuedDocumentResponse();
        actual.setData(new IssuedDocument().id(12345));
        assertEquals(model.getData(), actual.getData());
    }

    /**
     * Test the property 'options'
     */
    @Test
    public void optionsTest() {
        assertEquals(Arrays.asList("82112399"), model.getOptions().getCreateFrom());
        model.setOptions(new IssuedDocumentOptions().createFrom(Arrays.asList("92112399")));
        assertEquals(Arrays.asList("92112399"), model.getOptions().getCreateFrom());

        model.options(new IssuedDocumentOptions().createFrom(Arrays.asList("821123")));
        TransformIssuedDocumentResponse actual = new TransformIssuedDocumentResponse();
        actual.setOptions(new IssuedDocumentOptions().createFrom(Arrays.asList("821123")));
        assertEquals(model.getOptions(), actual.getOptions());
    }

}
