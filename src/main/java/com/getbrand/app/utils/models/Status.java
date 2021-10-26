package com.getbrand.app.utils.models;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Status {
    @Id
    private UUID id;

    private String name;

    @ElementCollection(targetClass=String.class)
    @Column(name = "_from")
    private List<String> from;

    @Column(name = "_to")
    private String to;

    private boolean auto;

    public Status() {};

    public Status(String name, List<String> from, String to, boolean auto) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.from = from;
        this.to = to;
        this.auto = auto;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFrom(List<String> from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
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

    public List<String> getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
