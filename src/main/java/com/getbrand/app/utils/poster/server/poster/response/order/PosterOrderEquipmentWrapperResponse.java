package com.getbrand.app.utils.poster.server.poster.response.order;

import java.util.List;

public class PosterOrderEquipmentWrapperResponse {
    private List<PosterOrderEquipmentResponse> freeTables;

    public PosterOrderEquipmentWrapperResponse() {};

    public List<PosterOrderEquipmentResponse> getFreeTables() {
        return freeTables;
    }

    public void setFreeTables(List<PosterOrderEquipmentResponse> freeTables) {
        this.freeTables = freeTables;
    }
}
