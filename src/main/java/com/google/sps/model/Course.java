package com.google.sps.model;


public class Course {
    String courseId;
    String courseName;
    public String location;
    String instructorName;
    

    public Course(String courseId, String courseName, String location, String instructorName) {
        this. courseId = courseId;
        this.courseName = courseName;
        this.location = location;
        this.instructorName = instructorName;
    }  
}
