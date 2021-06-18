package com.getbrand.app.utils.menu.request;

import com.getbrand.app.utils.IntegrationType;

public class CreateMenuRequest {
    private String integrationId;
    private IntegrationType integrationType;

    public CreateMenuRequest() {};

    public CreateMenuRequest(String integrationId, IntegrationType integrationType) {
        this.integrationId = integrationId;
        this.integrationType = integrationType;
    }

    public IntegrationType getIntegrationType() {
        return integrationType;
    }

    public String getIntegrationId() {
        return integrationId;
    }
}
