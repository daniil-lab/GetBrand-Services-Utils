package com.getbrand.app.utils.loyalty.request;

import java.util.UUID;

public class CreateCompanyLoyaltyRequest {
    private String name;

    private UUID loyalityId;

    private UUID companyId;

    private String description;

    public CreateCompanyLoyaltyRequest() {};

    public CreateCompanyLoyaltyRequest(String name, UUID loyalityId, UUID companyId, String description) {
        this.name = name;
        this.loyalityId = loyalityId;
        this.companyId = companyId;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getLoyalityId() {
        return loyalityId;
    }

    public void setLoyalityId(UUID loyalityId) {
        this.loyalityId = loyalityId;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
