package com.farm.backend.models;

import lombok.Data;

@Data
public class CropRQ {
    private String cropName;
    private String cropType;
    private boolean isSeasonal;
    private String farmerName;
    private Long pricePerKg;
}
