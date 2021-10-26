package com.getbrand.app.utils.user.request;

import com.getbrand.app.utils.user.models.SmsAuthDto;

public class UpdateUserPasswordSmsRequest {
    private String password;

    private SmsAuthDto smsAuthDto;

    public UpdateUserPasswordSmsRequest(String password, SmsAuthDto smsAuthDto) {
        this.password = password;
        this.smsAuthDto = smsAuthDto;
    }

    public UpdateUserPasswordSmsRequest() {};

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SmsAuthDto getSmsAuthDto() {
        return smsAuthDto;
    }

    public void setSmsAuthDto(SmsAuthDto smsAuthDto) {
        this.smsAuthDto = smsAuthDto;
    }
}
