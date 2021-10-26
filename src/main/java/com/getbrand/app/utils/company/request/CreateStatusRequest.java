package com.getbrand.app.utils.company.request;

import java.util.List;

public class CreateStatusRequest {
    private String name;

    private String to;

    private List<String> from;

    private boolean auto;

    public CreateStatusRequest() {};

    public CreateStatusRequest(String name, String to, List<String> from, boolean auto) {
        this.name = name;
        this.to = to;
        this.from = from;
        this.auto = auto;
    }

    public boolean isAuto() {
        return auto;
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
