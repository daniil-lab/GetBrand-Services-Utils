package com.getbrand.app.utils.loyalty.request;

import java.util.UUID;

public class CreateUserLoyaltyRequest {
    private UUID user;

    private UUID companyLoyalty;

    private UUID grade;

    private double value = -1;

    public CreateUserLoyaltyRequest() {};

    public CreateUserLoyaltyRequest(UUID user, UUID companyLoyalty, UUID grade, double value) {
        this.user = user;
        this.companyLoyalty = companyLoyalty;
        this.grade = grade;
        this.value = value;
    }

    public UUID getUser() {
        return user;
    }

    public void setUser(UUID user) {
        this.user = user;
    }

    public UUID getCompanyLoyalty() {
        return companyLoyalty;
    }

    public void setCompanyLoyalty(UUID companyLoyalty) {
        this.companyLoyalty = companyLoyalty;
    }

    public UUID getGrade() {
        return grade;
    }

    public void setGrade(UUID grade) {
        this.grade = grade;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
