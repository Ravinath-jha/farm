package com.farm.backend.repository;

import com.farm.backend.datatable.BookingEntity;
import com.farm.backend.datatable.ToolsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToolsRepository extends JpaRepository<ToolsEntity, Long> {
}
