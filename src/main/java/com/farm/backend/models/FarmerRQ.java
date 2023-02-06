package com.farm.backend.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class FarmerRQ {
    private String name;
    private String farmAddress;
    private String contact;
    private Double farmingAreaInSqMeter;

}
