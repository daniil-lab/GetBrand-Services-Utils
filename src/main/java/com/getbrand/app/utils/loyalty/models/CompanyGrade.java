package com.getbrand.app.utils.loyalty.models;

import com.getbrand.app.utils.company.models.Company;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class CompanyGrade {
    @Id
    private UUID id;

    private String name;

    private double layer;

    private double value;

    @OneToOne(fetch = FetchType.EAGER, targetEntity = CompanyLoyalty.class)
    @JoinColumn(name = "company_loyal_id")
    private CompanyLoyalty companyLoyality;

    public CompanyGrade() {};

    public CompanyGrade(String name, double layer, double value, CompanyLoyalty companyLoyality) {
        this.name = name;
        this.layer = layer;
        this.value = value;
        this.companyLoyality = companyLoyality;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLayer() {
        return layer;
    }

    public void setLayer(double layer) {
        this.layer = layer;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public CompanyLoyalty getCompanyLoyality() {
        return companyLoyality;
    }

    public void setCompanyLoyality(CompanyLoyalty companyLoyality) {
        this.companyLoyality = companyLoyality;
    }
}
