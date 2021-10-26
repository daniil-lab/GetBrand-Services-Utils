package com.getbrand.app.utils.company.request;

public class CreateCompanyTarifRequest {
    private String name;

    private String systemName;

    private String description;

    private String picture;

    private double activationPrice = -1;

    private double value = -1;

    public CreateCompanyTarifRequest() {};

    public CreateCompanyTarifRequest(String name, String systemName, String description, String picture, double activationPrice, double value) {
        this.name = name;
        this.systemName = systemName;
        this.description = description;
        this.picture = picture;
        this.activationPrice = activationPrice;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public double getActivationPrice() {
        return activationPrice;
    }

    public void setActivationPrice(double activationPrice) {
        this.activationPrice = activationPrice;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
