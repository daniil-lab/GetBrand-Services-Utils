package com.getbrand.app.utils.role.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Role {
    @Id
    private UUID id;

    private String name;

    private String rolesForUser;

    private boolean addAutomaticly;

    public Role() {};

    public Role(String name, String rolesForUser, boolean addAutomaticly) {
        this.name = name;
        this.rolesForUser = rolesForUser;
        this.addAutomaticly = addAutomaticly;
        this.id = UUID.randomUUID();
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

    public String getRolesForUser() {
        return rolesForUser;
    }

    public void setRolesForUser(String rolesForUser) {
        this.rolesForUser = rolesForUser;
    }

    public boolean isAddAutomaticly() {
        return addAutomaticly;
    }

    public void setAddAutomaticly(boolean addAutomaticly) {
        this.addAutomaticly = addAutomaticly;
    }
}
