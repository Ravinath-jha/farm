package com.farm.backend.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@ToString
public class BookingRQ {
    private Double bookingAmount;
    private String farmerName;
    private Date bookingDate;
    private String cropName;
    private Long quantityInKg;
    private String userId;


}
