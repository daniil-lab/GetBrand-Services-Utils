package com.getbrand.app.utils.user.request;

import java.util.List;

public class UpdateUserStatusRequest {
    private String name;

    private List<String> from;

    private String to;

    public UpdateUserStatusRequest() {};

    public UpdateUserStatusRequest(String name, List<String> from, String to) {
        this.name = name;
        this.from = from;
        this.to = to;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFrom() {
        return from;
    }

    public void setFrom(List<String> from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
