package com.childguard.model;

import java.sql.Timestamp;

public class Report {

    private int id;
    private String title;
    private String location;
    private String description;
    private String status;
    private Timestamp date;  // Must be Timestamp ✔

    public Report() {}

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

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {  // ✔ FIXED
        this.date = date;
    }
}
