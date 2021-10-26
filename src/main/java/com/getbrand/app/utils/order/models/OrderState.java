package com.getbrand.app.utils.order.models;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

@Entity
public class OrderState {
    @Id
    private UUID id;

    private String name;

    @Column(name = "_from")
    @ElementCollection
    private List<String> from;

    @Column(name = "_to")
    private String to;

    private boolean isChangeAllow;

    private boolean isDeleteAllow;

    private boolean auto;

    public OrderState() {};

    public OrderState(String name, List<String> from, String to, boolean isChangeAllow, boolean isDeleteAllow) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.isChangeAllow = isChangeAllow;
        this.isDeleteAllow = isDeleteAllow;
        this.id = UUID.randomUUID();
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
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

    public List<String> getFrom() {
        return from;
    }

    public void setFrom(List<String> from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public boolean isChangeAllow() {
        return isChangeAllow;
    }

    public void setChangeAllow(boolean changeAllow) {
        isChangeAllow = changeAllow;
    }

    public boolean isDeleteAllow() {
        return isDeleteAllow;
    }

    public void setDeleteAllow(boolean deleteAllow) {
        isDeleteAllow = deleteAllow;
    }
}
