package com.getbrand.app.utils.poster.models;

import com.getbrand.app.utils.IntegrationState;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class PosterIntegration {
    @Id
    private UUID id;

    private String apiKey;

    private String companyId;

    private IntegrationState integrationState;

    public PosterIntegration() {
    }

    public PosterIntegration(String apiKey, String companyId) {
        this.id = UUID.randomUUID();
        this.apiKey = apiKey;
        this.companyId = companyId;
        this.integrationState = IntegrationState.PENDING;
    }

    public String getCompanyId() {
        return companyId;
    }

    public UUID getId() {
        return id;
    }

    public String getApiKey() {
        return apiKey;
    }

    public IntegrationState getIntegrationState() {
        return integrationState;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setIntegrationState(IntegrationState integrationState) {
        this.integrationState = integrationState;
    }

}
