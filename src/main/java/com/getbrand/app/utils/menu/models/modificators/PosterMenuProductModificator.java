package com.getbrand.app.utils.menu.models.modificators;

import com.getbrand.app.utils.menu.models.MenuProductModificator;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class PosterMenuProductModificator extends MenuProductModificator {
    private int posterId = -1;

    public PosterMenuProductModificator() {};

    public PosterMenuProductModificator(String name, String group, String description, double price, int posterId) {
        super(name, group, description, price);
        this.posterId = posterId;
    }

    public int getPosterId() {
        return posterId;
    }

    public void setPosterId(int posterId) {
        this.posterId = posterId;
    }
}
