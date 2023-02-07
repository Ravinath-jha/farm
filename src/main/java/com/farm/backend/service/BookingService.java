package com.farm.backend.service;

import com.farm.backend.datatable.BookingEntity;
import com.farm.backend.models.BookingRQ;
import com.farm.backend.repository.BookingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;

    public BookingEntity createBooking(BookingRQ request) throws Exception {
        Optional<BookingEntity> bookingEntityOptional = bookingRepository
                .findByFarmerNameAndCropNameAndUserId(request.getFarmerName(),
                        request.getCropName(),
                        request.getUserId());
        if (bookingEntityOptional.isPresent()) {
            throw new Exception("Booking already exist");
        }
        BookingEntity bookingEntity = BookingEntity
                .builder()
                .bookingAmount(request.getBookingAmount())
                .farmerName(request.getFarmerName())
                .bookingDate(request.getBookingDate())
                .cropName(request.getCropName())
                .quantityInKg(request.getQuantityInKg())
                .bookingId(String.valueOf(System.currentTimeMillis()))
                .userId(request.getUserId())
                .createDate(System.currentTimeMillis())
                .build();
        return bookingRepository.save(bookingEntity);
    }

    public List<BookingEntity> fetchAllBookingByUserId(String userId) {
        List<BookingEntity> result = bookingRepository.findByUserId(userId);
        if (CollectionUtils.isEmpty(result)) {
            result = new ArrayList<>();
        }
        return result;
    }

    public List<BookingEntity> fetchAllBooking() {
        List<BookingEntity> result = bookingRepository.findAll();
        if (CollectionUtils.isEmpty(result)) {
            result = new ArrayList<>();
        }
        return result;
    }
}
