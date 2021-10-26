package com.getbrand.app.utils.user.models.poster;

import com.getbrand.app.utils.user.models.User;
import com.getbrand.app.utils.user.models.UserStatus;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class PosterUser extends User {
    private int posterId = -1;

    public PosterUser() {};

    public PosterUser(String login, String password, String name, String birthday, String email, String phone, double managerPercent, UserStatus status, int posterId) {
        super(login, password, name, birthday, email, phone, managerPercent, status);
        this.posterId = posterId;
    }

    public PosterUser(UUID id, String login, String password, String name, String birthday, String email, String phone, double managerPercent, UserStatus status, int posterId) {
        super(id, login, password, name, birthday, email, phone, managerPercent, status);
        this.posterId = posterId;
    }

    public int getPosterId() {
        return posterId;
    }

    public void setPosterId(int posterId) {
        this.posterId = posterId;
    }
}
