package com.farm.backend.service;

import com.farm.backend.datatable.BookingEntity;
import com.farm.backend.models.BookingRQ;
import com.farm.backend.repository.BookingRepository;
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
@Import({BookingService.class})
public class BookingServiceTests {

    @Autowired
    BookingService bookingService;

    @Autowired
    BookingRepository bookingRepository;

    @BeforeEach
    public void createTestBookingData() {
        try {
            for (int i = 1; i <= 100; i++) {
                BookingRQ request = BookingRQ.builder()
                        .bookingAmount((double) (100 + i))
                        .farmerName("RAVI_" + i)
                        .bookingDate(new Date())
                        .cropName("CROP_NAME_" + i)
                        .quantityInKg((long) (10 + i))
                        .userId(UUID.randomUUID().toString())
                        .build();
                bookingService.createBooking(request);
            }
        } catch (Exception e) {
            fail(e);
        }
    }

    @Test
    void testCreateBooking_Success() {
        try {
            BookingRQ request = BookingRQ.builder()
                    .bookingAmount(100D)
                    .farmerName("RAVI_")
                    .bookingDate(new Date())
                    .cropName("CROP_NAME_")
                    .quantityInKg(10L)
                    .userId(UUID.randomUUID().toString())
                    .build();
            BookingEntity output = bookingService.createBooking(request);
            assertNotNull(output);
            assertEquals(output.getBookingAmount(), request.getBookingAmount());
            assertEquals(output.getFarmerName(), request.getFarmerName());
            assertEquals(output.getBookingDate(), request.getBookingDate());
            assertEquals(output.getCropName(), request.getCropName());
            assertEquals(output.getQuantityInKg(), request.getQuantityInKg());
            assertEquals(output.getUserId(), request.getUserId());


        } catch (Exception e) {
            fail(e);
        }
    }


    @Test
    void testFetchAllBookings() {
        List<BookingEntity> bookingEntities = bookingService.fetchAllBooking();
        assertNotNull(bookingEntities);
        
    }

    @Test
    void testFetchAllBookingsByUserId() {
        List<BookingEntity> bookingEntityList = bookingRepository.findAll();
        List<BookingEntity> bookingEntities = bookingService
                .fetchAllBookingByUserId(bookingEntityList.get(0).getUserId());
        assertNotNull(bookingEntities);
        assertEquals(1, bookingEntities.size());
    }

    @Test
    void testCreateBooking_Success_1() {
        try {
            BookingRQ request = BookingRQ.builder()
                    .bookingAmount(100D)
                    .farmerName("RAVI_")
                    .bookingDate(new Date())
                    .cropName("CROP_NAME_")
                    .quantityInKg(10L)
                    .userId(UUID.randomUUID().toString())
                    .build();
            BookingEntity output = bookingService.createBooking(request);
            assertNotNull(output);
            assertEquals(output.getBookingAmount(), request.getBookingAmount());
            assertEquals(output.getFarmerName(), request.getFarmerName());
            assertEquals(output.getBookingDate(), request.getBookingDate());
            assertEquals(output.getCropName(), request.getCropName());
            assertEquals(output.getQuantityInKg(), request.getQuantityInKg());
            assertEquals(output.getUserId(), request.getUserId());


        } catch (Exception e) {
            fail(e);
        }
    }

    @Test
    void testFetchAllBookings_1() {
        List<BookingEntity> bookingEntities = bookingService.fetchAllBooking();
        assertNotNull(bookingEntities);
        
    }

    @Test
    void testFetchAllBookingsByUserId_1() {
        List<BookingEntity> bookingEntityList = bookingRepository.findAll();
        List<BookingEntity> bookingEntities = bookingService
                .fetchAllBookingByUserId(bookingEntityList.get(0).getUserId());
        assertNotNull(bookingEntities);
        assertEquals(1, bookingEntities.size());
    }

    @Test
    void testCreateBooking_Success_2() {
        try {
            BookingRQ request = BookingRQ.builder()
                    .bookingAmount(100D)
                    .farmerName("RAVI_")
                    .bookingDate(new Date())
                    .cropName("CROP_NAME_")
                    .quantityInKg(10L)
                    .userId(UUID.randomUUID().toString())
                    .build();
            BookingEntity output = bookingService.createBooking(request);
            assertNotNull(output);
            assertEquals(output.getBookingAmount(), request.getBookingAmount());
            assertEquals(output.getFarmerName(), request.getFarmerName());
            assertEquals(output.getBookingDate(), request.getBookingDate());
            assertEquals(output.getCropName(), request.getCropName());
            assertEquals(output.getQuantityInKg(), request.getQuantityInKg());
            assertEquals(output.getUserId(), request.getUserId());


        } catch (Exception e) {
            fail(e);
        }
    }

    @Test
    void testFetchAllBookings_2() {
        List<BookingEntity> bookingEntities = bookingService.fetchAllBooking();
        assertNotNull(bookingEntities);
        
    }

    @Test
    void testFetchAllBookingsByUserId_2() {
        List<BookingEntity> bookingEntityList = bookingRepository.findAll();
        List<BookingEntity> bookingEntities = bookingService
                .fetchAllBookingByUserId(bookingEntityList.get(0).getUserId());
        assertNotNull(bookingEntities);
        assertEquals(1, bookingEntities.size());
    }

    @Test
    void testCreateBooking_Success_3() {
        try {
            BookingRQ request = BookingRQ.builder()
                    .bookingAmount(100D)
                    .farmerName("RAVI_")
                    .bookingDate(new Date())
                    .cropName("CROP_NAME_")
                    .quantityInKg(10L)
                    .userId(UUID.randomUUID().toString())
                    .build();
            BookingEntity output = bookingService.createBooking(request);
            assertNotNull(output);
            assertEquals(output.getBookingAmount(), request.getBookingAmount());
            assertEquals(output.getFarmerName(), request.getFarmerName());
            assertEquals(output.getBookingDate(), request.getBookingDate());
            assertEquals(output.getCropName(), request.getCropName());
            assertEquals(output.getQuantityInKg(), request.getQuantityInKg());
            assertEquals(output.getUserId(), request.getUserId());


        } catch (Exception e) {
            fail(e);
        }
    }

    @Test
    void testFetchAllBookings_3() {
        List<BookingEntity> bookingEntities = bookingService.fetchAllBooking();
        assertNotNull(bookingEntities);
        
    }

    @Test
    void testFetchAllBookingsByUserId_3() {
        List<BookingEntity> bookingEntityList = bookingRepository.findAll();
        List<BookingEntity> bookingEntities = bookingService
                .fetchAllBookingByUserId(bookingEntityList.get(0).getUserId());
        assertNotNull(bookingEntities);
        assertEquals(1, bookingEntities.size());
    }

    @Test
    void testCreateBooking_Success_4() {
        try {
            BookingRQ request = BookingRQ.builder()
                    .bookingAmount(100D)
                    .farmerName("RAVI_")
                    .bookingDate(new Date())
                    .cropName("CROP_NAME_")
                    .quantityInKg(10L)
                    .userId(UUID.randomUUID().toString())
                    .build();
            BookingEntity output = bookingService.createBooking(request);
            assertNotNull(output);
            assertEquals(output.getBookingAmount(), request.getBookingAmount());
            assertEquals(output.getFarmerName(), request.getFarmerName());
            assertEquals(output.getBookingDate(), request.getBookingDate());
            assertEquals(output.getCropName(), request.getCropName());
            assertEquals(output.getQuantityInKg(), request.getQuantityInKg());
            assertEquals(output.getUserId(), request.getUserId());


        } catch (Exception e) {
            fail(e);
        }
    }

    @Test
    void testFetchAllBookings_4() {
        List<BookingEntity> bookingEntities = bookingService.fetchAllBooking();
        assertNotNull(bookingEntities);
        
    }

    @Test
    void testFetchAllBookingsByUserId_4() {
        List<BookingEntity> bookingEntityList = bookingRepository.findAll();
        List<BookingEntity> bookingEntities = bookingService
                .fetchAllBookingByUserId(bookingEntityList.get(0).getUserId());
        assertNotNull(bookingEntities);
        assertEquals(1, bookingEntities.size());
    }

    @Test
    void testCreateBooking_Success_5() {
        try {
            BookingRQ request = BookingRQ.builder()
                    .bookingAmount(100D)
                    .farmerName("RAVI_")
                    .bookingDate(new Date())
                    .cropName("CROP_NAME_")
                    .quantityInKg(10L)
                    .userId(UUID.randomUUID().toString())
                    .build();
            BookingEntity output = bookingService.createBooking(request);
            assertNotNull(output);
            assertEquals(output.getBookingAmount(), request.getBookingAmount());
            assertEquals(output.getFarmerName(), request.getFarmerName());
            assertEquals(output.getBookingDate(), request.getBookingDate());
            assertEquals(output.getCropName(), request.getCropName());
            assertEquals(output.getQuantityInKg(), request.getQuantityInKg());
            assertEquals(output.getUserId(), request.getUserId());


        } catch (Exception e) {
            fail(e);
        }
    }

    @Test
    void testFetchAllBookings_5() {
        List<BookingEntity> bookingEntities = bookingService.fetchAllBooking();
        assertNotNull(bookingEntities);
        
    }

    @Test
    void testFetchAllBookingsByUserId_5() {
        List<BookingEntity> bookingEntityList = bookingRepository.findAll();
        List<BookingEntity> bookingEntities = bookingService
                .fetchAllBookingByUserId(bookingEntityList.get(0).getUserId());
        assertNotNull(bookingEntities);
        assertEquals(1, bookingEntities.size());
    }

    @Test
    void testCreateBooking_Success_6() {
        try {
            BookingRQ request = BookingRQ.builder()
                    .bookingAmount(100D)
                    .farmerName("RAVI_")
                    .bookingDate(new Date())
                    .cropName("CROP_NAME_")
                    .quantityInKg(10L)
                    .userId(UUID.randomUUID().toString())
                    .build();
            BookingEntity output = bookingService.createBooking(request);
            assertNotNull(output);
            assertEquals(output.getBookingAmount(), request.getBookingAmount());
            assertEquals(output.getFarmerName(), request.getFarmerName());
            assertEquals(output.getBookingDate(), request.getBookingDate());
            assertEquals(output.getCropName(), request.getCropName());
            assertEquals(output.getQuantityInKg(), request.getQuantityInKg());
            assertEquals(output.getUserId(), request.getUserId());


        } catch (Exception e) {
            fail(e);
        }
    }

    @Test
    void testFetchAllBookings_6() {
        List<BookingEntity> bookingEntities = bookingService.fetchAllBooking();
        assertNotNull(bookingEntities);
        
    }

    @Test
    void testFetchAllBookingsByUserId_6() {
        List<BookingEntity> bookingEntityList = bookingRepository.findAll();
        List<BookingEntity> bookingEntities = bookingService
                .fetchAllBookingByUserId(bookingEntityList.get(0).getUserId());
        assertNotNull(bookingEntities);
        assertEquals(1, bookingEntities.size());
    }



}
