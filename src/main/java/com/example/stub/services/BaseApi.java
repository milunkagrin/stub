package com.example.stub.services;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseApi {

    protected final static String BASE_URL = "http://localhost:8080";
    protected final RequestSpecification requestSpec;

    public BaseApi(String BASE_PATH) {
        requestSpec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(BASE_URL)
                .setBasePath(BASE_PATH).build();
    }
}
