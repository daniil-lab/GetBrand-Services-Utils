package com.getbrand.app.utils.order.request;

import java.util.UUID;

public class UpdateOrderUserRequest {
    private UUID userId;

    public UpdateOrderUserRequest() {};

    public UpdateOrderUserRequest(UUID userId) {
        this.userId = userId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
