package com.getbrand.app.utils.models.request;

import java.util.UUID;

public class RemoveFileRequest {
    private UUID id;

    public RemoveFileRequest() {};

    public RemoveFileRequest(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
