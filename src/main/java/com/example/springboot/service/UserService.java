package com.example.springboot.service;


import com.example.spring_crud_upload.entity.User;

public interface UserService {
    void save (User user);

    User findByUsername (String username);
}
