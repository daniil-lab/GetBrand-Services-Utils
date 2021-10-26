package com.getbrand.app.utils.company.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class CompanyAddress {
    @Id
    private UUID id;

    private String name;

    private String description;

    private double minOrderSumForDelivery;

    private String address;

    @ElementCollection
    private List<String> workModes;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    @JsonBackReference
    private Company company;

    public CompanyAddress() {};

    public CompanyAddress(String name, String description, double minOrderSumForDelivery, String address) {
        this.name = name;
        this.description = description;
        this.minOrderSumForDelivery = minOrderSumForDelivery;
        this.address = address;
        this.id = UUID.randomUUID();
        this.workModes = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public double getMinOrderSumForDelivery() {
        return minOrderSumForDelivery;
    }

    public void setMinOrderSumForDelivery(double minOrderSumForDelivery) {
        this.minOrderSumForDelivery = minOrderSumForDelivery;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getWorkModes() {
        return workModes;
    }

    public void setWorkModes(List<String> workModes) {
        this.workModes = workModes;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
