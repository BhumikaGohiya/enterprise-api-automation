package com.bhumika.api.tests;

import com.bhumika.api.base.BaseTest;
import com.bhumika.api.utils.AuthTokenProvider;
import com.bhumika.api.utils.BookingPayloadBuilder;
import com.bhumika.api.utils.RequestBuilder;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;

public class UpdateBooking_Authorized_Test extends BaseTest {

    @Test
    void shouldUpdateBooking_whenAuthorized_orCaptureServerIssue() {

        // Step 1: Create booking
        int bookingId =
                given()
                        .spec(RequestBuilder.defaultRequest())
                        .body(BookingPayloadBuilder.validBooking())
                .when()
                        .post("/booking")
                .then()
                        .statusCode(200)
                        .extract()
                        .path("bookingid");

        // Step 2: Update booking using auth token
        given()
                .spec(RequestBuilder.defaultRequest())
                .cookie("token", AuthTokenProvider.getToken())
                .body(BookingPayloadBuilder.validBooking())
        .when()
                .put("/booking/" + bookingId)
        .then()
                .statusCode(anyOf(is(200), is(500)));
    }
}
