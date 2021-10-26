package com.getbrand.app.utils.order.request;

public class AddPriceToOrderRequest {
    private String name;

    private double value;

    public AddPriceToOrderRequest() {};

    public AddPriceToOrderRequest(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
