package com.getbrand.app.utils.poster.request;

import java.util.UUID;

public class CreatePosterUserGroupRequest {
    private UUID companyId;

    private String groupName;

    public CreatePosterUserGroupRequest() {};

    public CreatePosterUserGroupRequest(UUID companyId, String groupName) {
        this.companyId = companyId;
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }
}
