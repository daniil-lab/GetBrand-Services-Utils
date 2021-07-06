package com.getbrand.app.utils.poster;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.getbrand.app.utils.ServiceRestResponse;
import com.getbrand.app.utils.poster.models.PosterIntegration;
import com.getbrand.app.utils.poster.request.CreateIntegrationRequest;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuples;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.UUID;

public class PosterServiceAdapter {
    private HttpClient httpClient;

    private ObjectMapper objectMapper;

    public PosterServiceAdapter() {
        this.httpClient = HttpClient.newBuilder().build();
        this.objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);;
    }

    public Tuple2<Integer, ServiceRestResponse<PosterIntegration>> createPosterIntegration(URI uri, CreateIntegrationRequest request) throws IOException, InterruptedException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                    .uri(uri)
                    .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                    .header("Content-Type", "application/json")
                    .build();

        HttpResponse<String> createResponse = httpClient.send(createRequest, HttpResponse.BodyHandlers.ofString());


        return Tuples.of(createResponse.statusCode(), objectMapper.readValue(createResponse.body(), new TypeReference<>() {}));
    }

    public int removePosterIntegration(URI uri, UUID integrationId) throws IOException, InterruptedException {
        HttpRequest removeRequest = HttpRequest.newBuilder()
                .uri(URI.create(uri.toString() + "/%s".formatted(integrationId)))
                .DELETE()
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> removeResponse = httpClient.send(removeRequest, HttpResponse.BodyHandlers.ofString());

        return removeResponse.statusCode();
    }
}
