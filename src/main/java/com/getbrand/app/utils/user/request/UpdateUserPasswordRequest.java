package com.getbrand.app.utils.user.request;

public class UpdateUserPasswordRequest {
    private String password;

    public UpdateUserPasswordRequest(String password) {
        this.password = password;
    }

    public UpdateUserPasswordRequest() {};

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
