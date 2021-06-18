package com.getbrand.app.utils.poster.server.poster.response.menu;

public class PosterMenuResponse {
    private int category_id;
    private String category_name;
    private String category_photo;
    private int category_hidden;

    public PosterMenuResponse() {
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_photo() {
        return category_photo;
    }

    public int getCategory_hidden() {
        return category_hidden;
    }

    public void setCategory_hidden(int category_hidden) {
        this.category_hidden = category_hidden;
    }
}
