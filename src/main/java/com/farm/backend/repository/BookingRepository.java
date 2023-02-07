package com.farm.backend.repository;

import com.farm.backend.datatable.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Long> {

    Optional<BookingEntity> findByFarmerNameAndCropNameAndUserId(String farmerName,
                                                                 String cropName,
                                                                 String userId);

    List<BookingEntity> findByUserId(String userId);
}
