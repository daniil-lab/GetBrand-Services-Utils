package com.getbrand.app.utils.poster.request;

import com.getbrand.app.utils.IntegrationComponent;

public class AddComponentToIntegrationRequest {

    private IntegrationComponent component;

    public AddComponentToIntegrationRequest() { };

    public AddComponentToIntegrationRequest(IntegrationComponent component) {
        this.component = component;
    }

    public IntegrationComponent getComponent() {
        return component;
    }
}
