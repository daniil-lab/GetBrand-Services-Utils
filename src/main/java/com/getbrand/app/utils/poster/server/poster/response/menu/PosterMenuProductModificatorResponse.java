package com.getbrand.app.utils.poster.server.poster.response.menu;

public class PosterMenuProductModificatorResponse {
    private int modificator_id;

    private String modificator_name;

    private double modificator_selfprice;

    public PosterMenuProductModificatorResponse() {};

    public int getModificator_id() {
        return modificator_id;
    }

    public void setModificator_id(int modificator_id) {
        this.modificator_id = modificator_id;
    }

    public String getModificator_name() {
        return modificator_name;
    }

    public void setModificator_name(String modificator_name) {
        this.modificator_name = modificator_name;
    }

    public double getModificator_selfprice() {
        return modificator_selfprice;
    }

    public void setModificator_selfprice(double modificator_selfprice) {
        this.modificator_selfprice = modificator_selfprice;
    }
}
