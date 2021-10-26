package com.getbrand.app.utils.poster.server.poster.response.user;

public class PosterUserResponse {

    private int client_id;

    private String firstname;

    private String lastname;

    private String patronymic;

    private int discount_per;

    private int bonus;

    private int total_payed_sum;

    private String date_activale;

    private String phone_number;

    private String email;

    private String birthday;

    private String card_number;

    private int client_sex;

    public PosterUserResponse() {};

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDiscount_per() {
        return discount_per;
    }

    public void setDiscount_per(int discount_per) {
        this.discount_per = discount_per;
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

    public String getDate_activale() {
        return date_activale;
    }

    public void setDate_activale(String date_activale) {
        this.date_activale = date_activale;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
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

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public int getClient_sex() {
        return client_sex;
    }

    public void setClient_sex(int client_sex) {
        this.client_sex = client_sex;
    }
}
