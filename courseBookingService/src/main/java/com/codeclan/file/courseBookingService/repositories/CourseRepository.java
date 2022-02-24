package com.codeclan.file.courseBookingService.repositories;

import com.codeclan.file.courseBookingService.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
