package com.bhumika.api.utils;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class AuthTokenProvider {

    private static String token;

    public static String getToken() {
        if (token == null) {
            token = generateToken();
        }
        return token;
    }

    private static String generateToken() {
        return given()
                .contentType(ContentType.JSON)
                .body("""
                    {
                      "username": "admin",
                      "password": "password123"
                    }
                """)
                .when()
                .post("/auth")
                .then()
                .statusCode(200)
                .extract()
                .path("token");
    }
}
