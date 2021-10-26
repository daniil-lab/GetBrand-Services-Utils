package com.getbrand.app.utils.messaging.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class ServiceCheckMessage {
    @Id
    private UUID id;

    private String createdAt;

    private String proceedAt;

    private boolean proceed;

    private boolean fail;

    public ServiceCheckMessage() {};

    public ServiceCheckMessage(UUID id) {
        this.id = id;
        this.createdAt = LocalDateTime.now().toString();
    }

    public UUID getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getProceedAt() {
        return proceedAt;
    }

    public void setProceedAt(String proceedAt) {
        this.proceedAt = proceedAt;
    }

    public boolean isProceed() {
        return proceed;
    }

    public void setProceed(boolean proceed) {
        this.proceed = proceed;
    }

    public boolean isFail() {
        return fail;
    }

    public void setFail(boolean fail) {
        this.fail = fail;
    }
}
