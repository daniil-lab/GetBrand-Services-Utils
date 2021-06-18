package com.getbrand.app.utils;

import java.util.List;

public class ServiceError {
    private String error;
    private String message;
    private int status;
    private int systemCode;
    private List<ServiceSubError> subErrors;

    public ServiceError(String message, int status, List<ServiceSubError> subErrors) {
        this.message = message;
        this.status = status;
        this.subErrors = subErrors;
    }

    public ServiceError(String error, String message, int status, List<ServiceSubError> subErrors) {
        this.error = error;
        this.message = message;
        this.status = status;
        this.subErrors = subErrors;
    }

    public ServiceError(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public ServiceError(String error, String message, int status) {
        this.error = error;
        this.message = message;
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public List<ServiceSubError> getSubErrors() {
        return subErrors;
    }

    public int getStatus() {
        return status;
    }
}
