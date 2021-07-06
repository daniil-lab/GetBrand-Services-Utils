package com.getbrand.app.utils.poster.server.poster.response.menu;

public class PosterMenuCategoryResponse {
    private int type;

    private String photo;

    private int menu_category_id;

    private int product_id;

    private float cost;

    private String product_name;

    public PosterMenuCategoryResponse() {};

    public float getCost() {
        return cost;
    }

    public int getType() {
        return type;
    }

    public String getPhoto() {
        return photo;
    }

    public int getMenu_category_id() {
        return menu_category_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }
}
