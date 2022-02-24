package com.codeclan.file.courseBookingService.components;

import com.codeclan.file.courseBookingService.controllers.BookingController;
import com.codeclan.file.courseBookingService.repositories.BookingRepository;
import com.codeclan.file.courseBookingService.repositories.CourseRepository;
import com.codeclan.file.courseBookingService.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;


}
