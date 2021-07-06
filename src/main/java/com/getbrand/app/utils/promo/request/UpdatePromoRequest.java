package com.getbrand.app.utils.promo.request;

import com.fasterxml.jackson.annotation.*;
public class UpdatePromoRequest {

    @JsonProperty(required = false)
    private boolean isBanner;

    @JsonProperty(required = false)
    private boolean isAllow;

    @JsonProperty(required = false)
    private boolean setShowOnMainScreen;

    public UpdatePromoRequest() {};

    public boolean isBanner() {
        return isBanner;
    }

    public boolean isAllow() {
        return isAllow;
    }

    public boolean isSetShowOnMainScreen() {
        return setShowOnMainScreen;
    }
}
