package com.getbrand.app.utils.user.request;

import com.getbrand.app.utils.user.models.SmsAuthDto;

public class CreateUserSmsRequest {
    private String login;

    private String name;

    private String birthday;

    private String password;

    private String email;

    private double managerPercent;

    private String phone;

    private String status;

    private SmsAuthDto smsAuthDto;

    public CreateUserSmsRequest() {};

    public CreateUserSmsRequest(String login, String name, String birthday, String password, String email, double managerPercent, String phone, String status) {
        this.login = login;
        this.name = name;
        this.birthday = birthday;
        this.password = password;
        this.email = email;
        this.managerPercent = managerPercent;
        this.phone = phone;
        this.status = status;
    }

    public SmsAuthDto getSmsAuthDto() {
        return smsAuthDto;
    }

    public void setSmsAuthDto(SmsAuthDto smsAuthDto) {
        this.smsAuthDto = smsAuthDto;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getManagerPercent() {
        return managerPercent;
    }

    public void setManagerPercent(double managerPercent) {
        this.managerPercent = managerPercent;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
