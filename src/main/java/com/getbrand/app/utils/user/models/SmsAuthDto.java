package com.getbrand.app.utils.user.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class SmsAuthDto {
    @Id
    private UUID sid;

    private int smsCode;

    private String phone;

    public SmsAuthDto() {};

    public SmsAuthDto(int smsCode, String phone) {
        this.sid = UUID.randomUUID();
        this.smsCode = smsCode;
        this.phone = phone;
    }

    public UUID getSid() {
        return sid;
    }

    public void setSid(UUID sid) {
        this.sid = sid;
    }

    public int getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(int smsCode) {
        this.smsCode = smsCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
