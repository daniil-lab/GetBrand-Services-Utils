package com.getbrand.app.utils.order.request;

public class UpdateCreatedOrderStateRequest {

    private String stateName;

    public UpdateCreatedOrderStateRequest() {};

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
