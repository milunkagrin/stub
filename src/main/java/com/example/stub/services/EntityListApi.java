package com.example.stub.services;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class EntityListApi extends BaseApi{
    private final static String BASE_PATH = "/users";

    public EntityListApi() {
        super(BASE_PATH);
    }

    public Response getEntityList() {

        return given(requestSpec).get("/get/all")
                .then()
                .extract().response();

    }


}
