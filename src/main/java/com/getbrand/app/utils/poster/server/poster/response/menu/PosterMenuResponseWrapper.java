package com.getbrand.app.utils.poster.server.poster.response.menu;

public class PosterMenuResponseWrapper {
    private Iterable<PosterMenuResponse> response;

    public PosterMenuResponseWrapper() {}

    public Iterable<PosterMenuResponse> getResponse() {
        return response;
    }

    public void setResponse(Iterable<PosterMenuResponse> response) {
        this.response = response;
    }
}
