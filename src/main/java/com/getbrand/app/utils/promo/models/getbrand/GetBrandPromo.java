package com.getbrand.app.utils.promo.models.getbrand;

import com.getbrand.app.utils.promo.models.Promo;

import javax.persistence.Entity;

@Entity
public class GetBrandPromo extends Promo {
    public GetBrandPromo() {};

    public GetBrandPromo(String name, String description, String type, double percent, double summ, String timeSpending) {
        super(name, description, type, percent, summ, timeSpending);
    }
}
