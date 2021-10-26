package com.getbrand.app.utils.company.request;


import java.util.UUID;

public class CreateCompanyPromocodeRequest {

    private String name;

    private String customName;

    private String type;

    private String targetComponent;

    private double count;

    private String expire;

    private boolean isUnlimited;

    private UUID companyId;

    public CreateCompanyPromocodeRequest() {};

    public CreateCompanyPromocodeRequest(String name, String customName, String type, String targetComponent, double count, String expire, boolean isUnlimited, UUID companyId) {
        this.name = name;
        this.customName = customName;
        this.type = type;
        this.targetComponent = targetComponent;
        this.count = count;
        this.expire = expire;
        this.isUnlimited = isUnlimited;
        this.companyId = companyId;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTargetComponent() {
        return targetComponent;
    }

    public void setTargetComponent(String targetComponent) {
        this.targetComponent = targetComponent;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    public boolean isUnlimited() {
        return isUnlimited;
    }

    public void setUnlimited(boolean unlimited) {
        isUnlimited = unlimited;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
