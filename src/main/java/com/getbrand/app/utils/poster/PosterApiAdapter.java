package com.getbrand.app.utils.poster;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.getbrand.app.utils.IntegrationApiAdapter;
import com.getbrand.app.utils.exception.InternalErrorException;
import com.getbrand.app.utils.poster.server.poster.request.menu.RemovePosterMenuProductPosterRequest;
import com.getbrand.app.utils.poster.server.poster.request.user.CreatePosterUserGroupPosterRequest;
import com.getbrand.app.utils.poster.server.poster.request.user.CreatePosterUserPosterRequest;
import com.getbrand.app.utils.poster.server.poster.request.user.RemovePosterUserPosterRequest;
import com.getbrand.app.utils.poster.server.poster.request.user.UpdatePosterUserPosterRequest;
import com.getbrand.app.utils.poster.server.poster.request.workshop.CreatePosterWorkshopPosterRequest;
import com.getbrand.app.utils.poster.server.poster.request.menu.CreatePosterMenuCategoryRequest;
import com.getbrand.app.utils.poster.server.poster.request.menu.CreatePosterMenuProductPosterRequest;
import com.getbrand.app.utils.poster.server.poster.request.menu.RemovePosterMenuCategoryPosterRequest;
import com.getbrand.app.utils.poster.server.poster.response.PosterResponse;
import com.getbrand.app.utils.poster.server.poster.response.menu.PosterMenuCategoryResponse;
import com.getbrand.app.utils.poster.server.poster.response.menu.PosterMenuProductResponse;
import com.getbrand.app.utils.poster.server.poster.response.menu.PosterMenuResponse;
import com.getbrand.app.utils.poster.server.poster.response.order.PosterOrderEquipmentWrapperResponse;
import com.getbrand.app.utils.poster.server.poster.response.promo.PosterPromoResponse;
import com.getbrand.app.utils.poster.server.poster.response.spot.GetPosterSpotsResponse;
import com.getbrand.app.utils.poster.server.poster.response.user.PosterUserGroupResponse;
import com.getbrand.app.utils.poster.server.poster.response.user.PosterUserResponse;
import com.getbrand.app.utils.poster.server.poster.response.workshop.PosterWorkshop;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class PosterApiAdapter extends IntegrationApiAdapter {

    private final String apiKey;

    public PosterApiAdapter(String apiKey) {
        super("https://joinposter.com/api/");
        this.apiKey = apiKey;
    }

    public PosterResponse<PosterMenuProductResponse> getProductById(int id) throws IOException, InterruptedException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "menu.getProduct?token=%s&product_id=%d".formatted(this.apiKey, id)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> updateResponse = httpClient.send(updateRequest, HttpResponse.BodyHandlers.ofString());

        if(updateResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(updateResponse.body(), new TypeReference<>() {});
    }

    public PosterResponse<Integer> updateProduct(ObjectNode request) throws IOException, InterruptedException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "menu.updateProduct?token=%s".formatted(this.apiKey)))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .build();

        HttpResponse<String> updateResponse = httpClient.send(updateRequest, HttpResponse.BodyHandlers.ofString());

        if(updateResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(updateResponse.body(), new TypeReference<>() {});
    }

    public PosterResponse<List<GetPosterSpotsResponse>> getPosterSpots() throws IOException, InterruptedException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "access.getSpots?token=%s".formatted(this.apiKey)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> updateResponse = httpClient.send(updateRequest, HttpResponse.BodyHandlers.ofString());

        if(updateResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(updateResponse.body(), new TypeReference<>() {});
    }

    public PosterResponse<Integer> updateUser(ObjectNode request) throws IOException, InterruptedException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "clients.updateClient?token=%s".formatted(this.apiKey)))
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> updateResponse = httpClient.send(updateRequest, HttpResponse.BodyHandlers.ofString());

        if(updateResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(updateResponse.body(), new TypeReference<PosterResponse<Integer>>() {});
    }

    public PosterResponse<Integer> createUserGroup(CreatePosterUserGroupPosterRequest request) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "clients.createGroup?token=%s".formatted(this.apiKey)))
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> createResponse = httpClient.send(createRequest, HttpResponse.BodyHandlers.ofString());

        if(createResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(createResponse.body(), new TypeReference<PosterResponse<Integer>>() {});
    }

    public PosterResponse<Integer> createUser(CreatePosterUserPosterRequest request) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "clients.createClient?token=%s".formatted(this.apiKey)))
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> createResponse = httpClient.send(createRequest, HttpResponse.BodyHandlers.ofString());

        if(createResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(createResponse.body(), new TypeReference<PosterResponse<Integer>>() {});
    }

    public PosterResponse<List<PosterUserResponse>> getUsers() throws IOException, InterruptedException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "clients.getClients?token=%s&fiscal=0".formatted(this.apiKey)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        if(getResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(getResponse.body(), new TypeReference<PosterResponse<List<PosterUserResponse>>>() {});
    }

    public PosterResponse<List<PosterUserGroupResponse>> getUserGroups() throws IOException, InterruptedException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "clients.getGroups?token=%s&fiscal=0".formatted(this.apiKey)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        if(getResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(getResponse.body(), new TypeReference<PosterResponse<List<PosterUserGroupResponse>>>() {});
    }

    public PosterResponse<Integer> createCategory(CreatePosterMenuCategoryRequest request) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "menu.createCategory?token=%s".formatted(this.apiKey)))
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> createResponse = httpClient.send(createRequest, HttpResponse.BodyHandlers.ofString());

        if(createResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(createResponse.body(), new TypeReference<PosterResponse<Integer>>() {});
    }

    public PosterResponse<List<PosterMenuCategoryResponse>> getCategories() throws IOException, InterruptedException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "menu.getCategories?token=%s&fiscal=0".formatted(this.apiKey)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        if(getResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(getResponse.body(), new TypeReference<PosterResponse<List<PosterMenuCategoryResponse>>>() {});
    }

    public PosterResponse<List<PosterPromoResponse>> getPromos() throws IOException, InterruptedException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "clients.getPromotions?token=%s".formatted(this.apiKey)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        if(getResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(getResponse.body(), new TypeReference<PosterResponse<List<PosterPromoResponse>>>() {});
    }

    public PosterResponse<Boolean> removeCategory(RemovePosterMenuCategoryPosterRequest request) throws IOException, InterruptedException {
        HttpRequest removeRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "menu.removeCategory?token=%s".formatted(this.apiKey)))
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> getResponse = httpClient.send(removeRequest, HttpResponse.BodyHandlers.ofString());

        if(getResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(getResponse.body(), new TypeReference<> () {});
    }

    public PosterResponse<Boolean> removeUser(RemovePosterUserPosterRequest request) throws IOException, InterruptedException {
        HttpRequest removeRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "clients.removeClient?token=%s".formatted(this.apiKey)))
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> getResponse = httpClient.send(removeRequest, HttpResponse.BodyHandlers.ofString());

        if(getResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(getResponse.body(), new TypeReference<> () {});
    }

    public PosterResponse<Boolean> removeProduct(RemovePosterMenuProductPosterRequest request) throws IOException, InterruptedException {
        HttpRequest removeRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "menu.removeProduct?token=%s".formatted(this.apiKey)))
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> getResponse = httpClient.send(removeRequest, HttpResponse.BodyHandlers.ofString());

        if(getResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(getResponse.body(), new TypeReference<> () {});
    }

    public PosterResponse<PosterOrderEquipmentWrapperResponse> getEquipment() throws IOException, InterruptedException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "incomingOrders.getTablesForReservation?token=%s".formatted(this.apiKey)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        if(getResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(getResponse.body(), new TypeReference<PosterResponse<PosterOrderEquipmentWrapperResponse>>() {});
    }

    public PosterResponse<Integer> createProduct(CreatePosterMenuProductPosterRequest request) throws IOException, InterruptedException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "menu.createProduct?token=%s".formatted(this.apiKey)))
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> createResponse = httpClient.send(createRequest, HttpResponse.BodyHandlers.ofString());

        if(createResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(createResponse.body(), new TypeReference<PosterResponse<Integer>>() {});
    }

    public PosterResponse<List<PosterWorkshop>> getWorkshops() throws IOException, InterruptedException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "menu.getWorkshops?token=%s".formatted(this.apiKey)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        if(getResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(getResponse.body(), new TypeReference<PosterResponse<List<PosterWorkshop>>>() {});
    }

    public PosterResponse<Integer> createWorkshop(CreatePosterWorkshopPosterRequest request) throws IOException, InterruptedException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "menu.createWorkshop?token=%s".formatted(this.apiKey)))
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> createResponse = httpClient.send(createRequest, HttpResponse.BodyHandlers.ofString());

        if(createResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(createResponse.body(), new TypeReference<PosterResponse<Integer>>() {});
    }

    public PosterResponse<List<PosterPromoResponse>> getPosterPromos() throws IOException, InterruptedException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "clients.getPromotions?token=%s".formatted(this.apiKey)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        if(getResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(getResponse.body(), new TypeReference<PosterResponse<List<PosterPromoResponse>>>() {});
    }

    public PosterResponse<List<PosterMenuProductResponse>> getPosterProducts(int categoryId) throws IOException, InterruptedException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "menu.getProducts?token=%s&category_id=%d&type=products".formatted(this.apiKey, categoryId)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        if(getResponse.body().contains("error")) {
            throw new InternalErrorException();
        }

        return objectMapper.readValue(getResponse.body(), new TypeReference<PosterResponse<List<PosterMenuProductResponse>>>() {});
    }
}
