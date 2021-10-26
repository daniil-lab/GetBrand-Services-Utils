package com.getbrand.app.utils.user.models;

import com.getbrand.app.utils.models.Status;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class UserStatus {
    @Id
    private UUID id;

    private String changeAt;

    @OneToOne(fetch = FetchType.EAGER, targetEntity = Status.class, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Status status;

    public UserStatus() {};

    public UserStatus(Status status) {
        this.id = UUID.randomUUID();
        this.changeAt = LocalDateTime.now().toString();
        this.status = status;
    }

    public void setChangeAt(String changeAt) {
        this.changeAt = changeAt;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public String getChangeAt() {
        return changeAt;
    }

    public Status getStatus() {
        return status;
    }
}
