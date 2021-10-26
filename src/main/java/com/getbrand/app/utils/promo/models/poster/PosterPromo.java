package com.getbrand.app.utils.promo.models.poster;

import com.getbrand.app.utils.promo.models.Promo;

import javax.persistence.Entity;

@Entity
public class PosterPromo extends Promo {
    private int posterId = -1;

    public PosterPromo() {};

    public PosterPromo(String name, String description, String type, double percent, double summ, String timeSpending, int posterId) {
        super(name, description, type, percent, summ, timeSpending);
        this.posterId = posterId;
    }

    public int getPosterId() {
        return posterId;
    }

    public void setPosterId(int posterId) {
        this.posterId = posterId;
    }
}
