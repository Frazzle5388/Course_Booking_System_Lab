package com.codeclan.file.courseBookingService.components;

import com.codeclan.file.courseBookingService.controllers.BookingController;
import com.codeclan.file.courseBookingService.models.Booking;
import com.codeclan.file.courseBookingService.models.Course;
import com.codeclan.file.courseBookingService.models.Customer;
import com.codeclan.file.courseBookingService.repositories.BookingRepository;
import com.codeclan.file.courseBookingService.repositories.CourseRepository;
import com.codeclan.file.courseBookingService.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.awt.print.Book;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Customer customer1 = new Customer("Mr Bean", "Mars", 1000);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Mr Smith", "Lancaster", 55);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Mr Jones", "Edinburgh", 25);
        customerRepository.save(customer3);


        Course course1 = new Course("Accounting", "Glenobyl", 3);
        courseRepository.save(course1);

        Course course2 = new Course("Software Development", "Edinburgh", 5);
        courseRepository.save(course2);

        Course course3 = new Course("Data", "Glasgow", 2);
        courseRepository.save(course3);


        Booking booking1 = new Booking("Booking 1", "01/01/2022", customer1, course2);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("Booking 2", "01/10/1066", customer2, course3);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("Booking 3", "10/10/2002", customer3, course1);
        bookingRepository.save(booking3);

    }
}
