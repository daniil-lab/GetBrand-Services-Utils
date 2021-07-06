package com.getbrand.app.utils;

import java.util.List;

public class ServiceError {
    private String error;
    private String message;
    private int status;
    private int systemCode;
    private List<ServiceSubError> subErrors;
    private Class<? extends RuntimeException> exception;

    public ServiceError(String message, int status, List<ServiceSubError> subErrors, Class<? extends RuntimeException> exception) {
        this.message = message;
        this.status = status;
        this.subErrors = subErrors;
        this.exception = exception;
    }

    public ServiceError(String error, String message, int status, List<ServiceSubError> subErrors, Class<? extends RuntimeException> exception) {
        this.error = error;
        this.message = message;
        this.status = status;
        this.subErrors = subErrors;
        this.exception = exception;
    }

    public ServiceError(String message, int status, Class<? extends RuntimeException> exception) {
        this.message = message;
        this.status = status;
        this.exception = exception;
    }

    public ServiceError(String error, String message, int status, Class<? extends RuntimeException> exception) {
        this.error = error;
        this.message = message;
        this.status = status;
        this.exception = exception;
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
