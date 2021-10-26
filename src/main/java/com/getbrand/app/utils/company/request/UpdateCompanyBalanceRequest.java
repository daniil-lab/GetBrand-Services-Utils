package com.getbrand.app.utils.company.request;

public class UpdateCompanyBalanceRequest {
    private double balance;

    private String operation;

    public UpdateCompanyBalanceRequest() {};

    public UpdateCompanyBalanceRequest(double balance, String operation) {
        this.balance = balance;
        this.operation = operation;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
