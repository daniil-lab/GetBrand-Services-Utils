package com.getbrand.app.utils.menu.models;

import com.getbrand.app.utils.IntegrationType;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Menu {
    @Id
    private UUID id;

    private UUID companyId;

    private String createdAt;

    private String updatedAt;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "menu_category_id")
    private List<MenuCategory> categories;

    @PreUpdate
    private void updateDate() {
        this.updatedAt = Instant.now().toString();
    }

    public Menu() {};

    public Menu(UUID companyId, List<MenuCategory> categories) {
        this.id = UUID.randomUUID();
        this.companyId = companyId;
        this.categories = categories;
        this.updatedAt = Instant.now().toString();
        this.createdAt = Instant.now().toString();
        this.categories = new ArrayList<>();
    }

    public Menu(UUID companyId) {
        this.id = UUID.randomUUID();
        this.companyId = companyId;
        this.updatedAt = Instant.now().toString();
        this.createdAt = Instant.now().toString();
        this.categories = new ArrayList<>();
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCategories(List<MenuCategory> categories) {
        this.categories = categories;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public List<MenuCategory> getCategories() {
        return categories;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public void addCategory(MenuCategory category) {
        categories.add(category);
    }

    public void removeCategory(MenuCategory category) {
        categories.remove(category);
    }

    public void removeCategory(int idx) {
        categories.remove(idx);
    }

    public void cleanCategories() {
        this.categories.clear();
    }
}