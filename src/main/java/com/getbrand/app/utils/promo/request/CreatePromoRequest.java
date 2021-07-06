package com.getbrand.app.utils.promo.request;

import java.util.UUID;

public class CreatePromoRequest {
    private String name;

    private String description;

    private String timeSpending;

    private UUID integrationId;

    private float summ;

    private float percent;

    public CreatePromoRequest() {};

    public CreatePromoRequest(String name, String description, String timeSpending, UUID integrationId, float summ, float percent) {
        this.name = name;
        this.description = description;
        this.timeSpending = timeSpending;
        this.integrationId = integrationId;
        this.summ = summ;
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimeSpending() {
        return timeSpending;
    }

    public void setTimeSpending(String timeSpending) {
        this.timeSpending = timeSpending;
    }

    public UUID getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(UUID integrationId) {
        this.integrationId = integrationId;
    }

    public float getSumm() {
        return summ;
    }

    public void setSumm(float summ) {
        this.summ = summ;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }
}
