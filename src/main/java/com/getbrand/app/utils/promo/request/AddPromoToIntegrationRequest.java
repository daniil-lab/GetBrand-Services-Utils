package com.getbrand.app.utils.promo.request;

public class AddPromoToIntegrationRequest {

    private String name;

    private String description;

    private float summ;

    private int posterId;

    private float percent;

    private String type;

    private String timeSpending;

    private boolean isAllow;

    private boolean isBanner;

    private boolean showOnMainScreen;

    public AddPromoToIntegrationRequest() {};

    public AddPromoToIntegrationRequest(String name, String description, float summ, float percent, String type, String timeSpending, int posterId) {
        this.name = name;
        this.description = description;
        this.summ = summ;
        this.percent = percent;
        this.type = type;
        this.timeSpending = timeSpending;
        this.posterId = posterId;
    }

    public AddPromoToIntegrationRequest(String name, String description, float summ, float percent, String type, String timeSpending, boolean isAllow, boolean isBanner, boolean showOnMainScreen, int posterId) {
        this.name = name;
        this.description = description;
        this.summ = summ;
        this.percent = percent;
        this.type = type;
        this.timeSpending = timeSpending;
        this.isAllow = isAllow;
        this.isBanner = isBanner;
        this.showOnMainScreen = showOnMainScreen;
        this.posterId = posterId;
    }

    public int getPosterId() {
        return posterId;
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

    public float getSumm() {
        return summ;
    }

    public void setSumm(float summ) {
        this.summ = summ;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTimeSpending() {
        return timeSpending;
    }

    public void setTimeSpending(String timeSpending) {
        this.timeSpending = timeSpending;
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
