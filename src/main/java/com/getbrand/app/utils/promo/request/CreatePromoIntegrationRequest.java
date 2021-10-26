package com.getbrand.app.utils.promo.request;

import java.util.UUID;

public class CreatePromoIntegrationRequest {
    private UUID companyId;

    public CreatePromoIntegrationRequest() {};

    public CreatePromoIntegrationRequest(UUID companyId) {
        this.companyId = companyId;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }
}
