package com.farm.backend.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class CropRQ {
    private String cropName;
    private String cropType;
    private boolean isSeasonal;
    private String farmerName;
    private Long pricePerKg;
}
