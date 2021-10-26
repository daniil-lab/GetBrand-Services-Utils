package com.getbrand.app.utils.menu.models.category;

import com.getbrand.app.utils.company.models.Company;
import com.getbrand.app.utils.menu.models.MenuCategory;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class GetBrandMenuCategory extends MenuCategory {
    public GetBrandMenuCategory() {};

    public GetBrandMenuCategory(String name, String description, boolean isShowForClient, Company company) {
        super(name, description, isShowForClient, company);
    }
}
