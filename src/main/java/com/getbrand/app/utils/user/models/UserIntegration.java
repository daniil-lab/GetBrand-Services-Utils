package com.getbrand.app.utils.user.models;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class UserIntegration {
    @Id
    private UUID id;

    private UUID companyId;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_integration_id")
    @ElementCollection(fetch = FetchType.EAGER)
    private List<User> users;

    public UserIntegration() {};

    public UserIntegration(UUID companyId) {
        this.companyId = companyId;
    }

    public void addUserToIntegration(User user) {
        this.users.add(user);
    }

    public void removeUserFromIntegration(User user) {
        this.users.remove(user);
    }

    public void removeUserFromIntegration(int idx) {
        this.users.remove(idx);
    }

    public void clearUsers() {
        this.users.clear();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getCompanyId() {
        return companyId;
    }

    public void setCompanyId(UUID companyId) {
        this.companyId = companyId;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
