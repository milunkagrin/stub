package com.example.stub.services;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class EntityApi extends BaseApi{

    private final static String BASE_PATH = "/users";

    public EntityApi() {
        super(BASE_PATH);
    }

    public Response getEntity(String id) {

        return given(requestSpec).get("/"+id)
                .then()
                .extract().response();

    }
}
