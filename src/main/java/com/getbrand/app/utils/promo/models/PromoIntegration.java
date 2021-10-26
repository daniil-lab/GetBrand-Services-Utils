package com.getbrand.app.utils.promo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class PromoIntegration {
    @Id
    private UUID id;

    private UUID companyId;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "promo_integration")
    @ElementCollection(fetch = FetchType.EAGER)
    private List<Promo> promos;

    public PromoIntegration() {};

    public PromoIntegration(UUID companyId) {
        this.id = UUID.randomUUID();
        this.companyId = companyId;
        this.promos = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public List<Promo> getPromos() {
        return promos;
    }

    public void addPromoToIntegration(Promo promo) {
        this.promos.add(promo);
    }

    public void removePromoFromIntegration(Promo promo) {
        this.promos.remove(promo);
    }

    public void cleanPromos() { this.promos = new ArrayList<>(); };

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }
}
