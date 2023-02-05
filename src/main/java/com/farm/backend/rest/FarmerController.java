package com.farm.backend.rest;

import com.farm.backend.models.CropRQ;
import com.farm.backend.models.FarmerRQ;
import com.farm.backend.service.CropService;
import com.farm.backend.service.FarmerService;
import com.farm.backend.utils.RestApiErrorResponse;
import com.farm.backend.utils.RestApiSuccessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/farmer")
public class FarmerController {

    @Autowired
    FarmerService farmerService;

    RestApiSuccessResponse success = null;
    RestApiErrorResponse error = null;

    @PostMapping(value = "/create")
    public ResponseEntity<?> createFarmer(@RequestBody FarmerRQ request)
            throws Exception {
        try {
            success = new RestApiSuccessResponse(HttpStatus.OK.value(),
                    "Success", System.currentTimeMillis(),
                    farmerService.createFarmer(request));

            return new ResponseEntity<>(success, HttpStatus.OK);
        } catch (Exception e) {
            error = new RestApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "Error", System.currentTimeMillis(), e.getMessage());
            return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/fetch-farmer-all")
    public ResponseEntity<?> fetchAllFarmers()
            throws Exception {
        try {
            success = new RestApiSuccessResponse(HttpStatus.OK.value(),
                    "Success", System.currentTimeMillis(),
                    farmerService.fetchAllFarmers());

            return new ResponseEntity<>(success, HttpStatus.OK);
        } catch (Exception e) {
            error = new RestApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "Error", System.currentTimeMillis(), e.getMessage());
            return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
