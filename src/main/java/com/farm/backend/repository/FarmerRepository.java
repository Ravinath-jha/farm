package com.farm.backend.repository;

import com.farm.backend.datatable.BookingEntity;
import com.farm.backend.datatable.FarmerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmerRepository extends JpaRepository<FarmerEntity, Long> {
}
