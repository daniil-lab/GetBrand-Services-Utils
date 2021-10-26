package com.getbrand.app.utils.menu.request;

import java.util.UUID;

public class CreateMenuRequest {
    private UUID companyId;

    public CreateMenuRequest() {};

    public CreateMenuRequest(UUID companyId) {
        this.companyId = companyId;
    }

    public UUID getCompanyId() {
        return companyId;
    }
}
