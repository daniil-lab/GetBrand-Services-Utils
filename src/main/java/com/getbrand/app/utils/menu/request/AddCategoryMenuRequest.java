package com.getbrand.app.utils.menu.request;

public class AddCategoryMenuRequest {
    private String categoryName;

    public AddCategoryMenuRequest() {};

    public AddCategoryMenuRequest(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
