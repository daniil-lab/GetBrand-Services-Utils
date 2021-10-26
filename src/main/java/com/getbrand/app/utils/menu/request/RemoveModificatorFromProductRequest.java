package com.getbrand.app.utils.menu.request;

import java.util.List;

public class RemoveModificatorFromProductRequest {
    private List<String> modificatorIds;

    public RemoveModificatorFromProductRequest() {};

    public RemoveModificatorFromProductRequest(List<String> modificatorIds) {
        this.modificatorIds = modificatorIds;
    }

    public List<String> getModificatorIds() {
        return modificatorIds;
    }

    public void setModificatorIds(List<String> modificatorIds) {
        this.modificatorIds = modificatorIds;
    }
}
