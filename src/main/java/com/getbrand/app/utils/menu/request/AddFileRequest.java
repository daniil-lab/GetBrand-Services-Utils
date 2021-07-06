package com.getbrand.app.utils.menu.request;

public class AddFileRequest {
    private String name;
    private String url;

    public AddFileRequest(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public AddFileRequest(String url) {
        this.url = url;
    }

    public AddFileRequest() {}

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }
}
