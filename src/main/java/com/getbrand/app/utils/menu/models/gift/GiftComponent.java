package com.getbrand.app.utils.menu.models.gift;

import com.getbrand.app.utils.menu.models.MenuProduct;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class GiftComponent {
    @Id
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "product_id")
    private MenuProduct product;

    public GiftComponent() {};

    public GiftComponent(MenuProduct product) {
        this.id = UUID.randomUUID();
        this.product = product;
    }

    public UUID getId() {
        return id;
    }

    public MenuProduct getProduct() {
        return product;
    }

    public void setProduct(MenuProduct product) {
        this.product = product;
    }
}
