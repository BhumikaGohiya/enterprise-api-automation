package com.bhumika.api.utils;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RequestBuilder {

    public static RequestSpecification defaultRequest() {
        return given()
                .contentType("application/json");
    }

    public static RequestSpecification authenticatedRequest() {
        return given()
                .contentType("application/json")
                .cookie("token", AuthTokenProvider.getToken());
    }
}
