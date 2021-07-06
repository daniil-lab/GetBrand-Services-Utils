package com.getbrand.app.utils.models;

import java.util.UUID;

public class ServiceEvent<T> {
    private UUID id;

    private String from;

    private String to;

    private T data;

    public ServiceEvent(String from, String to, T data) {
        this.id = UUID.randomUUID();
        this.from = from;
        this.to = to;
        this.data = data;
    }
}
