package com.getbrand.app.utils.company.request;

public class UpdateCompanyConfigRequest {
    private int currentOrderNumber = -1;

    private int defOfPay = -1;

    private boolean isAdvertShow;

    private boolean isLotteryOnOrderChangeStateAllow;

    private int lotteryAddValue = -1;

    private int lotterySubValue = -1;

    private int lotteryOrderSumLimit = -1;

    public UpdateCompanyConfigRequest() {};

    public int getCurrentOrderNumber() {
        return currentOrderNumber;
    }

    public void setCurrentOrderNumber(int currentOrderNumber) {
        this.currentOrderNumber = currentOrderNumber;
    }

    public int getDefOfPay() {
        return defOfPay;
    }

    public void setDefOfPay(int defOfPay) {
        this.defOfPay = defOfPay;
    }

    public boolean isAdvertShow() {
        return isAdvertShow;
    }

    public void setIsAdvertShow(boolean isAdvertShow) {
        this.isAdvertShow = isAdvertShow;
    }

    public boolean isLotteryOnOrderChangeStateAllow() {
        return isLotteryOnOrderChangeStateAllow;
    }

    public void setIsLotteryOnOrderChangeStateAllow(boolean isLotteryOnOrderChangeStateAllow) {
        this.isLotteryOnOrderChangeStateAllow = isLotteryOnOrderChangeStateAllow;
    }

    public int getLotteryAddValue() {
        return lotteryAddValue;
    }

    public void setLotteryAddValue(int lotteryAddValue) {
        this.lotteryAddValue = lotteryAddValue;
    }

    public int getLotterySubValue() {
        return lotterySubValue;
    }

    public void setLotterySubValue(int lotterySubValue) {
        this.lotterySubValue = lotterySubValue;
    }

    public int getLotteryOrderSumLimit() {
        return lotteryOrderSumLimit;
    }

    public void setLotteryOrderSumLimit(int lotteryOrderSumLimit) {
        this.lotteryOrderSumLimit = lotteryOrderSumLimit;
    }
}
