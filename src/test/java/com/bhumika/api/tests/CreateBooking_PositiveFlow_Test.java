package com.bhumika.api.tests;

import com.bhumika.api.base.BaseTest;
import com.bhumika.api.utils.BookingPayloadBuilder;
import org.junit.jupiter.api.Test;

import static com.bhumika.api.utils.RequestBuilder.defaultRequest;
import static org.hamcrest.Matchers.notNullValue;

public class CreateBooking_PositiveFlow_Test extends BaseTest {

    @Test
    void shouldCreateBookingSuccessfully() {

        defaultRequest()
            .body(BookingPayloadBuilder.validBooking())
        .when()
            .post("/booking")
        .then()
            .statusCode(200)
            .body("bookingid", notNullValue());
    }
}
