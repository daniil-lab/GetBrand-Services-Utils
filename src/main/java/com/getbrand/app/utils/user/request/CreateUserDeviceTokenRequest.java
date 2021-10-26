package com.getbrand.app.utils.user.request;

public class CreateUserDeviceTokenRequest {
    private String registrationToken;

    public CreateUserDeviceTokenRequest() {};

    public CreateUserDeviceTokenRequest(String registrationToken) {
        this.registrationToken = registrationToken;
    }

    public String getRegistrationToken() {
        return registrationToken;
    }

    public void setRegistrationToken(String registrationToken) {
        this.registrationToken = registrationToken;
    }
}
