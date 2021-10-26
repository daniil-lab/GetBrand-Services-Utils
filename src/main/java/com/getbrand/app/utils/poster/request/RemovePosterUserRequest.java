package com.getbrand.app.utils.poster.request;

import java.util.UUID;

public class RemovePosterUserRequest {

    private UUID companyId;

    private int posterId;

    public RemovePosterUserRequest() {};

    public RemovePosterUserRequest(UUID companyId, int posterId) {
        this.companyId = companyId;
        this.posterId = posterId;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public int getPosterId() {
        return posterId;
    }

    public void setPosterId(int posterId) {
        this.posterId = posterId;
    }
}
