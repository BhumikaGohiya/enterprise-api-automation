package com.bhumika.api.tests;

import com.bhumika.api.base.BaseTest;
import com.bhumika.api.utils.BookingPayloadBuilder;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.bhumika.api.utils.RequestBuilder.defaultRequest;
import static org.hamcrest.Matchers.equalTo;

public class CreateBooking_NegativeFlow_PriceBoundary_Test extends BaseTest {

    @Test
    void shouldAllowBookingWithZeroPrice_butCaptureDataQualityIssue() {

        // Start from a valid payload and override only what we want to test
        Map<String, Object> payload = BookingPayloadBuilder.validBooking();
        payload.put("totalprice", 0);

        defaultRequest()
            .body(payload)
        .when()
            .post("/booking")
        .then()
            .statusCode(200)
            .body("booking.totalprice", equalTo(0));
    }
}
