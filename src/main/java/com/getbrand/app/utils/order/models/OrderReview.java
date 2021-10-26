package com.getbrand.app.utils.order.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class OrderReview {
    @Id
    private UUID id;

    private int rating;

    private String comment;

    public OrderReview() {};

    public OrderReview(int rating, String comment) {
        this.id = UUID.randomUUID();
        this.rating = rating;
        this.comment = comment;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public UUID getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}
