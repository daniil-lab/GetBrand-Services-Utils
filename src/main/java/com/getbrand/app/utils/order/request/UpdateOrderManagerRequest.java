package com.getbrand.app.utils.order.request;

import java.util.UUID;

public class UpdateOrderManagerRequest {

    private UUID userId;

    public UpdateOrderManagerRequest() {};

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
