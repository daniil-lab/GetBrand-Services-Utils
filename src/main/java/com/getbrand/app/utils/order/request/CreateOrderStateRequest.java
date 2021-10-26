package com.getbrand.app.utils.order.request;

public class CreateOrderStateRequest {
    private String name;

    private String from;

    private String to;

    private boolean isChangeAllow;

    private boolean isDeleteAllow;

    private boolean auto;

    public CreateOrderStateRequest() {};

    public CreateOrderStateRequest(String name, String from, String to, boolean isChangeAllow, boolean isDeleteAllow, boolean auto) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.isChangeAllow = isChangeAllow;
        this.isDeleteAllow = isDeleteAllow;
        this.auto = auto;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public boolean isChangeAllow() {
        return isChangeAllow;
    }

    public void setChangeAllow(boolean changeAllow) {
        isChangeAllow = changeAllow;
    }

    public boolean isDeleteAllow() {
        return isDeleteAllow;
    }

    public void setDeleteAllow(boolean deleteAllow) {
        isDeleteAllow = deleteAllow;
    }
}
