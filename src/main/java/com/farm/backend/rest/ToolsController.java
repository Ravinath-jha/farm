package com.farm.backend.rest;

import com.farm.backend.models.ToolsRQ;
import com.farm.backend.service.ToolsService;
import com.farm.backend.utils.RestApiErrorResponse;
import com.farm.backend.utils.RestApiSuccessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/tools")
public class ToolsController {

    @Autowired
    ToolsService toolsService;

    RestApiSuccessResponse success = null;
    RestApiErrorResponse error = null;

    @PostMapping(value = "/add")
    public ResponseEntity<?> addTools(@RequestBody ToolsRQ request)
            throws Exception {
        try {
            success = new RestApiSuccessResponse(HttpStatus.OK.value(),
                    "Success", System.currentTimeMillis(),
                    toolsService.createTools(request));

            return new ResponseEntity<>(success, HttpStatus.OK);
        } catch (Exception e) {
            error = new RestApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "Error", System.currentTimeMillis(), e.getMessage());
            return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/fetch-tools-all")
    public ResponseEntity<?> fetchAllTools()
            throws Exception {
        try {
            success = new RestApiSuccessResponse(HttpStatus.OK.value(),
                    "Success", System.currentTimeMillis(),
                    toolsService.fetchAllTools());

            return new ResponseEntity<>(success, HttpStatus.OK);
        } catch (Exception e) {
            error = new RestApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "Error", System.currentTimeMillis(), e.getMessage());
            return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
