package com.getbrand.app.utils.company.models;

import com.getbrand.app.utils.menu.models.MenuProduct;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
public class CompanyPromocode {
    @Id
    private UUID id;

    private String name;

    private String customName;

    private String code;

    private String type;

    private String targetComponent;

    private int count;

    private String expire;

    private boolean isActive;

    private boolean isUnlimited;

    private String createdAt;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "product_id")
    private Set<MenuProduct> products;

    public CompanyPromocode() {};

    public CompanyPromocode(String name, String customName, String code, String type, String targetComponent, int count, String expire, boolean isActive, boolean isUnlimited, String createdAt, Company company) {
        this.name = name;
        this.customName = customName;
        this.code = code;
        this.type = type;
        this.targetComponent = targetComponent;
        this.count = count;
        this.expire = expire;
        this.isActive = isActive;
        this.isUnlimited = isUnlimited;
        this.createdAt = createdAt;
        this.company = company;
        this.id = UUID.randomUUID();
    }

    public void addProductToPromocode(MenuProduct product) {
        this.products.add(product);
    }

    public void removeProductFromPromocode(MenuProduct product) {
        this.products.remove(product);
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

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTargetComponent() {
        return targetComponent;
    }

    public void setTargetComponent(String targetComponent) {
        this.targetComponent = targetComponent;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isUnlimited() {
        return isUnlimited;
    }

    public void setUnlimited(boolean unlimited) {
        isUnlimited = unlimited;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Set<MenuProduct> getProducts() {
        return products;
    }

    public void setProducts(Set<MenuProduct> products) {
        this.products = products;
    }
}
