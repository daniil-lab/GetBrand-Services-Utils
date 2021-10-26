package com.getbrand.app.utils.role.request;

public class CreateRoleRequest {

    private String name;

    private String rolesForUser;

    private boolean addAutomaticly;

    public CreateRoleRequest() {};

    public CreateRoleRequest(String name, String rolesForUser, boolean addAutomaticly) {
        this.name = name;
        this.rolesForUser = rolesForUser;
        this.addAutomaticly = addAutomaticly;
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
