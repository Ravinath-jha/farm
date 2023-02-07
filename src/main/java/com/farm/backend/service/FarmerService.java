package com.farm.backend.service;

import com.farm.backend.datatable.FarmerEntity;
import com.farm.backend.models.FarmerRQ;
import com.farm.backend.repository.FarmerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class FarmerService {

    @Autowired
    FarmerRepository farmerRepository;
    public FarmerEntity createFarmer(FarmerRQ request) {
        return farmerRepository.save(
                FarmerEntity
                        .builder()
                        .name(request.getName())
                        .contact(request.getContact())
                        .farmAddress(request.getFarmAddress())
                        .farmingAreaInSqMeter(request.getFarmingAreaInSqMeter())
                        .build()
        );
    }

    public List<FarmerEntity> fetchAllFarmers() {
        List<FarmerEntity> farmerEntities = farmerRepository.findAll();
        if (CollectionUtils.isEmpty(farmerEntities)){
            farmerEntities = new ArrayList<>();
        }
        return farmerEntities;
    }
}
