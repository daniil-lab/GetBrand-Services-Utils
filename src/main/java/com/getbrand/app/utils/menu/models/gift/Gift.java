package com.getbrand.app.utils.menu.models.gift;

import com.getbrand.app.utils.company.models.Company;
import com.getbrand.app.utils.company.models.CompanyPromocode;
import com.getbrand.app.utils.menu.models.MenuProduct;
import com.getbrand.app.utils.user.models.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
public class Gift {
    @Id
    private UUID id;

    private int count;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "product_id")
    private MenuProduct product;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "comp_id")
    private Set<GiftComponent> components;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "modif_id")
    private Set<GiftModificator> modificators;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "promocode_id")
    private CompanyPromocode promocode;

    public Gift() {};

    public Gift(int count, MenuProduct product, User user, Company company) {
        this.count = count;
        this.product = product;
        this.user = user;
        this.company = company;
        this.id = UUID.randomUUID();
        this.modificators = new HashSet<>();
        this.components = new HashSet<>();
    }

    public void addModificator(GiftModificator modificator) {
        this.modificators.add(modificator);
    }

    public void removeModificator(GiftModificator modificator) {
        this.modificators.remove(modificator);
    }

    public void addComponent(GiftComponent component) {
        this.components.add(component);
    }

    public void removeComponent(GiftComponent component) {
        this.components.remove(component);
    }

    public UUID getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public MenuProduct getProduct() {
        return product;
    }

    public void setProduct(MenuProduct product) {
        this.product = product;
    }

    public Set<GiftComponent> getComponents() {
        return components;
    }

    public void setComponents(Set<GiftComponent> components) {
        this.components = components;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public CompanyPromocode getPromocode() {
        return promocode;
    }

    public void setPromocode(CompanyPromocode promocode) {
        this.promocode = promocode;
    }

    public Set<GiftModificator> getModificators() {
        return modificators;
    }

    public void setModificators(Set<GiftModificator> modificators) {
        this.modificators = modificators;
    }
}
