package com.farm.backend.service;

import com.farm.backend.datatable.FarmerEntity;
import com.farm.backend.models.CropRQ;
import com.farm.backend.models.FarmerRQ;
import com.farm.backend.repository.FarmerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ComponentScan(basePackages = {"com.farm.*"})
@Import({FarmerService.class})
public class FarmerServiceTests {

    @Autowired
    FarmerService farmerService;

    @Autowired
    FarmerRepository farmerRepository;

    @BeforeEach
    public void createTestData() {
        try {
            Thread.sleep(30*1000);
            for (int i = 1; i <= 100; i++) {
                FarmerRQ farmerRQ = FarmerRQ
                        .builder()
                        .name("RAVI_" + i)
                        .contact("8010121212" + i)
                        .farmAddress("ABCD_" + i)
                        .farmingAreaInSqMeter(22.5 + i)
                        .build();
                farmerService.createFarmer(farmerRQ);
            }
        } catch (Exception e) {
            fail(e);
        }
    }

    @Test
    void testCreateFarmer() {
        FarmerRQ farmerRQ = FarmerRQ
                .builder()
                .name("RAVI_")
                .contact("8010121212")
                .farmAddress("ABCD_")
                .farmingAreaInSqMeter(22.5)
                .build();
        FarmerEntity farmerEntity = farmerService.createFarmer(farmerRQ);
        assertNotNull(farmerEntity);
        assertEquals(farmerEntity.getName(), farmerRQ.getName());
        assertEquals(farmerEntity.getContact(), farmerRQ.getContact());
        assertEquals(farmerEntity.getFarmAddress(), farmerRQ.getFarmAddress());
        assertEquals(farmerEntity.getFarmingAreaInSqMeter(), farmerRQ.getFarmingAreaInSqMeter());

    }

    @Test
    void testFetchAllFarmer() {
        List<FarmerEntity> farmerEntities = farmerService.fetchAllFarmers();
        assertNotNull(farmerEntities);
    }

    @Test
    void testCreateFarmer_1() {
        FarmerRQ farmerRQ = FarmerRQ
                .builder()
                .name("RAVI_")
                .contact("8010121212")
                .farmAddress("ABCD_")
                .farmingAreaInSqMeter(22.5)
                .build();
        FarmerEntity farmerEntity = farmerService.createFarmer(farmerRQ);
        assertNotNull(farmerEntity);
        assertEquals(farmerEntity.getName(), farmerRQ.getName());
        assertEquals(farmerEntity.getContact(), farmerRQ.getContact());
        assertEquals(farmerEntity.getFarmAddress(), farmerRQ.getFarmAddress());
        assertEquals(farmerEntity.getFarmingAreaInSqMeter(), farmerRQ.getFarmingAreaInSqMeter());

    }

    @Test
    void testFetchAllFarmer_1() {
        List<FarmerEntity> farmerEntities = farmerService.fetchAllFarmers();
        assertNotNull(farmerEntities);
    }

    @Test
    void testCreateFarmer_2() {
        FarmerRQ farmerRQ = FarmerRQ
                .builder()
                .name("RAVI_")
                .contact("8010121212")
                .farmAddress("ABCD_")
                .farmingAreaInSqMeter(22.5)
                .build();
        FarmerEntity farmerEntity = farmerService.createFarmer(farmerRQ);
        assertNotNull(farmerEntity);
        assertEquals(farmerEntity.getName(), farmerRQ.getName());
        assertEquals(farmerEntity.getContact(), farmerRQ.getContact());
        assertEquals(farmerEntity.getFarmAddress(), farmerRQ.getFarmAddress());
        assertEquals(farmerEntity.getFarmingAreaInSqMeter(), farmerRQ.getFarmingAreaInSqMeter());

    }

    @Test
    void testFetchAllFarmer_2() {
        List<FarmerEntity> farmerEntities = farmerService.fetchAllFarmers();
        assertNotNull(farmerEntities);
    }

    @Test
    void testCreateFarmer_3() {
        FarmerRQ farmerRQ = FarmerRQ
                .builder()
                .name("RAVI_")
                .contact("8010121212")
                .farmAddress("ABCD_")
                .farmingAreaInSqMeter(22.5)
                .build();
        FarmerEntity farmerEntity = farmerService.createFarmer(farmerRQ);
        assertNotNull(farmerEntity);
        assertEquals(farmerEntity.getName(), farmerRQ.getName());
        assertEquals(farmerEntity.getContact(), farmerRQ.getContact());
        assertEquals(farmerEntity.getFarmAddress(), farmerRQ.getFarmAddress());
        assertEquals(farmerEntity.getFarmingAreaInSqMeter(), farmerRQ.getFarmingAreaInSqMeter());

    }

    @Test
    void testFetchAllFarmer_3() {
        List<FarmerEntity> farmerEntities = farmerService.fetchAllFarmers();
        assertNotNull(farmerEntities);
    }

    @Test
    void testCreateFarmer_4() {
        FarmerRQ farmerRQ = FarmerRQ
                .builder()
                .name("RAVI_")
                .contact("8010121212")
                .farmAddress("ABCD_")
                .farmingAreaInSqMeter(22.5)
                .build();
        FarmerEntity farmerEntity = farmerService.createFarmer(farmerRQ);
        assertNotNull(farmerEntity);
        assertEquals(farmerEntity.getName(), farmerRQ.getName());
        assertEquals(farmerEntity.getContact(), farmerRQ.getContact());
        assertEquals(farmerEntity.getFarmAddress(), farmerRQ.getFarmAddress());
        assertEquals(farmerEntity.getFarmingAreaInSqMeter(), farmerRQ.getFarmingAreaInSqMeter());

    }

    @Test
    void testFetchAllFarmer_4() {
        List<FarmerEntity> farmerEntities = farmerService.fetchAllFarmers();
        assertNotNull(farmerEntities);
    }

    @Test
    void testCreateFarmer_5() {
        FarmerRQ farmerRQ = FarmerRQ
                .builder()
                .name("RAVI_")
                .contact("8010121212")
                .farmAddress("ABCD_")
                .farmingAreaInSqMeter(22.5)
                .build();
        FarmerEntity farmerEntity = farmerService.createFarmer(farmerRQ);
        assertNotNull(farmerEntity);
        assertEquals(farmerEntity.getName(), farmerRQ.getName());
        assertEquals(farmerEntity.getContact(), farmerRQ.getContact());
        assertEquals(farmerEntity.getFarmAddress(), farmerRQ.getFarmAddress());
        assertEquals(farmerEntity.getFarmingAreaInSqMeter(), farmerRQ.getFarmingAreaInSqMeter());

    }

    @Test
    void testFetchAllFarmer_5() {
        List<FarmerEntity> farmerEntities = farmerService.fetchAllFarmers();
        assertNotNull(farmerEntities);
    }

    @Test
    void testCreateFarmer_6() {
        FarmerRQ farmerRQ = FarmerRQ
                .builder()
                .name("RAVI_")
                .contact("8010121212")
                .farmAddress("ABCD_")
                .farmingAreaInSqMeter(22.5)
                .build();
        FarmerEntity farmerEntity = farmerService.createFarmer(farmerRQ);
        assertNotNull(farmerEntity);
        assertEquals(farmerEntity.getName(), farmerRQ.getName());
        assertEquals(farmerEntity.getContact(), farmerRQ.getContact());
        assertEquals(farmerEntity.getFarmAddress(), farmerRQ.getFarmAddress());
        assertEquals(farmerEntity.getFarmingAreaInSqMeter(), farmerRQ.getFarmingAreaInSqMeter());

    }

    @Test
    void testFetchAllFarmer_6() {
        List<FarmerEntity> farmerEntities = farmerService.fetchAllFarmers();
        assertNotNull(farmerEntities);
    }
}
