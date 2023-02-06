package com.farm.backend.service;

import com.farm.backend.models.BookingRQ;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ComponentScan(basePackages = {"com.farm.*"})
@Import({BookingService.class})
public class BookingServiceTests {

    @Autowired
    BookingService bookingService;

    @Test
    void testCreateBooking_Success(){
        BookingRQ request = BookingRQ.builder().build();
        bookingService.createBooking(request);
    }
}
