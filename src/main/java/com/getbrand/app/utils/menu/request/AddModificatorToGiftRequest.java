package com.getbrand.app.utils.menu.request;

import java.util.UUID;

public class AddModificatorToGiftRequest {

    private UUID productModificatorId;

    public AddModificatorToGiftRequest() {};

    public AddModificatorToGiftRequest(UUID productModificatorId) {
        this.productModificatorId = productModificatorId;
    }

    public UUID getProductModificatorId() {
        return productModificatorId;
    }

    public void setProductModificatorId(UUID productModificatorId) {
        this.productModificatorId = productModificatorId;
    }
}
