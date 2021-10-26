package com.getbrand.app.utils.order;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.getbrand.app.utils.ServiceAdapter;
import com.getbrand.app.utils.ServiceError;
import com.getbrand.app.utils.ServiceRestActionAdapter;
import com.getbrand.app.utils.ServiceRestResponse;
import com.getbrand.app.utils.exception.InternalErrorException;
import com.getbrand.app.utils.order.models.Equipment;
import com.getbrand.app.utils.order.models.Order;
import com.getbrand.app.utils.order.models.OrderState;
import com.getbrand.app.utils.order.request.*;
import org.springframework.http.HttpStatus;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuples;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.UUID;

public class OrderServiceAdapter extends ServiceRestActionAdapter {
    public OrderServiceAdapter(ServiceAdapter serviceAdapter) {
        super(serviceAdapter);
    }

    public Tuple2<Integer, ServiceRestResponse<Order>> removeLoyaltyTypeFromOrder(AddLoyaltyTypeToOrderRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/loyalty-type/remove/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> addLoyaltyTypeToOrder(AddLoyaltyTypeToOrderRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/loyalty-type/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> removePriceFromOrder(UUID priceId, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/price/remove/%s/%s".formatted(id, priceId)))
                .method("PATCH", HttpRequest.BodyPublishers.noBody())
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> updateResponse = httpClient.send(updateRequest, HttpResponse.BodyHandlers.ofString());

        if(updateResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(updateResponse.body(), new TypeReference<ServiceError>() {});

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(updateResponse.statusCode(), objectMapper.readValue(updateResponse.body(), new TypeReference<>() {}));
    }

    public Tuple2<Integer, ServiceRestResponse<Order>> addPriceToOrder(AddPriceToOrderRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/price/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> updateOrderGift(AddGiftToOrderRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/gift/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> updateOrderReview(UpdateOrderReviewRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/review/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> removePromoFromOrder(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/promo/remove/%s".formatted(id)))
                .method("PATCH", HttpRequest.BodyPublishers.noBody())
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> updateResponse = httpClient.send(updateRequest, HttpResponse.BodyHandlers.ofString());

        if(updateResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(updateResponse.body(), new TypeReference<ServiceError>() {});

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(updateResponse.statusCode(), objectMapper.readValue(updateResponse.body(), new TypeReference<>() {}));
    }

    public Tuple2<Integer, ServiceRestResponse<Order>> addPromoToOrder(UUID promoId, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/promo/add/%s/%s".formatted(id, promoId)))
                .method("PATCH", HttpRequest.BodyPublishers.noBody())
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> updateResponse = httpClient.send(updateRequest, HttpResponse.BodyHandlers.ofString());

        if(updateResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(updateResponse.body(), new TypeReference<ServiceError>() {});

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(updateResponse.statusCode(), objectMapper.readValue(updateResponse.body(), new TypeReference<>() {}));
    }

    public Tuple2<Integer, ServiceRestResponse<Order>> removeEquipmentFromOrder(AddEquipmentToOrderRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/equipment/remove/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> addEquipmentToOrder(AddEquipmentToOrderRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/equipment/add/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> removeProductFromOrder(RemoveProductFromOrderRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/product/remove/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> addManyProductsToOrder(List<AddProductToOrderRequest> request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/product/add-many/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> addProductToOrder(AddProductToOrderRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/product/add/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> removeBonusFromOrder(RemoveBonusFromOrderRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/bonus/remove/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> addBonusToOrder(AddBonusToOrderRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/bonus/add/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> updateCreatedOrderState(UpdateCreatedOrderStateRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/state/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> updateOrderUser(UpdateOrderUserRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/user/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> updateOrderManager(UpdateOrderUserRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/manager/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> updateOrderEmployeeComment(UpdateOrderEmployeeCommentRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/employee-comment/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> createOrder(CreateOrderRequest request) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/"))
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

    public Tuple2<Integer, ServiceRestResponse<Boolean>> deleteOrder(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest deleteRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> removeOrderReview(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest deleteRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/review/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<Order>> getOrderById(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<List<Order>>> getOrders() throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/"))
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

    public Tuple2<Integer, ServiceRestResponse<OrderState>> updateOrderState(CreateOrderStateRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/state/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<OrderState>> createOrderState(CreateOrderStateRequest request) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/state/"))
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

    public Tuple2<Integer, ServiceRestResponse<Boolean>> deleteOrderState(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest deleteRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/state/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<OrderState>> getOrderStateById(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/state/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<List<OrderState>>> getOrderStates() throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getOrderService().getUri().toString() + "/api/v1/order/state/"))
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
