package com.getbrand.app.utils.menu.models.category;

import com.getbrand.app.utils.company.models.Company;
import com.getbrand.app.utils.menu.models.MenuCategory;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class PosterMenuCategory extends MenuCategory {
    private int posterId = -1;

    public PosterMenuCategory() {};

    public PosterMenuCategory(String name, String description, boolean isShowForClient, Company company, int posterId) {
        super(name, description, isShowForClient, company);
        this.posterId = posterId;
    }

    public int getPosterId() {
        return posterId;
    }

    public void setPosterId(int posterId) {
        this.posterId = posterId;
    }
}
