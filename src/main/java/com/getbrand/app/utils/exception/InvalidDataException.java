package com.getbrand.app.utils.exception;

import com.getbrand.app.utils.ServiceSubError;

import java.util.List;

public class InvalidDataException extends RuntimeException {
    private List<ServiceSubError> subErrors;

    private Class<InvalidDataException> exception;

    public InvalidDataException() {
        super();
    }

    public InvalidDataException(List<ServiceSubError> subErrors) {
        super();
        this.subErrors = subErrors;
        this.exception = InvalidDataException.class;
    }

    public List<ServiceSubError> getSubErrors() {
        return subErrors;
    }
}
