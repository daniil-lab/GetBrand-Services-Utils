package com.getbrand.app.utils.menu.models.product;

import com.getbrand.app.utils.company.models.Company;
import com.getbrand.app.utils.menu.models.MenuProduct;
import com.getbrand.app.utils.menu.models.modificators.PosterMenuProductModificator;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class PosterMenuProduct extends MenuProduct {
    private int posterId = -1;

    private PosterMenuProductModificator modificators;

    public PosterMenuProduct() {};

    public PosterMenuProduct(String name, String type, String description, double price, boolean isShowForClient, UUID categoryId, Company company, int posterId) {
        super(name, type, description, price, isShowForClient, categoryId, company);
        this.posterId = posterId;
    }

    public int getPosterId() {
        return posterId;
    }

    public void setPosterId(int posterId) {
        this.posterId = posterId;
    }
}
