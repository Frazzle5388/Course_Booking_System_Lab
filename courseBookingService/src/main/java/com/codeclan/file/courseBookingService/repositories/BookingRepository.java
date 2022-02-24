package com.codeclan.file.courseBookingService.repositories;

import com.codeclan.file.courseBookingService.models.Booking;
import com.codeclan.file.courseBookingService.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByDate(String Date);

}
