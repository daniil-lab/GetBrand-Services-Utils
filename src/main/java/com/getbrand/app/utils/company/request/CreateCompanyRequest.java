package com.getbrand.app.utils.company.request;

import com.getbrand.app.utils.IntegrationType;

import java.util.UUID;

public class CreateCompanyRequest {
    private String name;

    private String inn;

    private String phone;

    private String email;

    private String vk;

    private String ig;

    private String fb;

    private String youtube;

    private String privacy;

    private String url;

    private IntegrationType integrationType;

    private UUID statusId;

    public CreateCompanyRequest() {

    }

    public CreateCompanyRequest(String name, String inn, String phone, String email, String vk, String ig, String fb, String youtube, String privacy, String url, IntegrationType integrationType, UUID statusId) {
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
        this.integrationType = integrationType;
        this.statusId = statusId;
    }

    public String getName() {
        return name;
    }

    public String getInn() {
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

    public IntegrationType getIntegrationType() {
        return integrationType;
    }
}
