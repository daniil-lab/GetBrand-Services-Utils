package com.getbrand.app.utils.poster.server.poster.request.user;

public class CreatePosterUserPosterRequest {
    private String client_name;

    private int client_sex = 0;

    private int client_groups_id_client = 1;

    private String card_number = "";

    private int discount_per = 0;

    private String phone;

    private String email;

    private String birthday;

    private int bonus = 0;

    private int total_payed_sum = 0;

    public CreatePosterUserPosterRequest() {};

    public CreatePosterUserPosterRequest(String client_name, String phone, String email, String birthday) {
        this.client_name = client_name;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public int getClient_sex() {
        return client_sex;
    }

    public void setClient_sex(int client_sex) {
        this.client_sex = client_sex;
    }

    public int getClient_groups_id_client() {
        return client_groups_id_client;
    }

    public void setClient_groups_id_client(int client_groups_id_client) {
        this.client_groups_id_client = client_groups_id_client;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public int getDiscount_per() {
        return discount_per;
    }

    public void setDiscount_per(int discount_per) {
        this.discount_per = discount_per;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getTotal_payed_sum() {
        return total_payed_sum;
    }

    public void setTotal_payed_sum(int total_payed_sum) {
        this.total_payed_sum = total_payed_sum;
    }
}
