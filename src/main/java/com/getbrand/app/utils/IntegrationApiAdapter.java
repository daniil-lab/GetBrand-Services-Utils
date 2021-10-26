package com.getbrand.app.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.http.HttpClient;

public class IntegrationApiAdapter {
    protected String apiUrl;

    protected HttpClient httpClient;

    protected ObjectMapper objectMapper;

    public IntegrationApiAdapter(String apiUrl) {
        this.apiUrl = apiUrl;
        this.httpClient = HttpClient.newBuilder().build();
        this.objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
}
