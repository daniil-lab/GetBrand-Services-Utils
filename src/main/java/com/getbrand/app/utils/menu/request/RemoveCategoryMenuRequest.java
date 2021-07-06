package com.getbrand.app.utils.menu.request;

public class RemoveCategoryMenuRequest {
    private String categoryName;

    public RemoveCategoryMenuRequest() {};

    public RemoveCategoryMenuRequest(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
