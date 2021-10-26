package com.getbrand.app.utils.role.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Permission {
    @Id
    private UUID id;

    private String resource;

    private String action;

    private String attributes;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Role role;

    public Permission() {};

    public Permission(String resource, String action, String attributes) {
        this.resource = resource;
        this.action = action;
        this.attributes = attributes;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
