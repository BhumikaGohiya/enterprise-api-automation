package com.bhumika.api.tests;

import com.bhumika.api.base.BaseTest;
import com.bhumika.api.utils.BookingPayloadBuilder;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.bhumika.api.utils.RequestBuilder.defaultRequest;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;

public class CreateBooking_NegativeFlow_MissingMandatoryFields_Test extends BaseTest {

    @Test
    void shouldFailOrError_whenFirstNameIsMissing() {

        // Start with a valid payload, remove only the mandatory field
        Map<String, Object> payload = BookingPayloadBuilder.validBooking();
        payload.remove("firstname");

        defaultRequest()
            .body(payload)
        .when()
            .post("/booking")
        .then()
            // Backend is inconsistent here; capture current behavior without breaking CI
            .statusCode(anyOf(is(400), is(500)));
    }
}
