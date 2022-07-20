package com.google.sps.model;

public class OH {
    private String ohId;
    private String courseId;
    private String day;
    private String startTime;
    private String endTime;
    private String location;
    private String taName;


    public OH(String ohId, String courseId, String day, String startTime, String endTime, String location, String taName) {
        this.ohId = ohId;
        this.courseId = courseId;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.taName = taName;
    }

    public String getohId() {
        return ohId;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getDay() {
        return day;
    }

    public void setday(String day) {
        this.day = day;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTaName() {
        return taName;
    }

    public void setTaName(String taName) {
        this.taName = taName;
    }
    
}
