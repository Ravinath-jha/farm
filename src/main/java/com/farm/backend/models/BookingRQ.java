package com.farm.backend.models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

@Data
@Builder
@EqualsAndHashCode
@ToString
public class BookingRQ {
    private Double bookingAmount;
    private String farmerName;
    private Date bookingDate;
    private String cropName;
    private Long quantityInKg;

}
