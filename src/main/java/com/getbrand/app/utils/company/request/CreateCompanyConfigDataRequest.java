package com.getbrand.app.utils.company.request;

public class CreateCompanyConfigDataRequest {

    private int currentOrderNumber;

    private int defOfPay;

    private boolean isAdvertShow;

    private boolean isLotteryOnOrderChangeStateAllow;

    private int lotteryAddValue;

    private int lotterySubValue;

    private int lotteryOrderSumLimit;

    public CreateCompanyConfigDataRequest() {};

    public CreateCompanyConfigDataRequest(int currentOrderNumber, int defOfPay, boolean isAdvertShow, boolean isLotteryOnOrderChangeStateAllow, int lotteryAddValue, int lotterySubValue, int lotteryOrderSumLimit) {
        this.currentOrderNumber = currentOrderNumber;
        this.defOfPay = defOfPay;
        this.isAdvertShow = isAdvertShow;
        this.isLotteryOnOrderChangeStateAllow = isLotteryOnOrderChangeStateAllow;
        this.lotteryAddValue = lotteryAddValue;
        this.lotterySubValue = lotterySubValue;
        this.lotteryOrderSumLimit = lotteryOrderSumLimit;
    }

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

    public void setAdvertShow(boolean advertShow) {
        isAdvertShow = advertShow;
    }

    public boolean isLotteryOnOrderChangeStateAllow() {
        return isLotteryOnOrderChangeStateAllow;
    }

    public void setLotteryOnOrderChangeStateAllow(boolean lotteryOnOrderChangeStateAllow) {
        isLotteryOnOrderChangeStateAllow = lotteryOnOrderChangeStateAllow;
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
