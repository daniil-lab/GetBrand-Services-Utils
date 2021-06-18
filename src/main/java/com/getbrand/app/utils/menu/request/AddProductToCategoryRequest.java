package com.getbrand.app.utils.menu.request;

import com.getbrand.app.utils.File;

import java.util.List;

public class AddProductToCategoryRequest {
    private String categoryId;
    private List<File> files;
    private String productName;
    private String productDescription;
    private int productPrice;
    private String productType;

    public AddProductToCategoryRequest() {};

    public AddProductToCategoryRequest(String categoryId, String productName, String productDescription, int productPrice) {
        this.categoryId = categoryId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public AddProductToCategoryRequest(String categoryId, String productName, int productPrice) {
        this.categoryId = categoryId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public AddProductToCategoryRequest(String categoryId, List<File> files, String productName, String productDescription, int productPrice, String productType) {
        this.categoryId = categoryId;
        this.files = files;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public AddProductToCategoryRequest(String categoryId, String productName, String productDescription, int productPrice, String productType) {
        this.categoryId = categoryId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productType = productType;
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
