package com.wastewise.service.impl;

import com.wastewise.dto.User;
import com.wastewise.entity.UserEntity;
import com.wastewise.repository.UserRepository;
import com.wastewise.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository repository;
    final ModelMapper mapper;

    @Override
    public void addUser(User user) {
        repository.save(mapper.map(user, UserEntity.class));
    }

    @Override
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        repository.findAll().forEach(user -> userList.add(mapper.map(user, User.class)));
        return userList;
    }

    @Override
    public void deleteUser(String id) {
        repository.deleteById(id);
    }
}
