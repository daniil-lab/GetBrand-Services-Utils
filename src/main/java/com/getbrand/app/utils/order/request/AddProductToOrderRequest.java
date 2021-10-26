package com.getbrand.app.utils.order.request;

import java.util.List;
import java.util.UUID;

public class AddProductToOrderRequest {

    private UUID productId;

    private int count;

    private List<String> components;

    private List<String> modificators;

    public AddProductToOrderRequest() {};

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public List<String> getModificators() {
        return modificators;
    }

    public void setModificators(List<String> modificators) {
        this.modificators = modificators;
    }
}
