package com.getbrand.app.utils.menu.request;

import java.util.UUID;

public class AddProductToCategoryRequest {
    private String name;

    private String type;

    private String description;

    private double price = -1;

    private UUID companyId;

    private UUID categoryId;

    private boolean isShowForClient;

    private int posterId = -1;

    public AddProductToCategoryRequest() {};

    public AddProductToCategoryRequest(String name, String type, String description, double price, UUID companyId, UUID categoryId, boolean isShowForClient) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.companyId = companyId;
        this.categoryId = categoryId;
        this.isShowForClient = isShowForClient;
    }

    public AddProductToCategoryRequest(String name, String type, String description, double price, UUID companyId, UUID categoryId, boolean isShowForClient, int posterId) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.companyId = companyId;
        this.categoryId = categoryId;
        this.isShowForClient = isShowForClient;
        this.posterId = posterId;
    }

    public int getPosterId() {
        return posterId;
    }

    public void setPosterId(int posterId) {
        this.posterId = posterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }

    public boolean isShowForClient() {
        return isShowForClient;
    }

    public void setShowForClient(boolean showForClient) {
        isShowForClient = showForClient;
    }
}
