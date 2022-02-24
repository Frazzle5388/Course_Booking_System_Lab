package com.codeclan.file.courseBookingService.repositories;

import com.codeclan.file.courseBookingService.models.Course;
import com.codeclan.file.courseBookingService.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findCustomerByBookingsCourseName(String course);

}
