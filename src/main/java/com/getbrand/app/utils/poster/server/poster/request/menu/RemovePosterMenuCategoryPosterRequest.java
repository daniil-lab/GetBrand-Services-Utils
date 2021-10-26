package com.getbrand.app.utils.poster.server.poster.request.menu;

public class RemovePosterMenuCategoryPosterRequest {
    private int category_id;

    public RemovePosterMenuCategoryPosterRequest() {};

    public RemovePosterMenuCategoryPosterRequest(int category_id) {
        this.category_id = category_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}
