package com.getbrand.app.utils.company.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Company {
    @Id
    private UUID id;

    private String name;

    private String inn;

    private String phone;

    private String email;

    private float balance;

    private String vk;

    private String ig;

    private String fb;

    private String youtube;

    private String privacy;

    private String pushChannel;

    private String url;

    private String description;

    private CompanyIntegration companyIntegration;

    public Company() {};

    public Company(String name,
                   String inn,
                   String phone,
                   String email,
                   String vk,
                   String ig,
                   String fb,
                   String youtube,
                   String privacy,
                   String url,
                   CompanyIntegration companyIntegration) {
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
        this.companyIntegration = companyIntegration;
    };


    public CompanyIntegration getIntegration() {
        return companyIntegration;
    }

    public void setIntegration(CompanyIntegration companyIntegration) {
        this.companyIntegration = companyIntegration;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
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

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getVk() {
        return vk;
    }

    public void setVk(String vk) {
        this.vk = vk;
    }

    public String getIg() {
        return ig;
    }

    public void setIg(String ig) {
        this.ig = ig;
    }

    public String getFb() {
        return fb;
    }

    public void setFb(String fb) {
        this.fb = fb;
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

    public String getPushChannel() {
        return pushChannel;
    }

    public void setPushChannel(String pushChannel) {
        this.pushChannel = pushChannel;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
