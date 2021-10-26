package com.getbrand.app.utils.company.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class CompanyTarif {
    @Id
    private UUID id;

    private String name;

    private String systemName;

    private String description;

    private String picture;

    private double value;

    private double activationPrice;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "tariff_id")
    private List<CompanyTarifPrice> prices;

    public CompanyTarif() {};

    public CompanyTarif(String name, String systemName, String description, String picture, double value, double activationPrice) {
        this.name = name;
        this.systemName = systemName;
        this.description = description;
        this.picture = picture;
        this.value = value;
        this.activationPrice = activationPrice;
        this.id = UUID.randomUUID();
        this.prices = new ArrayList<>();
    }

    public void addPrice(CompanyTarifPrice price) {
        this.prices.add(price);
    }

    public void removePrice(CompanyTarifPrice price) {
        this.prices.remove(price);
    }

    public void removePrice(int idx) {
        this.prices.remove(idx);
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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getActivationPrice() {
        return activationPrice;
    }

    public void setActivationPrice(double activationPrice) {
        this.activationPrice = activationPrice;
    }
}
