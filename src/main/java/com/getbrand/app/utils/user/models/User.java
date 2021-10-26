package com.getbrand.app.utils.user.models;

import com.getbrand.app.utils.company.models.Company;
import com.getbrand.app.utils.models.Status;
import com.getbrand.app.utils.role.models.CompanyRole;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "_user")
public class User {
    @Id
    private UUID id;

    private String login;

    private String password;

    private String name;

    private String birthday;

    private String email;

    private String phone;

    private double managerPercent;

    private double balance;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Company> companies;

    @OneToOne(fetch = FetchType.EAGER, targetEntity = UserStatus.class, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private UserStatus status;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "order_prod_modif",
            joinColumns = @JoinColumn(name = "prod_id"),
            inverseJoinColumns = @JoinColumn(name = "mod_id")
    )
    private Set<CompanyRole> companyRoles;

    public User() {};

    public User(String login, String password, String name, String birthday, String email, String phone, double managerPercent, UserStatus status) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.phone = phone;
        this.managerPercent = managerPercent;
        this.status = status;
        this.companies = new ArrayList<>();
        this.id = UUID.randomUUID();
    }

    public User(UUID id, String login, String password, String name, String birthday, String email, String phone, double managerPercent, UserStatus status) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.phone = phone;
        this.managerPercent = managerPercent;
        this.status = status;
        this.companies = new ArrayList<>();
    }

    public void addCompanyRole(CompanyRole role) {
        this.companyRoles.add(role);
    }

    public void removeCompanyRole(CompanyRole role) {
        this.companyRoles.remove(role);
    }

    public void removeCompanyRole(int idx) {
        this.companyRoles.remove(idx);
    }

    public void addCompanyToUser(Company company) {
        this.companies.add(company);
    }

    public void removeCompanyFromUser(Company company) {
        this.companies.remove(company);
    }

    public void removeCompanyFromUser(int idx) {
        this.companies.remove(idx);
    }

    public void cleanCompanies() {
        this.companies.clear();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setManagerPercent(double managerPercent) {
        this.managerPercent = managerPercent;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getManagerPercent() {
        return managerPercent;
    }

    public double getBalance() {
        return balance;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public UserStatus getStatus() {
        return status;
    }
}
