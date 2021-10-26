package com.getbrand.app.utils.poster.server.poster.response.menu;

import java.util.List;

public class PosterMenuProductResponse {
    private String barcode;

    private String category_name;

    private String unit;

    private int cost;

    private int cost_netto;

    private int fiscal;

    private int menu_category_id;

    private int workshop;

    private int nodiscount;

    private String photo;

    private String photo_origin;

    private int product_code;

    private int product_id;

    private String product_name;

    private int sort_order;

    private int tax_id;

    private int product_tax_id;

    private int type;

    private int weight_flag;

    private String color;

    private List<PosterMenuProductModificatorResponse> modifications;

    public PosterMenuProductResponse() {};

    public List<PosterMenuProductModificatorResponse> getModifications() {
        return modifications;
    }

    public void setModifications(List<PosterMenuProductModificatorResponse> modifications) {
        this.modifications = modifications;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost_netto() {
        return cost_netto;
    }

    public void setCost_netto(int cost_netto) {
        this.cost_netto = cost_netto;
    }

    public int getFiscal() {
        return fiscal;
    }

    public void setFiscal(int fiscal) {
        this.fiscal = fiscal;
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

    public int getNodiscount() {
        return nodiscount;
    }

    public void setNodiscount(int nodiscount) {
        this.nodiscount = nodiscount;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhoto_origin() {
        return photo_origin;
    }

    public void setPhoto_origin(String photo_origin) {
        this.photo_origin = photo_origin;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getSort_order() {
        return sort_order;
    }

    public void setSort_order(int sort_order) {
        this.sort_order = sort_order;
    }

    public int getTax_id() {
        return tax_id;
    }

    public void setTax_id(int tax_id) {
        this.tax_id = tax_id;
    }

    public int getProduct_tax_id() {
        return product_tax_id;
    }

    public void setProduct_tax_id(int product_tax_id) {
        this.product_tax_id = product_tax_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
}
