package com.getbrand.app.utils.company.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class CompanyConfig {
    @Id
    private UUID id;

    private int currentOrderNumber;

    private int defOfPay;

    private boolean isAdvertShow;

    private int lotteryAddValue;

    private int lotterySubValue;

    private int lotteryOrderSumLimit;

    private boolean isLotteryOnOrderChangeStateAllow;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "company_id")
    private Company company;

    public CompanyConfig() {};

    public CompanyConfig(int currentOrderNumber, int defOfPay, boolean isAdvertShow, int lotteryAddValue, int lotterySubValue, int lotteryOrderSumLimit, boolean isLotteryOnOrderChangeStateAllow) {
        this.currentOrderNumber = currentOrderNumber;
        this.defOfPay = defOfPay;
        this.isAdvertShow = isAdvertShow;
        this.lotteryAddValue = lotteryAddValue;
        this.lotterySubValue = lotterySubValue;
        this.lotteryOrderSumLimit = lotteryOrderSumLimit;
        this.isLotteryOnOrderChangeStateAllow = isLotteryOnOrderChangeStateAllow;
        this.id = UUID.randomUUID();
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCurrentOrderNumber(int currentOrderNumber) {
        this.currentOrderNumber = currentOrderNumber;
    }

    public void setDefOfPay(int defOfPay) {
        this.defOfPay = defOfPay;
    }

    public void setAdvertShow(boolean advertShow) {
        isAdvertShow = advertShow;
    }

    public void setLotteryAddValue(int lotteryAddValue) {
        this.lotteryAddValue = lotteryAddValue;
    }

    public void setLotterySubValue(int lotterySubValue) {
        this.lotterySubValue = lotterySubValue;
    }

    public void setLotteryOrderSumLimit(int lotteryOrderSumLimit) {
        this.lotteryOrderSumLimit = lotteryOrderSumLimit;
    }

    public void setLotteryOnOrderChangeStateAllow(boolean lotteryOnOrderChangeStateAllow) {
        isLotteryOnOrderChangeStateAllow = lotteryOnOrderChangeStateAllow;
    }

    public UUID getId() {
        return id;
    }

    public int getCurrentOrderNumber() {
        return currentOrderNumber;
    }

    public int getDefOfPay() {
        return defOfPay;
    }

    public boolean isAdvertShow() {
        return isAdvertShow;
    }

    public int getLotteryAddValue() {
        return lotteryAddValue;
    }

    public int getLotterySubValue() {
        return lotterySubValue;
    }

    public int getLotteryOrderSumLimit() {
        return lotteryOrderSumLimit;
    }

    public boolean isLotteryOnOrderChangeStateAllow() {
        return isLotteryOnOrderChangeStateAllow;
    }
}
