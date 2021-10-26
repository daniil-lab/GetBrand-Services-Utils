package com.getbrand.app.utils.user;

import com.fasterxml.jackson.core.type.TypeReference;
import com.getbrand.app.utils.ServiceAdapter;
import com.getbrand.app.utils.ServiceError;
import com.getbrand.app.utils.ServiceRestActionAdapter;
import com.getbrand.app.utils.ServiceRestResponse;
import com.getbrand.app.utils.exception.InternalErrorException;
import com.getbrand.app.utils.promo.models.PromoIntegration;
import com.getbrand.app.utils.role.models.Role;
import com.getbrand.app.utils.role.request.CreateRoleRequest;
import com.getbrand.app.utils.user.models.User;
import com.getbrand.app.utils.user.models.UserDeviceToken;
import com.getbrand.app.utils.user.request.*;
import com.getbrand.app.utils.user.response.AuthUserResponse;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.http.HttpStatus;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuples;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.UUID;

public class UserServiceAdapter extends ServiceRestActionAdapter {
    public UserServiceAdapter(ServiceAdapter serviceAdapter) {
        super(serviceAdapter);
    }

    public Tuple2<Integer, ServiceRestResponse<AuthUserResponse>> authUser(AuthUserRequest request) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/auth"))
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

    public Tuple2<Integer, ServiceRestResponse<Object>> getSmsCode(GetCodeRequest request) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/get-code"))
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

    public Tuple2<Integer, ServiceRestResponse<List<UserDeviceToken>>> getTokensByUserId(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/device-token/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<List<UserDeviceToken>>> getDeviceTokens() throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/device-token/"))
                .GET()
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        if (getResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(getResponse.body(), new TypeReference<ServiceError>() {
            });

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(getResponse.statusCode(), objectMapper.readValue(getResponse.body(), new TypeReference<>() {
        }));
    }

    public Tuple2<Integer, ServiceRestResponse<Boolean>> deleteDeviceToken(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest deleteRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/device-token/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<UserDeviceToken>> createUserDeviceToken(CreateUserDeviceTokenRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/device-token/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<User>> createUser(CreateUserRequest request) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/"))
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

    public Tuple2<Integer, ServiceRestResponse<User>> createUserSms(CreateUserSmsRequest request) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest createRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/sms/"))
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

    public Tuple2<Integer, ServiceRestResponse<Boolean>> deleteUser(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest deleteRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<User>> updateUserCompanyRole(AddCompanyRoleToUserRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/role/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<User>> updateUserCompany(AddCompanyToUserRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/company/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<User>> updateUserPasswordSms(UpdateUserPasswordSmsRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/password/sms/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<User>> updateUserPassword(UpdateUserPasswordRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/password/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<User>> updateUserStatus(UpdateStatusForUserRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/status/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<User>> updateUser(UpdateUserRequest request, UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest updateRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<User>> getUserById(UUID id) throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/%s".formatted(id)))
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

    public Tuple2<Integer, ServiceRestResponse<User>> findUser(String login,
                                                               String name,
                                                               String birthDay,
                                                               String email,
                                                               String phone) throws IOException, InterruptedException, InternalErrorException, URISyntaxException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URIBuilder(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/findBy")
                        .addParameter("login", login)
                        .addParameter("name", name)
                        .addParameter("email", email)
                        .addParameter("phone", phone)
                        .addParameter("birthday", birthDay)
                        .build())
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

    public Tuple2<Integer, ServiceRestResponse<List<User>>> getUsers() throws IOException, InterruptedException, InternalErrorException {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(serviceAdapter.getUserService().getUri().toString() + "/api/v1/user/"))
                .GET()
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        if (getResponse.statusCode() != HttpStatus.OK.value()) {
            ServiceError error = objectMapper.readValue(getResponse.body(), new TypeReference<ServiceError>() {
            });

            throw new InternalErrorException(error.getSubErrors());
        }

        return Tuples.of(getResponse.statusCode(), objectMapper.readValue(getResponse.body(), new TypeReference<>() {
        }));
    }
}
