package com.getbrand.app.utils.company.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Company {
    @Id
    private UUID id;

    private String name;

    private int inn;

    private String phone;

    private String email;

    private float balance;

    private String vk;

    private String ig;

    private String fb;

    private String youtube;

    private String privacy;

    private UUID pushChannel;

    private String url;

    private String description;

    @ElementCollection
    private List<UUID> users;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonManagedReference
    @JoinColumn(name = "company_id")
    private List<CompanyAddress> addresses;

    @OneToOne(fetch = FetchType.EAGER, targetEntity = CompanyIntegration.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "company_integration_id")
    private CompanyIntegration companyIntegration;

    @OneToOne(fetch = FetchType.EAGER, targetEntity = CompanyStatus.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "company_status_id")
    private CompanyStatus status;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "company_tariffs",
            joinColumns = @JoinColumn(name = "company_id"),
            inverseJoinColumns = @JoinColumn(name = "tarif_id")
    )
    private List<CompanyTarif> tarifs;

    public Company() {};

    public Company(String name,
                   int inn,
                   String phone,
                   String email,
                   String vk,
                   String ig,
                   String fb,
                   String youtube,
                   String privacy,
                   String url,
                   CompanyIntegration companyIntegration) {
        this.id = UUID.randomUUID();
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
        this.pushChannel = UUID.randomUUID();
        this.addresses = new ArrayList<>();
        this.users = new ArrayList<>();
        this.tarifs = new ArrayList<>();
    };

    public void addTariff(CompanyTarif tariff) {
        this.tarifs.add(tariff);
    }

    public void removeTariff(CompanyTarif tariff) {
        this.tarifs.remove(tariff);
    }

    public void removeTariff(int tariff) {
        this.tarifs.remove(tariff);
    }

    public CompanyIntegration getCompanyIntegration() {
        return companyIntegration;
    }

    public List<CompanyTarif> getTarifs() {
        return tarifs;
    }

    public void setTarifs(List<CompanyTarif> tarifs) {
        this.tarifs = tarifs;
    }

    public List<UUID> getUsers() {
        return users;
    }

    public void setUsers(List<UUID> users) {
        this.users = users;
    }

    public List<CompanyAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<CompanyAddress> addresses) {
        this.addresses = addresses;
    }

    public void setCompanyIntegration(CompanyIntegration companyIntegration) {
        this.companyIntegration = companyIntegration;
    }

    public void addAddressToCompany(CompanyAddress address) {
        this.addresses.add(address);
    }

    public void removeAddressFromCompany(CompanyAddress address) {
        this.addresses.remove(address);
    }

    public void addUserToCompany(UUID userId) {
        this.users.add(userId);
    }

    public void removeUserFromCompany(UUID userId) {
        this.users.remove(userId);
    }

    public CompanyStatus getStatus() {
        return status;
    }

    public void setStatus(CompanyStatus status) {
        this.status = status;
    }

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

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
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

    public UUID getPushChannel() {
        return pushChannel;
    }

    public void setPushChannel(UUID pushChannel) {
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
