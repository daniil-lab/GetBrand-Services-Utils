package com.getbrand.app.utils.promo.request;

import java.util.UUID;

public class CreatePromoIntegrationRequest {
    private UUID integrationId;

    public CreatePromoIntegrationRequest() {};

    public CreatePromoIntegrationRequest(UUID integrationId) {
        this.integrationId = integrationId;
    }

    public UUID getIntegrationId() {
        return integrationId;
    }
}
