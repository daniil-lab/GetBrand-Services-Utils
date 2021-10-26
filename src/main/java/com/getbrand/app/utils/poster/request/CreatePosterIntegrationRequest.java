package com.getbrand.app.utils.poster.request;

import java.util.UUID;

public class CreatePosterIntegrationRequest {
    private String apiKey;

    private UUID companyId;

    public CreatePosterIntegrationRequest() {};

    public CreatePosterIntegrationRequest(String apiKey, UUID companyId) {
        this.apiKey = apiKey;
        this.companyId = companyId;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public String getApiKey() {
        return apiKey;
    }
}
