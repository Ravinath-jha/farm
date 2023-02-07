package com.farm.backend.service;

import com.farm.backend.datatable.CropEntity;
import com.farm.backend.models.BookingRQ;
import com.farm.backend.models.CropRQ;
import com.farm.backend.repository.CropRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ComponentScan(basePackages = {"com.farm.*"})
@Import({CropService.class})
public class CropServiceTests {

    @Autowired
    CropService cropService;

    @Autowired
    CropRepository cropRepository;

    @BeforeEach
    public void createTestCropData() {
        try {
            for (int i = 1; i <= 100; i++) {
                CropRQ request = CropRQ.builder()
                        .cropName("CROP_NAME_" + i)
                        .cropType("TYPE_" + i)
                        .isSeasonal(true)
                        .farmerName("RAVI_" + i)
                        .pricePerKg((long) i)
                        .build();
                cropService.createCrop(request);
            }
        } catch (Exception e) {
            fail(e);
        }
    }

    @Test
    void testCreateCrop() {
        CropRQ request = CropRQ.builder()
                .cropName("CROP_NAME_")
                .cropType("TYPE_")
                .isSeasonal(false)
                .farmerName("RAVI_")
                .pricePerKg((long) 10)
                .build();
        CropEntity cropEntity = cropService.createCrop(request);
        assertEquals(cropEntity.getCropName(), request.getCropName());
        assertEquals(cropEntity.getCropType(), request.getCropType());
        assertEquals(cropEntity.isSeasonal(), request.isSeasonal());
        assertEquals(cropEntity.getFarmerName(), request.getFarmerName());
        assertEquals(cropEntity.getPricePerKg(), request.getPricePerKg());

    }

    @Test
    void testFetchAllCrops() {
        List<CropEntity> cropEntities = cropService.fetchAllCrops();
        assertNotNull(cropEntities);
    }


    @Test
    void testCreateCrop_1() {
        CropRQ request = CropRQ.builder()
                .cropName("CROP_NAME_")
                .cropType("TYPE_")
                .isSeasonal(false)
                .farmerName("RAVI_")
                .pricePerKg((long) 10)
                .build();
        CropEntity cropEntity = cropService.createCrop(request);
        assertEquals(cropEntity.getCropName(), request.getCropName());
        assertEquals(cropEntity.getCropType(), request.getCropType());
        assertEquals(cropEntity.isSeasonal(), request.isSeasonal());
        assertEquals(cropEntity.getFarmerName(), request.getFarmerName());
        assertEquals(cropEntity.getPricePerKg(), request.getPricePerKg());

    }

    @Test
    void testFetchAllCrops_1() {
        List<CropEntity> cropEntities = cropService.fetchAllCrops();
        assertNotNull(cropEntities);
    }

    @Test
    void testCreateCrop_2() {
        CropRQ request = CropRQ.builder()
                .cropName("CROP_NAME_")
                .cropType("TYPE_")
                .isSeasonal(false)
                .farmerName("RAVI_")
                .pricePerKg((long) 10)
                .build();
        CropEntity cropEntity = cropService.createCrop(request);
        assertEquals(cropEntity.getCropName(), request.getCropName());
        assertEquals(cropEntity.getCropType(), request.getCropType());
        assertEquals(cropEntity.isSeasonal(), request.isSeasonal());
        assertEquals(cropEntity.getFarmerName(), request.getFarmerName());
        assertEquals(cropEntity.getPricePerKg(), request.getPricePerKg());

    }

    @Test
    void testFetchAllCrops_2() {
        List<CropEntity> cropEntities = cropService.fetchAllCrops();
        assertNotNull(cropEntities);
    }

    @Test
    void testCreateCrop_3() {
        CropRQ request = CropRQ.builder()
                .cropName("CROP_NAME_")
                .cropType("TYPE_")
                .isSeasonal(false)
                .farmerName("RAVI_")
                .pricePerKg((long) 10)
                .build();
        CropEntity cropEntity = cropService.createCrop(request);
        assertEquals(cropEntity.getCropName(), request.getCropName());
        assertEquals(cropEntity.getCropType(), request.getCropType());
        assertEquals(cropEntity.isSeasonal(), request.isSeasonal());
        assertEquals(cropEntity.getFarmerName(), request.getFarmerName());
        assertEquals(cropEntity.getPricePerKg(), request.getPricePerKg());

    }

    @Test
    void testFetchAllCrops_3() {
        List<CropEntity> cropEntities = cropService.fetchAllCrops();
        assertNotNull(cropEntities);
    }


    @Test
    void testCreateCrop_4() {
        CropRQ request = CropRQ.builder()
                .cropName("CROP_NAME_")
                .cropType("TYPE_")
                .isSeasonal(false)
                .farmerName("RAVI_")
                .pricePerKg((long) 10)
                .build();
        CropEntity cropEntity = cropService.createCrop(request);
        assertEquals(cropEntity.getCropName(), request.getCropName());
        assertEquals(cropEntity.getCropType(), request.getCropType());
        assertEquals(cropEntity.isSeasonal(), request.isSeasonal());
        assertEquals(cropEntity.getFarmerName(), request.getFarmerName());
        assertEquals(cropEntity.getPricePerKg(), request.getPricePerKg());

    }

    @Test
    void testFetchAllCrops_4() {
        List<CropEntity> cropEntities = cropService.fetchAllCrops();
        assertNotNull(cropEntities);
    }

    @Test
    void testCreateCrop_5() {
        CropRQ request = CropRQ.builder()
                .cropName("CROP_NAME_")
                .cropType("TYPE_")
                .isSeasonal(false)
                .farmerName("RAVI_")
                .pricePerKg((long) 10)
                .build();
        CropEntity cropEntity = cropService.createCrop(request);
        assertEquals(cropEntity.getCropName(), request.getCropName());
        assertEquals(cropEntity.getCropType(), request.getCropType());
        assertEquals(cropEntity.isSeasonal(), request.isSeasonal());
        assertEquals(cropEntity.getFarmerName(), request.getFarmerName());
        assertEquals(cropEntity.getPricePerKg(), request.getPricePerKg());

    }

    @Test
    void testFetchAllCrops_5() {
        List<CropEntity> cropEntities = cropService.fetchAllCrops();
        assertNotNull(cropEntities);
    }

    @Test
    void testCreateCrop_6() {
        CropRQ request = CropRQ.builder()
                .cropName("CROP_NAME_")
                .cropType("TYPE_")
                .isSeasonal(false)
                .farmerName("RAVI_")
                .pricePerKg((long) 10)
                .build();
        CropEntity cropEntity = cropService.createCrop(request);
        assertEquals(cropEntity.getCropName(), request.getCropName());
        assertEquals(cropEntity.getCropType(), request.getCropType());
        assertEquals(cropEntity.isSeasonal(), request.isSeasonal());
        assertEquals(cropEntity.getFarmerName(), request.getFarmerName());
        assertEquals(cropEntity.getPricePerKg(), request.getPricePerKg());

    }

    @Test
    void testFetchAllCrops_6() {
        List<CropEntity> cropEntities = cropService.fetchAllCrops();
        assertNotNull(cropEntities);
    }

}
