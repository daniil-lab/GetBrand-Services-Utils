package com.getbrand.app.utils.poster.server.poster.response.workshop;

public class PosterWorkshop {
    private int workshop_id;

    private String workshop_name;

    private int delete;

    public PosterWorkshop() {};

    public int getWorkshop_id() {
        return workshop_id;
    }

    public void setWorkshop_id(int workshop_id) {
        this.workshop_id = workshop_id;
    }

    public String getWorkshop_name() {
        return workshop_name;
    }

    public void setWorkshop_name(String workshop_name) {
        this.workshop_name = workshop_name;
    }

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }
}
