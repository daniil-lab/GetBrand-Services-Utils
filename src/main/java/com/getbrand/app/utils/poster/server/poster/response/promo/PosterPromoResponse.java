package com.getbrand.app.utils.poster.server.poster.response.promo;

public class PosterPromoResponse {
    private int promotion_id;

    private String name;

    private String date_start;

    private String date_end;

    private PosterPromoParamsResponse params;

    public PosterPromoResponse() {};

    public String getName() {
        return name;
    }

    public int getPromotion_id() {
        return promotion_id;
    }

    public PosterPromoParamsResponse getParams() {
        return params;
    }

    public String getDate_start() {
        return date_start;
    }

    public String getDate_end() {
        return date_end;
    }
}
