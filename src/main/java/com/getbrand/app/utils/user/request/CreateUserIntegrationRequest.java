package com.getbrand.app.utils.user.request;

import java.util.UUID;

public class CreateUserIntegrationRequest {
    private UUID companyId;

    public CreateUserIntegrationRequest(UUID companyId) {
        this.companyId = companyId;
    }

    public CreateUserIntegrationRequest() {};

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }
}
