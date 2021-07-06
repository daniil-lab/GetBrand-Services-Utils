package com.getbrand.app.utils.company.models;

import com.getbrand.app.utils.IntegrationType;

import java.util.UUID;

public class CompanyIntegration {
    private UUID integrationId;

    private IntegrationType integrationType;

    public CompanyIntegration(UUID integrationId, IntegrationType integrationType) {
        this.integrationId = integrationId;
        this.integrationType = integrationType;
    }

    public CompanyIntegration() {};

    public void setIntegrationId(UUID integrationId) {
        this.integrationId = integrationId;
    }

    public void setIntegrationType(IntegrationType integrationType) {
        this.integrationType = integrationType;
    }

    public UUID getIntegrationId() {
        return integrationId;
    }

    public IntegrationType getIntegrationType() {
        return integrationType;
    }
}
