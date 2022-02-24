package com.codeclan.file.courseBookingService.controllers;

import com.codeclan.file.courseBookingService.models.Booking;
import com.codeclan.file.courseBookingService.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/bookings")
    public ResponseEntity<List<Booking>> getAllBookings(){
        return new ResponseEntity<>(bookingRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/bookings/{id}")
    public ResponseEntity getBooking(@PathVariable Long id){
        Optional<Booking> booking = bookingRepository.findById(id);
        if(!booking.isPresent()) return new ResponseEntity<>(booking, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(booking, HttpStatus.OK);
    }

}
