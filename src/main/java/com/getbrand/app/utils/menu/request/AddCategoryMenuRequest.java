package com.getbrand.app.utils.menu.request;

import java.util.UUID;

public class AddCategoryMenuRequest {
    private String name;

    private String description;

    private UUID companyId;

    private boolean isShowForClient;

    private int posterId = -1;

    public AddCategoryMenuRequest() {};

    public AddCategoryMenuRequest(String name, String description, UUID companyId, boolean isShowForClient) {
        this.name = name;
        this.description = description;
        this.companyId = companyId;
        this.isShowForClient = isShowForClient;
    }

    public AddCategoryMenuRequest(String name, String description, UUID companyId, boolean isShowForClient, int posterId) {
        this.name = name;
        this.description = description;
        this.companyId = companyId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public boolean isShowForClient() {
        return isShowForClient;
    }

    public void setShowForClient(boolean showForClient) {
        isShowForClient = showForClient;
    }
}
