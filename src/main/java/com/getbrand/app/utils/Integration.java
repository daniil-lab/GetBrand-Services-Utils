package com.getbrand.app.utils;

public interface Integration<T> {
    T getApiData();

    IntegrationType getIntegrationType();

    void setApiData(T data);

    void setIntegrationState(IntegrationState integrationState);

    IntegrationState getIntegrationState();
}
