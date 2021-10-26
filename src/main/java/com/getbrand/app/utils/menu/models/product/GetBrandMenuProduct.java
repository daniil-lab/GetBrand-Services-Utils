package com.getbrand.app.utils.menu.models.product;

import com.getbrand.app.utils.company.models.Company;
import com.getbrand.app.utils.menu.models.MenuProduct;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class GetBrandMenuProduct extends MenuProduct {
    public GetBrandMenuProduct() {};

    public GetBrandMenuProduct(String name, String type, String description, double price, boolean isShowForClient, UUID categoryId, Company company) {
        super(name, type, description, price, isShowForClient, categoryId, company);
    }
}
