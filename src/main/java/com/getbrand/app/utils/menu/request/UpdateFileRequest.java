package com.getbrand.app.utils.menu.request;

public class UpdateFileRequest {
    private String name;

    private String url;

    public UpdateFileRequest () {};

    public UpdateFileRequest(String name, String url) {
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
