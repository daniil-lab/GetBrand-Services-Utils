package com.getbrand.app.utils.poster.request;

public class UpdateIntegrationRequest {
    private String apiKey;

    public UpdateIntegrationRequest() {};

    public UpdateIntegrationRequest(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
