package com.getbrand.app.utils.file.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PreUpdate;
import java.time.Instant;
import java.time.LocalDateTime;
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
        this.updatedAt = LocalDateTime.now().toString();
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

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
