package com.example.api.task.service;

import com.example.api.task.entity.User;
import com.example.api.task.payload.SignUpDTO;

public interface UserService {
    void saveUser(SignUpDTO signUpDTO);

    User findUserByEmail(String email);


}
