package com.farm.backend.models;

import lombok.Data;

@Data
public class FarmerRQ {
    private String name;
    private String farmAddress;
    private String contact;
    private Double farmingAreaInSqMeter;

}
