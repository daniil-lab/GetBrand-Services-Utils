package com.getbrand.app.utils.user.models.getbrand;

import com.getbrand.app.utils.user.models.User;
import com.getbrand.app.utils.user.models.UserStatus;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class GetBrandUser extends User {
    public GetBrandUser() {};

    public GetBrandUser(String login, String password, String name, String birthday, String email, String phone, double managerPercent, UserStatus status) {
        super(login, password, name, birthday, email, phone, managerPercent, status);
    }

    public GetBrandUser(UUID id, String login, String password, String name, String birthday, String email, String phone, double managerPercent, UserStatus status) {
        super(id, login, password, name, birthday, email, phone, managerPercent, status);
    }
}
