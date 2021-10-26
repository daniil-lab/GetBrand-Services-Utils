package com.getbrand.app.utils.user.request;

import java.util.UUID;

public class GetCodeRequest {
    private String phone;

    private UUID companyId;

    public GetCodeRequest() {};

    public GetCodeRequest(String phone, UUID companyId) {
        this.phone = phone;
        this.companyId = companyId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }
}
