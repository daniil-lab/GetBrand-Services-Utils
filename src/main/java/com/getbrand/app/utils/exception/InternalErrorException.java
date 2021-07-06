package com.getbrand.app.utils.exception;

import com.getbrand.app.utils.ServiceSubError;

import java.util.List;

public class InternalErrorException extends RuntimeException {
    private List<ServiceSubError> subErrors;

    private Class<InternalErrorException> exception;

    public InternalErrorException() {
        super();
    }

    public InternalErrorException(List<ServiceSubError> subErrors) {
        super();
        this.subErrors = subErrors;
        this.exception = InternalErrorException.class;
    }

    public Class<InternalErrorException> getException() {
        return exception;
    }

    public List<ServiceSubError> getSubErrors() {
        return subErrors;
    }
}
