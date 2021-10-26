package com.getbrand.app.utils.models.request;

import java.util.UUID;

public class AddFileRequest {
    private String name;

    private String url;

    public AddFileRequest() {}

    public AddFileRequest(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
