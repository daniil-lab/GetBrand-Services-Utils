package com.getbrand.app.utils.order.request;

public class RemoveLoyaltyTypeFromOrderRequest {
    private String loyalityType;

    public RemoveLoyaltyTypeFromOrderRequest() {};

    public RemoveLoyaltyTypeFromOrderRequest(String loyalityType) {
        this.loyalityType = loyalityType;
    }

    public String getLoyalityType() {
        return loyalityType;
    }

    public void setLoyalityType(String loyalityType) {
        this.loyalityType = loyalityType;
    }
}
