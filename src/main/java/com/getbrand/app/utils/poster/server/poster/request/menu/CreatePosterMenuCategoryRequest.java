package com.getbrand.app.utils.poster.server.poster.request.menu;

import java.util.UUID;

public class CreatePosterMenuCategoryRequest {
    private UUID companyId;

    private String category_name;

    private int parent_category = 0;

    private String category_color = "yellow";

    private int category_hidden;

    private int tax_id;

    public CreatePosterMenuCategoryRequest() {};

    public CreatePosterMenuCategoryRequest(String categoryName, int category_hidden, int tax_id, UUID companyId) {
        this.category_name = categoryName;
        this.category_hidden = category_hidden;
        this.tax_id = tax_id;
        this.companyId = companyId;
    }

    public String getCategoryName() {
        return category_name;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getParent_category() {
        return parent_category;
    }

    public void setParent_category(int parent_category) {
        this.parent_category = parent_category;
    }

    public void setCategoryName(String categoryName) {
        this.category_name = categoryName;
    }

    public int getParentCategory() {
        return parent_category;
    }

    public void setParentCategory(int parentCategory) {
        this.parent_category = parentCategory;
    }

    public String getCategory_color() {
        return category_color;
    }

    public void setCategory_color(String category_color) {
        this.category_color = category_color;
    }

    public int getCategory_hidden() {
        return category_hidden;
    }

    public void setCategory_hidden(int category_hidden) {
        this.category_hidden = category_hidden;
    }

    public int getTax_id() {
        return tax_id;
    }

    public void setTax_id(int tax_id) {
        this.tax_id = tax_id;
    }
}
