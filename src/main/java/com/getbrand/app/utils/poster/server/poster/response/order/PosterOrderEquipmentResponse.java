package com.getbrand.app.utils.poster.server.poster.response.order;

public class PosterOrderEquipmentResponse {
    private int table_id;

    private int table_num;

    private int table_capacity;

    private int spot_id;

    private int hall_id;

    public PosterOrderEquipmentResponse() {};

    public int getTable_num() {
        return table_num;
    }

    public void setTable_num(int table_num) {
        this.table_num = table_num;
    }

    public int getTable_capacity() {
        return table_capacity;
    }

    public void setTable_capacity(int table_capacity) {
        this.table_capacity = table_capacity;
    }

    public int getSpot_id() {
        return spot_id;
    }

    public void setSpot_id(int spot_id) {
        this.spot_id = spot_id;
    }

    public int getHall_id() {
        return hall_id;
    }

    public void setHall_id(int hall_id) {
        this.hall_id = hall_id;
    }

    public int getTable_id() {
        return table_id;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }
}
