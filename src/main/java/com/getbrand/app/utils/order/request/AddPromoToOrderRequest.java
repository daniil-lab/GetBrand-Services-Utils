package com.getbrand.app.utils.order.request;

public class AddPromoToOrderRequest {
    private String promoId;

    public AddPromoToOrderRequest() {};

    public AddPromoToOrderRequest(String promoId) {
        this.promoId = promoId;
    }

    public String getPromoId() {
        return promoId;
    }

    public void setPromoId(String promoId) {
        this.promoId = promoId;
    }
}
