package com.codeclan.file.courseBookingService.repositories;

import com.codeclan.file.courseBookingService.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
