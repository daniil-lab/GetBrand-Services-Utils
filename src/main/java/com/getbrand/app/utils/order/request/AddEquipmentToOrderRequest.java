package com.getbrand.app.utils.order.request;

import java.util.List;

public class AddEquipmentToOrderRequest {
    private List<String> equipmentIds;

    public AddEquipmentToOrderRequest() {};

    public AddEquipmentToOrderRequest(List<String> equipmentIds) {
        this.equipmentIds = equipmentIds;
    }

    public List<String> getEquipmentIds() {
        return equipmentIds;
    }

    public void setEquipmentIds(List<String> equipmentIds) {
        this.equipmentIds = equipmentIds;
    }
}
