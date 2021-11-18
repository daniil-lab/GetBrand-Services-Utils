package com.getbrand.app.utils.order.request;

import java.util.List;
import java.util.UUID;

public class AddEquipmentToOrderRequest {
    private List<UUID> equipmentIds;

    public AddEquipmentToOrderRequest() {};

    public AddEquipmentToOrderRequest(List<UUID> equipmentIds) {
        this.equipmentIds = equipmentIds;
    }

    public List<UUID> getEquipmentIds() {
        return equipmentIds;
    }

    public void setEquipmentIds(List<UUID> equipmentIds) {
        this.equipmentIds = equipmentIds;
    }
}
