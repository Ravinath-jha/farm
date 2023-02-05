package com.farm.backend.rest;

import com.farm.backend.models.BookingRQ;
import com.farm.backend.models.CropRQ;
import com.farm.backend.service.BookingService;
import com.farm.backend.service.CropService;
import com.farm.backend.utils.RestApiErrorResponse;
import com.farm.backend.utils.RestApiSuccessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/crop")
public class CropController {
    @Autowired
    CropService cropService;

    RestApiSuccessResponse success = null;
    RestApiErrorResponse error = null;

    @PostMapping(value = "/create")
    public ResponseEntity<?> createCrop(@RequestBody CropRQ request)
            throws Exception {
        try {
            success = new RestApiSuccessResponse(HttpStatus.OK.value(),
                    "Success", System.currentTimeMillis(),
                    cropService.createCrop(request));

            return new ResponseEntity<>(success, HttpStatus.OK);
        } catch (Exception e) {
            error = new RestApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "Error", System.currentTimeMillis(), e.getMessage());
            return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/fetch-crops-all")
    public ResponseEntity<?> fetchAllCrops()
            throws Exception {
        try {
            success = new RestApiSuccessResponse(HttpStatus.OK.value(),
                    "Success", System.currentTimeMillis(),
                    cropService.fetchAllCrops());

            return new ResponseEntity<>(success, HttpStatus.OK);
        } catch (Exception e) {
            error = new RestApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "Error", System.currentTimeMillis(), e.getMessage());
            return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
