package com.wastewise.controller;

import com.wastewise.dto.User;
import com.wastewise.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    final UserService service;

    @PostMapping
    public void addUser(@RequestBody User user) {
        service.addUser(user);
    }
}
