package com.getbrand.app.utils.company.request;

public class CreateCompanyPaymentBonusRequest {

    private int dayCount;

    private int percent;

    public CreateCompanyPaymentBonusRequest() {};

    public CreateCompanyPaymentBonusRequest(int dayCount, int percent) {
        this.dayCount = dayCount;
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getDayCount() {
        return dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }
}
