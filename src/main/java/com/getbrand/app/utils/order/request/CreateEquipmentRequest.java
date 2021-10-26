package com.getbrand.app.utils.order.request;

import java.util.UUID;

public class CreateEquipmentRequest {
    private String name;

    private String description;

    private int volume = -1;

    private String inventoryCode;

    private int minReserv = -1;

    private int poster_id = -1;

    private UUID companyId;

    public CreateEquipmentRequest(String name, String description, int volume, String inventoryCode, int minReserv, UUID companyId) {
        this.name = name;
        this.description = description;
        this.volume = volume;
        this.inventoryCode = inventoryCode;
        this.minReserv = minReserv;
        this.companyId = companyId;
    }

    public CreateEquipmentRequest(String name, String description, int volume, String inventoryCode, int minReserv, UUID companyId, int poster_id) {
        this.name = name;
        this.description = description;
        this.volume = volume;
        this.inventoryCode = inventoryCode;
        this.minReserv = minReserv;
        this.poster_id = poster_id;
        this.companyId = companyId;
    }

    public CreateEquipmentRequest() {};

    public int getPoster_id() {
        return poster_id;
    }

    public void setPoster_id(int poster_id) {
        this.poster_id = poster_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getInventoryCode() {
        return inventoryCode;
    }

    public void setInventoryCode(String inventoryCode) {
        this.inventoryCode = inventoryCode;
    }

    public int getMinReserv() {
        return minReserv;
    }

    public void setMinReserv(int minReserv) {
        this.minReserv = minReserv;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }
}
