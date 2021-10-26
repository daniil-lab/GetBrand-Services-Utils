package com.getbrand.app.utils.poster.server.poster.request.menu;

public class RemovePosterMenuProductPosterRequest {
    private int product_id;

    public RemovePosterMenuProductPosterRequest() {};

    public RemovePosterMenuProductPosterRequest(int product_id) {
        this.product_id = product_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
}
