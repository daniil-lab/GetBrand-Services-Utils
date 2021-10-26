package com.getbrand.app.utils.poster.server.poster.request.workshop;

public class CreatePosterWorkshopPosterRequest {
    private String workshop_name;

    public CreatePosterWorkshopPosterRequest() {};

    public CreatePosterWorkshopPosterRequest(String workshop_name) {
        this.workshop_name = workshop_name;
    }

    public String getWorkshop_name() {
        return workshop_name;
    }

    public void setWorkshop_name(String workshop_name) {
        this.workshop_name = workshop_name;
    }
}
