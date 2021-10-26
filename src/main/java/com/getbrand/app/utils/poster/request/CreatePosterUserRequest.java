package com.getbrand.app.utils.poster.request;

import java.util.UUID;

public class CreatePosterUserRequest {
    private UUID companyId;

    private String name;

    private String email;

    private String phone;

    private String birthday;

    public CreatePosterUserRequest() {};

    public CreatePosterUserRequest(UUID companyId, String name, String email, String phone, String birthday) {
        this.companyId = companyId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
