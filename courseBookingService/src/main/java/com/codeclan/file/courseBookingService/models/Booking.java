package com.codeclan.file.courseBookingService.models;

public class Booking {

    private String name;
    private String date;
    private Customer customer;
    private Course course;


    public Booking(String name, String date, Customer customer, Course course) {
        this.name = name;
        this.date = date;
        this.customer = customer;
        this.course = course;
    }

    public Booking() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
