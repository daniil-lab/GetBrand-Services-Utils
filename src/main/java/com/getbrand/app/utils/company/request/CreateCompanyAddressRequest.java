package com.getbrand.app.utils.company.request;

import java.util.UUID;

public class CreateCompanyAddressRequest {

    private String name;

    private String description;

    private String address;

    private double minOrderSumForDelivery = -1;

    private UUID companyId;

    private int posterId = -1;

    public CreateCompanyAddressRequest() {};

    public CreateCompanyAddressRequest(String name, String description, String address, double minOrderSumForDelivery, UUID companyId) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.minOrderSumForDelivery = minOrderSumForDelivery;
        this.companyId = companyId;
    }

    public int getPosterId() {
        return posterId;
    }

    public void setPosterId(int posterId) {
        this.posterId = posterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMinOrderSumForDelivery() {
        return minOrderSumForDelivery;
    }

    public void setMinOrderSumForDelivery(double minOrderSumForDelivery) {
        this.minOrderSumForDelivery = minOrderSumForDelivery;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }
}
