package com.getbrand.app.utils.order.models;

import com.getbrand.app.utils.company.models.Company;
import com.getbrand.app.utils.promo.models.Promo;
import com.getbrand.app.utils.user.models.User;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "_order")
public class Order {
    @Id
    private UUID id;

    private String orderNumber;

    private String executeStart;

    private String executeEnd;

    private String type;

    private String address;

    private String employeeComment;

    private String customerComment;

    private String createAt;

    private String updateAt;

    private int volume;

    private String includeLoyalityTypes;

    private double totalPrice;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "promo_id")
    private Promo promo;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "ord")
    private Set<OrderPrice> freePrices;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "equip")
    private Set<Equipment> equipments;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_company")
    private Company company;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_manager")
    private User manager;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private Set<OrderProduct> orderProducts;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_state")
    private OrderState state;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private Set<OrderBonus> bonuses;

    @PreUpdate
    private void updateTime() {
        this.updateAt = LocalDateTime.now().toString();
    }

    @PrePersist
    private void updateCreateTime() {
        this.createAt = LocalDateTime.now().toString();
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "rev")
    private OrderReview review;

    private double price;

    private double priceWithPromo;

    public Promo getPromo() {
        return promo;
    }

    public void setPromo(Promo promo) {
        this.promo = promo;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Set<OrderPrice> getFreePrices() {
        return freePrices;
    }

    public void setFreePrices(Set<OrderPrice> freePrices) {
        this.freePrices = freePrices;
    }

    public Order() {};

    public Order(String orderNumber, String executeStart, String executeEnd, String type, String address, String employeeComment, String customerComment, int volume, Company company, User user, User manager) {
        this.orderNumber = orderNumber;
        this.executeStart = executeStart;
        this.executeEnd = executeEnd;
        this.type = type;
        this.address = address;
        this.employeeComment = employeeComment;
        this.customerComment = customerComment;
        this.volume = volume;
        this.company = company;
        this.user = user;
        this.manager = manager;
        this.id = UUID.randomUUID();
        this.equipments = new HashSet<>();
        this.bonuses = new HashSet<>();
        this.orderProducts = new HashSet<>();
        this.freePrices = new HashSet<>();
        this.includeLoyalityTypes = "";
    }

    public void addFreePrice(OrderPrice orderPrice) {
        this.freePrices.add(orderPrice);
    }

    public void removeFreePrice(OrderPrice orderPrice) {
        this.freePrices.remove(orderPrice);
    }

    public void removeFreePrice(int idx) {
        this.freePrices.remove(idx);
    }

    public void addEquipment(Equipment equipment) {
        this.equipments.add(equipment);
    }

    public void removeEquipment(Equipment equipment) {
        this.equipments.remove(equipment);
    }

    public void removeEquipment(int idx) {
        this.equipments.remove(idx);
    }

    public void addBonus(OrderBonus bonus) {
        this.bonuses.add(bonus);
    }

    public void removeBonus(OrderBonus bonus) {
        this.bonuses.remove(bonus);
    }

    public void removeBonus(int idx) {
        this.bonuses.remove(idx);
    }

    public void addProduct(OrderProduct product) {
        this.orderProducts.add(product);
    }

    public void removeProduct(OrderProduct product) {
        this.orderProducts.remove(product);
    }

    public void removeProduct(int idx) {
        this.orderProducts.remove(idx);
    }

    public UUID getId() {
        return id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmployeeComment() {
        return employeeComment;
    }

    public void setEmployeeComment(String employeeComment) {
        this.employeeComment = employeeComment;
    }

    public String getCustomerComment() {
        return customerComment;
    }

    public void setCustomerComment(String customerComment) {
        this.customerComment = customerComment;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getIncludeLoyalityTypes() {
        return includeLoyalityTypes;
    }

    public void setIncludeLoyalityTypes(String includeLoalityTypes) {
        this.includeLoyalityTypes = includeLoalityTypes;
    }

    public Set<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(Set<Equipment> equipments) {
        this.equipments = equipments;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public Set<OrderProduct> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(Set<OrderProduct> orderProducts) {
        this.orderProducts = orderProducts;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public Set<OrderBonus> getBonuses() {
        return bonuses;
    }

    public void setBonuses(Set<OrderBonus> bonuses) {
        this.bonuses = bonuses;
    }

    public OrderReview getReview() {
        return review;
    }

    public void setReview(OrderReview review) {
        this.review = review;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceWithPromo() {
        return priceWithPromo;
    }

    public void setPriceWithPromo(double priceWithPromo) {
        this.priceWithPromo = priceWithPromo;
    }
}
