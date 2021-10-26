package com.getbrand.app.utils.user.request;

public class UpdateStatusForUserRequest {
    private String status;

    public UpdateStatusForUserRequest() {};

    public UpdateStatusForUserRequest(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
