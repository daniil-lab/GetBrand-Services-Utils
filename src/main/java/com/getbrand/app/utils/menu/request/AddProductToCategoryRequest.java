package com.getbrand.app.utils.menu.request;

import com.getbrand.app.utils.models.File;

import java.util.List;

public class AddProductToCategoryRequest {
    private String categoryId;
    private List<File> files;
    private String productName;
    private String productDescription;
    private int productPrice;
    private String productType;
    private boolean isShowForClient;
    private int posterId;

    public AddProductToCategoryRequest() {};

    public AddProductToCategoryRequest(String categoryId, String productName, String productDescription, int productPrice, int posterId) {
        this.categoryId = categoryId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.posterId = posterId;
    }

    public AddProductToCategoryRequest(String categoryId, String productName, int productPrice, int posterId) {
        this.categoryId = categoryId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.posterId = posterId;
    }

    public AddProductToCategoryRequest(String categoryId, List<File> files, String productName, String productDescription, int productPrice, String productType, int posterId) {
        this.categoryId = categoryId;
        this.files = files;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productType = productType;
        this.posterId = posterId;
    }

    public AddProductToCategoryRequest(String categoryId, String productName, String productDescription, int productPrice, String productType, int posterId) {
        this.categoryId = categoryId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productType = productType;
        this.posterId = posterId;
    }

    public AddProductToCategoryRequest(String categoryId, List<File> files, String productName, String productDescription, int productPrice, String productType, boolean isShowForClient, int posterId) {
        this.categoryId = categoryId;
        this.files = files;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productType = productType;
        this.isShowForClient = isShowForClient;
        this.posterId = posterId;
    }

    public int getPosterId() {
        return posterId;
    }

    public boolean isShowForClient() {
        return isShowForClient;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
