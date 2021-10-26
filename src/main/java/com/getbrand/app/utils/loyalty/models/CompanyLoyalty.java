package com.getbrand.app.utils.loyalty.models;

import com.getbrand.app.utils.company.models.Company;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class CompanyLoyalty {
    @Id
    private UUID id;

    private String name;

    private String description;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "loyal_id")
    private Loyalty loyality;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "loyalty_id")
    private Company company;

    public CompanyLoyalty() {};

    public CompanyLoyalty(String name, String description, Loyalty loyality, Company company) {
        this.name = name;
        this.description = description;
        this.loyality = loyality;
        this.id = UUID.randomUUID();
        this.company = company;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Loyalty getLoyality() {
        return loyality;
    }

    public void setLoyality(Loyalty loyality) {
        this.loyality = loyality;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
