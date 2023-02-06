package com.farm.backend.datatable;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@ToString(callSuper = true)
@EqualsAndHashCode
@Entity
@Table(name = "farmer")
public class FarmerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "farm_address")
    private String farmAddress;

    @Column(name = "contact")
    private String contact;

    @Column(name = "farming_area_in_sq_meter")
    private Double farmingAreaInSqMeter;
}
