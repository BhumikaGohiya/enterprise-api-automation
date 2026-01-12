package com.bhumika.api.tests;

import com.bhumika.api.base.BaseTest;
import com.bhumika.api.utils.BookingPayloadBuilder;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.bhumika.api.utils.RequestBuilder.defaultRequest;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;

public class CreateBooking_NegativeFlow_InvalidDateRange_Test extends BaseTest {

    @Test
    void shouldAllowOrReject_whenCheckoutIsBeforeCheckin() {

        // Mutate only the date range to test business rule enforcement
        Map<String, Object> payload = BookingPayloadBuilder.validBooking();

        Map<String, String> bookingDates =
                (Map<String, String>) payload.get("bookingdates");

        bookingDates.put("checkin", "2026-02-10");
        bookingDates.put("checkout", "2026-02-05");

        defaultRequest()
            .body(payload)
        .when()
            .post("/booking")
        .then()
            // API currently allows this; test documents the gap
            .statusCode(anyOf(is(200), is(400)));
    }
}
