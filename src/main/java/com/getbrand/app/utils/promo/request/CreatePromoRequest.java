package com.getbrand.app.utils.promo.request;

import java.util.UUID;

public class CreatePromoRequest {
    private String name;

    private String description;

    private String type;

    private double percent = -1;

    private double summ = -1;

    private String timeSpending;

    private UUID companyId;

    private boolean isAllow;

    private boolean isBanner;

    private boolean showOnMainScreen;

    private int posterId = -1;

    public CreatePromoRequest() {};

    public CreatePromoRequest(String name, String description, String type, double percent, double summ, String timeSpending, UUID companyId, boolean isAllow, boolean isBanner, boolean showOnMainScreen) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.percent = percent;
        this.summ = summ;
        this.timeSpending = timeSpending;
        this.companyId = companyId;
        this.isAllow = isAllow;
        this.isBanner = isBanner;
        this.showOnMainScreen = showOnMainScreen;
    }

    public CreatePromoRequest(String name, String description, String type, double percent, double summ, String timeSpending, UUID companyId, boolean isAllow, boolean isBanner, boolean showOnMainScreen, int posterId) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.percent = percent;
        this.summ = summ;
        this.timeSpending = timeSpending;
        this.companyId = companyId;
        this.isAllow = isAllow;
        this.isBanner = isBanner;
        this.showOnMainScreen = showOnMainScreen;
        this.posterId = posterId;
    }

    public int getPosterId() {
        return posterId;
    }

    public void setPosterId(int posterId) {
        this.posterId = posterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getSumm() {
        return summ;
    }

    public void setSumm(double summ) {
        this.summ = summ;
    }

    public String getTimeSpending() {
        return timeSpending;
    }

    public void setTimeSpending(String timeSpending) {
        this.timeSpending = timeSpending;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public boolean isAllow() {
        return isAllow;
    }

    public void setAllow(boolean allow) {
        isAllow = allow;
    }

    public boolean isBanner() {
        return isBanner;
    }

    public void setBanner(boolean banner) {
        isBanner = banner;
    }

    public boolean isShowOnMainScreen() {
        return showOnMainScreen;
    }

    public void setShowOnMainScreen(boolean showOnMainScreen) {
        this.showOnMainScreen = showOnMainScreen;
    }
}
