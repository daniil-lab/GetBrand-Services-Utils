package com.getbrand.app.utils.poster.server.poster.response;

public class PosterResponse<T> {
    private T response;

    public PosterResponse() {}

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }
}
