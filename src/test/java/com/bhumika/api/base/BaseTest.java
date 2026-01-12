package com.bhumika.api.base;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    // Shared request setup for all API tests
    protected static RequestSpecification requestSpecification;

    @BeforeAll
    static void setup() {

        // Base URI for Restful Booker APIs
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        // Default request configuration
        requestSpecification = RestAssured
                .given()
                .contentType("application/json");
    }
}
