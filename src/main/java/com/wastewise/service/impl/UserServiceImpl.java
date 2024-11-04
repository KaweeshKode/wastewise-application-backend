package com.wastewise.service.impl;

import com.wastewise.dto.User;
import com.wastewise.entity.UserEntity;
import com.wastewise.repository.UserRepository;
import com.wastewise.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository repository;
    final ModelMapper mapper;

    @Override
    public void addUser(User user) {
        repository.save(mapper.map(user, UserEntity.class));
    }
}
