package com.getbrand.app.utils.poster.request;

public class UpdatePosterIntegrationRequest {
    private String apiKey;

    public UpdatePosterIntegrationRequest() {};

    public UpdatePosterIntegrationRequest(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
