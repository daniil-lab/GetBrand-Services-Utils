package com.getbrand.app.utils.loyalty.models;

import com.getbrand.app.utils.user.models.User;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class UserLoyalty {
    @Id
    private UUID id;

    private double value;

    private double summ;

    private double loyalityCount;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_loyalty__id")
    private CompanyLoyalty companyLoyality;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_loyalty___id")
    private User user;

    @OneToOne(fetch = FetchType.EAGER, targetEntity = CompanyGrade.class, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_loyalty_id")
    private CompanyGrade grade;

    public UserLoyalty() {};

    public UserLoyalty(double value, double summ, double loyalityCount, CompanyLoyalty companyLoyality, User user, CompanyGrade grade) {
        this.id = UUID.randomUUID();
        this.value = value;
        this.summ = summ;
        this.loyalityCount = loyalityCount;
        this.companyLoyality = companyLoyality;
        this.user = user;
        this.grade = grade;
    }

    public UUID getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getSumm() {
        return summ;
    }

    public void setSumm(double summ) {
        this.summ = summ;
    }

    public double getLoyalityCount() {
        return loyalityCount;
    }

    public void setLoyalityCount(double loyalityCount) {
        this.loyalityCount = loyalityCount;
    }

    public CompanyLoyalty getCompanyLoyality() {
        return companyLoyality;
    }

    public void setCompanyLoyality(CompanyLoyalty companyLoyality) {
        this.companyLoyality = companyLoyality;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CompanyGrade getGrade() {
        return grade;
    }

    public void setGrade(CompanyGrade grade) {
        this.grade = grade;
    }
}
