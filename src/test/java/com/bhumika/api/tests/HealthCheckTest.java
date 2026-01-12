package com.bhumika.api.tests;

import com.bhumika.api.base.BaseTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class HealthCheckTest extends BaseTest {

    @Test
    void healthCheckShouldReturn201() {
        given()
        .when()
            .get("/ping")
        .then()
            .statusCode(201);
    }
}
