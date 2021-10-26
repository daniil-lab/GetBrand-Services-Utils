package com.getbrand.app.utils.poster.server.poster.request.user;

public class RemovePosterUserPosterRequest {
    private int client_id;

    public RemovePosterUserPosterRequest() {};

    public RemovePosterUserPosterRequest(int client_id) {
        this.client_id = client_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }
}
