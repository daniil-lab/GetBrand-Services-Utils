package com.getbrand.app.utils.company.models;

import com.getbrand.app.utils.models.Status;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class CompanyStatus {
    @Id
    private UUID id;

    private String changeAt;

    @OneToOne(fetch = FetchType.EAGER, targetEntity = Status.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id")
    private Status status;

    public CompanyStatus(Status status) {
        this.id = UUID.randomUUID();
        this.changeAt = LocalDateTime.now().toString();
        this.status = status;
    }

    public CompanyStatus() {};

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
