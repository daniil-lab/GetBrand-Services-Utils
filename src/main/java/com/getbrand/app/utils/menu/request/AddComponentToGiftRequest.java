package com.getbrand.app.utils.menu.request;

import java.util.UUID;

public class AddComponentToGiftRequest {
    private UUID productId;

    private int count;

    public AddComponentToGiftRequest() {};

    public AddComponentToGiftRequest(UUID productId, int count) {
        this.productId = productId;
        this.count = count;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
