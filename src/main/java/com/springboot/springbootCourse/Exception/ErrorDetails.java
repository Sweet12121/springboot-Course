package com.springboot.springbootCourse.Exception;

import java.time.LocalDateTime;

public class ErrorDetails {
     private LocalDateTime times;
    private String message;
    private String details;

    public ErrorDetails(LocalDateTime times, String message, String details) {
        this.times = times;
        this.message = message;
        this.details = details;
    }

    public LocalDateTime getTimes() {
        return times;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
