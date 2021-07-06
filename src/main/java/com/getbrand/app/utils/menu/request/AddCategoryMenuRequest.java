package com.getbrand.app.utils.menu.request;

public class AddCategoryMenuRequest {
    private String categoryName;
    private String description;
    private boolean isShowForClient;
    private int posterId;

    public AddCategoryMenuRequest() {};

    public AddCategoryMenuRequest(String categoryName, String description, boolean isShowForClient, int posterId) {
        this.categoryName = categoryName;
        this.description = description;
        this.isShowForClient = isShowForClient;
        this.posterId = posterId;
    }

    public int getPosterId() {
        return posterId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getDescription() {
        return description;
    }

    public boolean isShowForClient() {
        return isShowForClient;
    }
}
