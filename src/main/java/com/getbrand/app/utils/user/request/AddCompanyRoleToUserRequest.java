package com.getbrand.app.utils.user.request;

import java.util.UUID;

public class AddCompanyRoleToUserRequest {
    private UUID companyRoleId;

    private String operation;

    public AddCompanyRoleToUserRequest(UUID companyRoleId, String operation) {
        this.companyRoleId = companyRoleId;
        this.operation = operation;
    }

    public AddCompanyRoleToUserRequest() {};

    public UUID getCompanyRoleId() {
        return companyRoleId;
    }

    public void setCompanyRoleId(UUID companyRoleId) {
        this.companyRoleId = companyRoleId;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
