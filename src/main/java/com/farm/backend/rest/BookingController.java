package com.farm.backend.rest;

import com.farm.backend.models.BookingRQ;
import com.farm.backend.service.BookingService;
import com.farm.backend.utils.RestApiErrorResponse;
import com.farm.backend.utils.RestApiSuccessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;

@RestController
@CrossOrigin
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    RestApiSuccessResponse success = null;
    RestApiErrorResponse error = null;
    @PostMapping(value = "/create")
    public ResponseEntity<?> createBooking(@RequestBody BookingRQ request)
            throws Exception {
        try {
            success = new RestApiSuccessResponse(HttpStatus.OK.value(),
                    "Success", System.currentTimeMillis(),
                    bookingService.createBooking(request));

            return new ResponseEntity<>(success, HttpStatus.OK);
        } catch (Exception e) {
            error = new RestApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "Error", System.currentTimeMillis(), e.getMessage());
            return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/fetch-booking/{user_id}")
    public ResponseEntity<?> fetchAllBookingByUserId(@PathVariable(name = "user_id") String userId)
            throws Exception {
        try {
            success = new RestApiSuccessResponse(HttpStatus.OK.value(),
                    "Success", System.currentTimeMillis(),
                    bookingService.fetchAllBookingByUserId(userId));

            return new ResponseEntity<>(success, HttpStatus.OK);
        } catch (Exception e) {
            error = new RestApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "Error", System.currentTimeMillis(), e.getMessage());
            return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/fetch-booking-all")
    public ResponseEntity<?> fetchBooking()
            throws Exception {
        try {
            success = new RestApiSuccessResponse(HttpStatus.OK.value(),
                    "Success", System.currentTimeMillis(),
                    bookingService.fetchAllBooking());

            return new ResponseEntity<>(success, HttpStatus.OK);
        } catch (Exception e) {
            error = new RestApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "Error", System.currentTimeMillis(), e.getMessage());
            return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
