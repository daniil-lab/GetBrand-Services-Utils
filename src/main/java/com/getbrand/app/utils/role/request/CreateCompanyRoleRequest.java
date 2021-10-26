package com.getbrand.app.utils.role.request;

import java.util.UUID;

public class CreateCompanyRoleRequest {

    private UUID roleId;

    private UUID companyId;

    public CreateCompanyRoleRequest() {};

    public CreateCompanyRoleRequest(UUID roleId, UUID companyId) {
        this.roleId = roleId;
        this.companyId = companyId;
    }

    public UUID getRoleId() {
        return roleId;
    }

    public void setRoleId(UUID roleId) {
        this.roleId = roleId;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }
}
