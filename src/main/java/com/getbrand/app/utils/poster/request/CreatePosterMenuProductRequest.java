package com.getbrand.app.utils.poster.request;

import java.util.UUID;

public class CreatePosterMenuProductRequest {
    private String productName;

    private double productPrice;

    private int posterCategoryId;

    private UUID companyId;

    private boolean isShowForClient;

    public CreatePosterMenuProductRequest() {};

    public CreatePosterMenuProductRequest(String productName, double productPrice, int posterCategoryId, UUID companyId, boolean isShowForClient) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.posterCategoryId = posterCategoryId;
        this.companyId = companyId;
        this.isShowForClient = isShowForClient;
    }

    public boolean isShowForClient() {
        return isShowForClient;
    }

    public void setShowForClient(boolean showForClient) {
        isShowForClient = showForClient;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getPosterCategoryId() {
        return posterCategoryId;
    }

    public void setPosterCategoryId(int posterCategoryId) {
        this.posterCategoryId = posterCategoryId;
    }
}
