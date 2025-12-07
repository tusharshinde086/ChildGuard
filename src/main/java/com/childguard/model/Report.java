package com.childguard.model;

public class Report {

    private int id;
    private String title;
    private String location;
    private String description;
    private String status;
    private String date;   // Stored as String for easy JSP display

    public Report() {}

    // ----------- GETTERS & SETTERS -------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    // Store date as String for easy formatting in JSP
    public void setDate(String date) {
        this.date = date;
    }

}
