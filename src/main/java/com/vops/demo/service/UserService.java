package com.vops.demo.service;

import com.vops.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean login(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password) != null;
    }



}
