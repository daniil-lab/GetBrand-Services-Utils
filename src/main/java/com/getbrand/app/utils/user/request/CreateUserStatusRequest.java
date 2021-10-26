package com.getbrand.app.utils.user.request;

import java.util.List;

public class CreateUserStatusRequest {
    private String name;

    private String to;

    private List<String> from;

    private boolean auto;

    public CreateUserStatusRequest() {};

    public CreateUserStatusRequest(String name, String to, List<String> from, boolean auto) {
        this.name = name;
        this.to = to;
        this.from = from;
        this.auto = auto;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(List<String> from) {
        this.from = from;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public String getName() {
        return name;
    }

    public String getTo() {
        return to;
    }

    public List<String> getFrom() {
        return from;
    }
}
