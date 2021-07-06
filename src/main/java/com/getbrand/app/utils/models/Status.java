package com.getbrand.app.utils.models;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

@Entity
public class Status {
    @Id
    private UUID id;

    private String name;

    @ElementCollection
    private List<String> from;

    private String to;

    public Status() {};

    public Status(String name, List<String> from, String to) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.from = from;
        this.to = to;
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
