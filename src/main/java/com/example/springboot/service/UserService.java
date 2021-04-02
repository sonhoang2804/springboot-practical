package com.example.springboot.service;


import com.example.springboot.entity.User;

public interface UserService {
    void save (User user);

    User findByUsername (String username);
}
