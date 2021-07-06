package com.getbrand.app.utils.menu.models;

import java.util.UUID;

public class MenuProductModificator {
    private UUID id;

    private String name;

    private String group;

    private String description;

    private float price;

    public MenuProductModificator() {};

    public MenuProductModificator(String name,
                                  String group,
                                  String description,
                                  float price) {
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

    public float getPrice() {
        return price;
    }
}
