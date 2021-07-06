package com.getbrand.app.utils.poster.server.poster.response.promo;

import java.util.List;

public class PosterPromoParamsResponse {
    private List<String> week_days;

    private List<PosterPromoParamsPeriod> periods;

    private int result_type;

    private int bonus_products_condition_type;

    private float bonus_products_condition_value;

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
}
