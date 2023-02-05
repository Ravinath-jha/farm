package com.farm.backend.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RestApiSuccessResponse {
    protected int status;
    protected String message;
    protected long timeStamp;
    protected Object data;

}
