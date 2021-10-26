package com.getbrand.app.utils.company.request;

import com.fasterxml.jackson.annotation.*;

import java.util.UUID;

public class UpdateCompanyRequest {
    private String name;

    private int inn;

    private UUID statusId;

    private String phone;

    private String email;

    private String vk;

    private String fb;

    private String ig;

    private String youtube;

    private String privacy;

    private String url;

    private float balance;

    private String description;

    public UpdateCompanyRequest() {};

    public UpdateCompanyRequest(String name, int inn, UUID statusId, String phone, String email, String vk, String fb, String ig, String youtube, String privacy, String url, float balance, String description) {
        this.name = name;
        this.inn = inn;
        this.statusId = statusId;
        this.phone = phone;
        this.email = email;
        this.vk = vk;
        this.fb = fb;
        this.ig = ig;
        this.youtube = youtube;
        this.privacy = privacy;
        this.url = url;
        this.balance = balance;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getInn() {
        return inn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public UUID getStatusId() {
        return statusId;
    }

    public void setStatusId(UUID statusId) {
        this.statusId = statusId;
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

    public String getVk() {
        return vk;
    }

    public void setVk(String vk) {
        this.vk = vk;
    }

    public String getFb() {
        return fb;
    }

    public void setFb(String fb) {
        this.fb = fb;
    }

    public String getIg() {
        return ig;
    }

    public void setIg(String ig) {
        this.ig = ig;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
