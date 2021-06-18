package com.getbrand.app.utils;

public class ServiceSubError {
    private String error;
    private String message;

    public ServiceSubError(String error) {
        this.error = error;
    }

    public ServiceSubError(String error, String message) {
        this.error = error;
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }
}
