package com.getbrand.app.utils.order.request;

import java.util.UUID;

public class AddGiftToOrderRequest {
    private UUID giftId;

    private int count;

    public AddGiftToOrderRequest() {};

    public UUID getGiftId() {
        return giftId;
    }

    public void setGiftId(UUID giftId) {
        this.giftId = giftId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
