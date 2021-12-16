package com.example.stub;

import com.example.stub.services.EntityApi;
import com.example.stub.services.EntityListApi;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.startsWith;

public class JsonValidationTestsForStubs {
    EntityListApi entityListApi = new EntityListApi();
    EntityApi entityApi = new EntityApi();

    @Test /*Валидация заглушки get/all */
    public void checkJsonValidationStubGetAll() {
        entityListApi.getEntityList()
                .then()
                .log().body()
                .statusCode(200)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("restAssuredSchema/Entities.json"));


    }

    @Test /*Валидация заглушки /{id} */
    public void checkJsonValidationStubGetUserById() {
        entityApi.getEntity("1")
                .then()
                .log().body()
                .statusCode(200)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("restAssuredSchema/EntityUnits.json"));


    }
}
