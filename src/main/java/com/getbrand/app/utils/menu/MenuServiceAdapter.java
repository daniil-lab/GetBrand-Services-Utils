package com.getbrand.app.utils.menu;

import com.fasterxml.jackson.core.type.TypeReference;
import com.getbrand.app.utils.ServiceAdapter;
import com.getbrand.app.utils.ServiceError;
import com.getbrand.app.utils.ServiceRestActionAdapter;
import com.getbrand.app.utils.ServiceRestResponse;
import com.getbrand.app.utils.exception.InternalErrorException;
import com.getbrand.app.utils.menu.models.Menu;
import com.getbrand.app.utils.menu.models.MenuCategory;
import com.getbrand.app.utils.menu.models.MenuProduct;
import com.getbrand.app.utils.menu.models.gift.Gift;
import com.getbrand.app.utils.menu.request.*;
import com.getbrand.app.utils.models.request.AddFileRequest;
import com.getbrand.app.utils.models.request.RemoveFileRequest;
import com.getbrand.app.utils.poster.models.PosterIntegration;
import com.getbrand.app.utils.poster.request.CreatePosterIntegrationRequest;
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

public class MenuServiceAdapter extends ServiceRestActionAdapter {
    public MenuServiceAdapter(ServiceAdapter serviceAdapter) {
        super(serviceAdapter);
    }

    public Tuple2<Integer, ServiceRestResponse<Gift>> createGift(CreateGiftRequest request) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/gift/"))
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

    public Tuple2<Integer, ServiceRestResponse<Boolean>> cleanMenu(UUID companyId) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest cleanRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/clean/%s".formatted(companyId)))
                .POST(HttpRequest.BodyPublishers.noBody())
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> cleanResponse = httpClient.send(cleanRequest, HttpResponse.BodyHandlers.ofString());

        if(cleanResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(cleanResponse.body(), new TypeReference<ServiceError>() {});

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(cleanResponse.statusCode(), objectMapper.readValue(cleanResponse.body(), new TypeReference<>() {}));
    }

    public Tuple2<Integer, ServiceRestResponse<Gift>> deleteGift(UUID id, int count) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest deleteRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/gift/%s/%d".formatted(id, count)))
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

    public Tuple2<Integer, ServiceRestResponse<Gift>> getGiftById(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/gift/%s/".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<List<Gift>>> getGifts() throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/gift/"))
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

    public Tuple2<Integer, ServiceRestResponse<MenuProduct>> createProduct(AddProductToCategoryRequest request) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-product/"))
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

    public Tuple2<Integer, ServiceRestResponse<MenuProduct>> deleteProduct(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest deleteRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-product/%s/".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<MenuProduct>> updateProduct(AddProductToCategoryRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-product/%s/".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<MenuProduct>> addModificatorToProduct(List<AddModificatorToProductRequest> request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-product/modificator/%s/".formatted(id)))
                .method("POST", HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> updateResponse = httpClient.send(updateRequest, HttpResponse.BodyHandlers.ofString());

        if(updateResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(updateResponse.body(), new TypeReference<ServiceError>() {});

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(updateResponse.statusCode(), objectMapper.readValue(updateResponse.body(), new TypeReference<>() {}));
    }

    public Tuple2<Integer, ServiceRestResponse<MenuProduct>> removeModificatorFromProduct(RemoveModificatorFromProductRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-product/modificator/remove/%s".formatted(id)))
                .method("POST", HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> updateResponse = httpClient.send(updateRequest, HttpResponse.BodyHandlers.ofString());

        if(updateResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(updateResponse.body(), new TypeReference<ServiceError>() {});

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(updateResponse.statusCode(), objectMapper.readValue(updateResponse.body(), new TypeReference<>() {}));
    }

    public Tuple2<Integer, ServiceRestResponse<MenuProduct>> addFileToProduct(List<AddFileRequest> request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-product/file/%s/".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<MenuProduct>> removeFileFromProduct(List<RemoveFileRequest> request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-product/file/%s/".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<MenuProduct>> getProductById(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-product/%s/".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<List<MenuProduct>>> getProducts() throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-product/"))
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

    public Tuple2<Integer, ServiceRestResponse<MenuCategory>> createCategory(AddCategoryMenuRequest request) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-category/"))
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

    public Tuple2<Integer, ServiceRestResponse<MenuCategory>> deleteCategory(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest deleteRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-category/%s/".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<MenuCategory>> updateCategory(AddCategoryMenuRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-category/%s/".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<MenuCategory>> addFileToCategory(List<AddFileRequest> request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-category/file/%s/".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<MenuCategory>> removeFileFromCategory(List<RemoveFileRequest> request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-category/file/%s/".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<MenuCategory>> getCategoryById(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-category/%s/".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<List<MenuCategory>>> getCategories() throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getMenuService().getUri().toString() + "/api/v1/menu-category/"))
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
