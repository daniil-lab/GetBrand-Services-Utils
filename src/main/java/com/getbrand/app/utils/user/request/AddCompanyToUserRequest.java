package com.getbrand.app.utils.user.request;

import java.util.UUID;

public class AddCompanyToUserRequest {
    private UUID companyId;

    private String operation;

    public AddCompanyToUserRequest() {};

    public AddCompanyToUserRequest(UUID companyId, String operation) {
        this.companyId = companyId;
        this.operation = operation;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
