package com.getbrand.app.utils.loyalty.request;

public class CreateLoyaltyRequest {
    private String name;

    public CreateLoyaltyRequest() {};

    public CreateLoyaltyRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
