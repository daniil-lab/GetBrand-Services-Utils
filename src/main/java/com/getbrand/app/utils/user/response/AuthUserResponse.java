package com.getbrand.app.utils.user.response;

import java.util.UUID;

public class AuthUserResponse {
    private UUID id;

    private String login;

    private String access_token;

    public AuthUserResponse() {};

    public AuthUserResponse(UUID id, String login, String access_token) {
        this.id = id;
        this.login = login;
        this.access_token = access_token;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
