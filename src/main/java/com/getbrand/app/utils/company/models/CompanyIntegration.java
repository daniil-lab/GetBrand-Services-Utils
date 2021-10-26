package com.getbrand.app.utils.company.models;

import com.getbrand.app.utils.IntegrationType;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class CompanyIntegration {
    @Id
    private UUID id;

    private UUID integrationId;

    private IntegrationType integrationType;

    public CompanyIntegration(UUID integrationId, IntegrationType integrationType) {
        this.id = UUID.randomUUID();
        this.integrationId = integrationId;
        this.integrationType = integrationType;
    }

    public CompanyIntegration(IntegrationType integrationType) {
        this.integrationType = integrationType;
        this.id = UUID.randomUUID();
    }

    public CompanyIntegration() {};

    public UUID getId() {
        return id;
    }

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
