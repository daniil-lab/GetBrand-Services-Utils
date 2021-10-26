package com.getbrand.app.utils.poster.server.poster.response.promo;

import java.util.List;

public class PosterPromoParamsResponse {
    private List<String> week_days;

    private List<PosterPromoParamsPeriod> periods;

    private int result_type;

    private int bonus_products_condition_type;

    private float bonus_products_condition_value;

    private double discount_value;

    public PosterPromoParamsResponse() {};

    public float getBonus_products_condition_value() {
        return bonus_products_condition_value;
    }

    public int getResult_type() {
        return result_type;
    }

    public int getBonus_products_condition_type() {
        return bonus_products_condition_type;
    }

    public List<String> getWeek_days() {
        return week_days;
    }

    public List<PosterPromoParamsPeriod> getPeriods() {
        return periods;
    }

    public void setWeek_days(List<String> week_days) {
        this.week_days = week_days;
    }

    public void setPeriods(List<PosterPromoParamsPeriod> periods) {
        this.periods = periods;
    }

    public void setResult_type(int result_type) {
        this.result_type = result_type;
    }

    public void setBonus_products_condition_type(int bonus_products_condition_type) {
        this.bonus_products_condition_type = bonus_products_condition_type;
    }

    public void setBonus_products_condition_value(float bonus_products_condition_value) {
        this.bonus_products_condition_value = bonus_products_condition_value;
    }

    public double getDiscount_value() {
        return discount_value;
    }

    public void setDiscount_value(double discount_value) {
        this.discount_value = discount_value;
    }
}
