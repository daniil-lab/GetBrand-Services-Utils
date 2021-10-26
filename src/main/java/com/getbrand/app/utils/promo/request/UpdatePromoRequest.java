package com.getbrand.app.utils.promo.request;

import java.util.UUID;

public class UpdatePromoRequest {
    private String name;

    private String description;

    private String type;

    private int percent = -1;

    private double summ = -1;

    private UUID companyId;

    private String timeSpending;

    public UpdatePromoRequest() {};
}
