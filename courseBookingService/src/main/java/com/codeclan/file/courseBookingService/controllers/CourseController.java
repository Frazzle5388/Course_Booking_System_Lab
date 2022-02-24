package com.codeclan.file.courseBookingService.controllers;

import com.codeclan.file.courseBookingService.models.Course;
import com.codeclan.file.courseBookingService.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getAllCourses(
            @RequestParam(required = false, name = "rating") Integer rating,
            @RequestParam(required = false, name = "customer") String customer
    ){
        if (rating != null){
            return new ResponseEntity(courseRepository.findByRating(rating), HttpStatus.OK);
        }
        if (customer != null){
            return new ResponseEntity(courseRepository.findCourseByBookingsCustomerName(customer), HttpStatus.OK);
        }
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }




    @GetMapping(value = "/courses/{id}")
    public ResponseEntity getCourse(@PathVariable Long id){
        Optional<Course> course = courseRepository.findById(id);
        if(!course.isPresent()) return new ResponseEntity<>(course, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }
}
