package com.getbrand.app.utils.poster;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.getbrand.app.utils.ServiceAdapter;
import com.getbrand.app.utils.ServiceError;
import com.getbrand.app.utils.ServiceRestActionAdapter;
import com.getbrand.app.utils.ServiceRestResponse;
import com.getbrand.app.utils.exception.InternalErrorException;
import com.getbrand.app.utils.poster.models.PosterIntegration;
import com.getbrand.app.utils.poster.request.*;
import com.getbrand.app.utils.poster.server.poster.request.menu.CreatePosterMenuCategoryRequest;
import com.getbrand.app.utils.poster.server.poster.response.order.PosterOrderEquipmentWrapperResponse;
import org.springframework.http.HttpStatus;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuples;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.UUID;

public class PosterServiceAdapter extends ServiceRestActionAdapter {
    public PosterServiceAdapter(ServiceAdapter adapter) {
        super(adapter);
    }

    public Tuple2<Integer, ServiceRestResponse<Boolean>> syncPosterEquipment() throws IOException, InterruptedException {
        HttpRequest syncRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getPosterService().getUri().toString() + "/api/v1/order/equipment/sync"))
                .POST(HttpRequest.BodyPublishers.noBody())
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> syncResponse = httpClient.send(syncRequest, HttpResponse.BodyHandlers.ofString());

        if(syncResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(syncResponse.body(), new TypeReference<>() {
            });

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(syncResponse.statusCode(), objectMapper.readValue(syncResponse.body(), new TypeReference<>() {
        }));
    }

    public Tuple2<Integer, ServiceRestResponse<PosterIntegration>> createPosterIntegration(CreatePosterIntegrationRequest request) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                    .uri(URI.create(serviceAdapter.getPosterService().getUri().toString() + "/api/v1/"))
                    .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                    .header("Content-Type", "application/json")
                    .build();

        HttpResponse<String> createResponse = httpClient.send(createRequest, HttpResponse.BodyHandlers.ofString());

        if(createResponse.statusCode() != HttpStatus.CREATED.value()) {
            ServiceError error = objectMapper.readValue(createResponse.body(), new TypeReference<>() {
            });

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(createResponse.statusCode(), objectMapper.readValue(createResponse.body(), new TypeReference<>() {
        }));
    }

    public Tuple2<Integer, ServiceRestResponse<Boolean>> updatePosterUser(UpdatePosterUserRequest request) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getPosterService().getUri().toString() + "/api/v1/user/"))
                .method("PATCH", HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> updateResponse = httpClient.send(updateRequest, HttpResponse.BodyHandlers.ofString());

        if(updateResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(updateResponse.body(), new TypeReference<>() {
            });

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(updateResponse.statusCode(), objectMapper.readValue(updateResponse.body(), new TypeReference<>() {
        }));
    }

    public int removePosterIntegration(UUID integrationId) throws IOException, InterruptedException {
        HttpRequest removeRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getPosterService().getUri().toString() + "/api/v1/%s/".formatted(integrationId)))
                .DELETE()
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> removeResponse = httpClient.send(removeRequest, HttpResponse.BodyHandlers.ofString());

        return removeResponse.statusCode();
    }

    public Tuple2<Integer, ServiceRestResponse<PosterIntegration>> getPosterIntegrationByCompanyId(UUID companyId) throws IOException, InterruptedException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getPosterService().getUri().toString() + "/api/v1/%s/".formatted(companyId.toString())))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> createResponse = httpClient.send(createRequest, HttpResponse.BodyHandlers.ofString());

        if(createResponse.statusCode() != HttpStatus.CREATED.value()) {
            ServiceError error = objectMapper.readValue(createResponse.body(), new TypeReference<>() {
            });

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(createResponse.statusCode(), objectMapper.readValue(createResponse.body(), new TypeReference<>() {
        }));
    }

    public Tuple2<Integer, ServiceRestResponse<Integer>> createPosterMenuCategory(CreatePosterMenuCategoryRequest request) throws IOException, InterruptedException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getPosterService().getUri().toString() + "/api/v1/menu/category/"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .build();

        HttpResponse<String> createResponse = httpClient.send(createRequest, HttpResponse.BodyHandlers.ofString());

        if(createResponse.statusCode() != HttpStatus.CREATED.value()) {
            ServiceError error = objectMapper.readValue(createResponse.body(), new TypeReference<>() {
            });

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(createResponse.statusCode(), objectMapper.readValue(createResponse.body(), new TypeReference<>() {
        }));
    }

    public Tuple2<Integer, ServiceRestResponse<Boolean>> removePosterMenuCategory(RemovePosterMenuCategoryRequest request) throws IOException, InterruptedException {
        HttpRequest removeRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getPosterService().getUri().toString() + "/api/v1/menu/category/remove/"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .build();

        HttpResponse<String> removeResponse = httpClient.send(removeRequest, HttpResponse.BodyHandlers.ofString());

        if(removeResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(removeResponse.body(), new TypeReference<>() {
            });

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(removeResponse.statusCode(), objectMapper.readValue(removeResponse.body(), new TypeReference<>() {
        }));
    }

    public Tuple2<Integer, ServiceRestResponse<Boolean>> removePosterMenuProduct(RemovePosterMenuProductRequest request) throws IOException, InterruptedException {
        HttpRequest removeRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getPosterService().getUri().toString() + "/api/v1/menu/product/remove/"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .build();

        HttpResponse<String> removeResponse = httpClient.send(removeRequest, HttpResponse.BodyHandlers.ofString());

        if(removeResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(removeResponse.body(), new TypeReference<>() {
            });

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(removeResponse.statusCode(), objectMapper.readValue(removeResponse.body(), new TypeReference<>() {
        }));
    }

    public Tuple2<Integer, ServiceRestResponse<Integer>> createPosterMenuProduct(CreatePosterMenuProductRequest request) throws IOException, InterruptedException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getPosterService().getUri().toString() + "/api/v1/menu/product/"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .build();

        HttpResponse<String> createResponse = httpClient.send(createRequest, HttpResponse.BodyHandlers.ofString());

        if(createResponse.statusCode() != HttpStatus.CREATED.value()) {
            ServiceError error = objectMapper.readValue(createResponse.body(), new TypeReference<>() {
            });

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(createResponse.statusCode(), objectMapper.readValue(createResponse.body(), new TypeReference<>() {
        }));
    }

    public Tuple2<Integer, ServiceRestResponse<Integer>> createPosterUser(CreatePosterUserRequest request) throws IOException, InterruptedException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getPosterService().getUri().toString() + "/api/v1/user/"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .build();

        HttpResponse<String> createResponse = httpClient.send(createRequest, HttpResponse.BodyHandlers.ofString());

        if(createResponse.statusCode() != HttpStatus.CREATED.value()) {
            ServiceError error = objectMapper.readValue(createResponse.body(), new TypeReference<>() {
            });

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(createResponse.statusCode(), objectMapper.readValue(createResponse.body(), new TypeReference<>() {
        }));
    }

    public Tuple2<Integer, ServiceRestResponse<Boolean>> removePosterUser(RemovePosterUserRequest request) throws IOException, InterruptedException {
        HttpRequest removeRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getPosterService().getUri().toString() + "/api/v1/user/remove/"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .build();

        HttpResponse<String> removeResponse = httpClient.send(removeRequest, HttpResponse.BodyHandlers.ofString());

        if(removeResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(removeResponse.body(), new TypeReference<>() {
            });

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(removeResponse.statusCode(), objectMapper.readValue(removeResponse.body(), new TypeReference<>() {
        }));
    }
}
