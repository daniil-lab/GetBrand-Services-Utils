package com.getbrand.app.utils.order.models.poster;

import com.getbrand.app.utils.company.models.Company;
import com.getbrand.app.utils.order.models.Equipment;

import javax.persistence.Entity;

@Entity
public class PosterEquipment extends Equipment {
    private int poster_id;

    public PosterEquipment() {};

    public PosterEquipment(String name, String description, int volume, String inventoryCode, int minReserv, Company company, int poster_id) {
        super(name, description, volume, inventoryCode, minReserv, company);
        this.poster_id = poster_id;
    }

    public int getPoster_id() {
        return poster_id;
    }

    public void setPoster_id(int poster_id) {
        this.poster_id = poster_id;
    }
}
