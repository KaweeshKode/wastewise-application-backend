package com.wastewise.controller;

import com.wastewise.dto.User;
import com.wastewise.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    final UserService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user) {
        service.addUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return service.getUsers();
    }

    @PutMapping("/update")
    public void updateUser(@RequestBody User user) {
        service.addUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable String id) {
        service.deleteUser(id);
    }
}
