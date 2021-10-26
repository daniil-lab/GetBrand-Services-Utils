package com.getbrand.app.utils.company.request;

import com.getbrand.app.utils.IntegrationType;

public class CreateCompanyRequest {
    private String name;

    private int inn;

    private String phone;

    private String email;

    private String vk;

    private String ig;

    private String fb;

    private String youtube;

    private String privacy;

    private String url;

    private String description;

    private IntegrationType integrationType;

    private String integrationCred;

    public CreateCompanyRequest() {};

    public CreateCompanyRequest(String name, int inn, String phone, String email, String vk, String ig, String fb, String youtube, String privacy, String url, String description, IntegrationType integrationType, String integrationCred) {
        this.name = name;
        this.inn = inn;
        this.phone = phone;
        this.email = email;
        this.vk = vk;
        this.ig = ig;
        this.fb = fb;
        this.youtube = youtube;
        this.privacy = privacy;
        this.url = url;
        this.description = description;
        this.integrationType = integrationType;
        this.integrationCred = integrationCred;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setVk(String vk) {
        this.vk = vk;
    }

    public void setIg(String ig) {
        this.ig = ig;
    }

    public void setFb(String fb) {
        this.fb = fb;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIntegrationType(IntegrationType integrationType) {
        this.integrationType = integrationType;
    }

    public void setIntegrationCred(String integrationCred) {
        this.integrationCred = integrationCred;
    }

    public String getName() {
        return name;
    }

    public int getInn() {
        return inn;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getVk() {
        return vk;
    }

    public String getIg() {
        return ig;
    }

    public String getFb() {
        return fb;
    }

    public String getYoutube() {
        return youtube;
    }

    public String getPrivacy() {
        return privacy;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public IntegrationType getIntegrationType() {
        return integrationType;
    }

    public String getIntegrationCred() {
        return integrationCred;
    }
}

