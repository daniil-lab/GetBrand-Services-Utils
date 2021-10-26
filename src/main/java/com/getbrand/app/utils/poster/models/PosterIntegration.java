package com.getbrand.app.utils.poster.models;

import com.getbrand.app.utils.Integration;
import com.getbrand.app.utils.IntegrationState;
import com.getbrand.app.utils.IntegrationType;
import com.getbrand.app.utils.company.models.CompanyStatus;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class PosterIntegration implements Integration<PosterIntegrationApiData> {
    @Id
    private UUID id;

    @OneToOne(fetch = FetchType.EAGER, targetEntity = PosterIntegrationApiData.class)
    private PosterIntegrationApiData apiData;

    private final IntegrationType integrationType = IntegrationType.POSTER;

    private UUID companyId;

    private IntegrationState integrationState;

    public PosterIntegration() {
    }

    public PosterIntegration(UUID companyId, PosterIntegrationApiData apiData) {
        this.id = UUID.randomUUID();
        this.companyId = companyId;
        this.apiData = apiData;
        this.integrationState = IntegrationState.PENDING;
    }

    @Override
    public PosterIntegrationApiData getApiData() {
        return apiData;
    }

    @Override
    public IntegrationType getIntegrationType() {
        return integrationType;
    }

    @Override
    public void setApiData(PosterIntegrationApiData apiData) {
        this.apiData = apiData;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public UUID getId() {
        return id;
    }

    public IntegrationState getIntegrationState() {
        return integrationState;
    }

    public void setIntegrationState(IntegrationState integrationState) {
        this.integrationState = integrationState;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }
}
