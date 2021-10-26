package com.getbrand.app.utils.user.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class UserDeviceToken {
    @Id
    private UUID id;

    private UUID userId;

    private String registrationToken;

    public UserDeviceToken() {};

    public UserDeviceToken(UUID userId, String registrationToken) {
        this.userId = userId;
        this.registrationToken = registrationToken;
        this.id = UUID.randomUUID();
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getId() {
        return id;
    }

    public String getRegistrationToken() {
        return registrationToken;
    }

    public void setRegistrationToken(String registrationToken) {
        this.registrationToken = registrationToken;
    }
}
