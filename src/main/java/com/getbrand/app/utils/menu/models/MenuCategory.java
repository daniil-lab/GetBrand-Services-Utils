package com.getbrand.app.utils.menu.models;

import com.getbrand.app.utils.company.models.Company;
import com.getbrand.app.utils.file.models.File;

import javax.persistence.*;
import java.time.Instant;
import java.util.*;

@Entity
public class MenuCategory {
    @Id
    protected UUID id = UUID.randomUUID();

    protected String name;

    protected String description;

    protected boolean isShowForClient = true;

    protected String createdAt;

    protected String updatedAt;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "company_id")
    protected Company company;

    @OneToMany(fetch = FetchType.EAGER, targetEntity = File.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    protected Set<File> files;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "menu_category_id")
    protected List<MenuProduct> products;

    @ElementCollection
    protected List<String> components;

    @PreUpdate
    private void updateDate() {
        this.updatedAt = Instant.now().toString();
    }

    public MenuCategory() {};

    public MenuCategory(String name, String description, boolean isShowForClient, Company company) {
        this.name = name;
        this.description = description;
        this.isShowForClient = isShowForClient;
        this.company = company;
        this.products = new ArrayList<>();
        this.files = new HashSet<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setShowForClient(boolean showForClient) {
        isShowForClient = showForClient;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setFiles(Set<File> files) {
        this.files = files;
    }

    public void setProducts(List<MenuProduct> products) {
        this.products = products;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isShowForClient() {
        return isShowForClient;
    }

    public UUID getId() {
        return id;
    }

    public Set<File> getFiles() {
        return files;
    }

    public List<MenuProduct> getProducts() {
        return products;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void addProduct(MenuProduct product) {
        this.products.add(product);
    }

    public void removeProduct(MenuProduct product) {
        this.products.remove(product);
    }

    public void removeProduct(int idx) {
        this.products.remove(idx);
    }

    public void addFile(File file) { this.files.add(file); }

    public void removeFile(File file) {
        this.files.remove(file);
    }

    public void removeFile(int idx) {
        this.files.remove(idx);
    }
}
