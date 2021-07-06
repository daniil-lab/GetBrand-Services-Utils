package com.getbrand.app.utils.menu.models;

import com.getbrand.app.utils.IntegrationType;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Entity
public class Menu {
    @Id
    private UUID id;

    private UUID integrationId;

    private IntegrationType integrationType;

    private String createdAt;

    private String updatedAt;

    @OneToMany
    @JoinColumn(name = "menu_category_id")
    @ElementCollection()
    private List<MenuCategory> categories;

    @PreUpdate
    private void updateDate() {
        this.updatedAt = Instant.now().toString();
    }

    public Menu() {};

    public Menu(UUID integrationId, IntegrationType integrationType, List<MenuCategory> categories) {
        this.id = UUID.randomUUID();
        this.integrationId = integrationId;
        this.integrationType = integrationType;
        this.categories = categories;
        this.updatedAt = Instant.now().toString();
        this.createdAt = Instant.now().toString();
    }

    public Menu(UUID integrationId, IntegrationType integrationType) {
        this.id = UUID.randomUUID();
        this.integrationId = integrationId;
        this.integrationType = integrationType;
        this.updatedAt = Instant.now().toString();
        this.createdAt = Instant.now().toString();
    }

    public UUID getIntegrationId() {
        return integrationId;
    }

    public IntegrationType getIntegrationType() {
        return integrationType;
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