package com.farm.backend.datatable;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@ToString(callSuper = true)
@EqualsAndHashCode
@Entity
@Table(name = "booking")
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "booking_amount")
    private Double bookingAmount;

    @Column(name = "farmer_name")
    private String farmerName;

    @Column(name = "booking_date")
    private Date bookingDate;

    @Column(name = "crop_name")
    private String cropName;

    @Column(name = "quantity_in_kg")
    private Long quantityInKg;

    @Column(name = "booking_id")
    private String bookingId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "create_date")
    private Long createDate;
}
