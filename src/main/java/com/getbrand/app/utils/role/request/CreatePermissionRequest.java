package com.getbrand.app.utils.role.request;

import java.util.UUID;

public class CreatePermissionRequest {
    private UUID roleId;

    private String resource;

    private String action;

    private String attributes;

    public CreatePermissionRequest() {};

    public CreatePermissionRequest(UUID roleId, String resource, String action, String attributes) {
        this.roleId = roleId;
        this.resource = resource;
        this.action = action;
        this.attributes = attributes;
    }

    public UUID getRoleId() {
        return roleId;
    }

    public void setRoleId(UUID roleId) {
        this.roleId = roleId;
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
}
