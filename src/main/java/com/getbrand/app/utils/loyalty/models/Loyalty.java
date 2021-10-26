package com.getbrand.app.utils.loyalty.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Loyalty {
    @Id
    private UUID id;

    private String name;

    public Loyalty() {};

    public Loyalty(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
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
}
