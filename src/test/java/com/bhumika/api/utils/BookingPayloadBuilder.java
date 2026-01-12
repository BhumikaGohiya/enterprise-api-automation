package com.bhumika.api.utils;

import java.util.HashMap;
import java.util.Map;

public class BookingPayloadBuilder {

    public static Map<String, Object> validBooking() {

        Map<String, Object> bookingDates = new HashMap<>();
        bookingDates.put("checkin", "2026-02-01");
        bookingDates.put("checkout", "2026-02-05");

        Map<String, Object> payload = new HashMap<>();
        payload.put("firstname", "Bhumika");
        payload.put("lastname", "QA");
        payload.put("totalprice", 150);
        payload.put("depositpaid", true);
        payload.put("bookingdates", bookingDates);
        payload.put("additionalneeds", "Breakfast");

        return payload;
    }
}
