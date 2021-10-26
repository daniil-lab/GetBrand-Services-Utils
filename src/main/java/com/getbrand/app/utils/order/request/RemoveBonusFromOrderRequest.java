package com.getbrand.app.utils.order.request;

import java.util.List;
import java.util.UUID;

public class RemoveBonusFromOrderRequest {
    private List<UUID> bonusIds;

    public RemoveBonusFromOrderRequest() {};

    public List<UUID> getBonusIds() {
        return bonusIds;
    }

    public void setBonusIds(List<UUID> bonusIds) {
        this.bonusIds = bonusIds;
    }
}
