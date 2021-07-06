package com.getbrand.app.utils.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PreUpdate;
import java.time.Instant;
import java.util.UUID;

@Entity
public class File {
    @Id
    private UUID id = UUID.randomUUID();

    private String name;

    private String url;

    private String createdAt;

    private String updatedAt;

    @PreUpdate
    private void updateDate() {
        this.updatedAt = Instant.now().toString();
    }

    public File() {};

    public File(String name, String url) {
        this.url = url;
        this.name = name;
        this.updatedAt = Instant.now().toString();
        this.createdAt = Instant.now().toString();
    }

    public File(String url) {
        this.url = url;
        this.updatedAt = Instant.now().toString();
        this.createdAt = Instant.now().toString();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
