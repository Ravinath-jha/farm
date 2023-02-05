package com.farm.backend.datatable;

import javax.persistence.*;

@Entity
@Table(name = "crop")
public class CropEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "crop_name")
    private String cropName;

    @Column(name = "crop_type")
    private String cropType;

    @Column(name = "is_seasonal")
    private boolean isSeasonal;

    @Column(name = "farmer_name")
    private String farmerName;

    @Column(name = "price_per_kg")
    private Long pricePerKg;
}
