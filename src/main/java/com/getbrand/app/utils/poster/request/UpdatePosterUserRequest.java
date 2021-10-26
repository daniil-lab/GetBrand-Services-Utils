package com.getbrand.app.utils.poster.request;

import java.util.UUID;

public class UpdatePosterUserRequest {
    private int posterId;

    private String name;

    private String email;

    private String phone;

    private String birthday;

    private UUID companyId;

    public UpdatePosterUserRequest() {};

    public UpdatePosterUserRequest(int posterId, String name, String email, String phone, String birthday, UUID companyId) {
        this.posterId = posterId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.companyId = companyId;
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
