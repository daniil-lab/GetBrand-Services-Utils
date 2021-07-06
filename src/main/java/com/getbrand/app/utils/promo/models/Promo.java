package com.getbrand.app.utils.promo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Promo {
    @Id
    private UUID id;

    private String name;

    private String description;

    private int posterId;

    private String type;

    private float percent;

    private float summ;

    private String timeSpending;

    private boolean isAllow;

    private boolean isBanner;

    private boolean showOnMainScreen;

    public Promo() {};

    public Promo(String name,
                 String description,
                 String type,
                 float percent,
                 float summ,
                 String timeSpending,
                 int posterId) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.type = type;
        this.percent = percent;
        this.summ = summ;
        this.timeSpending = timeSpending;
        this.posterId = posterId;
    }

    public int getPosterId() {
        return posterId;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public float getPercent() {
        return percent;
    }

    public float getSumm() {
        return summ;
    }

    public String getTimeSpending() {
        return timeSpending;
    }

    public boolean isAllow() {
        return isAllow;
    }

    public boolean isBanner() {
        return isBanner;
    }

    public boolean isShowOnMainScreen() {
        return showOnMainScreen;
    }

    public void setAllow(boolean allow) {
        isAllow = allow;
    }

    public void setBanner(boolean banner) {
        isBanner = banner;
    }

    public void setShowOnMainScreen(boolean showOnMainScreen) {
        this.showOnMainScreen = showOnMainScreen;
    }
}
