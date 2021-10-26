package com.getbrand.app.utils.poster.request;

import java.util.UUID;

public class RemovePosterMenuCategoryRequest {
    private UUID companyId;

    private int categoryId;

    public RemovePosterMenuCategoryRequest() {};

    public RemovePosterMenuCategoryRequest(UUID companyId, int categoryId) {
        this.companyId = companyId;
        this.categoryId = categoryId;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
