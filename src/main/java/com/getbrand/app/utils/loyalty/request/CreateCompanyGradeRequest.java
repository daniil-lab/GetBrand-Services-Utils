package com.getbrand.app.utils.loyalty.request;

import java.util.UUID;

public class CreateCompanyGradeRequest {
    private String name;

    private double layer = -1;

    private double value = -1;

    private UUID companyLoyalityId;

    public CreateCompanyGradeRequest() {};

    public CreateCompanyGradeRequest(String name, double layer, double value, UUID companyLoyalityId) {
        this.name = name;
        this.layer = layer;
        this.value = value;
        this.companyLoyalityId = companyLoyalityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLayer() {
        return layer;
    }

    public void setLayer(double layer) {
        this.layer = layer;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public UUID getCompanyLoyalityId() {
        return companyLoyalityId;
    }

    public void setCompanyLoyalityId(UUID companyLoyalityId) {
        this.companyLoyalityId = companyLoyalityId;
    }
}
