package com.codeclan.file.courseBookingService.repositories;

import com.codeclan.file.courseBookingService.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
