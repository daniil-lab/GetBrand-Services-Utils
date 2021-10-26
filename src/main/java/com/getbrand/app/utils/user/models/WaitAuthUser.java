package com.getbrand.app.utils.user.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class WaitAuthUser {
    @Id
    private UUID id;

    private UUID userId;

    private String code;

    public WaitAuthUser() {};

    public WaitAuthUser(UUID userId, String code) {
        this.id = UUID.randomUUID();
        this.userId = userId;
        this.code = code;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
