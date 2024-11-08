package com.example.user01.service;

import com.example.user01.dto.UserDto;
import com.example.user01.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}