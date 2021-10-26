package com.getbrand.app.utils.order.models;

import com.getbrand.app.utils.menu.models.MenuProduct;
import com.getbrand.app.utils.menu.models.MenuProductModificator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class OrderProduct {
    @Id
    private UUID id;

    private String name;

    private int count;

    private double price;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product")
    private MenuProduct product;

    private String[] components;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "order_prod_modif",
            joinColumns = @JoinColumn(name = "prod_id"),
            inverseJoinColumns = @JoinColumn(name = "mod_id")
    )
    private List<MenuProductModificator> modificators;

    public OrderProduct() {};

    public OrderProduct(String name, int count, double price, MenuProduct product) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.product = product;
        this.id = UUID.randomUUID();
    }

    public void addModificator(MenuProductModificator menuProductModificator) {
        this.modificators.add(menuProductModificator);
    }

    public void removeModificator(int idx) {
        this.modificators.remove(idx);
    }

    public void removeModificator(MenuProductModificator menuProductModificator) {
        this.modificators.remove(menuProductModificator);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MenuProduct getProduct() {
        return product;
    }

    public void setProduct(MenuProduct product) {
        this.product = product;
    }

    public String[] getComponents() {
        return components;
    }

    public void setComponents(String[] components) {
        this.components = components;
    }

    public List<MenuProductModificator> getModificators() {
        return modificators;
    }

    public void setModificators(List<MenuProductModificator> modificators) {
        this.modificators = modificators;
    }
}
