package com.getbrand.app.utils.transactions.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Transaction {
    @Id
    private UUID id;

    private double value;

    private String type;

    private String paymentType;

    private String createdAt;

    public Transaction() {};

    public Transaction(double value, String paymentType, UUID orderId) {
        this.value = value;
        this.paymentType = paymentType;
        this.id = UUID.randomUUID();
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
