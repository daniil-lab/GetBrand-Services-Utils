package com.getbrand.app.utils.order.request;

import java.util.UUID;

public class AddBonusToOrderRequest {

    private int value;

    private UUID userLoyalityId;

    public AddBonusToOrderRequest() {};

    public AddBonusToOrderRequest(int value, UUID userLoyalityId) {
        this.value = value;
        this.userLoyalityId = userLoyalityId;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public UUID getUserLoyalityId() {
        return userLoyalityId;
    }

    public void setUserLoyalityId(UUID userLoyalityId) {
        this.userLoyalityId = userLoyalityId;
    }
}
