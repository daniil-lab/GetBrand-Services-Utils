package com.getbrand.app.utils.order.request;

import java.util.UUID;

public class CreateOrderRequest {
    private String executeStart;

    private String executeEnd;

    private String type;

    private int volume;

    private String stateName;

    private String includeLoyalityTypes;

    private String address;

    private UUID companyId;

    private UUID userId;

    private UUID managerId;

    private String customerComment;

    private String employeeComment;

    private UUID companyAddressId;

    public CreateOrderRequest() {};

    public CreateOrderRequest(String executeStart, String executeEnd, String type, int volume, String stateName, String includeLoyalityTypes, String address, UUID companyId, UUID userId, UUID managerId, String customerComment, String employeeComment, UUID companyAddressId) {
        this.executeStart = executeStart;
        this.executeEnd = executeEnd;
        this.type = type;
        this.volume = volume;
        this.stateName = stateName;
        this.includeLoyalityTypes = includeLoyalityTypes;
        this.address = address;
        this.companyId = companyId;
        this.userId = userId;
        this.managerId = managerId;
        this.customerComment = customerComment;
        this.employeeComment = employeeComment;
        this.companyAddressId = companyAddressId;
    }

    public String getExecuteStart() {
        return executeStart;
    }

    public void setExecuteStart(String executeStart) {
        this.executeStart = executeStart;
    }

    public String getExecuteEnd() {
        return executeEnd;
    }

    public void setExecuteEnd(String executeEnd) {
        this.executeEnd = executeEnd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getIncludeLoyalityTypes() {
        return includeLoyalityTypes;
    }

    public void setIncludeLoyalityTypes(String includeLoyalityTypes) {
        this.includeLoyalityTypes = includeLoyalityTypes;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getManagerId() {
        return managerId;
    }

    public void setManagerId(UUID managerId) {
        this.managerId = managerId;
    }

    public String getCustomerComment() {
        return customerComment;
    }

    public void setCustomerComment(String customerComment) {
        this.customerComment = customerComment;
    }

    public String getEmployeeComment() {
        return employeeComment;
    }

    public void setEmployeeComment(String employeeComment) {
        this.employeeComment = employeeComment;
    }

    public UUID getCompanyAddressId() {
        return companyAddressId;
    }

    public void setCompanyAddressId(UUID companyAddressId) {
        this.companyAddressId = companyAddressId;
    }
}
