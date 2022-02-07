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

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import it.fattureincloud.sdk.JSON;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openapitools.jackson.nullable.JsonNullable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * Model tests for User
 */
public class UserTest {
    private User model;

    @BeforeEach
    public void init() {
        model = new User()
                .id(12345)
                .name("Mario Rossi")
                .firstName("Mario")
                .lastName("Rossi")
                .email("mario.rossi@example.com")
                .hash("5add29e1234532a1bf2ed7b612043029")
                .picture("picture.jpg");
    }

    /**
     * Model tests for User
     */
    @Test
    public void testUser() {
        JSON jsonManager = new JSON();
        Gson gson = jsonManager.getGson();
        String json = gson.toJson(model);
        String str = "{\"id\":12345,\"name\":\"Mario Rossi\",\"first_name\":\"Mario\",\"last_name\":\"Rossi\",\"email\":\"mario.rossi@example.com\",\"hash\":\"5add29e1234532a1bf2ed7b612043029\",\"picture\":\"picture.jpg\"}";
        assertEquals(str, json);
        User generated = gson.fromJson(str, User.class);
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
        assertEquals(12345, model.getId());
        model.setId(67890);
        assertEquals(67890, model.getId());

        User u = model.id(22222);
        User expected = new User()
                .id(22222)
                .name("Mario Rossi")
                .firstName("Mario")
                .lastName("Rossi")
                .email("mario.rossi@example.com")
                .hash("5add29e1234532a1bf2ed7b612043029")
                .picture("picture.jpg");
        assertEquals(expected, u);
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        assertEquals("Mario Rossi", model.getName());
        model.setName("Sara Loda");
        assertEquals("Sara Loda", model.getName());

        User u = model.name("Tiziano Ferro");
        User expected = new User()
                .id(12345)
                .name("Tiziano Ferro")
                .firstName("Mario")
                .lastName("Rossi")
                .email("mario.rossi@example.com")
                .hash("5add29e1234532a1bf2ed7b612043029")
                .picture("picture.jpg");
        assertEquals(expected, u);
    }

    /**
     * Test the property 'firstName'
     */
    @Test
    public void firstNameTest() {
        assertEquals("Mario", model.getFirstName());
        model.setFirstName("Paola");
        assertEquals("Paola", model.getFirstName());

        User u = model.firstName("Sofia");
        User expected = new User()
                .id(12345)
                .name("Mario Rossi")
                .firstName("Sofia")
                .lastName("Rossi")
                .email("mario.rossi@example.com")
                .hash("5add29e1234532a1bf2ed7b612043029")
                .picture("picture.jpg");
        assertEquals(expected, u);
    }

    /**
     * Test the property 'lastName'
     */
    @Test
    public void lastNameTest() {
        assertEquals("Rossi", model.getLastName());
        model.setLastName("Bonaventura");
        assertEquals("Bonaventura", model.getLastName());

        User u = model.lastName("Baggio");
        User expected = new User()
                .id(12345)
                .name("Mario Rossi")
                .firstName("Mario")
                .lastName("Baggio")
                .email("mario.rossi@example.com")
                .hash("5add29e1234532a1bf2ed7b612043029")
                .picture("picture.jpg");
        assertEquals(expected, u);
    }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
        assertEquals("mario.rossi@example.com", model.getEmail());
        model.setEmail("info@fattureincloud.it");
        assertEquals("info@fattureincloud.it", model.getEmail());

        User u = model.email("spam@yopmail.com");
        User expected = new User()
                .id(12345)
                .name("Mario Rossi")
                .firstName("Mario")
                .lastName("Rossi")
                .email("spam@yopmail.com")
                .hash("5add29e1234532a1bf2ed7b612043029")
                .picture("picture.jpg");
        assertEquals(expected, u);
    }

    /**
     * Test the property 'hash'
     */
    @Test
    public void hashTest() {
        assertEquals("5add29e1234532a1bf2ed7b612043029", model.getHash());
        model.setHash("8875182b8e093440081993c526cc957e");
        assertEquals("8875182b8e093440081993c526cc957e", model.getHash());

        User u = model.hash("7fc4c5975b6af8f2ce269a9ff1ffc5f7");
        User expected = new User()
                .id(12345)
                .name("Mario Rossi")
                .firstName("Mario")
                .lastName("Rossi")
                .email("mario.rossi@example.com")
                .hash("7fc4c5975b6af8f2ce269a9ff1ffc5f7")
                .picture("picture.jpg");
        assertEquals(expected, u);
    }

    /**
     * Test the property 'picture'
     */
    @Test
    public void pictureTest() {
        assertEquals("picture.jpg", model.getPicture());
        model.setPicture("foto_di_famiglia.jpg");
        assertEquals("foto_di_famiglia.jpg", model.getPicture());

        User u = model.picture("dog.jpg");
        User expected = new User()
                .id(12345)
                .name("Mario Rossi")
                .firstName("Mario")
                .lastName("Rossi")
                .email("mario.rossi@example.com")
                .hash("5add29e1234532a1bf2ed7b612043029")
                .picture("dog.jpg");
        assertEquals(expected, u);
    }

}
