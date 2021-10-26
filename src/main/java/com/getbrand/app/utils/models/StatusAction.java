package com.getbrand.app.utils.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class StatusAction {
    @Id
    private UUID id;

    private String name;

    private String processName;

    private String params;

    public StatusAction() {};

    public StatusAction(String name, String processName, String params) {
        this.name = name;
        this.processName = processName;
        this.params = params;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
