package com.google.sps.model;


public class Course {
    private String courseId;
    private String courseName;
    private String location;
    private String instructorName;
    

    public Course(String courseId, String courseName, String location, String instructorName) {
        this. courseId = courseId;
        this.courseName = courseName;
        this.location = location;
        this.instructorName = instructorName;
    } 
    
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getInstructorName() {
        return instructorName;
    }
}
