package com.getbrand.app.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.http.HttpClient;

public abstract class ServiceRestActionAdapter {
    protected HttpClient httpClient;

    protected ServiceAdapter serviceAdapter;

    protected ObjectMapper objectMapper;

    public ServiceRestActionAdapter(ServiceAdapter serviceAdapter) {
        this.serviceAdapter = serviceAdapter;
        this.httpClient = HttpClient.newBuilder().build();
        this.objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);;
    }
}
