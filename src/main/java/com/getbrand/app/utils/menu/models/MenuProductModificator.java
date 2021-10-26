package com.getbrand.app.utils.menu.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class MenuProductModificator {
    @Id
    private UUID id;

    private String name;

    @Column(name = "_group")
    private String group;

    private String description;

    private double price;

    public MenuProductModificator() {};

    public MenuProductModificator(String name,
                                  String group,
                                  String description,
                                  double price) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.group = group;
        this.description = description;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
