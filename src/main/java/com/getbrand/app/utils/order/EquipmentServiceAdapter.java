package com.getbrand.app.utils.order;

import com.fasterxml.jackson.core.type.TypeReference;
import com.getbrand.app.utils.ServiceAdapter;
import com.getbrand.app.utils.ServiceError;
import com.getbrand.app.utils.ServiceRestActionAdapter;
import com.getbrand.app.utils.ServiceRestResponse;
import com.getbrand.app.utils.exception.InternalErrorException;
import com.getbrand.app.utils.order.models.Equipment;
import com.getbrand.app.utils.order.request.CreateEquipmentRequest;
import com.getbrand.app.utils.role.models.Role;
import com.getbrand.app.utils.role.request.CreateRoleRequest;
import org.springframework.http.HttpStatus;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuples;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.UUID;

public class EquipmentServiceAdapter extends ServiceRestActionAdapter {
    public EquipmentServiceAdapter(ServiceAdapter serviceAdapter) {
        super(serviceAdapter);
    }

    public Tuple2<Integer, ServiceRestResponse<Equipment>> createEquipment(CreateEquipmentRequest request) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/equipment/"))
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> createResponse = httpClient.send(createRequest, HttpResponse.BodyHandlers.ofString());

        if(createResponse.statusCode() != HttpStatus.CREATED.value()) {
            ServiceError error = objectMapper.readValue(createResponse.body(), new TypeReference<ServiceError>() {});

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(createResponse.statusCode(), objectMapper.readValue(createResponse.body(), new TypeReference<>() {}));
    }

    public Tuple2<Integer, ServiceRestResponse<Boolean>> deleteEquipment(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest deleteRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/equipment/%s".formatted(id)))
                .DELETE()
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> deleteResponse = httpClient.send(deleteRequest, HttpResponse.BodyHandlers.ofString());

        if(deleteResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(deleteResponse.body(), new TypeReference<ServiceError>() {});

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(deleteResponse.statusCode(), objectMapper.readValue(deleteResponse.body(), new TypeReference<>() {}));
    }

    public Tuple2<Integer, ServiceRestResponse<Equipment>> updateEquipment(CreateEquipmentRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/equipment/%s".formatted(id)))
                .method("PATCH", HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> updateResponse = httpClient.send(updateRequest, HttpResponse.BodyHandlers.ofString());

        if(updateResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(updateResponse.body(), new TypeReference<ServiceError>() {});

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(updateResponse.statusCode(), objectMapper.readValue(updateResponse.body(), new TypeReference<>() {}));
    }

    public Tuple2<Integer, ServiceRestResponse<Equipment>> getEquipmentById(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/equipment/%s".formatted(id)))
                .GET()
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        if(getResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(getResponse.body(), new TypeReference<ServiceError>() {});

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(getResponse.statusCode(), objectMapper.readValue(getResponse.body(), new TypeReference<>() {}));
    }

    public Tuple2<Integer, ServiceRestResponse<List<Equipment>>> getEquipment() throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/equipment/"))
                .GET()
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        if (getResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(getResponse.body(), new TypeReference<ServiceError>() {
            });

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(getResponse.statusCode(), objectMapper.readValue(getResponse.body(), new TypeReference<>() {}));
    }
}
