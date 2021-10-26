package com.getbrand.app.utils.order.models;

import com.getbrand.app.utils.company.models.Company;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Equipment {
    @Id
    private UUID id;

    private String name;

    private String description;

    private int volume;

    private String inventoryCode;

    private int minReserv;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "company")
    private Company company;

    public Equipment() {};

    public Equipment(String name, String description, int volume, String inventoryCode, int minReserv, Company company) {
        this.name = name;
        this.description = description;
        this.volume = volume;
        this.inventoryCode = inventoryCode;
        this.minReserv = minReserv;
        this.company = company;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getInventoryCode() {
        return inventoryCode;
    }

    public void setInventoryCode(String inventoryCode) {
        this.inventoryCode = inventoryCode;
    }

    public int getMinReserv() {
        return minReserv;
    }

    public void setMinReserv(int minReserv) {
        this.minReserv = minReserv;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
