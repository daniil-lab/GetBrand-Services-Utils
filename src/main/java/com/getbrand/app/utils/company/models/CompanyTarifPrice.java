package com.getbrand.app.utils.company.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class CompanyTarifPrice {
    @Id
    private UUID id;

    private String name;

    private int value;

    private int layer;

    public CompanyTarifPrice () {};

    public CompanyTarifPrice(String name, int value, int layer) {
        this.name = name;
        this.value = value;
        this.layer = layer;
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }
}
