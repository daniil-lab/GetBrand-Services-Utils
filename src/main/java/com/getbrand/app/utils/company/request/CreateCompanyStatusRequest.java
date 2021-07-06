package com.getbrand.app.utils.company.request;

import java.util.List;

public class CreateCompanyStatusRequest {
    private String name;

    private String to;

    private List<String> from;

    public CreateCompanyStatusRequest() {};

    public CreateCompanyStatusRequest(String name, String to, List<String> from) {
        this.name = name;
        this.to = to;
        this.from = from;
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
