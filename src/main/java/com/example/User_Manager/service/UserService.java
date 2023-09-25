package com.example.User_Manager.service;

import com.example.User_Manager.model.UserDtls;
import com.example.User_Manager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    @Autowired
    BCryptPasswordEncoder passwordEncode;


    public UserDtls createUser(UserDtls user) {

        user.setPassword(passwordEncode.encode(user.getPassword()));
        user.setRole("ROLE_USER");

        return userRepo.save(user);
    }

    public boolean checkEmail(String email) {

        return userRepo.existsByEmail(email);
    }

}
