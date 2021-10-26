package com.getbrand.app.utils.menu.models;

import com.getbrand.app.utils.company.models.Company;
import com.getbrand.app.utils.company.models.CompanyAddress;
import com.getbrand.app.utils.file.models.File;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.time.Instant;
import java.util.*;

@Entity
public class MenuProduct {
    @Id
    private UUID id;

    private String name;

    private String type;

    private String description;

    private double price;

    private boolean isShowForClient = true;

    private String createdAt;

    private String updatedAt;

    private UUID categoryId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "menu_product_id")
    private List<MenuProductModificator> modificators;

    @PreUpdate
    private void updateDate() {
        this.updatedAt = Instant.now().toString();
    }

    @OneToMany(fetch = FetchType.EAGER, targetEntity = File.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Set<File> files;

    public MenuProduct() {};

    public MenuProduct(String name, String type, String description, double price, boolean isShowForClient, UUID categoryId, Company company) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price * 100;
        this.isShowForClient = isShowForClient;
        this.categoryId = categoryId;
        this.company = company;
        this.id = UUID.randomUUID();
        this.modificators = new ArrayList<>();
        this.files = new HashSet<>();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public void addModificator(MenuProductModificator modificator) {
        this.modificators.add(modificator);
    }

    public void removeModificator(MenuProductModificator modificator) {
        this.modificators.remove(modificator);
    }

    public void removeModificator(int idx) {
        this.modificators.remove(idx);
    }

    public List<MenuProductModificator> getModificators() {
        return modificators;
    }

    public UUID getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isShowForClient() {
        return isShowForClient;
    }

    public Set<File> getFiles() {
        return files;
    }

    public void addFile(File file) { this.files.add(file); }

    public void removeFile(File file) {
        this.files.remove(file);
    }

    public void removeFile(int idx) {
        this.files.remove(idx);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
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

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setModificators(List<MenuProductModificator> modificators) {
        this.modificators = modificators;
    }

    public void setFiles(Set<File> files) {
        this.files = files;
    }
}
