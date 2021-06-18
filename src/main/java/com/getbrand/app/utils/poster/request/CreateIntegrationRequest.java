package com.getbrand.app.utils.poster.request;

public class CreateIntegrationRequest {
    private String apiKey;

    public CreateIntegrationRequest() {};

    public CreateIntegrationRequest(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }
}
