package com.getbrand.app.utils;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum IntegrationType {
    POSTER("POSTER"),
    GETBRAND("GETBRAND");

    private String integrationName;

    IntegrationType(String integrationName) {
        this.integrationName = integrationName;
    }

    public String getIntegrationName() {
        return this.integrationName;
    }

    @JsonCreator
    public static IntegrationType getIntegrationFromName(String value) {
        for(IntegrationType type : IntegrationType.values()) {
            if(type.getIntegrationName().equals(value)) {
                return type;
            }
        }

        return null;
    }
}
