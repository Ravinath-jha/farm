package com.farm.backend.service;

import com.farm.backend.datatable.CropEntity;
import com.farm.backend.models.CropRQ;
import com.farm.backend.repository.CropRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CropService {

    @Autowired
    CropRepository cropRepository;

    public CropEntity createCrop(CropRQ request) {
        return cropRepository.save(
                CropEntity.builder()
                        .cropName(request.getCropName())
                        .cropType(request.getCropType())
                        .isSeasonal(request.isSeasonal())
                        .farmerName(request.getFarmerName())
                        .pricePerKg(request.getPricePerKg())
                        .build()
        );
    }

    public List<CropEntity> fetchAllCrops() {
        List<CropEntity> cropEntities = cropRepository.findAll();
        if (CollectionUtils.isEmpty(cropEntities)) {
            cropEntities = new ArrayList<>();
        }
        return cropEntities;
    }
}
