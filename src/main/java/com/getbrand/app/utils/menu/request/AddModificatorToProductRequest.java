package com.getbrand.app.utils.menu.request;

public class AddModificatorToProductRequest {
    private String name;

    private String group;

    private String description;

    private double price;

    public AddModificatorToProductRequest() {};

    public AddModificatorToProductRequest(String name, String group, String description, double price) {
        this.name = name;
        this.group = group;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
