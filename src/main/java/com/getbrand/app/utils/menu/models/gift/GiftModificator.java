package com.getbrand.app.utils.menu.models.gift;

import com.getbrand.app.utils.menu.models.MenuProductModificator;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class GiftModificator {
    @Id
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "modificator_id")
    private MenuProductModificator productModificator;

    public GiftModificator() {};

    public GiftModificator(MenuProductModificator productModificator) {
        this.id = UUID.randomUUID();
        this.productModificator = productModificator;
    }

    public UUID getId() {
        return id;
    }

    public MenuProductModificator getProductModificator() {
        return productModificator;
    }

    public void setProductModificator(MenuProductModificator productModificator) {
        this.productModificator = productModificator;
    }
}
