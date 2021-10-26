package com.getbrand.app.utils.menu.request;

import java.util.UUID;

public class CreateGiftRequest {

    private UUID productId;

    private UUID userId;

    private UUID companyId;

    private int count;

    public CreateGiftRequest() {};

    public CreateGiftRequest(UUID productId, UUID userId, UUID companyId, int count) {
        this.productId = productId;
        this.userId = userId;
        this.companyId = companyId;
        this.count = count;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }
}
