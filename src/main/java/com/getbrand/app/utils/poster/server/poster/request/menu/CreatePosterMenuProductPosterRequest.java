package com.getbrand.app.utils.poster.server.poster.request.menu;

public class CreatePosterMenuProductPosterRequest {
    private String product_name;

    private int menu_category_id;

    private int workshop;

    private int weight_flag;

    private String color = "red";

    private int different_spots_prices;

    private int modifications;

    private String barcode = "";

    private double cost;

    private double price;

    private int visible;

    private int fiscal_code;

    public CreatePosterMenuProductPosterRequest() {};

    public CreatePosterMenuProductPosterRequest(String product_name, int menu_category_id, double price, int visible) {
        this.product_name = product_name;
        this.menu_category_id = menu_category_id;
        this.cost = price * 100;
        this.price = price * 100;
        this.visible = visible;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getMenu_category_id() {
        return menu_category_id;
    }

    public void setMenu_category_id(int menu_category_id) {
        this.menu_category_id = menu_category_id;
    }

    public int getWorkshop() {
        return workshop;
    }

    public void setWorkshop(int workshop) {
        this.workshop = workshop;
    }

    public int getWeight_flag() {
        return weight_flag;
    }

    public void setWeight_flag(int weight_flag) {
        this.weight_flag = weight_flag;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDifferent_spots_prices() {
        return different_spots_prices;
    }

    public void setDifferent_spots_prices(int different_spots_prices) {
        this.different_spots_prices = different_spots_prices;
    }

    public int getModifications() {
        return modifications;
    }

    public void setModifications(int modifications) {
        this.modifications = modifications;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    public int getFiscal_code() {
        return fiscal_code;
    }

    public void setFiscal_code(int fiscal_code) {
        this.fiscal_code = fiscal_code;
    }
}
