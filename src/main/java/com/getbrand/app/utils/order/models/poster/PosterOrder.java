package com.getbrand.app.utils.order.models.poster;

import com.getbrand.app.utils.company.models.Company;
import com.getbrand.app.utils.order.models.Order;
import com.getbrand.app.utils.user.models.User;

import javax.persistence.Entity;

@Entity
public class PosterOrder extends Order {
    private int poster_id;

    public PosterOrder() {}

    public PosterOrder(String orderNumber, String executeStart, String executeEnd, String type, String address, String employeeComment, String customerComment, int volume, Company company, User user, User manager, int poster_id) {
        super(orderNumber, executeStart, executeEnd, type, address, employeeComment, customerComment, volume, company, user, manager);
        this.poster_id = poster_id;
    }

    public int getPoster_id() {
        return poster_id;
    }

    public void setPoster_id(int poster_id) {
        this.poster_id = poster_id;
    }
}
