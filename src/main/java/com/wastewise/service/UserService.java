package com.wastewise.service;

import com.wastewise.dto.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();

    void deleteUser(String id);
}
