package com.getbrand.app.utils.company.models;

import javax.persistence.Entity;

@Entity
public class PosterCompanyAddress extends CompanyAddress {
    private int posterId;

    public PosterCompanyAddress() {
    }

    public PosterCompanyAddress(String name, String description, double minOrderSumForDelivery, String address) {
        super(name, description, minOrderSumForDelivery, address);
    }

    public int getPosterId() {
        return posterId;
    }

    public void setPosterId(int posterId) {
        this.posterId = posterId;
    }
}
