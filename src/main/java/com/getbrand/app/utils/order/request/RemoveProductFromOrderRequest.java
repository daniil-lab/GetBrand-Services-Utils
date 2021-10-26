package com.getbrand.app.utils.order.request;

import java.util.List;
import java.util.UUID;

public class RemoveProductFromOrderRequest {

    private List<UUID> orderProductIds;

    public RemoveProductFromOrderRequest() {};

    public RemoveProductFromOrderRequest(List<UUID> orderProductIds) {
        this.orderProductIds = orderProductIds;
    }

    public List<UUID> getOrderProductIds() {
        return orderProductIds;
    }

    public void setOrderProductIds(List<UUID> orderProductIds) {
        this.orderProductIds = orderProductIds;
    }
}
