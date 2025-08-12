package com.micro.UserService.dto;

import com.micro.UserService.model.User;

public class NotificationRequest {
    private User user;
    private String action;

    // Getters and Setters
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
