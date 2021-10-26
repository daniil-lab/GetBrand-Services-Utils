package com.getbrand.app.utils.poster.server.poster.request.user;

public class CreatePosterUserGroupPosterRequest {

    private String client_groups_name;

    private int loyalty_type = 1;

    private int client_groups_discount = 0;

    private int birthday_bonus = 0;

    public CreatePosterUserGroupPosterRequest() {};

    public CreatePosterUserGroupPosterRequest(String client_groups_name) {
        this.client_groups_name = client_groups_name;
    }

    public String getClient_groups_name() {
        return client_groups_name;
    }

    public void setClient_groups_name(String client_groups_name) {
        this.client_groups_name = client_groups_name;
    }

    public int getLoyalty_type() {
        return loyalty_type;
    }

    public void setLoyalty_type(int loyalty_type) {
        this.loyalty_type = loyalty_type;
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
}
