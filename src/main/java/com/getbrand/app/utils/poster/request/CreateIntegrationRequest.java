package com.getbrand.app.utils.poster.request;

public class CreateIntegrationRequest {
    private String apiKey;

    private String companyId;

    public CreateIntegrationRequest() {};

    public CreateIntegrationRequest(String apiKey, String companyId) {
        this.apiKey = apiKey;
        this.companyId = companyId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getApiKey() {
        return apiKey;
    }
}
