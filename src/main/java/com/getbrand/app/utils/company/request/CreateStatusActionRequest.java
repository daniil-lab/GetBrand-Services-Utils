package com.getbrand.app.utils.company.request;

public class CreateStatusActionRequest {
    private String name;

    private String processName;

    private String params;

    public CreateStatusActionRequest() {};

    public CreateStatusActionRequest(String name, String processName, String params) {
        this.name = name;
        this.processName = processName;
        this.params = params;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }
}
