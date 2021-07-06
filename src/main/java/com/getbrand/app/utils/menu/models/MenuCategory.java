package com.getbrand.app.utils.menu.models;

import com.getbrand.app.utils.models.File;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class MenuCategory {
    @Id
    private UUID id = UUID.randomUUID();

    private String name;

    private int posterId;

    private String description;

    private boolean isShowForClient = true;

    private String createdAt;

    private String updatedAt;

    @OneToMany
    @JoinColumn(name = "menu_file_id")
    @ElementCollection
    private List<File> files;

    @OneToMany
    @JoinColumn(name = "menu_category_id")
    @ElementCollection
    private List<MenuProduct> products;

    @ElementCollection
    private List<String> components;

    @PreUpdate
    private void updateDate() {
        this.updatedAt = Instant.now().toString();
    }

    public MenuCategory() {};

    public MenuCategory(String name, int posterId) {
        this.updatedAt = Instant.now().toString();
        this.createdAt = Instant.now().toString();
        this.name = name;
        this.posterId = posterId;
        this.components = new ArrayList<>();
    };

    public MenuCategory(String name, String description, boolean isShowForClient, int posterId) {
        this.name = name;
        this.description = description;
        this.updatedAt = Instant.now().toString();
        this.createdAt = Instant.now().toString();
        this.isShowForClient = isShowForClient;
        this.posterId = posterId;
        this.components = new ArrayList<>();
    }

    public MenuCategory(String name, String description, boolean isShowForClient, List<File> files, List<MenuProduct> products, int posterId) {
        this.name = name;
        this.description = description;
        this.isShowForClient = isShowForClient;
        this.files = files;
        this.products = products;
        this.updatedAt = Instant.now().toString();
        this.createdAt = Instant.now().toString();
        this.posterId = posterId;
        this.components = new ArrayList<>();
    }

    public MenuCategory(String name, List<MenuProduct> products, int posterId) {
        this.name = name;
        this.products = products;
        this.updatedAt = Instant.now().toString();
        this.createdAt = Instant.now().toString();
        this.posterId = posterId;
        this.components = new ArrayList<>();
    }

    public int getPosterId() {
        return posterId;
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

    public List<File> getFiles() {
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
