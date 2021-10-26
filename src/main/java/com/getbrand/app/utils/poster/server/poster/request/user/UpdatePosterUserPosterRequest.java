package com.getbrand.app.utils.poster.server.poster.request.user;

import java.util.UUID;

public class UpdatePosterUserPosterRequest {
    private int client_id;

    private String client_name;

    private String email;

    private String phone;

    private String birthday;


    public UpdatePosterUserPosterRequest() {};

    public UpdatePosterUserPosterRequest(int client_id, String client_name, String email, String phone, String birthday) {
        this.client_id = client_id;
        this.client_name = client_name;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
