package com.getbrand.app.utils.messaging.entity;

import java.util.UUID;

public class ServiceEntityMessage<T> {
    private UUID id;

    private T entity;

    private ServiceEntityMessageAction action;

    public ServiceEntityMessage() {};

    public ServiceEntityMessage(T entity, ServiceEntityMessageAction action) {
        this.id = UUID.randomUUID();
        this.entity = entity;
        this.action = action;
    }

    public ServiceEntityMessageAction getAction() {
        return action;
    }

    public void setAction(ServiceEntityMessageAction action) {
        this.action = action;
    }

    public UUID getId() {
        return id;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
