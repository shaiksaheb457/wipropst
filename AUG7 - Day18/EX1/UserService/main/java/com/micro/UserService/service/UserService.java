package com.micro.UserService.service;

import com.micro.UserService.dto.NotificationRequest;
import com.micro.UserService.model.User;
import com.micro.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    private static final String NOTIFICATION_URL = "http://NOTIFICATIONSERVICE/notify";

    public User createUser(User user) {
        User savedUser = userRepository.save(user);
        sendNotification(savedUser, "Created");
        return savedUser;
    }

    public User updateUser(Long id, User user) {
        User existingUser = userRepository.findById(id).orElseThrow();
        existingUser.setUsername(user.getUsername());
        existingUser.setPassword(user.getPassword());
        existingUser.setAddress(user.getAddress());
        User updatedUser = userRepository.save(existingUser);
        sendNotification(updatedUser, "Updated");
        return updatedUser;
    }

    public void deleteUser(Long id) {
        User user = userRepository.findById(id).orElseThrow();
        userRepository.delete(user);
        sendNotification(user, "Deleted");
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    private void sendNotification(User user, String action) {
        NotificationRequest request = new NotificationRequest();
        request.setUser(user);
        request.setAction(action);
        restTemplate.postForObject(NOTIFICATION_URL, request, String.class);
    }
}
