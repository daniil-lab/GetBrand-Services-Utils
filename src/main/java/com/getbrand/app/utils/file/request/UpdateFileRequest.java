package com.getbrand.app.utils.file.request;

public class UpdateFileRequest {
    private String name;

    private String url;

    public UpdateFileRequest() {};

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
