package com.getbrand.app.utils.order.request;

public class AddLoyaltyTypeToOrderRequest {
    private String loyalityType;

    public AddLoyaltyTypeToOrderRequest() {};

    public AddLoyaltyTypeToOrderRequest(String loyalityType) {
        this.loyalityType = loyalityType;
    }

    public String getLoyalityType() {
        return loyalityType;
    }

    public void setLoyalityType(String loyalityType) {
        this.loyalityType = loyalityType;
    }
}
