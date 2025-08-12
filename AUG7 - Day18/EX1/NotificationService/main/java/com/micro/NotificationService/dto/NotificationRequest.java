package com.micro.NotificationService.dto;

import com.micro.NotificationService.model.User;

public class NotificationRequest {
    private User user;
    private String action;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
