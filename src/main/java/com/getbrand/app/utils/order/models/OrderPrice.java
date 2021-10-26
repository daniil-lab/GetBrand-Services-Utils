package com.getbrand.app.utils.order.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class OrderPrice {
    @Id
    private UUID id;

    private String name;

    private double value;

    public OrderPrice() {};

    public OrderPrice(String name, double value) {
        this.name = name;
        this.value = value;
        this.id = UUID.randomUUID();
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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
