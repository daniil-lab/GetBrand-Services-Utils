package com.getbrand.app.utils.company.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class CompanyPaymentBonus {
    @Id
    private UUID id;

    private double dayCount;

    private double percent;

    public CompanyPaymentBonus() {};

    public CompanyPaymentBonus(double dayCount, double percent) {
        this.dayCount = dayCount;
        this.percent = percent;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public double getDayCount() {
        return dayCount;
    }

    public void setDayCount(double dayCount) {
        this.dayCount = dayCount;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
