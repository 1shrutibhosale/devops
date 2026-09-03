package com.hackathon.smartwaste.service;

import com.hackathon.smartwaste.model.User;
import com.hackathon.smartwaste.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User register(User user) {
        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User getUser(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("User not found"));
    }
}
