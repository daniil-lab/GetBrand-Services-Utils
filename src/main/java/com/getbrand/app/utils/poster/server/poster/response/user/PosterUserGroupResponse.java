package com.getbrand.app.utils.poster.server.poster.response.user;

public class PosterUserGroupResponse {

    private int client_groups_id;

    private String client_groups_name;

    private int client_groups_discount;

    private int birthday_bonus;

    private int count_groups_clients;

    private int use_ewallet;

    private int delete;

    public PosterUserGroupResponse() {};

    public int getClient_groups_id() {
        return client_groups_id;
    }

    public void setClient_groups_id(int client_groups_id) {
        this.client_groups_id = client_groups_id;
    }

    public String getClient_groups_name() {
        return client_groups_name;
    }

    public void setClient_groups_name(String client_groups_name) {
        this.client_groups_name = client_groups_name;
    }

    public int getClient_groups_discount() {
        return client_groups_discount;
    }

    public void setClient_groups_discount(int client_groups_discount) {
        this.client_groups_discount = client_groups_discount;
    }

    public int getBirthday_bonus() {
        return birthday_bonus;
    }

    public void setBirthday_bonus(int birthday_bonus) {
        this.birthday_bonus = birthday_bonus;
    }

    public int getCount_groups_clients() {
        return count_groups_clients;
    }

    public void setCount_groups_clients(int count_groups_clients) {
        this.count_groups_clients = count_groups_clients;
    }

    public int getUse_ewallet() {
        return use_ewallet;
    }

    public void setUse_ewallet(int use_ewallet) {
        this.use_ewallet = use_ewallet;
    }

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }
}
