package com.getbrand.app.utils.poster.request;

import java.util.UUID;

public class RemovePosterMenuProductRequest {
    private int productId;

    private UUID companyId;

    public RemovePosterMenuProductRequest() {};

    public RemovePosterMenuProductRequest(int productId, UUID companyId) {
        this.productId = productId;
        this.companyId = companyId;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
