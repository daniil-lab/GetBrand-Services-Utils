package com.getbrand.app.utils.menu.models;

import com.getbrand.app.utils.models.File;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class MenuProduct {
    @Id
    private UUID id;

    private String name;

    private int posterId;

    private String type;

    private String description;

    private float price;

    private boolean isShowForClient = true;

    private String createdAt;

    private String updatedAt;

    private UUID categoryId;

    @OneToMany
    @JoinColumn(name = "menu_product_id")
    @ElementCollection
    private List<MenuProductModificator> modificators;

    @PreUpdate
    private void updateDate() {
        this.updatedAt = Instant.now().toString();
    }

    @OneToMany
    @JoinColumn(name="menu_file_id")
    private List<File> files;

    public MenuProduct() {};

    public MenuProduct(UUID categoryId, String name, String type, String description, float price, boolean isShowForClient, List<File> files, int posterId) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.isShowForClient = isShowForClient;
        this.posterId = posterId;
        this.files = files;
        this.categoryId = categoryId;
        this.modificators = new ArrayList<>();
    }

    public int getPosterId() {
        return posterId;
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

    public float getPrice() {
        return price;
    }

    public boolean isShowForClient() {
        return isShowForClient;
    }

    public List<File> getFiles() {
        return files;
    }

    public void addFile(File file) { this.files.add(file); }

    public void removeFile(File file) {
        this.files.remove(file);
    }

    public void removeFile(int idx) {
        this.files.remove(idx);
    }
}
