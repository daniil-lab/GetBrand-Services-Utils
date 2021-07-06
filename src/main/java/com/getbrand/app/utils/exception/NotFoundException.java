package com.getbrand.app.utils.exception;

import com.getbrand.app.utils.ServiceSubError;

import java.util.List;

public class NotFoundException extends RuntimeException {
    private List<ServiceSubError> subErrors;

    private Class<NotFoundException> exception;

    public NotFoundException() {
        super();
    }

    public NotFoundException(List<ServiceSubError> subErrors) {
        super();
        this.subErrors = subErrors;
        this.exception = NotFoundException.class;
    }

    public List<ServiceSubError> getSubErrors() {
        return subErrors;
    }
}
