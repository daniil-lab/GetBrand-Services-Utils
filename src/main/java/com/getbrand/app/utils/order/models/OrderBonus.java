package com.getbrand.app.utils.order.models;

import com.getbrand.app.utils.loyalty.models.UserLoyalty;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class OrderBonus {
    @Id
    private UUID id;

    private int value;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "loyal_id")
    private UserLoyalty userLoyaltys;

    public OrderBonus(int value, UserLoyalty userLoyaltys) {
        this.value = value;
        this.userLoyaltys = userLoyaltys;
        this.id = UUID.randomUUID();
    }

    public OrderBonus() {};

    public UUID getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public UserLoyalty getUserLoyaltys() {
        return userLoyaltys;
    }

    public void setUserLoyaltys(UserLoyalty userLoyaltys) {
        this.userLoyaltys = userLoyaltys;
    }
}
