package com.getbrand.app.utils.messaging.entity;

public interface ServiceEntityMessageAdapter<T> {
    void send(T data);
}
