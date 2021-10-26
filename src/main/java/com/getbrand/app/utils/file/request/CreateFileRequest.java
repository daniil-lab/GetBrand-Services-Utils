package com.getbrand.app.utils.file.request;

public class CreateFileRequest {
    private String name;

    private String url;

    public CreateFileRequest() {};

    public CreateFileRequest(String name, String url) {
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
