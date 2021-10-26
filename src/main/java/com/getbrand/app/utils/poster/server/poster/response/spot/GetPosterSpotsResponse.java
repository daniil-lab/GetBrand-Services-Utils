package com.getbrand.app.utils.poster.server.poster.response.spot;

public class GetPosterSpotsResponse {
    private int spot_id;

    private String spot_name;

    private String spot_adress;

    public GetPosterSpotsResponse() {};

    public GetPosterSpotsResponse(int spot_id, String spot_name, String spot_adress) {
        this.spot_id = spot_id;
        this.spot_name = spot_name;
        this.spot_adress = spot_adress;
    }

    public int getSpot_id() {
        return spot_id;
    }

    public void setSpot_id(int spot_id) {
        this.spot_id = spot_id;
    }

    public String getSpot_name() {
        return spot_name;
    }

    public void setSpot_name(String spot_name) {
        this.spot_name = spot_name;
    }

    public String getSpot_adress() {
        return spot_adress;
    }

    public void setSpot_adress(String spot_adress) {
        this.spot_adress = spot_adress;
    }
}
