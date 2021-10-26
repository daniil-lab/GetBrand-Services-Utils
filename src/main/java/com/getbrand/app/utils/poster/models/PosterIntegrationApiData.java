package com.getbrand.app.utils.poster.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class PosterIntegrationApiData {
    @Id
    private UUID id;

    private String apiKey;

    public PosterIntegrationApiData() {}

    public PosterIntegrationApiData(String apiKey) {
        this.apiKey = apiKey;
        this.id = UUID.randomUUID();
    }

    public String getApiKey() {
        return apiKey;
    }

    public UUID getId() {
        return id;
    }
}
